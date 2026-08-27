package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderDetailV1$Companion;
import com.roadrunner.delivery.state.pudo.TypographyToken;
import kotlinx.serialization.Serializable;
import o.r8lambdaXlMjVvz2iSw0j4xT51BoKg6pSXY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_text")
public final class AndroidViewBinding implements fastMinOf {
    public static final DeliveriesList$Delivery$DeliveryListComponent$OrderDetailV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderDetailV1$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 91;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaXlMjVvz2iSw0j4xT51BoKg6pSXY r8lambdaxlmjvvz2isw0j4xt51bokg6psxy = r8lambdaXlMjVvz2iSw0j4xT51BoKg6pSXY.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 81;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdaxlmjvvz2isw0j4xt51bokg6psxy;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final TypographyToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderDetailV1$Companion] */
    static {
        int i = serializer + 61;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    public final TypographyToken read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TypographyToken typographyToken = this.style;
        int i5 = i2 + 73;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return typographyToken;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 17;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ AndroidViewBinding(int i, TypographyToken typographyToken, String str) {
        if (3 == (i & 3)) {
            this.style = typographyToken;
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdaXlMjVvz2iSw0j4xT51BoKg6pSXY.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode() + (this.style.hashCode() * 31);
        int i4 = read + 81;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read;
            int i3 = i2 + 39;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof AndroidViewBinding) {
            AndroidViewBinding androidViewBinding = (AndroidViewBinding) obj;
            if (this.style != androidViewBinding.style) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, androidViewBinding.text}, getCieXyz.write())).booleanValue();
        }
        int i7 = write + 35;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderDetailV1(style=" + this.style + ", text=" + this.text + ")";
        int i2 = read + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
