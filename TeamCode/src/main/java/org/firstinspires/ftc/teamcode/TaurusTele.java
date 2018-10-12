package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
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

        robot.init(hardwareMap);
    }

    @Override
    public void loop(){

        rightside = gamepad1.right_stick_y;
        leftside = gamepad1.left_stick_y;

        robot.driveControls();

    }

    @Override
    public void stop(){
    }

}
