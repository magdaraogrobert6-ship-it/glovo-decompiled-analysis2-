package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeResponse$Companion;
import kotlinx.serialization.Serializable;
import o.ViewInfo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ThreadSafeException {
    public static final TransferChangeResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeResponse$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 97;
            read = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                ViewInfo viewInfo = ViewInfo.write;
                throw null;
            }
            ViewInfo viewInfo2 = ViewInfo.write;
            int i3 = serializer + 81;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return viewInfo2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String status;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.api.model.TransferChangeResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 21;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ThreadSafeException(int i, String str) {
        if (1 == (i & 1)) {
            this.status = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ViewInfo.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.status.hashCode();
            throw null;
        }
        int iHashCode = this.status.hashCode();
        int i3 = IconCompatParcelizer + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m("TransferChangeResponse(status=", this.status, ")");
            int i3 = 66 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("TransferChangeResponse(status=", this.status, ")");
        }
        int i4 = IconCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 9;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof ThreadSafeException) {
            Object[] objArr = {this.status, ((ThreadSafeException) obj).status};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 49;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 105;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
