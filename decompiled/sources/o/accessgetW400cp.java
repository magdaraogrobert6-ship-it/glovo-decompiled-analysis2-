package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.Analytics;
import com.roadrunner.delivery.destination.data.models.Metadata$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetW700cp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class accessgetW400cp {
    public static final Metadata$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.Metadata$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 57;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetW700cp accessgetw700cp = accessgetW700cp.RemoteActionCompatParcelizer;
            int i4 = write + 51;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessgetw700cp;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final Analytics analytics;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.Metadata$Companion] */
    static {
        int i = write + 95;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessgetW400cp(int i, Analytics analytics) {
        if ((i & 1) == 0) {
            this.analytics = null;
            int i2 = RemoteActionCompatParcelizer + 73;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.analytics = analytics;
        int i4 = RemoteActionCompatParcelizer + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        Analytics analytics = this.analytics;
        if (analytics == null) {
            int i2 = read + 5;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0 ? 1 : 0;
        }
        int iHashCode = analytics.hashCode();
        int i3 = RemoteActionCompatParcelizer + 125;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Metadata(analytics=" + this.analytics + ")";
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 95;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof accessgetW400cp)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.analytics, ((accessgetW400cp) obj).analytics}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read + 49;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 123;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
