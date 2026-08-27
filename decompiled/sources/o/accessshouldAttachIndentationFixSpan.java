package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Companion;
import java.util.UUID;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessshouldAttachIndentationFixSpan extends getPlaceholderRects {
    public static final HostMessage$HostEncounteredError$Companion Companion = new HostMessage$HostEncounteredError$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String id;
    public final String messageType;
    public final accesstoLayoutLineBreakWordStylewPN0Rpw payload;

    static {
        int i = read + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.messageType;
        int i5 = i3 + 49;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ accessshouldAttachIndentationFixSpan(int i, String str, String str2, accesstoLayoutLineBreakWordStylewPN0Rpw accesstolayoutlinebreakwordstylewpn0rpw) {
        if (4 != (i & 4)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, accesstoLayoutBreakStrategyxImikfE.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            str = "HOST_ENCOUNTERED_ERROR-" + UUID.randomUUID();
        }
        this.id = str;
        if ((i & 2) == 0) {
            int i2 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.messageType = "HOST_ENCOUNTERED_ERROR";
            int i4 = 2 % 2;
        } else {
            this.messageType = str2;
        }
        this.payload = accesstolayoutlinebreakwordstylewpn0rpw;
        int i5 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.payload.hashCode() % af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 103, 70, this.messageType);
        }
        return this.payload.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.messageType);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HostEncounteredError(id=", this.id, ", messageType=", this.messageType, ", payload=");
        sbM.append(this.payload);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 117;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof accessshouldAttachIndentationFixSpan)) {
            return false;
        }
        accessshouldAttachIndentationFixSpan accessshouldattachindentationfixspan = (accessshouldAttachIndentationFixSpan) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, accessshouldattachindentationfixspan.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, accessshouldattachindentationfixspan.messageType}, getCieXyz.write())).booleanValue())) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, accessshouldattachindentationfixspan.payload}, getCieXyz.write())).booleanValue();
        }
        int i3 = RemoteActionCompatParcelizer + 47;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 91;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return false;
    }

    public accessshouldAttachIndentationFixSpan(String str, accesstoLayoutLineBreakWordStylewPN0Rpw accesstolayoutlinebreakwordstylewpn0rpw) {
        this.id = str;
        this.messageType = "HOST_ENCOUNTERED_ERROR";
        this.payload = accesstolayoutlinebreakwordstylewpn0rpw;
    }
}
