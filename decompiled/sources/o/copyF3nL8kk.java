package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copyF3nL8kk extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public accesslayoutAccordingTo IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ InitializeAppStartupItemsImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyF3nL8kk(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = initializeAppStartupItemsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objInvoke = this.serializer.invoke(null, this);
        int i4 = RemoteActionCompatParcelizer + 59;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        obj2.hashCode();
        throw null;
    }
}
