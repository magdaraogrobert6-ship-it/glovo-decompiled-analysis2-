package com.roadrunner.appreview;

import android.content.Intent;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.work.CoroutineWorker$startWork$1;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.enclosingTransactionruntime;
import o.getActionViewIntentlambda0;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.pasteTextdefault;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AppReviewLifecycleObserverImpl implements DefaultLifecycleObserver {
    private static int RatingCompat = 1;
    private static int write;
    public final MainActivity IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 2;
    public final Object read;
    public final Object serializer;

    public AppReviewLifecycleObserverImpl(MainActivity mainActivity, RouterLogger routerLogger) {
        routerLogger.getClass();
        this.IconCompatParcelizer = mainActivity;
        this.read = routerLogger;
        this.serializer = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, null, 6);
    }

    public AppReviewLifecycleObserverImpl(SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, enclosingTransactionruntime enclosingtransactionruntime, MainActivity mainActivity) {
        semanticsPropertiesContentDescription1.getClass();
        enclosingtransactionruntime.getClass();
        this.read = semanticsPropertiesContentDescription1;
        this.serializer = enclosingtransactionruntime;
        this.IconCompatParcelizer = mainActivity;
    }

    public AppReviewLifecycleObserverImpl(GetRiderStatusImpl getRiderStatusImpl, N$b n$b, MainActivity mainActivity) {
        this.read = getRiderStatusImpl;
        this.serializer = n$b;
        this.IconCompatParcelizer = mainActivity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = write + 87;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        accessisrendernodecompatiblecp.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            super.onCreate(accessisrendernodecompatiblecp);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new RealImageLoader$execute$2$job$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 23), 3);
        } else {
            if (i4 != 1) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new AsyncImagePainter$launchJob$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 27), 3);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new ShiftZoneMapLayerUiModelImpl$1(this, shortNewsContentCardView, 7), 3);
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new CoroutineWorker$startWork$1(this, shortNewsContentCardView, 12), 3);
            int i5 = RatingCompat + 61;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$goToRouterActivityIfUserIsNotSignedIn(AppReviewLifecycleObserverImpl appReviewLifecycleObserverImpl, ContinuationImpl continuationImpl) throws Exception {
        pasteTextdefault pastetextdefault;
        int i = 2 % 2;
        MainActivity mainActivity = appReviewLifecycleObserverImpl.IconCompatParcelizer;
        if (continuationImpl instanceof pasteTextdefault) {
            pastetextdefault = (pasteTextdefault) continuationImpl;
            int i2 = pastetextdefault.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pastetextdefault.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                pastetextdefault = new pasteTextdefault(appReviewLifecycleObserverImpl, continuationImpl);
                int i3 = write + 11;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            pastetextdefault = new pasteTextdefault(appReviewLifecycleObserverImpl, continuationImpl);
            int i5 = write + 11;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Object objInvoke = pastetextdefault.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = pastetextdefault.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1 = (SemanticsPropertiesContentDescription1) appReviewLifecycleObserverImpl.read;
            pastetextdefault.IconCompatParcelizer = 1;
            objInvoke = ((IsUserSignedInImpl) semanticsPropertiesContentDescription1).invoke(pastetextdefault);
            if (objInvoke == coroutineSingletons) {
                int i8 = write + 55;
                RatingCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = write + 65;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("User is not authenticated, navigating to router activity from main", new Object[0]);
            ((getActionViewIntentlambda0) ((enclosingTransactionruntime) appReviewLifecycleObserverImpl.serializer)).getClass();
            invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2 invokesuspendcomroadrunnercustomerchatselfservicedataimageimagecacheresolverimplcacheimagefile2 = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(28);
            Intent intent = new Intent(mainActivity, (Class<?>) RouterActivity.class);
            invokesuspendcomroadrunnercustomerchatselfservicedataimageimagecacheresolverimplcacheimagefile2.invoke(intent);
            mainActivity.startActivityForResult(intent, -1, null);
            mainActivity.finish();
        }
        return createFromParcel.INSTANCE;
    }
}
