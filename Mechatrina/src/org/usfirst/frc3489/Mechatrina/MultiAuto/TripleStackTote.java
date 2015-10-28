package org.usfirst.frc3489.Mechatrina.MultiAuto;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class TripleStackTote extends Command {

    public TripleStackTote() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.stackEm.stackerUp();
    	
    	
    	Robot.driveTrain.AutonomousDrive(0, 1, 0);
    	Robot.intakeSolenoid1.solenoid1Backward();
    	Robot.intakeSolenoid2.solenoid2Backward();
    	Robot.intakeMotor.motor1Speed(-1);
    	Robot.intakeMotor.motor2Speed(1);
    	
    	Robot.driveTrain.AutonomousDrive(0,0,0);
    	Robot.intakeSolenoid1.solenoid1Forward();
    	Robot.intakeSolenoid2.solenoid2Forward();
    	

    	Robot.intakeSolenoid1.solenoid1Backward();
    	Robot.intakeSolenoid2.solenoid2Backward();
    	Robot.stackEm.stackerDown();
    	
    	Robot.stackEm.stackerUp();
    	Robot.driveTrain.AutonomousDrive(0, 1, 0);
    	

    	Robot.driveTrain.AutonomousDrive(0,0,0);
    	Robot.intakeSolenoid1.solenoid1Forward();
    	Robot.intakeSolenoid2.solenoid2Forward();
    	

    	Robot.intakeSolenoid1.solenoid1Backward();
    	Robot.intakeSolenoid2.solenoid2Backward();
    	Robot.stackEm.stackerDown();
    	
    	Robot.stackEm.stackerUp();
    	
    	Robot.driveTrain.AutonomousDrive(1, 0, 0);
    	
    	Robot.stackEm.stackerDown();
    	

    	Robot.driveTrain.AutonomousDrive(0, 0, 0);
    	Robot.intakeMotor.motor1Speed(1);
    	Robot.intakeMotor.motor2Speed(-1);
    	Robot.intakeSolenoid1.solenoid1Forward();
    	Robot.intakeSolenoid2.solenoid2Forward();
    	

    	Robot.driveTrain.AutonomousDrive(0, -1, 0);
    	

    	Robot.driveTrain.AutonomousDrive(0, 0, 0);
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
