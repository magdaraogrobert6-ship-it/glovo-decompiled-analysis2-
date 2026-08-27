package com.roadrunner.home.nest.divider;

import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.location.toggle.presentation.bottomsheet.EnableLocationUiModelImpl;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.login.presentation.router.RouterViewModel;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ChildHelper;
import o.DividerItemDecoration;
import o.LetterSpacingSpanEm;
import o.LinearLayoutManager;
import o.ProfileInstallerInitializer;
import o.RxWorker;
import o.ShortNewsContentCardView;
import o.WorkerWrapperKt;
import o.accessdoFetch;
import o.addI;
import o.createFromParcel;
import o.doWork;
import o.emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12;
import o.executeRequestimpl;
import o.findChildView;
import o.getContentViewGroupParentLayout;
import o.getLoaderManager;
import o.getRearDisplayMetrics;
import o.getSpUIouoOA;
import o.getSwipeThreshold;
import o.handleUrlOverridelambda1;
import o.ia;
import o.isApiKeyPresentandroid_sdk_base_releaseannotations;
import o.isFinished;
import o.isPunctuationStartBoundary;
import o.je;
import o.makeFlag;
import o.offsetChildrenVertical;
import o.onAnimation;
import o.onFailure;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setMenuVisibility;
import o.test;
import o.timesadjELrA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DividerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DividerUiModelImpl$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX INFO: renamed from: com.roadrunner.home.nest.divider.DividerUiModelImpl$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;
        public final /* synthetic */ Object IconCompatParcelizer;
        public /* synthetic */ boolean read;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = 2;
            this.read = z;
            this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
            this.read = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = serializer + 31;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            Object obj2 = this.IconCompatParcelizer;
            int i5 = 9;
            int i6 = 0;
            switch (i4) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((ProfileInstallerInitializer) obj2, shortNewsContentCardView, i6);
                    anonymousClass1.read = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((TooltipStateImpl) obj2, shortNewsContentCardView, 1);
                    anonymousClass2.read = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                case 2:
                    return new AnonymousClass1(this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView);
                case 3:
                    AnonymousClass1 anonymousClass3 = new AnonymousClass1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 3);
                    anonymousClass3.read = ((Boolean) obj).booleanValue();
                    int i7 = serializer + 63;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return anonymousClass3;
                case 4:
                    AnonymousClass1 anonymousClass4 = new AnonymousClass1((CustomerUnavailableViewModelV2) obj2, shortNewsContentCardView, 4);
                    anonymousClass4.read = ((Boolean) obj).booleanValue();
                    return anonymousClass4;
                case 5:
                    AnonymousClass1 anonymousClass5 = new AnonymousClass1((timesadjELrA) obj2, shortNewsContentCardView, 5);
                    anonymousClass5.read = ((Boolean) obj).booleanValue();
                    return anonymousClass5;
                case 6:
                    return new AnonymousClass1((test) obj2, this.read, shortNewsContentCardView, 6);
                case 7:
                    AnonymousClass1 anonymousClass6 = new AnonymousClass1((doWork) obj2, this.read, shortNewsContentCardView, 7);
                    int i9 = RemoteActionCompatParcelizer + 51;
                    serializer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 9 / 0;
                    }
                    return anonymousClass6;
                case 8:
                    AnonymousClass1 anonymousClass7 = new AnonymousClass1((onFailure) obj2, shortNewsContentCardView, 8);
                    anonymousClass7.read = ((Boolean) obj).booleanValue();
                    return anonymousClass7;
                default:
                    return new AnonymousClass1((addI) obj2, this.read, shortNewsContentCardView, i5);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i2) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    ((AnonymousClass1) create(bool, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = serializer + 13;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return createfromparcel;
                case 1:
                    Boolean bool2 = (Boolean) obj;
                    bool2.booleanValue();
                    ((AnonymousClass1) create(bool2, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 2:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 3:
                    Boolean bool3 = (Boolean) obj;
                    bool3.booleanValue();
                    ((AnonymousClass1) create(bool3, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 4:
                    Boolean bool4 = (Boolean) obj;
                    bool4.booleanValue();
                    ((AnonymousClass1) create(bool4, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = serializer + 111;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = 1 / 0;
                    }
                    return createfromparcel;
                case 5:
                    Boolean bool5 = (Boolean) obj;
                    bool5.booleanValue();
                    ((AnonymousClass1) create(bool5, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i7 = serializer + 79;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 6:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 7:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 8:
                    Boolean bool6 = (Boolean) obj;
                    bool6.booleanValue();
                    ((AnonymousClass1) create(bool6, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                default:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002d A[PHI: r6 r7
  0x002d: PHI (r6v10 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r7v19 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x0038  */
        /* JADX WARN: Code duplicated, block: B:14:0x0082  */
        /* JADX WARN: Code duplicated, block: B:17:0x008e  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:28:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:33:0x0114 A[PHI: r6 r7
  0x0114: PHI (r6v9 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r7v17 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x0125  */
        /* JADX WARN: Code duplicated, block: B:38:0x0138 A[LOOP:0: B:36:0x0132->B:38:0x0138, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x014e  */
        /* JADX WARN: Code duplicated, block: B:42:0x0161 A[LOOP:1: B:40:0x015b->B:42:0x0161, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:44:0x0172 A[PHI: r6 r7
  0x0172: PHI (r6v8 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0172: PHI (r7v15 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x0181  */
        /* JADX WARN: Code duplicated, block: B:49:0x019e A[LOOP:2: B:47:0x0198->B:49:0x019e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:50:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:53:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:58:0x01f5 A[PHI: r6 r7
  0x01f5: PHI (r6v7 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01f5: PHI (r7v13 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:61:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:63:0x0213 A[PHI: r6 r7
  0x0213: PHI (r6v6 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0213: PHI (r7v11 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x0226 A[PHI: r6 r7
  0x0226: PHI (r6v5 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0226: PHI (r7v9 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x0239 A[PHI: r6 r7
  0x0239: PHI (r6v4 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r7v7 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:69:0x0242  */
        /* JADX WARN: Code duplicated, block: B:71:0x0248 A[PHI: r6 r7
  0x0248: PHI (r6v3 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0248: PHI (r7v5 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:73:0x0251  */
        /* JADX WARN: Code duplicated, block: B:75:0x0257 A[PHI: r6 r7
  0x0257: PHI (r6v2 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0257: PHI (r7v3 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:77:0x026a A[PHI: r6 r7
  0x026a: PHI (r6v1 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v11 o.createFromParcel) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x026a: PHI (r7v1 java.lang.Object) = (r7v0 java.lang.Object), (r7v23 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x01cf A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            createFromParcel createfromparcel;
            Object obj2;
            boolean z;
            test testVar;
            boolean z2;
            ConcurrentHashMap concurrentHashMap;
            Iterator it;
            int i;
            doWork dowork;
            boolean z3;
            ConcurrentHashMap concurrentHashMap2;
            Iterator it2;
            boolean z4;
            onFailure onfailure;
            ContextScope contextScope;
            int i2;
            int i3;
            Context context;
            ContextScope contextScope2;
            ContextScope contextScope3;
            int i4;
            executeRequestimpl executerequestimpl;
            executeRequestimpl executerequestimpl2;
            TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0;
            executeRequestimpl executerequestimpl3;
            LetterSpacingSpanEm letterSpacingSpanEm;
            int i5 = 2;
            int i6 = 2 % 2;
            int i7 = serializer + 105;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i7 % 2 != 0) {
                int i9 = this.write;
                createfromparcel = createFromParcel.INSTANCE;
                obj2 = this.IconCompatParcelizer;
                switch (i9) {
                    case 0:
                        boolean z5 = this.read;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        ((ProfileInstallerInitializer) obj2).serializer.IconCompatParcelizer(Boolean.valueOf(z5));
                        break;
                    case 1:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!this.read) {
                            ((TooltipStateImpl) obj2).IconCompatParcelizer();
                        }
                        break;
                    case 2:
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!this.read) {
                            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2).invoke();
                        }
                        break;
                    case 3:
                        boolean z6 = this.read;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        ((CustomerUnavailableViewModel) obj2).RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z6));
                        break;
                    case 4:
                        boolean z7 = this.read;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        ((CustomerUnavailableViewModelV2) obj2).serializer.IconCompatParcelizer(Boolean.valueOf(z7));
                        break;
                    case 5:
                        z = this.read;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!z) {
                            int i10 = RemoteActionCompatParcelizer + 91;
                            serializer = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            ((timesadjELrA) obj2).IconCompatParcelizer.serializer(getSpUIouoOA.read);
                        }
                        break;
                    case 6:
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        testVar = (test) obj2;
                        z2 = this.read;
                        testVar.serializer = z2;
                        concurrentHashMap = testVar.read;
                        if (z2) {
                            int i12 = RemoteActionCompatParcelizer + 45;
                            serializer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            Collection<RxWorker> collectionValues = concurrentHashMap.values();
                            collectionValues.getClass();
                            for (RxWorker rxWorker : collectionValues) {
                                testVar.RemoteActionCompatParcelizer().requestLocationUpdates(rxWorker.serializer, rxWorker.IconCompatParcelizer, (Looper) null);
                            }
                        } else {
                            Collection collectionValues2 = concurrentHashMap.values();
                            collectionValues2.getClass();
                            it = collectionValues2.iterator();
                            while (it.hasNext()) {
                                i = serializer + 119;
                                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                                if (i % 2 == 0) {
                                    testVar.RemoteActionCompatParcelizer().removeLocationUpdates(((RxWorker) it.next()).IconCompatParcelizer);
                                    int i14 = 31 / 0;
                                } else {
                                    testVar.RemoteActionCompatParcelizer().removeLocationUpdates(((RxWorker) it.next()).IconCompatParcelizer);
                                }
                            }
                        }
                        break;
                    case 7:
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        dowork = (doWork) obj2;
                        z3 = this.read;
                        dowork.serializer = z3;
                        concurrentHashMap2 = dowork.RemoteActionCompatParcelizer;
                        if (z3) {
                            Collection<isFinished> collectionValues3 = concurrentHashMap2.values();
                            collectionValues3.getClass();
                            for (isFinished isfinished : collectionValues3) {
                                dowork.write().requestLocationUpdates(isfinished.IconCompatParcelizer, isfinished.RemoteActionCompatParcelizer, Looper.getMainLooper());
                            }
                        } else {
                            Collection collectionValues4 = concurrentHashMap2.values();
                            collectionValues4.getClass();
                            it2 = collectionValues4.iterator();
                            while (it2.hasNext()) {
                                dowork.write().removeLocationUpdates(((isFinished) it2.next()).RemoteActionCompatParcelizer);
                            }
                        }
                        break;
                    case 8:
                        z4 = this.read;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        onfailure = (onFailure) obj2;
                        if (z4) {
                            Object[] objArr = {(getContentViewGroupParentLayout) onfailure.ResultReceiver.MediaSessionCompatResultReceiverWrapper()};
                            onfailure.MediaSessionCompatQueueItem = (ContextScope) ExtrasKt.read(702708900, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -702708894, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            forest.IconCompatParcelizer("Overlay bubble displayed", new Object[0]);
                            accessdoFetch accessdofetch = onfailure.PlaybackStateCompat;
                            context = onfailure.IconCompatParcelizer;
                            context.getClass();
                            accessdofetch.IconCompatParcelizer(context);
                            accessdofetch.IconCompatParcelizer = new executeRequestimpl(onfailure, 4);
                            contextScope2 = onfailure.MediaSessionCompatQueueItem;
                            if (contextScope2 != null) {
                                BuildersKt.RemoteActionCompatParcelizer(contextScope2, null, null, new OverlayTaskExecutorImpl$observePushEvents$1(onfailure, shortNewsContentCardView, i8), 3);
                            }
                            contextScope3 = onfailure.MediaSessionCompatQueueItem;
                            if (contextScope3 != null) {
                                isPunctuationStartBoundary ispunctuationstartboundary = onfailure.RemoteActionCompatParcelizer;
                                executerequestimpl = new executeRequestimpl(onfailure, i8);
                                executerequestimpl2 = new executeRequestimpl(onfailure, 1);
                                tncComposableFactoryImpl$$ExternalSyntheticLambda0 = new TncComposableFactoryImpl$$ExternalSyntheticLambda0(i5, onfailure);
                                executerequestimpl3 = new executeRequestimpl(onfailure, i5);
                                letterSpacingSpanEm = (LetterSpacingSpanEm) ispunctuationstartboundary;
                                letterSpacingSpanEm.getClass();
                                if (YieldKt.write(contextScope3)) {
                                    BuildersKt.RemoteActionCompatParcelizer(contextScope3, null, null, new MutatorMutex$mutate$2(letterSpacingSpanEm, context, contextScope3, tncComposableFactoryImpl$$ExternalSyntheticLambda0, executerequestimpl, executerequestimpl2, null), 3);
                                    BuildersKt.RemoteActionCompatParcelizer(contextScope3, null, null, new BridgeManager$trackEvent$2(letterSpacingSpanEm, executerequestimpl3, shortNewsContentCardView, 23), 3);
                                    i4 = 0;
                                } else {
                                    i4 = 0;
                                }
                            } else {
                                i4 = 0;
                            }
                            forest.IconCompatParcelizer("OverlayTaskExecutor - initialized", new Object[i4]);
                        } else {
                            onfailure.RemoteActionCompatParcelizer("app is in foreground");
                            contextScope = onfailure.MediaSessionCompatQueueItem;
                            if (contextScope != null) {
                                i3 = serializer + 79;
                                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    YieldKt.write(contextScope, (CancellationException) null);
                                    i2 = 0;
                                    int i15 = 48 / 0;
                                } else {
                                    i2 = 0;
                                    YieldKt.write(contextScope, (CancellationException) null);
                                }
                            } else {
                                i2 = 0;
                            }
                            onfailure.MediaSessionCompatQueueItem = null;
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OverlayTaskExecutor - stop called from ".concat("app is in foreground"), new Object[i2]);
                        }
                        int i16 = serializer + 99;
                        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        addI addi = (addI) obj2;
                        addi.write.logEvent("home_refresh_click", onMove.serializer(onMove.serializer(addi.read.write(), new onViewAttachedToWindowlambda0("screenName", "Home")), new onViewAttachedToWindowlambda0("is_placebo", String.valueOf(this.read))));
                        break;
                }
                return createfromparcel;
            }
            int i18 = this.write;
            createfromparcel = createFromParcel.INSTANCE;
            obj2 = this.IconCompatParcelizer;
            int i19 = 94 / 0;
            switch (i18) {
                case 0:
                    boolean z8 = this.read;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((ProfileInstallerInitializer) obj2).serializer.IconCompatParcelizer(Boolean.valueOf(z8));
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!this.read) {
                        ((TooltipStateImpl) obj2).IconCompatParcelizer();
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!this.read) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2).invoke();
                    }
                    break;
                case 3:
                    boolean z9 = this.read;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((CustomerUnavailableViewModel) obj2).RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z9));
                    break;
                case 4:
                    boolean z10 = this.read;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((CustomerUnavailableViewModelV2) obj2).serializer.IconCompatParcelizer(Boolean.valueOf(z10));
                    break;
                case 5:
                    z = this.read;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!z) {
                        int i110 = RemoteActionCompatParcelizer + 91;
                        serializer = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        ((timesadjELrA) obj2).IconCompatParcelizer.serializer(getSpUIouoOA.read);
                    }
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    testVar = (test) obj2;
                    z2 = this.read;
                    testVar.serializer = z2;
                    concurrentHashMap = testVar.read;
                    if (z2) {
                        int i112 = RemoteActionCompatParcelizer + 45;
                        serializer = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        Collection<RxWorker> collectionValues5 = concurrentHashMap.values();
                        collectionValues5.getClass();
                        while (r1.hasNext()) {
                            testVar.RemoteActionCompatParcelizer().requestLocationUpdates(rxWorker.serializer, rxWorker.IconCompatParcelizer, (Looper) null);
                        }
                    } else {
                        Collection collectionValues6 = concurrentHashMap.values();
                        collectionValues6.getClass();
                        it = collectionValues6.iterator();
                        while (it.hasNext()) {
                            i = serializer + 119;
                            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                testVar.RemoteActionCompatParcelizer().removeLocationUpdates(((RxWorker) it.next()).IconCompatParcelizer);
                                int i114 = 31 / 0;
                            } else {
                                testVar.RemoteActionCompatParcelizer().removeLocationUpdates(((RxWorker) it.next()).IconCompatParcelizer);
                            }
                        }
                    }
                    break;
                case 7:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    dowork = (doWork) obj2;
                    z3 = this.read;
                    dowork.serializer = z3;
                    concurrentHashMap2 = dowork.RemoteActionCompatParcelizer;
                    if (z3) {
                        Collection<isFinished> collectionValues7 = concurrentHashMap2.values();
                        collectionValues7.getClass();
                        while (r1.hasNext()) {
                            dowork.write().requestLocationUpdates(isfinished.IconCompatParcelizer, isfinished.RemoteActionCompatParcelizer, Looper.getMainLooper());
                        }
                    } else {
                        Collection collectionValues8 = concurrentHashMap2.values();
                        collectionValues8.getClass();
                        it2 = collectionValues8.iterator();
                        while (it2.hasNext()) {
                            dowork.write().removeLocationUpdates(((isFinished) it2.next()).RemoteActionCompatParcelizer);
                        }
                    }
                    break;
                case 8:
                    z4 = this.read;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    onfailure = (onFailure) obj2;
                    if (z4) {
                        Object[] objArr2 = {(getContentViewGroupParentLayout) onfailure.ResultReceiver.MediaSessionCompatResultReceiverWrapper()};
                        onfailure.MediaSessionCompatQueueItem = (ContextScope) ExtrasKt.read(702708900, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -702708894, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                        forest2.IconCompatParcelizer("Overlay bubble displayed", new Object[0]);
                        accessdoFetch accessdofetch2 = onfailure.PlaybackStateCompat;
                        context = onfailure.IconCompatParcelizer;
                        context.getClass();
                        accessdofetch2.IconCompatParcelizer(context);
                        accessdofetch2.IconCompatParcelizer = new executeRequestimpl(onfailure, 4);
                        contextScope2 = onfailure.MediaSessionCompatQueueItem;
                        if (contextScope2 != null) {
                            BuildersKt.RemoteActionCompatParcelizer(contextScope2, null, null, new OverlayTaskExecutorImpl$observePushEvents$1(onfailure, shortNewsContentCardView, i8), 3);
                        }
                        contextScope3 = onfailure.MediaSessionCompatQueueItem;
                        if (contextScope3 != null) {
                            isPunctuationStartBoundary ispunctuationstartboundary2 = onfailure.RemoteActionCompatParcelizer;
                            executerequestimpl = new executeRequestimpl(onfailure, i8);
                            executerequestimpl2 = new executeRequestimpl(onfailure, 1);
                            tncComposableFactoryImpl$$ExternalSyntheticLambda0 = new TncComposableFactoryImpl$$ExternalSyntheticLambda0(i5, onfailure);
                            executerequestimpl3 = new executeRequestimpl(onfailure, i5);
                            letterSpacingSpanEm = (LetterSpacingSpanEm) ispunctuationstartboundary2;
                            letterSpacingSpanEm.getClass();
                            if (YieldKt.write(contextScope3)) {
                                i4 = 0;
                            } else {
                                BuildersKt.RemoteActionCompatParcelizer(contextScope3, null, null, new MutatorMutex$mutate$2(letterSpacingSpanEm, context, contextScope3, tncComposableFactoryImpl$$ExternalSyntheticLambda0, executerequestimpl, executerequestimpl2, null), 3);
                                BuildersKt.RemoteActionCompatParcelizer(contextScope3, null, null, new BridgeManager$trackEvent$2(letterSpacingSpanEm, executerequestimpl3, shortNewsContentCardView, 23), 3);
                                i4 = 0;
                            }
                        } else {
                            i4 = 0;
                        }
                        forest2.IconCompatParcelizer("OverlayTaskExecutor - initialized", new Object[i4]);
                    } else {
                        onfailure.RemoteActionCompatParcelizer("app is in foreground");
                        contextScope = onfailure.MediaSessionCompatQueueItem;
                        if (contextScope != null) {
                            i3 = serializer + 79;
                            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                YieldKt.write(contextScope, (CancellationException) null);
                                i2 = 0;
                                int i115 = 48 / 0;
                            } else {
                                i2 = 0;
                                YieldKt.write(contextScope, (CancellationException) null);
                            }
                        } else {
                            i2 = 0;
                        }
                        onfailure.MediaSessionCompatQueueItem = null;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OverlayTaskExecutor - stop called from ".concat("app is in foreground"), new Object[i2]);
                    }
                    int i116 = serializer + 99;
                    RemoteActionCompatParcelizer = i116 % Fields.SpotShadowColor;
                    int i117 = i116 % 2;
                    break;
                default:
                    CoroutineSingletons coroutineSingletons110 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    addI addi2 = (addI) obj2;
                    addi2.write.logEvent("home_refresh_click", onMove.serializer(onMove.serializer(addi2.read.write(), new onViewAttachedToWindowlambda0("screenName", "Home")), new onViewAttachedToWindowlambda0("is_placebo", String.valueOf(this.read))));
                    break;
            }
            return createfromparcel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = null;
        switch (i3) {
            case 0:
                return new DividerUiModelImpl$1((ProfileInstallerInitializer) obj2, shortNewsContentCardView, 0);
            case 1:
                return new DividerUiModelImpl$1((StateDataStoreImpl) obj2, shortNewsContentCardView, 1);
            case 2:
                return new DividerUiModelImpl$1((BrazeManagerImpl) obj2, shortNewsContentCardView, i);
            case 3:
                DividerUiModelImpl$1 dividerUiModelImpl$1 = new DividerUiModelImpl$1((IdentityVerificationActivity) obj2, shortNewsContentCardView, 3);
                int i4 = write + 31;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return dividerUiModelImpl$1;
                }
                throw null;
            case 4:
                DividerUiModelImpl$1 dividerUiModelImpl$2 = new DividerUiModelImpl$1((HelpCenterActivity) obj2, shortNewsContentCardView, 4);
                int i5 = write + 101;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return dividerUiModelImpl$2;
                }
                obj3.hashCode();
                throw null;
            case 5:
                return new DividerUiModelImpl$1((getLoaderManager) obj2, shortNewsContentCardView, 5);
            case 6:
                return new DividerUiModelImpl$1((setMenuVisibility) obj2, shortNewsContentCardView, 6);
            case 7:
                return new DividerUiModelImpl$1((isApiKeyPresentandroid_sdk_base_releaseannotations) obj2, shortNewsContentCardView, 7);
            case 8:
                return new DividerUiModelImpl$1((ChildHelper) obj2, shortNewsContentCardView, 8);
            case 9:
                return new DividerUiModelImpl$1((DividerItemDecoration) obj2, shortNewsContentCardView, 9);
            case 10:
                return new DividerUiModelImpl$1((findChildView) obj2, shortNewsContentCardView, 10);
            case 11:
                return new DividerUiModelImpl$1((makeFlag) obj2, shortNewsContentCardView, 11);
            case 12:
                return new DividerUiModelImpl$1((getSwipeThreshold) obj2, shortNewsContentCardView, 12);
            case 13:
                return new DividerUiModelImpl$1((LinearLayoutManager) obj2, shortNewsContentCardView, 13);
            case 14:
                return new DividerUiModelImpl$1((onAnimation) obj2, shortNewsContentCardView, 14);
            case 15:
                return new DividerUiModelImpl$1((InAppNotificationsRepository) obj2, shortNewsContentCardView, 15);
            case 16:
                DividerUiModelImpl$1 dividerUiModelImpl$3 = new DividerUiModelImpl$1((offsetChildrenVertical) obj2, shortNewsContentCardView, 16);
                int i6 = write + 93;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return dividerUiModelImpl$3;
            case 17:
                return new DividerUiModelImpl$1((LivenessDetectionActivity) obj2, shortNewsContentCardView, 17);
            case 18:
                return new DividerUiModelImpl$1((getRearDisplayMetrics) obj2, shortNewsContentCardView, 18);
            case 19:
                return new DividerUiModelImpl$1((test) obj2, shortNewsContentCardView, 19);
            case 20:
                return new DividerUiModelImpl$1((doWork) obj2, shortNewsContentCardView, 20);
            case 21:
                return new DividerUiModelImpl$1((WorkerWrapperKt) obj2, shortNewsContentCardView, 21);
            case 22:
                return new DividerUiModelImpl$1((emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12) obj2, shortNewsContentCardView, 22);
            case 23:
                return new DividerUiModelImpl$1((EnableLocationUiModelImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new DividerUiModelImpl$1((LoginActivityViewModel) obj2, shortNewsContentCardView, 24);
            case 25:
                return new DividerUiModelImpl$1((OtpViewModel) obj2, shortNewsContentCardView, 25);
            case 26:
                return new DividerUiModelImpl$1((RouterViewModel) obj2, shortNewsContentCardView, 26);
            case 27:
                return new DividerUiModelImpl$1((ia) obj2, shortNewsContentCardView, 27);
            case 28:
                return new DividerUiModelImpl$1((je) obj2, shortNewsContentCardView, 28);
            default:
                return new DividerUiModelImpl$1((FetchMapboxRouteUseCase) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 101;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                Object objInvokeSuspend = ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = serializer + 21;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            case 3:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 7:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 8:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 9:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 10:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 11:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 12:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 13:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 14:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 15:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 16:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 17:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 18:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 19:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 20:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 21:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 22:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 23:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 24:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 25:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 26:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 27:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 28:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((DividerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:342:0x0858, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L343;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.divider.DividerUiModelImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
