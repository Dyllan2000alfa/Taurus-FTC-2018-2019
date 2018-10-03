package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class SampleAuton extends LinearOpMode{

    SampleHardwareMap robot = new SampleHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode(){

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        waitForStart();


        robot.rightMotor.setPower(.5);
        robot.leftMotor.setPower(.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        sleep(1000);

        robot.rightMotor.setPower(-.5);
        robot.leftMotor.setPower(.5);
        while (opModeIsActive() && (runtime.seconds() < 2.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }

}
