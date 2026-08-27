package o;

import io.sentry.CombinedScopeView;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdatZvvlfpdQ851eBNGFxdZdLW0Ok4 extends r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ {
    public final CombinedScopeView IconCompatParcelizer;
    public final r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ MediaBrowserCompatMediaItem;
    public final CombinedScopeView MediaMetadataCompat;
    public final CombinedScopeView MediaSessionCompatQueueItem;
    public final CombinedScopeView RatingCompat;

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ read() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.RatingCompat.RemoteActionCompatParcelizer(sSLSocket, Boolean.TRUE);
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        CombinedScopeView combinedScopeView = this.MediaMetadataCompat;
        if (combinedScopeView.write(cls) != null) {
            combinedScopeView.serializer(sSLSocket, r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ.serializer(list));
        }
    }

    public r8lambdatZvvlfpdQ851eBNGFxdZdLW0Ok4(CombinedScopeView combinedScopeView, CombinedScopeView combinedScopeView2, CombinedScopeView combinedScopeView3, CombinedScopeView combinedScopeView4, java.security.Provider provider, r8lambdarWrPEbYO0j4e9aYRQgAXb5UGFQ r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq) {
        super(provider);
        this.RatingCompat = combinedScopeView;
        this.MediaSessionCompatQueueItem = combinedScopeView2;
        this.IconCompatParcelizer = combinedScopeView3;
        this.MediaMetadataCompat = combinedScopeView4;
        this.MediaBrowserCompatMediaItem = r8lambdarwrpebyo0j4e9ayrqgaxb5ugfq;
    }

    @Override // o.r8lambdac_htDlZEUdQULPnwj5kgeSH7eQ
    public final String read(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        CombinedScopeView combinedScopeView = this.IconCompatParcelizer;
        if (combinedScopeView.write(cls) == null || (bArr = (byte[]) combinedScopeView.serializer(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.serializer);
    }
}
