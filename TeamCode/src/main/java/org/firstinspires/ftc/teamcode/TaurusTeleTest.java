package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 10/18/2018.
 */

//This is a test program used for operating the robot with a single controller
@TeleOp(name="TaurusTeleopTest")
public class TaurusTeleTest extends OpMode{

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

        robot.armMotor.setPower(gamepad1.right_trigger);
        robot.armMotor.setPower(-gamepad1.left_trigger);

    }

    @Override
    public void stop(){
    }

}
