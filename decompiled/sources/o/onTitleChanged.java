package o;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class onTitleChanged extends androidx.appcompat.widget.AppCompatImageView implements setSupportActionBar {
    public final /* synthetic */ onSupportActionModeStarted read;

    @Override // o.setSupportActionBar
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // o.setSupportActionBar
    public final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onTitleChanged(onSupportActionModeStarted onsupportactionmodestarted, Context context) {
        super(context, null, com.logistics.rider.glovo.R.attr.actionOverflowButtonStyle);
        this.read = onsupportactionmodestarted;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setAutoSizeTextTypeWithDefaults.serializer(this, getContentDescription());
        setOnTouchListener(new onWindowStartingSupportActionMode(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.read.serializer();
        return true;
    }
}
