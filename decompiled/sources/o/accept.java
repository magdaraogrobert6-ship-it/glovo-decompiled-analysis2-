package o;

import com.roadrunner.home.nest.api.data.SuspendedStateComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accept extends DelegatingFrameMetricsListener {
    public static final SuspendedStateComponent$Companion Companion = new SuspendedStateComponent$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final ZipUtil data;
    public final String type;

    static {
        int i = read + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public accept(int i, ZipUtil zipUtil, String str) {
        if (1 == (i & 1)) {
            this.data = zipUtil;
            if ((i & 2) == 0) {
                this.type = "suspended_state";
                int i2 = RemoteActionCompatParcelizer + 77;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.type = str;
            int i4 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, MultiDexExtractor1.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        int i4 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SuspendedStateComponent(data=" + this.data + ")";
        int i2 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accept)) {
            return false;
        }
        Object obj2 = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((accept) obj).data}, getCieXyz.write())).booleanValue()) {
            int i2 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 25;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }
}
