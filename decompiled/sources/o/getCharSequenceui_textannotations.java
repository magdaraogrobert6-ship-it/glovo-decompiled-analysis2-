package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesChatOpen$Companion;
import kotlinx.serialization.Serializable;
import o.constructTextLayoutdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_OPEN")
public final class getCharSequenceui_textannotations extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientNotifiesChatOpen$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesChatOpen$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 113;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            constructTextLayoutdefault constructtextlayoutdefault = constructTextLayoutdefault.IconCompatParcelizer;
            int i4 = write + 93;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return constructtextlayoutdefault;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String bridgeMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesChatOpen$Companion] */
    static {
        int i = read + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.bridgeMessageId;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getCharSequenceui_textannotations(int i, String str, String str2) {
        super(str);
        if (7 == (i & 7)) {
            this.bridgeMessageId = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, constructTextLayoutdefault.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.bridgeMessageId.hashCode();
        int i4 = serializer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("ClientNotifiesChatOpen(bridgeMessageId=", this.bridgeMessageId, ")");
            int i3 = serializer + 31;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("ClientNotifiesChatOpen(bridgeMessageId=", this.bridgeMessageId, ")");
        throw null;
    }

    public getCharSequenceui_textannotations(String str) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_CHAT_OPEN", 0);
        this.bridgeMessageId = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getCharSequenceui_textannotations)) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageId, ((getCharSequenceui_textannotations) obj).bridgeMessageId}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i5 = serializer + 41;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 27;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
