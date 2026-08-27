package o;

import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes3.dex */
public final class fa extends LoadBalancer$Helper {
    private static int IconCompatParcelizer = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public static final fa serializer = new fa();

    static {
        int i = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 59;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "None";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 61;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = i2 + 63;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 955135161;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof fa) {
                return true;
            }
            int i2 = MediaMetadataCompat + 73;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i2 % 2 == 0);
        }
        int i3 = MediaMetadataCompat;
        int i4 = i3 + 43;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
