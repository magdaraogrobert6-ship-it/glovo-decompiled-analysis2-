package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.transition.Transition$1;
import com.sentiance.core.model.events.I$b;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutPausableCompositionException {
    public timesUQTWf7w IconCompatParcelizer;
    public Transition$1 MediaBrowserCompatMediaItem;
    public SimplePlacementScope MediaDescriptionCompat;
    public timesUQTWf7w MediaMetadataCompat;
    public Transition$1 MediaSessionCompatQueueItem;
    public SimplePlacementScope PlaybackStateCompat;
    public timesUQTWf7w PlaybackStateCompatCustomAction;
    public Transition$1 RatingCompat;
    public timesUQTWf7w RemoteActionCompatParcelizer;
    public SimplePlacementScope read;
    public Transition$1 serializer;
    public SimplePlacementScope write;

    public static I$b write(Context context, int i, int i2, SubcomposeLayoutKt subcomposeLayoutKt) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(setMeasuredSizeozmzZPI.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            SimplePlacementScope simplePlacementScopeWrite = write(typedArrayObtainStyledAttributes, 5, subcomposeLayoutKt);
            SimplePlacementScope simplePlacementScopeWrite2 = write(typedArrayObtainStyledAttributes, 8, simplePlacementScopeWrite);
            SimplePlacementScope simplePlacementScopeWrite3 = write(typedArrayObtainStyledAttributes, 9, simplePlacementScopeWrite);
            SimplePlacementScope simplePlacementScopeWrite4 = write(typedArrayObtainStyledAttributes, 7, simplePlacementScopeWrite);
            SimplePlacementScope simplePlacementScopeWrite5 = write(typedArrayObtainStyledAttributes, 6, simplePlacementScopeWrite);
            I$b i$b = new I$b();
            i$b.IconCompatParcelizer = SubcomposeLayoutKtSubcomposeLayout2.read(i4);
            i$b.RemoteActionCompatParcelizer = simplePlacementScopeWrite2;
            i$b.read = SubcomposeLayoutKtSubcomposeLayout2.read(i5);
            i$b.MediaDescriptionCompat = simplePlacementScopeWrite3;
            i$b.serializer = SubcomposeLayoutKtSubcomposeLayout2.read(i6);
            i$b.RatingCompat = simplePlacementScopeWrite4;
            i$b.write = SubcomposeLayoutKtSubcomposeLayout2.read(i7);
            i$b.MediaMetadataCompat = simplePlacementScopeWrite5;
            return i$b;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean read(RectF rectF) {
        boolean z = this.MediaSessionCompatQueueItem.getClass().equals(Transition$1.class) && this.RatingCompat.getClass().equals(Transition$1.class) && this.MediaBrowserCompatMediaItem.getClass().equals(Transition$1.class) && this.serializer.getClass().equals(Transition$1.class);
        float fWrite = this.MediaDescriptionCompat.write(rectF);
        return z && ((this.PlaybackStateCompat.write(rectF) > fWrite ? 1 : (this.PlaybackStateCompat.write(rectF) == fWrite ? 0 : -1)) == 0 && (this.write.write(rectF) > fWrite ? 1 : (this.write.write(rectF) == fWrite ? 0 : -1)) == 0 && (this.read.write(rectF) > fWrite ? 1 : (this.read.write(rectF) == fWrite ? 0 : -1)) == 0) && ((this.PlaybackStateCompatCustomAction instanceof accessgetUnspecifiedSlotIdp) && (this.MediaMetadataCompat instanceof accessgetUnspecifiedSlotIdp) && (this.IconCompatParcelizer instanceof accessgetUnspecifiedSlotIdp) && (this.RemoteActionCompatParcelizer instanceof accessgetUnspecifiedSlotIdp));
    }

    public final I$b write() {
        I$b i$b = new I$b(0);
        i$b.IconCompatParcelizer = this.MediaMetadataCompat;
        i$b.read = this.PlaybackStateCompatCustomAction;
        i$b.serializer = this.IconCompatParcelizer;
        i$b.write = this.RemoteActionCompatParcelizer;
        i$b.RemoteActionCompatParcelizer = this.MediaDescriptionCompat;
        i$b.MediaDescriptionCompat = this.PlaybackStateCompat;
        i$b.RatingCompat = this.read;
        i$b.MediaMetadataCompat = this.write;
        i$b.MediaBrowserCompatMediaItem = this.MediaBrowserCompatMediaItem;
        i$b.MediaSessionCompatResultReceiverWrapper = this.RatingCompat;
        i$b.PlaybackStateCompat = this.serializer;
        i$b.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
        return i$b;
    }

    public SubcomposeLayoutPausableCompositionException() {
        this.MediaMetadataCompat = new accessgetUnspecifiedSlotIdp();
        this.PlaybackStateCompatCustomAction = new accessgetUnspecifiedSlotIdp();
        this.IconCompatParcelizer = new accessgetUnspecifiedSlotIdp();
        this.RemoteActionCompatParcelizer = new accessgetUnspecifiedSlotIdp();
        this.MediaDescriptionCompat = new SubcomposeLayoutKt(0.0f);
        this.PlaybackStateCompat = new SubcomposeLayoutKt(0.0f);
        this.read = new SubcomposeLayoutKt(0.0f);
        this.write = new SubcomposeLayoutKt(0.0f);
        int i = 1;
        this.MediaBrowserCompatMediaItem = new Transition$1(i);
        this.RatingCompat = new Transition$1(i);
        this.serializer = new Transition$1(i);
        this.MediaSessionCompatQueueItem = new Transition$1(i);
    }

    public static SimplePlacementScope write(TypedArray typedArray, int i, SimplePlacementScope simplePlacementScope) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new SubcomposeLayoutKt(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new SubcomposeLayoutKtReusedSlotId1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return simplePlacementScope;
    }

    public static I$b serializer(Context context, AttributeSet attributeSet, int i, int i2) {
        SubcomposeLayoutKt subcomposeLayoutKt = new SubcomposeLayoutKt(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return write(context, resourceId, resourceId2, subcomposeLayoutKt);
    }

    public SubcomposeLayoutPausableCompositionException(int i) {
    }
}
