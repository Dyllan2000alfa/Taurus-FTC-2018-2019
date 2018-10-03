package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Dyllan on 9/13/2018.
 */

public class SampleHardwareMap {

    DcMotor rightMotor, leftMotor;

    public void init(HardwareMap hwMap) {

        rightMotor = hwMap.dcMotor.get("rf");
        leftMotor = hwMap.dcMotor.get("lf");
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightMotor.setPower(0);
        leftMotor.setPower(0);
    }

}