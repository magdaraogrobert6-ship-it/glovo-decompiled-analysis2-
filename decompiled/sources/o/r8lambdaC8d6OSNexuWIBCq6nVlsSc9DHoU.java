package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$ExpandableButtonV1$FullscreenItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambdadOLub9xw1cu9O14smUUegIXXoGg;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final DeliveriesList$Delivery$DeliveryListComponent$ExpandableButtonV1$FullscreenItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$ExpandableButtonV1$FullscreenItem$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 59;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdadOLub9xw1cu9O14smUUegIXXoGg r8lambdadolub9xw1cu9o14smuuegixxogg = r8lambdadOLub9xw1cu9O14smUUegIXXoGg.RemoteActionCompatParcelizer;
            int i4 = serializer + 23;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdadolub9xw1cu9o14smuuegixxogg;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final List fullscreenDetails;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$DeliveryListComponent$ExpandableButtonV1$FullscreenItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(23)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(24))};
        int i = serializer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final List RemoteActionCompatParcelizer() {
        List list;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            list = this.trackingEvents;
            int i4 = 37 / 0;
        } else {
            list = this.trackingEvents;
        }
        int i5 = i3 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.fullscreenDetails;
        int i5 = i2 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public /* synthetic */ r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.fullscreenDetails = list;
            this.trackingEvents = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdadOLub9xw1cu9O14smUUegIXXoGg.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.trackingEvents.hashCode() + (this.fullscreenDetails.hashCode() * 31);
        int i4 = IconCompatParcelizer + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FullscreenItem(fullscreenDetails=" + this.fullscreenDetails + ", trackingEvents=" + this.trackingEvents + ")";
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 117;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU) {
            r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU r8lambdac8d6osnexuwibcq6nvlssc9dhou = (r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fullscreenDetails, r8lambdac8d6osnexuwibcq6nvlssc9dhou.fullscreenDetails}, getCieXyz.write())).booleanValue()) {
                int i4 = IconCompatParcelizer + 49;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, r8lambdac8d6osnexuwibcq6nvlssc9dhou.trackingEvents}, getCieXyz.write())).booleanValue();
        }
        int i6 = IconCompatParcelizer + 61;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
