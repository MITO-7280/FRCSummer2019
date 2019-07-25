package org.usfirst.frc6394.csjissb.subsystem;

import org.usfirst.frc6394.csjissb.commands.InverseDrive;
import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Judge extends Subsystem {
    public boolean inverseDrive;
    
    public Judge() {
        inverseDrive = false;
    }

    @Override
    public void initDefaultCommand(){
        setDefaultCommand(new InverseDrive());
    }

    public void judgeDriveType(){
        if (Robot.oi.motionStick.getRawButton(9)){
            inverseDrive = true;
            SmartDashboard.putNumber("inverse", 1);
        } 
        if (Robot.oi.motionStick.getRawButton(10)){
            inverseDrive = false;
            SmartDashboard.putNumber("inverse", 0);
        }

        SmartDashboard.putBoolean("inverse", inverseDrive);
    }

}