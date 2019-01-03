package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Dyllan Tinoco on 9/13/2018.
 */

public class TaurusHardwareMap {

<<<<<<< HEAD
    //Add all motors and variables used by any program.
    DcMotor rightMotor, leftMotor, linearMotion;
    Servo dropServo;
    double leftPower = 0, rightPower = 0, linearPower = 0, speed = 1;
=======
    //Defines motors and servos so they can be used in the hardware map.
    DcMotor rightFrontMotor, leftFrontMotor, rightBackMotor, leftBackMotor, armMotor;
    Servo dropServo, rightIntakeServo, leftIntakeServo;
>>>>>>> parent of 109976a... Added Autons and updated ftc app

    public void init(HardwareMap hwMap) {

<<<<<<< HEAD
        //Specify names of all motors as seen by phones.
        rightMotor = hwMap.dcMotor.get("rm");
        leftMotor = hwMap.dcMotor.get("lm");
        linearMotion = hwMap.dcMotor.get("li");

        dropServo = hwMap.servo.get("ds");

        //Set motors to reverse so all motors turn the same direction.
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        //Ensure all motors are set to zero power.
        rightMotor.setPower(0);
        leftMotor.setPower(0);
        linearMotion.setPower(0);
    }

    //Function in charge of moving motors in TeleOp.
    public void driveControls() {

        rightMotor.setPower(rightPower);
        leftMotor.setPower(leftPower);
    }

    //Function to move robot forward at set speed.
    public void moveForward() {

        rightMotor.setPower(speed);
        leftMotor.setPower(speed);
    }

    //Function to move robot backward at set  speed.
    public void moveBackward() {

        rightMotor.setPower(-speed);
        leftMotor.setPower(-speed);
    }

    //Function to turn robot right at set speed
    public void turnRight() {

        rightMotor.setPower(-speed);
        leftMotor.setPower(speed);
    }

    //Function to turn robot left at set speed
    public void turnLeft() {

        rightMotor.setPower(speed);
        leftMotor.setPower(-speed);
=======
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

>>>>>>> parent of 109976a... Added Autons and updated ftc app
    }

    public void stopMotors() {

<<<<<<< HEAD
        rightMotor.setPower(0);
        leftMotor.setPower(0);
        linearMotion.setPower(0);
=======
        //Makes sure all motors have no power when the robot finishes the code.
        rightFrontMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        leftBackMotor.setPower(0);
        armMotor.setPower(0);

>>>>>>> parent of 109976a... Added Autons and updated ftc app
    }

}