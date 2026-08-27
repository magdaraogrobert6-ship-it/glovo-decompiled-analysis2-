package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.Delivery$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.prepareDeeplinkI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class launchSdkClickResponseTasksI {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String completedAt;
    public final pausedI dropoff;
    public final long id;
    public final List items;
    public final String orderCode;
    public final pausedI pickup;
    public final String startedAt;
    public final readGlobalPartnerParametersI vendorReview;
    public static final Delivery$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Delivery$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 87;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return prepareDeeplinkI.RemoteActionCompatParcelizer;
            }
            prepareDeeplinkI preparedeeplinki = prepareDeeplinkI.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(22)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Delivery$Companion] */
    static {
        Object obj = null;
        int i = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ launchSdkClickResponseTasksI(int i, long j, String str, String str2, String str3, List list, pausedI pausedi, pausedI pausedi2, readGlobalPartnerParametersI readglobalpartnerparametersi) {
        if (127 == (i & 127)) {
            this.id = j;
            this.orderCode = str;
            this.startedAt = str2;
            this.completedAt = str3;
            this.items = list;
            this.pickup = pausedi;
            this.dropoff = pausedi2;
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                this.vendorReview = null;
                int i2 = write + 67;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.vendorReview = readglobalpartnerparametersi;
            int i3 = serializer + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, prepareDeeplinkI.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.items, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.orderCode), 31, this.startedAt), 31, this.completedAt), 31);
        int iHashCode2 = this.pickup.hashCode();
        int iHashCode3 = this.dropoff.hashCode();
        readGlobalPartnerParametersI readglobalpartnerparametersi = this.vendorReview;
        if (readglobalpartnerparametersi == null) {
            int i4 = serializer + 91;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = readglobalpartnerparametersi.hashCode();
        }
        return ((iHashCode3 + ((iHashCode2 + iM) * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Delivery(id=", ", orderCode=", this.id, this.orderCode);
        c8$$ExternalSyntheticOutline0.m(sb, ", startedAt=", this.startedAt, ", completedAt=", this.completedAt);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", pickup=");
        sb.append(this.pickup);
        sb.append(", dropoff=");
        sb.append(this.dropoff);
        sb.append(", vendorReview=");
        sb.append(this.vendorReview);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof launchSdkClickResponseTasksI)) {
            return false;
        }
        launchSdkClickResponseTasksI launchsdkclickresponsetasksi = (launchSdkClickResponseTasksI) obj;
        if (this.id != launchsdkclickresponsetasksi.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderCode, launchsdkclickresponsetasksi.orderCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedAt, launchsdkclickresponsetasksi.startedAt}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.completedAt, launchsdkclickresponsetasksi.completedAt}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, launchsdkclickresponsetasksi.items}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickup, launchsdkclickresponsetasksi.pickup}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dropoff, launchsdkclickresponsetasksi.dropoff}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendorReview, launchsdkclickresponsetasksi.vendorReview}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i2 = serializer + 13;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    int i4 = write + 21;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = write + 35;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 != 0;
            }
            int i7 = serializer + 87;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i8 = serializer + 85;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
