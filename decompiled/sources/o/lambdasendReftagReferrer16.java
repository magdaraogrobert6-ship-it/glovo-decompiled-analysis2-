package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.lambdasetEnabled6;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lambdasendReftagReferrer16 {
    public static final RealtimeMessage$DeliveryUpdated$Payload$Companion Companion = new Object() { // from class: com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Payload$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            lambdasetEnabled6 lambdasetenabled6;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                lambdasetenabled6 = lambdasetEnabled6.read;
                int i3 = 30 / 0;
            } else {
                lambdasetenabled6 = lambdasetEnabled6.read;
            }
            int i4 = read + 83;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return lambdasetenabled6;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final long deliveryId;
    public final String orderCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.realtime.api.domain.models.RealtimeMessage$DeliveryUpdated$Payload$Companion] */
    static {
        int i = serializer + 113;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ lambdasendReftagReferrer16(int i, long j, String str) {
        if (3 == (i & 3)) {
            this.orderCode = str;
            this.deliveryId = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, lambdasetEnabled6.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.deliveryId) + (this.orderCode.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Payload(orderCode=", this.orderCode, this.deliveryId, ", deliveryId=");
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasendReftagReferrer16)) {
            int i4 = i3 + 51;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 23;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        lambdasendReftagReferrer16 lambdasendreftagreferrer16 = (lambdasendReftagReferrer16) obj;
        Object[] objArr = {this.orderCode, lambdasendreftagreferrer16.orderCode};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.deliveryId == lambdasendreftagreferrer16.deliveryId) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 99;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
