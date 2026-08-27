package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class setAllowEnterTransitionOverlap implements accessgetPositiveInfinitycp {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final androidx.compose.ui.platform.ComposeView IconCompatParcelizer;
    public final NestedScrollView RemoteActionCompatParcelizer;
    public final androidx.constraintlayout.widget.ConstraintLayout read;
    public final androidx.compose.ui.platform.ComposeView serializer;
    public final androidx.compose.ui.platform.ComposeView write;

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.read;
        int i4 = i3 + 9;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public setAllowEnterTransitionOverlap(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.compose.ui.platform.ComposeView composeView, androidx.compose.ui.platform.ComposeView composeView2, NestedScrollView nestedScrollView, androidx.compose.ui.platform.ComposeView composeView3) {
        this.read = constraintLayout;
        this.write = composeView;
        this.IconCompatParcelizer = composeView2;
        this.RemoteActionCompatParcelizer = nestedScrollView;
        this.serializer = composeView3;
    }
}
