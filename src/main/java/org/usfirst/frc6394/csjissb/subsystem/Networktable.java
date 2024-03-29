/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc6394.csjissb.subsystem;

import org.usfirst.frc6394.csjissb.commands.GetTableData;

import org.usfirst.frc6394.csjissb.Robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Networktable extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  NetworkTableInstance inst = NetworkTableInstance.getDefault();
  NetworkTable put = inst.getTable("tape");
  NetworkTable ball = inst.getTable("ball");
  NetworkTableEntry ballPositioneEntry = ball.getEntry("Y");
  NetworkTableEntry upTapeEntry = put.getEntry("Y");
  NetworkTableEntry downTapeEntry = put.getEntry("X");
  NetworkTableEntry distanceEntry = put.getEntry("distance");
  NetworkTableEntry angleEntry = put.getEntry("angle");

  // modify needed check the networktale entry nuner

  NetworkTable sender = inst.getTable("isNeeded");
  NetworkTableEntry isNeeded = sender.getEntry("X");


  public int ballPosition;
  public int upTape;
  public int downTape;
  public int distance;
  public int angle;
  double x = 0;

  public Networktable(){
    inst.startClientTeam(7280);
    inst.startDSClient();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new GetTableData());
  }

  public void getTableData() {
    ballPosition = (int) ballPositioneEntry.getDouble(5.0);
    upTape = (int) upTapeEntry.getDouble(5.0);
    downTape = (int) downTapeEntry.getDouble(5.0);
    distance = (int) distanceEntry.getDouble(0);
    angle = (int) angleEntry.getDouble(0);
/*
    isNeeded.setDouble(x);
    if (Robot.base.tableOn) {
      x = 1.0;
    } else {
      x = 0.0;
    }
    */
  }
}