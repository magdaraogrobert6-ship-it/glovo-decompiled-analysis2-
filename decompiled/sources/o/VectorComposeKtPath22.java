package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostSendsNewAccessToken$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtPath22 extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostSendsNewAccessToken$Companion Companion = new HostMessage$HostSendsNewAccessToken$Companion();
    public final String id;
    public final String messageType;
    public final VectorComposeKtPath212 payload;

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
        if (!(obj instanceof VectorComposeKtPath22)) {
            return false;
        }
        VectorComposeKtPath22 vectorComposeKtPath22 = (VectorComposeKtPath22) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, vectorComposeKtPath22.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, vectorComposeKtPath22.payload}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, vectorComposeKtPath22.messageType}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostSendsNewAccessToken(id=");
        sb.append(this.id);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", messageType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ')');
    }

    public /* synthetic */ VectorComposeKtPath22(int i, String str, VectorComposeKtPath212 vectorComposeKtPath212, String str2) {
        if (3 == (i & 3)) {
            this.id = str;
            this.payload = vectorComposeKtPath212;
            if ((i & 4) == 0) {
                this.messageType = "HOST_SENDS_NEW_ACCESS_TOKEN";
                return;
            } else {
                this.messageType = str2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, VectorComposeKtPath211.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public VectorComposeKtPath22(String str, VectorComposeKtPath212 vectorComposeKtPath212) {
        this.id = str;
        this.payload = vectorComposeKtPath212;
        this.messageType = "HOST_SENDS_NEW_ACCESS_TOKEN";
    }
}
