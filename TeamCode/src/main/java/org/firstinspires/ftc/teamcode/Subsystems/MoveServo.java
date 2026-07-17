package org.firstinspires.ftc.teamcode.Subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.seattlesolvers.solverslib.command.Command;

import org.firstinspires.ftc.teamcode.Libraries.CuttlefishFTCBridge.src.utils.Direction;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Subsystems.Servo.ServoSubsystem;
import org.firstinspires.ftc.teamcode.MMRobot;

import Ori.Coval.Logging.AutoLog;

@Config
@AutoLog
public class MoveServo extends ServoSubsystem {

    public static double open = 0.95;
    public static double close = 0.00;

    public static MoveServo instance;

    public static synchronized MoveServo getInstance() {
        if (instance == null) {
            instance = new MoveServo("Moveservo");
        }

        return instance;
    }

    public MoveServo(String subsystemName) {
        super(subsystemName);

        //Port 1
        withServo(MMRobot.getInstance().servoHub, 1, Direction.FORWARD, 0);

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

