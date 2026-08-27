package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class supportRequestWindowFeature {
    public setSupportCompoundDrawablesTintList IconCompatParcelizer;
    public final View MediaBrowserCompatMediaItem;
    public setSupportCompoundDrawablesTintList RemoteActionCompatParcelizer;
    public setSupportCompoundDrawablesTintList serializer;
    public int read = -1;
    public final ensureSubDecor write = ensureSubDecor.write();

    public final void IconCompatParcelizer() {
        this.read = -1;
        serializer((ColorStateList) null);
        write();
    }

    public final void read(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        View view = this.MediaBrowserCompatMediaItem;
        Context context = view.getContext();
        int[] iArr = onUserLeaveHint.ViewBackgroundHelper;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        View view2 = this.MediaBrowserCompatMediaItem;
        FocusPropertiesNode.IconCompatParcelizer(view2, view2.getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, i);
        try {
            if (typedArray.hasValue(0)) {
                this.read = typedArray.getResourceId(0, -1);
                ensureSubDecor ensuresubdecor = this.write;
                Context context2 = view.getContext();
                int i2 = this.read;
                synchronized (ensuresubdecor) {
                    colorStateList = ensuresubdecor.write.read(context2, i2);
                }
                if (colorStateList != null) {
                    serializer(colorStateList);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(emojiProcessorRemoteActionCompatParcelizer.serializer(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(2, -1), null));
            }
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        } catch (Throwable th) {
            emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
            throw th;
        }
    }

    public final void serializer(int i) {
        ColorStateList colorStateList;
        this.read = i;
        ensureSubDecor ensuresubdecor = this.write;
        if (ensuresubdecor != null) {
            Context context = this.MediaBrowserCompatMediaItem.getContext();
            synchronized (ensuresubdecor) {
                colorStateList = ensuresubdecor.write.read(context, i);
            }
        } else {
            colorStateList = null;
        }
        serializer(colorStateList);
        write();
    }

    public final void serializer(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new setSupportCompoundDrawablesTintList();
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.IconCompatParcelizer;
            setsupportcompounddrawablestintlist.write = colorStateList;
            setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = true;
        } else {
            this.IconCompatParcelizer = null;
        }
        write();
    }

    public final void write() {
        View view = this.MediaBrowserCompatMediaItem;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.IconCompatParcelizer != null) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = new setSupportCompoundDrawablesTintList();
                }
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.RemoteActionCompatParcelizer;
                setsupportcompounddrawablestintlist.write();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = true;
                    setsupportcompounddrawablestintlist.write = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    setsupportcompounddrawablestintlist.serializer = true;
                    setsupportcompounddrawablestintlist.IconCompatParcelizer = backgroundTintMode;
                }
                if (setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer || setsupportcompounddrawablestintlist.serializer) {
                    ensureSubDecor.IconCompatParcelizer(background, setsupportcompounddrawablestintlist, view.getDrawableState());
                    return;
                }
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = this.serializer;
            if (setsupportcompounddrawablestintlist2 != null) {
                ensureSubDecor.IconCompatParcelizer(background, setsupportcompounddrawablestintlist2, view.getDrawableState());
                return;
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist3 = this.IconCompatParcelizer;
            if (setsupportcompounddrawablestintlist3 != null) {
                ensureSubDecor.IconCompatParcelizer(background, setsupportcompounddrawablestintlist3, view.getDrawableState());
            }
        }
    }

    public supportRequestWindowFeature(View view) {
        this.MediaBrowserCompatMediaItem = view;
    }

    public final ColorStateList read() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.serializer;
        if (setsupportcompounddrawablestintlist != null) {
            return (ColorStateList) setsupportcompounddrawablestintlist.write;
        }
        return null;
    }

    public final PorterDuff.Mode serializer() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.serializer;
        if (setsupportcompounddrawablestintlist != null) {
            return (PorterDuff.Mode) setsupportcompounddrawablestintlist.IconCompatParcelizer;
        }
        return null;
    }

    public final void read(ColorStateList colorStateList) {
        if (this.serializer == null) {
            this.serializer = new setSupportCompoundDrawablesTintList();
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.serializer;
        setsupportcompounddrawablestintlist.write = colorStateList;
        setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = true;
        write();
    }

    public final void write(PorterDuff.Mode mode) {
        if (this.serializer == null) {
            this.serializer = new setSupportCompoundDrawablesTintList();
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.serializer;
        setsupportcompounddrawablestintlist.IconCompatParcelizer = mode;
        setsupportcompounddrawablestintlist.serializer = true;
        write();
    }
}
