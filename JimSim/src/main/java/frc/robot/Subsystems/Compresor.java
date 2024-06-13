// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Compresor extends SubsystemBase {
  Compressor compressor;
  /** Creates a new Compresor. */
  public Compresor() {
    compressor = new Compressor(1, PneumaticsModuleType.CTREPCM);
  }
  public void enable(){
    compressor.enableDigital();
  }
  public void disable(){
    compressor.disable();
  }
  public boolean getCompressor(){
    return compressor.isEnabled();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
