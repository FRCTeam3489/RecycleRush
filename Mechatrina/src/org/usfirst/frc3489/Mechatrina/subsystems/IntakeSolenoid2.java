package org.usfirst.frc3489.Mechatrina.subsystems;

import org.usfirst.frc3489.Mechatrina.Robot;
import org.usfirst.frc3489.Mechatrina.RobotMap;
import org.usfirst.frc3489.Mechatrina.commands.DefaultIntakeSolenoid2;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSolenoid2 extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Solenoid intakeSolenoid2 = RobotMap.intakeSolenoid2;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DefaultIntakeSolenoid2());
    }
    public void solenoid2Forward(){
    	if(Robot.globalVariables.intakeSolenoidsUsable == true){
    		intakeSolenoid2.set(true);
    		Robot.globalVariables.solenoids2Out = true;
    	} else {
    		intakeSolenoid2.set(false);
    		Robot.globalVariables.solenoids2Out = false;
    	}
    }
    
    public void solenoid2Backward(){
    	intakeSolenoid2.set(false);
		Robot.globalVariables.solenoids2Out = false;
    }
    public boolean solenoid2Get(){
    	return intakeSolenoid2.get();
    }
}

