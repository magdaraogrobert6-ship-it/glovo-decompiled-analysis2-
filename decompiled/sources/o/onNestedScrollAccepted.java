package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$BlockRider$Companion;
import kotlinx.serialization.Serializable;
import o.onStopNestedScroll;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "block_rider")
public final class onNestedScrollAccepted implements onWindowVisibilityChanged {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$BlockRider$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$BlockRider$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            onStopNestedScroll onstopnestedscroll;
            int i = 2 % 2;
            int i2 = serializer + 115;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                onstopnestedscroll = onStopNestedScroll.read;
                int i3 = 40 / 0;
            } else {
                onstopnestedscroll = onStopNestedScroll.read;
            }
            int i4 = write + 83;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onstopnestedscroll;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$BlockRider$Companion] */
    static {
        int i = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ onNestedScrollAccepted(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.subtitle = null;
                int i2 = serializer + 7;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.subtitle = str2;
            int i4 = read + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, onStopNestedScroll.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BlockRider(title=", this.title, ", subtitle=", this.subtitle, ")");
        int i4 = read + 55;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        String str = this.subtitle;
        if (str == null) {
            int i2 = read + 73;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = read + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof onNestedScrollAccepted))) {
            onNestedScrollAccepted onnestedscrollaccepted = (onNestedScrollAccepted) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, onnestedscrollaccepted.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, onnestedscrollaccepted.subtitle}, getCieXyz.write())).booleanValue();
        }
        int i5 = i2 + 49;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 != 0;
    }
}
