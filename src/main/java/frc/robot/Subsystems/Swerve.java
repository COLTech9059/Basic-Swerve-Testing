package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Swerve extends SubsystemBase
{
    private SwerveMod leftFMod = new SwerveMod(1, Constants.mod1Constants);
    private SwerveMod rightFMod = new SwerveMod(2, Constants.mod2Constants);
    private SwerveMod leftBMod = new SwerveMod(3, Constants.mod3Constants);
    private SwerveMod rightBMod = new SwerveMod(4, Constants.mod4Constants);

    private SwerveMod[] swerveDriveMods = new SwerveMod[]{leftFMod, rightFMod, leftBMod, rightBMod};

    public Swerve() {}

    public void basicDrive(double speed, double turn)
    {
        SwerveMod active;
        for (int i = 0; i < 3; i++)
        {
            active = swerveDriveMods[i];
            active.setModule(speed, turn);
        }
    }
}
