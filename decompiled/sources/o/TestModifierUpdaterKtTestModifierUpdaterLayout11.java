package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdaterKtTestModifierUpdaterLayout11 {
    public ColorStateList ComponentActivity;
    public final TimeInterpolator IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final TimeInterpolator MediaDescriptionCompat;
    public final TimeInterpolator MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final Context MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public final float ParcelableVolumeInfo;
    public CharSequence PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public CharSequence ResultReceiver;
    public CharSequence r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public androidx.appcompat.widget.AppCompatTextView r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ColorStateList r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public LinearLayout r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public androidx.appcompat.widget.AppCompatTextView r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public android.graphics.Typeface r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final TextInputLayout r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public AnimatorSet read;
    public final int serializer;
    public FrameLayout write;

    public final void write() {
        this.PlaybackStateCompat = null;
        serializer();
        if (this.RemoteActionCompatParcelizer == 1) {
            if (!this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || TextUtils.isEmpty(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys)) {
                this.MediaBrowserCompatMediaItem = 0;
            } else {
                this.MediaBrowserCompatMediaItem = 2;
            }
        }
        read(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, read(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, ""));
    }

    public final boolean read(androidx.appcompat.widget.AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        TextInputLayout textInputLayout = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.MediaBrowserCompatMediaItem == this.RemoteActionCompatParcelizer && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public TestModifierUpdaterKtTestModifierUpdaterLayout11(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.MediaSessionCompatResultReceiverWrapper = context;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = textInputLayout;
        this.ParcelableVolumeInfo = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.design_textinput_caption_translate_y);
        this.MediaSessionCompatQueueItem = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationShort4, 217);
        this.serializer = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationMedium4, 167);
        this.RatingCompat = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationShort4, 167);
        this.MediaMetadataCompat = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedDecelerateInterpolator, handleMotionFrameOfReferencePlacement.IconCompatParcelizer);
        LinearInterpolator linearInterpolator = handleMotionFrameOfReferencePlacement.write;
        this.IconCompatParcelizer = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.MediaDescriptionCompat = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
            TextInputLayout textInputLayout = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.MediaSessionCompatResultReceiverWrapper;
                boolean zWrite = ScaleFactorKt.write(context);
                LinearLayout linearLayout = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                int paddingStart = editText.getPaddingStart();
                if (zWrite) {
                    paddingStart = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_helper_text_default_padding_top);
                if (zWrite) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zWrite) {
                    paddingEnd = context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void serializer() {
        AnimatorSet animatorSet = this.read;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void IconCompatParcelizer(androidx.appcompat.widget.AppCompatTextView appCompatTextView, int i) {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null && this.write == null) {
            Context context = this.MediaSessionCompatResultReceiverWrapper;
            LinearLayout linearLayout = new LinearLayout(context);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            TextInputLayout textInputLayout = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.write = new FrameLayout(context);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.addView(this.write, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                RemoteActionCompatParcelizer();
            }
        }
        if (i == 0 || i == 1) {
            this.write.setVisibility(0);
            this.write.addView(appCompatTextView);
        } else {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setVisibility(0);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw++;
    }

    public final TextView serializer(int i) {
        if (i == 1) {
            return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        if (i != 2) {
            return null;
        }
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    public final void serializer(androidx.appcompat.widget.AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.write) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw - 1;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2;
        LinearLayout linearLayout2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void read(int i, int i2, boolean z) {
        TextView textViewSerializer;
        TextView textViewSerializer2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.read = animatorSet;
            ArrayList arrayList = new ArrayList();
            read(arrayList, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 2, i, i2);
            read(arrayList, this.PlaybackStateCompatCustomAction, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new TestModifierUpdaterKtTestModifierUpdaterLayout2(this, i2, serializer(i), i, serializer(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewSerializer2 = serializer(i2)) != null) {
                textViewSerializer2.setVisibility(0);
                textViewSerializer2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewSerializer = serializer(i)) != null) {
                textViewSerializer.setVisibility(4);
                if (i == 1) {
                    textViewSerializer.setText((CharSequence) null);
                }
            }
            this.RemoteActionCompatParcelizer = i2;
        }
        TextInputLayout textInputLayout = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        textInputLayout.MediaSessionCompatQueueItem();
        textInputLayout.write(z, false);
        textInputLayout.updateTextInputBoxState();
    }

    public final void read(ArrayList arrayList, boolean z, androidx.appcompat.widget.AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        TimeInterpolator timeInterpolator;
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<androidx.appcompat.widget.AppCompatTextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.RatingCompat;
            objectAnimatorOfFloat.setDuration(z2 ? this.serializer : i4);
            if (z2) {
                timeInterpolator = this.IconCompatParcelizer;
            } else {
                timeInterpolator = this.MediaDescriptionCompat;
            }
            objectAnimatorOfFloat.setInterpolator(timeInterpolator);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<androidx.appcompat.widget.AppCompatTextView, Float>) View.TRANSLATION_Y, -this.ParcelableVolumeInfo, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.MediaSessionCompatQueueItem);
            objectAnimatorOfFloat2.setInterpolator(this.MediaMetadataCompat);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }
}
