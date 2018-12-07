package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Logan Yates on 10/13/2018.
 */

//This is the Autonomous code we will use if we start closest to a crater.
@Autonomous
public class TaurusAuton extends LinearOpMode{

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
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(1);
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(-.5);
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();

        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(1);
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        //drop mech
        robot.dropServo.setPosition(180);
        robot.dropServo.setPosition(0);

        //crater
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(-.5);
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(1);
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(1);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 2.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);

    }

}
