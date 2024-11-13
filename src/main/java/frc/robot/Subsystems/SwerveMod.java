package frc.robot.Subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.SwerveModConstants;

public class SwerveMod 
{
    public int modID;

    private TalonFX driveMotor;
    private TalonFX steerMotor;
    private CANcoder angleEncoder;
    private TalonFXConfiguration driveConfig = new TalonFXConfiguration();

    public SwerveMod(int modID, SwerveModConstants constants) 
    {
        this.modID = modID;

        driveMotor = new TalonFX(constants.driveID);
        steerMotor = new TalonFX(constants.steerID); 
        // angleEncoder = new CANcoder(constants.CANCoderID);
    }
}
