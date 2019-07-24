package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class NormalDrive extends Command {

    public NormalDrive(){
        requires(Robot.base);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
       Robot.base.reinverseDrive();
    }

    @Override
    protected boolean isFinished(){
        return true;
    }

    @Override
    protected void end(){
    }
    
    @Override
    protected void interrupted(){
    }
}