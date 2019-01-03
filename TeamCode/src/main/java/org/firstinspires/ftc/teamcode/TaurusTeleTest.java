package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 10/18/2018.
 */

//This is a test program used for operating the robot with a single controller.
@TeleOp(name="TaurusTeleopTest")
public class TaurusTeleTest extends OpMode{

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

    }

    //Stops robot.
    @Override
    public void stop(){
    }

}
