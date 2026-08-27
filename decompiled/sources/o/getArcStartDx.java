package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientChatTranslationToggled$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeReflectiveCurveTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_TRANSLATION_TOGGLE_CLICK")
public final class getArcStartDx extends getY2 {
    public static final BridgeMessage$ClientChatTranslationToggled$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientChatTranslationToggled$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeReflectiveCurveTo.write;
        }
    };
    public final String bridgeMessageID;
    public final PathNodeReflectiveQuadTo payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getArcStartDx)) {
            return false;
        }
        getArcStartDx getarcstartdx = (getArcStartDx) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, getarcstartdx.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, getarcstartdx.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ClientChatTranslationToggled(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getArcStartDx(int i, String str, String str2, String str3, PathNodeReflectiveQuadTo pathNodeReflectiveQuadTo) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = pathNodeReflectiveQuadTo;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PathNodeReflectiveCurveTo.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getArcStartDx(String str, PathNodeReflectiveQuadTo pathNodeReflectiveQuadTo) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_TRANSLATION_TOGGLE_CLICK", 0);
        pathNodeReflectiveQuadTo.getClass();
        this.bridgeMessageID = str;
        this.payload = pathNodeReflectiveQuadTo;
    }
}
