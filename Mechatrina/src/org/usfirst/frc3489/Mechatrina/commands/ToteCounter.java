package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToteCounter extends Command {
	int x;
	double time1;
	double time2;
    public ToteCounter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	time2 = Timer.getFPGATimestamp();
    	if(Robot.globalVariables.motorOut == true && Robot.globalVariables.solenoids1Out == true && Robot.globalVariables.solenoids2Out == true){
    		if(x == 0){
    			time1 = Timer.getFPGATimestamp();
    		}
    		x++;
    		if (time2 - time1 >= 1){
        		Robot.globalVariables.totes = 0;
    		}
    	} else {
    		x = 0;
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
