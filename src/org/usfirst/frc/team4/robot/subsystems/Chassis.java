package org.usfirst.frc.team4.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

import org.usfirst.frc.team4.robot.RobotMap;

public class Chassis extends Subsystem {
	private VictorSP m_leftFwd, m_leftRwd, m_rightFwd, m_rightRwd;
	private RobotDrive drive;
	public boolean driveSwap = true;

	public Chassis() {
		m_leftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
		m_leftRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);
		m_rightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
		m_rightRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);

		drive = new RobotDrive(m_leftFwd, m_leftRwd, m_rightFwd, m_rightRwd);
	}

	public void initDefaultCommand() {
	}

	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}

	public void arcadeDrive(double speed, double turn) {
		drive.arcadeDrive(speed, turn);
	}

	public void stop() {
		drive.tankDrive(0, 0);
	}
}
