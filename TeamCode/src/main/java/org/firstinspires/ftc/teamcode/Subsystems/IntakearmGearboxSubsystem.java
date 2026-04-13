package org.firstinspires.ftc.teamcode.Subsystems;

import com.seattlesolvers.solverslib.command.Command;

import org.firstinspires.ftc.teamcode.Libraries.CuttlefishFTCBridge.src.utils.Direction;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Subsystems.Servo.ServoSubsystem;
import org.firstinspires.ftc.teamcode.MMRobot;

public class IntakearmGearboxSubsystem extends ServoSubsystem {

//TO DO:
// change Generic Value
    public static double IntakePos = 0.75;
    public static double TransferPos = 0.55;

    public static IntakearmGearboxSubsystem instance;

    public static synchronized IntakearmGearboxSubsystem getInstance() {
        if (instance == null) {
            instance = new IntakearmGearboxSubsystem("IntakearmGearboxSubsystem");
        }

        return instance;
    }
    public IntakearmGearboxSubsystem(String subsystemName) {
        super(subsystemName);

        withServo(MMRobot.getInstance().servoHub, 1, Direction.FORWARD,0);
        withServo(MMRobot.getInstance().servoHub, 2, Direction.FORWARD,0);
    }

    public Command IntakePosCommand(){
        return setPositionCommand(IntakePos);
    }

    public Command TransferPosCommand(){
        return setPositionCommand(TransferPos);
    }

}
