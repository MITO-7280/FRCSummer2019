package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Constants;
import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TakePannel extends Command {

    public TakePannel(){
        requires(Robot.intaker);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        if (Robot.intaker.position < 500){
            Robot.intaker.takePannel(Constants.pannel);
        } else {
            Robot.intaker.takePannel(0);
        }
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void interrupted(){
    }
}