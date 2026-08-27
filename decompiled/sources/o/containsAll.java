package o;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.EndCompoundLayout;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes2.dex */
public final class containsAll extends updateModifier {
    public EditText IconCompatParcelizer;
    public final ThrottledButton$$ExternalSyntheticLambda0 MediaBrowserCompatMediaItem;
    public AnimatorSet MediaMetadataCompat;
    public ValueAnimator MediaSessionCompatQueueItem;
    public final DateSelector$$ExternalSyntheticLambda0 RatingCompat;
    public final TimeInterpolator RemoteActionCompatParcelizer;
    public final int read;
    public final TimeInterpolator serializer;
    public final int write;

    @Override // o.updateModifier
    public final View.OnFocusChangeListener IconCompatParcelizer() {
        return this.RatingCompat;
    }

    @Override // o.updateModifier
    public final int RemoteActionCompatParcelizer() {
        return com.logistics.rider.glovo.R.drawable.mtrl_ic_cancel;
    }

    @Override // o.updateModifier
    public final View.OnFocusChangeListener read() {
        return this.RatingCompat;
    }

    @Override // o.updateModifier
    public final View.OnClickListener serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.updateModifier
    public final void setUp() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.serializer);
        valueAnimatorOfFloat.setDuration(this.read);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.getSet
            public final /* synthetic */ containsAll IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                containsAll containsall = this.IconCompatParcelizer;
                if (i2 == 0) {
                    containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CheckableImageButton checkableImageButton = containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    checkableImageButton.setScaleX(fFloatValue);
                    checkableImageButton.setScaleY(fFloatValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.RemoteActionCompatParcelizer;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        long j = this.write;
        valueAnimatorOfFloat2.setDuration(j);
        final int i2 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.getSet
            public final /* synthetic */ containsAll IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                containsAll containsall = this.IconCompatParcelizer;
                if (i3 == 0) {
                    containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CheckableImageButton checkableImageButton = containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    checkableImageButton.setScaleX(fFloatValue);
                    checkableImageButton.setScaleY(fFloatValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.MediaMetadataCompat = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.MediaMetadataCompat.addListener(new addAll(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(j);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.getSet
            public final /* synthetic */ containsAll IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                containsAll containsall = this.IconCompatParcelizer;
                if (i3 == 0) {
                    containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CheckableImageButton checkableImageButton = containsall.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    checkableImageButton.setScaleX(fFloatValue);
                    checkableImageButton.setScaleY(fFloatValue);
                }
            }
        });
        this.MediaSessionCompatQueueItem = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new addAll(this, i));
    }

    @Override // o.updateModifier
    public final int write() {
        return com.logistics.rider.glovo.R.string.clear_text_end_icon_content_description;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        boolean z2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer() == z;
        if (z && !this.MediaMetadataCompat.isRunning()) {
            this.MediaSessionCompatQueueItem.cancel();
            this.MediaMetadataCompat.start();
            if (z2) {
                this.MediaMetadataCompat.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.MediaMetadataCompat.cancel();
        this.MediaSessionCompatQueueItem.start();
        if (z2) {
            this.MediaSessionCompatQueueItem.end();
        }
    }

    @Override // o.updateModifier
    public final void afterEditTextChanged() {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            return;
        }
        RemoteActionCompatParcelizer(MediaSessionCompatQueueItem());
    }

    @Override // o.updateModifier
    public final void onSuffixVisibilityChanged(boolean z) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            return;
        }
        RemoteActionCompatParcelizer(z);
    }

    @Override // o.updateModifier
    public final void write(EditText editText) {
        this.IconCompatParcelizer = editText;
        this.ResultReceiver.setEndIconVisible(MediaSessionCompatQueueItem());
    }

    public final boolean MediaSessionCompatQueueItem() {
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            return (editText.hasFocus() || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.hasFocus()) && this.IconCompatParcelizer.getText().length() > 0;
        }
        return false;
    }

    public containsAll(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.MediaBrowserCompatMediaItem = new ThrottledButton$$ExternalSyntheticLambda0(6, this);
        this.RatingCompat = new DateSelector$$ExternalSyntheticLambda0(1, this);
        this.write = SentryUUID.write(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort3, 100);
        this.read = SentryUUID.write(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionDurationShort3, 150);
        this.RemoteActionCompatParcelizer = SentryUUID.IconCompatParcelizer(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionEasingLinearInterpolator, handleMotionFrameOfReferencePlacement.write);
        this.serializer = SentryUUID.IconCompatParcelizer(endCompoundLayout.getContext(), com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.IconCompatParcelizer);
    }

    @Override // o.updateModifier
    public final void RatingCompat() {
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            editText.post(new RxWorker$1$$ExternalSyntheticLambda0(15, this));
        }
    }
}
