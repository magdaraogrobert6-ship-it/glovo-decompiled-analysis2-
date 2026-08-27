package com.mapbox.maps.plugin.scalebar;

import android.util.Pair;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.sqlite.SQLite;
import com.braze.location.BrazeInternalLocationApi;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.location.LocationRequest;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScaleBarConstantKt {
    public static final List imperialTable;
    public static final List metricTable;
    public static final List nauticalTable;

    static {
        Pair pair = new Pair(1, 2);
        Pair pair2 = new Pair(2, 2);
        Pair pair3 = new Pair(4, 2);
        Pair pair4 = new Pair(10, 2);
        Pair pair5 = new Pair(20, 2);
        Pair pair6 = new Pair(50, 2);
        Pair pair7 = new Pair(75, 3);
        Pair pair8 = new Pair(100, 2);
        Pair pair9 = new Pair(150, 2);
        Pair pair10 = new Pair(200, 2);
        Integer numValueOf = Integer.valueOf(LocationRequest.PRIORITY_INDOOR);
        metricTable = SQLite.read(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(numValueOf, 3), new Pair(Integer.valueOf(Constant.ERROR_UNKNOWN), 2), new Pair(1000, 2), new Pair(1500, 2), new Pair(3000, 3), new Pair(5000, 2), new Pair(10000, 2), new Pair(20000, 2), new Pair(30000, 3), new Pair(50000, 2), new Pair(Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength), 2), new Pair(200000, 2), new Pair(300000, 3), new Pair(400000, 2), new Pair(500000, 2), new Pair(Integer.valueOf(BrazeInternalLocationApi.LAST_KNOWN_GPS_LOCATION_MAX_AGE_MS), 3), new Pair(800000, 2), new Pair(1000000, 2), new Pair(2000000, 2), new Pair(3000000, 3), new Pair(4000000, 2), new Pair(5000000, 2), new Pair(6000000, 3), new Pair(8000000, 2), new Pair(Integer.valueOf(ExceptionCode.CRASH_EXCEPTION), 2), new Pair(12000000, 2), new Pair(15000000, 2));
        imperialTable = SQLite.read(new Pair(1, 1), new Pair(4, 2), new Pair(6, 2), new Pair(10, 2), new Pair(20, 2), new Pair(30, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(200, 2), new Pair(numValueOf, 3), new Pair(400, 2), new Pair(600, 3), new Pair(800, 2), new Pair(1000, 2), new Pair(1320, 2), new Pair(2640, 2), new Pair(5280, 2), new Pair(10560, 2), new Pair(15840, 3), new Pair(21120, 2), new Pair(42240, 2), new Pair(63360, 2), new Pair(79200, 3), new Pair(105600, 2), new Pair(158400, 3), new Pair(211200, 2), new Pair(422400, 2), new Pair(633600, 2), new Pair(1056000, 2), new Pair(1584000, 3), new Pair(2112000, 2), new Pair(3168000, 3), new Pair(5280000, 2), new Pair(7920000, 3), new Pair(10560000, 2), new Pair(15840000, 2), new Pair(21120000, 2), new Pair(26400000, 2), new Pair(31680000, 3), new Pair(42240000, 2), new Pair(52800000, 2));
        nauticalTable = SQLite.read(new Pair(6, 2), new Pair(12, 2), new Pair(18, 3), new Pair(30, 2), new Pair(60, 2), new Pair(120, 2), new Pair(180, 3), new Pair(numValueOf, 2), new Pair(600, 2), new Pair(1200, 2), new Pair(3038, 2), new Pair(6076, 2), new Pair(12152, 2), new Pair(18228, 3), new Pair(30380, 2), new Pair(60761, 2), new Pair(121522, 2), new Pair(182283, 3), new Pair(303806, 2), new Pair(607612, 2), new Pair(1215224, 2), new Pair(1822836, 3), new Pair(3038060, 2), new Pair(6076120, 2), new Pair(12152240, 2), new Pair(18228360, 3), new Pair(30380600, 2));
    }
}
