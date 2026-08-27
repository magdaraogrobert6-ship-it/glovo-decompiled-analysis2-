package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Companion;
import kotlinx.serialization.Serializable;
import o.getReset;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "report")
public final class getOnRequestDisallowInterceptTouchEventui implements getRelease {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 87;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getReset.read;
            }
            getReset getreset = getReset.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final boolean hasPerformed;
    public final getUpdate request;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Companion] */
    static {
        int i = write + 25;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getOnRequestDisallowInterceptTouchEventui(int i, boolean z, getUpdate getupdate) {
        if (3 == (i & 3)) {
            this.hasPerformed = z;
            this.request = getupdate;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getReset.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.request.hashCode() / (Boolean.hashCode(this.hasPerformed) >> 122);
        } else {
            iHashCode = this.request.hashCode() + (Boolean.hashCode(this.hasPerformed) * 31);
        }
        int i3 = IconCompatParcelizer + 111;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 33;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getOnRequestDisallowInterceptTouchEventui)) {
            int i4 = serializer + 93;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getOnRequestDisallowInterceptTouchEventui getonrequestdisallowintercepttoucheventui = (getOnRequestDisallowInterceptTouchEventui) obj;
        if (this.hasPerformed != getonrequestdisallowintercepttoucheventui.hasPerformed) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, getonrequestdisallowintercepttoucheventui.request}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i6 = IconCompatParcelizer + 43;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Report(hasPerformed=" + this.hasPerformed + ", request=" + this.request + ")";
        int i2 = IconCompatParcelizer + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
