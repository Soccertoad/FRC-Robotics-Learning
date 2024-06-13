// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

/*  Imports */
/*    WPI */
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.Command;
/*    Subsystem */
import frc.robot.Subsystems.DSolenoid;

public class ToggleDSolenoid extends Command {
  /*  Declaring Variables */
  //    Double Solenoid Subsystem
  private DSolenoid dSolenoid;
  //    End Command
  private boolean endCommand;

  /** Creates a new ToggleDSolenoid. */
  public ToggleDSolenoid(DSolenoid m_dSolenoid) {
    //  Sets local variable to global
    dSolenoid = m_dSolenoid;

    //  Use addRequirements() here to declare subsystem dependencies.
    addRequirements(dSolenoid);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //  Sets endCommand to false
    endCommand = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    if (dSolenoid.getValue().equals(Value.kForward)){
      dSolenoid.retract();
    } else {
      dSolenoid.extend();
    }

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
