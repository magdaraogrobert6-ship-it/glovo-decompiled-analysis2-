package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Toggle$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setLayoutInDisplayCutout;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "toggle")
public final class Api33Impl extends invokeozmzZPI {
    public static final StateV3$HostComponent$AutoAcceptComponent$SubComponent$Toggle$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Toggle$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 23;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setLayoutInDisplayCutout setlayoutindisplaycutout = setLayoutInDisplayCutout.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setLayoutInDisplayCutout setlayoutindisplaycutout2 = setLayoutInDisplayCutout.write;
            int i3 = write + 77;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setlayoutindisplaycutout2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String description;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$HostComponent$AutoAcceptComponent$SubComponent$Toggle$Companion] */
    static {
        int i = IconCompatParcelizer + 51;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public /* synthetic */ Api33Impl(int i, String str, String str2) {
        int i2;
        if ((i & 1) == 0) {
            this.title = null;
            int i3 = RemoteActionCompatParcelizer + 55;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 3 % 4;
            }
            if ((i & 2) == 0) {
                this.description = null;
                return;
            }
            this.description = str2;
            i2 = RemoteActionCompatParcelizer + 39;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i5 = 45 / 0;
            }
        }
        this.title = str;
        int i6 = 2 % 2;
        if ((i & 2) == 0) {
            this.description = null;
            return;
        }
        this.description = str2;
        i2 = RemoteActionCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i7 = 45 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Toggle(title=", this.title, ", description=", this.description, ")");
        int i4 = serializer + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.title) != null : (str = this.title) != null) ? str.hashCode() : 0;
        String str2 = this.description;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i3 = serializer + 57;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = RemoteActionCompatParcelizer + 3;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return i5;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 33;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof Api33Impl)) {
            return false;
        }
        Api33Impl api33Impl = (Api33Impl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, api33Impl.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, api33Impl.description}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 75;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
