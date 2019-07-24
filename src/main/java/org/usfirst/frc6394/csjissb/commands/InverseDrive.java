package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class InverseDrive extends Command {

    public InverseDrive(){
        requires(Robot.base);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
       Robot.base.inverseDrive();
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