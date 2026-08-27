package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Testing$Companion;
import kotlinx.serialization.Serializable;
import o.getPreviewProviderParameters;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findGroupsThatMatchPredicatedefault {
    public static final SoftPosDeeplinkResponse$Data$Testing$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Testing$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPreviewProviderParameters getpreviewproviderparameters = getPreviewProviderParameters.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getpreviewproviderparameters;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String acceptanceEndpoint;
    public final String orderId;
    public final String transactionId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Data$Testing$Companion] */
    static {
        int i = write + 21;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    public /* synthetic */ findGroupsThatMatchPredicatedefault(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.acceptanceEndpoint = str;
            this.orderId = str2;
            this.transactionId = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getPreviewProviderParameters.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.transactionId.hashCode() - af$$ExternalSyntheticOutline0.m(this.acceptanceEndpoint.hashCode() >> 19, 31, this.orderId);
        }
        return this.transactionId.hashCode() + af$$ExternalSyntheticOutline0.m(this.acceptanceEndpoint.hashCode() * 31, 31, this.orderId);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Testing(acceptanceEndpoint=", this.acceptanceEndpoint, ", orderId=", this.orderId, ", transactionId="), this.transactionId, ")");
        int i4 = read + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findGroupsThatMatchPredicatedefault)) {
            return false;
        }
        findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault = (findGroupsThatMatchPredicatedefault) obj;
        Object[] objArr = {this.acceptanceEndpoint, findgroupsthatmatchpredicatedefault.acceptanceEndpoint};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.orderId, findgroupsthatmatchpredicatedefault.orderId};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.transactionId, findgroupsthatmatchpredicatedefault.transactionId};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = read + 51;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 101;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 125;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
