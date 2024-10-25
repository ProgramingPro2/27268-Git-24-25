package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Auto_Bot")
public class Auto_Bot extends LinearOpMode {
    private DcMotor FR;
    private DcMotor FL;

    public void runOpMode() {
        FR = hardwareMap.get(DcMotor.class, "FR");
        FL = hardwareMap.get(DcMotor.class, "FL");

        waitForStart();

        while(opModeIsActive()) {
            // Turn left for 1 second
            FR.setPower(-1);
            FL.setPower(1);
            sleep(1000);
            // Move forward for 2 seconds
            FR.setPower(1);
            FL.setPower(1);
            sleep(2000);
            // Turn right for 1 second
            FR.setPower(1);
            FL.setPower(-1);
            sleep(1000);
        }
    }
}
