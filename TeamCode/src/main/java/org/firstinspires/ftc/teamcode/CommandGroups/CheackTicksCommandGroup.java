package org.firstinspires.ftc.teamcode.CommandGroups;

import com.seattlesolvers.solverslib.command.Command;
import com.seattlesolvers.solverslib.command.SequentialCommandGroup;
import com.seattlesolvers.solverslib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Subsystems.MoveMotorSubsystem;

public class CheackTicksCommandGroup {

    public static Command runMotorCommand() {
        return new SequentialCommandGroup(
                MoveMotorSubsystem.getInstance().setPowerInstantCommand(1),
                new WaitCommand(3000),
                MoveMotorSubsystem.getInstance().setPowerInstantCommand(0)
        );
    }

}
