package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostSendsNewAccessToken$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLinkAnnotations extends getPlaceholderRects {
    public static final HostMessage$HostSendsNewAccessToken$Companion Companion = new HostMessage$HostSendsNewAccessToken$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String id;
    public final String messageType;
    public final getTtsAnnotations payload;

    static {
        int i = write + 91;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 95;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.messageType;
            int i4 = 57 / 0;
        } else {
            str = this.messageType;
        }
        int i5 = i2 + 27;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public /* synthetic */ getLinkAnnotations(int i, String str, getTtsAnnotations getttsannotations, String str2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.id = str;
            this.payload = getttsannotations;
            if ((i & 4) == 0) {
                this.messageType = "HOST_SENDS_NEW_ACCESS_TOKEN";
                int i2 = RemoteActionCompatParcelizer + 85;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.messageType = str2;
            int i4 = RemoteActionCompatParcelizer + 101;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getStringAnnotations.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.messageType.hashCode() * af$$ExternalSyntheticOutline0.m(this.id.hashCode() >> 52, 49, this.payload.accessToken);
        }
        return this.messageType.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.payload.accessToken);
    }

    public getLinkAnnotations(String str, getTtsAnnotations getttsannotations) {
        this.id = str;
        this.payload = getttsannotations;
        this.messageType = "HOST_SENDS_NEW_ACCESS_TOKEN";
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("HostSendsNewAccessToken(id=");
        sb.append(this.id);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", messageType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ")");
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 13;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof getLinkAnnotations)) {
            return false;
        }
        getLinkAnnotations getlinkannotations = (getLinkAnnotations) obj;
        Object[] objArr = {this.id, getlinkannotations.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr2 = {this.payload, getlinkannotations.payload};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.messageType, getlinkannotations.messageType};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i8 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
