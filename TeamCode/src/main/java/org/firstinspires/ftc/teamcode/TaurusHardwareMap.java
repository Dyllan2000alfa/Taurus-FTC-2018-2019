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
    DcMotor rightMotor, leftMotor, winchMotor;
    Servo dropServo;
    double leftPower = 0, rightPower = 0, winchPower = 0, speed = 1;
    boolean direction = false, toggleReady = false, G1b;

    //Specify what to run when initializing hardware map.
    public void init(HardwareMap hwMap) {

        //Specify names of all motors as seen by phones.
        rightMotor = hwMap.dcMotor.get("rm");
        leftMotor = hwMap.dcMotor.get("lm");
        winchMotor = hwMap.dcMotor.get("wm");
        dropServo = hwMap.servo.get("ds");

        //Set motors to reverse so all motors turn the same direction.
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        //Ensure all motors are set to zero power.
        rightMotor.setPower(0);
        leftMotor.setPower(0);
        winchMotor.setPower(0);
    }

    //Function in charge of moving motors in TeleOp.
    public void driveControls() {

        rightMotor.setPower(leftPower);
        leftMotor.setPower(rightPower);

        winchMotor.setPower(winchPower);
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
    }

    //Function to move arm up at quarter speed
    public void liftUp() {

        winchMotor.setPower(.25);
    }

    //Function to move arm down at quarter speed
    public void liftDown() {

        winchMotor.setPower(-.25);
    }

    //Function to stop all motors
    public void stopMotors() {

        rightMotor.setPower(0);
        leftMotor.setPower(0);
        winchMotor.setPower(0);
        dropServo.setPosition(1);
    }

}