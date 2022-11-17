package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


/**
 * @author Bailey Say
 * 
 * Code for sucking balls
 */

public class Intake extends SubsystemBase {
    
    DoubleSolenoid doublePCM1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.soleinoid_one_forward, Constants.Intake.soleinoid_one_backward); // Add ports later
    DoubleSolenoid doublePCM2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.soleinoid_two_forward, Constants.Intake.soleinoid_two_backward); // Add ports later

    CANSparkMax neoMotor = new CANSparkMax(Constants.Intake.intake_motor, CANSparkMax.MotorType.kBrushless);

    public Intake() {

    }

    public void suckBalls() {
        doublePCM1.set(Value.kForward);
        doublePCM2.set(Value.kForward);

        neoMotor.set(0);
    }


}
