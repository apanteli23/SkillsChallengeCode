// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team3467.robot2021.Subsystems.Intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team3467.robot2021.Constants.CanConstants;
import frc.team3467.robot2021.Constants.PneumaticConstants;

public class IntakeSubsystem extends SubsystemBase {

  /** Creates a new IntakeSubsystem. */
  // PC Intake motor
  private TalonSRX m_intakeMotor = new TalonSRX(CanConstants.intakeMotor);

  // Intake Deploy/Retract solenoids
   public DoubleSolenoid m_intakePiston = new DoubleSolenoid(PneumaticConstants.kIntakePistonDeploy, PneumaticConstants.kIntakePistonRetract);

  public IntakeSubsystem() 
  {
      //m_intakePiston.set(Value.kReverse);
  }
  
  public void deployIntake()
  {
      m_intakePiston.set(Value.kForward);
  }
  
  public void retractIntake() 
  {
      m_intakePiston.set(Value.kReverse);
  }

  //Reterns true if the intake is deployed
  public boolean isIntakeDeployed()
  {
      return m_intakePiston.get() == Value.kForward;
  }
  
  public void driveIntake(double speed)
  {
      m_intakeMotor.set(ControlMode.PercentOutput, speed);
  }

}
