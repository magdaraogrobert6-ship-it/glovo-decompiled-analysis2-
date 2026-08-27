package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustPlayStoreSubscription extends AdjustPlayStorePurchase {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public AdjustPlayStoreSubscription(String str, String str2, String str3) {
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
    }

    public final int hashCode() {
        int iM;
        String str;
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() + 113, 103, this.serializer);
            str = this.IconCompatParcelizer;
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer);
            str = this.IconCompatParcelizer;
        }
        return str.hashCode() + iM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BecomeAvailable(title=", this.read, ", description=", this.serializer, ", buttonText="), this.IconCompatParcelizer, ")");
        }
        int i3 = 42 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BecomeAvailable(title=", this.read, ", description=", this.serializer, ", buttonText="), this.IconCompatParcelizer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 55;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof AdjustPlayStoreSubscription)) {
            return false;
        }
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = (AdjustPlayStoreSubscription) obj;
        return this.read.equals(adjustPlayStoreSubscription.read) && this.serializer.equals(adjustPlayStoreSubscription.serializer) && this.IconCompatParcelizer.equals(adjustPlayStoreSubscription.IconCompatParcelizer);
    }
}
