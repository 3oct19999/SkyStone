package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class MyRobot {

    DcMotor left;
    DcMotor right;
    Servo arm;
    Servo claw;

    HardwareMap hMap;
    ElapsedTime period = new ElapsedTime();

    public static final double MID_SERVO = 0.5;


    public MyRobot(){

    }


    public void init(HardwareMap ahwMap){
        hMap = ahwMap;

        left = hMap.get(DcMotor.class, "leftMotor");
        right = hMap.get(DcMotor.class, "rightMotor");
        arm = hMap.get(Servo.class, "armServo");
        claw = hMap.get(Servo.class, "c");


        left.setPower(0);
        right.setPower(0);
        arm.setPosition(MID_SERVO);

        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
