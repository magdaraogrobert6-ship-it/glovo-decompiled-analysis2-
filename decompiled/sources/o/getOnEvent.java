package o;

import com.foodora.courier.push.tokenregistery.worker.PushTokenUpdateWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnEvent extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int write;
    public int IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ PushTokenUpdateWorker serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOnEvent(PushTokenUpdateWorker pushTokenUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = pushTokenUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$registerPushToken;
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$registerPushToken = PushTokenUpdateWorker.access$registerPushToken(this.serializer, null, this);
            int i3 = 64 / 0;
        } else {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$registerPushToken = PushTokenUpdateWorker.access$registerPushToken(this.serializer, null, this);
        }
        int i4 = RatingCompat + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$registerPushToken;
        }
        obj2.hashCode();
        throw null;
    }
}
