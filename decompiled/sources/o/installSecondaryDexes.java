package o;

import com.roadrunner.home.nest.api.data.RiderStateSummaryComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class installSecondaryDexes extends DelegatingFrameMetricsListener {
    public static final RiderStateSummaryComponent$Companion Companion = new RiderStateSummaryComponent$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final MultiDexV14JBMR11ElementConstructor data;
    public final String type;

    static {
        int i = read + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 119;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public installSecondaryDexes(int i, MultiDexV14JBMR11ElementConstructor multiDexV14JBMR11ElementConstructor, String str) {
        if (1 == (i & 1)) {
            this.data = multiDexV14JBMR11ElementConstructor;
            if ((i & 2) == 0) {
                this.type = "rider_state_summary";
                int i2 = IconCompatParcelizer + 95;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.type = str;
            int i3 = write + 29;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, MultiDexV14ElementConstructor.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.data.hashCode();
            int i3 = 26 / 0;
        } else {
            iHashCode = this.data.hashCode();
        }
        int i4 = IconCompatParcelizer + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderStateSummaryComponent(data=" + this.data + ")";
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof installSecondaryDexes))) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((installSecondaryDexes) obj).data}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 51;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
