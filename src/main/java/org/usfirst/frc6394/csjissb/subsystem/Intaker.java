package org.usfirst.frc6394.csjissb.subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import org.usfirst.frc6394.csjissb.Constants;
import org.usfirst.frc6394.csjissb.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Intaker extends Subsystem {

    VictorSPX intakerBall = new VictorSPX(RobotMap.intakerBall);
    Counter motorCounter = new Counter(new DigitalInput(1));
    TalonSRX intakerPannel = new TalonSRX(RobotMap.intakerPannel);

    public int position;

    public Intaker(){
        intakerBall.setNeutralMode(NeutralMode.Brake);
        intakerPannel.setNeutralMode(NeutralMode.Brake);
    }

    @Override
    public void initDefaultCommand(){
    }

    @Override
    public void periodic(){
    }

    public void takeBall(double d){
        intakerBall.set(ControlMode.PercentOutput, d);
    }

    public void takePannel(int _distance){
        intakerPannel.setInverted(true);
        intakerPannel.set(ControlMode.Position, _distance);

        SmartDashboard.putNumber("pannel position", position);
    }

    public void putPannel(int _distance){
        intakerPannel.setInverted(false);
        intakerPannel.set(ControlMode.Position, _distance);

        SmartDashboard.putNumber("pannel position", position);
    }

}