package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.UnknownComponent$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class invokeSuspendcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationObserveImageSharingUiStateinvoke21 extends DelegatingFrameMetricsListener {
    public static final UnknownComponent$Companion Companion = new UnknownComponent$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String type;

    static {
        int i = RemoteActionCompatParcelizer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        int i3 = 88 / 0;
        return this.type;
    }

    public invokeSuspendcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationObserveImageSharingUiStateinvoke21(int i, String str) {
        if (1 == (i & 1)) {
            this.type = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, invokeSuspendcomroadrunnerdeliveryacceptdeclinebuttonpresentationLasagnaDeclineBottomSheetViewModelanimateBottomSheetValues1.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.type.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.type.hashCode();
        int i3 = IconCompatParcelizer + 125;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("UnknownComponent(type=", this.type, ")");
        int i4 = IconCompatParcelizer + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof invokeSuspendcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationObserveImageSharingUiStateinvoke21) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, ((invokeSuspendcomroadrunnerdeliveryonthewaycrowdsourcingfloatingpresentationObserveImageSharingUiStateinvoke21) obj).type}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = IconCompatParcelizer + 65;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i3 + 47;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
