package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeMotorCommand extends Command {
	double motor1Speed;
	double motor2Speed;
	int x;
    public IntakeMotorCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intakeMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	//Added code for toteProxSensor to stop intakeMotors from moving
    	//when above the amount. Amount is in globalVariables, there is a boolean
    	//in IntakeMotor to say whether we should stop or not. When Joystick.getY < -.25
    	//and stop is FALSE we can move the motors inward. Need to figure out what the
    	//value should be.
    	boolean stop = Robot.intakeMotor.stop();
    	
    	motor1Speed = 1;
    	motor2Speed = 1;
    	
	    if(Robot.oi.manipulatorLeft.getY() >=.25 && stop == false) { //NOTE: Joystick's y axis, forward is negative
	    	Robot.intakeMotor.motor1Speed(-motor1Speed);
	    	Robot.globalVariables.motorOut = true;
	    } else if (Robot.oi.manipulatorLeft.getY() <=-.25) {
	    	Robot.intakeMotor.motor1Speed(motor1Speed);
	    	Robot.globalVariables.motorOut = false;
	    } else {
	    	Robot.intakeMotor.motor1Speed(0);
	    	Robot.globalVariables.motorOut = false;
	    }
	    
	    if(Robot.oi.manipulatorRight.getY() >=.25 && stop == false) { //NOTE: Joystick's y axis, forward is negative
	    	Robot.intakeMotor.motor2Speed(motor2Speed);
	    	Robot.globalVariables.motorOut = true;
	    } else if (Robot.oi.manipulatorRight.getY() <=-.25) {
	    	Robot.intakeMotor.motor2Speed(-motor2Speed);
	    	Robot.globalVariables.motorOut = false;
	    } else {
	    	Robot.intakeMotor.motor2Speed(0);
	    	Robot.globalVariables.motorOut = false;
	    }
	    
	    if (stop == true){
	    	if (x==0){
	    		Robot.globalVariables.totes++;
	    	}
	    	x++;
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
