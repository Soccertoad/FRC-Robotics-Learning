// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/*  Imports */
/*    WPI */
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
/*    Robot */
import frc.robot.Controls;
/*      Subsystems */
import frc.robot.Subsystems.Compresor;
import frc.robot.Subsystems.DSolenoid;
import frc.robot.Subsystems.LEDLights;
/*      Commands */
import frc.robot.Commands.ToggleCompressor;
import frc.robot.Commands.ToggleDSolenoid;
import frc.robot.Commands.PurpleLights;
import frc.robot.Commands.Rainbow;
import frc.robot.Commands.RainbowSolid;

public class RobotContainer {
  /*  Declaring Variables */
  /*    Controllers */
  private final CommandXboxController operator = Controls.operator;

  /*    Subsystem*/
  private final DSolenoid dSolenoid = new DSolenoid();
  private final Compresor compresor = new Compresor();
  private final LEDLights ledLights = new LEDLights();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

    operator.a().onTrue(new ToggleDSolenoid(dSolenoid));
    operator.b().onTrue(new ToggleCompressor(compresor));
    operator.x().onTrue(new PurpleLights(ledLights));
    operator.y().onTrue(new Rainbow(ledLights));
    operator.povDown().onTrue(new RainbowSolid(ledLights));

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
