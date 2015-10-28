package org.usfirst.frc3489.Mechatrina.MultiAuto;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ContainerPicker extends Command {
	double time1;
    public ContainerPicker() {
    	requires(Robot.driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	time1 = Timer.getFPGATimestamp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Timer.getFPGATimestamp() - time1 < 1.25){
    		Robot.containerLifter.lifterUp();
    	}
    	else if(Timer.getFPGATimestamp() - time1 < 2.3){
    		Robot.driveTrain.AutonomousDrive(0,-1, 0);
    	}
    	else { //this might be wrong
    		Robot.driveTrain.AutonomousDrive(0, 0, .5); //also this
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(Timer.getFPGATimestamp() - time1 > 3.55){ //TODO change to time of z axis rotation
        	return true;
    	}else{
    		return false;
    	}
    }
    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.AutonomousDrive(0, 0, 0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
