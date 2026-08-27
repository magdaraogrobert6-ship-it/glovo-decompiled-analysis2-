package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesMessageSent$Companion;
import kotlinx.serialization.Serializable;
import o.getTextPaintui_textannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_MESSAGE_SENT")
public final class fillBoundingBoxes8ffj60Q extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientNotifiesMessageSent$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesMessageSent$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 105;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getTextPaintui_textannotations gettextpaintui_textannotations = getTextPaintui_textannotations.IconCompatParcelizer;
                throw null;
            }
            getTextPaintui_textannotations gettextpaintui_textannotations2 = getTextPaintui_textannotations.IconCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 95;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return gettextpaintui_textannotations2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String bridgeMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesMessageSent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 119;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.bridgeMessageId;
            int i4 = 83 / 0;
        } else {
            str = this.bridgeMessageId;
        }
        int i5 = i3 + 63;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fillBoundingBoxes8ffj60Q(int i, String str, String str2) {
        super(str);
        if (7 == (i & 7)) {
            this.bridgeMessageId = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getTextPaintui_textannotations.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.bridgeMessageId.hashCode();
            int i3 = 15 / 0;
        } else {
            iHashCode = this.bridgeMessageId.hashCode();
        }
        int i4 = IconCompatParcelizer + 37;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("ClientNotifiesMessageSent(bridgeMessageId=", this.bridgeMessageId, ")");
            int i3 = IconCompatParcelizer + 37;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("ClientNotifiesMessageSent(bridgeMessageId=", this.bridgeMessageId, ")");
        obj.hashCode();
        throw null;
    }

    public fillBoundingBoxes8ffj60Q(String str) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_MESSAGE_SENT", 0);
        this.bridgeMessageId = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof fillBoundingBoxes8ffj60Q) {
            Object[] objArr = {this.bridgeMessageId, ((fillBoundingBoxes8ffj60Q) obj).bridgeMessageId};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = IconCompatParcelizer + 43;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
