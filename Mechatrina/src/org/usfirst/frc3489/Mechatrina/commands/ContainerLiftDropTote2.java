
package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.GlobalVariables;
import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ContainerLiftDropTote2 extends Command {
	int counts; //counts of the encoder
	int goal; //number of counts required to be at the 'Goal'
	int threshold; //amount that the counts can vary above/below the 'Goal' to still be considered there.
	
    public ContainerLiftDropTote2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.containerLifter); //standard requires
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	threshold = GlobalVariables.eggHIGHLOWDIFFERENTIAL; //standard threshold
    	goal = GlobalVariables.eggDROPTOTE2; //goal/destination lift is heading towards
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	counts = Robot.globalVariables.encoderCounts; //counts equal to global variable for counts.
    			//global variable for counts is updated in default encoder command that is constantly
    			//running
    	if(counts > goal){ //counts greater than our goal
    		Robot.containerLifter.lifterDown(); //move down
    	} else { //counts less than our goal 
    		Robot.containerLifter.lifterUp(); //move up
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(counts > goal + threshold || counts < goal - threshold) { //if counts is greater than the 
    		//goal + the threshold OR less than the goal minus the threshold
    		return true; //return true
    	} else { //when its not within the goal threshold or whatever
    		return false; //return false
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.containerLifter.motorOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
