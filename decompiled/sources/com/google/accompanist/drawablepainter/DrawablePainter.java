package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetAltLeftcp;
import o.accessgetAppSwitchcp;
import o.isAdapterPositionOnScreen;
import o.onShowTranslationui;
import o.updateBuffersOnDisappeared;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawablePainter extends Painter implements updateBuffersOnDisappeared {
    public final Drawable IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.IconCompatParcelizer.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1424getIntrinsicSizeNHjbRc() {
        return ((Size) ((onShowTranslationui) this.write).getValue()).m551unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.read.MediaSessionCompatResultReceiverWrapper();
        Drawable drawable = this.IconCompatParcelizer;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public DrawablePainter(Drawable drawable) {
        drawable.getClass();
        this.IconCompatParcelizer = drawable;
        this.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(0);
        this.write = CompositionKt.RemoteActionCompatParcelizer(Size.m534boximpl(accessgetAppSwitchcp.serializer(drawable)));
        this.read = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(14, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.IconCompatParcelizer.setAlpha(RangesKt.RemoteActionCompatParcelizer(MathKt.write(f * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        int i = accessgetAltLeftcp.RemoteActionCompatParcelizer[layoutDirection.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            i2 = 1;
        }
        return this.IconCompatParcelizer.setLayoutDirection(i2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        ((Number) ((onShowTranslationui) this.RemoteActionCompatParcelizer).getValue()).intValue();
        try {
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.IconCompatParcelizer;
            if (i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, MathKt.write(Size.m546getWidthimpl(drawScope.mo1304getSizeNHjbRc())), MathKt.write(Size.m543getHeightimpl(drawScope.mo1304getSizeNHjbRc())));
            } else {
                canvas.scale(Size.m546getWidthimpl(drawScope.mo1304getSizeNHjbRc()) / Size.m546getWidthimpl(mo1424getIntrinsicSizeNHjbRc()), Size.m543getHeightimpl(drawScope.mo1304getSizeNHjbRc()) / Size.m543getHeightimpl(mo1424getIntrinsicSizeNHjbRc()));
            }
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }
}
