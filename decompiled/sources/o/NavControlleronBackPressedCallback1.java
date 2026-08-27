package o;

import com.roadrunner.home.nest.api.data.TripPlannerComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class NavControlleronBackPressedCallback1 extends DelegatingFrameMetricsListener {
    public static final TripPlannerComponent$Companion Companion = new TripPlannerComponent$Companion();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final findCentralDirectory data;
    public final String type;

    static {
        int i = RemoteActionCompatParcelizer + 21;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public NavControlleronBackPressedCallback1(int i, findCentralDirectory findcentraldirectory, String str) {
        if (1 == (i & 1)) {
            this.data = findcentraldirectory;
            if ((i & 2) == 0) {
                this.type = "trip_planner";
                int i2 = serializer + 59;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.type = str;
            int i4 = serializer + 117;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, NavArgsLazy.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.data.hashCode();
        }
        this.data.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TripPlannerComponent(data=" + this.data + ")";
        int i2 = serializer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 15;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(!(obj instanceof NavControlleronBackPressedCallback1))) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((NavControlleronBackPressedCallback1) obj).data}, getCieXyz.write())).booleanValue();
        }
        int i6 = i4 + 33;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
