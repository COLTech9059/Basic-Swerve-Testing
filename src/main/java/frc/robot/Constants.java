package frc.robot;

import frc.robot.Subsystems.SwerveMod;
import frc.robot.SwerveModConstants;

public class Constants 
{
    // Drive constants
    public static double wheelDiameter = 3.75;
    public static double wheelBaseDist = 25;
    public static double maxSpeed = 0.5;
    public static double maxTurnSpeed = 0.35;
    public static SwerveModConstants mod1Constants = new SwerveModConstants(2, 9, 10);
    public static SwerveModConstants mod2Constants = new SwerveModConstants(3, 4, 11);
    public static SwerveModConstants mod3Constants = new SwerveModConstants(5, 6, 12);
    public static SwerveModConstants mod4Constants = new SwerveModConstants(7, 8, 13);
    
}
