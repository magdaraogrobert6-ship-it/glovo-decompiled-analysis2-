package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.provider.database.StatusDatabase_Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class getSignedData extends Logger {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final isIdentity58bKbWc RemoteActionCompatParcelizer;
    public final androidx.room.RoomDatabase read;

    public getSignedData(StatusDatabase_Impl statusDatabase_Impl) {
        statusDatabase_Impl.getClass();
        this.read = statusDatabase_Impl;
        this.RemoteActionCompatParcelizer = new isIdentity58bKbWc(11, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static GooglePlayInstallReferrerDetails RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        Object obj = null;
        switch (str.hashCode()) {
            case -2057707738:
                if (str.equals("URL_ACTION")) {
                    int i2 = IconCompatParcelizer + 31;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return GooglePlayInstallReferrerDetails.URL_ACTION;
                    }
                    GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails = GooglePlayInstallReferrerDetails.URL_ACTION;
                    obj.hashCode();
                    throw null;
                }
                break;
            case -905735189:
                if (str.equals("UNKNOWN_ACTION")) {
                    int i3 = write + 111;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return GooglePlayInstallReferrerDetails.UNKNOWN_ACTION;
                }
                break;
            case 603143124:
                if (str.equals("STOP_WORKING")) {
                    int i5 = write + 59;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return GooglePlayInstallReferrerDetails.STOP_WORKING;
                    }
                    GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails2 = GooglePlayInstallReferrerDetails.STOP_WORKING;
                    obj.hashCode();
                    throw null;
                }
                break;
            case 1343887451:
                if (str.equals("END_BREAK")) {
                    return GooglePlayInstallReferrerDetails.END_BREAK;
                }
                break;
            case 1467773711:
                if (str.equals("REQUEST_BREAK")) {
                    int i6 = write + 69;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return GooglePlayInstallReferrerDetails.REQUEST_BREAK;
                }
                break;
            case 1741202138:
                if (str.equals("CANCEL_BREAK")) {
                    return GooglePlayInstallReferrerDetails.CANCEL_BREAK;
                }
                break;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    public static isTrackingEnabled serializer(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.hashCode();
            obj.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -2113695732:
                if (str.equals("ON_PAID_BREAK")) {
                    int i3 = IconCompatParcelizer + 117;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return isTrackingEnabled.ON_PAID_BREAK;
                }
                break;
            case -2051819759:
                if (str.equals("WORKING")) {
                    int i5 = write + 29;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return isTrackingEnabled.WORKING;
                    }
                    isTrackingEnabled istrackingenabled = isTrackingEnabled.WORKING;
                    throw null;
                }
                break;
            case -762860929:
                if (str.equals("ON_BREAK")) {
                    return isTrackingEnabled.ON_BREAK;
                }
                break;
            case 2329254:
                if (str.equals("LATE")) {
                    int i6 = write + 119;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return isTrackingEnabled.LATE;
                    }
                    isTrackingEnabled istrackingenabled2 = isTrackingEnabled.LATE;
                    throw null;
                }
                break;
            case 77848963:
                if (str.equals("READY")) {
                    return isTrackingEnabled.READY;
                }
                break;
            case 1124965819:
                if (str.equals("SUSPENDED")) {
                    int i7 = IconCompatParcelizer + 97;
                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return isTrackingEnabled.SUSPENDED;
                    }
                    isTrackingEnabled istrackingenabled3 = isTrackingEnabled.SUSPENDED;
                    throw null;
                }
                break;
            case 2031102341:
                if (str.equals("NOT_WORKING")) {
                    return isTrackingEnabled.NOT_WORKING;
                }
                break;
            case 2049544487:
                if (str.equals("ENDING")) {
                    int i8 = write + 101;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return isTrackingEnabled.ENDING;
                }
                break;
            case 2052692649:
                if (!(!str.equals("AVAILABLE"))) {
                    int i10 = write + 37;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return isTrackingEnabled.AVAILABLE;
                }
                break;
            case 2099433536:
                if (str.equals("STARTING")) {
                    int i12 = IconCompatParcelizer + 83;
                    write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return isTrackingEnabled.STARTING;
                }
                break;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }
}
