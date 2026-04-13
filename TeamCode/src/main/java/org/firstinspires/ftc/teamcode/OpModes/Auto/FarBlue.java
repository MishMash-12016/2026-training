package org.firstinspires.ftc.teamcode.OpModes.Auto;

import Ori.Coval.Logging.AutoLog;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Libraries.MMLib.MMOpMode;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.AllianceColor;
import org.firstinspires.ftc.teamcode.Libraries.MMLib.Utils.OpModeVariables.OpModeType;

@AutoLog
@Autonomous
public class FarBlue extends MMOpMode {

    /**
     * use this to choose a {@link OpModeType.NonCompetition NonComp} opmode.
     *
     * @param opModeType    which opmode to activate
     * @param allianceColor
     */
    public FarBlue(OpModeType opModeType, AllianceColor allianceColor) {
        super(opModeType, allianceColor);
    }

    @Override
    public void onInit() {

    }

    @Override
    public void onPlayLoop() {
    }

    @Override
    public void onEnd() {
    }
}