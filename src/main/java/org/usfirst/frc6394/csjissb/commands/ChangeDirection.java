
package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ChangeDirection extends Command {

    public ChangeDirection(){
        requires(Robot.base);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){
        Robot.base.changeDirection();
    }

    @Override
    protected boolean isFinished(){
        return true;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted(){
        end();
    }
}
