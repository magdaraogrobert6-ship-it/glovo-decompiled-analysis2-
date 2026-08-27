package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.api.data.StopWorkingRequest$Companion;
import kotlinx.serialization.Serializable;
import o.changeUserlambda12;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class changeUserlambda13 {
    public static final StopWorkingRequest$Companion Companion = new Object() { // from class: com.roadrunner.startworking.api.data.StopWorkingRequest$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 29;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            changeUserlambda12 changeuserlambda12 = changeUserlambda12.serializer;
            int i4 = RemoteActionCompatParcelizer + 9;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return changeuserlambda12;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String action;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.api.data.StopWorkingRequest$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 63;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ changeUserlambda13(int i, String str) {
        if (1 == (i & 1)) {
            this.action = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, changeUserlambda12.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.action.hashCode();
        int i4 = IconCompatParcelizer + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("StopWorkingRequest(action=", this.action, ")");
            int i3 = IconCompatParcelizer + 43;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("StopWorkingRequest(action=", this.action, ")");
        throw null;
    }

    public changeUserlambda13(String str) {
        str.getClass();
        this.action = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof changeUserlambda13) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, ((changeUserlambda13) obj).action}, getCieXyz.write())).booleanValue();
        }
        int i5 = i2 + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
