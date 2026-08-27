package com.mapbox.maps.debugoptions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.sqlite.SQLite;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.UtilsKt;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PaddingDebugView extends FrameLayout {
    private final TextView bottom;
    private final TextView left;
    private final FrameLayout paddingFrame;
    private final TextView right;
    private final TextView top;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingDebugView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        this.paddingFrame = frameLayout;
        TextView textView = new TextView(context);
        this.top = textView;
        TextView textView2 = new TextView(context);
        this.left = textView2;
        TextView textView3 = new TextView(context);
        this.right = textView3;
        TextView textView4 = new TextView(context);
        this.bottom = textView4;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Float fValueOf = Float.valueOf(1.0f);
        gradientDrawable.setStroke((int) UtilsKt.toDP(fValueOf, context).floatValue(), PaddingDebugViewKt.GREEN_DARK);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View crossView = new CrossView(context, null, 0, 6, null);
        Float fValueOf2 = Float.valueOf(15.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) UtilsKt.toDP(fValueOf2, context).floatValue(), (int) UtilsKt.toDP(fValueOf2, context).floatValue());
        layoutParams.gravity = 17;
        crossView.setLayoutParams(layoutParams);
        for (TextView textView5 : SQLite.read(textView, textView2, textView3, textView4)) {
            textView5.setTypeface(Typeface.MONOSPACE);
            textView5.setTextSize(10.0f);
            textView5.setTextColor(-1);
            textView5.setBackgroundColor(PaddingDebugViewKt.GREEN_DARK);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (textView5.equals(this.top)) {
                layoutParams2.gravity = 1;
            } else if (textView5.equals(this.left)) {
                layoutParams2.gravity = 16;
            } else if (textView5.equals(this.right)) {
                layoutParams2.gravity = 21;
            } else if (textView5.equals(this.bottom)) {
                layoutParams2.gravity = 81;
            }
            layoutParams2.leftMargin = (int) UtilsKt.toDP(fValueOf, context).floatValue();
            layoutParams2.rightMargin = (int) UtilsKt.toDP(fValueOf, context).floatValue();
            textView5.setLayoutParams(layoutParams2);
            textView5.setPadding((int) UtilsKt.toDP(fValueOf, context).floatValue(), 0, (int) UtilsKt.toDP(fValueOf, context).floatValue(), 0);
            this.paddingFrame.addView(textView5);
        }
        this.paddingFrame.addView(crossView);
        addView(this.paddingFrame);
    }

    @SuppressLint
    public final void update(EdgeInsets edgeInsets) {
        edgeInsets.getClass();
        FrameLayout frameLayout = this.paddingFrame;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        double left = edgeInsets.getLeft();
        Context context = getContext();
        context.getClass();
        int iDoubleValue = (int) UtilsKt.toDP(Double.valueOf(left), context).doubleValue();
        double top = edgeInsets.getTop();
        Context context2 = getContext();
        context2.getClass();
        int iDoubleValue2 = (int) UtilsKt.toDP(Double.valueOf(top), context2).doubleValue();
        double right = edgeInsets.getRight();
        Context context3 = getContext();
        context3.getClass();
        int iDoubleValue3 = (int) UtilsKt.toDP(Double.valueOf(right), context3).doubleValue();
        double bottom = edgeInsets.getBottom();
        Context context4 = getContext();
        context4.getClass();
        layoutParams2.setMargins(iDoubleValue, iDoubleValue2, iDoubleValue3, (int) UtilsKt.toDP(Double.valueOf(bottom), context4).doubleValue());
        frameLayout.setLayoutParams(layoutParams2);
        this.top.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(edgeInsets.getTop())}, 1)));
        this.left.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(edgeInsets.getLeft())}, 1)));
        this.right.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(edgeInsets.getRight())}, 1)));
        this.bottom.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(edgeInsets.getBottom())}, 1)));
    }

    public /* synthetic */ PaddingDebugView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
