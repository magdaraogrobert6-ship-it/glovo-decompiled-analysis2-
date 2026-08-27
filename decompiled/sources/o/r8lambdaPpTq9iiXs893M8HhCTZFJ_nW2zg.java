package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$BagsAndItemsComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaKfbY3YdQlGUJACxzeoCNRHmq1k;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "bags_and_items")
public final class r8lambdaPpTq9iiXs893M8HhCTZFJ_nW2zg implements fastMinOf {
    public static final DeliveriesList$Delivery$DeliveryListComponent$BagsAndItemsComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$BagsAndItemsComponent$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 13;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return r8lambdaKfbY3YdQlGUJACxzeoCNRHmq1k.RemoteActionCompatParcelizer;
            }
            r8lambdaKfbY3YdQlGUJACxzeoCNRHmq1k r8lambdakfby3ydqlgujacxzeocnrhmq1k = r8lambdaKfbY3YdQlGUJACxzeoCNRHmq1k.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String bags;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$BagsAndItemsComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 125;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.bags;
        int i5 = i3 + 109;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public /* synthetic */ r8lambdaPpTq9iiXs893M8HhCTZFJ_nW2zg(int i, String str) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.bags = null;
            int i2 = IconCompatParcelizer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.bags = str;
        int i3 = IconCompatParcelizer + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.bags;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = read + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("BagsAndItemsComponent(bags=", this.bags, ")");
        int i4 = IconCompatParcelizer + 91;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof r8lambdaPpTq9iiXs893M8HhCTZFJ_nW2zg)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bags, ((r8lambdaPpTq9iiXs893M8HhCTZFJ_nW2zg) obj).bags}, getCieXyz.write())).booleanValue();
        }
        int i4 = i2 + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
