package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DeliveriesList$Delivery$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambda60ReDuah29FRmTb04OdFlVn5oXo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery")
public final class normalizedAngleSin {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List components;
    public final long deliveryId;
    public final boolean isExpandable;
    public static final DeliveriesList$Delivery$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesList$Delivery$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 81;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return r8lambda60ReDuah29FRmTb04OdFlVn5oXo.RemoteActionCompatParcelizer;
            }
            r8lambda60ReDuah29FRmTb04OdFlVn5oXo r8lambda60reduah29frmtb04odflvn5oxo = r8lambda60ReDuah29FRmTb04OdFlVn5oXo.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(22)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesList$Delivery$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        List list = this.components;
        int i5 = i3 + 73;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            z = this.isExpandable;
            int i4 = 82 / 0;
        } else {
            z = this.isExpandable;
        }
        int i5 = i3 + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return z;
    }

    public final long read() {
        int i = 2 % 2;
        int i2 = write + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        long j = this.deliveryId;
        int i5 = i3 + 35;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public /* synthetic */ normalizedAngleSin(int i, List list, long j, boolean z) {
        if (7 == (i & 7)) {
            this.components = list;
            this.deliveryId = j;
            this.isExpandable = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, r8lambda60ReDuah29FRmTb04OdFlVn5oXo.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isExpandable) + d$$ExternalSyntheticOutline0.m(this.components.hashCode() * 31, 31, this.deliveryId);
        int i4 = write + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 65;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof normalizedAngleSin)) {
            return false;
        }
        normalizedAngleSin normalizedanglesin = (normalizedAngleSin) obj;
        Object[] objArr = {this.components, normalizedanglesin.components};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = write + 91;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.deliveryId != normalizedanglesin.deliveryId) {
            int i6 = write + 53;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.isExpandable == normalizedanglesin.isExpandable) {
            return true;
        }
        int i8 = serializer + 111;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Delivery(components=" + this.components + ", deliveryId=" + this.deliveryId + ", isExpandable=" + this.isExpandable + ")";
        int i2 = write + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
