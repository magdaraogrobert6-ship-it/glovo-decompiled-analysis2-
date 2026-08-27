package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class graphicsLayer_6ThJ44default implements graphicsLayerAp8cVGQdefault, graphicsLayersKFY_QE {
    public static final graphicsLayer_6ThJ44default write = new graphicsLayer_6ThJ44default();
    public static final graphicsLayer_6ThJ44default RemoteActionCompatParcelizer = new graphicsLayer_6ThJ44default();

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI read(Context context, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        context.getClass();
        graphicslayerap8cvgqdefault.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new component17NrFUSI(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // o.graphicsLayerAp8cVGQdefault
    public float RemoteActionCompatParcelizer(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI IconCompatParcelizer(Activity activity, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        graphicsLayer_6ThJ44 graphicslayer_6thj44;
        activity.getClass();
        graphicslayerap8cvgqdefault.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            graphicslayer_6thj44 = graphicsLayerAp8cVGQ.read;
        } else if (i >= 29) {
            graphicslayer_6thj44 = graphicsLayerpANQ8Wg.read;
        } else {
            graphicslayer_6thj44 = graphicsLayerpANQ8Wg.write;
        }
        return new component17NrFUSI(new toCompareValue(graphicslayer_6thj44.read(activity)), graphicslayerap8cvgqdefault.RemoteActionCompatParcelizer(activity));
    }
}
