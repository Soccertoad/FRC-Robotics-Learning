// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Solenoid1;
import frc.robot.Commands.SolenoidIn;
import frc.robot.Commands.SolenoidOut;
import frc.robot.Controls;

public class RobotContainer {

  private final Solenoid1 solenoid2x = new Solenoid1();
    private final CommandXboxController operator = Controls.operator;


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    operator.a().onTrue(new SolenoidIn(solenoid2x));
    operator.b().onTrue(new SolenoidOut(solenoid2x));
    
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
