package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 9/7/2018.
 */
@Disabled
@TeleOp(name="Teleop")
public class SampleTankDrive extends OpMode{

    SampleHardwareMap robot = new SampleHardwareMap();

    @Override
    public void init(){

        robot.init(hardwareMap);
    }
    @Override
    public void loop(){

        robot.rightMotor.setPower(gamepad1.right_stick_y);
        robot.leftMotor.setPower(gamepad1.left_stick_y);

    }

    @Override
    public void stop(){
    }

}
