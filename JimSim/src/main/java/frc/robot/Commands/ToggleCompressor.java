// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

/*  Imports */
/*    WPI */
import edu.wpi.first.wpilibj2.command.Command;
/*    Subsystem */
import frc.robot.Subsystems.Compresor;

public class ToggleCompressor extends Command {
  /*  Declaring Vaiables */
  //    Compressor Subsystem
  private Compresor compresor;
  //    End Command
  private boolean endCommand;

  /** Creates a new ToggleCompressor. */
  public ToggleCompressor(Compresor m_compresor) {
    //  Sets local variable to global variable
    compresor = m_compresor;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(compresor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //  Sets End Command to false
    endCommand = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (compresor.getCompressor()){
      compresor.disable();
    } else {
      compresor.enable();
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
