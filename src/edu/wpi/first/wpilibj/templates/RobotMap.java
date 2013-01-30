package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    //climber
    //
    public static final int LeftClimberMotorSlot = 1;
    public static final int LeftClimberMotorChannel = 5;
    public static final int RightClimberMotorSlot = 1;
    public static final int RightClimberMotorChannel = 1;
    //digital i/o
    public static final int LeftClimberSwitchTop = 4;
    public static final int LeftClimberSwitchBottom = 5;
    public static final int ClimberSwitchSlot = 1;
    public static final double ClimberMotorUpSpeed = 0.5;
    public static final double ClimberMotorDownSpeed = -0.5;
    public static final boolean ClimberSwitchOpen = true;
    public static final boolean ClimberSwitchClosed = false;
    
    //tilt
    public static final int TiltMotorSlot = 1;
    public static final int TiltMotorChannel = 3;
    public static final int TiltSwitchExtend = 9;
    public static final int TiltSwitchRetract = 7;
    public static final boolean TiltSwitchOpen = true;
    public static final boolean TiltSwitchClosed = false;
    public static final double TiltExtendSpeed = 0.5;
    public static final double TiltRetractSpeed = -0.5;
            
    
}
