package com.roadrunner.appmigration.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appmigration.model.PhaseVariant;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DrawableTransformation;
import o.SemanticsListener;
import o.SemanticsModifier;
import o.SemanticsNodedefault;
import o.ShortNewsContentCardView;
import o.accessgetIdjd;
import o.createFromParcel;
import o.findCoordinatorToGetBoundsui;
import o.findMergingSemanticsParent;
import o.findOneLayerOfMergingSemanticsNodes;
import o.getBoundsInRoot;
import o.getContentViewGroupParentLayout;
import o.getFailureResponseData;
import o.getIdannotations;
import o.getQueryContext;
import o.getReplacedChildrenui;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.mergedSemanticsConfiguration;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMigrationBannerUiModelImpl implements SemanticsModifier {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public String IconCompatParcelizer;
    public final InitializeAppStartupItemsImpl MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final mergedSemanticsConfiguration MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final GetRiderStatusImpl RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final SemanticsNodedefault serializer;
    public final isOpenInternalroom_runtime write;

    /* JADX INFO: renamed from: com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        public int IconCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ AppMigrationBannerUiModelImpl serializer;

        /* JADX INFO: renamed from: com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00291 implements FlowCollector {
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;
            public final /* synthetic */ AppMigrationBannerUiModelImpl read;
            public final /* synthetic */ int serializer;

            public /* synthetic */ C00291(AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl, int i) {
                this.serializer = i;
                this.read = appMigrationBannerUiModelImpl;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x009c  */
            /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:7:0x0029  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v24 */
            /* JADX WARN: Type inference failed for: r1v25 */
            /* JADX WARN: Type inference failed for: r1v26 */
            /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r1v7 */
            public Object emit(findCoordinatorToGetBoundsui findcoordinatortogetboundsui, ShortNewsContentCardView shortNewsContentCardView) {
                getReplacedChildrenui getreplacedchildrenui;
                PhaseVariant phaseVariant;
                ?? r1;
                Object obj;
                getBoundsInRoot getboundsinroot;
                ?? r2;
                int i;
                ?? r3;
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 109;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl = this.read;
                MutableStateFlow mutableStateFlow = appMigrationBannerUiModelImpl.RemoteActionCompatParcelizer;
                if (shortNewsContentCardView instanceof getReplacedChildrenui) {
                    getreplacedchildrenui = (getReplacedChildrenui) shortNewsContentCardView;
                    int i5 = getreplacedchildrenui.serializer;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        getreplacedchildrenui.serializer = i5 - Integer.MIN_VALUE;
                    } else {
                        getreplacedchildrenui = new getReplacedChildrenui(this, shortNewsContentCardView);
                    }
                } else {
                    getreplacedchildrenui = new getReplacedChildrenui(this, shortNewsContentCardView);
                }
                getReplacedChildrenui getreplacedchildrenui2 = getreplacedchildrenui;
                Object objWithContext = getreplacedchildrenui2.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = getreplacedchildrenui2.serializer;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes = findcoordinatortogetboundsui != null ? findcoordinatortogetboundsui.banner : null;
                    if (findcoordinatortogetboundsui == null || (getboundsinroot = findcoordinatortogetboundsui.popup) == null || (phaseVariant = getboundsinroot.phaseVariant) == null) {
                        phaseVariant = PhaseVariant.PHASE_1;
                    }
                    PhaseVariant phaseVariant2 = phaseVariant;
                    r1 = mutableStateFlow.read() instanceof getIdannotations;
                    if (findonelayerofmergingsemanticsnodes != null) {
                        ((inCompatibilityMode) appMigrationBannerUiModelImpl.write).getClass();
                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                        SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2(appMigrationBannerUiModelImpl, findonelayerofmergingsemanticsnodes, phaseVariant2, null, 12);
                        getreplacedchildrenui2.write = r1;
                        getreplacedchildrenui2.serializer = 1;
                        objWithContext = BuildersKt.withContext(defaultIoScheduler, signInDataStore$set$2, getreplacedchildrenui2);
                        if (objWithContext == coroutineSingletons) {
                            r3 = r1;
                            return coroutineSingletons;
                        }
                    } else {
                        obj = getIdannotations.IconCompatParcelizer;
                        r2 = r1;
                    }
                    mutableStateFlow.IconCompatParcelizer(obj);
                    if (r2 != 0) {
                        i = RemoteActionCompatParcelizer + 107;
                        IconCompatParcelizer = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            boolean z = obj instanceof accessgetIdjd;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (obj instanceof accessgetIdjd) {
                            mergedSemanticsConfiguration mergedsemanticsconfiguration = appMigrationBannerUiModelImpl.MediaMetadataCompat;
                            SemanticsListener semanticsListener = ((accessgetIdjd) obj).RemoteActionCompatParcelizer;
                            String str = appMigrationBannerUiModelImpl.IconCompatParcelizer;
                            mergedsemanticsconfiguration.getClass();
                            str.getClass();
                            mergedsemanticsconfiguration.serializer.IconCompatParcelizer("garnet_banner_viewed", mergedSemanticsConfiguration.IconCompatParcelizer(semanticsListener, str));
                        }
                    }
                    return createFromParcel.INSTANCE;
                }
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i7 = IconCompatParcelizer + 93;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return null;
                }
                int i9 = getreplacedchildrenui2.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                r3 = i9;
                r3 = r1;
                obj = (findMergingSemanticsParent) objWithContext;
                r2 = r3;
                mutableStateFlow.IconCompatParcelizer(obj);
                if (r2 != 0) {
                    i = RemoteActionCompatParcelizer + 107;
                    IconCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        boolean z2 = obj instanceof accessgetIdjd;
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (obj instanceof accessgetIdjd) {
                        mergedSemanticsConfiguration mergedsemanticsconfiguration2 = appMigrationBannerUiModelImpl.MediaMetadataCompat;
                        SemanticsListener semanticsListener2 = ((accessgetIdjd) obj).RemoteActionCompatParcelizer;
                        String str2 = appMigrationBannerUiModelImpl.IconCompatParcelizer;
                        mergedsemanticsconfiguration2.getClass();
                        str2.getClass();
                        mergedsemanticsconfiguration2.serializer.IconCompatParcelizer("garnet_banner_viewed", mergedSemanticsConfiguration.IconCompatParcelizer(semanticsListener2, str2));
                    }
                }
                return createFromParcel.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 113;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this.serializer != 0) {
                    return emit((findCoordinatorToGetBoundsui) obj, shortNewsContentCardView);
                }
                this.read.IconCompatParcelizer = ((getFailureResponseData) obj).RemoteActionCompatParcelizer.getValue();
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i3 = RemoteActionCompatParcelizer + 51;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.serializer = appMigrationBannerUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 87;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl = this.serializer;
            if (i4 == 0) {
                return new AnonymousClass1(appMigrationBannerUiModelImpl, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appMigrationBannerUiModelImpl, shortNewsContentCardView, 1);
            int i5 = RemoteActionCompatParcelizer + 113;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return anonymousClass1;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = write + 69;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i3 = this.read;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = RemoteActionCompatParcelizer + 89;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.read;
            AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl = this.serializer;
            int i3 = 1;
            if (i2 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.IconCompatParcelizer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1IconCompatParcelizer = appMigrationBannerUiModelImpl.RatingCompat.IconCompatParcelizer();
                    C00291 c00291 = new C00291(appMigrationBannerUiModelImpl, 0);
                    this.IconCompatParcelizer = 1;
                    if (getMapScope$invoke$$inlined$map$1IconCompatParcelizer.collect(c00291, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = RemoteActionCompatParcelizer + 109;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.IconCompatParcelizer;
            if (i7 != 0) {
                int i8 = RemoteActionCompatParcelizer;
                int i9 = i8 + 99;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 != 1) {
                    int i11 = i8 + 105;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = appMigrationBannerUiModelImpl.serializer.serializer;
                C00291 c00292 = new C00291(appMigrationBannerUiModelImpl, i3);
                this.IconCompatParcelizer = 1;
                if (mutableStateFlow.collect(c00292, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            }
            DrawableTransformation.read();
            return null;
        }
    }

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 125;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            stateFlow = this.MediaDescriptionCompat;
            int i4 = 43 / 0;
        } else {
            stateFlow = this.MediaDescriptionCompat;
        }
        int i5 = i2 + 1;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppMigrationBannerUiModelImpl(ContextScope contextScope, getQueryContext getquerycontext, SemanticsNodedefault semanticsNodedefault, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, mergedSemanticsConfiguration mergedsemanticsconfiguration, GetRiderStatusImpl getRiderStatusImpl, transferSessionPackageI transfersessionpackagei) {
        getquerycontext.getClass();
        semanticsNodedefault.getClass();
        initializeAppStartupItemsImpl.getClass();
        isopeninternalroom_runtime.getClass();
        mergedsemanticsconfiguration.getClass();
        getRiderStatusImpl.getClass();
        transfersessionpackagei.getClass();
        this.read = getquerycontext;
        this.serializer = semanticsNodedefault;
        this.MediaBrowserCompatMediaItem = initializeAppStartupItemsImpl;
        this.write = isopeninternalroom_runtime;
        this.MediaMetadataCompat = mergedsemanticsconfiguration;
        this.RatingCompat = getRiderStatusImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getIdannotations.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        this.MediaDescriptionCompat = FlowKt.write(new StateProviderImpl$special$$inlined$map$2(mutableStateFlow, 2), contextScope, SharingStarted.Companion.RemoteActionCompatParcelizer, Boolean.FALSE);
        this.IconCompatParcelizer = "";
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_GARNET_MIGRATION_ENABLED)) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
            int i = ParcelableVolumeInfo + 29;
            PlaybackStateCompat = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = PlaybackStateCompat + 93;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
