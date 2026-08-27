package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.SubzoneEntity$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onIsEnabledRead {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final SubzoneEntity$Companion Companion = new SubzoneEntity$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final OnDeeplinkResolvedListener centerGeoJson;
    public final List h3Indexes;
    public final int id;
    public final String name;
    public final OnEventTrackingFailedListener payment;
    public final List zoneIds;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new performPushDeliveryFlushlambda1(4)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new performPushDeliveryFlushlambda1(5)), null};
        int i = IconCompatParcelizer + 91;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ onIsEnabledRead(int i, int i2, String str, List list, OnDeeplinkResolvedListener onDeeplinkResolvedListener, List list2, OnEventTrackingFailedListener onEventTrackingFailedListener) {
        if (31 == (i & 31)) {
            this.id = i2;
            this.name = str;
            this.zoneIds = list;
            this.centerGeoJson = onDeeplinkResolvedListener;
            this.h3Indexes = list2;
            if ((i & 32) == 0) {
                this.payment = null;
                int i3 = serializer + 5;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            }
            this.payment = onEventTrackingFailedListener;
            int i5 = serializer + 125;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, onLastDeeplinkRead.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public onIsEnabledRead(int i, String str, List list, OnDeeplinkResolvedListener onDeeplinkResolvedListener, List list2, OnEventTrackingFailedListener onEventTrackingFailedListener) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.id = i;
        this.name = str;
        this.zoneIds = list;
        this.centerGeoJson = onDeeplinkResolvedListener;
        this.h3Indexes = list2;
        this.payment = onEventTrackingFailedListener;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.zoneIds, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.name), 31);
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.h3Indexes, (this.centerGeoJson.hashCode() + iM) * 31, 31);
        OnEventTrackingFailedListener onEventTrackingFailedListener = this.payment;
        if (onEventTrackingFailedListener == null) {
            int i4 = serializer + 87;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = onEventTrackingFailedListener.hashCode();
        }
        return iM2 + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SubzoneEntity(id=", this.id, ", name=", this.name, ", zoneIds=");
        sbM.append(this.zoneIds);
        sbM.append(", centerGeoJson=");
        sbM.append(this.centerGeoJson);
        sbM.append(", h3Indexes=");
        sbM.append(this.h3Indexes);
        sbM.append(", payment=");
        sbM.append(this.payment);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof onIsEnabledRead))) {
            onIsEnabledRead onisenabledread = (onIsEnabledRead) obj;
            if (this.id == onisenabledread.id) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, onisenabledread.name}, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 93;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneIds, onisenabledread.zoneIds}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.centerGeoJson, onisenabledread.centerGeoJson}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.h3Indexes, onisenabledread.h3Indexes}, getCieXyz.write())).booleanValue()) {
                    int i4 = serializer + 17;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payment, onisenabledread.payment}, getCieXyz.write())).booleanValue();
            }
            int i6 = serializer + 67;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 99;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
