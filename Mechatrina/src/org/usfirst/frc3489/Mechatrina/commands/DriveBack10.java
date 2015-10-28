package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveBack10 extends Command {

	double time1;
	boolean isDone;
    public DriveBack10() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	time1 = Timer.getFPGATimestamp();
    	isDone = false;
    	Robot.globalVariables.gyroState = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Timer.getFPGATimestamp() - time1 < 1){
    		Robot.driveTrain.AutonomousDrive(0,-1,0);
    	} else {
    		isDone = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(isDone == false){
    		return false;
    	} else {
        	Robot.globalVariables.gyroState = true;
        	return true;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
