package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.heatmap.data.HeatmapResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AbsSavedState1 {
    public static final HeatmapResponse$Companion Companion = new HeatmapResponse$Companion();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String url;

    static {
        int i = read + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AbsSavedState1(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, SimpleActoroffer2.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.url.hashCode();
            int i3 = 75 / 0;
        } else {
            iHashCode = this.url.hashCode();
        }
        int i4 = serializer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("HeatmapResponse(url=", this.url, ")");
        int i4 = serializer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsSavedState1)) {
            int i4 = i3 + 87;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, ((AbsSavedState1) obj).url}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = serializer + 51;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
