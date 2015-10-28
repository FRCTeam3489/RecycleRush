package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CANTalonCalibration extends Command {

    public CANTalonCalibration() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    double time1;
    boolean isDone;
    // Called just before this Command runs the first time
    protected void initialize() {
    	time1 = Timer.getFPGATimestamp();
    	isDone = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Timer.getFPGATimestamp() - time1 < 2){
    		Robot.driveTrain.AutonomousDrive(0,0,0);
    	}
    	else if(Timer.getFPGATimestamp() - time1 < 4){
    		Robot.driveTrain.AutonomousDrive(0,-1,0);
    	} 
    	else if(Timer.getFPGATimestamp() - time1 < 6) {
    		Robot.driveTrain.AutonomousDrive(0,0,0);
    	} 
    	else if(Timer.getFPGATimestamp() - time1 < 8) {
    		Robot.driveTrain.AutonomousDrive(0,1,0);
    	} else {
    		Robot.driveTrain.AutonomousDrive(0,0,0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(Timer.getFPGATimestamp() - time1 > 10){
    		return true;
    	} else {
    		return false;
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
