package com.huawei.hms.support.api.location.common;

import android.net.wifi.ScanResult;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import com.huawei.hms.support.api.entity.location.offlinelocation.HwCellInfo;
import com.huawei.hms.support.api.entity.location.offlinelocation.HwWifiInfo;
import com.huawei.location.lite.common.util.ReflectionUtils;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineLocationUtil {
    private static final int RAT_GSM = 1;
    private static final int RAT_LTE = 3;
    private static final int RAT_NR = 4;
    private static final int RAT_WCDMA = 2;
    private static final String TAG = "OfflineLocationUtil";
    private static AtomicBoolean isHasCellInfoNr;

    private static HwCellInfo parseCellInfo(CellInfo cellInfo) {
        HwCellInfo hwCellInfo = new HwCellInfo();
        if (cellInfo instanceof CellInfoGsm) {
            parseCellInfoGsm((CellInfoGsm) cellInfo, hwCellInfo);
        } else if (cellInfo instanceof CellInfoWcdma) {
            parseCellInfoWcdma((CellInfoWcdma) cellInfo, hwCellInfo);
        } else if (cellInfo instanceof CellInfoLte) {
            parseCellInfoLte((CellInfoLte) cellInfo, hwCellInfo);
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "parseCellInfo fail");
                return null;
            }
            if (isHasCellInfoNr == null) {
                isHasCellInfoNr = new AtomicBoolean(ReflectionUtils.getClass("android.telephony.CellInfoNr") != null);
            }
            if (isHasCellInfoNr.get() && MapboxMap$$ExternalSyntheticLambda0.m$1(cellInfo)) {
                parseCellInfoNr(MapboxMap$$ExternalSyntheticLambda0.m4697m((Object) cellInfo), hwCellInfo);
            }
        }
        hwCellInfo.setTimeStamp(cellInfo.getTimeStamp());
        hwCellInfo.setRegistered(cellInfo.isRegistered());
        return hwCellInfo;
    }

    public static List<HwCellInfo> transformCellInfo(List<CellInfo> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CellInfo> it = list.iterator();
        while (it.hasNext()) {
            HwCellInfo cellInfo = parseCellInfo(it.next());
            if (cellInfo != null) {
                arrayList.add(cellInfo);
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "transformCellInfo end,size is:" + arrayList.size());
        return arrayList;
    }

    public static List<HwWifiInfo> transformWifiInfo(List<ScanResult> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult scanResult : list) {
            HwWifiInfo hwWifiInfo = new HwWifiInfo();
            try {
                hwWifiInfo.setBssid(scanResult.BSSID);
            } catch (NumberFormatException unused) {
                WrappedCompositionsetContent1211.read(TAG, "parse bssid failed");
            }
            hwWifiInfo.setRssi(scanResult.level);
            hwWifiInfo.setFrequency(scanResult.frequency);
            hwWifiInfo.setTimestamp(scanResult.timestamp);
            arrayList.add(hwWifiInfo);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "transformWifiInfo end,size is:" + arrayList.size());
        return arrayList;
    }

    private static int getCellSignalStrength(CellInfoNr cellInfoNr) {
        int dbm = cellInfoNr.getCellSignalStrength().getDbm();
        if (dbm == Integer.MAX_VALUE) {
            CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
            if (!MapboxMap$$ExternalSyntheticLambda0.m4700m((Object) cellSignalStrength)) {
                return Integer.MAX_VALUE;
            }
            CellSignalStrengthNr cellSignalStrengthNrM4698m = MapboxMap$$ExternalSyntheticLambda0.m4698m((Object) cellSignalStrength);
            int ssRsrp = cellSignalStrengthNrM4698m.getSsRsrp();
            int ssRsrq = cellSignalStrengthNrM4698m.getSsRsrq();
            int ssSinr = cellSignalStrengthNrM4698m.getSsSinr();
            int csiRsrp = cellSignalStrengthNrM4698m.getCsiRsrp();
            int csiRsrq = cellSignalStrengthNrM4698m.getCsiRsrq();
            int csiSinr = cellSignalStrengthNrM4698m.getCsiSinr();
            if (ssRsrp != Integer.MAX_VALUE && ssRsrq != Integer.MAX_VALUE && ssSinr != Integer.MAX_VALUE) {
                return ssRsrp > 0 ? -ssRsrp : ssRsrp;
            }
            if (csiRsrp != Integer.MAX_VALUE && csiRsrq != Integer.MAX_VALUE && csiSinr != Integer.MAX_VALUE) {
                return csiRsrp > 0 ? -csiRsrp : csiRsrp;
            }
            WrappedCompositionsetContent1211.read();
        }
        return dbm;
    }

    private static void parseCellInfoGsm(CellInfoGsm cellInfoGsm, HwCellInfo hwCellInfo) {
        hwCellInfo.setMcc(cellInfoGsm.getCellIdentity().getMcc());
        hwCellInfo.setMnc(cellInfoGsm.getCellIdentity().getMnc());
        hwCellInfo.setLacOrTac(cellInfoGsm.getCellIdentity().getLac());
        hwCellInfo.setCellId(cellInfoGsm.getCellIdentity().getCid());
        hwCellInfo.setRat(1);
        hwCellInfo.setRssi(cellInfoGsm.getCellSignalStrength().getDbm());
        hwCellInfo.setChannelNumber(cellInfoGsm.getCellIdentity().getArfcn());
        hwCellInfo.setPhysicalIdentity(cellInfoGsm.getCellIdentity().getBsic());
    }

    private static void parseCellInfoLte(CellInfoLte cellInfoLte, HwCellInfo hwCellInfo) {
        hwCellInfo.setMcc(cellInfoLte.getCellIdentity().getMcc());
        hwCellInfo.setMnc(cellInfoLte.getCellIdentity().getMnc());
        hwCellInfo.setLacOrTac(cellInfoLte.getCellIdentity().getTac());
        hwCellInfo.setCellId(cellInfoLte.getCellIdentity().getCi());
        hwCellInfo.setRat(3);
        hwCellInfo.setRssi(cellInfoLte.getCellSignalStrength().getDbm());
        hwCellInfo.setPhysicalIdentity(cellInfoLte.getCellIdentity().getPci());
        hwCellInfo.setChannelNumber(cellInfoLte.getCellIdentity().getEarfcn());
    }

    private static void parseCellInfoNr(CellInfoNr cellInfoNr, HwCellInfo hwCellInfo) {
        CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
        if (MapboxMap$$ExternalSyntheticLambda0.m$2(cellIdentity)) {
            CellIdentityNr cellIdentityNrM4696m = MapboxMap$$ExternalSyntheticLambda0.m4696m((Object) cellIdentity);
            try {
                hwCellInfo.setMcc(Integer.parseInt(cellIdentityNrM4696m.getMccString()));
                hwCellInfo.setMnc(Integer.parseInt(cellIdentityNrM4696m.getMncString()));
            } catch (NumberFormatException unused) {
                WrappedCompositionsetContent1211.read(TAG, "parse cellInfoNr mcc/mnc failed");
            }
            hwCellInfo.setLacOrTac(cellIdentityNrM4696m.getTac());
            hwCellInfo.setCellId(cellIdentityNrM4696m.getNci());
            hwCellInfo.setRat(4);
            hwCellInfo.setPhysicalIdentity(cellIdentityNrM4696m.getPci());
            hwCellInfo.setChannelNumber(cellIdentityNrM4696m.getNrarfcn());
            hwCellInfo.setRssi(getCellSignalStrength(cellInfoNr));
        }
    }

    private static void parseCellInfoWcdma(CellInfoWcdma cellInfoWcdma, HwCellInfo hwCellInfo) {
        hwCellInfo.setMcc(cellInfoWcdma.getCellIdentity().getMcc());
        hwCellInfo.setMnc(cellInfoWcdma.getCellIdentity().getMnc());
        hwCellInfo.setLacOrTac(cellInfoWcdma.getCellIdentity().getLac());
        hwCellInfo.setCellId(cellInfoWcdma.getCellIdentity().getCid());
        hwCellInfo.setRat(2);
        hwCellInfo.setRssi(cellInfoWcdma.getCellSignalStrength().getDbm());
        hwCellInfo.setPhysicalIdentity(cellInfoWcdma.getCellIdentity().getPsc());
        hwCellInfo.setChannelNumber(cellInfoWcdma.getCellIdentity().getUarfcn());
    }
}
