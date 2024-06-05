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

  /**   Creates a new NeoMotor. */
  public NeoMotor() {
    //    Initalizing the CANSparkMax
    //      Needs the CANSparkMax CAN ID, then the MotorType
    motor = new CANSparkMax(Constants.REVConstants.NEO_ID, MotorType.kBrushless);
  }

  /*      Methods for making the Motor Spin*/
  //        Spins the motor in a positive direction
  public void forward(){
    //        Sets the speed of the motor to 1
    motor.set(Constants.REVConstants.FORWARD_SPEED);
  }
  //        Spins the motor in a negative direction
  public void backward(){
    //        Sets the speed of the motor to -1
    motor.set(Constants.REVConstants.BACKWARD_SPEED);
  }
  //        Stops the motor
  public void stopmotor(){
    //        Sets the speed of the motor to 0
    motor.set(Constants.REVConstants.STOP_SPEED);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
