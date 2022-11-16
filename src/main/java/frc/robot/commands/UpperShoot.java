package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Shooter;

public class UpperShoot extends CommandBase{
    private Shooter shot;
    Timer timeIt = new Timer();
    public UpperShoot(Shooter asdf) {
        shot = asdf;
    }
    @Override
    public void initialize() {
        shot.setSpeed(0);
        timeIt.start();
    }
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        shot.setSpeed(Constants.Shooter.upper_speed);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        shot.setSpeed(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        if (timeIt.get() > 5)
        {
            return true;
        }
        return false;
    }
}
