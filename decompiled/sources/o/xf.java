package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.converter.ConvertedDelivery$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class xf {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final yb cashCollection;
    public final Long completedAt;
    public final String confirmationNumber;
    public final yf customer;
    public final double distance;
    public final long id;
    public final List items;
    public final zExternalSyntheticLambda1 payment;
    public final zExternalSyntheticLambda0 vendor;
    public final int vendorOrderNumber;
    public static final ConvertedDelivery$Companion Companion = new ConvertedDelivery$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(16)), null, null};

    static {
        int i = write + 21;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ xf(int i, long j, String str, int i2, zExternalSyntheticLambda0 zexternalsyntheticlambda0, yf yfVar, zExternalSyntheticLambda1 zexternalsyntheticlambda1, yb ybVar, List list, double d, Long l) {
        if (447 == (i & 447)) {
            this.id = j;
            this.confirmationNumber = str;
            this.vendorOrderNumber = i2;
            this.vendor = zexternalsyntheticlambda0;
            this.customer = yfVar;
            this.payment = zexternalsyntheticlambda1;
            if ((i & 64) == 0) {
                this.cashCollection = null;
                int i3 = RemoteActionCompatParcelizer + 121;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } else {
                this.cashCollection = ybVar;
            }
            this.items = list;
            this.distance = d;
            if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
                this.completedAt = l;
                return;
            }
            int i5 = RemoteActionCompatParcelizer + 85;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.completedAt = null;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 447, y1.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public xf(long j, String str, int i, zExternalSyntheticLambda0 zexternalsyntheticlambda0, yf yfVar, zExternalSyntheticLambda1 zexternalsyntheticlambda1, yb ybVar, List list, double d, Long l) {
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
        this.completedAt = l;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.vendorOrderNumber, af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.confirmationNumber), 31);
        int iHashCode2 = this.vendor.hashCode();
        int iHashCode3 = this.customer.hashCode();
        int iHashCode4 = this.payment.hashCode();
        yb ybVar = this.cashCollection;
        int iHashCode5 = 0;
        if (ybVar == null) {
            int i4 = read + 123;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = ybVar.hashCode();
        }
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distance, c8$$ExternalSyntheticOutline0.m(this.items, (((iHashCode4 + ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31)) * 31) + iHashCode) * 31, 31), 31);
        Long l = this.completedAt;
        if (l == null) {
            int i5 = read + 13;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode5 = l.hashCode();
        }
        return iRemoteActionCompatParcelizer + iHashCode5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ConvertedDelivery(id=", ", confirmationNumber=", this.id, this.confirmationNumber);
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
        int i4 = read + 125;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 119;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        if (this.id != xfVar.id) {
            return false;
        }
        Object[] objArr = {this.confirmationNumber, xfVar.confirmationNumber};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 61;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.vendorOrderNumber != xfVar.vendorOrderNumber) {
            int i6 = read + 113;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr2 = {this.vendor, xfVar.vendor};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.customer, xfVar.customer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.payment, xfVar.payment};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i8 = read + 5;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        Object[] objArr5 = {this.cashCollection, xfVar.cashCollection};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i10 = read + 35;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        Object[] objArr6 = {this.items, xfVar.items};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue() || Double.compare(this.distance, xfVar.distance) != 0) {
            return false;
        }
        Object[] objArr7 = {this.completedAt, xfVar.completedAt};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            int i12 = read + 17;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 94 / 0;
            }
            return true;
        }
        int i14 = RemoteActionCompatParcelizer + 81;
        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            int i15 = 90 / 0;
        }
        return false;
    }
}
