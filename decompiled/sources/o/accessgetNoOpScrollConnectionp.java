package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$PinComponent$VendorPin$Companion;
import kotlinx.serialization.Serializable;
import o.accesstoComposeVelocity;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "vendor")
public final class accessgetNoOpScrollConnectionp implements AndroidViewHolderrelease1 {
    public static final MapComponent$PinComponent$VendorPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$PinComponent$VendorPin$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accesstoComposeVelocity accesstocomposevelocity = accesstoComposeVelocity.read;
            int i4 = read + 125;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accesstocomposevelocity;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final AndroidViewHolderlayoutNode1coreModifier1 actionableDetails;
    public final AndroidViewHolderlayoutNode12 address;
    public final boolean highlighted;
    public final int order;
    public final int priority;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$PinComponent$VendorPin$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.priority;
        int i6 = i2 + 111;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AndroidViewHolderrelease1
    public final boolean read() {
        int i = 2 % 2;
        int i2 = write + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.highlighted;
        }
        throw null;
    }

    @Override // o.AndroidViewHolderrelease1
    public final AndroidViewHolderlayoutNode12 serializer() {
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.address;
        }
        throw null;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 11;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public /* synthetic */ accessgetNoOpScrollConnectionp(int i, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, boolean z, int i2, String str, AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1, int i3) {
        if (1 == (i & 1)) {
            this.address = androidViewHolderlayoutNode12;
            if ((i & 2) == 0) {
                this.highlighted = false;
                int i4 = write + 19;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } else {
                this.highlighted = z;
            }
            if ((i & 4) == 0) {
                this.order = 0;
            } else {
                this.order = i2;
                int i7 = serializer + 91;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            if ((i & 8) == 0) {
                int i10 = write + 93;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                this.style = "";
            } else {
                this.style = str;
            }
            if ((i & 16) == 0) {
                this.actionableDetails = null;
            } else {
                this.actionableDetails = androidViewHolderlayoutNode1coreModifier1;
            }
            if ((i & 32) == 0) {
                this.priority = 2;
                return;
            } else {
                this.priority = i3;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, accesstoComposeVelocity.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31), 31, this.style);
        AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = this.actionableDetails;
        if (androidViewHolderlayoutNode1coreModifier1 == null) {
            int i4 = write + 123;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidViewHolderlayoutNode1coreModifier1.hashCode();
        }
        return Integer.hashCode(this.priority) + ((iM + iHashCode) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 41;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof accessgetNoOpScrollConnectionp)) {
            int i6 = i2 + 45;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        accessgetNoOpScrollConnectionp accessgetnoopscrollconnectionp = (accessgetNoOpScrollConnectionp) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, accessgetnoopscrollconnectionp.address}, getCieXyz.write())).booleanValue()) {
            if (this.highlighted != accessgetnoopscrollconnectionp.highlighted || this.order != accessgetnoopscrollconnectionp.order) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, accessgetnoopscrollconnectionp.style}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionableDetails, accessgetnoopscrollconnectionp.actionableDetails}, getCieXyz.write())).booleanValue() && this.priority == accessgetnoopscrollconnectionp.priority;
        }
        int i7 = write + 29;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ", actionableDetails=" + this.actionableDetails + ", priority=" + this.priority + ")";
        int i2 = serializer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
