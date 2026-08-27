package o;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class hasFocusableContent {
    public static boolean IconCompatParcelizer() {
        return Trace.isEnabled();
    }

    public static void serializer(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static void serializer(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static Object write(setUp setup) {
        switch (FocusOrderModifier.read[setup.ordinal()]) {
            case 1:
                return android.graphics.BlendMode.CLEAR;
            case 2:
                return android.graphics.BlendMode.SRC;
            case 3:
                return android.graphics.BlendMode.DST;
            case 4:
                return android.graphics.BlendMode.SRC_OVER;
            case 5:
                return android.graphics.BlendMode.DST_OVER;
            case 6:
                return android.graphics.BlendMode.SRC_IN;
            case 7:
                return android.graphics.BlendMode.DST_IN;
            case 8:
                return android.graphics.BlendMode.SRC_OUT;
            case 9:
                return android.graphics.BlendMode.DST_OUT;
            case 10:
                return android.graphics.BlendMode.SRC_ATOP;
            case 11:
                return android.graphics.BlendMode.DST_ATOP;
            case 12:
                return android.graphics.BlendMode.XOR;
            case 13:
                return android.graphics.BlendMode.PLUS;
            case 14:
                return android.graphics.BlendMode.MODULATE;
            case 15:
                return android.graphics.BlendMode.SCREEN;
            case 16:
                return android.graphics.BlendMode.OVERLAY;
            case 17:
                return android.graphics.BlendMode.DARKEN;
            case 18:
                return android.graphics.BlendMode.LIGHTEN;
            case 19:
                return android.graphics.BlendMode.COLOR_DODGE;
            case 20:
                return android.graphics.BlendMode.COLOR_BURN;
            case 21:
                return android.graphics.BlendMode.HARD_LIGHT;
            case 22:
                return android.graphics.BlendMode.SOFT_LIGHT;
            case 23:
                return android.graphics.BlendMode.DIFFERENCE;
            case 24:
                return android.graphics.BlendMode.EXCLUSION;
            case 25:
                return android.graphics.BlendMode.MULTIPLY;
            case 26:
                return android.graphics.BlendMode.HUE;
            case 27:
                return android.graphics.BlendMode.SATURATION;
            case 28:
                return android.graphics.BlendMode.COLOR;
            case 29:
                return android.graphics.BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static void IconCompatParcelizer(getAdd0d7_KjU getadd0d7_kju, int i, Notification notification, int i2) {
        try {
            getadd0d7_kju.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            setRotationX setrotationx = setRotationX.read();
            String str = getAdd0d7_KjU.IconCompatParcelizer;
            if (setrotationx.read <= 5) {
                SentryLogcatAdapter.write(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            setRotationX setrotationx2 = setRotationX.read();
            String str2 = getAdd0d7_KjU.IconCompatParcelizer;
            if (setrotationx2.read <= 5) {
                SentryLogcatAdapter.write(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
