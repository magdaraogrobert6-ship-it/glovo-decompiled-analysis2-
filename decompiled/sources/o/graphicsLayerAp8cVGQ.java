package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class graphicsLayerAp8cVGQ implements graphicsLayer_6ThJ44, graphicsLayersKFY_QE {
    public static final graphicsLayerAp8cVGQ read = new graphicsLayerAp8cVGQ();
    public static final graphicsLayerAp8cVGQ RemoteActionCompatParcelizer = new graphicsLayerAp8cVGQ();

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI IconCompatParcelizer(Activity activity, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        graphicsLayer_6ThJ44 graphicslayer_6thj44;
        activity.getClass();
        graphicslayerap8cvgqdefault.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            graphicslayer_6thj44 = read;
        } else {
            graphicslayer_6thj44 = i >= 29 ? graphicsLayerpANQ8Wg.read : graphicsLayerpANQ8Wg.write;
        }
        return new component17NrFUSI(new toCompareValue(graphicslayer_6thj44.read(activity)), graphicslayerap8cvgqdefault.RemoteActionCompatParcelizer(activity));
    }

    @Override // o.graphicsLayer_6ThJ44
    public android.graphics.Rect read(Activity activity) {
        activity.getClass();
        android.graphics.Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI read(Context context, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        context.getClass();
        graphicslayerap8cvgqdefault.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new component17NrFUSI(bounds, f);
    }
}
