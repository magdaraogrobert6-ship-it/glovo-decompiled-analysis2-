package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameMetricsAggregatorFrameMetricsApi24Impl1 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final int write;

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        int i3 = 39 / 0;
        return this.serializer;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 95;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public FrameMetricsAggregatorFrameMetricsApi24Impl1(int i, int i2, int i3) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = i3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, Integer.hashCode(this.write) * 31, 31);
        int i4 = IconCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.serializer, ")", m1$$ExternalSyntheticOutline0.m(this.write, this.RemoteActionCompatParcelizer, "PillWrapColors(textColor=", ", backgroundColor=", ", strokeColor="));
        int i4 = IconCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (!(!(obj instanceof FrameMetricsAggregatorFrameMetricsApi24Impl1))) {
            FrameMetricsAggregatorFrameMetricsApi24Impl1 frameMetricsAggregatorFrameMetricsApi24Impl1 = (FrameMetricsAggregatorFrameMetricsApi24Impl1) obj;
            if (this.write == frameMetricsAggregatorFrameMetricsApi24Impl1.write) {
                if (this.RemoteActionCompatParcelizer == frameMetricsAggregatorFrameMetricsApi24Impl1.RemoteActionCompatParcelizer) {
                    if (this.serializer == frameMetricsAggregatorFrameMetricsApi24Impl1.serializer) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 21;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 43;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = IconCompatParcelizer + 97;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i7;
            boolean z = i6 % 2 != 0;
            int i8 = i7 + 39;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return z;
            }
            obj2.hashCode();
            throw null;
        }
        int i9 = IconCompatParcelizer + 45;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
