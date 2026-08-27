package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.ReasonBridgeMessage$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EmojiCompatInitializer extends getListParameter {
    public static final ReasonBridgeMessage$Companion Companion = new ReasonBridgeMessage$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String id;
    public final EmojiCompatInitCallback payload;
    public final String type;

    static {
        int i = serializer + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getListParameter
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 53;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getListParameter
    public final String serializer() {
        int i = 2 % 2;
        int i2 = read + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ EmojiCompatInitializer(int i, String str, String str2, EmojiCompatInitCallback emojiCompatInitCallback) {
        if (7 == (i & 7)) {
            this.id = str;
            this.type = str2;
            this.payload = emojiCompatInitCallback;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, EmojiCompatInitializer1.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type) + this.payload.hashCode();
        }
        return this.payload.hashCode() >> af$$ExternalSyntheticOutline0.m(this.id.hashCode() >> 4, 64, this.type);
    }

    public EmojiCompatInitializer(EmojiCompatInitCallback emojiCompatInitCallback) {
        this.id = "HOST_SENDS_AUTO_CHAT_PARAMS";
        this.type = "HOST_SENDS_AUTO_CHAT_PARAMS";
        this.payload = emojiCompatInitCallback;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ReasonBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
            sbM.append(this.payload);
            sbM.append(")");
            string = sbM.toString();
            int i3 = 60 / 0;
        } else {
            StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("ReasonBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
            sbM2.append(this.payload);
            sbM2.append(")");
            string = sbM2.toString();
        }
        int i4 = read + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiCompatInitializer)) {
            int i4 = i2 + 81;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        EmojiCompatInitializer emojiCompatInitializer = (EmojiCompatInitializer) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, emojiCompatInitializer.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, emojiCompatInitializer.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, emojiCompatInitializer.payload}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = write + 117;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
