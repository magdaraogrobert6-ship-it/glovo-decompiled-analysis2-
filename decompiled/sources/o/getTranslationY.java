package o;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getTranslationY {
    public final getGraphicsLayer serializer;

    public getTranslationY() {
        getGraphicsLayer getgraphicslayer = getGraphicsLayer.QUIET;
        getgraphicslayer.getClass();
        this.serializer = getgraphicslayer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r10 == 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.GraphicsLayerElement IconCompatParcelizer(androidx.window.sidecar.SidecarDisplayFeature r9, androidx.window.sidecar.SidecarDeviceState r10) throws androidx.window.core.WindowStrictModeException {
        /*
            r8 = this;
            o.component11SzJe1aQ r0 = o.component11SzJe1aQ.write
            r9.getClass()
            o.getGraphicsLayer r1 = r8.serializer
            r1.getClass()
            o.Float16Kt r2 = o.Float16Kt.serializer
            androidx.window.core.ValidSpecification r3 = new androidx.window.core.ValidSpecification
            r3.<init>(r9, r1, r2)
            o.getSpotShadowColor0d7_KjU r1 = new o.getSpotShadowColor0d7_KjU
            r1.<init>()
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            androidx.window.core.ValidSpecification r1 = r3.write(r2, r1)
            o.getTransformOriginSzJe1aQ r2 = new o.getTransformOriginSzJe1aQ
            r2.<init>()
            java.lang.String r3 = "Feature bounds must not be 0"
            androidx.window.core.ValidSpecification r1 = r1.write(r3, r2)
            o.getTranslationX r2 = new o.getTranslationX
            r2.<init>()
            java.lang.String r3 = "TYPE_FOLD must have 0 area"
            androidx.window.core.ValidSpecification r1 = r1.write(r3, r2)
            o.GraphicsLayerModifierKt r2 = new o.GraphicsLayerModifierKt
            r2.<init>()
            java.lang.String r3 = "Feature be pinned to either left or top"
            androidx.window.core.ValidSpecification r1 = r1.write(r3, r2)
            int r2 = r1.read
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L69
            o.getGraphicsLayer r2 = r1.IconCompatParcelizer
            int[] r7 = o.GraphicsContextObserver.IconCompatParcelizer
            int r2 = r2.ordinal()
            r2 = r7[r2]
            if (r2 == r6) goto L64
            if (r2 == r5) goto L5a
            if (r2 != r4) goto L56
            goto L62
        L56:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            goto L62
        L5a:
            java.lang.Object r1 = r1.serializer
            r1.getClass()
            r1.toString()
        L62:
            r1 = r3
            goto L6b
        L64:
            java.lang.Object r9 = r1.write
            androidx.window.core.WindowStrictModeException r9 = (androidx.window.core.WindowStrictModeException) r9
            throw r9
        L69:
            java.lang.Object r1 = r1.serializer
        L6b:
            androidx.window.sidecar.SidecarDisplayFeature r1 = (androidx.window.sidecar.SidecarDisplayFeature) r1
            if (r1 != 0) goto L70
            goto La2
        L70:
            int r1 = r1.getType()
            if (r1 == r6) goto L7c
            if (r1 == r5) goto L79
            goto La2
        L79:
            o.component11SzJe1aQ r1 = o.component11SzJe1aQ.read
            goto L7e
        L7c:
            o.component11SzJe1aQ r1 = o.component11SzJe1aQ.serializer
        L7e:
            int r10 = o.accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(r10)
            if (r10 == 0) goto La2
            if (r10 == r6) goto La2
            if (r10 == r5) goto L8e
            if (r10 == r4) goto L90
            r2 = 4
            if (r10 == r2) goto La2
            goto L90
        L8e:
            o.component11SzJe1aQ r0 = o.component11SzJe1aQ.RemoteActionCompatParcelizer
        L90:
            android.graphics.Rect r9 = r9.getRect()
            r9.getClass()
            o.toCompareValue r10 = new o.toCompareValue
            r10.<init>(r9)
            o.GraphicsLayerElement r9 = new o.GraphicsLayerElement
            r9.<init>(r10, r1, r0)
            return r9
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTranslationY.IconCompatParcelizer(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):o.GraphicsLayerElement");
    }

    public static final boolean IconCompatParcelizer(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean RemoteActionCompatParcelizer(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static boolean read(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (serializer((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean serializer(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean write(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final component160d7_KjU read(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new component160d7_KjU(instance_delegatelambda0.write);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        accesssetReusableGraphicsLayerScopep.serializer(sidecarDeviceState2, accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(sidecarDeviceState));
        return new component160d7_KjU(serializer(accesssetReusableGraphicsLayerScopep.serializer(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public static boolean serializer(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{sidecarDisplayFeature, sidecarDisplayFeature2}, iWrite3)).booleanValue()) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        Object[] objArr = {sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final ArrayList serializer(List list, SidecarDeviceState sidecarDeviceState) throws androidx.window.core.WindowStrictModeException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GraphicsLayerElement graphicsLayerElementIconCompatParcelizer = IconCompatParcelizer((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (graphicsLayerElementIconCompatParcelizer != null) {
                arrayList.add(graphicsLayerElementIconCompatParcelizer);
            }
        }
        return arrayList;
    }
}
