package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.text.TextPaint;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class populateFocusOrder {
    public static boolean RemoteActionCompatParcelizer(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static String read(Float f) {
        NumberFormat numberFormat = NumberFormat.getInstance(java.util.Locale.US);
        numberFormat.setMaximumFractionDigits(6);
        String str = numberFormat.format(f);
        str.getClass();
        return str;
    }

    public static void IconCompatParcelizer(copyzey9I6wdefault copyzey9i6wdefault, setUp setup) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0163focusOrder.write(copyzey9i6wdefault, setup != null ? hasFocusableContent.write(setup) : null);
            return;
        }
        if (setup == null) {
            copyzey9i6wdefault.setXfermode(null);
            return;
        }
        switch (FocusOrderModifier.read[setup.ordinal()]) {
            case 1:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 2:
                mode = PorterDuff.Mode.SRC;
                break;
            case 3:
                mode = PorterDuff.Mode.DST;
                break;
            case 4:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 6:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 8:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 10:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 12:
                mode = PorterDuff.Mode.XOR;
                break;
            case 13:
                mode = PorterDuff.Mode.ADD;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 17:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 18:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        copyzey9i6wdefault.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }
}
