package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class setPopupCallback extends setIcon {
    public PorterDuff.Mode MediaBrowserCompatMediaItem;
    public ColorStateList MediaDescriptionCompat;
    public final getWindowAnimations MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public Drawable RatingCompat;
    public boolean serializer;

    @Override // o.setIcon
    public final void RemoteActionCompatParcelizer(AttributeSet attributeSet, int i) {
        super.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.seekBarStyle);
        getWindowAnimations getwindowanimations = this.MediaMetadataCompat;
        Context context = getwindowanimations.getContext();
        int[] iArr = onUserLeaveHint.AppCompatSeekBar;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, com.logistics.rider.glovo.R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        FocusPropertiesNode.IconCompatParcelizer(getwindowanimations, getwindowanimations.getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, com.logistics.rider.glovo.R.attr.seekBarStyle);
        Drawable drawableWrite = emojiProcessorRemoteActionCompatParcelizer.write(0);
        if (drawableWrite != null) {
            getwindowanimations.setThumb(drawableWrite);
        }
        Drawable drawableRemoteActionCompatParcelizer = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1);
        Drawable drawable = this.RatingCompat;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.RatingCompat = drawableRemoteActionCompatParcelizer;
        if (drawableRemoteActionCompatParcelizer != null) {
            drawableRemoteActionCompatParcelizer.setCallback(getwindowanimations);
            drawableRemoteActionCompatParcelizer.setLayoutDirection(getwindowanimations.getLayoutDirection());
            if (drawableRemoteActionCompatParcelizer.isStateful()) {
                drawableRemoteActionCompatParcelizer.setState(getwindowanimations.getDrawableState());
            }
            serializer();
        }
        getwindowanimations.invalidate();
        if (typedArray.hasValue(3)) {
            this.MediaBrowserCompatMediaItem = getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(3, -1), this.MediaBrowserCompatMediaItem);
            this.MediaSessionCompatQueueItem = true;
        }
        if (typedArray.hasValue(2)) {
            this.MediaDescriptionCompat = emojiProcessorRemoteActionCompatParcelizer.serializer(2);
            this.serializer = true;
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        serializer();
    }

    public setPopupCallback(getWindowAnimations getwindowanimations) {
        super(getwindowanimations);
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.serializer = false;
        this.MediaSessionCompatQueueItem = false;
        this.MediaMetadataCompat = getwindowanimations;
    }

    public final void IconCompatParcelizer(android.graphics.Canvas canvas) {
        if (this.RatingCompat != null) {
            getWindowAnimations getwindowanimations = this.MediaMetadataCompat;
            int max = getwindowanimations.getMax();
            if (max > 1) {
                int intrinsicWidth = this.RatingCompat.getIntrinsicWidth();
                int intrinsicHeight = this.RatingCompat.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.RatingCompat.setBounds(-i, -i2, i, i2);
                float width = ((getwindowanimations.getWidth() - getwindowanimations.getPaddingLeft()) - getwindowanimations.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(getwindowanimations.getPaddingLeft(), getwindowanimations.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.RatingCompat.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final void serializer() {
        Drawable drawable = this.RatingCompat;
        if (drawable != null) {
            if (this.serializer || this.MediaSessionCompatQueueItem) {
                Drawable drawableMutate = drawable.mutate();
                this.RatingCompat = drawableMutate;
                if (this.serializer) {
                    drawableMutate.setTintList(this.MediaDescriptionCompat);
                }
                if (this.MediaSessionCompatQueueItem) {
                    this.RatingCompat.setTintMode(this.MediaBrowserCompatMediaItem);
                }
                if (this.RatingCompat.isStateful()) {
                    this.RatingCompat.setState(this.MediaMetadataCompat.getDrawableState());
                }
            }
        }
    }
}
