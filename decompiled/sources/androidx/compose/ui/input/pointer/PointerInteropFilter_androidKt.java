package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {
    public static final Modifier motionEventSpy(Modifier modifier, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00011 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $watcher;
                private /* synthetic */ Object L$0;
                int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                    C00011 c00011 = new C00011(this.$watcher, shortNewsContentCardView);
                    c00011.L$0 = obj;
                    return c00011;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x0035  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L18
                        if (r1 != r2) goto L11
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                        goto L2d
                    L11:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
                        r5 = 0
                        return r5
                    L18:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L20:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L2d
                        return r0
                    L2d:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        android.view.MotionEvent r5 = r5.getMotionEvent()
                        if (r5 == 0) goto L20
                        o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r4.$watcher
                        r3.invoke(r5)
                        goto L20
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.AnonymousClass1.C00011.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00011(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super C00011> shortNewsContentCardView) {
                    super(2, shortNewsContentCardView);
                    this.$watcher = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                    return ((C00011) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C00011(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), shortNewsContentCardView);
                return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : createFromParcel.INSTANCE;
            }
        });
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, final AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.3
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                int actionMasked = motionEvent.getActionMasked();
                AndroidViewHolder androidViewHolder2 = androidViewHolder;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = androidViewHolder2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = androidViewHolder2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", requestDisallowInterceptTouchEvent);
                inspectorInfo.getProperties().set("onTouchEvent", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return createFromParcel.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final Modifier invoke(Modifier modifier2, getBirthDateFull getbirthdatefull, int i) {
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.serializer(374375707);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new PointerInteropFilter();
                    getpostalcode.write(objComponentActivity);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objComponentActivity;
                pointerInteropFilter.setOnTouchEvent(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                getpostalcode.IconCompatParcelizer(false);
                return pointerInteropFilter;
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (getBirthDateFull) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
