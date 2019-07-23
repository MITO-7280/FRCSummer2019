package org.usfirst.frc6394.csjissb;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class RobotMap {

    //base
    public static final int leftMasterMotor = 2;
    public static final int leftSlaveMotor = 3;
    public static final int rightMasterMotor = 1;
    public static final int rightSlaveMotor = 4;

    //bal
    public static final int intakerBall = 16;

    //pannel
    public static final int intakerPannel = 15;

    public RobotMap(){
    }
    public void TalonSRXInt (TalonSRX _talon, double _peakOutput){

        _talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, Constants.kPIDLoopIdx,
                Constants.kTimeoutMs);

        _talon.configFactoryDefault();
 
        _talon.setSensorPhase(true);
        
            _talon.configNominalOutputForward(0, Constants.kTimeoutMs);
            _talon.configNominalOutputReverse(0, Constants.kTimeoutMs);
            _talon.configPeakOutputForward(1, Constants.kTimeoutMs);
            _talon.configPeakOutputForward(-1, Constants.kTimeoutMs);

        _talon.setSelectedSensorPosition(0, Constants.kPIDLoopIdx, Constants.kTimeoutMs);

        _talon.configAllowableClosedloopError(1, Constants.kPIDLoopIdx, Constants.kTimeoutMs);

        _talon.configClosedLoopPeakOutput(Constants.kSlotIdx, _peakOutput, Constants.kTimeoutMs);
    }

    public void setMotorPID(TalonSRX _talon, double kF, double kP, double kI, double kD){
        _talon.config_kF(Constants.kSlotIdx, kF, Constants.kTimeoutMs);
        _talon.config_kP(Constants.kSlotIdx, kP, Constants.kTimeoutMs);
        _talon.config_kI(Constants.kSlotIdx, kI, Constants.kTimeoutMs);
        _talon.config_kD(Constants.kSlotIdx, kD, Constants.kTimeoutMs);
    }
}