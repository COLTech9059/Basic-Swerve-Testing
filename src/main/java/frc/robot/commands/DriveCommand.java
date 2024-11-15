// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Swerve;

/** An example command that uses an example subsystem. */
public class DriveCommand extends Command {

  private final Swerve m_Swerve;
  private final DoubleSupplier speed;
  private final DoubleSupplier turn;

  /**
   * Creates a new DriveCommand
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveCommand(Swerve m_Swerve, DoubleSupplier speed, DoubleSupplier turn) {
    
    // Variable assignment
    this.m_Swerve = m_Swerve;
    this.speed = speed;
    this.turn = turn;

    addRequirements(m_Swerve);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    m_Swerve.basicDrive(speed.getAsDouble(), turn.getAsDouble());
  }
}
