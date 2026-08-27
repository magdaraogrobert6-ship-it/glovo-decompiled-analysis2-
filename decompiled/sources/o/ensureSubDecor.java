package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class ensureSubDecor {
    public static final PorterDuff.Mode RemoteActionCompatParcelizer = PorterDuff.Mode.SRC_IN;
    public static ensureSubDecor read;
    public getSupportCompoundDrawablesTintMode write;

    public final Drawable IconCompatParcelizer(Context context, int i) {
        Drawable drawableRemoteActionCompatParcelizer;
        synchronized (this) {
            drawableRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(context, i);
        }
        return drawableRemoteActionCompatParcelizer;
    }

    public static void IconCompatParcelizer(Drawable drawable, setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, int[] iArr) {
        PorterDuff.Mode mode = getSupportCompoundDrawablesTintMode.IconCompatParcelizer;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer;
            if (!z && !setsupportcompounddrawablestintlist.serializer) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) setsupportcompounddrawablestintlist.write : null;
            PorterDuff.Mode mode2 = setsupportcompounddrawablestintlist.serializer ? (PorterDuff.Mode) setsupportcompounddrawablestintlist.IconCompatParcelizer : getSupportCompoundDrawablesTintMode.IconCompatParcelizer;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = getSupportCompoundDrawablesTintMode.read(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public static PorterDuffColorFilter RemoteActionCompatParcelizer(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ensureSubDecor.class) {
            porterDuffColorFilter = getSupportCompoundDrawablesTintMode.read(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void read() {
        synchronized (ensureSubDecor.class) {
            if (read == null) {
                ensureSubDecor ensuresubdecor = new ensureSubDecor();
                read = ensuresubdecor;
                ensuresubdecor.write = getSupportCompoundDrawablesTintMode.write();
                getSupportCompoundDrawablesTintMode getsupportcompounddrawablestintmode = read.write;
                MetricsBatchProcessor metricsBatchProcessor = new MetricsBatchProcessor(2);
                synchronized (getsupportcompounddrawablestintmode) {
                    getsupportcompounddrawablestintmode.MediaBrowserCompatMediaItem = metricsBatchProcessor;
                }
            }
        }
    }

    public static ensureSubDecor write() {
        ensureSubDecor ensuresubdecor;
        synchronized (ensureSubDecor.class) {
            if (read == null) {
                read();
            }
            ensuresubdecor = read;
        }
        return ensuresubdecor;
    }
}
