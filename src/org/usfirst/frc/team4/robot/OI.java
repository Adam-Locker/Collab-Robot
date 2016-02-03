package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team4.robot.commands.DriveSwap;

public class OI {

	public OI() {
		RobotMap.driveA.whenPressed(new DriveSwap());
	}

	public double rightX(Joystick cont) {
		if (cont.getRawAxis(RobotMap.CONT_RX) == .1) {
			return 0;
		} else {
			return cont.getRawAxis(RobotMap.CONT_RX);
		}
	}

	public double rightY(Joystick cont) {
		if (cont.getRawAxis(RobotMap.CONT_RY) == .1) {
			return 0;
		} else {
			return cont.getRawAxis(RobotMap.CONT_RY);
		}
	}

	public double leftX(Joystick cont) {
		if (cont.getRawAxis(RobotMap.CONT_LX) == .1) {
			return 0;
		} else {
			return cont.getRawAxis(RobotMap.CONT_LX);
		}
	}

	public double leftY(Joystick cont) {
		if (cont.getRawAxis(RobotMap.CONT_LY) == .1) {
			return 0;
		} else {
			return cont.getRawAxis(RobotMap.CONT_LY);
		}
	}
}