package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$PhoneNumber$Companion;
import kotlinx.serialization.Serializable;
import o.FontWeightKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "phone_number")
public final class fontWeightAdjustment extends getW800 {
    public static final ScrollableComponent$LocationDetail$PhoneNumber$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$PhoneNumber$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontWeightKt fontWeightKt = FontWeightKt.IconCompatParcelizer;
            int i4 = read + 45;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fontWeightKt;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String callee;
    public final long deliveryId;
    public final boolean masked;
    public final String number;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$PhoneNumber$Companion] */
    static {
        int i = read + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    public /* synthetic */ fontWeightAdjustment(int i, long j, String str, boolean z, String str2) {
        int i2;
        if (5 != (i & 5)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, FontWeightKt.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.deliveryId = j;
        if ((i & 2) != 0) {
            this.number = str;
            int i3 = write + 45;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
            }
            this.masked = z;
            if ((i & 8) == 0) {
                this.callee = str2;
                int i4 = serializer + 53;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            i2 = serializer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.callee = null;
            } else {
                this.callee = null;
                throw null;
            }
        }
        this.number = null;
        int i6 = serializer + 47;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = 2 % 2;
        this.masked = z;
        if ((i & 8) == 0) {
            this.callee = str2;
            int i9 = serializer + 53;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return;
        }
        i2 = serializer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.callee = null;
        } else {
            this.callee = null;
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 83;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int iHashCode2 = Long.hashCode(this.deliveryId);
        String str = this.number;
        int iHashCode3 = 0;
        if (str == null) {
            int i6 = write + 121;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i8 = serializer + 71;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.masked);
        String str2 = this.callee;
        if (str2 == null) {
            i = write + 59;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            iHashCode3 = str2.hashCode();
            i = write + 85;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        serializer = i2;
        int i10 = i % 2;
        return iM + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("PhoneNumber(deliveryId=", ", number=", this.deliveryId, this.number);
        sb.append(", masked=");
        sb.append(this.masked);
        sb.append(", callee=");
        sb.append(this.callee);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fontWeightAdjustment)) {
            return false;
        }
        fontWeightAdjustment fontweightadjustment = (fontWeightAdjustment) obj;
        if (this.deliveryId != fontweightadjustment.deliveryId) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.number, fontweightadjustment.number}, getCieXyz.write())).booleanValue()) {
            if (this.masked == fontweightadjustment.masked) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, fontweightadjustment.callee}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 119;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = serializer + 93;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
