package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitWillStart$Companion;
import kotlinx.serialization.Serializable;
import o.getParagraphDirection;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_INIT_WILL_START")
public final class getRangeForRect86BmAI extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$InitWillStart$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitWillStart$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 51;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getParagraphDirection getparagraphdirection = getParagraphDirection.RemoteActionCompatParcelizer;
                throw null;
            }
            getParagraphDirection getparagraphdirection2 = getParagraphDirection.RemoteActionCompatParcelizer;
            int i3 = IconCompatParcelizer + 49;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getparagraphdirection2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String bridgeMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$InitWillStart$Companion] */
    static {
        int i = write + 39;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.bridgeMessageId;
        int i5 = i3 + 81;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getRangeForRect86BmAI(int i, String str, String str2) {
        super(str);
        if (7 == (i & 7)) {
            this.bridgeMessageId = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getParagraphDirection.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.bridgeMessageId.hashCode();
            int i3 = 31 / 0;
        } else {
            iHashCode = this.bridgeMessageId.hashCode();
        }
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("InitWillStart(bridgeMessageId=", this.bridgeMessageId, ")");
        int i4 = RemoteActionCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public getRangeForRect86BmAI(String str) {
        super("HELPCENTER_INIT_WILL_START", 0);
        this.bridgeMessageId = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getRangeForRect86BmAI) {
                Object[] objArr = {this.bridgeMessageId, ((getRangeForRect86BmAI) obj).bridgeMessageId};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 49;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 79;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 93;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
