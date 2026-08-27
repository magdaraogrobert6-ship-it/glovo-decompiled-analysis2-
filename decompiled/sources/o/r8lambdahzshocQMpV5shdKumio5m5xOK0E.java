package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.data.model.Analytics$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdahCzl79tp_ropVRUma4k6vsEoRgU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdahzshocQMpV5shdKumio5m5xOK0E {
    public static final Analytics$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.Analytics$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambdahCzl79tp_ropVRUma4k6vsEoRgU r8lambdahczl79tp_ropvruma4k6vseorgu = r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdahCzl79tp_ropVRUma4k6vsEoRgU r8lambdahczl79tp_ropvruma4k6vseorgu2 = r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer;
            int i3 = read + 57;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return r8lambdahczl79tp_ropvruma4k6vseorgu2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String screenName;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.Analytics$Companion] */
    static {
        int i = serializer + 103;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    public /* synthetic */ r8lambdahzshocQMpV5shdKumio5m5xOK0E(int i, String str) {
        if (1 == (i & 1)) {
            this.screenName = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.screenName.hashCode();
        int i4 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m("Analytics(screenName=", this.screenName, ")");
            int i3 = 57 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("Analytics(screenName=", this.screenName, ")");
        }
        int i4 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdahzshocQMpV5shdKumio5m5xOK0E) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.screenName, ((r8lambdahzshocQMpV5shdKumio5m5xOK0E) obj).screenName}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 41;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                z = i3 % 2 == 0;
                int i4 = i2 + 37;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            return z;
        }
        int i6 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
