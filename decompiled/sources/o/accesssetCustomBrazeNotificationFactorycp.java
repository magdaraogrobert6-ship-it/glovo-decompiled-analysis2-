package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetCustomBrazeNotificationFactorycp {
    private static int read = 1;
    private static int write;
    public final accesssetDeviceDataProvidercp IconCompatParcelizer;
    public final ArrayList RemoteActionCompatParcelizer;

    public accesssetCustomBrazeNotificationFactorycp(ArrayList arrayList, accesssetDeviceDataProvidercp accesssetdevicedataprovidercp) {
        accesssetdevicedataprovidercp.getClass();
        this.RemoteActionCompatParcelizer = arrayList;
        this.IconCompatParcelizer = accesssetdevicedataprovidercp;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = write + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesssetCustomBrazeNotificationFactorycp) {
            accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = (accesssetCustomBrazeNotificationFactorycp) obj;
            return this.RemoteActionCompatParcelizer.equals(accesssetcustombrazenotificationfactorycp.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == accesssetcustombrazenotificationfactorycp.IconCompatParcelizer;
        }
        int i5 = i3 + 47;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartingArea(polygonCoordinates=" + this.RemoteActionCompatParcelizer + ", type=" + this.IconCompatParcelizer + ")";
        int i2 = write + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
