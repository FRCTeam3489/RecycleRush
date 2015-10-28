package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.GlobalVariables;
import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ContainerLiftHookTotes extends Command {
	int counts; //counts of the encoder
	int goal; //number of counts required to be at the 'Goal'
	int threshold; //amount that the counts can vary above/below the 'Goal' to still be considered there.
	
    public ContainerLiftHookTotes() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.containerLifter); //standard requires
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//threshold = GlobalVariables.eggHIGHLOWDIFFERENTIAL; //standard threshold
    	//goal = GlobalVariables.eggHOOKTOTES; //goal/destination lift is heading towards
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.globalVariables.containerDown = true;
    	//System.out.println("Did we press 4? " + Robot.oi.containerTote.get());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(RobotMap.containerHookTote.get() == false) {
    		return true; //return true
    	}
    	else if(RobotMap.containerLowerLimitSwitch.get()==false){
    		return true; //return true
    	}
    		
    	else { //when its not within the goal threshold or whatever
    		return false; //return false
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.containerLifter.motorOff();
    	Robot.globalVariables.containerDown = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
