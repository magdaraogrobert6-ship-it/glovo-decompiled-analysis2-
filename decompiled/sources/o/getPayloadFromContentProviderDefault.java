package o;

import com.huawei.hms.location.ActivityIdentificationData;

/* JADX INFO: loaded from: classes3.dex */
public final class getPayloadFromContentProviderDefault extends PackageHandler7 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String serializer;
    public final int write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 51;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        int i5 = i2 + 17;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getPayloadFromContentProviderDefault(int i, String str) {
        str.getClass();
        this.write = i;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode() - (Integer.hashCode(this.write) << ActivityIdentificationData.RUNNING);
        }
        return this.serializer.hashCode() + (Integer.hashCode(this.write) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getPayloadFromContentProviderDefault))) {
            getPayloadFromContentProviderDefault getpayloadfromcontentproviderdefault = (getPayloadFromContentProviderDefault) obj;
            if (this.write == getpayloadfromcontentproviderdefault.write) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getpayloadfromcontentproviderdefault.serializer}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 91;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaDescriptionCompat + 23;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 119;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return z;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToBonusCalendar(zoneId=" + this.write + ", zoneName=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 115;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
