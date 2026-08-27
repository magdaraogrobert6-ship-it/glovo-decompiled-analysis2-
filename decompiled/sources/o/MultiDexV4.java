package o;

import com.roadrunner.home.nest.api.data.RiderStatisticsComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexV4 extends DelegatingFrameMetricsListener {
    public static final RiderStatisticsComponent$Companion Companion = new RiderStatisticsComponent$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final MultiDexExtractor data;
    public final String type;

    static {
        int i = IconCompatParcelizer + 73;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        int i3 = 98 / 0;
        return this.type;
    }

    public MultiDexV4(int i, MultiDexExtractor multiDexExtractor, String str) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.data = multiDexExtractor;
            if ((i & 2) == 0) {
                this.type = "rider_statistics";
                int i2 = RemoteActionCompatParcelizer + 23;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.type = str;
            int i3 = read + 47;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, MultiDexV19.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.data.items.hashCode();
        }
        int i3 = 86 / 0;
        return this.data.items.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderStatisticsComponent(data=" + this.data + ")";
        int i2 = RemoteActionCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 119;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof MultiDexV4)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((MultiDexV4) obj).data}, getCieXyz.write())).booleanValue();
    }
}
