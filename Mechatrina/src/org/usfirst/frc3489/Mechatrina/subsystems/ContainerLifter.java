package org.usfirst.frc3489.Mechatrina.subsystems;

import org.usfirst.frc3489.Mechatrina.RobotMap;
import org.usfirst.frc3489.Mechatrina.commands.DefaultContainerLift;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ContainerLifter extends Subsystem {
    SpeedController limitMotor = RobotMap.containerMotor;
	// UP IS NEGATIVE DOWN IS POSITIVE
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DefaultContainerLift());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void lifterUp(){
    	if (RobotMap.containerUpperLimitSwitch.get() == false){ //prevents motor going past highest point
    		limitMotor.set(0);
    	} else {
    		limitMotor.set(-1);
    	}
    }
    
    public void lifterDown(){
    	if (RobotMap.containerLowerLimitSwitch.get() == false){ //prevents motor going under lowest point
    		limitMotor.set(0);
    	} else {
    		limitMotor.set(1);
    	}
    }
    
    public void motorOff(){
    	limitMotor.set(0);
    }
    
    // 2/14/2015 changed from digital to analog -waifu 
    /*public void lowerLimit(){
    	if (lower.get() == true) {
    		limitMotor.set(-.5);
    	} else {
    		limitMotor.set(0);
    	}
    }
    public void upperLimit(){
    	if (upper.get() == true) {
    		limitMotor.set(.5);
    	} else {
    		limitMotor.set(0);
    	}
    }
    public void centerLimit(){
    	if (center.get() == true) {
    		limitMotor.set(.5);
    	} else {
    		limitMotor.set(0);
    	}
    }
    public void motorOff(){
    	limitMotor.set(0);
    }
    public boolean lowerGet(){
    	return lower.get();
    }
    public boolean upperGet(){
    	return upper.get();
    }
    public boolean centerGet(){
    	return center.get();
    }
    */
}

