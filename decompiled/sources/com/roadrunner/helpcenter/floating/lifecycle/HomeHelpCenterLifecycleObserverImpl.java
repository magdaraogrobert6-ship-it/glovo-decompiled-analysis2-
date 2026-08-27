package com.roadrunner.helpcenter.floating.lifecycle;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.DrawableTransformation;
import o.FragmentManager8;
import o.accessisRenderNodeCompatiblecp;
import o.getArguments;
import o.getEnterTransitionCallback;
import o.getFocusedView;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeHelpCenterLifecycleObserverImpl implements FragmentManager8 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final getEnterTransitionCallback RemoteActionCompatParcelizer;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 read;
    public final getFocusedView serializer;

    public HomeHelpCenterLifecycleObserverImpl(getFocusedView getfocusedview, getEnterTransitionCallback getentertransitioncallback, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        getfocusedview.getClass();
        getentertransitioncallback.getClass();
        this.serializer = getfocusedview;
        this.RemoteActionCompatParcelizer = getentertransitioncallback;
        this.read = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 20), 3);
        int i2 = write + 77;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public static final CoroutineSingletons access$observerHelpCenterNavigation(HomeHelpCenterLifecycleObserverImpl homeHelpCenterLifecycleObserverImpl, ContinuationImpl continuationImpl) {
        getArguments getarguments;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 45;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = null;
        if (!(continuationImpl instanceof getArguments)) {
            getarguments = new getArguments(homeHelpCenterLifecycleObserverImpl, continuationImpl);
        } else {
            int i5 = i2 + 125;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((getArguments) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            getarguments = (getArguments) continuationImpl;
            int i7 = getarguments.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                getarguments.read = i7 - Integer.MIN_VALUE;
            } else {
                getarguments = new getArguments(homeHelpCenterLifecycleObserverImpl, continuationImpl);
            }
        }
        Object obj2 = getarguments.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getarguments.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            SharedFlowImpl sharedFlowImpl = homeHelpCenterLifecycleObserverImpl.serializer.write;
            SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(28, homeHelpCenterLifecycleObserverImpl);
            getarguments.read = 1;
            sharedFlowImpl.getClass();
            if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, anonymousClass2, getarguments) == coroutineSingletons) {
                int i9 = write + 75;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        DrawableTransformation.read();
        return null;
    }
}
