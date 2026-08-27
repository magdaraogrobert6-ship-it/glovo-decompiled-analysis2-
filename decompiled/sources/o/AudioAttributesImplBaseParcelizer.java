package o;

import com.roadrunner.home.nest.api.data.NestNavBarComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AudioAttributesImplBaseParcelizer extends DelegatingFrameMetricsListener {
    public static final NestNavBarComponent$Companion Companion = new NestNavBarComponent$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final access200 data;
    public final String type;

    static {
        int i = IconCompatParcelizer + 117;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public AudioAttributesImplBaseParcelizer(int i, access200 access200Var, String str) {
        if (1 == (i & 1)) {
            this.data = access200Var;
            if ((i & 2) == 0) {
                this.type = "nest_nav_bar";
                int i2 = write + 51;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.type = str;
            int i3 = write + 77;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 49 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, MultiDex.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.data.items.hashCode();
        int i4 = serializer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NestNavBarComponent(data=" + this.data + ")";
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 75;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 99;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof AudioAttributesImplBaseParcelizer) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((AudioAttributesImplBaseParcelizer) obj).data}, getCieXyz.write())).booleanValue();
        }
        int i8 = i2 + 63;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
