package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


/**
 * @author Bailey Say
 * 
 * Code for sucking balls
 */

public class Intake extends SubsystemBase {
    
    DoubleSolenoid doublePCM1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.soleinoid_one_forward, Constants.Intake.soleinoid_one_backward); // Add ports later
    DoubleSolenoid doublePCM2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.soleinoid_two_forward, Constants.Intake.soleinoid_two_backward); // Add ports later

    public Intake() {

    }

    public 


}
