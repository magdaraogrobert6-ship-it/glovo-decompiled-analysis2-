package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();
    private static final boolean isApiBelowBaklava;

    private InAppMessageViewUtils() {
    }

    public static final boolean isApiBelowBaklava() {
        return isApiBelowBaklava;
    }

    public static /* synthetic */ void isApiBelowBaklava$annotations() {
    }

    static {
        isApiBelowBaklava = Build.VERSION.SDK_INT < 36;
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(0), 7, (Object) null);
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageOnKeycodeBack$lambda$0() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDrawableColor$lambda$0() {
        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setIcon$lambda$0() {
        return "Caught exception setting icon typeface. Not rendering icon.";
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setDrawableColor(Drawable drawable, int i) {
        drawable.getClass();
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(18), 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                drawable2.getClass();
                setDrawableColor(drawable2, i);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, i);
        }
    }

    public static final void setIcon(Context context, String str, int i, int i2, TextView textView) {
        context.getClass();
        textView.getClass();
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i);
                if (textView.getBackground() == null) {
                    setViewBackgroundColor(textView, i2);
                    return;
                }
                Drawable background = textView.getBackground();
                background.getClass();
                setDrawableColor(background, i2);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(17), 4, (Object) null);
            }
        }
    }

    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        int i;
        textView.getClass();
        textAlign.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else if (i2 == 2) {
            i = 8388613;
        } else {
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            i = 17;
        }
        textView.setGravity(i);
    }

    public static final void setTextViewColor(TextView textView, int i) {
        textView.getClass();
        textView.setTextColor(i);
    }

    public static final void setViewBackgroundColor(View view, int i) {
        view.getClass();
        view.setBackgroundColor(i);
    }

    public static final void setViewBackgroundColorFilter(View view, int i) {
        view.getClass();
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        background.getClass();
        inAppMessageViewUtils.setDrawableColorFilter(background, i);
        view.getBackground().setAlpha(Color.alpha(i));
    }

    public static final void setFrameColor(View view, Integer num) {
        view.getClass();
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        imageView.getClass();
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 != null || textView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams);
    }

    private final void setDrawableColorFilter(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
