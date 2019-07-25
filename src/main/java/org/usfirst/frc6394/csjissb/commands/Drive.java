package org.usfirst.frc6394.csjissb.commands;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

    public Drive(){
        requires(Robot.base);
        requires(Robot.judge);
    }

    @Override
    protected void initialize(){
    }

    @Override
    protected void execute(){

        if (Robot.oi.motionStick.getRawButton(2)){
            switch (Robot.netWorkTable.ballPosition) {
                case 0: // can't find ball
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                    break;
                    
                case 1: // the ball is on the left4
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), -0.5);
                    break;
                
                case 3: // the ball is in the center 
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), 0);
                    break;

                case 2: // the ball is on the right
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), 0.5);
                    break;

                case 5:
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                    break;

                default:
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                    break;
            }
        }
             else {
                // switch (Robot.oi.motionStick.getPOV()) {
                //     case 0:
                //         // if (Robot.base.inverseDrive == true){
                //         //     Robot.base.drive(Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getX());
                //         // } else {
                //         // Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                //         // }

                //     case 45:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnRight(45);
                    
                //     case 90:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnRight(90);
                    
                //     case 135:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnRight(135);
                    
                //     case 180:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnLeft(180);
                    
                //     case 225:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnLeft(135);
                    
                //     case 270:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnLeft(90);

                //     case 315:
                //         Robot.base.zeroSensorPosition();
                //         Robot.base.turnLeft(45);

                //     default:
                //         if (Robot.judge.inverseDrive == true){
                //             Robot.base.drive(Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getX());
                //         }
                        
                //         if(Robot.judge.inverseDrive == false) {
                //             Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                //         }
                //     }
                if (Robot.judge.inverseDrive == true){
                    Robot.base.drive(Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getX());
                }
                
                if(Robot.judge.inverseDrive == false) {
                    Robot.base.drive(Robot.oi.motionStick.getTwist(), Robot.oi.motionStick.getThrottle(), Robot.oi.motionStick.getX());
                }
                }
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