package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.roadrunner.rider.state.provider.database.StatusDatabase_Impl;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveClass extends WorkOpportunityDao {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final isIdentity58bKbWc RemoteActionCompatParcelizer;
    public final androidx.room.RoomDatabase serializer;

    public resolveClass(StatusDatabase_Impl statusDatabase_Impl) {
        statusDatabase_Impl.getClass();
        this.serializer = statusDatabase_Impl;
        this.RemoteActionCompatParcelizer = new isIdentity58bKbWc(12, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static onServiceConnected read(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -1788576379:
                if (str.equals("WORK_NOW_LOW_FILL")) {
                    return onServiceConnected.WORK_NOW_LOW_FILL;
                }
                break;
            case 433141802:
                if (str.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) {
                    return onServiceConnected.UNKNOWN;
                }
                break;
            case 818752648:
                if (str.equals("WORK_NOW")) {
                    int i3 = IconCompatParcelizer + 21;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        return onServiceConnected.WORK_NOW;
                    }
                    int i4 = 98 / 0;
                    return onServiceConnected.WORK_NOW;
                }
                break;
            case 1579081114:
                if (str.equals("GO_AND_START_NOW")) {
                    return onServiceConnected.GO_AND_START_NOW;
                }
                break;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }
}
