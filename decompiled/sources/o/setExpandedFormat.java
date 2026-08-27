package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes4.dex */
public final class setExpandedFormat extends RatingBar {
    public final setIcon IconCompatParcelizer;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Bitmap bitmap = (Bitmap) this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            if (bitmap != null) {
                setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }

    public setExpandedFormat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.ratingBarStyle);
        setSupportBackgroundTintList.read(this, getContext());
        setIcon seticon = new setIcon(this);
        this.IconCompatParcelizer = seticon;
        seticon.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.ratingBarStyle);
    }
}
