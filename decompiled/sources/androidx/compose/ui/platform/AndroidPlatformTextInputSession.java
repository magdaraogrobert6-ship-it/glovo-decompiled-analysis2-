package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, getContentViewGroupParentLayout {
    public static final int $stable = 8;
    private final getContentViewGroupParentLayout coroutineScope;
    private final AtomicReference<SessionMutex.Session<InputMethodSession>> methodSessionMutex = SessionMutex.m153constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass3 anonymousClass3 = AndroidPlatformTextInputSession.this.new AnonymousClass3(shortNewsContentCardView);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                final AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(this));
                cancellableContinuationImpl.read();
                androidPlatformTextInputSession.textInputService.startInput();
                cancellableContinuationImpl.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(Throwable th) {
                        inputMethodSession.dispose();
                        androidPlatformTextInputSession.textInputService.stopInput();
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return createFromParcel.INSTANCE;
                    }
                });
                if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }

        public AnonymousClass3(ShortNewsContentCardView<? super AnonymousClass3> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(InputMethodSession inputMethodSession, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ((AnonymousClass3) create(inputMethodSession, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m157getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, o.getContentViewGroupParentLayout
    public TextAnnouncementContentCardView getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m157getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = getcontentviewgroupparentlayout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public Object startInputMethod(final PlatformTextInputMethodRequest platformTextInputMethodRequest, ShortNewsContentCardView<?> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AtomicReference<SessionMutex.Session<InputMethodSession>> atomicReference = this.methodSessionMutex;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final InputMethodSession invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
                    PlatformTextInputMethodRequest platformTextInputMethodRequest2 = platformTextInputMethodRequest;
                    final AndroidPlatformTextInputSession androidPlatformTextInputSession = this;
                    return new InputMethodSession(platformTextInputMethodRequest2, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod.2.1
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m2693invoke() {
                            YieldKt.write(androidPlatformTextInputSession.coroutineScope, (CancellationException) null);
                        }

                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m2693invoke();
                            return createFromParcel.INSTANCE;
                        }
                    });
                }
            };
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
            anonymousClass1.label = 1;
            if (SessionMutex.m160withSessionCancellingPreviousimpl(atomicReference, r8lambdaunavo3sxub_pc9xroryotnrlvsm, anonymousClass3, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }
}
