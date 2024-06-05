// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
/*  Imports */
//  WPI Imports
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
/*    Robot Imports */
//      Subsystem Imports
import frc.robot.Subsystems.Drivebase;
//      Command Imports
import frc.robot.Commands.Backward;
import frc.robot.Commands.Forward;
//      Robot Imports
import frc.robot.Controls;

public class RobotContainer {
  /*  Creates Command Xbox Controller */
  //    Creates driver Controller
  private final CommandXboxController driver = Controls.driver;
  //    Creates operator Controller
  private final CommandXboxController operator = Controls.operator;

  /*  Creates Subsystems */
  //    Creates Drivebase subsystem
  private final Drivebase drivebase = new Drivebase();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    /*  Maps the Controller buttons to Commands */
    /*    Driver */
    //      Runs forward command while the driver controllers right trigger is pressed 
    driver.rightTrigger().whileTrue(new Forward(drivebase));
    //      Runs backward command while the driver controllers left trigger is pressed
    driver.leftTrigger().whileTrue(new Backward(drivebase));
    
    /*    Operator */
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
