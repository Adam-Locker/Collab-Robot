package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveSwap extends Command {

    public DriveSwap() {
    	requires(Robot.chassis);
    }

    protected void initialize() {
    	Robot.chassis.driveSwap = !Robot.chassis.driveSwap;
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}
