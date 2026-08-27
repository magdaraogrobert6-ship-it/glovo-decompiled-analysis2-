package androidx.compose.material3.pulltorefresh;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getOnFill;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PullToRefreshModifierNode$update$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ PullToRefreshModifierNode read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PullToRefreshModifierNode$update$1(PullToRefreshModifierNode pullToRefreshModifierNode, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        PullToRefreshModifierNode pullToRefreshModifierNode = this.read;
        if (i != 0) {
            return i != 1 ? new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, shortNewsContentCardView, 2) : new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, shortNewsContentCardView, 1);
        }
        return new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((PullToRefreshModifierNode$update$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((PullToRefreshModifierNode$update$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((PullToRefreshModifierNode$update$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        PullToRefreshModifierNode pullToRefreshModifierNode = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (pullToRefreshModifierNode.read) {
                this.RemoteActionCompatParcelizer = 2;
                if (PullToRefreshModifierNode.access$animateToThreshold(pullToRefreshModifierNode, this) != coroutineSingletons) {
                    return createfromparcel;
                }
            } else {
                this.RemoteActionCompatParcelizer = 1;
                if (pullToRefreshModifierNode.animateToHidden(this) != coroutineSingletons) {
                    return createfromparcel;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getOnFill getonfill = pullToRefreshModifierNode.RatingCompat;
            float f = pullToRefreshModifierNode.read ? 1.0f : 0.0f;
            this.RemoteActionCompatParcelizer = 1;
            Object objSnapTo = getonfill.write.snapTo(new Float(f), this);
            if (objSnapTo != coroutineSingletons2) {
                objSnapTo = createfromparcel;
            }
            return objSnapTo == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (pullToRefreshModifierNode.RatingCompat.write.IconCompatParcelizer()) {
            return createfromparcel;
        }
        getOnFill getonfill2 = pullToRefreshModifierNode.RatingCompat;
        float fSerializer = ((getContentCaptureSessionui) pullToRefreshModifierNode.MediaMetadataCompat).serializer() / pullToRefreshModifierNode.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = 1;
        Object objSnapTo2 = getonfill2.write.snapTo(new Float(fSerializer), this);
        if (objSnapTo2 != coroutineSingletons3) {
            objSnapTo2 = createfromparcel;
        }
        return objSnapTo2 == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
    }
}
