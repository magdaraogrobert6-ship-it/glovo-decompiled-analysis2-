package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioAttributesImplApi21Parcelizer implements AudioAttributesImplBase {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final DelegatingFrameMetricsListener serializer;

    public AudioAttributesImplApi21Parcelizer(DelegatingFrameMetricsListener delegatingFrameMetricsListener) {
        this.serializer = delegatingFrameMetricsListener;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Some(value=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof AudioAttributesImplApi21Parcelizer) {
                if (!this.serializer.equals(((AudioAttributesImplApi21Parcelizer) obj).serializer)) {
                    return false;
                }
            } else {
                int i5 = i2 + 109;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
