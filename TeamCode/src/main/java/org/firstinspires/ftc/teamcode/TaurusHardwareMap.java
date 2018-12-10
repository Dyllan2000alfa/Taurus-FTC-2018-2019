package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Dyllan on 9/13/2018.
 */

//Hardware map used by all codes for Taurus FTC 11025.

//Declare public class
public class TaurusHardwareMap {

    //Add all motors and variables used by any program.
    DcMotor rightFrontMotor, leftFrontMotor, rightBackMotor, leftBackMotor, armMotor;
    Servo dropServo;
    double leftPower = 0, rightPower = 0, armPower = 0, speed = 1;

    //Specify what to run when initializing hardware map.
    public void init(HardwareMap hwMap) {

        //Specify names of all motors as seen by phones.
        rightFrontMotor = hwMap.dcMotor.get("rf");
        leftFrontMotor = hwMap.dcMotor.get("lf");
        rightBackMotor = hwMap.dcMotor.get("rb");
        leftBackMotor = hwMap.dcMotor.get("lb");
        armMotor = hwMap.dcMotor.get("am");
        dropServo = hwMap.servo.get("ds");

        //Set motors to reverse so all motors turn the same direction.
        rightFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        //Ensure all motors are set to zero power.
        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);
    }

    //Function in charge of moving motors in TeleOp.
    public void driveControls() {

        rightFrontMotor.setPower(rightPower);
        leftFrontMotor.setPower(leftPower);
        rightBackMotor.setPower(rightPower);
        leftBackMotor.setPower(leftPower);

        armMotor.setPower(armPower);
    }

    //Function to move robot forward at set speed.
    public void moveForward() {

        rightFrontMotor.setPower(-speed);
        leftFrontMotor.setPower(-speed);
        rightBackMotor.setPower(-speed);
        leftBackMotor.setPower(-speed);
    }

    //Function to move robot backward at set  speed.
    public void moveBackward() {

        rightFrontMotor.setPower(speed);
        leftFrontMotor.setPower(speed);
        rightBackMotor.setPower(speed);
        leftBackMotor.setPower(speed);
    }

    //Function to turn robot right at set speed
    public void turnRight() {

        rightFrontMotor.setPower(speed);
        leftFrontMotor.setPower(-speed);
        rightBackMotor.setPower(speed);
        leftBackMotor.setPower(-speed);
    }

    //Function to turn robot left at set speed
    public void turnLeft() {

        rightFrontMotor.setPower(-speed);
        leftFrontMotor.setPower(speed);
        rightBackMotor.setPower(-speed);
        leftBackMotor.setPower(speed);
    }

    //Function to move arm up at set speed
    public void armUp() {

        armMotor.setPower(speed);
    }

    //Function to move arm down at set speed
    public void armDown() {

        armMotor.setPower(-speed);
    }

    //Function to stop all motors
    public void stopMotors() {

        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);
    }

}