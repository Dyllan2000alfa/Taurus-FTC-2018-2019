package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * Created by Dyllan Tinoco on 9/7/2018.
 */

//This is the main TeleOp program for Taurus FTC 11025.

//Specify OpMode and Name.
@TeleOp(name="Taurus Teleop (2 Controller)")
public class TaurusTele extends OpMode{

    //Specify hardware map file.
    TaurusHardwareMap robot = new TaurusHardwareMap();

    //Initialize HardwareMap.
    @Override
    public void init(){

        robot.init(hardwareMap);
    }

    //Loop code until stop is pressed.
    @Override
    public void loop(){
        //Mapping of controller to motor variables.
        robot.rightPower = gamepad1.right_stick_y;
        robot.leftPower = gamepad1.left_stick_y;
        robot.linearPower = gamepad2.left_stick_y;

        //Run driveControls() function from hardware map. Contains code for moving motors.
        robot.driveControls();

        //Telemetry data. Displays the power that each variable involved in motors is set too.
        telemetry.addData("Right Power", robot.rightPower);
        telemetry.addData("Left Power", robot.leftPower);
        telemetry.addData("Linear Power", robot.linearPower);
        telemetry.addLine();
        telemetry.update();
    }

    //Stop loop and run robot.stopMotors() to make sure no motors keep running.
    @Override
    public void stop(){

        robot.stopMotors();
    }

}
