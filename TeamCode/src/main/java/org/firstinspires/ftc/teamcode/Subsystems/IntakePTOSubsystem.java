package org.firstinspires.ftc.teamcode.Subsystems;

import com.seattlesolvers.solverslib.command.Command;

import org.firstinspires.ftc.teamcode.Libraries.CuttlefishFTCBridge.src.utils.Direction;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Subsystems.Servo.ServoSubsystem;
import org.firstinspires.ftc.teamcode.MMRobot;

public class IntakePTOSubsystem extends ServoSubsystem {

   public static double PTOon = 0.95;
    public static double PTOoff = 0.0;

    public static IntakePTOSubsystem instance;

    public static synchronized IntakePTOSubsystem getInstance() {
        if (instance == null) {
            instance = new IntakePTOSubsystem("IntakePTOSubsystem");
        }

        return instance;
    }

    public IntakePTOSubsystem(String subsystemName) {
        super(subsystemName);
        MMRobot mmRobot = MMRobot.getInstance();

        ///port 1
        withServo(MMRobot.getInstance().servoHub, 1, Direction.FORWARD, 0);
    }

    public Command PTOonCommand (){
        return setPositionCommand(PTOon);
    }

    public Command PTOoffCommand(){
        return setPositionCommand(PTOoff);
    }




}
