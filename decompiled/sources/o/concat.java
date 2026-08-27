package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.laststop.api.data.models.SaveLastStopRequest$Companion;
import kotlinx.serialization.Serializable;
import o.drawPicture;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class concat {
    public static final SaveLastStopRequest$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.SaveLastStopRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            drawPicture drawpicture = drawPicture.serializer;
            int i4 = IconCompatParcelizer + 95;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return drawpicture;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String address;
    public final onActivityPreCreated location;
    public final String timestamp;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.SaveLastStopRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ concat(int i, onActivityPreCreated onactivityprecreated, String str, String str2) {
        if (7 == (i & 7)) {
            this.location = onactivityprecreated;
            this.address = str;
            this.timestamp = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, drawPicture.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.timestamp.hashCode() + af$$ExternalSyntheticOutline0.m(this.location.hashCode() * 31, 31, this.address);
        int i4 = serializer + 111;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return iHashCode;
    }

    public concat(onActivityPreCreated onactivityprecreated, String str, String str2) {
        onactivityprecreated.getClass();
        str.getClass();
        str2.getClass();
        this.location = onactivityprecreated;
        this.address = str;
        this.timestamp = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SaveLastStopRequest(location=");
        sb.append(this.location);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", timestamp=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.timestamp, ")");
        int i2 = RemoteActionCompatParcelizer + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 53;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof concat) {
            concat concatVar = (concat) obj;
            Object[] objArr = {this.location, concatVar.location};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.address, concatVar.address};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.timestamp, concatVar.timestamp};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = serializer;
            int i5 = i4 + 23;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 79;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = serializer + 89;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
