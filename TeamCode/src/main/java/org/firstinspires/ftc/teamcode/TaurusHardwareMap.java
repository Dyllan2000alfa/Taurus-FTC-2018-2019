package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Dyllan Tinoco on 9/13/2018.
 * Edited by Logan Yates on 11/28/18
 */

public class TaurusHardwareMap {

    DcMotor rightFrontMotor, leftFrontMotor, rightBackMotor, leftBackMotor, armMotor, leftIntakeMotor, rightIntakeMotor;

    public void init(HardwareMap hwMap) {

        rightFrontMotor = hwMap.dcMotor.get("rf");
        leftFrontMotor = hwMap.dcMotor.get("lf");
        rightBackMotor = hwMap.dcMotor.get("rb");
        leftBackMotor = hwMap.dcMotor.get("lb");
        armMotor = hwMap.dcMotor.get("am");
        leftIntakeMotor = hwMap.dcMotor.get("li");
        rightIntakeMotor = hwMap.dcMotor.get("ri");

        leftFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftIntakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);
        leftIntakeMotor.setPower(0);
        rightIntakeMotor.setPower(0);
        
    }

    public void stopMotors() {

        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);
        leftIntakeMotor.setPower(0);
        rightIntakeMotor.setPower(0);

    }

}