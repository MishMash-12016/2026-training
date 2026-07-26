package org.firstinspires.ftc.teamcode.OpModes.Auto;

import Ori.Coval.Logging.AutoLog;
import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.seattlesolvers.solverslib.command.Command;
import com.seattlesolvers.solverslib.command.CommandScheduler;
import com.seattlesolvers.solverslib.command.ParallelCommandGroup;
import com.seattlesolvers.solverslib.command.SequentialCommandGroup;
import com.seattlesolvers.solverslib.command.WaitCommand;
import com.seattlesolvers.solverslib.pedroCommand.FollowPathCommand;

import org.firstinspires.ftc.teamcode.CommandGroups.IntakeCommandGroup;
import org.firstinspires.ftc.teamcode.CommandGroups.ShootCommandGroup;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMDrivetrain;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMOpMode;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.AllianceColor;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.OpModeType;

@AutoLog
@Autonomous
public class CloseBlue extends MMOpMode {

    /**
     * use this to choose a {@link OpModeType.NonCompetition NonComp} opmode.
     *
     * @param opModeType    which opmode to activate
     * @param allianceColor
     */
    public CloseBlue(OpModeType opModeType, AllianceColor allianceColor) {
        super(opModeType, allianceColor);
    }

    @Override
    public void onInit() {

    }

    @Override
    public void onPlay() {

    }

    @Override
    public void onPlayLoop() {
    }

    @Override
    public void onEnd() {

    }
}

