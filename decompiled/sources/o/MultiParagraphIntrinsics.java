package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiParagraphIntrinsics extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public long IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ InitializeAppStartupItemsImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = initializeAppStartupItemsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = MediaDescriptionCompat + 91;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
