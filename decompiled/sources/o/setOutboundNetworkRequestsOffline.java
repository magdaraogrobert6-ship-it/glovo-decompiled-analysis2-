package o;

import com.sentiance.okhttp3.internal.http2.e$h;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setOutboundNetworkRequestsOffline extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ e$h write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOutboundNetworkRequestsOffline(e$h e_h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = e_h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objStart = this.write.start(this);
        int i4 = IconCompatParcelizer + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objStart;
    }
}
