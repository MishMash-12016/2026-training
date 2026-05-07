package org.firstinspires.ftc.teamcode.OpModes.Tele.Test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Servo UwU")
public class servoblyaat extends LinearOpMode {

    private Servo servofrst;
    private Servo servoscnd;

    public void runOpMode() {
        servofrst = hardwareMap.get(Servo.class, "left_servo");
        servoscnd = hardwareMap.get(Servo.class, "right_servo");
        waitForStart();
        while (opModeIsActive()) {
            double targetPosition = 0.67;
            servofrst.setPosition(targetPosition);
            servoscnd.setPosition(targetPosition);

            telemetry.addData("Servo Pos daddy", targetPosition);
            telemetry.update();
        }
    }
}