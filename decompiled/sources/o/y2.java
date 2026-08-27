package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.y4;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class y2 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Delivery$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 53;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            y4 y4Var = y4.serializer;
            int i4 = RemoteActionCompatParcelizer + 33;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return y4Var;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final yb cashCollection;
    public final DateTime completedAt;
    public final String confirmationNumber;
    public final yf customer;
    public final double distance;
    public final long id;
    public final List items;
    public final zExternalSyntheticLambda1 payment;
    public final zExternalSyntheticLambda0 vendor;
    public final int vendorOrderNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(17)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new wa(18))};
        int i = RemoteActionCompatParcelizer + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ y2(int i, long j, String str, int i2, zExternalSyntheticLambda0 zexternalsyntheticlambda0, yf yfVar, zExternalSyntheticLambda1 zexternalsyntheticlambda1, yb ybVar, List list, double d, DateTime dateTime) {
        if (447 != (i & 447)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 447, y4.serializer.getDescriptor());
            throw null;
        }
        this.id = j;
        this.confirmationNumber = str;
        this.vendorOrderNumber = i2;
        this.vendor = zexternalsyntheticlambda0;
        this.customer = yfVar;
        this.payment = zexternalsyntheticlambda1;
        if ((i & 64) == 0) {
            this.cashCollection = null;
        } else {
            this.cashCollection = ybVar;
        }
        int i3 = 2 % 2;
        this.items = list;
        this.distance = d;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i4 = write + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.completedAt = null;
            return;
        }
        this.completedAt = dateTime;
        int i6 = IconCompatParcelizer + 1;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public y2(long j, String str, int i, zExternalSyntheticLambda0 zexternalsyntheticlambda0, yf yfVar, zExternalSyntheticLambda1 zexternalsyntheticlambda1, yb ybVar, List list, double d, DateTime dateTime) {
        str.getClass();
        zexternalsyntheticlambda0.getClass();
        yfVar.getClass();
        zexternalsyntheticlambda1.getClass();
        list.getClass();
        this.id = j;
        this.confirmationNumber = str;
        this.vendorOrderNumber = i;
        this.vendor = zexternalsyntheticlambda0;
        this.customer = yfVar;
        this.payment = zexternalsyntheticlambda1;
        this.cashCollection = ybVar;
        this.items = list;
        this.distance = d;
        this.completedAt = dateTime;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.vendorOrderNumber, af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.confirmationNumber), 31);
        int iHashCode2 = this.vendor.hashCode();
        int iHashCode3 = this.customer.hashCode();
        int iHashCode4 = this.payment.hashCode();
        yb ybVar = this.cashCollection;
        int iHashCode5 = 0;
        if (ybVar == null) {
            int i4 = IconCompatParcelizer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = ybVar.hashCode();
        }
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distance, c8$$ExternalSyntheticOutline0.m(this.items, (((iHashCode4 + ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31)) * 31) + iHashCode) * 31, 31), 31);
        DateTime dateTime = this.completedAt;
        if (dateTime == null) {
            int i6 = write + 35;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode5 = dateTime.hashCode();
        }
        return iRemoteActionCompatParcelizer + iHashCode5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Delivery(id=", ", confirmationNumber=", this.id, this.confirmationNumber);
        sb.append(", vendorOrderNumber=");
        sb.append(this.vendorOrderNumber);
        sb.append(", vendor=");
        sb.append(this.vendor);
        sb.append(", customer=");
        sb.append(this.customer);
        sb.append(", payment=");
        sb.append(this.payment);
        sb.append(", cashCollection=");
        sb.append(this.cashCollection);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", completedAt=");
        sb.append(this.completedAt);
        sb.append(")");
        String string = sb.toString();
        int i4 = IconCompatParcelizer + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 43;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        if (this.id != y2Var.id) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, y2Var.confirmationNumber}, getCieXyz.write())).booleanValue()) {
            if (this.vendorOrderNumber == y2Var.vendorOrderNumber) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendor, y2Var.vendor}, getCieXyz.write())).booleanValue()) {
                    int i7 = write + 83;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customer, y2Var.customer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payment, y2Var.payment}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cashCollection, y2Var.cashCollection}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, y2Var.items}, getCieXyz.write())).booleanValue()) {
                    int i9 = IconCompatParcelizer + 29;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i9 % 2 != 0;
                }
                if (Double.compare(this.distance, y2Var.distance) != 0) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.completedAt, y2Var.completedAt}, getCieXyz.write())).booleanValue();
            }
            int i10 = write + 93;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = IconCompatParcelizer + 23;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
