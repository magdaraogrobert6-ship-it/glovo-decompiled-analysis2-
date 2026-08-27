package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAsksForBackNavigation$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtGroup11 extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostAsksForBackNavigation$Companion Companion = new HostMessage$HostAsksForBackNavigation$Companion();
    public final String id;
    public final String messageType;

    @Override // o.getCacheBitmapConfig_sVssgQui
    public final String serializer() {
        return this.messageType;
    }

    public final int hashCode() {
        return this.messageType.hashCode() + (this.id.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposeKtGroup11)) {
            return false;
        }
        VectorComposeKtGroup11 vectorComposeKtGroup11 = (VectorComposeKtGroup11) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, vectorComposeKtGroup11.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, vectorComposeKtGroup11.messageType}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostAsksForBackNavigation(id=");
        sb.append(this.id);
        sb.append(", messageType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ')');
    }

    public /* synthetic */ VectorComposeKtGroup11(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.messageType = "HOST_ASKS_FOR_BACK_NAVIGATION";
                return;
            } else {
                this.messageType = str2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, VectorComposeKtGroup22.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public VectorComposeKtGroup11(String str) {
        this.id = str;
        this.messageType = "HOST_ASKS_FOR_BACK_NAVIGATION";
    }
}
