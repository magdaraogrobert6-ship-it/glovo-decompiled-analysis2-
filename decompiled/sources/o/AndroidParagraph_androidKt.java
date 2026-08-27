package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion;
import kotlinx.serialization.Serializable;
import o.accessattachIndentationFixSpan;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class AndroidParagraph_androidKt {
    public static final HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 55;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessattachIndentationFixSpan accessattachindentationfixspan = accessattachIndentationFixSpan.RemoteActionCompatParcelizer;
            int i4 = read + 49;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return accessattachindentationfixspan;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String address;
    public final String customerNote;
    public final String entityNote;
    public final String name;
    public final String orderId;
    public final String phoneNumber;
    public final String totalAmountInCurrency;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAppProvidesChatConfig$Payload$Delivery$Companion] */
    static {
        int i = serializer + 49;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public /* synthetic */ AndroidParagraph_androidKt(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i2;
        if (16 != (i & 16)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 16, accessattachIndentationFixSpan.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.address = null;
            int i3 = write + 81;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            if ((i & 2) == 0) {
                this.customerNote = null;
                int i4 = 2 % 2;
            } else {
                this.customerNote = str2;
            }
            if ((i & 4) == 0) {
                this.entityNote = null;
            } else {
                this.entityNote = str3;
            }
            if ((i & 8) == 0) {
                i2 = read + 105;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    this.name = null;
                    throw null;
                }
                this.name = null;
            } else {
                this.name = str4;
            }
            this.orderId = str5;
            if ((i & 32) == 0) {
                int i5 = read + 105;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.phoneNumber = null;
                int i7 = 2 % 2;
            } else {
                this.phoneNumber = str6;
            }
            if ((i & 64) == 0) {
                this.totalAmountInCurrency = null;
                return;
            }
            this.totalAmountInCurrency = str7;
            int i8 = write + 77;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        this.address = str;
        int i10 = 2 % 2;
        if ((i & 2) == 0) {
            this.customerNote = null;
            int i11 = 2 % 2;
        } else {
            this.customerNote = str2;
        }
        if ((i & 4) == 0) {
            this.entityNote = null;
        } else {
            this.entityNote = str3;
        }
        if ((i & 8) == 0) {
            i2 = read + 105;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.name = null;
                throw null;
            }
            this.name = null;
        } else {
            this.name = str4;
        }
        this.orderId = str5;
        if ((i & 32) == 0) {
            int i12 = read + 105;
            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            this.phoneNumber = null;
            int i14 = 2 % 2;
        } else {
            this.phoneNumber = str6;
        }
        if ((i & 64) == 0) {
            this.totalAmountInCurrency = null;
            return;
        }
        this.totalAmountInCurrency = str7;
        int i15 = write + 77;
        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Delivery(address=", this.address, ", customerNote=", this.customerNote, ", entityNote=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.entityNote, ", name=", this.name, ", orderId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.orderId, ", phoneNumber=", this.phoneNumber, ", totalAmountInCurrency=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.totalAmountInCurrency, ")");
        int i4 = write + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public AndroidParagraph_androidKt(String str, String str2, String str3, String str4, String str5, String str6) {
        str4.getClass();
        this.address = str;
        this.customerNote = str2;
        this.entityNote = null;
        this.name = str3;
        this.orderId = str4;
        this.phoneNumber = str5;
        this.totalAmountInCurrency = str6;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        int iHashCode5 = (i2 % 2 == 0 ? (str = this.address) != null : (str = this.address) != null) ? str.hashCode() : 0;
        String str2 = this.customerNote;
        if (str2 == null) {
            int i3 = write + 91;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.entityNote;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        if (str4 == null) {
            int i5 = write + 53;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31, 31, this.orderId);
        String str5 = this.phoneNumber;
        if (str5 == null) {
            int i7 = write;
            int i8 = i7 + 7;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
            int i9 = i7 + 91;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.totalAmountInCurrency;
        if (str6 == null) {
            int i11 = write + 51;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode4 = str6.hashCode();
        }
        return ((iM + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof AndroidParagraph_androidKt)) {
                return false;
            }
            AndroidParagraph_androidKt androidParagraph_androidKt = (AndroidParagraph_androidKt) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, androidParagraph_androidKt.address}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerNote, androidParagraph_androidKt.customerNote}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entityNote, androidParagraph_androidKt.entityNote}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, androidParagraph_androidKt.name}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 17;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, androidParagraph_androidKt.orderId}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, androidParagraph_androidKt.phoneNumber}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.totalAmountInCurrency, androidParagraph_androidKt.totalAmountInCurrency}, getCieXyz.write())).booleanValue();
                }
                int i4 = write + 91;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 43;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 57;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
