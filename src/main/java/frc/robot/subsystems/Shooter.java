package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Shooter extends SubsystemBase {
    private WPI_TalonFX leftMotor = new WPI_TalonFX(Constants.Shooter.left_shooter_motor);
    private WPI_TalonFX rightMotor = new WPI_TalonFX(Constants.Shooter.right_shooter_motor);
    //class name is same as setter
    public Shooter() {
        leftMotor.setInverted(true);
        rightMotor.setInverted(false);
    }

    private MotorControllerGroup shoot = new MotorControllerGroup(rightMotor, leftMotor);
    public void setSpeed (double speed)
    {
        shoot.set(speed);
    }
}
