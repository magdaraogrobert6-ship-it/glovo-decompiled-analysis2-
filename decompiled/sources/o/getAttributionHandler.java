package o;

import com.ui.common.widget.chooseoption.entity.ChooseOptionFragmentArguments;

/* JADX INFO: loaded from: classes3.dex */
public final class getAttributionHandler extends AdjustEventSuccess {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final ChooseOptionFragmentArguments read;

    public getAttributionHandler(ChooseOptionFragmentArguments chooseOptionFragmentArguments) {
        this.read = chooseOptionFragmentArguments;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSelectBreakDuration(chooseOptionArgs=" + this.read + ")";
        int i2 = write + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj && (!(obj instanceof getAttributionHandler) || !this.read.equals(((getAttributionHandler) obj).read))) {
            return false;
        }
        int i3 = IconCompatParcelizer + 37;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
