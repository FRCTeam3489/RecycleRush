package org.usfirst.frc3489.Mechatrina;


public class GlobalVariables {

    //Global variable to keep track of time. Specifically for the PushOutStack.java
    public boolean STACKOUT; 
    
    
    //Tote stop ranges for Potentiometer
    public static double posFLOORUPPER, posFLOORLOWER, posSCORINGUPPER, posSCORINGLOWER;
    public static double posDRIVELOWER, posDRIVEUPPER;
    public static double posSTEPUPPER, posSTEPLOWER;
    public static double posHUMANUPPER, posHUMANLOWER;
    
    public static double STACKEMMOTORUP;
    public static double STACKEMMOTORDOWN;
    
    public static int eggBOTTOM, eggHOOKTOTES, eggDROPTOTE1, eggDROPTOTE2;
    public static int eggHIGHLOWDIFFERENTIAL; //Add/subtract this to create high/low values for encoder
    
    //public int toteCount;
    public int encoderCounts;
    
    public boolean containerDown;
    public boolean solenoids1Out;
    public boolean solenoids2Out;
    public boolean motorOut;
    public boolean toteSensor;
    
    public boolean autoCancel;
    
    public double toteProxSensorLimit;
    
    public boolean gyroState;
    
    public boolean intakeSolenoidsUsable; //This variable is to make sure the intakeSolenoids do not actuate whil
    		//the stacker is trying to move
    
    public int totes; //This variable is for the current number of totes in the robot
    
    public boolean OverrideStop;
    
    public double driveMultiplier; //This variable is for the setMaximumOutput on driveTrain.
		//When this is changed, it will scale the speed of the robot by the number.
    
    public boolean toteUp;
    
    public boolean toteDown;
    
    public GlobalVariables() {
    	
    	/*//TODO Moved EVERYTHING to RobotInit
    	intakeSolenoidsUsable = true;
        
        
        posFLOORUPPER = 4.3;
        posFLOORLOWER = 4.5;
        posSCORINGUPPER = 3.07;
        posSCORINGLOWER = 3.27;
        posSTEPUPPER = 2.27;
        posSTEPLOWER = 2.47;
        posDRIVEUPPER = 2.47;
        posDRIVELOWER = 2.67;
        posHUMANUPPER = 2.76;
        posHUMANLOWER = 2.96;
        
        STACKEMMOTORUP = 1;
        STACKEMMOTORDOWN = -0.45;
        
        driveMultiplier = 1.0;
        gyroState = true;
        
        totes = 0;
        
        autoCancel = false;
        
        eggBOTTOM = 0;
        eggHOOKTOTES = 820;
        eggDROPTOTE1 = 492;
        eggDROPTOTE2 = 16;
        
        eggHIGHLOWDIFFERENTIAL = 30;
        
        toteProxSensorLimit = 4000;
        
        STACKOUT = false;
        containerDown = false;
        OverrideStop = false;
        
        toteUp = false;
        toteDown = false;
    	*/
    }

}
