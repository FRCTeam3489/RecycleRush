package org.usfirst.frc.team3489.lift;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;

public class Lift {
	private Jaguar liftMotor;
	//private Jaguar gripperMotor;
	private Solenoid gripperOpen;
	private Solenoid gripperClose;
	
	public Lift() {
		// TODO Auto-generated constructor stub
		liftMotor=new Jaguar(5); // Pwm of motor controller is set to 5
		//gripperMotor=new Jaguar(6); //Pwn of motor controller is set to 6
		gripperOpen = new Solenoid(10,1);
		gripperClose = new Solenoid(10,2);
		
	}
	
	public void liftUp() {
	liftMotor.set(100.0);
	}
	public void liftUp(double speed){
		liftMotor.set(speed);
		
	}
	public void liftDown(){
		liftMotor.set(-100.0);
	}
	public void liftDown(double speed){
		liftMotor.set(-1.0*speed);
	}
	public void gripperOpenOn (){
		gripperOpen.set(true);
		
	}
	public void gripperOpenOff (){
		gripperOpen.set(false);
	}
	
	public void gripperCloseOff (){
		gripperClose.set(false);	
	}
	public void gripperCloseOn(){
		gripperClose.set(true);
	}
	
	public void liftStop (){
		liftMotor.set(0.0);
	}
	
	
}
