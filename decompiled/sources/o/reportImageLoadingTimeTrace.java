package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.SupportedBridgeMessage$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class reportImageLoadingTimeTrace extends getListParameter {
    public static final SupportedBridgeMessage$Companion Companion = new SupportedBridgeMessage$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String id;
    public final FlexBuffersFlexBufferException payload;
    public final String type;

    static {
        int i = serializer + 49;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getListParameter
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 27;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 71;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        int i3 = 27 / 0;
        return this.type;
    }

    public /* synthetic */ reportImageLoadingTimeTrace(int i, String str, String str2, FlexBuffersFlexBufferException flexBuffersFlexBufferException) {
        if (7 == (i & 7)) {
            this.id = str;
            this.type = str2;
            this.payload = flexBuffersFlexBufferException;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, EmojiInputFilterInitCallbackImpl.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = this.payload.hashCode() >>> af$$ExternalSyntheticOutline0.m(this.id.hashCode() - 113, 97, this.type);
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type) + this.payload.hashCode();
        }
        int i3 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iM;
    }

    public reportImageLoadingTimeTrace(FlexBuffersFlexBufferException flexBuffersFlexBufferException) {
        this.id = "HOST_IS_READY";
        this.type = "HOST_IS_READY";
        this.payload = flexBuffersFlexBufferException;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SupportedBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
            sbM.append(this.payload);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("SupportedBridgeMessage(id=", this.id, ", type=", this.type, ", payload=");
        sbM2.append(this.payload);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 87;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 25;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i2 + 37;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof reportImageLoadingTimeTrace) {
            reportImageLoadingTimeTrace reportimageloadingtimetrace = (reportImageLoadingTimeTrace) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, reportimageloadingtimetrace.id}, getCieXyz.write())).booleanValue()) {
                int i8 = RemoteActionCompatParcelizer + 107;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, reportimageloadingtimetrace.type}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, reportimageloadingtimetrace.payload}, getCieXyz.write())).booleanValue();
            }
            int i10 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = i2 + 9;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
