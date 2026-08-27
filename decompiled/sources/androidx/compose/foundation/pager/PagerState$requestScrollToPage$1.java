package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PagerState$requestScrollToPage$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ PagerState serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState$requestScrollToPage$1(int i, PagerState pagerState, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = pagerState;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((PagerState$requestScrollToPage$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((PagerState$requestScrollToPage$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((PagerState$requestScrollToPage$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAnimateScrollToPage;
        Object objAnimateScrollToPage2;
        int i = this.RemoteActionCompatParcelizer;
        PagerState pagerState = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.read;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = 1;
            applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
            ScrollExtensionsKt$stopScroll$2 scrollExtensionsKt$stopScroll$2 = new ScrollExtensionsKt$stopScroll$2(2, 0, shortNewsContentCardView);
            pagerState.getClass();
            Object objScroll$suspendImpl = PagerState.scroll$suspendImpl(pagerState, applymeasureresultfoundation, scrollExtensionsKt$stopScroll$2, this);
            if (objScroll$suspendImpl != coroutineSingletons) {
                objScroll$suspendImpl = createfromparcel;
            }
            return objScroll$suspendImpl == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = 1;
            float f = PagerStateKt.serializer;
            if (pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() + 1 >= pagerState.read() || (objAnimateScrollToPage2 = pagerState.animateScrollToPage(pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() + 1, DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null), this)) != coroutineSingletons2) {
                objAnimateScrollToPage2 = createfromparcel;
            }
            return objAnimateScrollToPage2 == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.read;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.read = 1;
        float f2 = PagerStateKt.serializer;
        if (pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() - 1 < 0 || (objAnimateScrollToPage = pagerState.animateScrollToPage(pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() - 1, DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null), this)) != coroutineSingletons3) {
            objAnimateScrollToPage = createfromparcel;
        }
        return objAnimateScrollToPage == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new PagerState$requestScrollToPage$1(0, this.serializer, shortNewsContentCardView);
        }
        int i2 = 1;
        if (i == 1) {
            return new PagerState$requestScrollToPage$1(i2, this.serializer, shortNewsContentCardView);
        }
        return new PagerState$requestScrollToPage$1(2, this.serializer, shortNewsContentCardView);
    }
}
