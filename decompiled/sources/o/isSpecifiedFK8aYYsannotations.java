package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import o.isSpecifiedFK8aYYsannotations;

/* JADX INFO: loaded from: classes4.dex */
public final class isSpecifiedFK8aYYsannotations {
    public boolean IconCompatParcelizer = false;
    public final float MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final ColorStateList MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final ColorStateList PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final float RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public android.graphics.Typeface serializer;
    public final boolean write;

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final boolean write(Context context) {
        android.graphics.Typeface typefaceRemoteActionCompatParcelizer;
        int i = this.read;
        if (i != 0) {
            ThreadLocal threadLocal = setLeft.read;
            if (context.isRestricted()) {
                typefaceRemoteActionCompatParcelizer = null;
            } else {
                typefaceRemoteActionCompatParcelizer = setLeft.RemoteActionCompatParcelizer(context, i, new TypedValue(), 0, null, false, true);
            }
        } else {
            typefaceRemoteActionCompatParcelizer = null;
        }
        return typefaceRemoteActionCompatParcelizer != null;
    }

    public final void RemoteActionCompatParcelizer() {
        String str;
        android.graphics.Typeface typeface = this.serializer;
        int i = this.PlaybackStateCompatCustomAction;
        if (typeface == null && (str = this.RemoteActionCompatParcelizer) != null) {
            this.serializer = android.graphics.Typeface.create(str, i);
        }
        if (this.serializer == null) {
            int i2 = this.MediaSessionCompatToken;
            if (i2 == 1) {
                this.serializer = android.graphics.Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.serializer = android.graphics.Typeface.SERIF;
            } else if (i2 != 3) {
                this.serializer = android.graphics.Typeface.DEFAULT;
            } else {
                this.serializer = android.graphics.Typeface.MONOSPACE;
            }
            this.serializer = android.graphics.Typeface.create(this.serializer, i);
        }
    }

    public final void RemoteActionCompatParcelizer(Context context, TextPaint textPaint, setPlacementApproachInProgress setplacementapproachinprogress) {
        IconCompatParcelizer(context, textPaint, setplacementapproachinprogress);
        ColorStateList colorStateList = this.PlaybackStateCompat;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.MediaMetadataCompat;
        textPaint.setShadowLayer(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public isSpecifiedFK8aYYsannotations(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, setMeasuredSizeozmzZPI.TextAppearance);
        this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.PlaybackStateCompat = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 3);
        ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 4);
        ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 5);
        this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.read = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.MediaMetadataCompat = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 6);
        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, setMeasuredSizeozmzZPI.MaterialTextAppearance);
        this.write = typedArrayObtainStyledAttributes2.hasValue(0);
        this.RatingCompat = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void IconCompatParcelizer(Context context, TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typeface2 = isUnspecifiedFK8aYYsannotations.read(context.getResources().getConfiguration(), typeface);
        if (typeface2 != null) {
            typeface = typeface2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.PlaybackStateCompatCustomAction;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.MediaSessionCompatResultReceiverWrapper);
        if (this.write) {
            textPaint.setLetterSpacing(this.RatingCompat);
        }
    }

    public final android.graphics.Typeface serializer(Context context) {
        if (this.IconCompatParcelizer) {
            return this.serializer;
        }
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface typefaceSerializer = setLeft.serializer(context, this.read);
                this.serializer = typefaceSerializer;
                if (typefaceSerializer != null) {
                    this.serializer = android.graphics.Typeface.create(typefaceSerializer, this.PlaybackStateCompatCustomAction);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = true;
        return this.serializer;
    }

    public final void IconCompatParcelizer(Context context, TextPaint textPaint, setPlacementApproachInProgress setplacementapproachinprogress) {
        if (write(context)) {
            IconCompatParcelizer(context, textPaint, serializer(context));
            return;
        }
        RemoteActionCompatParcelizer();
        IconCompatParcelizer(context, textPaint, this.serializer);
        write(context, new lerpbDIf60(this, context, textPaint, setplacementapproachinprogress));
    }

    public final void write(Context context, final setPlacementApproachInProgress setplacementapproachinprogress) {
        if (write(context)) {
            serializer(context);
        } else {
            RemoteActionCompatParcelizer();
        }
        int i = this.read;
        if (i == 0) {
            this.IconCompatParcelizer = true;
        }
        if (this.IconCompatParcelizer) {
            setplacementapproachinprogress.serializer(this.serializer, true);
            return;
        }
        try {
            ResourcesCompat$FontCallback resourcesCompat$FontCallback = new ResourcesCompat$FontCallback() { // from class: com.google.android.material.resources.TextAppearance$1
                @Override // androidx.core.content.res.ResourcesCompat$FontCallback
                public final void onFontRetrieved(Typeface typeface) {
                    isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = this.IconCompatParcelizer;
                    Typeface typefaceCreate = Typeface.create(typeface, isspecifiedfk8ayysannotations.PlaybackStateCompatCustomAction);
                    isspecifiedfk8ayysannotations.serializer = typefaceCreate;
                    isspecifiedfk8ayysannotations.IconCompatParcelizer = true;
                    setplacementapproachinprogress.serializer(typefaceCreate, false);
                }

                @Override // androidx.core.content.res.ResourcesCompat$FontCallback
                public final void onFontRetrievalFailed(int i2) {
                    this.IconCompatParcelizer.IconCompatParcelizer = true;
                    setplacementapproachinprogress.RemoteActionCompatParcelizer(i2);
                }
            };
            ThreadLocal threadLocal = setLeft.read;
            if (context.isRestricted()) {
                resourcesCompat$FontCallback.callbackFailAsync(-4, null);
            } else {
                setLeft.RemoteActionCompatParcelizer(context, i, new TypedValue(), 0, resourcesCompat$FontCallback, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.IconCompatParcelizer = true;
            setplacementapproachinprogress.RemoteActionCompatParcelizer(1);
        } catch (Exception unused2) {
            this.IconCompatParcelizer = true;
            setplacementapproachinprogress.RemoteActionCompatParcelizer(-3);
        }
    }
}
