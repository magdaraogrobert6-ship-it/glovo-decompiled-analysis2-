package o;

import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedusljTpc {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final decode serializer;
    public final String write;

    public getUnspecifiedusljTpc(decode decodeVar, oc ocVar, accessgetOldDependencyp accessgetolddependencyp) {
        this.serializer = decodeVar;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(17, ocVar));
        this.write = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) accessgetolddependencyp).write;
    }

    public final String IconCompatParcelizer(accessgetStrictcp accessgetstrictcp) {
        int i = 2 % 2;
        int i2 = getDefaultjp8hJ3c.read[accessgetstrictcp.ordinal()];
        if (i2 == 1) {
            return this.write;
        }
        Object obj = null;
        if (i2 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i3 = read + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = (String) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        int i5 = IconCompatParcelizer + 3;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
