// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.Subsystems.NeoMotor;

public class StopMotor extends Command {
  /*  Creates a object of the NeoMotor Subsystem */
  NeoMotor neoMotor;

  //  Creates a boolean that ends the Command 
  Boolean endCommand = false;

  /**   Creates a new StopMotor */
  //      Creates a local object of the NeoMotor subsystem
  public StopMotor(NeoMotor m_NeoMotor) {
    //      Makes the local variable equal to the global variable
    neoMotor = m_NeoMotor;

    //      Use addRequirements() here to declare subsystem dependencies
    //      Requires the NeoMotor subsystem to run command 
    addRequirements(neoMotor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //  Uses the stopmotor command from the NeoMotor subsystem
    neoMotor.stopmotor();

    //  Sets end Command to true, to end command
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
