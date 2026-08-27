package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.domain.push.PushPayload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class createGroupComponent {
    public static final PushPayload$Companion Companion = new PushPayload$Companion();
    public final setSizeuvyYCjkui body;
    public final String hcChatMessage;
    public final String version;

    public final String IconCompatParcelizer() {
        return this.version;
    }

    public final setSizeuvyYCjkui serializer() {
        return this.body;
    }

    public final int hashCode() {
        return this.body.hashCode() + af$$ExternalSyntheticOutline0.m(this.hcChatMessage.hashCode() * 31, 31, this.version);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createGroupComponent)) {
            return false;
        }
        createGroupComponent creategroupcomponent = (createGroupComponent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hcChatMessage, creategroupcomponent.hcChatMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, creategroupcomponent.version}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, creategroupcomponent.body}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "PushPayload(hcChatMessage=" + this.hcChatMessage + ", version=" + this.version + ", body=" + this.body + ')';
    }

    public /* synthetic */ createGroupComponent(int i, String str, String str2, setSizeuvyYCjkui setsizeuvyycjkui) {
        if (7 == (i & 7)) {
            this.hcChatMessage = str;
            this.version = str2;
            this.body = setsizeuvyycjkui;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, createColorFilterxETnrds.read.getDescriptor());
        throw null;
    }
}
