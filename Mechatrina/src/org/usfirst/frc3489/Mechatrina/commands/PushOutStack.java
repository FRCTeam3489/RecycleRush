package org.usfirst.frc3489.Mechatrina.commands;

import org.usfirst.frc3489.Mechatrina.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class PushOutStack extends CommandGroup {
    
    public  PushOutStack() {
    	Joystick manip = new Joystick(2);
    	//TODO: John - Command called when trigger pressed, unneeded if
    	if(manip.getTrigger()==true){
    		//TODO: John - remove println when done testing
    		//System.out.println("Trigger is True");
    		if(Robot.globalVariables.STACKOUT==false){
        		//System.out.println("Stackout is false");
    			Robot.globalVariables.STACKOUT = true;  // Used by intakeSolenoid1/2 as is finish
    			//TODO: John- Need to move up, remove newly added shelf
    			addSequential(new StackEmPosTop());
    			addSequential(new DeShelf());
    			addSequential(new StackEmPosScoring());
    	    	addSequential(new ExportMotorCommand());
     		}
    	}else{
    		//System.out.println("stackout is now false");
    		Robot.globalVariables.STACKOUT=false;
    	}
    	//SmartDashboard.putBoolean("Pushing Out", value);
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
