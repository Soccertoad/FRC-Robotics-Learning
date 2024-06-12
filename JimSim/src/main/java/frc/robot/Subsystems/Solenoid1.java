// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Solenoid1 extends SubsystemBase {

  DoubleSolenoid solenoid2x;

  /** Creates a new Solinoid. */
  public Solenoid1() {
   solenoid2x = new DoubleSolenoid(1, PneumaticsModuleType.CTREPCM, 0, 1);

  }

  public void Outward(){
   solenoid2x.set(Value.kForward);
  }
  public void Retract(){
   solenoid2x.set(Value.kReverse);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
