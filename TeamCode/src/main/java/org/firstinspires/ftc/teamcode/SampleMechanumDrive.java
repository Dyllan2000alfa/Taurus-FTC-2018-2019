package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Dyllan Tinoco on 9/12/2018.
 */

//Classify program as Teleop
@TeleOp(name="Mechanium")
public class SampleMechanumDrive extends OpMode{

//Initialize motors and map them to motors on controller
    DcMotor rightMotor, leftMotor, BackrightMotor, BackleftMotor;

    public void init(HardwareMap hwMap) {

        rightMotor = hwMap.dcMotor.get("rf");
        leftMotor = hwMap.dcMotor.get("lf");
        BackrightMotor = hwMap.dcMotor.get("rb");
        BackleftMotor = hwMap.dcMotor.get("lb");
    }

//Declare Vairiables for speed control
    float speed1;
    float speed2;

    @Override
    public void init(){

        init(hardwareMap);
    }

    @Override
    public void loop(){
//Set speed to out put of controller
        speed1 = gamepad1.right_stick_y;
        speed2 = gamepad1.left_stick_y;

//Override movement and go left if left trigger is pressed
        if (gamepad1.left_trigger > .5) {

            rightMotor.setPower(-1);
            BackrightMotor.setPower(1);
            leftMotor.setPower(1);
            BackleftMotor.setPower(-1);
        }

//Override movement and go left if left trigger is pressed
        else if (gamepad1.right_trigger > .5) {

            rightMotor.setPower(1);
            BackrightMotor.setPower(-1);
            leftMotor.setPower(-1);
            BackleftMotor.setPower(1);
        }

//If movement is not being overridden then follow speed controls
        else {

            rightMotor.setPower(speed2);
            BackrightMotor.setPower(speed2);
            leftMotor.setPower(speed1);
            BackleftMotor.setPower(speed1);
        }
    }

//Stop everything if stop button is pressed
    @Override
    public void stop(){
    }

}
