// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Solenoid1;

public class SolenoidIn extends Command {
  Solenoid1 solenoid2x;
  Boolean endCommand = false;
  /** Creates a new SolenoidIn. */
  public SolenoidIn(Solenoid1 m_soleniod2x) {
    solenoid2x = m_soleniod2x;
    // Use addRequirements() here to declare subsystem dependencies.
  addRequirements(solenoid2x);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    solenoid2x.Retract();
    endCommand = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return endCommand;
  }
}
