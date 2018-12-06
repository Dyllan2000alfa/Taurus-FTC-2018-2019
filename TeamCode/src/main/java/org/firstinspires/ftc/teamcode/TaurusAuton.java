package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Logan Yates on 10/13/2018.
 */

//This is the Autonomous code we will use if we start in the blue corner closest to the crater.
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
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        robot.rightFrontMotor.setPower(-1);
        robot.rightBackMotor.setPower(-1);
        robot.leftFrontMotor.setPower(-1);
        robot.leftBackMotor.setPower(-1);
        //color sensor/push cube

        //drop mech
        robot.dropServo.setPosition(180);
        robot.dropServo.setPosition(0);

        //crater//

        robot.stopMotors();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);

    }

}
