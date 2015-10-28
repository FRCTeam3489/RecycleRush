package org.usfirst.frc3489.Mechatrina.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ButtonMapping extends Command {

    public ButtonMapping() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putString("1D", "Gyro Reset");
    	SmartDashboard.putString("2D", "Camera");
    	SmartDashboard.putString("3D", "Gyro Off");
    	SmartDashboard.putString("4D", "Gyro On (default on)");
    	SmartDashboard.putString("5D", "Button Mapping");
    	SmartDashboard.putString("7D", "Tote Kill Switch");
    	SmartDashboard.putString("8D", "Slow Down (while held)");
    	SmartDashboard.putString("2L", "Intake Solenoid (while held)");
    	SmartDashboard.putString("3L", "Shelving");
    	SmartDashboard.putString("4L", "Container Lift Hook Totes");
    	SmartDashboard.putString("1R","Push Out Stack");
    	SmartDashboard.putString("2R", "Intake Solenoid (while held)");
    	SmartDashboard.putString("2P", "Clear Sticky Faults (when pressed)");
    	SmartDashboard.putString("3R", "Stacker Goes to Drive Position");
    	SmartDashboard.putString("4R", "Stacker Goes to Step Position");
    	SmartDashboard.putString("5R", "Stacker Goes to Scoring Position");
    	SmartDashboard.putString("6R", "Stacker Goes to Human Position");
    	SmartDashboard.putString("7R", "Stacker Goes to Floor Position");
    	
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
