package o;

import com.huawei.hmf.tasks.a.d$a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetViewRootjd implements resetClipBounds {
    public Object serializer;
    public final Executor write;
    public final /* synthetic */ int read = 0;
    public final Object RemoteActionCompatParcelizer = new Object();

    public accessgetViewRootjd(accessgetSubCompositionViewjd accessgetsubcompositionviewjd, getContainer getcontainer) {
        this.serializer = getcontainer;
        this.write = accessgetsubcompositionviewjd;
    }

    @Override // o.resetClipBounds
    public final void serializer(ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29) {
        int i = this.read;
        if (i == 0) {
            this.write.execute(new d$a(this, 0, viewLayerUniqueDrawingIdApi29));
            return;
        }
        int i2 = 1;
        if (i != 1) {
            if (!viewLayerUniqueDrawingIdApi29.serializer() || viewLayerUniqueDrawingIdApi29.serializer) {
                return;
            }
            this.write.execute(new d$a(this, 2, viewLayerUniqueDrawingIdApi29));
            return;
        }
        if (viewLayerUniqueDrawingIdApi29.serializer() || viewLayerUniqueDrawingIdApi29.serializer) {
            return;
        }
        this.write.execute(new d$a(this, i2, viewLayerUniqueDrawingIdApi29));
    }

    public accessgetViewRootjd(Executor executor, getCameraDistancePx getcameradistancepx) {
        this.serializer = getcameradistancepx;
        this.write = executor;
    }

    public accessgetViewRootjd(Executor executor, getOutlineProvider getoutlineprovider) {
        this.serializer = getoutlineprovider;
        this.write = executor;
    }
}
