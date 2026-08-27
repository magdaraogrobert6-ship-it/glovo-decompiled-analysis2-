package o;

import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode$pointerInputNode$1$9$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class scheduleFutureWithReturn implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ ZoomableNode write;

    public /* synthetic */ scheduleFutureWithReturn(ZoomableNode zoomableNode, int i) {
        this.serializer = i;
        this.write = zoomableNode;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ZoomableNode zoomableNode = this.write;
        if (i4 != 0) {
            BuildersKt.RemoteActionCompatParcelizer(zoomableNode.getCoroutineScope(), null, null, new ZoomableNode$pointerInputNode$1$9$1(zoomableNode, null), 3);
            return createfromparcel;
        }
        zoomableNode.serializer = null;
        zoomableNode.MediaDescriptionCompat.MediaBrowserCompatMediaItem.resetTracking();
        int i5 = read + 113;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
