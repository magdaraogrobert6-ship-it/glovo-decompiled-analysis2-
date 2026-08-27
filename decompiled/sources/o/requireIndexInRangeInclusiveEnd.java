package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class requireIndexInRangeInclusiveEnd extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ProtobufEncoder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requireIndexInRangeInclusiveEnd(ProtobufEncoder protobufEncoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = protobufEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(null, this);
        int i4 = IconCompatParcelizer + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
