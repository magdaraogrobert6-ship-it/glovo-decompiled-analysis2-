package o;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class placeWithLayerdefault implements isCaptured {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout IconCompatParcelizer;
    public final /* synthetic */ View RemoteActionCompatParcelizer;
    public final /* synthetic */ AppBarLayout read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ AppBarLayout.BaseBehavior write;

    @Override // o.isCaptured
    public final boolean read(View view) {
        this.write.serializer(this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, this.serializer, new int[]{0, 0});
        return true;
    }

    public placeWithLayerdefault(AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.write = baseBehavior;
        this.IconCompatParcelizer = coordinatorLayout;
        this.read = appBarLayout;
        this.RemoteActionCompatParcelizer = view;
        this.serializer = i;
    }
}
