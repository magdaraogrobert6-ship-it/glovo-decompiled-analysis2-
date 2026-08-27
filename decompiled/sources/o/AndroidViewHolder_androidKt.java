package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$PinComponent$EntrancePin$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderupdate1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "entrance")
public final class AndroidViewHolder_androidKt implements AndroidViewHolderrelease1 {
    public static final MapComponent$PinComponent$EntrancePin$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$PinComponent$EntrancePin$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 35;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                AndroidViewHolderupdate1 androidViewHolderupdate1 = AndroidViewHolderupdate1.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidViewHolderupdate1 androidViewHolderupdate2 = AndroidViewHolderupdate1.write;
            int i3 = read + 103;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return androidViewHolderupdate2;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final AndroidViewHolderlayoutNode12 address;
    public final boolean highlighted;
    public final int order;
    public final int priority;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$PinComponent$EntrancePin$Companion] */
    static {
        int i = write + 13;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.AndroidViewHolderrelease1
    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = this.priority;
        int i6 = i3 + 75;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.AndroidViewHolderrelease1
    public final boolean read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 89;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.highlighted;
        int i5 = i2 + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.AndroidViewHolderrelease1
    public final AndroidViewHolderlayoutNode12 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = this.address;
        int i5 = i3 + 35;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return androidViewHolderlayoutNode12;
    }

    @Override // o.AndroidViewHolderrelease1
    public final int write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 105;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 21;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public /* synthetic */ AndroidViewHolder_androidKt(int i, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, boolean z, int i2, String str, int i3) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewHolderupdate1.write.getDescriptor());
            throw null;
        }
        this.address = androidViewHolderlayoutNode12;
        if ((i & 2) == 0) {
            this.highlighted = false;
            int i4 = RemoteActionCompatParcelizer + 115;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            this.highlighted = z;
        }
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            int i7 = RemoteActionCompatParcelizer + 1;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.order = 0;
        } else {
            this.order = i2;
            int i9 = read + 109;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 3 % 5;
            } else {
                int i11 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.style = "";
        } else {
            this.style = str;
        }
        if ((i & 16) != 0) {
            this.priority = i3;
            return;
        }
        int i12 = read + 105;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        this.priority = 1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.priority) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31), 31, this.style);
        int i4 = RemoteActionCompatParcelizer + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewHolder_androidKt)) {
            return false;
        }
        AndroidViewHolder_androidKt androidViewHolder_androidKt = (AndroidViewHolder_androidKt) obj;
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, androidViewHolder_androidKt.address}, getCieXyz.write())).booleanValue()) || this.highlighted != androidViewHolder_androidKt.highlighted) {
            return false;
        }
        if (this.order == androidViewHolder_androidKt.order) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, androidViewHolder_androidKt.style}, getCieXyz.write())).booleanValue())) {
                return this.priority == androidViewHolder_androidKt.priority;
            }
            int i2 = read + 87;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("EntrancePin(address=");
        sb.append(this.address);
        sb.append(", highlighted=");
        sb.append(this.highlighted);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", priority=");
        String strM = af$$ExternalSyntheticOutline0.m(this.priority, ")", sb);
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }
}
