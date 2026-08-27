package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Info$Companion;
import kotlinx.serialization.Serializable;
import o.gatherTransparentRegion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "info")
public final class getLayoutParams implements getRelease {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Info$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Info$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            gatherTransparentRegion gathertransparentregion;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 63;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                gathertransparentregion = gatherTransparentRegion.write;
                int i3 = 25 / 0;
            } else {
                gathertransparentregion = gatherTransparentRegion.write;
            }
            int i4 = RemoteActionCompatParcelizer + 19;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return gathertransparentregion;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Info$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 73;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getLayoutParams(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.subtitle = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, gatherTransparentRegion.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Info(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Info(title=", this.title, ", subtitle=", this.subtitle, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.subtitle.hashCode() + (this.title.hashCode() * 31);
        int i4 = IconCompatParcelizer + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 77;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getLayoutParams)) {
            return false;
        }
        getLayoutParams getlayoutparams = (getLayoutParams) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getlayoutparams.title}, getCieXyz.write())).booleanValue())) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, getlayoutparams.subtitle}, getCieXyz.write())).booleanValue();
        }
        int i3 = read + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
