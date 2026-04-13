package org.firstinspires.ftc.teamcode.Subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.seattlesolvers.solverslib.command.Command;

import org.firstinspires.ftc.teamcode.Libraries.CuttlefishFTCBridge.src.utils.Direction;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Subsystems.Motor.Base.PidBaseSubsystem;
import org.firstinspires.ftc.teamcode.MMRobot;

import java.util.function.DoubleSupplier;

import Ori.Coval.Logging.AutoLog;

@AutoLog
@Config

public abstract class MoveMotorSubsystem extends PidBaseSubsystem {

    public static MoveMotorSubsystem instance;
    public static double RESOLUTION = 28.0 / (29.0 / 33.0);

    public static synchronized MoveMotorSubsystem getInstance() {
        if (instance == null) {
            instance = new MoveMotorSubsystem("Movemotorsubsystem") {

            };
        }
        return instance;
    }

    public MoveMotorSubsystem(String subsystemName) {
        super(subsystemName);

        withMotor(MMRobot.getInstance().controlHub, 0, Direction.FORWARD);
        withEncoder(MMRobot.getInstance().expansionHub, 0, RESOLUTION, Direction.REVERSE);
    }

    public Command getToAndHoldSetPointCommand(DoubleSupplier setPoint) {
        return null;
    }

    @Override
    public void reset() {
        instance = null;
    }

}

