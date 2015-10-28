package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DefaultIntakeSolenoid2 extends Command {

    public DefaultIntakeSolenoid2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intakeSolenoid2);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intakeSolenoid2.solenoid2Forward();
    	//SmartDashboard.putString("Intake Solenoid 2 Position", Robot.intakeSolenoid2.solenoid2Get().toString());
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
