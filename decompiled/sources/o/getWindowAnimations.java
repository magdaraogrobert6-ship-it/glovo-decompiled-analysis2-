package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes4.dex */
public final class getWindowAnimations extends SeekBar {
    public final setPopupCallback serializer;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.serializer.IconCompatParcelizer(canvas);
        }
    }

    public getWindowAnimations(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.seekBarStyle);
        setSupportBackgroundTintList.read(this, getContext());
        setPopupCallback setpopupcallback = new setPopupCallback(this);
        this.serializer = setpopupcallback;
        setpopupcallback.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        setPopupCallback setpopupcallback = this.serializer;
        getWindowAnimations getwindowanimations = setpopupcallback.MediaMetadataCompat;
        Drawable drawable = setpopupcallback.RatingCompat;
        if (drawable != null && drawable.isStateful() && drawable.setState(getwindowanimations.getDrawableState())) {
            getwindowanimations.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.serializer.RatingCompat;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
