package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class getXnZO2Niw extends FrameLayout {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getXnZO2Niw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int maxWidth = getMaxWidth();
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            int i6 = RemoteActionCompatParcelizer + 19;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i7;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (mode != 0) {
                int i8 = i7 + 83;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), maxWidth), 1073741824);
            int i10 = write + 23;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        super.onMeasure(i, i2);
    }

    private final int getMaxWidth() {
        int i = 2 % 2;
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        int iMin = Math.min((int) (i4 * 0.75f), Math.min(i4 - ((int) (64.0f * f)), (int) (f * 360.0f)));
        int i5 = write + 3;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return iMin;
        }
        throw null;
    }
}
