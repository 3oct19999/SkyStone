package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Pushbot: Teleop POV", group="Pushbot")
public class op extends LinearOpMode {

    MyRobot theRobot = new MyRobot();

    @Override
    public void runOpMode(){
        theRobot.init(hardwareMap);

        telemetry.addLine("Ready to start");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){


        }
    }

}
