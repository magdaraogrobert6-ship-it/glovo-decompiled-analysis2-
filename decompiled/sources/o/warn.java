package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.data.model.LegacyState$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.warnInProduction;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class warn {
    public static final LegacyState$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.LegacyState$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 59;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return warnInProduction.IconCompatParcelizer;
            }
            warnInProduction warninproduction = warnInProduction.IconCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final lockLogLevel courier;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.LegacyState$Companion] */
    static {
        int i = IconCompatParcelizer + 65;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ warn(int i, lockLogLevel lockloglevel) {
        if (1 == (i & 1)) {
            this.courier = lockloglevel;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, warnInProduction.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.courier.hashCode();
        int i4 = serializer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LegacyState(courier=" + this.courier + ")";
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 1;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof warn)) {
            return false;
        }
        Object[] objArr = {this.courier, ((warn) obj).courier};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = serializer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
