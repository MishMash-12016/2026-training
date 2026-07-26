package org.firstinspires.ftc.teamcode.OpModes.Tele;

import com.pedropathing.geometry.Pose;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.command.WaitCommand;
import com.seattlesolvers.solverslib.command.button.Trigger;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.CommandGroups.IntakeCommandGroup;
import org.firstinspires.ftc.teamcode.CommandGroups.ShootCommandGroup;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMDrivetrain;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMOpMode;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.MMUtils;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.AllianceColor;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.OpModeType;
import org.firstinspires.ftc.teamcode.MMRobot;

public class MainTeleOp extends MMOpMode {

    /**
     * use this to choose a {@link OpModeType.NonCompetition NonComp} opmode.
     *
     * @param opModeType    which opmode to activate
     * @param allianceColor
     */
    public MainTeleOp(OpModeType opModeType, AllianceColor allianceColor) {
        super(opModeType, allianceColor);
    }

    @Override
    public void onInit() {

    }

    @Override
    public void onPlayLoop() {

    }
}
