package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.getCieXyz;
import o.isItemDismissable;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 _deprecatedPointerInputHandler;
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final onCreateVirtualViewTranslationRequests dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final onCreateVirtualViewTranslationRequests pointerHandlers;
    private final Object pointerHandlersLock;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 pointerInputJob;

    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, ShortNewsContentCardView<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final ShortNewsContentCardView<R> completion;
        private createTouchAwareListener pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final TextAnnouncementContentCardView context = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;

        @Override // o.ShortNewsContentCardView
        public TextAnnouncementContentCardView getContext() {
            return this.context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(ShortNewsContentCardView<? super R> shortNewsContentCardView) {
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
            this.completion = shortNewsContentCardView;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, ShortNewsContentCardView<? super PointerEvent> shortNewsContentCardView) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
            cancellableContinuationImpl.read();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo1953getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo2110getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo1954getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        @Override // o.ShortNewsContentCardView
        public void resumeWith(Object obj) {
            Object obj2 = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj2) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.RemoteActionCompatParcelizer(this);
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo41roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo41roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo42roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo42roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo43toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo43toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo44toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo44toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo46toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo46toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo47toPxR2X_6o(long j) {
            return this.$$delegate_0.mo47toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo48toPx0680j_4(float f) {
            return this.$$delegate_0.mo48toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo49toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo49toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo50toSp0xMU5do(float f) {
            return this.$$delegate_0.mo50toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo51toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo51toSpkPz2Gy4(f);
        }

        public final void cancel(Throwable th) {
            createTouchAwareListener createtouchawarelistener = this.pointerAwaiter;
            if (createtouchawarelistener != null) {
                createtouchawarelistener.serializer(th);
            }
            this.pointerAwaiter = null;
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            createTouchAwareListener createtouchawarelistener;
            if (pointerEventPass != this.awaitPass || (createtouchawarelistener = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            createtouchawarelistener.resumeWith(pointerEvent);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
        /* JADX WARN: Type inference failed for: r8v0, types: [long] */
        /* JADX WARN: Type inference failed for: r8v1, types: [o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0] */
        /* JADX WARN: Type inference failed for: r8v4, types: [o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0] */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public <T> Object withTimeout(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            createTouchAwareListener createtouchawarelistener;
            if (shortNewsContentCardView instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) shortNewsContentCardView;
                int i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, shortNewsContentCardView);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, shortNewsContentCardView);
            }
            Object objInvoke = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
            try {
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    if (j <= 0 && (createtouchawarelistener = this.pointerAwaiter) != null) {
                        createtouchawarelistener.resumeWith(new isItemDismissable(new PointerEventTimeoutCancellationException(j)));
                    }
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(SuspendingPointerInputModifierNodeImpl.this.getCoroutineScope(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                    objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                    j = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    j = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
                }
                j.write(CancelTimeoutCancellationException.INSTANCE);
                return objInvoke;
            } catch (Throwable th) {
                j.write(CancelTimeoutCancellationException.INSTANCE);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public <T> Object withTimeoutOrNull(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (shortNewsContentCardView instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) shortNewsContentCardView;
                int i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, shortNewsContentCardView);
                }
            } else {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, shortNewsContentCardView);
            }
            Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
            try {
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                    Object objWithTimeout = withTimeout(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                    return objWithTimeout == coroutineSingletons ? coroutineSingletons : objWithTimeout;
                }
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo45toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo45toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo52toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo52toSpkPz2Gy4(i);
        }
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo2111getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlersLock) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.dispatchingPointerHandlers;
            oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read, this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.dispatchingPointerHandlers;
                Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
                int i2 = oncreatevirtualviewtranslationrequests2.read;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((PointerEventHandlerCoroutine) objArr[i3]).offerPointerEvent(pointerEvent, pointerEventPass);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = this.dispatchingPointerHandlers;
                int i4 = oncreatevirtualviewtranslationrequests3.read - 1;
                Object[] objArr2 = oncreatevirtualviewtranslationrequests3.write;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        ((PointerEventHandlerCoroutine) objArr2[i4]).offerPointerEvent(pointerEvent, pointerEventPass);
                        i4--;
                    }
                }
            }
            this.dispatchingPointerHandlers.RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.RemoteActionCompatParcelizer();
            throw th;
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        synchronized (this.pointerHandlersLock) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.dispatchingPointerHandlers;
            oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read, this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.dispatchingPointerHandlers;
                Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
                int i2 = oncreatevirtualviewtranslationrequests2.read;
                for (int i3 = 0; i3 < i2; i3++) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i3]);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = this.dispatchingPointerHandlers;
                int i4 = oncreatevirtualviewtranslationrequests3.read - 1;
                Object[] objArr2 = oncreatevirtualviewtranslationrequests3.write;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr2[i4]);
                        i4--;
                    }
                }
            }
            this.dispatchingPointerHandlers.RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.RemoteActionCompatParcelizer();
            throw th;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.IconCompatParcelizer(pointerEventHandlerCoroutine);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            new SafeContinuation(LoadBalancer$Helper.intercepted(LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(createFromParcel.INSTANCE);
        }
        cancellableContinuationImpl.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        return cancellableContinuationImpl.getResult();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = changes2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.m2068getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m2071getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m2071getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m2074getTypeT8wyACA(), 0L, 0.0f, 0L, 7168, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                this.lastPointerEvent = pointerEvent;
            }
        }
        pointerEvent = null;
        this.lastPointerEvent = pointerEvent;
    }

    public final void update$ui(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z = !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key1, obj}, getCieXyz.write())).booleanValue();
        this.key1 = obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key2, obj2}, getCieXyz.write())).booleanValue()) {
            z = true;
        }
        this.key2 = obj2;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z = true;
        }
        if (objArr2 == null && objArr != null) {
            z = true;
        }
        boolean z2 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z : true;
        this.keys = objArr;
        if (getPointerInputEventHandler().getClass() != pointerInputEventHandler.getClass() || z2) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new PointerEventHandlerCoroutine[16]);
        this.pointerHandlers = oncreatevirtualviewtranslationrequests;
        this.pointerHandlersLock = oncreatevirtualviewtranslationrequests;
        this.dispatchingPointerHandlers = new onCreateVirtualViewTranslationRequests(new PointerEventHandlerCoroutine[16]);
        this.boundsSize = IntSize.Companion.m3849getZeroYbymL2g();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo2110getExtendedTouchPaddingNHjbRc() {
        long jMo49toSizeXkaWNTQ = mo49toSizeXkaWNTQ(getViewConfiguration().mo2452getMinimumTouchTargetSizeMYxV2XQ());
        long jMo2111getSizeYbymL2g = mo2111getSizeYbymL2g();
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ >> 32)) - ((int) (jMo2111getSizeYbymL2g >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ & 4294967295L)) - ((int) (jMo2111getSizeYbymL2g & 4294967295L))) / 2.0f)) & 4294967295L));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.pointerInputJob;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getPointerInputHandler() {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this._deprecatedPointerInputHandler;
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @onItemDismisslambda0
    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return createFromParcel.INSTANCE;
            }
        });
        this._deprecatedPointerInputHandler = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
