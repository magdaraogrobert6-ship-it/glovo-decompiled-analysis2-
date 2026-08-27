package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreakStrictness extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public safeSetClipToOutline IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public safeSetClipToOutline read;
    public final /* synthetic */ ProtobufEncoder serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineBreakStrictness(ProtobufEncoder protobufEncoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = protobufEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 115;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Serializable serializableInvoke = this.serializer.invoke(this);
        int i4 = RatingCompat + 85;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return serializableInvoke;
        }
        throw null;
    }
}
