package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class Drivetrain extends SubsystemBase{
    private WPI_TalonFX rightFrontMotor = new WPI_TalonFX(Constants.Drivetrain.right_front);
    private WPI_TalonFX leftFrontMotor = new WPI_TalonFX(Constants.Drivetrain.left_front);
    private WPI_TalonFX rightBackMotor = new WPI_TalonFX(Constants.Drivetrain.right_back);
    private WPI_TalonFX leftBackMotor = new WPI_TalonFX(Constants.Drivetrain.left_back);
    
    private MotorControllerGroup leftDrive = new MotorControllerGroup(leftFrontMotor, leftBackMotor);
    private MotorControllerGroup rightDrive = new MotorControllerGroup(rightFrontMotor, rightBackMotor);
    
    public Drivetrain ()
    {
        rightDrive.setInverted(true);
        leftDrive.setInverted(false);
    }
    public void setSpeed (double leftSpeed, double rightSpeed)
    {
        leftDrive.set(leftSpeed);
        rightDrive.set(rightSpeed);
    }
}
