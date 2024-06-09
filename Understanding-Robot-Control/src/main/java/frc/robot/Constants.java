// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//      Constants
public final class Constants {
    /*      Constants for Drivebase */
    public static class DriveConstants{
        /*      Drive Motor ID's */
        //          Left Drive ID's
        public static final int leftDrive1_ID = 1;
        public static final int leftDrive2_ID = 2; 
        //          Right Drive ID's
        public static final int rightDrive1_ID = 3;
        public static final int rightDrive2_ID = 4;

        /**      Driving Constants */
        //          Sensitivity 
        public static final double NORMAL_SENSITIVITY = 1.0;
        public static final double PRECISION_SENSITIVITY = 0.4;
        public static final double SPIN_SENSITIVITY = 0.8;
        //          Speeds
        public static final int STOP_SPEED = 0;
        public static final double FULL_SPEED = 1.0;
        
    }
    /*      Constants for Controllers */
    public static class ControlConstants{
        /*      Xbox Controllers Driverstation Ports */
        //          Driver Controller
        public static final int XBOX_CONTROLLER_DRIVER_PORT = 0;
        //          Operator Controller
        public static final int XBOX_CONTROLLER_OPERATOR_PORT = 1;

        /*      Controller Button Constants */
        //          Prevent Minor Controller Drift
        public static final double CONTROLLER_DEADZONE = 0.05;
        //          Inverses the Direction
        public static final int INVERSE_DIRECTION = -1;
        
    }
}
