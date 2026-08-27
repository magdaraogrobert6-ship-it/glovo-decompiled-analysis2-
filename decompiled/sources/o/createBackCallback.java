package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$NoDeliveries$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "no_deliveries")
public final class createBackCallback extends AndroidPopup_androidKtPopup41 {
    public static final StateV3$NoDeliveries$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$NoDeliveries$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 9;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w r8lambdaqxr1fhw2bvzfkrdjxe2ixzlqd_w = r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w.read;
            int i4 = RemoteActionCompatParcelizer + 39;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdaqxr1fhw2bvzfkrdjxe2ixzlqd_w;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String subtitle;
    public final String title;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$NoDeliveries$Companion] */
    static {
        int i = IconCompatParcelizer + 115;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.AndroidPopup_androidKtPopup41
    public final String read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 121;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ createBackCallback(int i, String str, String str2, String str3) {
        Object obj = null;
        if (2 != (i & 2)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, r8lambdaQxR1fHW2BVZfkrdJXE2ixZLqD_w.read.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            int i2 = RemoteActionCompatParcelizer + 111;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "no_deliveries";
        }
        this.type = str;
        this.title = str2;
        if ((i & 4) == 0) {
            int i4 = write + 29;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.subtitle = null;
            return;
        }
        this.subtitle = str3;
        int i6 = RemoteActionCompatParcelizer + 79;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("NoDeliveries(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ")");
            int i3 = write + 99;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("NoDeliveries(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.type;
        if (str == null) {
            int i5 = i3 + 61;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.title);
        String str2 = this.subtitle;
        int iHashCode2 = iM + (str2 != null ? str2.hashCode() : 0);
        int i7 = RemoteActionCompatParcelizer + 33;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createBackCallback)) {
            return false;
        }
        createBackCallback createbackcallback = (createBackCallback) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, createbackcallback.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, createbackcallback.title}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, createbackcallback.subtitle}, getCieXyz.write())).booleanValue()) {
                int i4 = write + 61;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i5 = write + 85;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = write + 113;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
