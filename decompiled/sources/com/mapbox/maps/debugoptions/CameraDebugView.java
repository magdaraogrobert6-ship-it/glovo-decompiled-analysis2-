package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.UtilsKt;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraDebugView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDebugView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setTypeface(Typeface.MONOSPACE);
        int iFloatValue = (int) UtilsKt.toDP(Float.valueOf(4.0f), context).floatValue();
        setTextSize(13.0f);
        setPadding(iFloatValue, iFloatValue, iFloatValue, iFloatValue);
        setTextColor(-16777216);
        int iFloatValue2 = (int) UtilsKt.toDP(Float.valueOf(8.0f), context).floatValue();
        int iFloatValue3 = (int) UtilsKt.toDP(Float.valueOf(48.0f), context).floatValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iFloatValue2, iFloatValue3, 0, 0);
        setLayoutParams(layoutParams);
        float fFloatValue = UtilsKt.toDP(Float.valueOf(5.0f), context).floatValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fFloatValue);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
    }

    public final void update(CameraState cameraState) {
        cameraState.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "lat:");
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) String.format(" %.4f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().latitude())}, 1))).append((CharSequence) "\n");
        spannableStringBuilderAppend.getClass();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) "lon:");
        spannableStringBuilderAppend.setSpan(styleSpan2, length2, spannableStringBuilderAppend.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) String.format(" %.4f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().longitude())}, 1))).append((CharSequence) "\n");
        spannableStringBuilderAppend2.getClass();
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length3 = spannableStringBuilderAppend2.length();
        spannableStringBuilderAppend2.append((CharSequence) "zoom:");
        spannableStringBuilderAppend2.setSpan(styleSpan3, length3, spannableStringBuilderAppend2.length(), 17);
        SpannableStringBuilder spannableStringBuilderAppend3 = spannableStringBuilderAppend2.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getZoom())}, 1)));
        if (cameraState.getBearing() != 0.0d) {
            spannableStringBuilderAppend3.append((CharSequence) "\n");
            StyleSpan styleSpan4 = new StyleSpan(1);
            int length4 = spannableStringBuilderAppend3.length();
            spannableStringBuilderAppend3.append((CharSequence) "bearing:");
            spannableStringBuilderAppend3.setSpan(styleSpan4, length4, spannableStringBuilderAppend3.length(), 17);
            spannableStringBuilderAppend3.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getBearing())}, 1)));
        }
        if (cameraState.getPitch() != 0.0d) {
            spannableStringBuilderAppend3.append((CharSequence) "\n");
            StyleSpan styleSpan5 = new StyleSpan(1);
            int length5 = spannableStringBuilderAppend3.length();
            spannableStringBuilderAppend3.append((CharSequence) "pitch:");
            spannableStringBuilderAppend3.setSpan(styleSpan5, length5, spannableStringBuilderAppend3.length(), 17);
            spannableStringBuilderAppend3.append((CharSequence) String.format(" %.2f", Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getPitch())}, 1)));
        }
        setText(spannableStringBuilderAppend3);
    }

    public /* synthetic */ CameraDebugView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
