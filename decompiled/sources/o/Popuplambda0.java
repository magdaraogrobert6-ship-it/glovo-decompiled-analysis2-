package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$StackMessage$Companion;
import kotlinx.serialization.Serializable;
import o.accesstoIntBounds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "stack_graphic_message")
public final class Popuplambda0 extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$StackMessage$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$StackMessage$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            accesstoIntBounds accesstointbounds;
            int i = 2 % 2;
            int i2 = read + 53;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                accesstointbounds = accesstoIntBounds.read;
                int i3 = 43 / 0;
            } else {
                accesstointbounds = accesstoIntBounds.read;
            }
            int i4 = read + 91;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
            return accesstointbounds;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$StackMessage$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 69;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ Popuplambda0(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.subtitle = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accesstoIntBounds.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StackMessage(title=", this.title, ", subtitle=", this.subtitle, ")");
            int i3 = read + 53;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StackMessage(title=", this.title, ", subtitle=", this.subtitle, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.subtitle.hashCode() + (this.title.hashCode() * 31);
        int i4 = write + 75;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Popuplambda0)) {
            int i4 = i2 + 53;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i4 % 2 == 0;
            int i5 = i2 + 101;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return z;
        }
        Popuplambda0 popuplambda0 = (Popuplambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, popuplambda0.title}, getCieXyz.write())).booleanValue()) {
            int i7 = read + 93;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, popuplambda0.subtitle}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = read + 27;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
