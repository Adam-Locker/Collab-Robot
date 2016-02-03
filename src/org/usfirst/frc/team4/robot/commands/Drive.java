package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;
import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	public Drive(double x, double y) {
		requires(Robot.chassis);
	}

	protected void initialize() {
	}

	protected void execute() {
		if(Robot.chassis.driveSwap == true){
			Robot.chassis.tankDrive(Robot.oi.leftY(RobotMap.driveCont), Robot.oi.rightY(RobotMap.driveCont));
		}else{
			Robot.chassis.arcadeDrive(Robot.oi.leftX(RobotMap.driveCont), Robot.oi.leftY(RobotMap.driveCont));
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.chassis.stop();
	}

	protected void interrupted() {
		end();
	}
}
