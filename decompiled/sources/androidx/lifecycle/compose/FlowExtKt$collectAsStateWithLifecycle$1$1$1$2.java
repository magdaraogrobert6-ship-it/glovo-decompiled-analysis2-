package androidx.lifecycle.compose;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getPathEffect;
import o.notifyContentCaptureChanges;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ notifyContentCaptureChanges serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(Flow flow, notifyContentCaptureChanges notifycontentcapturechanges, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = flow;
        this.serializer = notifycontentcapturechanges;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((FlowExtKt$collectAsStateWithLifecycle$1$1$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((FlowExtKt$collectAsStateWithLifecycle$1$1$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        notifyContentCaptureChanges notifycontentcapturechanges = this.serializer;
        Flow flow = this.IconCompatParcelizer;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getPathEffect getpatheffect = new getPathEffect(notifycontentcapturechanges, 2);
                this.write = 1;
                return flow.collect(getpatheffect, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getPathEffect getpatheffect2 = new getPathEffect(notifycontentcapturechanges, 0);
            this.write = 1;
            return flow.collect(getpatheffect2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(this.IconCompatParcelizer, this.serializer, shortNewsContentCardView, 1);
        }
        return new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(this.IconCompatParcelizer, this.serializer, shortNewsContentCardView, 0);
    }
}
