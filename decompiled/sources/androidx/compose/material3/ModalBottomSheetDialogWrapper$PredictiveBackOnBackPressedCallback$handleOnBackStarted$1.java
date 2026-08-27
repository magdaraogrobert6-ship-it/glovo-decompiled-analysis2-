package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AutofillApi26Helper;
import o.ShortNewsContentCardView;
import o.ZIndexModifierKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ ZIndexModifierKt RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;
    public final /* synthetic */ r8lambda54BeH8ZsBru0CXI2CCSP2syNys write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(ZIndexModifierKt zIndexModifierKt, r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = zIndexModifierKt;
        this.write = r8lambda54beh8zsbru0cxi2ccsp2synys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = this.write;
        ZIndexModifierKt zIndexModifierKt = this.RemoteActionCompatParcelizer;
        return i != 0 ? new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(zIndexModifierKt, r8lambda54beh8zsbru0cxi2ccsp2synys, shortNewsContentCardView, 1) : new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(zIndexModifierKt, r8lambda54beh8zsbru0cxi2ccsp2synys, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = this.write;
        ZIndexModifierKt zIndexModifierKt = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.serializer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Animatable animatable = zIndexModifierKt.serializer;
            Float f = new Float(AutofillApi26Helper.RemoteActionCompatParcelizer.transform(r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer));
            this.serializer = 1;
            return animatable.snapTo(f, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.serializer;
        if (i3 != 0) {
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Animatable animatable2 = zIndexModifierKt.serializer;
        Float f2 = new Float(AutofillApi26Helper.RemoteActionCompatParcelizer.transform(r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer));
        this.serializer = 1;
        return animatable2.snapTo(f2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
