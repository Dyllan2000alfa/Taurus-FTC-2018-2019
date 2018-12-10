package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Dyllan Tinoco on 10/18/2018.
 */

//This is a test program used for operating the robot with a single controller.

//Specify OpMode and Name.
@TeleOp(name="Taurus Teleop (1 Controller)")
public class TaurusTeleTest extends OpMode{

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
        robot.armPower = gamepad1.left_trigger - gamepad1.right_trigger;

        //Run driveControls() function from hardware map. Contains code for moving motors.
        robot.driveControls();

        //Telemetry data. Displays the power that each variable involved in motors is set too.
        telemetry.addData("Right Power", robot.rightPower);
        telemetry.addData("Left Power", robot.leftPower);
        telemetry.addLine();
        telemetry.addData("Arm Power", robot.armPower);
        telemetry.update();
    }

    //Stop loop and run robot.stopMotors() to make sure no motors keep running.
    @Override
    public void stop(){

        robot.stopMotors();
    }

}
