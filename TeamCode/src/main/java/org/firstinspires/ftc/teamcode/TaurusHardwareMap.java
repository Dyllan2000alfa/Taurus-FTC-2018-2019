package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Dyllan on 9/13/2018.
 */

public class TaurusHardwareMap {

    DcMotor rightFrontMotor, leftFrontMotor, rightBackMotor, leftBackMotor, armMotor;
    float leftside, rightside;

    public void init(HardwareMap hwMap) {

        rightFrontMotor = hwMap.dcMotor.get("rf");
        leftFrontMotor = hwMap.dcMotor.get("lf");
        rightBackMotor = hwMap.dcMotor.get("rb");
        leftBackMotor = hwMap.dcMotor.get("lb");
        armMotor = hwMap.dcMotor.get("am");

        leftFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);
        
    }

    public void driveControls() {

        rightFrontMotor.setPower(rightside);
        leftFrontMotor.setPower(leftside);
        rightBackMotor.setPower(rightside);
        leftBackMotor.setPower(leftside);

    }

    public void stopMotors() {

        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);

    }

}