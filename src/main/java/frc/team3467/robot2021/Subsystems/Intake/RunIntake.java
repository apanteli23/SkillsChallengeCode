// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team3467.robot2021.Subsystems.Intake;


import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
  IntakeSubsystem m_intake;
  Double m_speed;
  public RunIntake(IntakeSubsystem intakeSubsystem, Double speed) {
    m_intake = intakeSubsystem;
    m_speed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_intake.driveIntake(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.driveIntake(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
