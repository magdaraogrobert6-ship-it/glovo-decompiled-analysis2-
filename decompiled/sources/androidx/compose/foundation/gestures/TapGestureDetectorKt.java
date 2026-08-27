package androidx.compose.foundation.gestures;

import androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import o.AndroidSelectionHandles_androidKt;
import o.ShortNewsContentCardView;
import o.TextAnnotatedStringElement;
import o.TextAnnotatedStringNode;
import o.TextFieldSelectionManager;
import o.TextStringSimpleElement;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.jumpByPagesOffset;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TapGestureDetectorKt {
    public static final DraggableKt$NoOpOnDragStarted$1 RemoteActionCompatParcelizer = new DraggableKt$NoOpOnDragStarted$1(3, 2, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ PointerInputChange serializer;
        public final /* synthetic */ PressGestureScopeImpl write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            this.write = pressGestureScopeImpl;
            this.serializer = pointerInputChange;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            PointerInputChange pointerInputChange = this.serializer;
            PressGestureScopeImpl pressGestureScopeImpl = this.write;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.IconCompatParcelizer;
            if (i != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.read;
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Offset offsetM466boximpl = Offset.m466boximpl(pointerInputChange.m2071getPositionF1C5BW0());
                    this.read = 1;
                    return r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(pressGestureScopeImpl, offsetM466boximpl, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Offset offsetM466boximpl2 = Offset.m466boximpl(pointerInputChange.m2071getPositionF1C5BW0());
                this.read = 1;
                return r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(pressGestureScopeImpl, offsetM466boximpl2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
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
                return new AnonymousClass2(this.IconCompatParcelizer, this.write, this.serializer, shortNewsContentCardView, 1);
            }
            return new AnonymousClass2(this.IconCompatParcelizer, this.write, this.serializer, shortNewsContentCardView, 0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ PressGestureScopeImpl serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.serializer = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.write;
            PressGestureScopeImpl pressGestureScopeImpl = this.serializer;
            switch (i) {
                case 0:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 0);
                case 1:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 1);
                case 2:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 2);
                case 3:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 3);
                case 4:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 6);
                default:
                    return new AnonymousClass3(pressGestureScopeImpl, shortNewsContentCardView, 7);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            switch (i) {
                case 0:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 1:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 2:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 3:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 4:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 5:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                case 6:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
                default:
                    ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    break;
            }
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            PressGestureScopeImpl pressGestureScopeImpl = this.serializer;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.RemoteActionCompatParcelizer();
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.IconCompatParcelizer();
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.RemoteActionCompatParcelizer();
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.IconCompatParcelizer();
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.RemoteActionCompatParcelizer();
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.RemoteActionCompatParcelizer();
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.IconCompatParcelizer();
                    break;
                default:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pressGestureScopeImpl.RemoteActionCompatParcelizer();
                    break;
            }
            return createfromparcel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df A[LOOP:1: B:23:0x0073->B:44:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b9 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.ui.input.pointer.PointerEventPass r19, kotlin.coroutines.jvm.internal.BaseContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static Object detectTapGestures$default(PointerInputScope pointerInputScope, AnchoredDraggableState$draggableState$1$drag$2 anchoredDraggableState$draggableState$1$drag$2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView, int i) {
        Object obj = anchoredDraggableState$draggableState$1$drag$2;
        if ((i & 4) != 0) {
            obj = RemoteActionCompatParcelizer;
        }
        Object obj2 = obj;
        if ((i & 8) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        Object objCoroutineScope = YieldKt.coroutineScope(new NavHostKt$NavHost$29$1(pointerInputScope, obj2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 3), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0408  */
    /* JADX WARN: Code duplicated, block: B:102:0x0413  */
    /* JADX WARN: Code duplicated, block: B:104:0x041f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0424  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x01da  */
    /* JADX WARN: Code duplicated, block: B:33:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0208  */
    /* JADX WARN: Code duplicated, block: B:39:0x023d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0265  */
    /* JADX WARN: Code duplicated, block: B:45:0x0271  */
    /* JADX WARN: Code duplicated, block: B:47:0x0275  */
    /* JADX WARN: Code duplicated, block: B:48:0x027a  */
    /* JADX WARN: Code duplicated, block: B:50:0x027e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0287  */
    /* JADX WARN: Code duplicated, block: B:54:0x0292  */
    /* JADX WARN: Code duplicated, block: B:56:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0312  */
    /* JADX WARN: Code duplicated, block: B:73:0x0328  */
    /* JADX WARN: Code duplicated, block: B:76:0x034c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0355  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0378  */
    /* JADX WARN: Code duplicated, block: B:84:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x03da  */
    /* JADX WARN: Code duplicated, block: B:92:0x03de  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:95:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f0  */
    public static final Object processTapGesture(AwaitPointerEventScope awaitPointerEventScope, getContentViewGroupParentLayout getcontentviewgroupparentlayout, PressGestureScopeImpl pressGestureScopeImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, BaseContinuationImpl baseContinuationImpl) {
        TextFieldSelectionManager textFieldSelectionManager;
        PressGestureScopeImpl pressGestureScopeImpl2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        int i;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        AwaitPointerEventScope awaitPointerEventScope2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        PointerInputChange pointerInputChange;
        createFromParcel createfromparcel;
        AndroidSelectionHandles_androidKt androidSelectionHandles_androidKt;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
        Object objWaitForLongPress;
        PressGestureScopeImpl pressGestureScopeImpl3;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerInputChange pointerInputChange2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout3;
        PressGestureScopeImpl pressGestureScopeImpl4;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
        PointerInputChange pointerInputChange3;
        AndroidSelectionHandles_androidKt androidSelectionHandles_androidKt2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        Object objWithTimeoutOrNull;
        PointerInputChange pointerInputChange4;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
        AwaitPointerEventScope awaitPointerEventScope4;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
        TextAnnotatedStringElement textAnnotatedStringElement;
        PressGestureScopeImpl pressGestureScopeImpl5;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout4;
        PointerInputChange pointerInputChange5;
        AndroidSelectionHandles_androidKt androidSelectionHandles_androidKt3;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons;
        Object objWaitForLongPress2;
        PressGestureScopeImpl pressGestureScopeImpl6;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout5;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm13;
        PointerInputChange pointerInputChange6;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm14;
        PressGestureScopeImpl pressGestureScopeImpl7;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout6;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm15;
        PointerInputChange pointerInputChange7;
        TextAnnotatedStringElement textAnnotatedStringElement2;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout7;
        PressGestureScopeImpl pressGestureScopeImpl8;
        if (baseContinuationImpl instanceof TextFieldSelectionManager) {
            textFieldSelectionManager = (TextFieldSelectionManager) baseContinuationImpl;
            int i2 = textFieldSelectionManager.MediaSessionCompatQueueItem;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager.MediaSessionCompatQueueItem = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionManager = new TextFieldSelectionManager(baseContinuationImpl);
            }
        } else {
            textFieldSelectionManager = new TextFieldSelectionManager(baseContinuationImpl);
        }
        Object objWaitForUpOrCancellation = textFieldSelectionManager.MediaSessionCompatToken;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = textFieldSelectionManager.MediaSessionCompatQueueItem;
        AndroidSelectionHandles_androidKt androidSelectionHandles_androidKt4 = AndroidSelectionHandles_androidKt.serializer;
        DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i3) {
            case 0:
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope;
                textFieldSelectionManager.serializer = getcontentviewgroupparentlayout;
                pressGestureScopeImpl2 = pressGestureScopeImpl;
                textFieldSelectionManager.read = pressGestureScopeImpl2;
                textFieldSelectionManager.IconCompatParcelizer = null;
                textFieldSelectionManager.write = null;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                i = 1;
                textFieldSelectionManager.MediaSessionCompatQueueItem = 1;
                Object objIconCompatParcelizer = IconCompatParcelizer(awaitPointerEventScope, null, textFieldSelectionManager, 3);
                if (objIconCompatParcelizer != coroutineSingletons2) {
                    getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                    objWaitForUpOrCancellation = objIconCompatParcelizer;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = null;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = null;
                    pointerInputChange = (PointerInputChange) objWaitForUpOrCancellation;
                    pointerInputChange.consume();
                    createfromparcel = createfromparcel2;
                    androidSelectionHandles_androidKt = androidSelectionHandles_androidKt4;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, shortNewsContentCardView, 0), i);
                    if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                        serializer(getcontentviewgroupparentlayout2, r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl2, pointerInputChange, null, 0));
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm4 == null) {
                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout2;
                        textFieldSelectionManager.read = pressGestureScopeImpl2;
                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                        textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        textFieldSelectionManager.MediaMetadataCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                        textFieldSelectionManager.MediaSessionCompatQueueItem = 2;
                        objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope2, PointerEventPass.Main, textFieldSelectionManager);
                        if (objWaitForUpOrCancellation != coroutineSingletons2) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                            getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                            pressGestureScopeImpl4 = pressGestureScopeImpl2;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                            pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                            androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                            if (pointerInputChange3 == null) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                            } else {
                                pointerInputChange3.consume();
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                            }
                            if (pointerInputChange3 != null) {
                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                    textFieldSelectionManager.read = pressGestureScopeImpl4;
                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                                    textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                    textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                                    textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                    objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                                    if (objWithTimeoutOrNull != coroutineSingletons2) {
                                        pointerInputChange4 = pointerInputChange3;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                        awaitPointerEventScope4 = awaitPointerEventScope3;
                                        objWaitForUpOrCancellation = objWithTimeoutOrNull;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                        setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                                        pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                                        if (pointerInputChange5 != null) {
                                            androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                            setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                            if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                                serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                            }
                                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                                textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                                textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                                textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                                textFieldSelectionManager.RatingCompat = null;
                                                textFieldSelectionManager.MediaMetadataCompat = null;
                                                textFieldSelectionManager.MediaDescriptionCompat = null;
                                                textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                                objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                                pointerInputChange6 = pointerInputChange4;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                                getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                                if (pointerInputChange7 != null) {
                                                    pointerInputChange7.consume();
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                            } else {
                                                coroutineSingletons = coroutineSingletons2;
                                                textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                                textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                                textFieldSelectionManager.read = pressGestureScopeImpl4;
                                                textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                                textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                                textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                                objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                if (objWaitForLongPress2 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                                getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                                    textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                                    textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    textFieldSelectionManager.IconCompatParcelizer = null;
                                                    textFieldSelectionManager.write = null;
                                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                                    textFieldSelectionManager.RatingCompat = null;
                                                    textFieldSelectionManager.MediaMetadataCompat = null;
                                                    textFieldSelectionManager.MediaDescriptionCompat = null;
                                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                                    if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                                    pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                                    serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                                    return createfromparcel;
                                                }
                                                if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                                    pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                                } else {
                                                    if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                        return null;
                                                    }
                                                    pointerInputChange7 = null;
                                                }
                                                pointerInputChange6 = pointerInputChange4;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                                if (pointerInputChange7 != null) {
                                                    pointerInputChange7.consume();
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                            }
                                        } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                    }
                                } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                                    return createfromparcel;
                                }
                            }
                            return createfromparcel;
                        }
                    } else {
                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout2;
                        textFieldSelectionManager.read = pressGestureScopeImpl2;
                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                        textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        textFieldSelectionManager.MediaMetadataCompat = pointerInputChange;
                        textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                        textFieldSelectionManager.MediaSessionCompatQueueItem = 3;
                        objWaitForLongPress = waitForLongPress(awaitPointerEventScope2, PointerEventPass.Main, textFieldSelectionManager);
                        if (objWaitForLongPress != coroutineSingletons2) {
                            pressGestureScopeImpl3 = pressGestureScopeImpl2;
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            pointerInputChange2 = pointerInputChange;
                            objWaitForUpOrCancellation = objWaitForLongPress;
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                            textAnnotatedStringElement = (TextAnnotatedStringElement) objWaitForUpOrCancellation;
                            androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement, androidSelectionHandles_androidKt2}, getCieXyz.write())).booleanValue()) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(Offset.m466boximpl(pointerInputChange2.m2071getPositionF1C5BW0()));
                                textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout2;
                                textFieldSelectionManager.serializer = pressGestureScopeImpl3;
                                textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
                                textFieldSelectionManager.IconCompatParcelizer = null;
                                textFieldSelectionManager.write = null;
                                textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                textFieldSelectionManager.RatingCompat = null;
                                textFieldSelectionManager.MediaMetadataCompat = null;
                                textFieldSelectionManager.MediaDescriptionCompat = null;
                                textFieldSelectionManager.MediaSessionCompatQueueItem = 4;
                                if (consumeUntilUp(awaitPointerEventScope3, textFieldSelectionManager) != coroutineSingletons2) {
                                    pressGestureScopeImpl5 = pressGestureScopeImpl3;
                                    getcontentviewgroupparentlayout4 = getcontentviewgroupparentlayout2;
                                    serializer(getcontentviewgroupparentlayout4, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl5, shortNewsContentCardView, 0));
                                    return createfromparcel;
                                }
                            } else {
                                if (textAnnotatedStringElement instanceof TextStringSimpleElement) {
                                    pointerInputChange3 = ((TextStringSimpleElement) textAnnotatedStringElement).read;
                                } else {
                                    if (!(textAnnotatedStringElement instanceof TextAnnotatedStringNode)) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    pointerInputChange3 = null;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                                getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
                                pressGestureScopeImpl4 = pressGestureScopeImpl3;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                if (pointerInputChange3 == null) {
                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                                } else {
                                    pointerInputChange3.consume();
                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                                }
                                if (pointerInputChange3 != null) {
                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                        textFieldSelectionManager.read = pressGestureScopeImpl4;
                                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                                        textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                        textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                                        textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                        textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                        objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                                        if (objWithTimeoutOrNull != coroutineSingletons2) {
                                            pointerInputChange4 = pointerInputChange3;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                            awaitPointerEventScope4 = awaitPointerEventScope3;
                                            objWaitForUpOrCancellation = objWithTimeoutOrNull;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                            setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                                            pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                                            if (pointerInputChange5 != null) {
                                                androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                                setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                                    serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                                }
                                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                                    textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                                    textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                    textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                                    textFieldSelectionManager.RatingCompat = null;
                                                    textFieldSelectionManager.MediaMetadataCompat = null;
                                                    textFieldSelectionManager.MediaDescriptionCompat = null;
                                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                                    objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                    if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                                        return coroutineSingletons2;
                                                    }
                                                    pointerInputChange6 = pointerInputChange4;
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                    pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                                    getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                    pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                                    if (pointerInputChange7 != null) {
                                                        pointerInputChange7.consume();
                                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                        return createfromparcel;
                                                    }
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                        return createfromparcel;
                                                    }
                                                } else {
                                                    coroutineSingletons = coroutineSingletons2;
                                                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                                    textFieldSelectionManager.read = pressGestureScopeImpl4;
                                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                    textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                                    textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                                    objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                    if (objWaitForLongPress2 == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                                    getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                    textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                                        textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                                        textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                                        textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                        textFieldSelectionManager.IconCompatParcelizer = null;
                                                        textFieldSelectionManager.write = null;
                                                        textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                                        textFieldSelectionManager.RatingCompat = null;
                                                        textFieldSelectionManager.MediaMetadataCompat = null;
                                                        textFieldSelectionManager.MediaDescriptionCompat = null;
                                                        textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                                        if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                        setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                        getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                                        pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                                        serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                                        return createfromparcel;
                                                    }
                                                    if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                                        pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                                    } else {
                                                        if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                            return null;
                                                        }
                                                        pointerInputChange7 = null;
                                                    }
                                                    pointerInputChange6 = pointerInputChange4;
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                    getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                    pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                                    if (pointerInputChange7 != null) {
                                                        pointerInputChange7.consume();
                                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                        return createfromparcel;
                                                    }
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                        return createfromparcel;
                                                    }
                                                }
                                            } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                                return createfromparcel;
                                            }
                                        }
                                    } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                }
                                return createfromparcel;
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.RatingCompat;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm16 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.write;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm17 = textFieldSelectionManager.IconCompatParcelizer;
                PressGestureScopeImpl pressGestureScopeImpl9 = (PressGestureScopeImpl) textFieldSelectionManager.read;
                getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) textFieldSelectionManager.serializer;
                awaitPointerEventScope2 = (AwaitPointerEventScope) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm17;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm16;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5;
                pressGestureScopeImpl2 = pressGestureScopeImpl9;
                i = 1;
                pointerInputChange = (PointerInputChange) objWaitForUpOrCancellation;
                pointerInputChange.consume();
                createfromparcel = createfromparcel2;
                androidSelectionHandles_androidKt = androidSelectionHandles_androidKt4;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, shortNewsContentCardView, 0), i);
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                    serializer(getcontentviewgroupparentlayout2, r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl2, pointerInputChange, null, 0));
                }
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm4 == null) {
                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout2;
                    textFieldSelectionManager.read = pressGestureScopeImpl2;
                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                    textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                    textFieldSelectionManager.MediaMetadataCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                    textFieldSelectionManager.MediaSessionCompatQueueItem = 2;
                    objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope2, PointerEventPass.Main, textFieldSelectionManager);
                    if (objWaitForUpOrCancellation != coroutineSingletons2) {
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                        pressGestureScopeImpl4 = pressGestureScopeImpl2;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                        pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                        androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                        if (pointerInputChange3 == null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                        } else {
                            pointerInputChange3.consume();
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                        }
                        if (pointerInputChange3 != null) {
                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                                textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                                textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                textFieldSelectionManager.read = pressGestureScopeImpl4;
                                textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                                textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                                textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                                if (objWithTimeoutOrNull != coroutineSingletons2) {
                                    pointerInputChange4 = pointerInputChange3;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                    awaitPointerEventScope4 = awaitPointerEventScope3;
                                    objWaitForUpOrCancellation = objWithTimeoutOrNull;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                    setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                                    pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                                    if (pointerInputChange5 != null) {
                                        androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                        setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                            serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                        }
                                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                            textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                            textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                            textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                            textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                            textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                            textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                            textFieldSelectionManager.RatingCompat = null;
                                            textFieldSelectionManager.MediaMetadataCompat = null;
                                            textFieldSelectionManager.MediaDescriptionCompat = null;
                                            textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                            objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                            if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            pointerInputChange6 = pointerInputChange4;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                            pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                            getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                            pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                            if (pointerInputChange7 != null) {
                                                pointerInputChange7.consume();
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                return createfromparcel;
                                            }
                                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                return createfromparcel;
                                            }
                                        } else {
                                            coroutineSingletons = coroutineSingletons2;
                                            textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                            textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                            textFieldSelectionManager.read = pressGestureScopeImpl4;
                                            textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                            textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                            textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                            textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                            textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                            textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                            textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                            objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                            if (objWaitForLongPress2 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                            getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                            textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                                textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                                textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                                textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                textFieldSelectionManager.IconCompatParcelizer = null;
                                                textFieldSelectionManager.write = null;
                                                textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                                textFieldSelectionManager.RatingCompat = null;
                                                textFieldSelectionManager.MediaMetadataCompat = null;
                                                textFieldSelectionManager.MediaDescriptionCompat = null;
                                                textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                                if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                                pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                                serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                                return createfromparcel;
                                            }
                                            if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                                pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                            } else {
                                                if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    return null;
                                                }
                                                pointerInputChange7 = null;
                                            }
                                            pointerInputChange6 = pointerInputChange4;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                            getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                            pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                            if (pointerInputChange7 != null) {
                                                pointerInputChange7.consume();
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                return createfromparcel;
                                            }
                                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                return createfromparcel;
                                            }
                                        }
                                    } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                }
                            } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                                return createfromparcel;
                            }
                        }
                        return createfromparcel;
                    }
                } else {
                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout2;
                    textFieldSelectionManager.read = pressGestureScopeImpl2;
                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                    textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                    textFieldSelectionManager.MediaMetadataCompat = pointerInputChange;
                    textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                    textFieldSelectionManager.MediaSessionCompatQueueItem = 3;
                    objWaitForLongPress = waitForLongPress(awaitPointerEventScope2, PointerEventPass.Main, textFieldSelectionManager);
                    if (objWaitForLongPress != coroutineSingletons2) {
                        pressGestureScopeImpl3 = pressGestureScopeImpl2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        pointerInputChange2 = pointerInputChange;
                        objWaitForUpOrCancellation = objWaitForLongPress;
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                        textAnnotatedStringElement = (TextAnnotatedStringElement) objWaitForUpOrCancellation;
                        androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement, androidSelectionHandles_androidKt2}, getCieXyz.write())).booleanValue()) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(Offset.m466boximpl(pointerInputChange2.m2071getPositionF1C5BW0()));
                            textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout2;
                            textFieldSelectionManager.serializer = pressGestureScopeImpl3;
                            textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
                            textFieldSelectionManager.IconCompatParcelizer = null;
                            textFieldSelectionManager.write = null;
                            textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                            textFieldSelectionManager.RatingCompat = null;
                            textFieldSelectionManager.MediaMetadataCompat = null;
                            textFieldSelectionManager.MediaDescriptionCompat = null;
                            textFieldSelectionManager.MediaSessionCompatQueueItem = 4;
                            if (consumeUntilUp(awaitPointerEventScope3, textFieldSelectionManager) != coroutineSingletons2) {
                                pressGestureScopeImpl5 = pressGestureScopeImpl3;
                                getcontentviewgroupparentlayout4 = getcontentviewgroupparentlayout2;
                                serializer(getcontentviewgroupparentlayout4, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl5, shortNewsContentCardView, 0));
                                return createfromparcel;
                            }
                        } else {
                            if (textAnnotatedStringElement instanceof TextStringSimpleElement) {
                                pointerInputChange3 = ((TextStringSimpleElement) textAnnotatedStringElement).read;
                            } else {
                                if (!(textAnnotatedStringElement instanceof TextAnnotatedStringNode)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                pointerInputChange3 = null;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                            getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
                            pressGestureScopeImpl4 = pressGestureScopeImpl3;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                            if (pointerInputChange3 == null) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                            } else {
                                pointerInputChange3.consume();
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                            }
                            if (pointerInputChange3 != null) {
                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                    textFieldSelectionManager.read = pressGestureScopeImpl4;
                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                                    textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                    textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                                    textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                                    objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                                    if (objWithTimeoutOrNull != coroutineSingletons2) {
                                        pointerInputChange4 = pointerInputChange3;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                        awaitPointerEventScope4 = awaitPointerEventScope3;
                                        objWaitForUpOrCancellation = objWithTimeoutOrNull;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                        setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                                        pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                                        if (pointerInputChange5 != null) {
                                            androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                            setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                            if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                                serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                            }
                                            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                                textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                                textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                                textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                                textFieldSelectionManager.RatingCompat = null;
                                                textFieldSelectionManager.MediaMetadataCompat = null;
                                                textFieldSelectionManager.MediaDescriptionCompat = null;
                                                textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                                objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                                pointerInputChange6 = pointerInputChange4;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                                getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                                if (pointerInputChange7 != null) {
                                                    pointerInputChange7.consume();
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                            } else {
                                                coroutineSingletons = coroutineSingletons2;
                                                textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                                textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                                textFieldSelectionManager.read = pressGestureScopeImpl4;
                                                textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                                textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                                textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                                objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                                if (objWaitForLongPress2 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                                getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                                textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                                    textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                                    textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    textFieldSelectionManager.IconCompatParcelizer = null;
                                                    textFieldSelectionManager.write = null;
                                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                                    textFieldSelectionManager.RatingCompat = null;
                                                    textFieldSelectionManager.MediaMetadataCompat = null;
                                                    textFieldSelectionManager.MediaDescriptionCompat = null;
                                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                                    if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                                    getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                                    pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                                    serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                                    return createfromparcel;
                                                }
                                                if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                                    pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                                } else {
                                                    if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                        return null;
                                                    }
                                                    pointerInputChange7 = null;
                                                }
                                                pointerInputChange6 = pointerInputChange4;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                                getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                                pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                                if (pointerInputChange7 != null) {
                                                    pointerInputChange7.consume();
                                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                                    return createfromparcel;
                                                }
                                            }
                                        } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                    }
                                } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                                    return createfromparcel;
                                }
                            }
                            return createfromparcel;
                        }
                    }
                }
                return coroutineSingletons2;
            case 2:
                setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.MediaMetadataCompat;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.RatingCompat;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.write;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = textFieldSelectionManager.IconCompatParcelizer;
                pressGestureScopeImpl4 = (PressGestureScopeImpl) textFieldSelectionManager.read;
                getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) textFieldSelectionManager.serializer;
                awaitPointerEventScope3 = (AwaitPointerEventScope) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                androidSelectionHandles_androidKt = androidSelectionHandles_androidKt4;
                createfromparcel = createfromparcel2;
                pointerInputChange3 = (PointerInputChange) objWaitForUpOrCancellation;
                androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                if (pointerInputChange3 == null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                } else {
                    pointerInputChange3.consume();
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                }
                if (pointerInputChange3 != null) {
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                        textFieldSelectionManager.read = pressGestureScopeImpl4;
                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                        textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                        textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                        textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                        textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                        objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                        if (objWithTimeoutOrNull != coroutineSingletons2) {
                            pointerInputChange4 = pointerInputChange3;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            objWaitForUpOrCancellation = objWithTimeoutOrNull;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                            setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                            pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                            if (pointerInputChange5 != null) {
                                androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                    serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                }
                                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                    textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                    textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                    textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                    textFieldSelectionManager.RatingCompat = null;
                                    textFieldSelectionManager.MediaMetadataCompat = null;
                                    textFieldSelectionManager.MediaDescriptionCompat = null;
                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                    objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                    if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    pointerInputChange6 = pointerInputChange4;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                    pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                    getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                    pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                    if (pointerInputChange7 != null) {
                                        pointerInputChange7.consume();
                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                } else {
                                    coroutineSingletons = coroutineSingletons2;
                                    textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                    textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                    textFieldSelectionManager.read = pressGestureScopeImpl4;
                                    textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                    textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                    textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                    textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                    textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                    textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                    textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                    objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                    if (objWaitForLongPress2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                    getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                    textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                        textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                        textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                        textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                        textFieldSelectionManager.IconCompatParcelizer = null;
                                        textFieldSelectionManager.write = null;
                                        textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                        textFieldSelectionManager.RatingCompat = null;
                                        textFieldSelectionManager.MediaMetadataCompat = null;
                                        textFieldSelectionManager.MediaDescriptionCompat = null;
                                        textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                        if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                        getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                        pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                        serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                        return createfromparcel;
                                    }
                                    if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                        pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                    } else {
                                        if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                        pointerInputChange7 = null;
                                    }
                                    pointerInputChange6 = pointerInputChange4;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                    getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                    pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                    if (pointerInputChange7 != null) {
                                        pointerInputChange7.consume();
                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                        return createfromparcel;
                                    }
                                }
                            } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                return createfromparcel;
                            }
                        }
                        return coroutineSingletons2;
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                        return createfromparcel;
                    }
                }
                return createfromparcel;
            case 3:
                setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.MediaDescriptionCompat;
                pointerInputChange2 = (PointerInputChange) textFieldSelectionManager.MediaMetadataCompat;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.RatingCompat;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm18 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.write;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = textFieldSelectionManager.IconCompatParcelizer;
                pressGestureScopeImpl3 = (PressGestureScopeImpl) textFieldSelectionManager.read;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout8 = (getContentViewGroupParentLayout) textFieldSelectionManager.serializer;
                awaitPointerEventScope3 = (AwaitPointerEventScope) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                androidSelectionHandles_androidKt = androidSelectionHandles_androidKt4;
                createfromparcel = createfromparcel2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = r8lambdaunavo3sxub_pc9xroryotnrlvsm18;
                getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout8;
                textAnnotatedStringElement = (TextAnnotatedStringElement) objWaitForUpOrCancellation;
                androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement, androidSelectionHandles_androidKt2}, getCieXyz.write())).booleanValue()) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(Offset.m466boximpl(pointerInputChange2.m2071getPositionF1C5BW0()));
                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout2;
                    textFieldSelectionManager.serializer = pressGestureScopeImpl3;
                    textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
                    textFieldSelectionManager.IconCompatParcelizer = null;
                    textFieldSelectionManager.write = null;
                    textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                    textFieldSelectionManager.RatingCompat = null;
                    textFieldSelectionManager.MediaMetadataCompat = null;
                    textFieldSelectionManager.MediaDescriptionCompat = null;
                    textFieldSelectionManager.MediaSessionCompatQueueItem = 4;
                    if (consumeUntilUp(awaitPointerEventScope3, textFieldSelectionManager) != coroutineSingletons2) {
                        pressGestureScopeImpl5 = pressGestureScopeImpl3;
                        getcontentviewgroupparentlayout4 = getcontentviewgroupparentlayout2;
                        serializer(getcontentviewgroupparentlayout4, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl5, shortNewsContentCardView, 0));
                        return createfromparcel;
                    }
                } else {
                    if (textAnnotatedStringElement instanceof TextStringSimpleElement) {
                        pointerInputChange3 = ((TextStringSimpleElement) textAnnotatedStringElement).read;
                    } else {
                        if (!(textAnnotatedStringElement instanceof TextAnnotatedStringNode)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        pointerInputChange3 = null;
                    }
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                    getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
                    pressGestureScopeImpl4 = pressGestureScopeImpl3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                    if (pointerInputChange3 == null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 3));
                    } else {
                        pointerInputChange3.consume();
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer = serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl4, shortNewsContentCardView, 4));
                    }
                    if (pointerInputChange3 != null) {
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm7 == null) {
                            textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope3;
                            textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                            textFieldSelectionManager.read = pressGestureScopeImpl4;
                            textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                            textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                            textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                            textFieldSelectionManager.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                            textFieldSelectionManager.MediaMetadataCompat = pointerInputChange3;
                            textFieldSelectionManager.MediaDescriptionCompat = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                            textFieldSelectionManager.MediaSessionCompatQueueItem = 5;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguSerializer;
                            objWithTimeoutOrNull = awaitPointerEventScope3.withTimeoutOrNull(awaitPointerEventScope3.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange3, shortNewsContentCardView, 0), textFieldSelectionManager);
                            if (objWithTimeoutOrNull != coroutineSingletons2) {
                                pointerInputChange4 = pointerInputChange3;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                awaitPointerEventScope4 = awaitPointerEventScope3;
                                objWaitForUpOrCancellation = objWithTimeoutOrNull;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                setallviewgroupchildrenasnonaccessibilityimportantlambda1 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                                pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                                if (pointerInputChange5 != null) {
                                    androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                                    setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                                    if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                                        serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                                    }
                                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                                        textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                                        textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                                        textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                        textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                        textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                                        textFieldSelectionManager.RatingCompat = null;
                                        textFieldSelectionManager.MediaMetadataCompat = null;
                                        textFieldSelectionManager.MediaDescriptionCompat = null;
                                        textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                                        objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                        if (objWaitForUpOrCancellation == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        pointerInputChange6 = pointerInputChange4;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                        pressGestureScopeImpl7 = pressGestureScopeImpl4;
                                        getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                        pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                                        if (pointerInputChange7 != null) {
                                            pointerInputChange7.consume();
                                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                    } else {
                                        coroutineSingletons = coroutineSingletons2;
                                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                                        textFieldSelectionManager.read = pressGestureScopeImpl4;
                                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                        textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                        textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                                        textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                                        textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                                        objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                                        if (objWaitForLongPress2 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        pressGestureScopeImpl6 = pressGestureScopeImpl4;
                                        getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                                        textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                                            textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                                            textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                                            textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                            textFieldSelectionManager.IconCompatParcelizer = null;
                                            textFieldSelectionManager.write = null;
                                            textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                                            textFieldSelectionManager.RatingCompat = null;
                                            textFieldSelectionManager.MediaMetadataCompat = null;
                                            textFieldSelectionManager.MediaDescriptionCompat = null;
                                            textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                                            if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                                            getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                                            pressGestureScopeImpl8 = pressGestureScopeImpl6;
                                            serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                                            return createfromparcel;
                                        }
                                        if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                                            pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                                        } else {
                                            if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                return null;
                                            }
                                            pointerInputChange7 = null;
                                        }
                                        pointerInputChange6 = pointerInputChange4;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                                        getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                                        pressGestureScopeImpl7 = pressGestureScopeImpl6;
                                        if (pointerInputChange7 != null) {
                                            pointerInputChange7.consume();
                                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                                            return createfromparcel;
                                        }
                                    }
                                } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                                    return createfromparcel;
                                }
                            }
                        } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm8 != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Offset.m466boximpl(pointerInputChange3.m2071getPositionF1C5BW0()));
                            return createfromparcel;
                        }
                    }
                    return createfromparcel;
                }
                return coroutineSingletons2;
            case 4:
                setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.read;
                pressGestureScopeImpl5 = (PressGestureScopeImpl) textFieldSelectionManager.serializer;
                getcontentviewgroupparentlayout4 = (getContentViewGroupParentLayout) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                createfromparcel = createfromparcel2;
                serializer(getcontentviewgroupparentlayout4, setallviewgroupchildrenasnonaccessibilityimportantlambda0, new AnonymousClass3(pressGestureScopeImpl5, shortNewsContentCardView, 0));
                return createfromparcel;
            case 5:
                setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.MediaDescriptionCompat;
                pointerInputChange4 = (PointerInputChange) textFieldSelectionManager.MediaMetadataCompat;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm19 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.RatingCompat;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm20 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.write;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm21 = textFieldSelectionManager.IconCompatParcelizer;
                PressGestureScopeImpl pressGestureScopeImpl10 = (PressGestureScopeImpl) textFieldSelectionManager.read;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout9 = (getContentViewGroupParentLayout) textFieldSelectionManager.serializer;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                createfromparcel = createfromparcel2;
                androidSelectionHandles_androidKt2 = androidSelectionHandles_androidKt4;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm20;
                pressGestureScopeImpl4 = pressGestureScopeImpl10;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = r8lambdaunavo3sxub_pc9xroryotnrlvsm21;
                getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout9;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = r8lambdaunavo3sxub_pc9xroryotnrlvsm19;
                awaitPointerEventScope4 = awaitPointerEventScope5;
                pointerInputChange5 = (PointerInputChange) objWaitForUpOrCancellation;
                if (pointerInputChange5 != null) {
                    androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt2;
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda1, pressGestureScopeImpl4, shortNewsContentCardView, 9), 1);
                    if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 != draggableKt$NoOpOnDragStarted$1) {
                        serializer(getcontentviewgroupparentlayout3, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass2(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, pressGestureScopeImpl4, pointerInputChange5, null, 1));
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm10 == null) {
                        textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout3;
                        textFieldSelectionManager.serializer = pressGestureScopeImpl4;
                        textFieldSelectionManager.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                        textFieldSelectionManager.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                        textFieldSelectionManager.MediaBrowserCompatMediaItem = pointerInputChange4;
                        textFieldSelectionManager.RatingCompat = null;
                        textFieldSelectionManager.MediaMetadataCompat = null;
                        textFieldSelectionManager.MediaDescriptionCompat = null;
                        textFieldSelectionManager.MediaSessionCompatQueueItem = 6;
                        objWaitForUpOrCancellation = waitForUpOrCancellation(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                        if (objWaitForUpOrCancellation == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        pointerInputChange6 = pointerInputChange4;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                        pressGestureScopeImpl7 = pressGestureScopeImpl4;
                        getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout3;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                        pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                        if (pointerInputChange7 != null) {
                            pointerInputChange7.consume();
                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                            return createfromparcel;
                        }
                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                            return createfromparcel;
                        }
                    } else {
                        coroutineSingletons = coroutineSingletons2;
                        textFieldSelectionManager.RemoteActionCompatParcelizer = awaitPointerEventScope4;
                        textFieldSelectionManager.serializer = getcontentviewgroupparentlayout3;
                        textFieldSelectionManager.read = pressGestureScopeImpl4;
                        textFieldSelectionManager.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                        textFieldSelectionManager.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                        textFieldSelectionManager.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                        textFieldSelectionManager.RatingCompat = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                        textFieldSelectionManager.MediaMetadataCompat = pointerInputChange4;
                        textFieldSelectionManager.MediaDescriptionCompat = pointerInputChange5;
                        textFieldSelectionManager.MediaSessionCompatQueueItem = 7;
                        objWaitForLongPress2 = waitForLongPress(awaitPointerEventScope4, PointerEventPass.Main, textFieldSelectionManager);
                        if (objWaitForLongPress2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        pressGestureScopeImpl6 = pressGestureScopeImpl4;
                        getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout3;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                        textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                            textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                            textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                            textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                            textFieldSelectionManager.IconCompatParcelizer = null;
                            textFieldSelectionManager.write = null;
                            textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                            textFieldSelectionManager.RatingCompat = null;
                            textFieldSelectionManager.MediaMetadataCompat = null;
                            textFieldSelectionManager.MediaDescriptionCompat = null;
                            textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                            if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                            getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                            pressGestureScopeImpl8 = pressGestureScopeImpl6;
                            serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                            return createfromparcel;
                        }
                        if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                            pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                        } else {
                            if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            pointerInputChange7 = null;
                        }
                        pointerInputChange6 = pointerInputChange4;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                        getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                        pressGestureScopeImpl7 = pressGestureScopeImpl6;
                        if (pointerInputChange7 != null) {
                            pointerInputChange7.consume();
                            serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                            return createfromparcel;
                        }
                        serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                            return createfromparcel;
                        }
                    }
                } else if (r8lambdaunavo3sxub_pc9xroryotnrlvsm12 != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(Offset.m466boximpl(pointerInputChange4.m2071getPositionF1C5BW0()));
                    return createfromparcel;
                }
                return createfromparcel;
            case 6:
                pointerInputChange6 = (PointerInputChange) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.write;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = textFieldSelectionManager.IconCompatParcelizer;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.read;
                pressGestureScopeImpl7 = (PressGestureScopeImpl) textFieldSelectionManager.serializer;
                getcontentviewgroupparentlayout6 = (getContentViewGroupParentLayout) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                createfromparcel = createfromparcel2;
                pointerInputChange7 = (PointerInputChange) objWaitForUpOrCancellation;
                if (pointerInputChange7 != null) {
                    pointerInputChange7.consume();
                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                    return createfromparcel;
                }
                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                    return createfromparcel;
                }
                return createfromparcel;
            case 7:
                PointerInputChange pointerInputChange8 = (PointerInputChange) textFieldSelectionManager.MediaDescriptionCompat;
                pointerInputChange4 = (PointerInputChange) textFieldSelectionManager.MediaMetadataCompat;
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda3 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.RatingCompat;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.MediaBrowserCompatMediaItem;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) textFieldSelectionManager.write;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = textFieldSelectionManager.IconCompatParcelizer;
                pressGestureScopeImpl6 = (PressGestureScopeImpl) textFieldSelectionManager.read;
                getcontentviewgroupparentlayout5 = (getContentViewGroupParentLayout) textFieldSelectionManager.serializer;
                awaitPointerEventScope4 = (AwaitPointerEventScope) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                androidSelectionHandles_androidKt3 = androidSelectionHandles_androidKt4;
                createfromparcel = createfromparcel2;
                pointerInputChange5 = pointerInputChange8;
                coroutineSingletons = coroutineSingletons2;
                setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer = setallviewgroupchildrenasnonaccessibilityimportantlambda3;
                objWaitForLongPress2 = objWaitForUpOrCancellation;
                textAnnotatedStringElement2 = (TextAnnotatedStringElement) objWaitForLongPress2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnotatedStringElement2, androidSelectionHandles_androidKt3}, getCieXyz.write())).booleanValue()) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(Offset.m466boximpl(pointerInputChange5.m2071getPositionF1C5BW0()));
                    textFieldSelectionManager.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout5;
                    textFieldSelectionManager.serializer = pressGestureScopeImpl6;
                    textFieldSelectionManager.read = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                    textFieldSelectionManager.IconCompatParcelizer = null;
                    textFieldSelectionManager.write = null;
                    textFieldSelectionManager.MediaBrowserCompatMediaItem = null;
                    textFieldSelectionManager.RatingCompat = null;
                    textFieldSelectionManager.MediaMetadataCompat = null;
                    textFieldSelectionManager.MediaDescriptionCompat = null;
                    textFieldSelectionManager.MediaSessionCompatQueueItem = 8;
                    if (consumeUntilUp(awaitPointerEventScope4, textFieldSelectionManager) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    setallviewgroupchildrenasnonaccessibilityimportantlambda2 = setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer;
                    getcontentviewgroupparentlayout7 = getcontentviewgroupparentlayout5;
                    pressGestureScopeImpl8 = pressGestureScopeImpl6;
                    serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                    return createfromparcel;
                }
                if (textAnnotatedStringElement2 instanceof TextStringSimpleElement) {
                    pointerInputChange7 = ((TextStringSimpleElement) textAnnotatedStringElement2).read;
                } else {
                    if (textAnnotatedStringElement2 instanceof TextAnnotatedStringNode) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    pointerInputChange7 = null;
                }
                pointerInputChange6 = pointerInputChange4;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                getcontentviewgroupparentlayout6 = getcontentviewgroupparentlayout5;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = r8lambdaunavo3sxub_pc9xroryotnrlvsm11;
                pressGestureScopeImpl7 = pressGestureScopeImpl6;
                if (pointerInputChange7 != null) {
                    pointerInputChange7.consume();
                    serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 5));
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(Offset.m466boximpl(pointerInputChange7.m2071getPositionF1C5BW0()));
                    return createfromparcel;
                }
                serializer(getcontentviewgroupparentlayout6, setallviewgroupchildrenasnonaccessibilityimportantlambda0RemoteActionCompatParcelizer, new AnonymousClass3(pressGestureScopeImpl7, shortNewsContentCardView, 6));
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm14 != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(Offset.m466boximpl(pointerInputChange6.m2071getPositionF1C5BW0()));
                    return createfromparcel;
                }
                return createfromparcel;
            case 8:
                setallviewgroupchildrenasnonaccessibilityimportantlambda2 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textFieldSelectionManager.read;
                pressGestureScopeImpl8 = (PressGestureScopeImpl) textFieldSelectionManager.serializer;
                getcontentviewgroupparentlayout7 = (getContentViewGroupParentLayout) textFieldSelectionManager.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWaitForUpOrCancellation);
                createfromparcel = createfromparcel2;
                serializer(getcontentviewgroupparentlayout7, setallviewgroupchildrenasnonaccessibilityimportantlambda2, new AnonymousClass3(pressGestureScopeImpl8, shortNewsContentCardView, 7));
                return createfromparcel;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, o.ShortNewsContentCardView r8) {
        /*
            boolean r0 = r8 instanceof o.TextFieldPreparedSelection
            if (r0 == 0) goto L13
            r0 = r8
            o.TextFieldPreparedSelection r0 = (o.TextFieldPreparedSelection) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.read = r1
            goto L18
        L13:
            o.TextFieldPreparedSelection r0 = new o.TextFieldPreparedSelection
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.IconCompatParcelizer
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.RemoteActionCompatParcelizer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            r5 = 0
            return r5
        L38:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
        L3b:
            r0.write = r5
            r0.RemoteActionCompatParcelizer = r7
            r0.IconCompatParcelizer = r6
            r0.read = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown$default(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[LOOP:1: B:22:0x0066->B:26:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0068
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof o.SimpleLayout
            if (r0 == 0) goto L13
            r0 = r10
            o.SimpleLayout r0 = (o.SimpleLayout) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            o.SimpleLayout r0 = new o.SimpleLayout
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L3e
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r3
        L30:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
        L33:
            r0.serializer = r9
            r0.write = r4
            java.lang.Object r10 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r9, r3, r0, r4, r3)
            if (r10 != r1) goto L3e
            return r1
        L3e:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            java.util.List r2 = r10.getChanges()
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r7 = r6
        L4d:
            if (r7 >= r5) goto L5b
            java.lang.Object r8 = r2.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.consume()
            int r7 = r7 + 1
            goto L4d
        L5b:
            java.util.List r10 = r10.getChanges()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L66:
            if (r6 >= r2) goto L78
            java.lang.Object r5 = r10.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L75
            goto L33
        L75:
            int r6 = r6 + 1
            goto L66
        L78:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if (!(z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object waitForLongPress(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, ContinuationImpl continuationImpl) {
        jumpByPagesOffset jumpbypagesoffset;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        if (continuationImpl instanceof jumpByPagesOffset) {
            jumpbypagesoffset = (jumpByPagesOffset) continuationImpl;
            int i = jumpbypagesoffset.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                jumpbypagesoffset.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                jumpbypagesoffset = new jumpByPagesOffset(continuationImpl);
            }
        } else {
            jumpbypagesoffset = new jumpByPagesOffset(continuationImpl);
        }
        Object obj = jumpbypagesoffset.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = jumpbypagesoffset.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
                createinappmessageeventsubscriberM3979m.IconCompatParcelizer = TextAnnotatedStringNode.write;
                long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                ForEachGestureKt.C00342 c00342 = new ForEachGestureKt.C00342(pointerEventPass, createinappmessageeventsubscriberM3979m, shortNewsContentCardView, 2);
                jumpbypagesoffset.RemoteActionCompatParcelizer = createinappmessageeventsubscriberM3979m;
                jumpbypagesoffset.IconCompatParcelizer = 1;
                if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, c00342, jumpbypagesoffset) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                createinappmessageeventsubscriber = jumpbypagesoffset.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createinappmessageeventsubscriber.IconCompatParcelizer;
        } catch (PointerEventTimeoutCancellationException unused) {
            return AndroidSelectionHandles_androidKt.serializer;
        }
    }

    public static r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU serializer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, CoroutineStart.UNDISPATCHED, new RealImageLoader.AnonymousClass2(setallviewgroupchildrenasnonaccessibilityimportantlambda0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 12), 1);
    }

    public static /* synthetic */ Object IconCompatParcelizer(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, ShortNewsContentCardView shortNewsContentCardView, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, shortNewsContentCardView);
    }
}
