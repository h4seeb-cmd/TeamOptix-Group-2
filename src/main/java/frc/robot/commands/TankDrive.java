package frc.robot.commands;

import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class TankDrive extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final Drivetrain drivetrain;
    private DoubleSupplier left;
    private DoubleSupplier right;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */

     // bcz this keyword, u can use left and right in params
    public TankDrive(Drivetrain drivetrainl, DoubleSupplier leftl, DoubleSupplier rightl) {
      this.drivetrain = drivetrainl;
      this.left = leftl;
      this.right = rightl;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(drivetrainl);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      drivetrain.setSpeed(0, 0);
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        drivetrain.setSpeed(left.getAsDouble(), right.getAsDouble());
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      drivetrain.setSpeed(0, 0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }
