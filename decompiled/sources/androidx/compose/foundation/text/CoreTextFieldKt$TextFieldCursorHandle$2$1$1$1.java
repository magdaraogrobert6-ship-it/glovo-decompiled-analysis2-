package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.input.pointer.PointerInputScope;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.AlignmentHorizontal;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBottomStart;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ AlignmentHorizontal IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ PointerInputScope serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(PointerInputScope pointerInputScope, AlignmentHorizontal alignmentHorizontal, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = pointerInputScope;
        this.IconCompatParcelizer = alignmentHorizontal;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        PointerInputScope pointerInputScope = this.serializer;
        final AlignmentHorizontal alignmentHorizontal = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        final int i2 = 1;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.write = 1;
            Object objCoroutineScope = YieldKt.coroutineScope(new SignInDataStore$set$2(pointerInputScope, alignmentHorizontal, shortNewsContentCardView, i2), this);
            if (objCoroutineScope != coroutineSingletons) {
                objCoroutineScope = createfromparcel;
            }
            return objCoroutineScope == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        int i4 = 3;
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.write;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.write = 1;
            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new ForEachGestureKt.C00342(alignmentHorizontal, null, 3), this);
            if (objAwaitEachGesture != coroutineSingletons2) {
                objAwaitEachGesture = createfromparcel;
            }
            return objAwaitEachGesture == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        if (i6 != 0) {
            if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.write = 1;
        final int i7 = 0;
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(this.serializer, new getBottomStart(alignmentHorizontal, 0), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getCenterVertically
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i8 = i7;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                AlignmentHorizontal alignmentHorizontal2 = alignmentHorizontal;
                if (i8 != 0) {
                    alignmentHorizontal2.serializer();
                    return createfromparcel2;
                }
                alignmentHorizontal2.IconCompatParcelizer();
                return createfromparcel2;
            }
        }, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.getCenterVertically
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i8 = i2;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                AlignmentHorizontal alignmentHorizontal2 = alignmentHorizontal;
                if (i8 != 0) {
                    alignmentHorizontal2.serializer();
                    return createfromparcel2;
                }
                alignmentHorizontal2.IconCompatParcelizer();
                return createfromparcel2;
            }
        }, new GapComposer$$ExternalSyntheticLambda3(i4, alignmentHorizontal), this);
        if (objDetectDragGestures != coroutineSingletons3) {
            objDetectDragGestures = createfromparcel;
        }
        return objDetectDragGestures == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        if (i == 0) {
            return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, 2);
        }
        return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, i2);
    }
}
