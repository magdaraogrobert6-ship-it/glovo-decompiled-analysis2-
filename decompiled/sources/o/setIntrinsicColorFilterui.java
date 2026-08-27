package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class setIntrinsicColorFilterui extends getCacheBitmapConfig_sVssgQui {
    public static final HostMessage$HostAppProvidesChatConfig$Companion Companion = new HostMessage$HostAppProvidesChatConfig$Companion();
    public final String messageType;
    public final VectorComponentdrawVectorBlock1 payload;

    @Override // o.getCacheBitmapConfig_sVssgQui
    public final String serializer() {
        return this.messageType;
    }

    public final int hashCode() {
        return this.messageType.hashCode() + (this.payload.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIntrinsicColorFilterui)) {
            return false;
        }
        setIntrinsicColorFilterui setintrinsiccolorfilterui = (setIntrinsicColorFilterui) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, setintrinsiccolorfilterui.payload}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, setintrinsiccolorfilterui.messageType}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostAppProvidesChatConfig(payload=");
        sb.append(this.payload);
        sb.append(", messageType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ')');
    }

    public /* synthetic */ setIntrinsicColorFilterui(int i, VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1, String str) {
        if (1 == (i & 1)) {
            this.payload = vectorComponentdrawVectorBlock1;
            if ((i & 2) == 0) {
                this.messageType = "HOST_APP_PROVIDES_CHAT_CONFIG";
                return;
            } else {
                this.messageType = str;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, VectorComponent1.read.getDescriptor());
        throw null;
    }

    public setIntrinsicColorFilterui(VectorComponentdrawVectorBlock1 vectorComponentdrawVectorBlock1) {
        this.payload = vectorComponentdrawVectorBlock1;
        this.messageType = "HOST_APP_PROVIDES_CHAT_CONFIG";
    }
}
