package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.breakrequest.data.entity.BreakRequestOptionsResponse$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setProductId;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setCallbackId {
    public static final BreakRequestOptionsResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.breakrequest.data.entity.BreakRequestOptionsResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 13;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setProductId.write;
            }
            setProductId setproductid = setProductId.write;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String localizeKey;
    public final String message;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.breakrequest.data.entity.BreakRequestOptionsResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 91;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ setCallbackId(int i, String str, String str2, String str3) {
        if (3 == (i & 3)) {
            this.value = str;
            this.message = str2;
            if ((i & 4) == 0) {
                this.localizeKey = "";
                int i2 = read + 121;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.localizeKey = str3;
            int i4 = read + 45;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setProductId.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.localizeKey.hashCode() + af$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.message);
        int i4 = RemoteActionCompatParcelizer + 99;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BreakRequestOptionsResponse(value=", this.value, ", message=", this.message, ", localizeKey="), this.localizeKey, ")");
        int i4 = RemoteActionCompatParcelizer + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCallbackId)) {
            return false;
        }
        setCallbackId setcallbackid = (setCallbackId) obj;
        Object[] objArr = {this.value, setcallbackid.value};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.message, setcallbackid.message};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            Object[] objArr3 = {this.localizeKey, setcallbackid.localizeKey};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read;
            int i3 = i2 + 49;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i6 = RemoteActionCompatParcelizer + 39;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
