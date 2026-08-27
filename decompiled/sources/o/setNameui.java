package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setNameui implements getVectorui {
    public final setOutlineAmbientShadowColor serializer;

    public final setIntrinsicColorFilterui serializer() {
        String str;
        List list;
        List list2;
        getAmbientShadowColor getambientshadowcolor;
        getAmbientShadowColor getambientshadowcolor2;
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.serializer).write();
        String str2 = null;
        OutlineVerificationHelper outlineVerificationHelper = layerSnapshotV21Write != null ? layerSnapshotV21Write.RemoteActionCompatParcelizer : null;
        String str3 = outlineVerificationHelper != null ? outlineVerificationHelper.address : null;
        String str4 = outlineVerificationHelper != null ? outlineVerificationHelper.comments : null;
        String str5 = outlineVerificationHelper != null ? outlineVerificationHelper.deliveryNotes : null;
        String str6 = outlineVerificationHelper != null ? outlineVerificationHelper.customer : null;
        if (layerSnapshotV21Write == null || (str = layerSnapshotV21Write.ParcelableVolumeInfo) == null) {
            str = "";
        }
        VectorComposable vectorComposable = new VectorComposable(str3, str4, str5, str6, str, outlineVerificationHelper != null ? outlineVerificationHelper.phoneNumber : null, outlineVerificationHelper != null ? outlineVerificationHelper.amount : null);
        String strRemoteActionCompatParcelizer = maxApproachIntrinsicWidth.RemoteActionCompatParcelizer(layerSnapshotV21Write != null ? layerSnapshotV21Write.PlaybackStateCompat : null);
        List list3 = instance_delegatelambda0.write;
        if (layerSnapshotV21Write == null || (getambientshadowcolor2 = layerSnapshotV21Write.MediaSessionCompatToken) == null || (list = getambientshadowcolor2.supportedTranslationsList) == null) {
            list = list3;
        }
        if (layerSnapshotV21Write != null && (getambientshadowcolor = layerSnapshotV21Write.MediaSessionCompatToken) != null && (getambientshadowcolor instanceof RenderNodeVerificationHelper28)) {
            String str7 = ((RenderNodeVerificationHelper28) getambientshadowcolor).preferredLanguage;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str7)) {
                str2 = str7;
            }
        }
        Path9cdaXJ4 path9cdaXJ4 = new Path9cdaXJ4(list, str2);
        if (layerSnapshotV21Write != null && (list2 = layerSnapshotV21Write.PlaybackStateCompatCustomAction) != null) {
            list3 = list2;
        }
        return new setIntrinsicColorFilterui(new VectorComponentdrawVectorBlock1(vectorComposable, strRemoteActionCompatParcelizer, list3, path9cdaXJ4));
    }

    public setNameui(setOutlineAmbientShadowColor setoutlineambientshadowcolor) {
        this.serializer = setoutlineambientshadowcolor;
    }
}
