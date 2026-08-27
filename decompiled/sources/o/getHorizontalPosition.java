package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Companion;
import kotlinx.serialization.Serializable;
import o.getDidExceedMaxLines;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_QUICK_REPLY_SENT")
public final class getHorizontalPosition extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientQuickReplyMessageSelected$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getDidExceedMaxLines getdidexceedmaxlines = getDidExceedMaxLines.read;
            int i4 = IconCompatParcelizer + 111;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getdidexceedmaxlines;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String bridgeMessageId;
    public final getLineAscentui_text payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Companion] */
    static {
        int i = serializer + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 113;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.bridgeMessageId;
        int i5 = i2 + 69;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getHorizontalPosition(int i, String str, String str2, getLineAscentui_text getlineascentui_text) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = getlineascentui_text;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getDidExceedMaxLines.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.payload.selectedQuickReply.hashCode() + (this.bridgeMessageId.hashCode() * 31);
        int i4 = write + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getHorizontalPosition(String str, getLineAscentui_text getlineascentui_text) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_QUICK_REPLY_SENT", 0);
        getlineascentui_text.getClass();
        this.bridgeMessageId = str;
        this.payload = getlineascentui_text;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientQuickReplyMessageSelected(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHorizontalPosition)) {
            return false;
        }
        getHorizontalPosition gethorizontalposition = (getHorizontalPosition) obj;
        Object[] objArr = {this.bridgeMessageId, gethorizontalposition.bridgeMessageId};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.payload, gethorizontalposition.payload};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = IconCompatParcelizer + 47;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
