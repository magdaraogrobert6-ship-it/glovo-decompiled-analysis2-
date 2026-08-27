package o;

import com.roadrunner.helpcenter.floating.lifecycle.HomeHelpCenterLifecycleObserverImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getArguments extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ HomeHelpCenterLifecycleObserverImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getArguments(HomeHelpCenterLifecycleObserverImpl homeHelpCenterLifecycleObserverImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = homeHelpCenterLifecycleObserverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletonsAccess$observerHelpCenterNavigation = HomeHelpCenterLifecycleObserverImpl.access$observerHelpCenterNavigation(this.write, this);
        int i4 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return coroutineSingletonsAccess$observerHelpCenterNavigation;
    }
}
