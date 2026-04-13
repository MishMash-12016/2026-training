package org.firstinspires.ftc.teamcode.Subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.seattlesolvers.solverslib.command.Command;

import org.firstinspires.ftc.teamcode.Libraries.CuttlefishFTCBridge.src.utils.Direction;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Subsystems.Servo.ServoSubsystem;
import org.firstinspires.ftc.teamcode.MMRobot;

import Ori.Coval.Logging.AutoLog;

@Config
@AutoLog
public class ClawSubsystem extends ServoSubsystem {

    public static double open = 0.95;
    public static double close = 0.00;

    public static ClawSubsystem instance;

    public static synchronized ClawSubsystem getInstance() {
        if (instance == null) {
            instance = new ClawsubsystemAutoLogged("Clawsubsystem");
        }

        return instance;
    }

    public ClawSubsystem(String subsystemName) {
        super(subsystemName);

        //Port 1
        withServo(MMRobot.getInstance().expansionHub, 1, Direction.FORWARD, 0);
    }

    public Command clawOpenCommand() {

        return setPositionCommand(open);
    }

    public Command clawCloseCommand() {

        return setPositionCommand(close);
    }

    @Override
    public void reset() {
        instance = null;
    }

}

