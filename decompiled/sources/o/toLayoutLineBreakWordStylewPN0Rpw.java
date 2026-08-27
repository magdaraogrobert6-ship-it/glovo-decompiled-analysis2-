package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Companion;
import java.util.UUID;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLayoutLineBreakWordStylewPN0Rpw extends getPlaceholderRects {
    public static final HostMessage$HostLoadingPerformanceMeasurement$Companion Companion = new HostMessage$HostLoadingPerformanceMeasurement$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String id;
    public final String messageType;
    public final AndroidTextStyle_androidKt payload;

    static {
        int i = serializer + 119;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.messageType;
        int i5 = i3 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    public /* synthetic */ toLayoutLineBreakWordStylewPN0Rpw(int i, String str, String str2, AndroidTextStyle_androidKt androidTextStyle_androidKt) {
        Object obj = null;
        if (4 != (i & 4)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, toLayoutHyphenationFrequency3fSNIE.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            str = "HOST_LOADING_PERFORMANCE_MEASUREMENT_" + UUID.randomUUID();
            int i2 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.id = str;
        if ((i & 2) == 0) {
            int i4 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.messageType = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
                obj.hashCode();
                throw null;
            }
            this.messageType = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
        } else {
            this.messageType = str2;
            int i5 = 2 % 2;
        }
        this.payload = androidTextStyle_androidKt;
        int i6 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.payload.hashCode() - af$$ExternalSyntheticOutline0.m(this.id.hashCode() >> 100, 46, this.messageType);
        } else {
            iHashCode = this.payload.hashCode() + af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.messageType);
        }
        int i3 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HostLoadingPerformanceMeasurement(id=", this.id, ", messageType=", this.messageType, ", payload=");
            sbM.append(this.payload);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("HostLoadingPerformanceMeasurement(id=", this.id, ", messageType=", this.messageType, ", payload=");
        sbM2.append(this.payload);
        sbM2.append(")");
        sbM2.toString();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 73;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof toLayoutLineBreakWordStylewPN0Rpw) {
            toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpw = (toLayoutLineBreakWordStylewPN0Rpw) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, tolayoutlinebreakwordstylewpn0rpw.id}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, tolayoutlinebreakwordstylewpn0rpw.messageType}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, tolayoutlinebreakwordstylewpn0rpw.payload}, getCieXyz.write())).booleanValue();
            }
            int i8 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i2 + 99;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public toLayoutLineBreakWordStylewPN0Rpw(AndroidTextStyle_androidKt androidTextStyle_androidKt) {
        this.id = "HOST_LOADING_PERFORMANCE_MEASUREMENT_" + UUID.randomUUID();
        this.messageType = "HOST_LOADING_PERFORMANCE_MEASUREMENT";
        this.payload = androidTextStyle_androidKt;
    }
}
