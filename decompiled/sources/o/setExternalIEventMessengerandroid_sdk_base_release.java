package o;

import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;

/* JADX INFO: loaded from: classes3.dex */
public final class setExternalIEventMessengerandroid_sdk_base_release extends runGuardedForResultandroid_sdk_base_release {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final IdentityVerificationParams read;

    public final IdentityVerificationParams serializer() {
        IdentityVerificationParams identityVerificationParams;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            identityVerificationParams = this.read;
            int i4 = 87 / 0;
        } else {
            identityVerificationParams = this.read;
        }
        int i5 = i2 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return identityVerificationParams;
    }

    public setExternalIEventMessengerandroid_sdk_base_release(IdentityVerificationParams identityVerificationParams) {
        this.read = identityVerificationParams;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToFaceDetectionFlow(params=" + this.read + ")";
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof setExternalIEventMessengerandroid_sdk_base_release) && this.read.equals(((setExternalIEventMessengerandroid_sdk_base_release) obj).read)) {
            return true;
        }
        int i4 = IconCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
