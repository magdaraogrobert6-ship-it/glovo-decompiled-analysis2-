package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextHelper$1;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.recyclerview.widget.ItemTouchHelper;
import io.grpc.LoadBalancer$Helper;
import o.setPrimaryBackground;
import o.setSplitBackground;

/* JADX INFO: loaded from: classes.dex */
public final class setSplitBackground {
    public setSupportCompoundDrawablesTintList IconCompatParcelizer;
    public setSupportCompoundDrawablesTintList MediaBrowserCompatMediaItem;
    public android.graphics.Typeface MediaDescriptionCompat;
    public setSupportCompoundDrawablesTintList MediaMetadataCompat;
    public setSupportCompoundDrawablesTintList MediaSessionCompatQueueItem;
    public final TextView MediaSessionCompatResultReceiverWrapper;
    public setSupportCompoundDrawablesTintList RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final getContentHeight read;
    public setSupportCompoundDrawablesTintList serializer;
    public setSupportCompoundDrawablesTintList write;
    public int PlaybackStateCompatCustomAction = 0;
    public int ParcelableVolumeInfo = -1;

    public static setSupportCompoundDrawablesTintList serializer(Context context, ensureSubDecor ensuresubdecor, int i) {
        ColorStateList colorStateList;
        synchronized (ensuresubdecor) {
            colorStateList = ensuresubdecor.write.read(context, i);
        }
        if (colorStateList == null) {
            return null;
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = new setSupportCompoundDrawablesTintList();
        setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = true;
        setsupportcompounddrawablestintlist.write = colorStateList;
        return setsupportcompounddrawablestintlist;
    }

    public final void serializer(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, onUserLeaveHint.TextAppearance);
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.MediaSessionCompatResultReceiverWrapper;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        serializer(context, emojiProcessor);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            setStackedBackground.RemoteActionCompatParcelizer(textView, string);
        }
        emojiProcessor.IconCompatParcelizer();
        android.graphics.Typeface typeface = this.MediaDescriptionCompat;
        if (typeface != null) {
            textView.setTypeface(typeface, this.PlaybackStateCompatCustomAction);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.appcompat.widget.AppCompatTextHelper$1] */
    public final void serializer(Context context, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        String string;
        int i = this.PlaybackStateCompatCustomAction;
        TypedArray typedArray = (TypedArray) emojiProcessor.read;
        this.PlaybackStateCompatCustomAction = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.ParcelableVolumeInfo = i2;
        if (i2 != -1) {
            this.PlaybackStateCompatCustomAction &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.RemoteActionCompatParcelizer = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.MediaDescriptionCompat = android.graphics.Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.MediaDescriptionCompat = android.graphics.Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.MediaDescriptionCompat = android.graphics.Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.MediaDescriptionCompat = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        final int i5 = this.ParcelableVolumeInfo;
        final int i6 = this.PlaybackStateCompatCustomAction;
        if (!context.isRestricted()) {
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.MediaSessionCompatResultReceiverWrapper);
            try {
                android.graphics.Typeface typeface = emojiProcessor.read(i4, this.PlaybackStateCompatCustomAction, (AppCompatTextHelper$1) new ResourcesCompat$FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper$1
                    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
                    public final void onFontRetrievalFailed(int i7) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
                    public final void onFontRetrieved(Typeface typeface2) {
                        int i7 = i5;
                        if (i7 != -1) {
                            typeface2 = setPrimaryBackground.IconCompatParcelizer(typeface2, i7, (i6 & 2) != 0);
                        }
                        setSplitBackground setsplitbackground = this.IconCompatParcelizer;
                        if (setsplitbackground.RemoteActionCompatParcelizer) {
                            setsplitbackground.MediaDescriptionCompat = typeface2;
                            TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                                int i8 = setsplitbackground.PlaybackStateCompatCustomAction;
                                if (zIsAttachedToWindow) {
                                    textView.post(new ItemTouchHelper.AnonymousClass4(textView, typeface2, i8));
                                } else {
                                    textView.setTypeface(typeface2, i8);
                                }
                            }
                        }
                    }
                });
                if (typeface != null) {
                    if (this.ParcelableVolumeInfo != -1) {
                        this.MediaDescriptionCompat = setPrimaryBackground.IconCompatParcelizer(android.graphics.Typeface.create(typeface, 0), this.ParcelableVolumeInfo, (this.PlaybackStateCompatCustomAction & 2) != 0);
                    } else {
                        this.MediaDescriptionCompat = typeface;
                    }
                }
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.MediaDescriptionCompat != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.ParcelableVolumeInfo != -1) {
            this.MediaDescriptionCompat = setPrimaryBackground.IconCompatParcelizer(android.graphics.Typeface.create(string, 0), this.ParcelableVolumeInfo, (this.PlaybackStateCompatCustomAction & 2) != 0);
        } else {
            this.MediaDescriptionCompat = android.graphics.Typeface.create(string, this.PlaybackStateCompatCustomAction);
        }
    }

    public setSplitBackground(TextView textView) {
        this.MediaSessionCompatResultReceiverWrapper = textView;
        this.read = new getContentHeight(textView);
    }

    public final ColorStateList IconCompatParcelizer() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.RatingCompat;
        if (setsupportcompounddrawablestintlist != null) {
            return (ColorStateList) setsupportcompounddrawablestintlist.write;
        }
        return null;
    }

    public final PorterDuff.Mode RemoteActionCompatParcelizer() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.RatingCompat;
        if (setsupportcompounddrawablestintlist != null) {
            return (PorterDuff.Mode) setsupportcompounddrawablestintlist.IconCompatParcelizer;
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(Drawable drawable, setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        if (drawable == null || setsupportcompounddrawablestintlist == null) {
            return;
        }
        ensureSubDecor.IconCompatParcelizer(drawable, setsupportcompounddrawablestintlist, this.MediaSessionCompatResultReceiverWrapper.getDrawableState());
    }

    public final void read() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.IconCompatParcelizer;
        TextView textView = this.MediaSessionCompatResultReceiverWrapper;
        if (setsupportcompounddrawablestintlist != null || this.MediaMetadataCompat != null || this.MediaBrowserCompatMediaItem != null || this.serializer != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            RemoteActionCompatParcelizer(compoundDrawables[0], this.IconCompatParcelizer);
            RemoteActionCompatParcelizer(compoundDrawables[1], this.MediaMetadataCompat);
            RemoteActionCompatParcelizer(compoundDrawables[2], this.MediaBrowserCompatMediaItem);
            RemoteActionCompatParcelizer(compoundDrawables[3], this.serializer);
        }
        if (this.MediaSessionCompatQueueItem == null && this.write == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        RemoteActionCompatParcelizer(compoundDrawablesRelative[0], this.MediaSessionCompatQueueItem);
        RemoteActionCompatParcelizer(compoundDrawablesRelative[2], this.write);
    }

    public final void IconCompatParcelizer(PorterDuff.Mode mode) {
        if (this.RatingCompat == null) {
            this.RatingCompat = new setSupportCompoundDrawablesTintList();
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.RatingCompat;
        setsupportcompounddrawablestintlist.IconCompatParcelizer = mode;
        setsupportcompounddrawablestintlist.serializer = mode != null;
        this.IconCompatParcelizer = setsupportcompounddrawablestintlist;
        this.MediaMetadataCompat = setsupportcompounddrawablestintlist;
        this.MediaBrowserCompatMediaItem = setsupportcompounddrawablestintlist;
        this.serializer = setsupportcompounddrawablestintlist;
        this.MediaSessionCompatQueueItem = setsupportcompounddrawablestintlist;
        this.write = setsupportcompounddrawablestintlist;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x0438  */
    /* JADX WARN: Code duplicated, block: B:251:0x0440  */
    /* JADX WARN: Code duplicated, block: B:253:0x0451  */
    /* JADX WARN: Code duplicated, block: B:254:0x0454  */
    /* JADX WARN: Code duplicated, block: B:257:0x045c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0472  */
    /* JADX WARN: Code duplicated, block: B:262:0x0475  */
    /* JADX WARN: Code duplicated, block: B:264:0x047a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0480  */
    /* JADX WARN: Code duplicated, block: B:268:0x0484  */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        int i3;
        float dimensionPixelSize;
        int i4;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        TextView textView = this.MediaSessionCompatResultReceiverWrapper;
        Context context = textView.getContext();
        ensureSubDecor ensuresubdecorWrite = ensureSubDecor.write();
        int[] iArr = onUserLeaveHint.AppCompatTextHelper;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, i);
        FocusPropertiesNode.IconCompatParcelizer(textView, textView.getContext(), iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, i);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.IconCompatParcelizer = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.MediaMetadataCompat = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.MediaBrowserCompatMediaItem = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.serializer = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.MediaSessionCompatQueueItem = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.write = serializer(context, ensuresubdecorWrite, typedArray.getResourceId(6, 0));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = onUserLeaveHint.TextAppearance;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            serializer(context, emojiProcessor);
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i7 = 13;
            } else {
                i7 = 13;
                string2 = null;
            }
            string = typedArrayObtainStyledAttributes.hasValue(i7) ? typedArrayObtainStyledAttributes.getString(i7) : null;
            emojiProcessor.IconCompatParcelizer();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        androidx.emoji2.text.EmojiProcessor emojiProcessor2 = new androidx.emoji2.text.EmojiProcessor(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z4 = z;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        serializer(context, emojiProcessor2);
        emojiProcessor2.IconCompatParcelizer();
        if (!z3 && z2) {
            textView.setAllCaps(z4);
        }
        android.graphics.Typeface typeface = this.MediaDescriptionCompat;
        if (typeface != null) {
            if (this.ParcelableVolumeInfo == -1) {
                textView.setTypeface(typeface, this.PlaybackStateCompatCustomAction);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            setStackedBackground.RemoteActionCompatParcelizer(textView, string);
        }
        if (string2 != null) {
            getTabContainer.RemoteActionCompatParcelizer(textView, getTabContainer.IconCompatParcelizer(string2));
        }
        getContentHeight getcontentheight = this.read;
        Context context2 = getcontentheight.MediaBrowserCompatMediaItem;
        int[] iArr3 = onUserLeaveHint.AppCompatTextView;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = getcontentheight.RatingCompat;
        FocusPropertiesNode.IconCompatParcelizer(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            getcontentheight.IconCompatParcelizer = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                int[] iArr5 = getContentHeight.read(iArr4);
                getcontentheight.read = iArr5;
                int length2 = iArr5.length;
                boolean z5 = length2 > 0;
                getcontentheight.MediaMetadataCompat = z5;
                if (z5) {
                    getcontentheight.IconCompatParcelizer = 1;
                    getcontentheight.write = iArr5[0];
                    getcontentheight.RemoteActionCompatParcelizer = iArr5[length2 - 1];
                    getcontentheight.serializer = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (getcontentheight.read()) {
            if (getcontentheight.IconCompatParcelizer == 1) {
                if (!getcontentheight.MediaMetadataCompat) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        i6 = 2;
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i6 = 2;
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    if (dimension2 <= 0.0f) {
                        throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                    }
                    if (dimension3 <= dimension2) {
                        getCanFocus.write("Maximum auto-size text size (", dimension3, "px) is less or equal to minimum auto-size text size (", dimension2, "px)");
                        return;
                    }
                    if (dimension > 0.0f) {
                        getcontentheight.IconCompatParcelizer = 1;
                        getcontentheight.write = dimension2;
                        getcontentheight.RemoteActionCompatParcelizer = dimension3;
                        getcontentheight.serializer = dimension;
                        getcontentheight.MediaMetadataCompat = false;
                    } else {
                        throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                    }
                }
                if (getcontentheight.read() && getcontentheight.IconCompatParcelizer == 1 && (!getcontentheight.MediaMetadataCompat || getcontentheight.read.length == 0)) {
                    int iFloor = ((int) Math.floor((getcontentheight.RemoteActionCompatParcelizer - getcontentheight.write) / getcontentheight.serializer)) + 1;
                    int[] iArr6 = new int[iFloor];
                    for (int i9 = 0; i9 < iFloor; i9++) {
                        iArr6[i9] = Math.round((i9 * getcontentheight.serializer) + getcontentheight.write);
                    }
                    getcontentheight.read = getContentHeight.read(iArr6);
                }
            }
        } else {
            getcontentheight.IconCompatParcelizer = 0;
        }
        if (getcontentheight.IconCompatParcelizer != 0) {
            int[] iArr7 = getcontentheight.read;
            if (iArr7.length > 0) {
                if (setStackedBackground.write(textView) != -1.0f) {
                    setStackedBackground.read(textView, Math.round(getcontentheight.write), Math.round(getcontentheight.RemoteActionCompatParcelizer), Math.round(getcontentheight.serializer), 0);
                } else {
                    setStackedBackground.write(textView, iArr7, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableIconCompatParcelizer = resourceId4 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableIconCompatParcelizer2 = resourceId5 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableIconCompatParcelizer3 = resourceId6 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableIconCompatParcelizer4 = resourceId7 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableIconCompatParcelizer5 = resourceId8 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableIconCompatParcelizer6 = resourceId9 != -1 ? ensuresubdecorWrite.IconCompatParcelizer(context, resourceId9) : null;
        if (drawableIconCompatParcelizer5 != null || drawableIconCompatParcelizer6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableIconCompatParcelizer5 == null) {
                drawableIconCompatParcelizer5 = compoundDrawablesRelative[0];
            }
            if (drawableIconCompatParcelizer2 == null) {
                drawableIconCompatParcelizer2 = compoundDrawablesRelative[1];
            }
            if (drawableIconCompatParcelizer6 == null) {
                drawableIconCompatParcelizer6 = compoundDrawablesRelative[2];
            }
            if (drawableIconCompatParcelizer4 == null) {
                drawableIconCompatParcelizer4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableIconCompatParcelizer5, drawableIconCompatParcelizer2, drawableIconCompatParcelizer6, drawableIconCompatParcelizer4);
        } else if (drawableIconCompatParcelizer != null || drawableIconCompatParcelizer2 != null || drawableIconCompatParcelizer3 != null || drawableIconCompatParcelizer4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableIconCompatParcelizer == null) {
                    drawableIconCompatParcelizer = compoundDrawables[0];
                }
                if (drawableIconCompatParcelizer2 == null) {
                    drawableIconCompatParcelizer2 = compoundDrawables[1];
                }
                if (drawableIconCompatParcelizer3 == null) {
                    drawableIconCompatParcelizer3 = compoundDrawables[2];
                }
                if (drawableIconCompatParcelizer4 == null) {
                    drawableIconCompatParcelizer4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableIconCompatParcelizer, drawableIconCompatParcelizer2, drawableIconCompatParcelizer3, drawableIconCompatParcelizer4);
            } else {
                if (drawableIconCompatParcelizer2 == null) {
                    drawableIconCompatParcelizer2 = compoundDrawablesRelative2[1];
                }
                if (drawableIconCompatParcelizer4 == null) {
                    drawableIconCompatParcelizer4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableIconCompatParcelizer2, compoundDrawablesRelative2[2], drawableIconCompatParcelizer4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = FocusListener.write(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            textView.setCompoundDrawableTintMode(getNestedScrollAxes.IconCompatParcelizer(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i2);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i2);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i10 = typedValuePeekValue.data;
                int i11 = i10 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i10);
                i4 = i11;
                i3 = -1;
            } else {
                i3 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i3) {
                coil3.util.UtilsKt.read(dimensionPixelSize2);
                isInteropViewHost.IconCompatParcelizer(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i3) {
                coil3.util.UtilsKt.read(dimensionPixelSize3);
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i5 = fontMetricsInt.bottom;
                } else {
                    i5 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize3 > Math.abs(i5)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i5);
                }
            }
            if (dimensionPixelSize != -1.0f) {
                if (i4 == -1) {
                    LoadBalancer$Helper.IconCompatParcelizer(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    invalidateFocusui.IconCompatParcelizer(textView, i4, dimensionPixelSize);
                } else {
                    LoadBalancer$Helper.IconCompatParcelizer(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i3 = -1;
        dimensionPixelSize = -1.0f;
        i4 = i3;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
            coil3.util.UtilsKt.read(dimensionPixelSize2);
            isInteropViewHost.IconCompatParcelizer(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            coil3.util.UtilsKt.read(dimensionPixelSize3);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i5 = fontMetricsInt.bottom;
            } else {
                i5 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize3 > Math.abs(i5)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i5);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == -1) {
                LoadBalancer$Helper.IconCompatParcelizer(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                invalidateFocusui.IconCompatParcelizer(textView, i4, dimensionPixelSize);
            } else {
                LoadBalancer$Helper.IconCompatParcelizer(textView, Math.round(TypedValue.applyDimension(i4, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void write(ColorStateList colorStateList) {
        if (this.RatingCompat == null) {
            this.RatingCompat = new setSupportCompoundDrawablesTintList();
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.RatingCompat;
        setsupportcompounddrawablestintlist.write = colorStateList;
        setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = colorStateList != null;
        this.IconCompatParcelizer = setsupportcompounddrawablestintlist;
        this.MediaMetadataCompat = setsupportcompounddrawablestintlist;
        this.MediaBrowserCompatMediaItem = setsupportcompounddrawablestintlist;
        this.serializer = setsupportcompounddrawablestintlist;
        this.MediaSessionCompatQueueItem = setsupportcompounddrawablestintlist;
        this.write = setsupportcompounddrawablestintlist;
    }
}
