package o;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class z7ExternalSyntheticLambda0 implements accessgetPositiveInfinitycp {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final LinearLayout serializer;

    public /* synthetic */ z7ExternalSyntheticLambda0(LinearLayout linearLayout, int i) {
        this.read = i;
        this.serializer = linearLayout;
    }

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            linearLayout = this.serializer;
            int i4 = 56 / 0;
        } else {
            linearLayout = this.serializer;
        }
        int i5 = i2 + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public final LinearLayout read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 115;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        LinearLayout linearLayout = this.serializer;
        int i4 = i2 + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return linearLayout;
    }
}
