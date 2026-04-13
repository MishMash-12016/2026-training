package org.firstinspires.ftc.teamcode.OpModes.Tele.Test;

import Ori.Coval.Logging.AutoLog;

import com.acmerobotics.dashboard.config.Config;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.CommandGroups.CheackTicksCommandGroup;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMOpMode;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.AllianceColor;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.OpModeType;
import org.firstinspires.ftc.teamcode.MMRobot;
import org.firstinspires.ftc.teamcode.Subsystems.MoveMotorSubsystem;

@AutoLog
@Config
public class CheckTicksTele extends MMOpMode {

    public CheckTicksTele() {
        super(OpModeType.NonCompetition.DEBUG, AllianceColor.RED);
    }

    @Override
    public void onInit() {
        MMRobot.getInstance().gamepadEx1.getGamepadButton(GamepadKeys.Button.A).whenPressed(CheackTicksCommandGroup.runMotorCommand());
    }

    @Override
    public void onPlay() {
    }

    @Override
    public void onPlayLoop() {
        // Calculate ticks from pose (rotations * resolution)
        double ticks = MoveMotorSubsystem.getInstance().getPose() * MoveMotorSubsystem.RESOLUTION;

        // Use normal telemetry to show the ticks
        telemetry.addData("Motor Encoder Ticks", ticks);
        telemetry.update();
    }

    @Override
    public void onEnd() {
    }
}
