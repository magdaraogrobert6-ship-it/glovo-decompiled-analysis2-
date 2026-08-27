package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$Ack$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class getIntrinsicColorFilterui extends getCacheBitmapConfig_sVssgQui {
    public final String messageType;
    public final getY2 receivedMessage;
    public static final HostMessage$Ack$Companion Companion = new HostMessage$Ack$Companion();
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {getY2.Companion.serializer(), null};

    @Override // o.getCacheBitmapConfig_sVssgQui
    public final String serializer() {
        return this.messageType;
    }

    public final int hashCode() {
        return this.messageType.hashCode() + (this.receivedMessage.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIntrinsicColorFilterui)) {
            return false;
        }
        getIntrinsicColorFilterui getintrinsiccolorfilterui = (getIntrinsicColorFilterui) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.receivedMessage, getintrinsiccolorfilterui.receivedMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, getintrinsiccolorfilterui.messageType}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ack(receivedMessage=");
        sb.append(this.receivedMessage);
        sb.append(", messageType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.messageType, ')');
    }

    public getIntrinsicColorFilterui(int i, getY2 gety2, String str) {
        if (1 == (i & 1)) {
            this.receivedMessage = gety2;
            if ((i & 2) == 0) {
                this.messageType = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), gety2.messageType, "_ACK");
                return;
            } else {
                this.messageType = str;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setInvalidateCallbackui.serializer.getDescriptor());
        throw null;
    }

    public getIntrinsicColorFilterui(getY2 gety2) {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), gety2.messageType, "_ACK");
        this.receivedMessage = gety2;
        this.messageType = strM;
    }
}
