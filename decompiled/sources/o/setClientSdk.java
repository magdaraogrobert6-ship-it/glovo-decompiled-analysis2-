package o;

import com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setClientSdk extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA IconCompatParcelizer;
    public int read;
    public final /* synthetic */ SubmitSafetyLogEventWorker serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setClientSdk(SubmitSafetyLogEventWorker submitSafetyLogEventWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = submitSafetyLogEventWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objDoWork = this.serializer.doWork(this);
        int i4 = MediaDescriptionCompat + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objDoWork;
    }
}
