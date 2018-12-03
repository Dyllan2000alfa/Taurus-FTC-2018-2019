package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * Created by Dyllan Tinoco on 9/7/2018.
 */

@TeleOp(name="TaurusTeleop")
public class TaurusTele extends OpMode{

    TaurusHardwareMap robot = new TaurusHardwareMap();

    float leftside, rightside;

    @Override
    public void init(){

        robot.init(hardwareMap);
    }

    @Override
    public void loop(){

        rightside = gamepad1.right_stick_y;
        leftside = gamepad1.left_stick_y;

        robot.rightFrontMotor.setPower(rightside);
        robot.leftFrontMotor.setPower(leftside);
        robot.rightBackMotor.setPower(rightside);
        robot.leftBackMotor.setPower(leftside);

        robot.armMotor.setPower(gamepad2.left_stick_y);
        robot.intakeMotor.setPower(gamepad2.right_stick_y);

    }

    @Override
    public void stop(){
    }

}
