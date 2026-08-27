package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostSendsNewAccessToken$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComposeKtPath213;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtPath212 {
    public static final HostMessage$HostSendsNewAccessToken$Payload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostSendsNewAccessToken$Payload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKtPath213.write;
        }
    };
    public final String accessToken;

    public final int hashCode() {
        return this.accessToken.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposeKtPath212)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, ((VectorComposeKtPath212) obj).accessToken}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Payload(accessToken="), this.accessToken, ')');
    }

    public /* synthetic */ VectorComposeKtPath212(int i, String str) {
        if (1 == (i & 1)) {
            this.accessToken = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, VectorComposeKtPath213.write.getDescriptor());
            throw null;
        }
    }

    public VectorComposeKtPath212(String str) {
        str.getClass();
        this.accessToken = str;
    }
}
