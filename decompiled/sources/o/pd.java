package o;

import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pd extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public long read;
    public final /* synthetic */ H$b serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object orRecordStartTime = this.serializer.getOrRecordStartTime(0L, this);
        int i4 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return orRecordStartTime;
    }
}
