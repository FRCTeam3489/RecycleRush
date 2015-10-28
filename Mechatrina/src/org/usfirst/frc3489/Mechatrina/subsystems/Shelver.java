package org.usfirst.frc3489.Mechatrina.subsystems;

import org.usfirst.frc3489.Mechatrina.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

//Jan31 waifu: added containergripper and its 2 solenoids
public class Shelver extends Subsystem {
	// no code in container gripper subsystem. Do not delete.
	//DoubleSolenoid gripperDeployRetract = RobotMap.gripperDeployRetract;
	//DoubleSolenoid gripperOpenClose = RobotMap.gripperOpenClose;

	DoubleSolenoid LShelf = RobotMap.holder1;
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand()); 	
    	
    }
    
    public void ShelfOpen() {
		LShelf.set(Value.kReverse);
	}
    
	public void	ShelfClose() {
		LShelf.set(Value.kForward);
	}
}

