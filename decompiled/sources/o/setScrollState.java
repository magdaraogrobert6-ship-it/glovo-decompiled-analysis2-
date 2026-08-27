package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.inappnotifications.data.SpacerComponent$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.startInterceptRequestLayout;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "spacer")
public final class setScrollState implements setLayoutManager, setRecyclerListener {
    public static final SpacerComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.SpacerComponent$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 51;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                startInterceptRequestLayout startinterceptrequestlayout = startInterceptRequestLayout.read;
                throw null;
            }
            startInterceptRequestLayout startinterceptrequestlayout2 = startInterceptRequestLayout.read;
            int i3 = serializer + 71;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return startinterceptrequestlayout2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String size;
    public final Float weight;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.SpacerComponent$Companion] */
    static {
        int i = write + 53;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public /* synthetic */ setScrollState(int i, Float f, String str) {
        if ((i & 1) == 0) {
            this.weight = null;
            int i2 = read + 79;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                this.size = null;
                return;
            }
            this.size = str;
            int i3 = read + 55;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.weight = f;
        int i5 = read + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        if ((i & 2) == 0) {
            this.size = null;
            return;
        }
        this.size = str;
        int i8 = read + 55;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Float f = this.weight;
        int iHashCode2 = 0;
        if (f == null) {
            int i2 = read + 125;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        String str = this.size;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 105;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SpacerComponent(weight=" + this.weight + ", size=" + this.size + ")";
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 103;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 99 / 0;
            }
            return true;
        }
        if (!(obj instanceof setScrollState)) {
            int i4 = RemoteActionCompatParcelizer + 41;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        setScrollState setscrollstate = (setScrollState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, setscrollstate.weight}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.size, setscrollstate.size}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = read;
        int i6 = i5 + 7;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i5 + 91;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
