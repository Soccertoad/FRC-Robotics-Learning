// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

/*  Imports */
/*    WPI */
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
/*    Robot */
import frc.robot.Constants.DoubleSolenoidConstants;;

public class DSolenoid extends SubsystemBase {
  /*  Declaring Variables*/
  //    Creates Double Solenoid
  private DoubleSolenoid doubleSolenoid;

  /** Creates a new DSolenoid. */
  public DSolenoid() {
    /*  Initializing Variables */
    //    Initializing Double Solenoid
    doubleSolenoid = new DoubleSolenoid(
      DoubleSolenoidConstants.D_SOLENOID_MODULE_ID, 
      PneumaticsModuleType.CTREPCM,
      DoubleSolenoidConstants.FORWARD_CHANNEL,
      DoubleSolenoidConstants.REVERSE_CHANNEL
      );
    
  }
  public void extend(){
    doubleSolenoid.set(Value.kForward);
  }
  public void retract(){
    doubleSolenoid.set(Value.kReverse);
  }
  public Value getValue(){
    return doubleSolenoid.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
