package org.usfirst.frc3489.Mechatrina.commands;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class Camera extends Command {
	CameraServer server;

    public Camera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	server = CameraServer.getInstance();
    	server.setQuality(50);
    }

    // Called repeatedly when this Command is scheduled to run
    boolean working = true;
    protected void execute() {
    	//System.out.println("Camera Started");
    	try{
    		//while(working == true){
           
           
            //the camera name (ex "cam0") can be found through the roborio web interface
            server.startAutomaticCapture("cam0");
            
            //}
    	} catch(Exception e) {
    		//System.out.println("Camera Exception Error");
    		working = false;
    	} finally {
    		
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
