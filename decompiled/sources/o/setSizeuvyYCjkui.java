package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.domain.push.BodyPayload$Companion;
import kotlinx.serialization.Serializable;
import o.RenderVectorGroup;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class setSizeuvyYCjkui {
    public static final BodyPayload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.domain.push.BodyPayload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return RenderVectorGroup.write;
        }
    };
    public final String channelType;
    public final String chatID;
    public final String chatType;
    public final String message;
    public final String orderID;
    public final String title;

    public final String IconCompatParcelizer() {
        return this.title;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.orderID;
    }

    public final String read() {
        return this.chatID;
    }

    public final String serializer() {
        return this.channelType;
    }

    public final String write() {
        return this.message;
    }

    public final int hashCode() {
        return this.title.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.chatType.hashCode() * 31, 31, this.orderID), 31, this.chatID), 31, this.channelType), 31, this.message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSizeuvyYCjkui)) {
            return false;
        }
        setSizeuvyYCjkui setsizeuvyycjkui = (setSizeuvyYCjkui) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatType, setsizeuvyycjkui.chatType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderID, setsizeuvyycjkui.orderID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatID, setsizeuvyycjkui.chatID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channelType, setsizeuvyycjkui.channelType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, setsizeuvyycjkui.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, setsizeuvyycjkui.title}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BodyPayload(chatType=");
        sb.append(this.chatType);
        sb.append(", orderID=");
        sb.append(this.orderID);
        sb.append(", chatID=");
        sb.append(this.chatID);
        sb.append(", channelType=");
        sb.append(this.channelType);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", title=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.title, ')');
    }

    public /* synthetic */ setSizeuvyYCjkui(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 == (i & 63)) {
            this.chatType = str;
            this.orderID = str2;
            this.chatID = str3;
            this.channelType = str4;
            this.message = str5;
            this.title = str6;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, RenderVectorGroup.write.getDescriptor());
        throw null;
    }
}
