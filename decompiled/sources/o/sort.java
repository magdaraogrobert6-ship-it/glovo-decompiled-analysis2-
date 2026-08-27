package o;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sort {
    public static final /* synthetic */ int IconCompatParcelizer = 0;

    static {
        Charset.forName(com.adjust.sdk.Constants.ENCODING);
    }

    public static KeysetInfo write(Keyset keyset) {
        markLookaheadLayoutPendingui marklookaheadlayoutpendinguiSerializer = KeysetInfo.serializer();
        marklookaheadlayoutpendinguiSerializer.IconCompatParcelizer(keyset.serializer());
        for (Keyset.Key key : keyset.RemoteActionCompatParcelizer()) {
            moveui moveuiVarWrite = KeysetInfo.KeyInfo.write();
            moveuiVarWrite.RemoteActionCompatParcelizer(key.RemoteActionCompatParcelizer().RatingCompat());
            moveuiVarWrite.write(key.MediaDescriptionCompat());
            moveuiVarWrite.serializer(key.MediaMetadataCompat());
            moveuiVarWrite.IconCompatParcelizer(key.serializer());
            marklookaheadlayoutpendinguiSerializer.IconCompatParcelizer((KeysetInfo.KeyInfo) moveuiVarWrite.MediaBrowserCompatMediaItem());
        }
        return (KeysetInfo) marklookaheadlayoutpendinguiSerializer.MediaBrowserCompatMediaItem();
    }
}
