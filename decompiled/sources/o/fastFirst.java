package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$ItemsV1$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fastForEachIndexed;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fastFirst {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final List items;
    public final String titleShowItems;
    public static final Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$ItemsV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$ItemsV1$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return fastForEachIndexed.RemoteActionCompatParcelizer;
            }
            fastForEachIndexed fastforeachindexed = fastForEachIndexed.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(12))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$BagsAndItemsV1$ItemsV1$Companion] */
    static {
        Object obj = null;
        int i = RemoteActionCompatParcelizer + 31;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ fastFirst(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.titleShowItems = str;
            this.items = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastForEachIndexed.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("ItemsV1(titleShowItems=", this.titleShowItems, ", items=", this.items, ")");
        int i4 = IconCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.items.hashCode() + (this.titleShowItems.hashCode() * 31);
        int i4 = write + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 117;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof fastFirst)) {
            return false;
        }
        fastFirst fastfirst = (fastFirst) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.titleShowItems, fastfirst.titleShowItems}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 105;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, fastfirst.items}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i5 = IconCompatParcelizer + 47;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
