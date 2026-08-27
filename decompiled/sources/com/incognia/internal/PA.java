package com.incognia.internal;

import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;

/* JADX INFO: loaded from: classes2.dex */
public final class PA {
    public PA(KWh kWh) {
    }

    public final long BGx(CellInfo cellInfo) {
        return (System.currentTimeMillis() + (XUh.BGx(XUh.BGx, 30, 0, 2) ? cellInfo.getTimestampMillis() : cellInfo.getTimeStamp() / 1000000)) - SystemClock.elapsedRealtime();
    }

    public final phu mbG(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
            NL nl = NL.BGx;
            int cid = cellIdentity.getCid();
            int lac = cellIdentity.getLac();
            int dbm = cellSignalStrength.getDbm();
            long jBGx = BGx(cellInfoGsm);
            XUh xUh = XUh.BGx;
            return new phu(nl, cid, lac, dbm, jBGx, XUh.BGx(xUh, 28, 0, 2) ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), XUh.BGx(xUh, 28, 0, 2) ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()));
        }
        if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity2 = cellInfoLte.getCellIdentity();
            CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
            kj kjVar = kj.BGx;
            int ci = cellIdentity2.getCi();
            int tac = cellIdentity2.getTac();
            int dbm2 = cellSignalStrength2.getDbm();
            long jBGx2 = BGx(cellInfoLte);
            XUh xUh2 = XUh.BGx;
            return new phu(kjVar, ci, tac, dbm2, jBGx2, XUh.BGx(xUh2, 28, 0, 2) ? cellIdentity2.getMccString() : String.valueOf(cellIdentity2.getMcc()), XUh.BGx(xUh2, 28, 0, 2) ? cellIdentity2.getMncString() : String.valueOf(cellIdentity2.getMnc()));
        }
        if (!(cellInfo instanceof CellInfoWcdma)) {
            return null;
        }
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
        UW uw = UW.BGx;
        int cid2 = cellIdentity3.getCid();
        int lac2 = cellIdentity3.getLac();
        int dbm3 = cellSignalStrength3.getDbm();
        long jBGx3 = BGx(cellInfoWcdma);
        XUh xUh3 = XUh.BGx;
        return new phu(uw, cid2, lac2, dbm3, jBGx3, XUh.BGx(xUh3, 28, 0, 2) ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), XUh.BGx(xUh3, 28, 0, 2) ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()));
    }
}
