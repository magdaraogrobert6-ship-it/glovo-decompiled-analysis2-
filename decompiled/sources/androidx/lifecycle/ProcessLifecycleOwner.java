package androidx.lifecycle;

import android.os.Handler;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import o.AndroidColorSpace_androidKt;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.supportsColorMatrixQuery;
import o.toRegionOp7u2Bmg;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements accessisRenderNodeCompatiblecp {
    public static final ProcessLifecycleOwner IconCompatParcelizer = new ProcessLifecycleOwner();
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Handler read;
    public boolean write = true;
    public boolean MediaSessionCompatQueueItem = true;
    public final accessregisterComponentCallback RatingCompat = new accessregisterComponentCallback(this, true);
    public final Sentry$$ExternalSyntheticLambda5 serializer = new Sentry$$ExternalSyntheticLambda5(3, this);
    public final toRegionOp7u2Bmg RemoteActionCompatParcelizer = new toRegionOp7u2Bmg(this);

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return this.RatingCompat;
    }

    private ProcessLifecycleOwner() {
    }

    public final void serializer() {
        int i = this.MediaMetadataCompat + 1;
        this.MediaMetadataCompat = i;
        if (i == 1) {
            if (this.write) {
                this.RatingCompat.serializer(AndroidColorSpace_androidKt.ON_RESUME);
                this.write = false;
            } else {
                Handler handler = this.read;
                handler.getClass();
                handler.removeCallbacks(this.serializer);
            }
        }
    }
}
