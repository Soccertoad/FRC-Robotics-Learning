// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedsLights extends SubsystemBase {
  AddressableLED addressableled;
  AddressableLEDBuffer addressableledbuffer;
  /** Creates a new LedsLights. */
  public LedsLights() {
    addressableled = new AddressableLED(1);
    addressableledbuffer = new AddressableLEDBuffer(20);
    addressableled.setLength(20);
    addressableled.start();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
