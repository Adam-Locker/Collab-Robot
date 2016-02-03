	package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonDrive extends Command {

    public AutonDrive(double x, double y) {
    }

    protected void initialize() {
    }

    protected void execute() {
    	double y = 0;
		double x = 0;
		Robot.chassis.tankDrive(x, y);
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    	Robot.chassis.stop();
    }

    protected void interrupted() {
    }
}
