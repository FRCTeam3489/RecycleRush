package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.GlobalVariables;
import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StackEmPosDrive extends Command {

    public StackEmPosDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.stackEm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double volt = RobotMap.potato.getVoltage();
    	if (volt < GlobalVariables.posDRIVEUPPER) {
    		//Robot.stackEm.stackerDown();
    		Robot.globalVariables.toteDown = true;
    	} else if (volt > GlobalVariables.posDRIVELOWER){
    		//Robot.stackEm.stackerUp();
    		Robot.globalVariables.toteUp = true;
    	} else {
    		//Robot.stackEm.set(0);
    		Robot.globalVariables.toteUp = false;
    		Robot.globalVariables.toteDown = false;
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double spoty = RobotMap.potato.getVoltage();
    	if(Robot.globalVariables.OverrideStop==true){
    		Robot.globalVariables.intakeSolenoidsUsable = true;
    		Robot.globalVariables.toteUp = false;
    		Robot.globalVariables.toteDown = false;
    		return true;
    	} else if(spoty > GlobalVariables.posDRIVELOWER & spoty < GlobalVariables.posDRIVEUPPER){
        	Robot.globalVariables.intakeSolenoidsUsable = true;
    		Robot.globalVariables.toteUp = false;
    		Robot.globalVariables.toteDown = false;
    		return true;
    	} else {
    		return false;
    	}
    }
    

    // Called once after isFinished returns true
    protected void end() {
		Robot.stackEm.set(0);
    	Robot.globalVariables.intakeSolenoidsUsable = true;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
