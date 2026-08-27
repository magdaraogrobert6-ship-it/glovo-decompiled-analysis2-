package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final boolean read;
    public final RgbCompanionExternalSyntheticLambda0 serializer;

    public final boolean read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.read;
        int i4 = i3 + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final RgbCompanionExternalSyntheticLambda0 write() {
        RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            rgbCompanionExternalSyntheticLambda0 = this.serializer;
            int i4 = 56 / 0;
        } else {
            rgbCompanionExternalSyntheticLambda0 = this.serializer;
        }
        int i5 = i2 + 57;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return rgbCompanionExternalSyntheticLambda0;
    }

    public r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU(RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0, boolean z) {
        rgbCompanionExternalSyntheticLambda0.getClass();
        this.serializer = rgbCompanionExternalSyntheticLambda0;
        this.read = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read) + (this.serializer.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU) {
            r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU r8lambdainyw9kmcom6xfew3z44ookhespu = (r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdainyw9kmcom6xfew3z44ookhespu.serializer}, getCieXyz.write())).booleanValue()) {
                return this.read == r8lambdainyw9kmcom6xfew3z44ookhespu.read;
            }
            int i2 = RemoteActionCompatParcelizer + 73;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PermissionViewState(permissionStateHolder=" + this.serializer + ", isDismissible=" + this.read + ")";
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
