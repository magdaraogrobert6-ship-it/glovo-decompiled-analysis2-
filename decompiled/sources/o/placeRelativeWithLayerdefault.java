package o;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class placeRelativeWithLayerdefault implements isCaptured {
    public final /* synthetic */ AppBarLayout IconCompatParcelizer;
    public final /* synthetic */ boolean read;

    @Override // o.isCaptured
    public final boolean read(View view) {
        this.IconCompatParcelizer.setExpanded(this.read);
        return true;
    }

    public placeRelativeWithLayerdefault(AppBarLayout appBarLayout, boolean z) {
        this.IconCompatParcelizer = appBarLayout;
        this.read = z;
    }
}
