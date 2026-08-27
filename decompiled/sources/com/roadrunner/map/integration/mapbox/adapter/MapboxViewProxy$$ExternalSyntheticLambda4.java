package com.roadrunner.map.integration.mapbox.adapter;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.UncheckedColordefault;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.j0;
import o.j4;
import o.quadTo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.tintxETnrds;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapboxViewProxy$$ExternalSyntheticLambda4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ List IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ MapboxViewProxy$$ExternalSyntheticLambda4(int i, Object obj, List list) {
        this.read = i;
        this.IconCompatParcelizer = list;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String strRemoteActionCompatParcelizer;
        StyleObjectInfo styleObjectInfo;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        List<j0> list = this.IconCompatParcelizer;
        if (i4 != 0) {
            tintxETnrds tintxetnrds = (tintxETnrds) obj;
            tintxetnrds.getClass();
            List list2 = list;
            if (list2 != null) {
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("DELETE FROM `tracking_perseus_events` WHERE `id` = ?");
                try {
                    for (Object obj2 : list2) {
                        if (obj2 != null) {
                            uncheckedColordefaultRemoteActionCompatParcelizer.getClass();
                            uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, ((quadTo) obj2).r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                            uncheckedColordefaultRemoteActionCompatParcelizer.write();
                            ((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds})).intValue();
                            int i5 = RemoteActionCompatParcelizer + 53;
                            write = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                        }
                    }
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                        throw th2;
                    }
                }
            }
            return createfromparcel;
        }
        Style style = (Style) obj;
        style.getClass();
        Iterator<T> it = style.getStyleLayers().iterator();
        while (!(!it.hasNext())) {
            int i7 = write + 109;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                styleObjectInfo = (StyleObjectInfo) it.next();
                String id = styleObjectInfo.getId();
                id.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) id, (CharSequence) "com.roadrunner", false)) {
                    String id2 = styleObjectInfo.getId();
                    id2.getClass();
                    style.removeStyleLayer(id2);
                }
            } else {
                styleObjectInfo = (StyleObjectInfo) it.next();
                String id3 = styleObjectInfo.getId();
                id3.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) id3, (CharSequence) "com.roadrunner", false)) {
                    String id4 = styleObjectInfo.getId();
                    id4.getClass();
                    style.removeStyleLayer(id4);
                }
            }
        }
        for (StyleObjectInfo styleObjectInfo2 : style.getStyleSources()) {
            String id5 = styleObjectInfo2.getId();
            id5.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) id5, (CharSequence) "com.roadrunner", false)) {
                int i8 = write + 29;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                String id6 = styleObjectInfo2.getId();
                id6.getClass();
                style.removeStyleSource(id6);
            }
        }
        for (j0 j0Var : list) {
            j0Var.serializer.bindTo(style);
            for (Layer layer : j0Var.read) {
                layer.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) layer.getLayerId(), (CharSequence) "LAYER_TYPE_ROAD", false)) {
                    strRemoteActionCompatParcelizer = "mapbox-bottom-level-route-layer";
                    if (!style.styleLayerExists("mapbox-bottom-level-route-layer")) {
                        strRemoteActionCompatParcelizer = j4.RemoteActionCompatParcelizer(style);
                    }
                } else if (layer instanceof FillLayer) {
                    strRemoteActionCompatParcelizer = "annotation-layer";
                } else if (layer instanceof LineLayer) {
                    int i10 = RemoteActionCompatParcelizer + 79;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    strRemoteActionCompatParcelizer = "annotation-layer";
                } else {
                    strRemoteActionCompatParcelizer = "mapbox-location-indicator-layer";
                    if (!style.styleLayerExists("mapbox-location-indicator-layer")) {
                        strRemoteActionCompatParcelizer = null;
                    }
                }
                if (strRemoteActionCompatParcelizer != null) {
                    layer.bindTo(style, new LayerPosition(null, strRemoteActionCompatParcelizer, null));
                } else {
                    layer.bindTo(style, null);
                }
            }
        }
        return createfromparcel;
    }
}
