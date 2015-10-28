package org.usfirst.frc3489.Mechatrina.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto2 extends Command {
	//double time1;
    //public Auto2() {
    	//requires(Robot.driveTrain);
    	//requires(Robot.intakeMotor);
    	
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    //}

    // Called just before this Command runs the first time
    protected void initialize() {
    	//time1 = Timer.getFPGATimestamp();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//move forward, x command
    	//Auto2Forward forward1 = new Auto2Forward();
    	//while (!forward1.isFinished()){
    		//forward1.execute();
    	}
    	//forward1.end();
    	
    	//pick up tote command;
    	//Look for yellow;
    	//Move forward Y;
    	//Auto2Forward2 forward2 = new Auto2Forward2();
    	//while (!forward2.isFinished()){
    		//forward2.execute();
    	//}
    	
		//pick up tote command;
		//look for yellow command;
		//move forward, y command;
    	//while (!forward2.isFinished()){
    		//forward2.execute();
    	//}
    	//forward2.end();
    	
		//pick up tote command;
		//move z command;
		//push stack;
    	
    //}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.driveTrain.AutonomousDrive(0, 0, 0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
