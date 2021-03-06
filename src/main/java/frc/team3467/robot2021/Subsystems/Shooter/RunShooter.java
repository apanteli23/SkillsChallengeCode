package frc.team3467.robot2021.Subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunShooter extends CommandBase{
    
    ShooterSubsystem m_shooter;
    double m_targetVelocity;

    public RunShooter(ShooterSubsystem shooterSubsys, double targetVelocity)
    {
        m_shooter = shooterSubsys;
        m_targetVelocity = targetVelocity;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute()
    {
        m_shooter.runShooter(m_targetVelocity);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean isFinished)
    {
         m_shooter.runShooter(0.0);
    }


    // Returns true when the command should end.
    @Override
    public boolean isFinished()
    {
        return false;
    }
}
