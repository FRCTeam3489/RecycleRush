
package org.usfirst.frc.team3489.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3489.lift.Lift;

import edu.wpi.first.wpilibj.PowerDistributionPanel;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	 RobotDrive myRobot;  // class that handles basic drive operations
	    Joystick leftStick;  // set to ID 1 in DriverStation
	    Joystick gamePad; //This is the drive controller
	   // Joystick rightStick; // set to ID 2 in DriverStation
	    CANTalon m3 = new CANTalon(3);  //back left motor
	    CANTalon m4 = new CANTalon(4); //back right motor
	    CANTalon m1 = new CANTalon(1); //front left motor
	    CANTalon m2 = new CANTalon(2); //front right motor
	    //Jaguar arm = new Jaguar(5);
	    Lift lift = new Lift(); //arm lift
	    PowerDistributionPanel pdp = new PowerDistributionPanel();
	    
	    DigitalInput falseSensor = new DigitalInput(0);
	    
        double maxAmp;
        double curAmp;  //Used to read PDP channel 5 current amps and store high point
     
    public void robotInit() {
    	myRobot = new RobotDrive(0, 1);
     	myRobot = new RobotDrive(m1,m3,m2,m4);
         myRobot.setExpiration(0.1);
         leftStick = new Joystick(0);
         gamePad = new Joystick(1);
         //rightStick = new Joystick(1);
        
     	myRobot.setInvertedMotor(RobotDrive.MotorType.kRearLeft,  true);
         myRobot.setInvertedMotor(RobotDrive.MotorType.kFrontRight,  true);

    }
    /**
     * This function is run once each time the robot enters autonomous mode
     */

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	//autoLoopCounter = 0;
    	//if(autoLoopCounter < 100) //Check if we've completed 100 loops (approximately 2 seconds)
    			//{
    			//	myRobot.drive(-0.5, 0.0); 	// drive forwards half speed
    			//	autoLoopCounter++;
    			//	} else {
    			//	myRobot.drive(0.0, 0.0); 	// stop robot
    			//}

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	 myRobot.setSafetyEnabled(true);
         System.out.println("op");
         //while (isOperatorControl() && isEnabled()) {
         	myRobot.tankDrive(gamePad.getRawAxis(1), gamePad.getRawAxis(5));
         	/*
         	 * John - Arm was sample code
         	if(leftStick.getRawButton(2) == true && falseSensor.get() == false) {
         		
         		arm.set(.5);
         		arm.stopMotor(); }
        	*/
         	
         	curAmp = pdp.getCurrent(5);
         	if(curAmp > maxAmp) { maxAmp = curAmp; }
         	SmartDashboard.putNumber("Max Amp on 5", maxAmp);
         	
         	if(leftStick.getRawAxis(1)> 0.1||leftStick.getRawAxis(1)< -0.1) {
        	lift.liftUp(leftStick.getRawAxis(1));
        	
        }else{
        	lift.liftStop();
        }
         	
         	
         	
    if(leftStick.getRawButton(1)){
    	lift.gripperOpenOn();
    }else{
    	lift.gripperOpenOff();
    }
        if(leftStick.getRawButton(2)){
        	lift.gripperCloseOn();
        
        }else{
        	lift.gripperCloseOff();
        }
        
        
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
    
}
