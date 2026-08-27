package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PositionCalculator {
    public static volatile boolean RemoteActionCompatParcelizer = true;

    public static Drawable IconCompatParcelizer(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            getIndexOfFirstFeature getindexoffirstfeature = new getIndexOfFirstFeature(context);
            getindexoffirstfeature.write = theme;
            getindexoffirstfeature.write(theme.getResources().getConfiguration());
            context = getindexoffirstfeature;
        }
        return coil3.util.IntPair.write(context, i);
    }

    public static Drawable read(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (RemoteActionCompatParcelizer) {
                return IconCompatParcelizer(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            RemoteActionCompatParcelizer = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = setLeft.read;
        return resources.getDrawable(i, theme);
    }
}
