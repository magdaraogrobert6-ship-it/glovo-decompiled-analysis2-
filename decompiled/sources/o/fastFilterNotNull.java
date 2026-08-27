package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Deliveries$Delivery$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fastFilter;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fastFilterNotNull {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String action;
    public final List components;
    public final long deliveryId;
    public final Boolean isExpandable;
    public final String reference;
    public static final Deliveries$Delivery$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 93;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastFilter fastfilter = fastFilter.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 41;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return fastfilter;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(11))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$Companion] */
    static {
        int i = write + 87;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.action;
        int i5 = i3 + 3;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.reference;
        int i5 = i2 + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.deliveryId;
        int i4 = i2 + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public /* synthetic */ fastFilterNotNull(int i, long j, String str, String str2, Boolean bool, List list) {
        Object obj = null;
        if (7 == (i & 7)) {
            this.deliveryId = j;
            this.reference = str;
            this.action = str2;
            if ((i & 8) == 0) {
                this.isExpandable = null;
                int i2 = serializer + 19;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.isExpandable = bool;
                int i4 = IconCompatParcelizer + 51;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 4;
                } else {
                    int i6 = 2 % 2;
                }
            }
            if ((i & 16) != 0) {
                this.components = list;
                return;
            }
            int i7 = serializer + 53;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                this.components = null;
                return;
            } else {
                this.components = null;
                obj.hashCode();
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, fastFilter.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.deliveryId) * 31, 31, this.reference), 31, this.action);
        Boolean bool = this.isExpandable;
        if (bool == null) {
            int i2 = serializer + 53;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        List list = this.components;
        int iHashCode2 = ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
        int i3 = IconCompatParcelizer + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Delivery(deliveryId=", ", reference=", this.deliveryId, this.reference);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", isExpandable=");
        sb.append(this.isExpandable);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(")");
        String string = sb.toString();
        int i4 = IconCompatParcelizer + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fastFilterNotNull)) {
            int i2 = IconCompatParcelizer + 49;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        fastFilterNotNull fastfilternotnull = (fastFilterNotNull) obj;
        if (this.deliveryId != fastfilternotnull.deliveryId) {
            int i6 = serializer + 53;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr = {this.reference, fastfilternotnull.reference};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.action, fastfilternotnull.action};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.isExpandable, fastfilternotnull.isExpandable};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i8 = IconCompatParcelizer + 107;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr4 = {this.components, fastfilternotnull.components};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i10 = serializer + 87;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            int i11 = 7 / 0;
        }
        return true;
    }
}
