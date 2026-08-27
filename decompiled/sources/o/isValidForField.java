package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.ErrorBridgeMessage$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isValidForField extends getListParameter {
    public static final ErrorBridgeMessage$Companion Companion = new ErrorBridgeMessage$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String id;
    public final isScalar payload;
    public final String type;

    static {
        int i = write + 73;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getListParameter
    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            str = this.id;
            int i4 = 69 / 0;
        } else {
            str = this.id;
        }
        int i5 = i3 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    @Override // o.getListParameter
    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.type;
            int i4 = 40 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ isValidForField(int i, String str, String str2, isScalar isscalar) {
        if (7 == (i & 7)) {
            this.id = str;
            this.type = str2;
            this.payload = isscalar;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, InvalidProtocolBufferExceptionInvalidWireTypeException.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.payload.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type);
        int i4 = IconCompatParcelizer + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return iHashCode;
    }

    public isValidForField(String str, isScalar isscalar) {
        this.id = str;
        this.type = "HOST_ENCOUNTERED_ERROR";
        this.payload = isscalar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ErrorBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
        sbM.append(this.payload);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 69;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isValidForField)) {
            return false;
        }
        isValidForField isvalidforfield = (isValidForField) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, isvalidforfield.id}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, isvalidforfield.type}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, isvalidforfield.payload}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 5;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = IconCompatParcelizer + 83;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
