package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$PhoneNumber$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderlayoutNode14;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "phone_number")
public final class AndroidViewHolderlayoutNode15 implements accessobtainMeasureSpec {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$PhoneNumber$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$PhoneNumber$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AndroidViewHolderlayoutNode14 androidViewHolderlayoutNode14;
            int i = 2 % 2;
            int i2 = read + 43;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                androidViewHolderlayoutNode14 = AndroidViewHolderlayoutNode14.serializer;
                int i3 = 23 / 0;
            } else {
                androidViewHolderlayoutNode14 = AndroidViewHolderlayoutNode14.serializer;
            }
            int i4 = IconCompatParcelizer + 93;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return androidViewHolderlayoutNode14;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String callee;
    public final String calleeName;
    public final long deliveryId;
    public final boolean masked;
    public final String number;
    public final String orderCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$PhoneNumber$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 61;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidViewHolderlayoutNode15(int i, long j, String str, String str2, String str3, String str4, boolean z) {
        int i2;
        if (5 != (i & 5)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, AndroidViewHolderlayoutNode14.serializer.getDescriptor());
            throw null;
        }
        this.deliveryId = j;
        if ((i & 2) == 0) {
            this.number = null;
        } else {
            this.number = str;
        }
        int i3 = 2 % 2;
        this.masked = z;
        if ((i & 8) == 0) {
            this.callee = null;
        } else {
            this.callee = str2;
            int i4 = write + 41;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            this.calleeName = null;
            i2 = read + 125;
        } else {
            this.calleeName = str3;
            i2 = read + 29;
        }
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i2 % 2;
        int i7 = 2 % 2;
        if ((i & 32) == 0) {
            this.orderCode = null;
        } else {
            this.orderCode = str4;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("PhoneNumber(deliveryId=", ", number=", this.deliveryId, this.number);
        sb.append(", masked=");
        sb.append(this.masked);
        sb.append(", callee=");
        sb.append(this.callee);
        c8$$ExternalSyntheticOutline0.m(sb, ", calleeName=", this.calleeName, ", orderCode=", this.orderCode);
        sb.append(")");
        String string = sb.toString();
        int i4 = read + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Long.hashCode(this.deliveryId);
        String str = this.number;
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.masked);
        String str2 = this.callee;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.calleeName;
        if (str3 == null) {
            int i4 = read + 55;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.orderCode;
        return ((((iM + iHashCode3) * 31) + iHashCode) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidViewHolderlayoutNode15) {
            AndroidViewHolderlayoutNode15 androidViewHolderlayoutNode15 = (AndroidViewHolderlayoutNode15) obj;
            if (this.deliveryId != androidViewHolderlayoutNode15.deliveryId) {
                int i2 = write + 73;
                int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i3;
                boolean z = i2 % 2 != 0;
                int i4 = i3 + 49;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return z;
            }
            if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.number, androidViewHolderlayoutNode15.number}, getCieXyz.write())).booleanValue()) || this.masked != androidViewHolderlayoutNode15.masked) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, androidViewHolderlayoutNode15.callee}, getCieXyz.write())).booleanValue()) {
                int i6 = read + 125;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calleeName, androidViewHolderlayoutNode15.calleeName}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderCode, androidViewHolderlayoutNode15.orderCode}, getCieXyz.write())).booleanValue();
            }
            int i8 = read + 111;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = write + 115;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 != 0;
    }
}
