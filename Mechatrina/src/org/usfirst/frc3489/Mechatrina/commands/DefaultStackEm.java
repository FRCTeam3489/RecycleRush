package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DefaultStackEm extends Command {

    public DefaultStackEm() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.stackEm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.manipulatorRight.getButtonCount() >= 2){
	    	if(Robot.oi.manipulatorRight.getPOV() == 0){
	        	Robot.globalVariables.intakeSolenoidsUsable = false;
	        	Robot.stackEm.stackerUp();
	    	}
	    	else if(Robot.oi.manipulatorRight.getPOV() == 180){
	        	Robot.globalVariables.intakeSolenoidsUsable = false;
	        	Robot.stackEm.stackerDown();
	    	}
	    	else if(Robot.globalVariables.toteUp == true){
	    		Robot.stackEm.stackerUp();
	    	}
	    	else if(Robot.globalVariables.toteDown == true){
	    		Robot.stackEm.stackerDown();
	    	}
	    	else{
	        	Robot.globalVariables.intakeSolenoidsUsable = true;
	        	Robot.stackEm.set(0);
	    	}
    	}	else	{ //FOR IN PIT WHEN NO JOYSTICK IS PLUGGED IN SO WE DONT RUN STACKER
        	Robot.stackEm.set(0);
        	Robot.globalVariables.intakeSolenoidsUsable = true;
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
