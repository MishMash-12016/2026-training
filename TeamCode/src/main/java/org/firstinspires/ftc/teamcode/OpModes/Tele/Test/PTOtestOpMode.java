package org.firstinspires.ftc.teamcode.OpModes.Tele.Test;

import com.acmerobotics.dashboard.config.Config;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMOpMode;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.AllianceColor;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.OpModeType;
import org.firstinspires.ftc.teamcode.MMRobot;
import org.firstinspires.ftc.teamcode.Subsystems.IntakePTOSubsystem;

import Ori.Coval.Logging.AutoLog;

    @AutoLog
    @Config
    public class PTOtestOpMode extends MMOpMode {

        public PTOtestOpMode() {
            super(OpModeType.NonCompetition.DEBUG, AllianceColor.RED);
        }

        @Override
        public void onInit() {


            MMRobot.getInstance().gamepadEx1.getGamepadButton(GamepadKeys.Button.A).whenPressed(
                    IntakePTOSubsystem.getInstance().PTOonCommand()
            );

            MMRobot.getInstance().gamepadEx1.getGamepadButton(GamepadKeys.Button.DPAD_DOWN).whenPressed(
                    IntakePTOSubsystem.getInstance().PTOoffCommand()
            );

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


