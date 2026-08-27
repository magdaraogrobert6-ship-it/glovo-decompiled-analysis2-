package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Request$Companion;
import kotlinx.serialization.Serializable;
import o.invalidateOrDefer;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getUpdate {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Request$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Request$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 47;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            invalidateOrDefer invalidateordefer = invalidateOrDefer.write;
            int i4 = serializer + 69;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return invalidateordefer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String method;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Report$Request$Companion] */
    static {
        int i = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getUpdate(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.url = str;
            this.method = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, invalidateOrDefer.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Request(url=", this.url, ", method=", this.method, ")");
        }
        int i3 = 11 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Request(url=", this.url, ", method=", this.method, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.method.hashCode() + (this.url.hashCode() * 31);
        int i4 = serializer + 55;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUpdate)) {
            return false;
        }
        getUpdate getupdate = (getUpdate) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, getupdate.url}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.method, getupdate.method}, getCieXyz.write())).booleanValue()) {
                int i4 = write + 31;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i5 = serializer + 69;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = serializer + 55;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
