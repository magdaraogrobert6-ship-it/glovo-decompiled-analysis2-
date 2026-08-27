package o;

import com.roadrunner.delivery.accept.acknowledgment.implementation.data.TimestampRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getParagraphStyleSaver extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ TimestampRepositoryImpl serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getParagraphStyleSaver(TimestampRepositoryImpl timestampRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = timestampRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TimestampRepositoryImpl timestampRepositoryImpl;
        long j;
        int i = 2 % 2;
        int i2 = read + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            timestampRepositoryImpl = this.serializer;
            j = 1;
        } else {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            timestampRepositoryImpl = this.serializer;
            j = 0;
        }
        return timestampRepositoryImpl.contains(j, this);
    }
}
