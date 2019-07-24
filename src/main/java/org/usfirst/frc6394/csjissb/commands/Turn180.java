
package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Turn180 extends Command {
    int targetDistance;
    public Turn180(int _distance){
        requires(Robot.base);
        targetDistance = _distance;
    }

    @Override
    protected void initialize(){
        Robot.base.zeroSensorPosition();
        Robot.base.configPositionPID();
    }

    @Override
    protected void execute(){
        Robot.base.turn180(targetDistance);
        Robot.base.showData();
    }

    @Override
    protected boolean isFinished(){
        if (Robot.base.getCurrentDistance() - targetDistance < 500){
            return false;
        }   else {
            return true;
        }
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted(){
        end();
        Robot.base.configVelocityPID();
    }
}
