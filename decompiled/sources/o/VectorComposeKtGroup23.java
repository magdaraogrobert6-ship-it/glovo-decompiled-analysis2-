package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostEncounteredError$Companion;
import java.util.UUID;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtGroup23 extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostEncounteredError$Companion Companion = new HostMessage$HostEncounteredError$Companion();
    public final String id;
    public final String messageType;
    public final VectorComposeKtGroup28 payload;

    @Override // o.getCacheBitmapConfig_sVssgQui
    public final String serializer() {
        return this.messageType;
    }

    public final int hashCode() {
        return this.payload.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.messageType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposeKtGroup23)) {
            return false;
        }
        VectorComposeKtGroup23 vectorComposeKtGroup23 = (VectorComposeKtGroup23) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, vectorComposeKtGroup23.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, vectorComposeKtGroup23.messageType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, vectorComposeKtGroup23.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HostEncounteredError(id=" + this.id + ", messageType=" + this.messageType + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ VectorComposeKtGroup23(int i, String str, String str2, VectorComposeKtGroup28 vectorComposeKtGroup28) {
        if (4 == (i & 4)) {
            if ((i & 1) == 0) {
                str = "HOST_ENCOUNTERED_ERROR-" + UUID.randomUUID();
            }
            this.id = str;
            if ((i & 2) == 0) {
                this.messageType = "HOST_ENCOUNTERED_ERROR";
            } else {
                this.messageType = str2;
            }
            this.payload = vectorComposeKtGroup28;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, VectorComposeKtGroup21.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public VectorComposeKtGroup23(String str, VectorComposeKtGroup28 vectorComposeKtGroup28) {
        this.id = str;
        this.messageType = "HOST_ENCOUNTERED_ERROR";
        this.payload = vectorComposeKtGroup28;
    }
}
