package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.FileUrlBridgeMessage$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getDefaultDefault extends getListParameter {
    public static final FileUrlBridgeMessage$Companion Companion = new FileUrlBridgeMessage$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String id;
    public final getBoxedType payload;
    public final String type;

    static {
        int i = write + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getListParameter
    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.id;
            int i4 = 75 / 0;
        } else {
            str = this.id;
        }
        int i5 = i3 + 101;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.getListParameter
    public final String serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 43;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 89;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ getDefaultDefault(int i, String str, String str2, getBoxedType getboxedtype) {
        if (7 == (i & 7)) {
            this.id = str;
            this.type = str2;
            this.payload = getboxedtype;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, isValidType.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.payload.url.hashCode() % af$$ExternalSyntheticOutline0.m(this.id.hashCode() << 20, 117, this.type);
        } else {
            iHashCode = this.payload.url.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type);
        }
        int i3 = RemoteActionCompatParcelizer + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FileUrlBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
            sbM.append(this.payload);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = 8 / 0;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("FileUrlBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
        sbM2.append(this.payload);
        sbM2.append(")");
        return sbM2.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDefaultDefault)) {
            return false;
        }
        getDefaultDefault getdefaultdefault = (getDefaultDefault) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getdefaultdefault.id}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, getdefaultdefault.type}, getCieXyz.write())).booleanValue()) {
                int i4 = read + 89;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getdefaultdefault.payload}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i6 = read + 117;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
