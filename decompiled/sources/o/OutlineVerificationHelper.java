package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.contract.model.DeliveryInfo$Companion;
import kotlinx.serialization.Serializable;
import o.RenderNodeVerificationHelper;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class OutlineVerificationHelper {
    public static final DeliveryInfo$Companion Companion = new Object() { // from class: com.deliveryhero.contract.model.DeliveryInfo$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return RenderNodeVerificationHelper.RemoteActionCompatParcelizer;
        }
    };
    public final String address;
    public final String amount;
    public final String code;
    public final String comments;
    public final String customer;
    public final String deliveryNotes;
    public final long id;
    public final String phoneNumber;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.code;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.comments;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.customer;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.phoneNumber;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deliveryNotes;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutlineVerificationHelper)) {
            return false;
        }
        OutlineVerificationHelper outlineVerificationHelper = (OutlineVerificationHelper) obj;
        if (this.id != outlineVerificationHelper.id) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, outlineVerificationHelper.code}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amount, outlineVerificationHelper.amount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, outlineVerificationHelper.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.comments, outlineVerificationHelper.comments}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customer, outlineVerificationHelper.customer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, outlineVerificationHelper.phoneNumber}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryNotes, outlineVerificationHelper.deliveryNotes}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryInfo(id=");
        sb.append(this.id);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", comments=");
        sb.append(this.comments);
        sb.append(", customer=");
        sb.append(this.customer);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", deliveryNotes=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.deliveryNotes, ')');
    }

    public /* synthetic */ OutlineVerificationHelper(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 == (i & 127)) {
            this.id = j;
            this.code = str;
            this.amount = str2;
            this.address = str3;
            this.comments = str4;
            this.customer = str5;
            this.phoneNumber = str6;
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                this.deliveryNotes = null;
                return;
            } else {
                this.deliveryNotes = str7;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, RenderNodeVerificationHelper.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public OutlineVerificationHelper(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = j;
        this.code = str;
        this.amount = str2;
        this.address = str3;
        this.comments = str4;
        this.customer = str5;
        this.phoneNumber = str6;
        this.deliveryNotes = null;
    }
}
