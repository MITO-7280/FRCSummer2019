
package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Turn180 extends Command {

    public Turn180(){
        requires(Robot.base);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        Robot.base.zeroSensorPosition();
        Robot.base.turn180();
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
