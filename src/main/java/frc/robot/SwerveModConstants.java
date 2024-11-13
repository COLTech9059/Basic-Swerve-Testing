package frc.robot;

public class SwerveModConstants 
{
    public int steerID;
    public int driveID;
    public int CANCoderID;

    public SwerveModConstants(int steerID, int driveID, int CANCoderID)
    {
        this.steerID = steerID;
        this.driveID = driveID;
        this.CANCoderID = CANCoderID;
    }
}
