package androidx.compose.material3;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SheetState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(SheetState sheetState, float f, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = sheetState;
        this.IconCompatParcelizer = f;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        float f = this.IconCompatParcelizer;
        SheetState sheetState = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object obj2 = sheetState.IconCompatParcelizer.settle(f, this);
            if (obj2 != coroutineSingletons) {
                obj2 = createfromparcel;
            }
            return obj2 == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
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
        this.RemoteActionCompatParcelizer = 1;
        Object obj3 = sheetState.IconCompatParcelizer.settle(f, this);
        if (obj3 != coroutineSingletons2) {
            obj3 = createfromparcel;
        }
        return obj3 == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.serializer != 0) {
            return new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 1);
        }
        return new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 0);
    }
}
