package o;

import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectInputFilterStream extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public ShiftInfoDao IconCompatParcelizer;
    public final /* synthetic */ ShiftInfoDao RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public OnEventTrackingSucceededListener serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectInputFilterStream(ShiftInfoDao shiftInfoDao, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = shiftInfoDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objClearAndInsert$suspendImpl = ShiftInfoDao.clearAndInsert$suspendImpl(this.RemoteActionCompatParcelizer, null, this);
        int i4 = MediaDescriptionCompat + 17;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return objClearAndInsert$suspendImpl;
    }
}
