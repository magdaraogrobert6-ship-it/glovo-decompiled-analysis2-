package o;

/* JADX INFO: loaded from: classes3.dex */
public final class addSerializedCardJsonToStorageandroid_sdk_base_release {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final long read;
    public final getContentCardsLastUpdatedInSecondsFromEpoch serializer;

    public addSerializedCardJsonToStorageandroid_sdk_base_release(getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch, long j) {
        this.serializer = getcontentcardslastupdatedinsecondsfromepoch;
        this.read = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.read) + (this.serializer.hashCode() * 31);
        int i4 = write + 65;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CachedConfig(config=" + this.serializer + ", fetchedAt=" + this.read + ")";
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 45;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof addSerializedCardJsonToStorageandroid_sdk_base_release)) {
            return false;
        }
        addSerializedCardJsonToStorageandroid_sdk_base_release addserializedcardjsontostorageandroid_sdk_base_release = (addSerializedCardJsonToStorageandroid_sdk_base_release) obj;
        return this.serializer.equals(addserializedcardjsontostorageandroid_sdk_base_release.serializer) && this.read == addserializedcardjsontostorageandroid_sdk_base_release.read;
    }
}
