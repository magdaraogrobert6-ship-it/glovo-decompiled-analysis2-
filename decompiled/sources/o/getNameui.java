package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class getNameui implements getCompositionui {
    public final setOutlineAmbientShadowColor IconCompatParcelizer;

    public getNameui(setOutlineAmbientShadowColor setoutlineambientshadowcolor) {
        this.IconCompatParcelizer = setoutlineambientshadowcolor;
    }

    public final String write(String str) {
        String str2;
        str.getClass();
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.IconCompatParcelizer).write();
        if (layerSnapshotV21Write == null || (str2 = layerSnapshotV21Write.read) == null) {
            throw new com.deliveryhero.customerchat.commons.BlankChannelIDException();
        }
        String string = Uri.parse(str).buildUpon().path("/chat/".concat(str2)).build().toString();
        string.getClass();
        return string;
    }
}
