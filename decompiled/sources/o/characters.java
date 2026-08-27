package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class characters extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ProtobufEncoder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public characters(ProtobufEncoder protobufEncoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = protobufEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$getSendEventsUrl = ProtobufEncoder.access$getSendEventsUrl(this.write, this);
        int i4 = RemoteActionCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$getSendEventsUrl;
        }
        throw null;
    }
}
