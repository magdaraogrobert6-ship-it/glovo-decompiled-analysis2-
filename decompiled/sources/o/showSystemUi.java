package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.PhoneCallAction$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.widthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class showSystemUi extends getNoopState {
    public static final PhoneCallAction$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PhoneCallAction$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            widthDp widthdp = widthDp.write;
            int i4 = serializer + 95;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return widthdp;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String callee;
    public final String calleeName;
    public final String confirmationNumber;
    public final boolean masked;
    public final String phoneNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.PhoneCallAction$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 103;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ showSystemUi(int i, String str, String str2, String str3, String str4, boolean z) {
        if (3 == (i & 3)) {
            this.phoneNumber = str;
            this.masked = z;
            if ((i & 4) == 0) {
                this.callee = null;
            } else {
                this.callee = str2;
                int i2 = 2 % 2;
            }
            if ((i & 8) == 0) {
                int i3 = write + 37;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    this.calleeName = null;
                } else {
                    this.calleeName = null;
                    throw null;
                }
            } else {
                this.calleeName = str3;
                int i4 = serializer + 53;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 16) == 0) {
                this.confirmationNumber = null;
                return;
            }
            this.confirmationNumber = str4;
            int i7 = write + 119;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 92 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, widthDp.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PhoneCallAction(phoneNumber=***, masked=");
        sb.append(this.masked);
        sb.append(", callee=");
        sb.append(this.callee);
        sb.append(", calleeName=***, confirmationNumber=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.confirmationNumber, ")");
        int i2 = serializer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.phoneNumber.hashCode() * 31, 31, this.masked);
        String str = this.callee;
        if (str == null) {
            int i2 = write + 101;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.calleeName;
        if (str2 == null) {
            int i4 = write + 81;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.confirmationNumber;
        int iHashCode3 = ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i6 = write + 3;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public showSystemUi(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.phoneNumber = str;
        this.masked = z;
        this.callee = str2;
        this.calleeName = str3;
        this.confirmationNumber = str4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof showSystemUi) {
            showSystemUi showsystemui = (showSystemUi) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, showsystemui.phoneNumber}, getCieXyz.write())).booleanValue()) {
                if (this.masked != showsystemui.masked) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, showsystemui.callee}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calleeName, showsystemui.calleeName}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, showsystemui.confirmationNumber}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 93;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i3 = serializer + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
