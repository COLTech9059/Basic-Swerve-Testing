package frc.robot;

import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

public final class CTREConfigs {
    public TalonFXConfiguration swerveAngleFXConfig = new TalonFXConfiguration();
    public TalonFXConfiguration swerveDriveFXConfig = new TalonFXConfiguration();
    public CANcoderConfiguration swerveCANcoderConfig = new CANcoderConfiguration();

    public CTREConfigs(){
        /** Swerve CANCoder Configuration */
        // swerveCANcoderConfig.MagnetSensor.SensorDirection = 

        /** Swerve Angle Motor Configurations */
        /* Motor Inverts and Neutral Mode */
        // swerveAngleFXConfig.MotorOutput.Inverted = 
        swerveAngleFXConfig.MotorOutput.NeutralMode = NeutralModeValue.Coast;

        /* Gear Ratio and Wrapping Config */
        // swerveAngleFXConfig.Feedback.SensorToMechanismRatio = 
        swerveAngleFXConfig.ClosedLoopGeneral.ContinuousWrap = true;
        
        /* Current Limiting */
        // swerveAngleFXConfig.CurrentLimits.SupplyCurrentLimitEnable = 
        // swerveAngleFXConfig.CurrentLimits.SupplyCurrentLimit = 
        // swerveAngleFXConfig.CurrentLimits.SupplyCurrentThreshold = 
        // swerveAngleFXConfig.CurrentLimits.SupplyTimeThreshold = 

        /* PID Config */
        // swerveAngleFXConfig.Slot0.kP = 
        // swerveAngleFXConfig.Slot0.kI = 
        // swerveAngleFXConfig.Slot0.kD = 

        /** Swerve Drive Motor Configuration */
        /* Motor Inverts and Neutral Mode */
        // swerveDriveFXConfig.MotorOutput.Inverted = 
        swerveDriveFXConfig.MotorOutput.NeutralMode = NeutralModeValue.Brake;

        /* Gear Ratio Config */
        // swerveDriveFXConfig.Feedback.SensorToMechanismRatio = 

        /* Current Limiting */
        // swerveDriveFXConfig.CurrentLimits.SupplyCurrentLimitEnable = 
        // swerveDriveFXConfig.CurrentLimits.SupplyCurrentLimit = 
        // swerveDriveFXConfig.CurrentLimits.SupplyCurrentThreshold = 
        // swerveDriveFXConfig.CurrentLimits.SupplyTimeThreshold = 

        /* PID Config */
        // swerveDriveFXConfig.Slot0.kP = 
        // swerveDriveFXConfig.Slot0.kI = 
        // swerveDriveFXConfig.Slot0.kD = 

        /* Open and Closed Loop Ramping */
        swerveDriveFXConfig.OpenLoopRamps.DutyCycleOpenLoopRampPeriod = 0.5;
        swerveDriveFXConfig.OpenLoopRamps.VoltageOpenLoopRampPeriod = 0.5;

        swerveDriveFXConfig.ClosedLoopRamps.DutyCycleClosedLoopRampPeriod = 0.5;
        swerveDriveFXConfig.ClosedLoopRamps.VoltageClosedLoopRampPeriod = 0.5;
    }
}