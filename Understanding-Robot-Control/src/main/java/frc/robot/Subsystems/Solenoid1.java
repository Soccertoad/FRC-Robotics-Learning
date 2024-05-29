// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Solenoid1 extends SubsystemBase {

  private DoubleSolenoid doubleSolenoid;
  private Solenoid solenoid;

  /** Creates a new Solinoid. */
  public Solenoid1() {
    doubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
    solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 1);
  }

  public void solenoidForward(){
    doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    doubleSolenoid.toggle();
    
    solenoid.toggle();
  }
  public void solenoidReverse(){
    doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    doubleSolenoid.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
