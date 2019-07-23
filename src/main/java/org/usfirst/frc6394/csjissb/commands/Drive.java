package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

    public Drive(){
        requires(Robot.base);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void interrupted(){
        Robot.base.stop();
    }
}