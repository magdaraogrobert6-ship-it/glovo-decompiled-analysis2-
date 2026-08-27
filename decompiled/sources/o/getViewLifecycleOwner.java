package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getViewLifecycleOwner extends hasOptionsMenu {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;

    public getViewLifecycleOwner(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ddefault.IconCompatParcelizer.hashCode() >> (this.IconCompatParcelizer.hashCode() + 45);
        }
        return (this.IconCompatParcelizer.hashCode() * 31) + ddefault.IconCompatParcelizer.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            int i4 = 66 / 0;
            if (this == obj) {
                int i5 = i3 + 33;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                if (!(obj instanceof getViewLifecycleOwner) || !this.IconCompatParcelizer.equals(((getViewLifecycleOwner) obj).IconCompatParcelizer)) {
                    return false;
                }
                ddefault ddefaultVar = ddefault.serializer;
            }
        } else {
            if (this != obj) {
                if (!(obj instanceof getViewLifecycleOwner)) {
                    ddefault ddefaultVar2 = ddefault.serializer;
                }
                return false;
            }
            int i7 = i3 + 33;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = RemoteActionCompatParcelizer + 81;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(message=" + this.IconCompatParcelizer + ", type=" + ddefault.IconCompatParcelizer + ")";
        int i2 = write + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
