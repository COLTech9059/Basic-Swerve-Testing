package frc.robot.Subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;
import frc.robot.SwerveModConstants;

public class SwerveMod 
{
    public int modID;

    private TalonFX driveMotor;
    private TalonFX steerMotor;
    private CANcoder angleEncoder;

    public SwerveMod(int modID, SwerveModConstants constants) 
    {
        this.modID = modID;

        driveMotor = new TalonFX(constants.driveID, Constants.driveBus);
        steerMotor = new TalonFX(constants.steerID, Constants.driveBus);
        // angleEncoder = new CANcoder(constants.CANCoderID, Constants.driveBus);
    }

    public void setModule(double speed, double turn)
    {
        driveMotor.set(speed * Constants.maxSpeed);
        steerMotor.set(turn * Constants.maxTurnSpeed);
    }
}
