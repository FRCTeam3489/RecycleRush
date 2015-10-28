package org.usfirst.frc3489.Mechatrina.subsystems;

import org.usfirst.frc3489.Mechatrina.RobotMap;
import org.usfirst.frc3489.Mechatrina.commands.DefaultIntakeMotorCommand;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMotor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands. 
	SpeedController intakeMotor1 = RobotMap.intakeMotor1;
	SpeedController intakeMotor2 = RobotMap.intakeMotor2; 
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DefaultIntakeMotorCommand());
    }
    
    public void motor1Speed(double motor1Speed){
    	intakeMotor1.set(motor1Speed);   	
    }
    
    public void motor2Speed(double motor1Speed){
    	intakeMotor2.set(motor1Speed);
    }
	
	public double motor1Get(){
		return intakeMotor1.get();
	}
	
	public double motor2Get(){
		return intakeMotor2.get(); 
	}
	
	public boolean stop(){
		if (RobotMap.toteLimitSwitch.get() == false) {
			return true;
		} else {
			return false;
		}
	}
	
} 

	
	
	