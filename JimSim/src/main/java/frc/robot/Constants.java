package frc.robot;

public class Constants {
    /*      Constants for Controllers */
    public static class ControlConstants{
        /*      Xbox Controllers Driverstation Ports */
        //          Driver Controller
        public static final int XBOX_CONTROLLER_DRIVER_PORT = 0;
        //          Operator Controller
        public static final int XBOX_CONTROLLER_OPERATOR_PORT = 1;
    }
    
    /*      Constants for Rev Motor */
    public static class REVConstants{
        //      CANSparkMax ID
        public static final int NEO_ID = 2;

        /*      Motor Speeds */
        //          Motor Spining Forward 
        public static final int FORWARD_SPEED = 1;
        //          Motor Spining Backward 
        public static final int BACKWARD_SPEED = -1;
        //          Stoping the Motor
        public static final int STOP_SPEED = 0;

    }
    /*      Constants for DoubleSolenoid */
    public static class DoubleSolenoidConstants{
        //
        public static final int D_SOLENOID_MODULE_ID = 1;
        //
        public static final int FORWARD_CHANNEL = 0;
        //
        public static final int REVERSE_CHANNEL = 1;

    }
    /*      Constants for Compressor */
    public static class CompressorConstants{
        //
        public static final int COMPRESSOR_MODULE_ID = 1;

    }
    /*      Constants for CTRE Motor */
    public static class CTREConstants{

    }
}
