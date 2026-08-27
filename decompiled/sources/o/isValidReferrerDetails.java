package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.push.messages.display.backgroud.data.PushNotificationIdentifierData$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isValidReferrerDetails {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final long acknowledgedTimestamp;
    public final String category;
    public final String deliveryId;
    public final deleteEventMetadata sourceTrigger;
    public static final PushNotificationIdentifierData$Companion Companion = new PushNotificationIdentifierData$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(19))};

    static {
        int i = RemoteActionCompatParcelizer + 83;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ isValidReferrerDetails(int i, String str, String str2, long j, deleteEventMetadata deleteeventmetadata) {
        if (15 == (i & 15)) {
            this.deliveryId = str;
            this.category = str2;
            this.acknowledgedTimestamp = j;
            this.sourceTrigger = deleteeventmetadata;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, hasChangedStateI.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.sourceTrigger.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.deliveryId.hashCode() * 31, 31, this.category), 31, this.acknowledgedTimestamp);
        int i4 = write + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public isValidReferrerDetails(String str, String str2, long j, deleteEventMetadata deleteeventmetadata) {
        deleteeventmetadata.getClass();
        this.deliveryId = str;
        this.category = str2;
        this.acknowledgedTimestamp = j;
        this.sourceTrigger = deleteeventmetadata;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PushNotificationIdentifierData(deliveryId=", this.deliveryId, ", category=", this.category, ", acknowledgedTimestamp=");
        sbM.append(this.acknowledgedTimestamp);
        sbM.append(", sourceTrigger=");
        sbM.append(this.sourceTrigger);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isValidReferrerDetails)) {
            return false;
        }
        isValidReferrerDetails isvalidreferrerdetails = (isValidReferrerDetails) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryId, isvalidreferrerdetails.deliveryId}, getCieXyz.write())).booleanValue()) {
            int i2 = write + 113;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.category, isvalidreferrerdetails.category}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 119;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        if (this.acknowledgedTimestamp != isvalidreferrerdetails.acknowledgedTimestamp) {
            return false;
        }
        if (this.sourceTrigger != isvalidreferrerdetails.sourceTrigger) {
            int i5 = write + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = write + 119;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
