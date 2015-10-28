package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ContainerLiftUp extends Command {
	DigitalInput lower = RobotMap.containerLowerLimitSwitch;
    DigitalInput upper = RobotMap.containerUpperLimitSwitch;
    //TODO also defined in ContainerLifter, clean this up

    public ContainerLiftUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.containerLifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {   	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.containerLifter.lifterUp();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (upper.get() == false){
    		return true;
    	}else{
        return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.containerLifter.motorOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
