package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$PinComponent$CustomerPin$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderreset1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "customer")
public final class AndroidViewHolderonNestedFling1 implements AndroidViewHolderrelease1 {
    public static final MapComponent$PinComponent$CustomerPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$PinComponent$CustomerPin$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 29;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewHolderreset1 androidViewHolderreset1 = AndroidViewHolderreset1.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 81;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidViewHolderreset1;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final AndroidViewHolderlayoutNode1coreModifier1 actionableDetails;
    public final AndroidViewHolderlayoutNode12 address;
    public final boolean highlighted;
    public final int order;
    public final int priority;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$PinComponent$CustomerPin$Companion] */
    static {
        int i = write + 51;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.AndroidViewHolderrelease1
    public final int IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            i = this.priority;
            int i5 = 6 / 0;
        } else {
            i = this.priority;
        }
        int i6 = i3 + 93;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i;
    }

    @Override // o.AndroidViewHolderrelease1
    public final boolean read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 123;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.highlighted;
        int i5 = i2 + 15;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // o.AndroidViewHolderrelease1
    public final AndroidViewHolderlayoutNode12 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 65;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = this.address;
        int i4 = i2 + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return androidViewHolderlayoutNode12;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.order;
        }
        int i3 = 86 / 0;
        return this.order;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    public /* synthetic */ AndroidViewHolderonNestedFling1(int i, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, boolean z, int i2, String str, AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1, int i3) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewHolderreset1.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.address = androidViewHolderlayoutNode12;
        if ((i & 2) == 0) {
            this.highlighted = false;
        } else {
            this.highlighted = z;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i5 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.order = 0;
        } else {
            this.order = i2;
        }
        if ((i & 8) != 0) {
            this.style = str;
            int i7 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
            }
            if ((i & 16) == 0) {
                this.actionableDetails = null;
                int i8 = 2 % 2;
            } else {
                this.actionableDetails = androidViewHolderlayoutNode1coreModifier1;
            }
            if ((i & 32) == 0) {
                this.priority = 2;
            } else {
                this.priority = i3;
            }
        }
        int i9 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        this.style = "";
        int i11 = 2 % 2;
        if ((i & 16) == 0) {
            this.actionableDetails = null;
            int i12 = 2 % 2;
        } else {
            this.actionableDetails = androidViewHolderlayoutNode1coreModifier1;
        }
        if ((i & 32) == 0) {
            this.priority = 2;
        } else {
            this.priority = i3;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31), 31, this.style);
        AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = this.actionableDetails;
        if (androidViewHolderlayoutNode1coreModifier1 == null) {
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 43;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 93;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidViewHolderlayoutNode1coreModifier1.hashCode();
        }
        return Integer.hashCode(this.priority) + ((iM + iHashCode) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidViewHolderonNestedFling1) {
            AndroidViewHolderonNestedFling1 androidViewHolderonNestedFling1 = (AndroidViewHolderonNestedFling1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, androidViewHolderonNestedFling1.address}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (this.highlighted != androidViewHolderonNestedFling1.highlighted) {
                return false;
            }
            if (this.order == androidViewHolderonNestedFling1.order) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidViewHolderonNestedFling1.style}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionableDetails, androidViewHolderonNestedFling1.actionableDetails}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.priority == androidViewHolderonNestedFling1.priority) {
                    return true;
                }
                int i3 = RemoteActionCompatParcelizer + 55;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IconCompatParcelizer + 109;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            boolean z = i5 % 2 == 0;
            int i7 = i6 + 79;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return z;
        }
        int i9 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ", actionableDetails=" + this.actionableDetails + ", priority=" + this.priority + ")";
        int i2 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
