// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NeoMotor extends SubsystemBase {
  /*    Declaring Variables */
  //      Creates a CANSparkMax
  private CANSparkMax motor;

  /** Creates a new NeoMotor. */
  public NeoMotor() {
    motor = new CANSparkMax(Constants.REVConstants.NEO_ID, MotorType.kBrushless);
  }

  public void forward(){
    motor.set(Constants.REVConstants.FORWARD_SPEED);
  }

  public void backward(){
    motor.set(Constants.REVConstants.BACKWARD_SPEED);
  }

  public void StopMotor(){
    motor.set(Constants.REVConstants.STOP_SPEED);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
