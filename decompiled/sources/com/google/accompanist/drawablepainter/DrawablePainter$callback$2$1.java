package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;
import o.accessgetAppSwitchcp;
import o.getMediumfv9h1I;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawablePainter$callback$2$1 implements Drawable.Callback {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ DrawablePainter$callback$2$1(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            ((getMediumfv9h1I) obj).invalidateSelf();
            return;
        }
        drawable.getClass();
        DrawablePainter drawablePainter = (DrawablePainter) obj;
        onShowTranslationui onshowtranslationui = (onShowTranslationui) drawablePainter.RemoteActionCompatParcelizer;
        onshowtranslationui.setValue(Integer.valueOf(((Number) onshowtranslationui.getValue()).intValue() + 1));
        long jSerializer = accessgetAppSwitchcp.serializer(drawablePainter.IconCompatParcelizer);
        ((onShowTranslationui) drawablePainter.write).setValue(Size.m534boximpl(jSerializer));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.write != 0) {
            ((getMediumfv9h1I) this.IconCompatParcelizer).scheduleSelf(runnable, j);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ((Handler) accessgetAppSwitchcp.read.MediaSessionCompatResultReceiverWrapper()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.write != 0) {
            ((getMediumfv9h1I) this.IconCompatParcelizer).unscheduleSelf(runnable);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ((Handler) accessgetAppSwitchcp.read.MediaSessionCompatResultReceiverWrapper()).removeCallbacks(runnable);
    }
}
