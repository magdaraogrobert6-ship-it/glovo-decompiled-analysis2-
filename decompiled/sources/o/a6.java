package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;

/* JADX INFO: loaded from: classes3.dex */
public final class a6 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final execSessionSuccessCallbackCommand read;
    public final String serializer;

    public a6(String str, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand, LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$1, int i) {
        boolean z;
        if ((i & 16) != 0) {
            int i2 = write + 61;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = MediaDescriptionCompat + 47;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this.serializer = str;
        this.read = execsessionsuccesscallbackcommand;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = loginActivity$onCreate$1$1$1$1$5$1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.read.hashCode() + (iHashCode * 31)) * 961, 31, this.RemoteActionCompatParcelizer), 31, false);
        int i4 = MediaDescriptionCompat + 123;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MessageDialogEntity(title=null, description=" + this.serializer + ", mainActionButton=" + this.read + ", secondaryActionButton=null, cancellable=" + this.RemoteActionCompatParcelizer + ", shouldMainActionDismiss=false, onDismiss=" + this.IconCompatParcelizer + ")";
        int i2 = MediaDescriptionCompat + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaDescriptionCompat + 107;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            if (!(obj instanceof a6)) {
                return false;
            }
            a6 a6Var = (a6) obj;
            if (!this.serializer.equals(a6Var.serializer)) {
                return false;
            }
            if (this.read.equals(a6Var.read)) {
                if (this.RemoteActionCompatParcelizer != a6Var.RemoteActionCompatParcelizer || (!this.IconCompatParcelizer.equals(a6Var.IconCompatParcelizer))) {
                    return false;
                }
            } else {
                int i4 = MediaDescriptionCompat + 61;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
