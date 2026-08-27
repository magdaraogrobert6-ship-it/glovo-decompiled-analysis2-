package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.nafath.VerificationStatus$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class q1 {
    public static final VerificationStatus$Companion Companion = new VerificationStatus$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String displayCode;
    public final long expiresAtEpochSeconds;
    public final String transactionId;

    static {
        int i = read + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ q1(int i, long j, String str, String str2) {
        if (3 == (i & 3)) {
            this.displayCode = str;
            this.expiresAtEpochSeconds = j;
            if ((i & 4) == 0) {
                this.transactionId = null;
                int i2 = RemoteActionCompatParcelizer + 47;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.transactionId = str2;
            int i4 = write + 89;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, q2.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("VerificationStatus(displayCode=", this.displayCode, this.expiresAtEpochSeconds, ", expiresAtEpochSeconds="), ", transactionId=", this.transactionId, ")");
            int i3 = 29 / 0;
        } else {
            strM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("VerificationStatus(displayCode=", this.displayCode, this.expiresAtEpochSeconds, ", expiresAtEpochSeconds="), ", transactionId=", this.transactionId, ")");
        }
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.displayCode.hashCode() * 31, 31, this.expiresAtEpochSeconds);
        String str = this.transactionId;
        if (str == null) {
            int i4 = write + 63;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 121;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            int i4 = i2 + 25;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        q1 q1Var = (q1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.displayCode, q1Var.displayCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.expiresAtEpochSeconds == q1Var.expiresAtEpochSeconds) {
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.transactionId, q1Var.transactionId}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i6 = write + 23;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
