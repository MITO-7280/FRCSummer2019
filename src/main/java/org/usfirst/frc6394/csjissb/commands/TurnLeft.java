
package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TurnLeft extends Command {
    int targetDistance;
    public TurnLeft(int _angle){
        requires(Robot.base);
        targetDistance = 45 * _angle + 420;
        SmartDashboard.putNumber("distance", targetDistance);
    }

    @Override
    protected void initialize(){
        Robot.base.zeroSensorPosition();
        Robot.base.configPositionPID();
    }

    @Override
    protected void execute(){
        Robot.base.turnLeft(targetDistance);
        Robot.base.showData();
    }

    @Override
    protected boolean isFinished(){
        
        if (targetDistance + Robot.base.getRightCurrentDistance() < 500 
        && targetDistance - Robot.base.getLeftCurrentDistance() < 500){
            return true;
        }   else {
            return false;
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
