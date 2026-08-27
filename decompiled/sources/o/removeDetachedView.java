package o;

import com.roadrunner.inappnotifications.data.FetchInAppMessageWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class removeDetachedView extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ FetchInAppMessageWorker read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeDetachedView(FetchInAppMessageWorker fetchInAppMessageWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = fetchInAppMessageWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.doWork(this);
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 56 / 0;
        return this.read.doWork(this);
    }
}
