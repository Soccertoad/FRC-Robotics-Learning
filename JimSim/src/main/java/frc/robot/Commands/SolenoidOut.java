// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Solenoid1;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class SolenoidOut extends Command {
  Solenoid1 solenoid2x;
  boolean endCommand = false;
  /** Creates a new ToggleSolenoid. */
  public SolenoidOut(Solenoid1 m_solenoid2x) {
    solenoid2x = m_solenoid2x;
    // Use addRequirements() here to declare subsystem dependencies.
  addRequirements(solenoid2x);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    solenoid2x.Outward();

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
