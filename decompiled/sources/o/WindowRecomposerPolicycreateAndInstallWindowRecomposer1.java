package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowRecomposerPolicycreateAndInstallWindowRecomposer1 {
    public final int IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final /* synthetic */ int write;

    public WindowRecomposerPolicycreateAndInstallWindowRecomposer1(long j, int i) {
        this.write = i;
        if (i != 1) {
            long j2 = (j / 1000) - 315964782;
            this.RemoteActionCompatParcelizer = j2;
            this.serializer = (int) (j2 % 604800);
            int i2 = (int) (j2 / 604800);
            this.read = i2 / androidx.compose.ui.graphics.Fields.RotationZ;
            this.IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.RotationZ;
            return;
        }
        long j3 = (j / 1000) - 315964782;
        this.RemoteActionCompatParcelizer = j3;
        this.serializer = (int) (j3 % 604800);
        int i3 = (int) (j3 / 604800);
        this.read = i3 / androidx.compose.ui.graphics.Fields.RotationZ;
        this.IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.RotationZ;
    }

    public final String toString() {
        int i = this.write;
        int i2 = this.serializer;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.read;
        if (i != 0) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i4, i3, "weekRound: ", " weekNumber = ", " weekSecond: ");
            sbM.append(i2);
            return sbM.toString();
        }
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        StringBuilder sbM2 = m1$$ExternalSyntheticOutline0.m(i4, i3, "weekRound: ", " weekNumber = ", " weekSecond: ");
        sbM2.append(i2);
        return sbM2.toString();
    }
}
