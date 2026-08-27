package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.PhoneCallActionData$Companion;
import kotlinx.serialization.Serializable;
import o.setGestureExclusionRects;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "phone_call")
@SuppressLint
public final class r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs extends getWindowTitle {
    public static final PhoneCallActionData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.PhoneCallActionData$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 95;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGestureExclusionRects setgestureexclusionrects = setGestureExclusionRects.read;
            int i4 = RemoteActionCompatParcelizer + 57;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgestureexclusionrects;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String callee;
    public final String calleeName;
    public final String confirmationNumber;
    public final boolean masked;
    public final String phoneNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.PhoneCallActionData$Companion] */
    static {
        int i = serializer + 95;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.phoneNumber;
        }
        int i3 = 5 / 0;
        return this.phoneNumber;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.callee;
        int i5 = i3 + 125;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.masked;
        int i5 = i2 + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.calleeName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.confirmationNumber;
        int i4 = i3 + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs(int i, String str, String str2, String str3, String str4, boolean z) {
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
                int i3 = IconCompatParcelizer + 23;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                this.calleeName = null;
            } else {
                this.calleeName = str3;
            }
            int i5 = 2 % 2;
            if ((i & 16) == 0) {
                int i6 = IconCompatParcelizer + 53;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.confirmationNumber = null;
                return;
            }
            this.confirmationNumber = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setGestureExclusionRects.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PhoneCallActionData(phoneNumber=***, masked=");
        sb.append(this.masked);
        sb.append(", callee=");
        sb.append(this.callee);
        sb.append(", calleeName=***, confirmationNumber=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.confirmationNumber, ")");
        int i2 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = 1;
        if (i3 % 2 == 0) {
            iM = d$$ExternalSyntheticOutline0.m(this.phoneNumber.hashCode() >>> 102, 29, this.masked);
            str = this.callee;
            if (str == null) {
                iHashCode = 1;
                i = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    i4 = 0;
                }
            } else {
                int iHashCode2 = str.hashCode();
                iHashCode = i4;
                i4 = iHashCode2;
            }
        } else {
            iM = d$$ExternalSyntheticOutline0.m(this.phoneNumber.hashCode() * 31, 31, this.masked);
            str = this.callee;
            if (str == null) {
                iHashCode = 0;
                i = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    i4 = 0;
                }
            } else {
                i4 = 0;
                int iHashCode3 = str.hashCode();
                iHashCode = i4;
                i4 = iHashCode3;
            }
        }
        String str2 = this.calleeName;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.confirmationNumber;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return ((((iM + i4) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs) {
                r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs = (r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs) obj;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.phoneNumber}, getCieXyz.write())).booleanValue()) || this.masked != r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.masked) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.callee}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calleeName, r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.calleeName}, getCieXyz.write())).booleanValue()) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.confirmationNumber}, getCieXyz.write())).booleanValue();
                    }
                    int i5 = IconCompatParcelizer + 73;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i5 % 2 == 0;
                }
                int i6 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            return false;
        }
        int i8 = i2 + 9;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
