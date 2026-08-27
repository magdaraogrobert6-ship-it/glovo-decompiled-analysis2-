package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignRequest$Companion;
import kotlinx.serialization.Serializable;
import o.access202;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PurchaseVerificationHandler {
    public static final QuickSessionAssignRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            access202 access202Var = access202.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return access202Var;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final int cityId;
    public final String endTime;
    public final String startTime;
    public final int zoneId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 37;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ PurchaseVerificationHandler(String str, int i, int i2, int i3, String str2) {
        if (15 == (i & 15)) {
            this.cityId = i2;
            this.zoneId = i3;
            this.startTime = str;
            this.endTime = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, access202.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m(this.cityId, this.zoneId, "QuickSessionAssignRequest(cityId=", ", zoneId=", ", startTime="), this.startTime, ", endTime=", this.endTime, ")");
        int i4 = RemoteActionCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.endTime.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.zoneId, Integer.hashCode(this.cityId) * 31, 31), 31, this.startTime);
        int i4 = write + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public PurchaseVerificationHandler(int i, String str, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.cityId = i;
        this.zoneId = i2;
        this.startTime = str;
        this.endTime = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 9;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseVerificationHandler)) {
            int i5 = i4 + 115;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        PurchaseVerificationHandler purchaseVerificationHandler = (PurchaseVerificationHandler) obj;
        if (this.cityId != purchaseVerificationHandler.cityId) {
            int i6 = i4 + 13;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.zoneId != purchaseVerificationHandler.zoneId) {
            int i8 = i2 + 81;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startTime, purchaseVerificationHandler.startTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endTime, purchaseVerificationHandler.endTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i9 = write + 107;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
