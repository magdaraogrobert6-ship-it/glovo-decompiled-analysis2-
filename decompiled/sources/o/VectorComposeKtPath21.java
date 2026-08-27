package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtPath21 extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostNotifiesAboutVisibilityChange$Companion Companion = new HostMessage$HostNotifiesAboutVisibilityChange$Companion();
    public final String id;
    public final String messageType;
    public final invokeCSYIeUk payload;

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
        if (!(obj instanceof VectorComposeKtPath21)) {
            return false;
        }
        VectorComposeKtPath21 vectorComposeKtPath21 = (VectorComposeKtPath21) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, vectorComposeKtPath21.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, vectorComposeKtPath21.messageType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, vectorComposeKtPath21.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HostNotifiesAboutVisibilityChange(id=" + this.id + ", messageType=" + this.messageType + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ VectorComposeKtPath21(int i, String str, String str2, invokeCSYIeUk invokecsyieuk) {
        if (5 == (i & 5)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.messageType = "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE";
            } else {
                this.messageType = str2;
            }
            this.payload = invokecsyieuk;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, VectorComposeKtPath210.write.getDescriptor());
        throw null;
    }

    public VectorComposeKtPath21(String str, boolean z) {
        invokeCSYIeUk invokecsyieuk = new invokeCSYIeUk(z);
        this.id = str;
        this.messageType = "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE";
        this.payload = invokecsyieuk;
    }
}
