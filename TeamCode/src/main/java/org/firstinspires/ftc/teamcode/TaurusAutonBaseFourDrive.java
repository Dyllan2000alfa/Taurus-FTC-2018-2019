package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class TaurusAutonBaseFourDrive extends LinearOpMode{
    TaurusHardwareMap robot = new TaurusHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode(){

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        robot.speed = 0.25;

        robot.moveBackward();
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 5.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();
        sleep(1000);

        robot.dropServo.setPosition(0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        robot.stopMotors();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }

}
