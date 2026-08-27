package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$Companion;
import kotlinx.serialization.Serializable;
import o.fastFirstOrNull;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "bags_and_items")
public final class fastFlatMap implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 125;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                fastFirstOrNull fastfirstornull = fastFirstOrNull.serializer;
                throw null;
            }
            fastFirstOrNull fastfirstornull2 = fastFirstOrNull.serializer;
            int i3 = RemoteActionCompatParcelizer + 47;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
            }
            return fastfirstornull2;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String bags;
    public final fastFirst items;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public /* synthetic */ fastFlatMap(int i, String str, fastFirst fastfirst) {
        if ((i & 1) == 0) {
            this.bags = null;
            int i2 = read + 33;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            if ((i & 2) == 0) {
                this.items = null;
            } else {
                this.items = fastfirst;
            }
        }
        this.bags = str;
        int i3 = read + 7;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        if ((i & 2) == 0) {
            this.items = null;
        } else {
            this.items = fastfirst;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.bags;
        if (str == null) {
            int i2 = read;
            int i3 = i2 + 103;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        fastFirst fastfirst = this.items;
        return (iHashCode * 31) + (fastfirst != null ? fastfirst.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BagsAndItemsV1(bags=" + this.bags + ", items=" + this.items + ")";
        int i2 = serializer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fastFlatMap)) {
            int i4 = i3 + 11;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        fastFlatMap fastflatmap = (fastFlatMap) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bags, fastflatmap.bags}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, fastflatmap.items}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = serializer + 35;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 99;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
