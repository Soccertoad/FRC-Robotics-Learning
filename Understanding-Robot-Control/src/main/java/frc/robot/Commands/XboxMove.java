// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

/*  Imports */
//    WPI Imports
import edu.wpi.first.wpilibj2.command.Command;
/*    Robot Imports */
//      Subsystem Imports
import frc.robot.Subsystems.Drivebase;
//      Robot Imports
import frc.robot.Constants;
import frc.robot.Controls;

public class XboxMove extends Command {
  /*  Declaring Variables */
  //    Create Subsystems
  Drivebase drivebase;
  //    Driving Variables
  //      Axis Controls
  private double throttle;
  private double reverse;
  private double turn;
  //      Button Controls
  private boolean pirouette;
  private boolean brake;
  private boolean precision;

  //      Instance Variables
  double sensitivity;
  double left;
  double right;
  double power;

  /** Creates a new XboxMove. */
  public XboxMove(Drivebase m_drivebase) {
    drivebase = m_drivebase;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*  Initializing Variables */
    //    Driving Variables
    //      Mapping controls to Axis's
    throttle = Controls.xbox_driver.getRightTriggerAxis();
    reverse = Controls.xbox_driver.getLeftTriggerAxis();
    turn = Controls.xbox_driver.getLeftX();
    //      Mapping controls to buttons
    precision = Controls.xbox_driver.getRightBumper();
    brake = Controls.xbox_driver.getLeftBumper();
    pirouette = Controls.xbox_driver.getLeftStickButtonPressed();
    //    Instance Variables
    //      Total Power of the Drive
    power = (throttle - reverse) * sensitivity;

    /***  Driving Controls  ***/

    /**    Precision Mode */
    if(precision){
        sensitivity = Constants.DriveConstants.PRECISION_SENSITIVITY;
    } 
    else {
        sensitivity = Constants.DriveConstants.NORMAL_SENSITIVITY;
    }

    /**    Braking */
    if(brake){
      //    Sets left and right speeds to 0
        left = Constants.DriveConstants.STOP_SPEED;
        right = Constants.DriveConstants.STOP_SPEED;
    }

    /**    Pirouetting */
    //      Turning in place         
    if (pirouette){
      /*      Pirouette */
      if(Math.abs(turn) > Constants.ControlConstants.CONTROLLER_DEADZONE){
        //      Sets Speeds
          left = Constants.DriveConstants.SPIN_SENSITIVITY * (turn * Constants.ControlConstants.INVERSE_DIRECTION);
          right = Constants.DriveConstants.SPIN_SENSITIVITY * turn;
      } 
      /*      Stop Pirouette */
      else if (Math.abs(turn) < Constants.ControlConstants.CONTROLLER_DEADZONE){
        //      Sets Speeds to stop Drive
          left = Constants.DriveConstants.STOP_SPEED;
          right = Constants.DriveConstants.STOP_SPEED;
      } 

    } 

    /**    Normal Turning */
    else {
      /*      Right Turn */
      if (turn > Constants.ControlConstants.CONTROLLER_DEADZONE){
          left = power;
          right = power * (Constants.DriveConstants.FULL_SPEED - turn);
      } 
      /*      Left Turn */
      else if (turn < Constants.ControlConstants.CONTROLLER_DEADZONE * Constants.ControlConstants.INVERSE_DIRECTION){
          left = power * (Constants.DriveConstants.FULL_SPEED + turn);
          right = power;
      }
      /*      Straight Drive */
      else {
        //      Sets Speed to power speed
          left = power;
          right = power;
      }

    }

    drivebase.drive(left, right);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
