package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Dyllan Tinoco on 9/13/2018.
 */

public class TaurusHardwareMap {

    //Defines motors and servos so they can be used in the hardware map.
    DcMotor rightFrontMotor, leftFrontMotor, rightBackMotor, leftBackMotor, armMotor;
    Servo dropServo, rightIntakeServo, leftIntakeServo;

    public void init(HardwareMap hwMap) {

        //Defines each individual motor and servo so they can be used in TeleOp and Auton.
        rightFrontMotor = hwMap.dcMotor.get("rf");
        leftFrontMotor = hwMap.dcMotor.get("lf");
        rightBackMotor = hwMap.dcMotor.get("rb");
        leftBackMotor = hwMap.dcMotor.get("lb");
        armMotor = hwMap.dcMotor.get("am");

        rightIntakeServo = hwMap.servo.get("ri");
        leftIntakeServo = hwMap.servo.get("li");
        dropServo = hwMap.servo.get("ds");

        //Reverses direction of certain motors so they don't go in the opposite direction.
        leftFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        //Sets power of motors to 0 so we are sure nothing is moving upon initialization.
        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);

    }

    public void stopMotors() {

        //Makes sure all motors have no power when the robot finishes the code.
        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);

    }

}