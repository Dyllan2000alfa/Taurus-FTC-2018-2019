package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 9/7/2018.
 */

@TeleOp(name="TaurusTeleop")
public class TaurusTele extends OpMode{

    TaurusHardwareMap robot = new TaurusHardwareMap();

    float leftside, rightside;

    @Override
    public void init(){

        //Calls the hardwareMap method.
        robot.init(hardwareMap);
    }

    @Override
    public void loop(){

        //Assigns motors to gamepad controls.

        //Drive controls.
        rightside = gamepad1.right_stick_y;
        leftside = gamepad1.left_stick_y;

        robot.rightFrontMotor.setPower(rightside);
        robot.leftFrontMotor.setPower(leftside);
        robot.rightBackMotor.setPower(rightside);
        robot.leftBackMotor.setPower(leftside);

        //Operator controls.
        robot.armMotor.setPower(gamepad2.left_stick_y);
        robot.rightIntakeServo.setPosition(gamepad2.right_stick_y);
        robot.leftIntakeServo.setPosition(-gamepad2.right_stick_y);

    }

    //Stops robot.
    @Override
    public void stop(){
    }

}
