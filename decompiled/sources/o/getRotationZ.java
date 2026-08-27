package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getRotationZ {
    public static GraphicsLayerElement RemoteActionCompatParcelizer(component17NrFUSI component17nrfusi, FoldingFeature foldingFeature) {
        component11SzJe1aQ component11szje1aq;
        component11SzJe1aQ component11szje1aq2;
        component17nrfusi.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            component11szje1aq = component11SzJe1aQ.serializer;
        } else {
            if (type != 2) {
                return null;
            }
            component11szje1aq = component11SzJe1aQ.read;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            component11szje1aq2 = component11SzJe1aQ.write;
        } else {
            if (state != 2) {
                return null;
            }
            component11szje1aq2 = component11SzJe1aQ.RemoteActionCompatParcelizer;
        }
        android.graphics.Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        toCompareValue tocomparevalue = new toCompareValue(bounds);
        android.graphics.Rect rectIconCompatParcelizer = component17nrfusi.IconCompatParcelizer();
        if (tocomparevalue.read() == 0 && tocomparevalue.serializer() == 0) {
            return null;
        }
        if (tocomparevalue.serializer() != rectIconCompatParcelizer.width() && tocomparevalue.read() != rectIconCompatParcelizer.height()) {
            return null;
        }
        if (tocomparevalue.serializer() < rectIconCompatParcelizer.width() && tocomparevalue.read() < rectIconCompatParcelizer.height()) {
            return null;
        }
        if (tocomparevalue.serializer() == rectIconCompatParcelizer.width() && tocomparevalue.read() == rectIconCompatParcelizer.height()) {
            return null;
        }
        android.graphics.Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new GraphicsLayerElement(new toCompareValue(bounds2), component11szje1aq, component11szje1aq2);
    }

    public static component160d7_KjU IconCompatParcelizer(Context context, WindowLayoutInfo windowLayoutInfo) {
        graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault;
        graphicsLayersKFY_QE graphicslayerskfy_qe = graphicsLayerpANQ8Wg.serializer;
        graphicsLayerAp8cVGQ graphicslayerap8cvgq = graphicsLayerAp8cVGQ.RemoteActionCompatParcelizer;
        graphicsLayer_6ThJ44default graphicslayer_6thj44default = graphicsLayer_6ThJ44default.RemoteActionCompatParcelizer;
        context.getClass();
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            graphicslayerap8cvgqdefault = graphicsLayer_6ThJ44default.write;
        } else {
            graphicslayerap8cvgqdefault = graphicsLayerpANQ8Wg.RemoteActionCompatParcelizer;
        }
        androidx.sqlite.SQLite.write(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(androidx.compose.ui.graphics.Fields.SpotShadowColor));
        if (i >= 30) {
            if (i >= 34) {
                graphicslayerskfy_qe = graphicslayer_6thj44default;
            } else if (i >= 30) {
                graphicslayerskfy_qe = graphicslayerap8cvgq;
            }
            return RemoteActionCompatParcelizer(graphicslayerskfy_qe.read(context, graphicslayerap8cvgqdefault), windowLayoutInfo);
        }
        if (i >= 29 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (i >= 34) {
                graphicslayerskfy_qe = graphicslayer_6thj44default;
            } else if (i >= 30) {
                graphicslayerskfy_qe = graphicslayerap8cvgq;
            }
            return RemoteActionCompatParcelizer(graphicslayerskfy_qe.IconCompatParcelizer(activity, graphicslayerap8cvgqdefault), windowLayoutInfo);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        return null;
    }

    public static component160d7_KjU RemoteActionCompatParcelizer(component17NrFUSI component17nrfusi, WindowLayoutInfo windowLayoutInfo) {
        component17nrfusi.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            GraphicsLayerElement graphicsLayerElementRemoteActionCompatParcelizer = foldingFeature instanceof FoldingFeature ? RemoteActionCompatParcelizer(component17nrfusi, foldingFeature) : null;
            if (graphicsLayerElementRemoteActionCompatParcelizer != null) {
                arrayList.add(graphicsLayerElementRemoteActionCompatParcelizer);
            }
        }
        return new component160d7_KjU(arrayList);
    }
}
