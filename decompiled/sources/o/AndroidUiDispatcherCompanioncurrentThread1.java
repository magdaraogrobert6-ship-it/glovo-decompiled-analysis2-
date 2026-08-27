package o;

import android.os.Bundle;
import com.mapbox.geojson.Point;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidUiDispatcherCompanioncurrentThread1 implements getPlacementScope, io.sentry.util.MediaSessionCompatQueueItem {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public AndroidUiDispatcherCompanioncurrentThread1(getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset) {
        this.RemoteActionCompatParcelizer = 25;
    }

    public /* synthetic */ AndroidUiDispatcherCompanioncurrentThread1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public Object evaluate() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            Boolean.valueOf(io.sentry.android.core._init_lambda3.IconCompatParcelizer());
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(io.sentry.android.core._init_lambda3.IconCompatParcelizer());
        int i3 = serializer + 97;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static Point RemoteActionCompatParcelizer(f8 f8Var) {
        int i = 2 % 2;
        int i2 = write + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        f8Var.getClass();
        Point pointFromLngLat = Point.fromLngLat(f8Var.read, f8Var.serializer);
        pointFromLngLat.getClass();
        int i4 = write + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return pointFromLngLat;
    }

    public static void RemoteActionCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity, FullscreenItemUi fullscreenItemUi) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putParcelable("full_screen_ui_item", fullscreenItemUi);
        FullScreenDetailsFragment fullScreenDetailsFragmentRemoteActionCompatParcelizer = convertToIndirectPointerEventk92h6UUui.RemoteActionCompatParcelizer();
        fullScreenDetailsFragmentRemoteActionCompatParcelizer.setArguments(bundle);
        fullScreenDetailsFragmentRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment");
        int i2 = write + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r4 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r4 = (o.AndroidUriHandler) r4.read(o.AndroidUriHandler.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return new o.accessgetWcp(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r3.RemoteActionCompatParcelizer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3.RemoteActionCompatParcelizer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = new o.AndroidViewConfigurationApi34((android.content.Context) r4.read(android.content.Context.class));
        r4 = o.AndroidUiDispatcherCompanioncurrentThread1.serializer + 97;
        o.AndroidUiDispatcherCompanioncurrentThread1.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.getPlacementScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object create(io.sentry.metrics.MetricsBatchProcessor r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AndroidUiDispatcherCompanioncurrentThread1.serializer
            int r1 = r1 + 107
            int r2 = r1 % 128
            o.AndroidUiDispatcherCompanioncurrentThread1.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int r1 = r3.RemoteActionCompatParcelizer
            r2 = 69
            int r2 = r2 / 0
            if (r1 == 0) goto L38
            goto L1b
        L17:
            int r1 = r3.RemoteActionCompatParcelizer
            if (r1 == 0) goto L38
        L1b:
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r4 = r4.read(r1)
            android.content.Context r4 = (android.content.Context) r4
            o.AndroidViewConfigurationApi34 r1 = new o.AndroidViewConfigurationApi34
            r1.<init>(r4)
            int r4 = o.AndroidUiDispatcherCompanioncurrentThread1.serializer
            int r4 = r4 + 97
            int r2 = r4 % 128
            o.AndroidUiDispatcherCompanioncurrentThread1.write = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L37
            r4 = 18
            int r4 = r4 / 0
        L37:
            return r1
        L38:
            java.lang.Class<o.AndroidUriHandler> r0 = o.AndroidUriHandler.class
            java.lang.Object r4 = r4.read(r0)
            o.AndroidUriHandler r4 = (o.AndroidUriHandler) r4
            o.accessgetWcp r4 = new o.accessgetWcp
            r0 = 1
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidUiDispatcherCompanioncurrentThread1.create(io.sentry.metrics.MetricsBatchProcessor):java.lang.Object");
    }

    public static byte[] serializer(List list) {
        int i = 2 % 2;
        list.getClass();
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        for (String str : IconCompatParcelizer(list)) {
            int i2 = serializer + 119;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            registryMissingComponentException.read(str.length());
            registryMissingComponentException.IconCompatParcelizer(str);
            int i4 = write + 95;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return registryMissingComponentException.read(registryMissingComponentException.size);
    }

    public static ArrayList IconCompatParcelizer(List list) {
        int i = 2 % 2;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = serializer + 31;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc) obj) != r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (!(!it.hasNext())) {
            int i4 = write + 119;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                arrayList2.add(((r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc) it.next()).toString());
                int i5 = 78 / 0;
            } else {
                arrayList2.add(((r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc) it.next()).toString());
            }
        }
        return arrayList2;
    }
}
