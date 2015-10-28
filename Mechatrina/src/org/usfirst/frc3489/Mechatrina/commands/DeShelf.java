package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DeShelf extends Command {
	
	Talon stackEmMotor = RobotMap.stackEmMotor;
	boolean atTop;
	boolean shelvesOpen;
	DoubleSolenoid holder1 = RobotMap.holder1;
	
    public DeShelf() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	atTop = false;
    	shelvesOpen = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	holder1.set(Value.kReverse);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
