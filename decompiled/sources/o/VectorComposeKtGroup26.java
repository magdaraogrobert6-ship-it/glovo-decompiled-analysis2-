package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostIsReady$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtGroup26 extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostIsReady$Companion Companion = new HostMessage$HostIsReady$Companion();
    public final String id;
    public final String messageType;
    public final VectorComposeKtPath11 payload;

    @Override // o.getCacheBitmapConfig_sVssgQui
    public final String serializer() {
        return this.messageType;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        return this.messageType.hashCode() + ((this.payload.hashCode() + (iHashCode * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposeKtGroup26)) {
            return false;
        }
        VectorComposeKtGroup26 vectorComposeKtGroup26 = (VectorComposeKtGroup26) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, vectorComposeKtGroup26.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, vectorComposeKtGroup26.payload}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, vectorComposeKtGroup26.messageType}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostIsReady(id=");
        sb.append(this.id);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", messageType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ')');
    }

    public /* synthetic */ VectorComposeKtGroup26(int i, String str, VectorComposeKtPath11 vectorComposeKtPath11, String str2) {
        if (3 == (i & 3)) {
            this.id = str;
            this.payload = vectorComposeKtPath11;
            if ((i & 4) == 0) {
                this.messageType = "HOST_IS_READY";
                return;
            } else {
                this.messageType = str2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, VectorComposeKtGroup29.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public VectorComposeKtGroup26(String str, VectorComposeKtPath11 vectorComposeKtPath11) {
        this.id = str;
        this.payload = vectorComposeKtPath11;
        this.messageType = "HOST_IS_READY";
    }
}
