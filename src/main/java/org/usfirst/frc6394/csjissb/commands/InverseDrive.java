package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class InverseDrive extends Command {

    public InverseDrive(){
        requires(Robot.judge);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        Robot.judge.judgeDriveType();
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void end(){
    }
    
    @Override
    protected void interrupted(){
    }
}