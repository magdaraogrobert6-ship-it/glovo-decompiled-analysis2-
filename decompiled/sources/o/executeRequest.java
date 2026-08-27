package o;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class executeRequest implements PagerStateKt {
    public static final executeRequest IconCompatParcelizer = new executeRequest();

    @Override // o.PagerStateKt
    public boolean write() {
        return false;
    }

    @Override // o.PagerStateKt
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public androidx.camera.view.PendingValue mo25createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, androidx.compose.ui.unit.Density density, float f3) {
        return new androidx.camera.view.PendingValue(15, new Magnifier(view));
    }
}
