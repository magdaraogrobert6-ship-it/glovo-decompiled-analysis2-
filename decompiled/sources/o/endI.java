package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.push.messages.display.backgroud.PushDetailForGhostOrder$Companion;
import kotlinx.serialization.Serializable;
import o.deleteState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class endI {
    public static final PushDetailForGhostOrder$Companion Companion = new Object() { // from class: com.roadrunner.push.messages.display.backgroud.PushDetailForGhostOrder$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 83;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                deleteState deletestate = deleteState.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            deleteState deletestate2 = deleteState.serializer;
            int i3 = serializer + 71;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return deletestate2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String category;
    public final String deliveryId;
    public final String messageNewId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.push.messages.display.backgroud.PushDetailForGhostOrder$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.deliveryId;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 63;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.messageNewId;
        int i5 = i2 + 81;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ endI(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.deliveryId = null;
            int i2 = write + 37;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.deliveryId = str;
        }
        if ((i & 2) == 0) {
            int i4 = write + 11;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.messageNewId = null;
                throw null;
            }
            this.messageNewId = null;
        } else {
            this.messageNewId = str2;
            int i5 = serializer + 53;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.category = null;
        } else {
            this.category = str3;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushDetailForGhostOrder(deliveryId=", this.deliveryId, ", messageNewId=", this.messageNewId, ", category="), this.category, ")");
            int i3 = serializer + 99;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushDetailForGhostOrder(deliveryId=", this.deliveryId, ", messageNewId=", this.messageNewId, ", category="), this.category, ")");
        throw null;
    }

    public endI(String str, String str2, String str3) {
        this.deliveryId = str;
        this.messageNewId = str2;
        this.category = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.deliveryId;
        if (str == null) {
            int i2 = write + 27;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.messageNewId;
        if (str2 == null) {
            int i3 = serializer + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.category;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endI)) {
            return false;
        }
        endI endi = (endI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryId, endi.deliveryId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageNewId, endi.messageNewId}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.category, endi.category}, getCieXyz.write())).booleanValue();
        }
        int i2 = write;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
