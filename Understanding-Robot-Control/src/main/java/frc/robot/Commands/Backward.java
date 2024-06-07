// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Drivebase;

public class Backward extends Command {
  /*    Declaring Variables */
  //      Creates Drivebase subsystem
  private Drivebase drivebase;
  //      Creates Boolean that ends the command
  private Boolean endCommand = false;

  /**   Creates a new Backward. */
  public Backward(Drivebase m_drivebase) {
    //      Makes local variable equal to the global variable
    drivebase = m_drivebase; 

    //      Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivebase);
  }

  //    Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  //    Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //      Calls the backward method from the Drivebase subsystem
    drivebase.backward();
    //      Updates endCommand to end the command
    endCommand = true;
  }

  //    Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  //    Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return endCommand;
  }
}
