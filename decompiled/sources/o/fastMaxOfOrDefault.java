package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderDetailV1$Companion;
import com.roadrunner.delivery.state.pudo.TypographyToken;
import kotlinx.serialization.Serializable;
import o.fastReduce;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_text")
public final class fastMaxOfOrDefault implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$OrderDetailV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderDetailV1$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 15;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastReduce fastreduce = fastReduce.IconCompatParcelizer;
            int i4 = read + 29;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fastreduce;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final TypographyToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$OrderDetailV1$Companion] */
    static {
        int i = write + 19;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ fastMaxOfOrDefault(int i, TypographyToken typographyToken, String str) {
        if (3 == (i & 3)) {
            this.style = typographyToken;
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastReduce.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode() + (this.style.hashCode() * 31);
        int i4 = read + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 3;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof fastMaxOfOrDefault)) {
            int i4 = read + 29;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        fastMaxOfOrDefault fastmaxofordefault = (fastMaxOfOrDefault) obj;
        if (this.style != fastmaxofordefault.style) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, fastmaxofordefault.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i5 = IconCompatParcelizer + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderDetailV1(style=" + this.style + ", text=" + this.text + ")";
        int i2 = read + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
