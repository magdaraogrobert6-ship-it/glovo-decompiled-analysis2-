package com.huawei.location.nlp.scan;

import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.text.TextUtils;
import android.util.Pair;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.location.lite.common.util.ReflectionUtils;
import com.huawei.location.nlp.network.request.cell.CellSourceInfo;
import com.huawei.location.nlp.network.request.cell.CurrentCell;
import com.huawei.location.nlp.network.request.cell.HwCellInfo;
import com.huawei.location.nlp.network.request.cell.HwNeighborCellInfo;
import com.huawei.location.nlp.network.request.cell.NeighborCell;
import com.huawei.location.nlp.network.request.wifi.WifiInfo;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LW {
    public final boolean MediaBrowserCompatMediaItem;
    public final i$d.a PlaybackStateCompatCustomAction;
    public long RatingCompat = 30000;

    public static Pair IconCompatParcelizer(List list) {
        String str;
        long j;
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        long mac = -1;
        long j2 = -1;
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            String str3 = scanResult.BSSID;
            if (str3 == null) {
                str = "macStringToLong mac is null,return -1";
            } else {
                try {
                    j = Long.parseLong(str3.replace(":", ""), 16);
                } catch (NumberFormatException unused) {
                    str = "macStringToLong mac NumberFormatException";
                    WrappedCompositionsetContent1211.read("ScanBase", str);
                    j = -1;
                }
                long j3 = scanResult.timestamp;
                long j4 = j3 / 1000;
                int i = scanResult.level;
                int i2 = scanResult.frequency;
                if (j >= 1 || j > 281474976710654L) {
                    str2 = "isValidScanResult false mac";
                    WrappedCompositionsetContent1211.read("ScanBase", str2);
                } else if (i >= 0 || i <= -120) {
                    str2 = "isValidScanResult false rssi";
                    WrappedCompositionsetContent1211.read("ScanBase", str2);
                } else if (j3 <= 0) {
                    WrappedCompositionsetContent1211.read("ScanBase", "isValidScanResult false boot");
                } else if ((i2 < 2400 || i2 > 2500) && (i2 < 4900 || i2 > 5850)) {
                    str2 = "isValidScanResult false frequency";
                    WrappedCompositionsetContent1211.read("ScanBase", str2);
                } else {
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    arrayList.add(new WifiInfo(j, i, j4, i2));
                }
            }
            WrappedCompositionsetContent1211.read("ScanBase", str);
            j = -1;
            long j5 = scanResult.timestamp;
            long j6 = j5 / 1000;
            int i3 = scanResult.level;
            int i4 = scanResult.frequency;
            if (j >= 1) {
            }
            str2 = "isValidScanResult false mac";
            WrappedCompositionsetContent1211.read("ScanBase", str2);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", "convertScanResult size is " + arrayList.size() + ", current time is " + SystemClock.elapsedRealtime() + ", bootTimeMax is " + j2);
        Pair pair = new Pair(Long.valueOf(j2), arrayList);
        StringBuilder sb = new StringBuilder("filterResult, wifiScanResult bootTime is ");
        sb.append(pair.first);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", sb.toString());
        if (((List) pair.second).size() > 120) {
            long jLongValue = ((Long) pair.first).longValue();
            List list2 = (List) pair.second;
            try {
                Collections.sort(list2, new FB(0));
            } catch (Exception unused2) {
                WrappedCompositionsetContent1211.read("ScanBase", "sort exception");
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            int frequency = -1;
            while (it2.hasNext()) {
                WifiInfo wifiInfo = (WifiInfo) it2.next();
                if (jLongValue - wifiInfo.getTime() >= 8000000) {
                    it2.remove();
                }
                if (mac != wifiInfo.getMac() / 16 || frequency != wifiInfo.getFrequency()) {
                    arrayList2.add(wifiInfo);
                    mac = wifiInfo.getMac() / 16;
                    frequency = wifiInfo.getFrequency();
                }
                if (list2.size() + arrayList2.size() == 120) {
                    arrayList2.addAll(list2);
                    break;
                }
            }
        }
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0436  */
    public final Pair serializer(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return new Pair(0L, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            boolean zIsRegistered = cellInfo.isRegistered();
            boolean z = this.MediaBrowserCompatMediaItem;
            if (zIsRegistered) {
                if (cellInfo instanceof CellInfoGsm) {
                    HwCellInfo hwCellInfo = new HwCellInfo();
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    hwCellInfo.setBoottime(cellInfo.getTimeStamp());
                    hwCellInfo.setMcc(cellInfoGsm.getCellIdentity().getMcc());
                    hwCellInfo.setMnc(cellInfoGsm.getCellIdentity().getMnc());
                    hwCellInfo.setLac(cellInfoGsm.getCellIdentity().getLac());
                    hwCellInfo.setCellId(cellInfoGsm.getCellIdentity().getCid());
                    hwCellInfo.setRssi((short) cellInfoGsm.getCellSignalStrength().getDbm());
                    hwCellInfo.setRat(1);
                    hwCellInfo.setChannelNumber(cellInfoGsm.getCellIdentity().getArfcn());
                    if (read(hwCellInfo)) {
                        arrayList2.add(hwCellInfo);
                    }
                } else if (cellInfo instanceof CellInfoWcdma) {
                    HwCellInfo hwCellInfo2 = new HwCellInfo();
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                    hwCellInfo2.setBoottime(cellInfo.getTimeStamp());
                    hwCellInfo2.setMcc(cellInfoWcdma.getCellIdentity().getMcc());
                    hwCellInfo2.setMnc(cellInfoWcdma.getCellIdentity().getMnc());
                    hwCellInfo2.setLac(cellInfoWcdma.getCellIdentity().getLac());
                    hwCellInfo2.setCellId(cellInfoWcdma.getCellIdentity().getCid());
                    hwCellInfo2.setRssi((short) cellInfoWcdma.getCellSignalStrength().getDbm());
                    hwCellInfo2.setRat(2);
                    hwCellInfo2.setChannelNumber(cellInfoWcdma.getCellIdentity().getUarfcn());
                    if (read(hwCellInfo2)) {
                        arrayList2.add(hwCellInfo2);
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    HwCellInfo hwCellInfo3 = new HwCellInfo();
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    hwCellInfo3.setBoottime(cellInfo.getTimeStamp());
                    hwCellInfo3.setMcc(cellInfoLte.getCellIdentity().getMcc());
                    hwCellInfo3.setMnc(cellInfoLte.getCellIdentity().getMnc());
                    hwCellInfo3.setLac(cellInfoLte.getCellIdentity().getTac());
                    hwCellInfo3.setCellId(cellInfoLte.getCellIdentity().getCi());
                    hwCellInfo3.setRssi((short) cellInfoLte.getCellSignalStrength().getDbm());
                    hwCellInfo3.setRat(3);
                    hwCellInfo3.setChannelNumber(cellInfoLte.getCellIdentity().getEarfcn());
                    if (read(hwCellInfo3)) {
                        arrayList2.add(hwCellInfo3);
                    }
                } else if (!z) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", "getCurrentCellList fail");
                } else if (Build.VERSION.SDK_INT >= 29 && MapboxMap$$ExternalSyntheticLambda0.m$1(cellInfo)) {
                    CellInfoNr cellInfoNrM4697m = MapboxMap$$ExternalSyntheticLambda0.m4697m((Object) cellInfo);
                    CellIdentity cellIdentity = cellInfoNrM4697m.getCellIdentity();
                    if (MapboxMap$$ExternalSyntheticLambda0.m$2(cellIdentity)) {
                        CellIdentityNr cellIdentityNrM4696m = MapboxMap$$ExternalSyntheticLambda0.m4696m((Object) cellIdentity);
                        String mccString = cellIdentityNrM4696m.getMccString();
                        String mncString = cellIdentityNrM4696m.getMncString();
                        if (mccString != null && mncString != null) {
                            HwCellInfo hwCellInfo4 = new HwCellInfo();
                            hwCellInfo4.setBoottime(cellInfo.getTimeStamp());
                            hwCellInfo4.setMcc(Integer.parseInt(mccString));
                            hwCellInfo4.setMnc(Integer.parseInt(mncString));
                            hwCellInfo4.setLac(cellIdentityNrM4696m.getTac());
                            hwCellInfo4.setCellId(cellIdentityNrM4696m.getNci());
                            hwCellInfo4.setRssi((short) cg_(cellInfoNrM4697m));
                            hwCellInfo4.setRat(4);
                            hwCellInfo4.setChannelNumber(cellIdentityNrM4696m.getNrarfcn());
                            if (read(hwCellInfo4)) {
                                arrayList2.add(hwCellInfo4);
                            }
                        }
                    }
                }
            } else if (cellInfo instanceof CellInfoGsm) {
                CellInfoGsm cellInfoGsm2 = (CellInfoGsm) cellInfo;
                HwNeighborCellInfo hwNeighborCellInfo = new HwNeighborCellInfo();
                hwNeighborCellInfo.setMcc(cellInfoGsm2.getCellIdentity().getMcc());
                hwNeighborCellInfo.setMnc(cellInfoGsm2.getCellIdentity().getMnc());
                hwNeighborCellInfo.setRssi((short) cellInfoGsm2.getCellSignalStrength().getDbm());
                hwNeighborCellInfo.setRat(1);
                hwNeighborCellInfo.setChannelNumber(cellInfoGsm2.getCellIdentity().getArfcn());
                hwNeighborCellInfo.setPhysicalIdentity(cellInfoGsm2.getCellIdentity().getBsic());
                arrayList3.add(hwNeighborCellInfo);
            } else if (cellInfo instanceof CellInfoWcdma) {
                CellInfoWcdma cellInfoWcdma2 = (CellInfoWcdma) cellInfo;
                HwNeighborCellInfo hwNeighborCellInfo2 = new HwNeighborCellInfo();
                hwNeighborCellInfo2.setMcc(cellInfoWcdma2.getCellIdentity().getMcc());
                hwNeighborCellInfo2.setMnc(cellInfoWcdma2.getCellIdentity().getMnc());
                hwNeighborCellInfo2.setPhysicalIdentity(cellInfoWcdma2.getCellIdentity().getPsc());
                hwNeighborCellInfo2.setRssi((short) cellInfoWcdma2.getCellSignalStrength().getDbm());
                hwNeighborCellInfo2.setRat(2);
                hwNeighborCellInfo2.setChannelNumber(cellInfoWcdma2.getCellIdentity().getUarfcn());
                arrayList3.add(hwNeighborCellInfo2);
            } else if (cellInfo instanceof CellInfoLte) {
                CellInfoLte cellInfoLte2 = (CellInfoLte) cellInfo;
                HwNeighborCellInfo hwNeighborCellInfo3 = new HwNeighborCellInfo();
                hwNeighborCellInfo3.setMcc(cellInfoLte2.getCellIdentity().getMcc());
                hwNeighborCellInfo3.setMnc(cellInfoLte2.getCellIdentity().getMnc());
                hwNeighborCellInfo3.setPhysicalIdentity(cellInfoLte2.getCellIdentity().getPci());
                hwNeighborCellInfo3.setRssi((short) cellInfoLte2.getCellSignalStrength().getDbm());
                hwNeighborCellInfo3.setRat(3);
                hwNeighborCellInfo3.setChannelNumber(cellInfoLte2.getCellIdentity().getEarfcn());
                arrayList3.add(hwNeighborCellInfo3);
            } else if (!z) {
                WrappedCompositionsetContent1211.read("ScanBase", "getNeighborCellInfoList fail");
            } else if (Build.VERSION.SDK_INT >= 29 && MapboxMap$$ExternalSyntheticLambda0.m$1(cellInfo)) {
                CellInfoNr cellInfoNrM4697m2 = MapboxMap$$ExternalSyntheticLambda0.m4697m((Object) cellInfo);
                CellIdentity cellIdentity2 = cellInfoNrM4697m2.getCellIdentity();
                if (MapboxMap$$ExternalSyntheticLambda0.m$2(cellIdentity2)) {
                    CellIdentityNr cellIdentityNrM4696m2 = MapboxMap$$ExternalSyntheticLambda0.m4696m((Object) cellIdentity2);
                    String mccString2 = cellIdentityNrM4696m2.getMccString();
                    String mncString2 = cellIdentityNrM4696m2.getMncString();
                    if (mccString2 != null && mncString2 != null) {
                        HwNeighborCellInfo hwNeighborCellInfo4 = new HwNeighborCellInfo();
                        hwNeighborCellInfo4.setMcc(Integer.parseInt(mccString2));
                        hwNeighborCellInfo4.setMnc(Integer.parseInt(mncString2));
                        hwNeighborCellInfo4.setPhysicalIdentity(cellIdentityNrM4696m2.getPci());
                        hwNeighborCellInfo4.setRssi((short) cg_(cellInfoNrM4697m2));
                        hwNeighborCellInfo4.setRat(4);
                        hwNeighborCellInfo4.setChannelNumber(cellIdentityNrM4696m2.getNrarfcn());
                        arrayList3.add(hwNeighborCellInfo4);
                    }
                }
            }
        }
        int size = arrayList2.size();
        long jNanoTime = System.nanoTime();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = jElapsedRealtimeNanos >= jNanoTime ? jElapsedRealtimeNanos - jNanoTime : 0L;
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(size, "current cell is ", ", neighbor Cell size is ");
        sbM.append(arrayList3.size());
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", sbM.toString());
        if (size == 2 && ((HwCellInfo) arrayList2.get(0)).getMcc() == ((HwCellInfo) arrayList2.get(1)).getMcc() && ((HwCellInfo) arrayList2.get(0)).getMnc() == ((HwCellInfo) arrayList2.get(1)).getMnc() && ((HwCellInfo) arrayList2.get(0)).getRat() == ((HwCellInfo) arrayList2.get(1)).getRat()) {
            write((HwCellInfo) arrayList2.get(1), arrayList3, arrayList);
            HwCellInfo hwCellInfo5 = (HwCellInfo) arrayList2.get(1);
            if (j > 5000000000L) {
                long boottime = hwCellInfo5.getBoottime();
                if (Math.abs(jNanoTime - boottime) <= 30000000000L && Math.abs(jElapsedRealtimeNanos - boottime) >= 30000000000L) {
                    hwCellInfo5.setBoottime(boottime + j);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", "amendCellTimeStamp bootTime is " + hwCellInfo5.getBoottime());
                }
            }
            return new Pair(Long.valueOf(((HwCellInfo) arrayList2.get(1)).getBoottime()), arrayList);
        }
        long boottime2 = -1;
        int i = 0;
        while (i < size) {
            ArrayList arrayList4 = arrayList2;
            HwCellInfo hwCellInfo6 = (HwCellInfo) arrayList2.get(i);
            write(hwCellInfo6, arrayList3, arrayList);
            if (hwCellInfo6.getBoottime() >= boottime2) {
                if (j > 5000000000L) {
                    long boottime3 = hwCellInfo6.getBoottime();
                    if (Math.abs(jNanoTime - boottime3) <= 30000000000L && Math.abs(jElapsedRealtimeNanos - boottime3) >= 30000000000L) {
                        hwCellInfo6.setBoottime(boottime3 + j);
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ScanBase", "amendCellTimeStamp bootTime is " + hwCellInfo6.getBoottime());
                    }
                }
                boottime2 = hwCellInfo6.getBoottime();
            } else {
                j = j;
            }
            i++;
            arrayList2 = arrayList4;
            j = j;
        }
        return new Pair(Long.valueOf(boottime2), arrayList);
    }

    public LW(i$d.a aVar) {
        this.PlaybackStateCompatCustomAction = aVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.MediaBrowserCompatMediaItem = ReflectionUtils.getClass("android.telephony.CellInfoNr") != null;
        } else {
            this.MediaBrowserCompatMediaItem = false;
        }
    }

    public static boolean read(HwCellInfo hwCellInfo) {
        String str;
        if (hwCellInfo.getMcc() < 1 || hwCellInfo.getMcc() >= Integer.MAX_VALUE) {
            str = "hwCellInfo is invalid, mcc error";
        } else if (hwCellInfo.getMnc() < 0 || hwCellInfo.getMnc() >= Integer.MAX_VALUE) {
            str = "hwCellInfo is invalid, mnc error";
        } else if (hwCellInfo.getRssi() < -139 || hwCellInfo.getRssi() > -1) {
            str = "hwCellInfo is invalid, rssi error";
        } else {
            int rat = hwCellInfo.getRat();
            long cellId = hwCellInfo.getCellId();
            if (rat != 4 ? cellId < 1 || hwCellInfo.getCellId() >= 2147483647L : cellId < 1 || hwCellInfo.getCellId() >= Long.MAX_VALUE) {
                str = "hwCellInfo is invalid, cellId error";
            } else if (hwCellInfo.getRat() != 4 ? hwCellInfo.getLac() < 0 || hwCellInfo.getLac() > 65535 : hwCellInfo.getLac() < 0 || hwCellInfo.getLac() > 16777215) {
                str = "hwCellInfo is invalid, lac error";
            } else {
                if (hwCellInfo.getChannelNumber() >= 1 && hwCellInfo.getChannelNumber() < Integer.MAX_VALUE) {
                    return true;
                }
                str = "hwCellInfo is invalid, channelNumber error";
            }
        }
        WrappedCompositionsetContent1211.write("ScanBase", str);
        return false;
    }

    public static int cg_(CellInfoNr cellInfoNr) {
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

    public static void write(HwCellInfo hwCellInfo, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        String string = hwCellInfo.getMcc() + BundleUtil.UNDERLINE_TAG + hwCellInfo.getMnc();
        if (hwCellInfo.getRat() == 2 || hwCellInfo.getRat() == 3) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(string, BundleUtil.UNDERLINE_TAG);
            sbM.append(hwCellInfo.getChannelNumber());
            string = sbM.toString();
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                HwNeighborCellInfo hwNeighborCellInfo = (HwNeighborCellInfo) arrayList.get(i);
                String string2 = hwNeighborCellInfo.getMcc() + BundleUtil.UNDERLINE_TAG + hwNeighborCellInfo.getMnc();
                if (z) {
                    StringBuilder sbM2 = af$$ExternalSyntheticOutline0.m(string2, BundleUtil.UNDERLINE_TAG);
                    sbM2.append(hwNeighborCellInfo.getChannelNumber());
                    string2 = sbM2.toString();
                }
                if (string2.equals(string)) {
                    arrayList3.add(new NeighborCell(hwNeighborCellInfo.getChannelNumber(), hwNeighborCellInfo.getPhysicalIdentity(), hwNeighborCellInfo.getRssi()));
                }
                if (arrayList3.size() == 8) {
                    break;
                }
            }
        }
        CurrentCell currentCell = new CurrentCell();
        currentCell.setBoottime(hwCellInfo.getBoottime());
        currentCell.setMcc(hwCellInfo.getMcc());
        currentCell.setMnc(hwCellInfo.getMnc());
        currentCell.setLac(hwCellInfo.getLac());
        currentCell.setCellId(hwCellInfo.getCellId());
        currentCell.setRat(hwCellInfo.getRat());
        currentCell.setRssi(hwCellInfo.getRssi());
        arrayList2.add(new CellSourceInfo(currentCell, arrayList3));
    }

    public static boolean IconCompatParcelizer(List list, List list2) {
        if (list2 == null || list2.isEmpty() || list.isEmpty()) {
            WrappedCompositionsetContent1211.read("ScanBase", "wifi cache is null");
            return false;
        }
        if (list.size() == list2.size()) {
            HashMap map = new HashMap();
            for (int i = 0; i < list2.size(); i++) {
                WifiInfo wifiInfo = (WifiInfo) list2.get(i);
                map.put(String.valueOf(wifiInfo.getMac()), String.valueOf(wifiInfo.getRssi()));
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                WifiInfo wifiInfo2 = (WifiInfo) list.get(i2);
                String strValueOf = String.valueOf(wifiInfo2.getMac());
                if (map.containsKey(strValueOf) && TextUtils.equals((CharSequence) map.get(strValueOf), String.valueOf(wifiInfo2.getRssi()))) {
                }
            }
            return true;
        }
        return false;
    }
}
