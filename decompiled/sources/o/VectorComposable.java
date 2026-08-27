package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComponentinvalidateCallback1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposable {
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComponentinvalidateCallback1.RemoteActionCompatParcelizer;
        }
    };
    public final String address;
    public final String customerNote;
    public final String entityNote;
    public final String name;
    public final String orderId;
    public final String phoneNumber;
    public final String totalAmountInCurrency;

    public final int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.customerNote;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.entityNote;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iM = af$$ExternalSyntheticOutline0.m(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.orderId);
        String str5 = this.phoneNumber;
        int iHashCode4 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalAmountInCurrency;
        return ((iM + iHashCode4) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorComposable)) {
            return false;
        }
        VectorComposable vectorComposable = (VectorComposable) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, vectorComposable.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerNote, vectorComposable.customerNote}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entityNote, vectorComposable.entityNote}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, vectorComposable.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, vectorComposable.orderId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, vectorComposable.phoneNumber}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.totalAmountInCurrency, vectorComposable.totalAmountInCurrency}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Delivery(address=");
        sb.append(this.address);
        sb.append(", customerNote=");
        sb.append(this.customerNote);
        sb.append(", entityNote=");
        sb.append(this.entityNote);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", totalAmountInCurrency=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.totalAmountInCurrency, ')');
    }

    public /* synthetic */ VectorComposable(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 == (i & 127)) {
            this.address = str;
            this.customerNote = str2;
            this.entityNote = str3;
            this.name = str4;
            this.orderId = str5;
            this.phoneNumber = str6;
            this.totalAmountInCurrency = str7;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, VectorComponentinvalidateCallback1.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public VectorComposable(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.address = str;
        this.customerNote = str2;
        this.entityNote = str3;
        this.name = str4;
        this.orderId = str5;
        this.phoneNumber = str6;
        this.totalAmountInCurrency = str7;
    }
}
