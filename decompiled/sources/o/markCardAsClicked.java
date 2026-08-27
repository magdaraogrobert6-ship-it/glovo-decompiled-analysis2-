package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class markCardAsClicked {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final afterRollback serializer;

    public markCardAsClicked(afterRollback afterrollback, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        afterrollback.getClass();
        this.serializer = afterrollback;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode = this.serializer.hashCode();
            return Boolean.hashCode(this.IconCompatParcelizer) >> ((this.read.hashCode() / (iHashCode + 82)) << 61);
        }
        int iHashCode2 = this.serializer.hashCode();
        return Boolean.hashCode(this.IconCompatParcelizer) + ((this.read.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SignInParams(user=");
        sb.append(this.serializer);
        sb.append(", onAuthenticationError=");
        sb.append(this.read);
        sb.append(", biometricSignIn=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 81;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof markCardAsClicked) {
            markCardAsClicked markcardasclicked = (markCardAsClicked) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, markcardasclicked.serializer}, getCieXyz.write())).booleanValue() && this.read.equals(markcardasclicked.read) && this.IconCompatParcelizer == markcardasclicked.IconCompatParcelizer;
        }
        int i6 = i2 + 41;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
