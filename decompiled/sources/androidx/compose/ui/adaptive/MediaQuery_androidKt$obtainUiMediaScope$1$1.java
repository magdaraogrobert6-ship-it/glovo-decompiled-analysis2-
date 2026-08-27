package androidx.compose.ui.adaptive;

import android.content.Context;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.C0173graphicsLayer;
import o.GraphicsContextshadowContext1;
import o.ShortNewsContentCardView;
import o.accessgetReusableGraphicsLayerScopep;
import o.component11SzJe1aQ;
import o.component150d7_KjU;
import o.component160d7_KjU;
import o.component180nO6VwU;
import o.createFromParcel;
import o.getCameraDistance;
import o.getContentViewGroupParentLayout;
import o.getRotationX;
import o.graphicsLayer2Xn7asI;
import o.onForgotten;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ Context $context;
    final /* synthetic */ UiMediaScopeImpl $scope;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ UiMediaScopeImpl $scope;
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, shortNewsContentCardView);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.$scope.m212set_windowPostureInyEWag(MediaQuery_androidKt.resolvePosture((component160d7_KjU) this.L$0));
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UiMediaScopeImpl uiMediaScopeImpl, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$scope = uiMediaScopeImpl;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(component160d7_KjU component160d7_kju, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(component160d7_kju, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, UiMediaScopeImpl uiMediaScopeImpl, ShortNewsContentCardView<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$context = context;
        this.$scope = uiMediaScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            component180nO6VwU component180no6vwu = component150d7_KjU.MediaDescriptionCompat;
            Context context = this.$context;
            component180no6vwu.getClass();
            context.getClass();
            getCameraDistance getcameradistance = (getCameraDistance) component180nO6VwU.read.MediaSessionCompatResultReceiverWrapper();
            if (getcameradistance == null) {
                C0173graphicsLayer c0173graphicsLayer = C0173graphicsLayer.RemoteActionCompatParcelizer;
                if (C0173graphicsLayer.RemoteActionCompatParcelizer == null) {
                    ReentrantLock reentrantLock = C0173graphicsLayer.serializer;
                    reentrantLock.lock();
                    try {
                        if (C0173graphicsLayer.RemoteActionCompatParcelizer == null) {
                            try {
                                onForgotten onforgottenIconCompatParcelizer = graphicsLayer2Xn7asI.IconCompatParcelizer();
                                if (onforgottenIconCompatParcelizer != null) {
                                    onForgotten onforgotten = onForgotten.RemoteActionCompatParcelizer;
                                    onforgotten.getClass();
                                    Object objMediaSessionCompatResultReceiverWrapper = onforgottenIconCompatParcelizer.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                                    objMediaSessionCompatResultReceiverWrapper.getClass();
                                    Object objMediaSessionCompatResultReceiverWrapper2 = onforgotten.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                                    objMediaSessionCompatResultReceiverWrapper2.getClass();
                                    if (((BigInteger) objMediaSessionCompatResultReceiverWrapper).compareTo((BigInteger) objMediaSessionCompatResultReceiverWrapper2) >= 0) {
                                        accessgetreusablegraphicslayerscopep = new accessgetReusableGraphicsLayerScopep(context);
                                        if (!accessgetreusablegraphicslayerscopep.IconCompatParcelizer()) {
                                        }
                                    }
                                    C0173graphicsLayer.RemoteActionCompatParcelizer = new C0173graphicsLayer(accessgetreusablegraphicslayerscopep);
                                }
                            } catch (Throwable unused) {
                            }
                            accessgetreusablegraphicslayerscopep = null;
                            C0173graphicsLayer.RemoteActionCompatParcelizer = new C0173graphicsLayer(accessgetreusablegraphicslayerscopep);
                        }
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                getcameradistance = C0173graphicsLayer.RemoteActionCompatParcelizer;
                getcameradistance.getClass();
            }
            getRotationX getrotationx = new getRotationX();
            toContentCaptureSession tocontentcapturesession = new toContentCaptureSession(12);
            GraphicsContextshadowContext1.IconCompatParcelizer();
            component11SzJe1aQ component11szje1aq = new component11SzJe1aQ(getrotationx, getcameradistance, tocontentcapturesession);
            component180nO6VwU.write.getClass();
            Context context2 = this.$context;
            context2.getClass();
            Flow flowWrite = FlowKt.write(new RealImageLoader.AnonymousClass2(component11szje1aq, context2, (ShortNewsContentCardView) null, 25));
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowRemoteActionCompatParcelizer, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
