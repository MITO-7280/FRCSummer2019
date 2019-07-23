package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Constants;
import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TakeBall extends Command {

    public TakeBall(){
        requires(Robot.intaker);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        Robot.intaker.takeBall(0.3);
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void interrupted(){
    }
}