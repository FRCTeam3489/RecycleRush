package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DefaultMecanumManMode extends Command {
	
    public DefaultMecanumManMode() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.MecanumMan(Robot.oi.arcade);
    	// John check this out and see if it's all cool and alright by you
    	//it was the best way I could think of adding a reset without interrupting
    	//the drive command
    	if (Robot.oi.gyroReset.get() == true) {
    		Robot.driveTrain.gyroReset();
    	}
    	
    	if (Robot.oi.slowDown.get() == true){
    		Robot.globalVariables.driveMultiplier = .75;
    	} else {
    		Robot.globalVariables.driveMultiplier = 1;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
