package org.firstinspires.ftc.teamcode.teleop;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


@TeleOp(name = "golfBot123")
public class golfBot extends OpMode {
    DcMotor drive1;
    DcMotor drive2;
    DcMotor golf_arm;


    public void init() {
        drive1 = hardwareMap.dcMotor.get("motor_1");
        drive2 = hardwareMap.dcMotor.get("motor_2");
        golf_arm = hardwareMap.dcMotor.get("golf_arm");
    }


    public void loop() {
        drive1.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
        drive2.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);


        golf_arm.setPower((gamepad1.right_trigger - gamepad1.left_trigger) / 2);
    }
}
