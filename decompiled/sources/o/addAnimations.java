package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class addAnimations extends hasAnimationlambda00 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final makeTreedefault write;

    static {
        CustomerUnavailableTaskUiItem$Companion customerUnavailableTaskUiItem$Companion = makeTreedefault.Companion;
        int i = serializer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public addAnimations(makeTreedefault maketreedefault) {
        maketreedefault.getClass();
        this.write = maketreedefault;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        int i3 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerUnavailableTask(customerUnavailableTaskUiItem=" + this.write + ")";
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof addAnimations) {
            Object[] objArr = {this.write, ((addAnimations) obj).write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i2 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
