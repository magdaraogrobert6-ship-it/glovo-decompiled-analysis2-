package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusV1$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import kotlinx.serialization.Serializable;
import o.AndroidViewBindinglambda50;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_tag")
public final class AndroidViewBindinglambda20 implements fastMinOf {
    public static final DeliveriesList$Delivery$DeliveryListComponent$OrderStatusV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusV1$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 81;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewBindinglambda50 androidViewBindinglambda50 = AndroidViewBindinglambda50.RemoteActionCompatParcelizer;
            int i4 = write + 45;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return androidViewBindinglambda50;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusV1$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final TagColorToken serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TagColorToken tagColorToken = this.style;
        int i5 = i2 + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return tagColorToken;
    }

    public /* synthetic */ AndroidViewBindinglambda20(int i, TagColorToken tagColorToken, String str) {
        if (3 == (i & 3)) {
            this.style = tagColorToken;
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidViewBindinglambda50.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.text.hashCode() - (this.style.hashCode() / 92);
        } else {
            iHashCode = this.text.hashCode() + (this.style.hashCode() * 31);
        }
        int i3 = serializer + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 9;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AndroidViewBindinglambda20)) {
            return false;
        }
        AndroidViewBindinglambda20 androidViewBindinglambda20 = (AndroidViewBindinglambda20) obj;
        if (this.style != androidViewBindinglambda20.style) {
            return false;
        }
        Object[] objArr = {this.text, androidViewBindinglambda20.text};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 77;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = serializer + 5;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusV1(style=" + this.style + ", text=" + this.text + ")";
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
