package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView$1;
import com.huawei.hms.location.LocationRequest;
import com.sentiance.core.model.events.I$b;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RectRulersCompanion {
    public static final ColorDrawable RemoteActionCompatParcelizer;
    public static final double write = Math.cos(Math.toRadians(45.0d));
    public boolean IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Drawable MediaDescriptionCompat;
    public ColorStateList MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public SubcomposeSlotReusePolicy MediaSessionCompatResultReceiverWrapper;
    public Drawable MediaSessionCompatToken;
    public LayerDrawable ParcelableVolumeInfo;
    public ValueAnimator PlaybackStateCompat;
    public final SubcomposeSlotReusePolicy PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final int ResultReceiver;
    public final TimeInterpolator r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final RectRulersImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public SubcomposeLayoutPausableCompositionException r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public ColorStateList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public RippleDrawable r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public ColorStateList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final SubcomposeSlotReusePolicy read;
    public final android.graphics.Rect r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new android.graphics.Rect();
    public boolean ComponentActivity = false;
    public float serializer = 0.0f;

    public final float IconCompatParcelizer() {
        timesUQTWf7w timesuqtwf7w = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.MediaMetadataCompat;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.read;
        return Math.max(Math.max(IconCompatParcelizer(timesuqtwf7w, subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem()), IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction, subcomposeSlotReusePolicy.PlaybackStateCompat())), Math.max(IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer, subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat.read.write(subcomposeSlotReusePolicy.RatingCompat())), IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer, subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat.write.write(subcomposeSlotReusePolicy.RatingCompat()))));
    }

    public final void IconCompatParcelizer(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.ParcelableVolumeInfo != null) {
            RectRulersImpl rectRulersImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (rectRulersImpl.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((rectRulersImpl.getMaxCardElevation() * 1.5f) + (write() ? IconCompatParcelizer() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((rectRulersImpl.getMaxCardElevation() + (write() ? IconCompatParcelizer() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.MediaBrowserCompatMediaItem;
            int i6 = i5 & 8388613;
            boolean z = i6 == 8388613;
            int i7 = this.MediaSessionCompatQueueItem;
            int i8 = z ? ((i - i7) - this.RatingCompat) - iCeil2 : i7;
            int i9 = i5 & 80;
            int i10 = i9 == 80 ? i7 : ((i2 - i7) - this.RatingCompat) - iCeil;
            int i11 = i6 == 8388613 ? i7 : ((i - i7) - this.RatingCompat) - iCeil2;
            if (i9 == 80) {
                i7 = ((i2 - i7) - this.RatingCompat) - iCeil;
            }
            int i12 = i7;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (rectRulersImpl.getLayoutDirection() == 1) {
                i4 = i11;
                i3 = i8;
            } else {
                i3 = i11;
                i4 = i8;
            }
            this.ParcelableVolumeInfo.setLayerInset(2, i4, i12, i3, i10);
        }
    }

    public final void RemoteActionCompatParcelizer(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = subcomposeLayoutPausableCompositionException;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.read;
        subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        subcomposeSlotReusePolicy.onMenuItemSelected = !subcomposeSlotReusePolicy.MediaSessionCompatToken();
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = this.PlaybackStateCompatCustomAction;
        if (subcomposeSlotReusePolicy2 != null) {
            subcomposeSlotReusePolicy2.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3 = this.MediaSessionCompatResultReceiverWrapper;
        if (subcomposeSlotReusePolicy3 != null) {
            subcomposeSlotReusePolicy3.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
    }

    public final void read(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.MediaDescriptionCompat = drawableMutate;
            drawableMutate.setTintList(this.MediaMetadataCompat);
            IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatToken, false);
        } else {
            this.MediaDescriptionCompat = RemoteActionCompatParcelizer;
        }
        LayerDrawable layerDrawable = this.ParcelableVolumeInfo;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.logistics.rider.glovo.R.id.mtrl_card_checked_layer_id, this.MediaDescriptionCompat);
        }
    }

    public final forceRemeasure serializer(Drawable drawable) {
        int iCeil;
        int i;
        RectRulersImpl rectRulersImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (rectRulersImpl.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((rectRulersImpl.getMaxCardElevation() * 1.5f) + (write() ? IconCompatParcelizer() : 0.0f));
            iCeil = (int) Math.ceil(rectRulersImpl.getMaxCardElevation() + (write() ? IconCompatParcelizer() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new forceRemeasure(drawable, iCeil, i, iCeil, i);
    }

    public final void serializer() {
        boolean z = this.ComponentActivity;
        RectRulersImpl rectRulersImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (!z) {
            rectRulersImpl.setBackgroundInternal(serializer(this.read));
        }
        rectRulersImpl.setForeground(serializer(this.MediaSessionCompatToken));
    }

    public final void updateContentPadding() {
        RectRulersImpl rectRulersImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        float cardViewRadius = 0.0f;
        float fIconCompatParcelizer = ((!rectRulersImpl.getPreventCornerOverlap() || this.read.MediaSessionCompatToken()) && !write()) ? 0.0f : IconCompatParcelizer();
        if (rectRulersImpl.getPreventCornerOverlap() && rectRulersImpl.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - write) * ((double) rectRulersImpl.getCardViewRadius()));
        }
        int i = (int) (fIconCompatParcelizer - cardViewRadius);
        android.graphics.Rect rect = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        rectRulersImpl.RemoteActionCompatParcelizer.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView$1 cardView$1 = rectRulersImpl.read;
        drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq = (drawWithRotationAndOffsetubNVwUQ) cardView$1.IconCompatParcelizer;
        if (!drawwithrotationandoffsetubnvwuq.getUseCompatPadding()) {
            cardView$1.serializer(0, 0, 0, 0);
            return;
        }
        createOutlinePq9zytI createoutlinepq9zyti = (createOutlinePq9zytI) cardView$1.RemoteActionCompatParcelizer;
        float f = createoutlinepq9zyti.RatingCompat;
        float f2 = createoutlinepq9zyti.MediaDescriptionCompat;
        int iCeil = (int) Math.ceil(HoverableNodeonPointerEvent1.write(f, f2, drawwithrotationandoffsetubnvwuq.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(HoverableNodeonPointerEvent1.read(f, f2, drawwithrotationandoffsetubnvwuq.getPreventCornerOverlap()));
        cardView$1.serializer(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final boolean write() {
        RectRulersImpl rectRulersImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return rectRulersImpl.getPreventCornerOverlap() && this.read.MediaSessionCompatToken() && rectRulersImpl.getUseCompatPadding();
    }

    static {
        RemoteActionCompatParcelizer = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public RectRulersCompanion(RectRulersImpl rectRulersImpl, AttributeSet attributeSet, int i) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rectRulersImpl;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(rectRulersImpl.getContext(), attributeSet, i, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_CardView);
        this.read = subcomposeSlotReusePolicy;
        subcomposeSlotReusePolicy.write(rectRulersImpl.getContext());
        subcomposeSlotReusePolicy.PlaybackStateCompatCustomAction();
        I$b i$bWrite = subcomposeSlotReusePolicy.getLifecycle.PlaybackStateCompat.write();
        TypedArray typedArrayObtainStyledAttributes = rectRulersImpl.getContext().obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.CardView, i, com.logistics.rider.glovo.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(dimension);
            i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(dimension);
            i$bWrite.RatingCompat = new SubcomposeLayoutKt(dimension);
            i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(dimension);
        }
        this.PlaybackStateCompatCustomAction = new SubcomposeSlotReusePolicy();
        RemoteActionCompatParcelizer(i$bWrite.IconCompatParcelizer());
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = SentryUUID.IconCompatParcelizer(rectRulersImpl.getContext(), com.logistics.rider.glovo.R.attr.motionEasingLinearInterpolator, handleMotionFrameOfReferencePlacement.write);
        this.ResultReceiver = SentryUUID.write(rectRulersImpl.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort2, LocationRequest.PRIORITY_INDOOR);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = SentryUUID.write(rectRulersImpl.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort1, LocationRequest.PRIORITY_INDOOR);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float IconCompatParcelizer(timesUQTWf7w timesuqtwf7w, float f) {
        if (timesuqtwf7w instanceof accessgetUnspecifiedSlotIdp) {
            return (float) ((1.0d - write) * ((double) f));
        }
        if (timesuqtwf7w instanceof timesmw2e94) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final LayerDrawable RemoteActionCompatParcelizer() {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            this.MediaSessionCompatResultReceiverWrapper = subcomposeSlotReusePolicy;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new RippleDrawable(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, null, subcomposeSlotReusePolicy);
        }
        if (this.ParcelableVolumeInfo == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.PlaybackStateCompatCustomAction, this.MediaDescriptionCompat});
            this.ParcelableVolumeInfo = layerDrawable;
            layerDrawable.setId(2, com.logistics.rider.glovo.R.id.mtrl_card_checked_layer_id);
        }
        return this.ParcelableVolumeInfo;
    }

    public final void IconCompatParcelizer(boolean z, boolean z2) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.serializer = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.serializer;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.PlaybackStateCompat;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.PlaybackStateCompat = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.serializer, f);
            this.PlaybackStateCompat = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new TileMode(4, this));
            this.PlaybackStateCompat.setInterpolator(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            this.PlaybackStateCompat.setDuration((long) ((z ? this.ResultReceiver : this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) * f2));
            this.PlaybackStateCompat.start();
        }
    }
}
