package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Logan Yates on 12/5/2018.
 */

//This is the Autonomous code we will use if we start closest to a corner.
@Autonomous
public class TaurusAuton2 extends LinearOpMode {

    TaurusHardwareMap robot = new TaurusHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode(){

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        //dropdown

        //drive
        robot.rightFrontMotor.setPower(-1);
        robot.rightBackMotor.setPower(-1);
        robot.leftFrontMotor.setPower(-1);
        robot.leftBackMotor.setPower(-1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        sleep(1000);

        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        sleep(1000);

        //color sensor/push cube

        //drop mech
        robot.dropServo.setPosition(180);
        robot.dropServo.setPosition(0);

        //crater//
        while (opModeIsActive() && (runtime.seconds() < 27.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(1);
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(1);

        robot.stopMotors();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);

    }

}
