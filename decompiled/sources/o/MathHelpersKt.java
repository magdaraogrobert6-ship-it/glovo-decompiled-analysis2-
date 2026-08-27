package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderStatusV1$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import kotlinx.serialization.Serializable;
import o.fastZip;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_tag")
public final class MathHelpersKt implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$OrderStatusV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderStatusV1$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 111;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return fastZip.read;
            }
            int i3 = 17 / 0;
            return fastZip.read;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderStatusV1$Companion] */
    static {
        int i = serializer + 89;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ MathHelpersKt(int i, TagColorToken tagColorToken, String str) {
        if (3 == (i & 3)) {
            this.style = tagColorToken;
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastZip.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode2 = this.style.hashCode();
            iHashCode = this.text.hashCode();
        } else {
            int iHashCode3 = this.style.hashCode();
            iHashCode = this.text.hashCode();
            iHashCode2 = iHashCode3 * 31;
        }
        int i3 = iHashCode + iHashCode2;
        int i4 = read + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return i3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MathHelpersKt)) {
            int i4 = i3 + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        MathHelpersKt mathHelpersKt = (MathHelpersKt) obj;
        if (this.style != mathHelpersKt.style) {
            int i6 = i3 + 51;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, mathHelpersKt.text}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = read + 97;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusV1(style=" + this.style + ", text=" + this.text + ")";
        int i2 = IconCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
