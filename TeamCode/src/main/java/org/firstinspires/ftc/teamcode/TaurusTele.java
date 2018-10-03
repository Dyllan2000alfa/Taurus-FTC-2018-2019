package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 9/7/2018.
 */

@TeleOp(name="TaurusTeleop")
public class TaurusTele extends OpMode{

    TaurusHardwareMap robot = new TaurusHardwareMap();

    @Override
    public void init(){

        robot.init(hardwareMap);
    }

    float leftside;
    float rightside;

    @Override
    public void loop(){

        leftside = gamepad1.right_stick_y;
        rightside = gamepad1.left_stick_y;

        robot.rightFrontMotor.setPower(rightside);
        robot.leftFrontMotor.setPower(leftside);
        robot.rightBackMotor.setPower(rightside);
        robot.leftBackMotor.setPower(leftside);

    }

    @Override
    public void stop(){
    }

}
