package o;

import io.grpc.internal.CallTracer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class clearOldPosition extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public String IconCompatParcelizer;
    public final /* synthetic */ CallTracer RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clearOldPosition(CallTracer callTracer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = callTracer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objMatchIsoCodeToCountryCode = this.RemoteActionCompatParcelizer.matchIsoCodeToCountryCode(null, this);
        int i4 = read + 53;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objMatchIsoCodeToCountryCode;
        }
        obj2.hashCode();
        throw null;
    }
}
