package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$PinComponent$ParkingPin$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderrunInvalidate1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "parking")
public final class AndroidViewHolderrunUpdate1 implements AndroidViewHolderrelease1 {
    public static final MapComponent$PinComponent$ParkingPin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$PinComponent$ParkingPin$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 73;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AndroidViewHolderrunInvalidate1.write;
            }
            AndroidViewHolderrunInvalidate1 androidViewHolderrunInvalidate1 = AndroidViewHolderrunInvalidate1.write;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final AndroidViewHolderlayoutNode12 address;
    public final boolean highlighted;
    public final int order;
    public final int priority;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$PinComponent$ParkingPin$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 67;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.priority;
        int i6 = i2 + 45;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.AndroidViewHolderrelease1
    public final boolean read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.highlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AndroidViewHolderrelease1
    public final AndroidViewHolderlayoutNode12 serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = this.address;
        int i4 = i3 + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return androidViewHolderlayoutNode12;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = this.order;
        int i6 = i3 + 89;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public /* synthetic */ AndroidViewHolderrunUpdate1(int i, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, boolean z, int i2, String str, int i3) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewHolderrunInvalidate1.write.getDescriptor());
            throw null;
        }
        this.address = androidViewHolderlayoutNode12;
        if ((i & 2) == 0) {
            this.highlighted = false;
            int i4 = IconCompatParcelizer + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            this.highlighted = z;
        }
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            int i7 = IconCompatParcelizer;
            int i8 = i7 + 101;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.order = 0;
            int i10 = i7 + 117;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 3 % 4;
            } else {
                int i12 = 2 % 2;
            }
        } else {
            this.order = i2;
        }
        if ((i & 8) == 0) {
            int i13 = serializer + 25;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            this.style = "";
        } else {
            this.style = str;
        }
        if ((i & 16) != 0) {
            this.priority = i3;
            return;
        }
        int i15 = IconCompatParcelizer + 25;
        serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            this.priority = 1;
        } else {
            this.priority = 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.priority) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31), 31, this.style);
        int i4 = serializer + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof AndroidViewHolderrunUpdate1) {
                AndroidViewHolderrunUpdate1 androidViewHolderrunUpdate1 = (AndroidViewHolderrunUpdate1) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, androidViewHolderrunUpdate1.address}, getCieXyz.write())).booleanValue() || this.highlighted != androidViewHolderrunUpdate1.highlighted || this.order != androidViewHolderrunUpdate1.order) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidViewHolderrunUpdate1.style}, getCieXyz.write())).booleanValue()) {
                    return this.priority == androidViewHolderrunUpdate1.priority;
                }
                int i5 = IconCompatParcelizer + 71;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = i3 + 69;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i8 = i3 + 93;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ParkingPin(address=");
        sb.append(this.address);
        sb.append(", highlighted=");
        sb.append(this.highlighted);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", priority=");
        String strM = af$$ExternalSyntheticOutline0.m(this.priority, ")", sb);
        int i2 = serializer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return strM;
    }
}
