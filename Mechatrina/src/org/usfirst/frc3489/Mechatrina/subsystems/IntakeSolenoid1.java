package org.usfirst.frc3489.Mechatrina.subsystems;

import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;
import org.usfirst.frc3489.Mechatrina.commands.DefaultIntakeSolenoid1;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSolenoid1 extends Subsystem {

	Solenoid intakeSolenoid1 = RobotMap.intakeSolenoid1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DefaultIntakeSolenoid1());
    }
    
    public void solenoid1Forward(){
    	if(Robot.globalVariables.intakeSolenoidsUsable == true){
    		intakeSolenoid1.set(true);
    		Robot.globalVariables.solenoids1Out = true;
    	} else {
    		intakeSolenoid1.set(false);
    		Robot.globalVariables.solenoids1Out = false;
    	}
    }
   
    public void solenoid1Backward(){
    	intakeSolenoid1.set(false);
		Robot.globalVariables.solenoids1Out = false;
    }
     
    public boolean solenoid1Get(){
    	return intakeSolenoid1.get();
    }
}

