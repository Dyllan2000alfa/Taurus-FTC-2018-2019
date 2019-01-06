package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Logan Yates on 12/5/18.
 */

@Autonomous
public class TaurusAutonCrater extends LinearOpMode{

    TaurusHardwareMap robot = new TaurusHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode(){

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        robot.liftUp();
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 9.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.moveForward();
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.liftDown();
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 9.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.moveForward();
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 3.5)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }

}
