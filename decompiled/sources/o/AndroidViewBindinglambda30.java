package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusCountDown$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidViewBindinglambda1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "order_status_countdown")
public final class AndroidViewBindinglambda30 implements fastMinOf {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final List data;
    public static final DeliveriesList$Delivery$DeliveryListComponent$OrderStatusCountDown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusCountDown$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidViewBindinglambda1.read;
            }
            AndroidViewBindinglambda1 androidViewBindinglambda1 = AndroidViewBindinglambda1.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(25))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$OrderStatusCountDown$Companion] */
    static {
        int i = write + 61;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.data;
        int i5 = i3 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public /* synthetic */ AndroidViewBindinglambda30(int i, List list) {
        if (1 == (i & 1)) {
            this.data = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewBindinglambda1.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        int i4 = read + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read("OrderStatusCountDown(data=", ")", this.data);
        }
        MediaSessionCompatQueueItem.read("OrderStatusCountDown(data=", ")", this.data);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewBindinglambda30)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((AndroidViewBindinglambda30) obj).data}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 65;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = IconCompatParcelizer + 13;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return true;
    }
}
