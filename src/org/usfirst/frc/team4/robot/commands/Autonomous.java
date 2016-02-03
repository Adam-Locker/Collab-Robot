package org.usfirst.frc.team4.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4.robot.commands.AutonDrive;

public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
      addSequential(new AutonDrive(0.75,0.75),5);
    }
}
