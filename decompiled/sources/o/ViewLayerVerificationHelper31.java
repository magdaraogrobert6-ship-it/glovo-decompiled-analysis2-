package o;

import androidx.lifecycle.BlockRunner$cancel$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLayerVerificationHelper31 implements setOutlineAmbientShadowColor {
    public final accesstoBitmap IconCompatParcelizer;
    public final LayerSnapshotV21 serializer;

    public final LayerSnapshotV21 write() {
        LayerSnapshotV21 layerSnapshotV21 = LayerSnapshotV21.serializer;
        LayerSnapshotV21 layerSnapshotV22 = this.serializer;
        if (!layerSnapshotV22.equals(layerSnapshotV21)) {
            return layerSnapshotV22;
        }
        LayerSnapshotV28 layerSnapshotV28 = (LayerSnapshotV28) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new BlockRunner$cancel$1((com.deliveryhero.contract.datastore.ChatConfigurationDataStoreHelperImpl) this.IconCompatParcelizer, (ShortNewsContentCardView) null, 18));
        if (layerSnapshotV28 != null) {
            return layerSnapshotV28.RemoteActionCompatParcelizer();
        }
        return null;
    }

    public ViewLayerVerificationHelper31(LayerSnapshotV21 layerSnapshotV21, accesstoBitmap accesstobitmap) {
        this.serializer = layerSnapshotV21;
        this.IconCompatParcelizer = accesstobitmap;
    }
}
