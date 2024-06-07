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
import frc.robot.Commands.XboxMove;
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
  /*  Creates Commands */
  //    Creates XboxMove Command
  private final XboxMove xboxmove = new XboxMove(drivebase);

  public RobotContainer() {
    drivebase.setDefaultCommand(xboxmove);
    configureBindings();
  }

  private void configureBindings() {
    /*  Maps the Controller buttons to Commands */
    /*    Driver */
   
    /*    Operator */
    //      Runs forward command while the operator controllers right trigger is pressed 
    operator.rightTrigger().whileTrue(new Forward(drivebase));
    //      Runs backward command while the operator controllers left trigger is pressed
    operator.leftTrigger().whileTrue(new Backward(drivebase));
    
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
