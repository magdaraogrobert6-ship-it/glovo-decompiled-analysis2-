package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class onCreateOptionsMenu implements View.OnLayoutChangeListener {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ onDestroyOptionsMenu write;

    public onCreateOptionsMenu(onDestroyOptionsMenu ondestroyoptionsmenu, int i) {
        this.write = ondestroyoptionsmenu;
        this.read = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = serializer + 75;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        view.removeOnLayoutChangeListener(this);
        int i12 = Resources.getSystem().getDisplayMetrics().heightPixels;
        int i13 = this.read;
        int i14 = i13 + ((int) ((i12 - i13) * 0.01999998f));
        onDestroyOptionsMenu ondestroyoptionsmenu = this.write;
        ondestroyoptionsmenu.write.setExpandedOffset(i14);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = ondestroyoptionsmenu.read;
        if (constraintLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int i15 = serializer + 79;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i14);
            constraintLayout.requestLayout();
        }
    }
}
