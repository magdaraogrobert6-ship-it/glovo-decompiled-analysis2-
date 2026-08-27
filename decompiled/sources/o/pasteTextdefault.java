package o;

import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pasteTextdefault extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ AppReviewLifecycleObserverImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pasteTextdefault(AppReviewLifecycleObserverImpl appReviewLifecycleObserverImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = appReviewLifecycleObserverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$goToRouterActivityIfUserIsNotSignedIn = AppReviewLifecycleObserverImpl.access$goToRouterActivityIfUserIsNotSignedIn(this.read, this);
        int i4 = RemoteActionCompatParcelizer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$goToRouterActivityIfUserIsNotSignedIn;
    }
}
