package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.internal.http2.e$h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.InlineChildren;
import o.PlatformSelectionBehaviorsImpl;
import o.ShortNewsContentCardView;
import o.UpdaterExternalSyntheticLambda1;
import o.constructorimpl;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class PagerWrapperFlingBehavior implements constructorimpl {
    public final SnapFlingBehavior IconCompatParcelizer;
    public final PagerState RemoteActionCompatParcelizer;

    public PagerWrapperFlingBehavior(SnapFlingBehavior snapFlingBehavior, PagerState pagerState) {
        this.IconCompatParcelizer = snapFlingBehavior;
        this.RemoteActionCompatParcelizer = pagerState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.constructorimpl
    public final Object performFling(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        UpdaterExternalSyntheticLambda1 updaterExternalSyntheticLambda1;
        if (shortNewsContentCardView instanceof UpdaterExternalSyntheticLambda1) {
            updaterExternalSyntheticLambda1 = (UpdaterExternalSyntheticLambda1) shortNewsContentCardView;
            int i = updaterExternalSyntheticLambda1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                updaterExternalSyntheticLambda1.serializer = i - Integer.MIN_VALUE;
            } else {
                updaterExternalSyntheticLambda1 = new UpdaterExternalSyntheticLambda1(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            updaterExternalSyntheticLambda1 = new UpdaterExternalSyntheticLambda1(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objPerformFling = updaterExternalSyntheticLambda1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updaterExternalSyntheticLambda1.serializer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerformFling);
            InlineChildren inlineChildren = new InlineChildren(this, 12, platformSelectionBehaviorsImpl);
            updaterExternalSyntheticLambda1.serializer = 1;
            objPerformFling = this.IconCompatParcelizer.performFling(platformSelectionBehaviorsImpl, f, inlineChildren, updaterExternalSyntheticLambda1);
            if (objPerformFling == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerformFling);
        }
        float fFloatValue = ((Number) objPerformFling).floatValue();
        PagerState pagerState = this.RemoteActionCompatParcelizer;
        e$h e_h = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        e$h e_h2 = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (e_h.IconCompatParcelizer() != 0.0f && Math.abs(e_h2.IconCompatParcelizer()) < 0.001d) {
            int iRemoteActionCompatParcelizer = e_h2.RemoteActionCompatParcelizer();
            int i3 = 0;
            if (pagerState._init_lambda2.IconCompatParcelizer()) {
                BuildersKt.RemoteActionCompatParcelizer(((PagerMeasureResult) ((onShowTranslationui) pagerState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getValue()).read, null, null, new PagerState$requestScrollToPage$1(i3, pagerState, shortNewsContentCardView2), 3);
            }
            pagerState.RemoteActionCompatParcelizer(0.0f, iRemoteActionCompatParcelizer, false);
        } else {
            new Float(e_h2.IconCompatParcelizer());
        }
        return new Float(fFloatValue);
    }
}
