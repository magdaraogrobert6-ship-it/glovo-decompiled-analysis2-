package com.roadrunner.login.presentation.router;

import android.app.Application;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ShouldNavigateToRecruitmentScreenImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BlurFilter;
import o.IInAppMessageViewWrapper;
import o.SemanticsOwnerKt;
import o.ShortNewsContentCardView;
import o.SqlSchema;
import o.SystemLifecycleSystemLifecycleCallback;
import o.access1000;
import o.accessgetOldDependencyp;
import o.bindBytes;
import o.bindLong;
import o.bindString;
import o.c6;
import o.c7;
import o.c8;
import o.c8ExternalSyntheticLambda1;
import o.cd;
import o.cdExternalSyntheticLambda0;
import o.ce;
import o.createFromParcel;
import o.executeQuerydefault;
import o.getAllSemanticsNodesToMap;
import o.getCieXyz;
import o.getQueryContext;
import o.getRootInfoui;
import o.getUnmergedRootSemanticsNode;
import o.getVersion;
import o.isItemDismissable;
import o.logParameters;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.subscribeToChangeUserEventslambda3;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.unpackMetaValue;
import o.updateAdidI;
import o.use;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class RouterViewModel extends ViewModel {
    private static int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 1;
    public final getVersion ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final transferSessionPackageI MediaBrowserCompatMediaItem;
    public final unpackMetaValue MediaDescriptionCompat;
    public final c6 MediaMetadataCompat;
    public final GetBecomeRiderUriImpl MediaSessionCompatQueueItem;
    public final IncogniaManagerImpl MediaSessionCompatResultReceiverWrapper;
    public final logParameters MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final use PlaybackStateCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU PlaybackStateCompatCustomAction;
    public final FetchRemoteConfigUseCaseImpl RatingCompat;
    public final RouterLogger RemoteActionCompatParcelizer;
    public final getQueryContext ResultReceiver;
    public final Flow r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final access1000 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final RemoteConfigStartupTask r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Path$Companion r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final StateFlow r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ShouldNavigateToRecruitmentScreenImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final getAllSemanticsNodesToMap r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final SystemLifecycleSystemLifecycleCallback r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final subscribeToChangeUserEventslambda3 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final SemanticsOwnerKt read;
    public final MutableStateFlow serializer;
    public final BufferedChannel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel(accessgetOldDependencyp accessgetolddependencyp, RouterLogger routerLogger, getVersion getversion, use useVar, logParameters logparameters, getQueryContext getquerycontext, Path$Companion path$Companion, ShouldNavigateToRecruitmentScreenImpl shouldNavigateToRecruitmentScreenImpl, GetBecomeRiderUriImpl getBecomeRiderUriImpl, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, c6 c6Var, access1000 access1000Var, SemanticsOwnerKt semanticsOwnerKt, RemoteConfigStartupTask remoteConfigStartupTask, transferSessionPackageI transfersessionpackagei, FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, IncogniaManagerImpl incogniaManagerImpl, unpackMetaValue unpackmetavalue, getAllSemanticsNodesToMap getallsemanticsnodestomap, subscribeToChangeUserEventslambda3 subscribetochangeusereventslambda3) {
        super(c6Var.serializer());
        accessgetolddependencyp.getClass();
        routerLogger.getClass();
        getversion.getClass();
        useVar.getClass();
        logparameters.getClass();
        getquerycontext.getClass();
        path$Companion.getClass();
        shouldNavigateToRecruitmentScreenImpl.getClass();
        getBecomeRiderUriImpl.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        c6Var.getClass();
        access1000Var.getClass();
        semanticsOwnerKt.getClass();
        remoteConfigStartupTask.getClass();
        transfersessionpackagei.getClass();
        fetchRemoteConfigUseCaseImpl.getClass();
        incogniaManagerImpl.getClass();
        unpackmetavalue.getClass();
        getallsemanticsnodestomap.getClass();
        subscribetochangeusereventslambda3.getClass();
        this.RemoteActionCompatParcelizer = routerLogger;
        this.ComponentActivity = getversion;
        this.PlaybackStateCompat = useVar;
        this.MediaSessionCompatToken = logparameters;
        this.ResultReceiver = getquerycontext;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = path$Companion;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = shouldNavigateToRecruitmentScreenImpl;
        this.MediaSessionCompatQueueItem = getBecomeRiderUriImpl;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = systemLifecycleSystemLifecycleCallback;
        this.MediaMetadataCompat = c6Var;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = access1000Var;
        this.read = semanticsOwnerKt;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = remoteConfigStartupTask;
        this.MediaBrowserCompatMediaItem = transfersessionpackagei;
        this.RatingCompat = fetchRemoteConfigUseCaseImpl;
        this.MediaSessionCompatResultReceiverWrapper = incogniaManagerImpl;
        this.MediaDescriptionCompat = unpackmetavalue;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = getallsemanticsnodestomap;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = subscribetochangeusereventslambda3;
        BufferedChannel bufferedChannelIconCompatParcelizer = SQLite.IconCompatParcelizer(-2, 6, (IInAppMessageViewWrapper) null);
        this.write = bufferedChannelIconCompatParcelizer;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = FlowKt.write(bufferedChannelIconCompatParcelizer);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new cdExternalSyntheticLambda0("v4.2634.5", null));
        this.serializer = mutableStateFlow;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.ParcelableVolumeInfo = mutableStateFlow2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object openRiderHiringScreen(ContinuationImpl continuationImpl) {
        c8 c8Var;
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 41;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof c8;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof c8) {
            c8Var = (c8) continuationImpl;
            int i3 = c8Var.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c8Var.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                c8Var = new c8(this, continuationImpl);
            }
        } else {
            c8Var = new c8(this, continuationImpl);
        }
        Object objInvoke = c8Var.IconCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = c8Var.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            c8Var.RemoteActionCompatParcelizer = 1;
            objInvoke = this.MediaSessionCompatQueueItem.invoke(c8Var);
            if (objInvoke == obj) {
                int i5 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 27;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return obj;
                }
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 67;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                int i7 = 89 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
        }
        cd cdVar = new cd((Uri) objInvoke);
        if (this.MediaMetadataCompat.write()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new PushEventPublisherImpl$emit$1(this, cdVar, shortNewsContentCardView, 19), 3);
        } else {
            this.ResultReceiver.serializer(cdVar);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static final Object access$initializeViewModel(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        c7 c7Var;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof c7) {
            int i5 = i3 + 69;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            c7Var = (c7) continuationImpl;
            int i7 = c7Var.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 43;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                c7Var.write = i7 - Integer.MIN_VALUE;
            } else {
                c7Var = new c7(routerViewModel, continuationImpl);
            }
        } else {
            c7Var = new c7(routerViewModel, continuationImpl);
        }
        Object objInvoke = c7Var.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = c7Var.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            ShouldNavigateToRecruitmentScreenImpl shouldNavigateToRecruitmentScreenImpl = routerViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            c7Var.write = 1;
            objInvoke = shouldNavigateToRecruitmentScreenImpl.invoke(c7Var);
            if (objInvoke != obj) {
            }
            return obj;
        }
        int i11 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 1;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        if (i10 != 1) {
            if (i10 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return createfromparcel;
            }
            if (i10 == 3) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            c7Var.write = 3;
            if (routerViewModel.resumeWithNormalRiderFlow(c7Var) == obj) {
                return obj;
            }
            return createfromparcel;
        }
        int i13 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 121;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            c7Var.write = 2;
            if (routerViewModel.openRiderHiringScreen(c7Var) == obj) {
                return obj;
            }
            return createfromparcel;
        }
        c7Var.write = 2;
        if (routerViewModel.openRiderHiringScreen(c7Var) == obj) {
            return obj;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (evaluateUsercentrics(r1) == r3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resumeWithNormalRiderFlow(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof o.c8ExternalSyntheticLambda5
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L21
            int r1 = com.roadrunner.login.presentation.router.RouterViewModel.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            int r1 = r1 + 63
            int r3 = r1 % 128
            com.roadrunner.login.presentation.router.RouterViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r3
            int r1 = r1 % r0
            r1 = r8
            o.c8ExternalSyntheticLambda5 r1 = (o.c8ExternalSyntheticLambda5) r1
            int r3 = r1.serializer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L21
            int r3 = r3 + r4
            r1.serializer = r3
            goto L26
        L21:
            o.c8ExternalSyntheticLambda5 r1 = new o.c8ExternalSyntheticLambda5
            r1.<init>(r7, r8)
        L26:
            java.lang.Object r8 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.serializer
            r5 = 3
            r6 = 0
            if (r4 == 0) goto L5d
            if (r4 == r2) goto L51
            if (r4 != r0) goto L4b
            int r1 = com.roadrunner.login.presentation.router.RouterViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.roadrunner.login.presentation.router.RouterViewModel.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L47
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            r8 = 72
            int r8 = r8 / 0
            goto L79
        L47:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L79
        L4b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r6
        L51:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            int r8 = com.roadrunner.login.presentation.router.RouterViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
            int r8 = r8 + r5
            int r2 = r8 % 128
            com.roadrunner.login.presentation.router.RouterViewModel.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r2
            int r8 = r8 % r0
            goto L70
        L5d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            androidx.datastore.core.SingleProcessDataStore$data$1$1 r8 = new androidx.datastore.core.SingleProcessDataStore$data$1$1
            r4 = 22
            r8.<init>(r7, r6, r4)
            r1.serializer = r2
            java.lang.Object r8 = kotlinx.coroutines.YieldKt.coroutineScope(r8, r1)
            if (r8 != r3) goto L70
            goto L78
        L70:
            r1.serializer = r0
            java.lang.Object r8 = r7.evaluateUsercentrics(r1)
            if (r8 != r3) goto L79
        L78:
            return r3
        L79:
            o.c6 r8 = r7.MediaMetadataCompat
            boolean r8 = r8.write()
            if (r8 == 0) goto L8e
            o.asComposePaint r8 = o.toBitmapConfig1JJdX4A.IconCompatParcelizer(r7)
            com.roadrunner.login.presentation.router.RouterViewModel$init$1 r0 = new com.roadrunner.login.presentation.router.RouterViewModel$init$1
            r0.<init>(r7, r6, r5)
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r8, r6, r6, r0, r5)
            goto L95
        L8e:
            o.getQueryContext r8 = r7.ResultReceiver
            o.cf r0 = o.cf.read
            r8.serializer(r0)
        L95:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.RouterViewModel.resumeWithNormalRiderFlow(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object evaluateUsercentrics(ContinuationImpl continuationImpl) {
        c8ExternalSyntheticLambda1 c8externalsyntheticlambda1;
        int i = 2 % 2;
        if (continuationImpl instanceof c8ExternalSyntheticLambda1) {
            c8externalsyntheticlambda1 = (c8ExternalSyntheticLambda1) continuationImpl;
            int i2 = c8externalsyntheticlambda1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c8externalsyntheticlambda1.write = i2 - Integer.MIN_VALUE;
            } else {
                c8externalsyntheticlambda1 = new c8ExternalSyntheticLambda1(this, continuationImpl);
            }
        } else {
            c8externalsyntheticlambda1 = new c8ExternalSyntheticLambda1(this, continuationImpl);
        }
        Object obj = c8externalsyntheticlambda1.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c8externalsyntheticlambda1.write;
        Object obj3 = createFromParcel.INSTANCE;
        subscribeToChangeUserEventslambda3 subscribetochangeusereventslambda3 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            c8externalsyntheticlambda1.write = 1;
            subscribetochangeusereventslambda3.getClass();
            obj = Boolean.FALSE;
            if (obj != obj2) {
            }
        }
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 23;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
            if (i3 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj3;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i5 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 115;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (((Boolean) obj).booleanValue()) {
            getUnmergedRootSemanticsNode getunmergedrootsemanticsnode = (getUnmergedRootSemanticsNode) this.read;
            getunmergedrootsemanticsnode.getClass();
            BlurFilter blurFilter = getunmergedrootsemanticsnode.write.ParcelableVolumeInfo;
            blurFilter.RemoteActionCompatParcelizer("app_start_to_interactive", "destinationScreen", "Consent");
            blurFilter.write("app_start_to_interactive");
            getRootInfoui getrootinfoui = (getRootInfoui) getunmergedrootsemanticsnode.IconCompatParcelizer.write;
            getrootinfoui.RemoteActionCompatParcelizer("app_start_to_interactive_sentry", "destinationScreen", "Consent");
            getrootinfoui.write("app_start_to_interactive_sentry");
            this.IconCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
            int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 31;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        c8externalsyntheticlambda1.write = 2;
        subscribetochangeusereventslambda3.getClass();
        return obj3 == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: access$handleMobileServices-IoAF18A, reason: not valid java name */
    public static final Object m4991access$handleMobileServicesIoAF18A(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        RouterViewModel$handleMobileServices$1 routerViewModel$handleMobileServices$1;
        Object bindstring;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 53;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof RouterViewModel$handleMobileServices$1) {
            routerViewModel$handleMobileServices$1 = (RouterViewModel$handleMobileServices$1) continuationImpl;
            int i4 = routerViewModel$handleMobileServices$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                routerViewModel$handleMobileServices$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                routerViewModel$handleMobileServices$1 = new RouterViewModel$handleMobileServices$1(routerViewModel, continuationImpl);
            }
        } else {
            routerViewModel$handleMobileServices$1 = new RouterViewModel$handleMobileServices$1(routerViewModel, continuationImpl);
        }
        Object bindstring2 = routerViewModel$handleMobileServices$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = routerViewModel$handleMobileServices$1.RemoteActionCompatParcelizer;
        executeQuerydefault executequerydefault = executeQuerydefault.IconCompatParcelizer;
        SqlSchema sqlSchema = SqlSchema.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(bindstring2);
            getVersion getversion = routerViewModel.ComponentActivity;
            routerViewModel$handleMobileServices$1.RemoteActionCompatParcelizer = 1;
            getversion.getClass();
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            googleApiAvailability.getClass();
            Application application = getversion.serializer;
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(application);
            if (iIsGooglePlayServicesAvailable == 0) {
                bindstring = executequerydefault;
            } else if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
                int i6 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 15;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (((FirebaseRemoteConfigImpl) getversion.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_HUAWEI_DEVICE_CHECK_ENABLED.getFirebaseFlagName()) && setCarryoverInAppMessage.serializer(Build.MANUFACTURER, SystemUtils.PRODUCT_HUAWEI, true)) {
                    bindstring = sqlSchema;
                } else {
                    bindstring = new bindString(iIsGooglePlayServicesAvailable, bindLong.GOOGLE);
                }
            } else {
                bindstring = sqlSchema;
            }
            if (bindstring instanceof SqlSchema) {
                int i8 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 55;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
                huaweiApiAvailability.getClass();
                int iIsHuaweiMobileServicesAvailable = huaweiApiAvailability.isHuaweiMobileServicesAvailable(application);
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    bindstring2 = executequerydefault;
                } else {
                    bindstring2 = huaweiApiAvailability.isUserResolvableError(iIsHuaweiMobileServicesAvailable) ? new bindString(iIsHuaweiMobileServicesAvailable, bindLong.HUAWEI) : sqlSchema;
                }
            } else {
                bindstring2 = bindstring;
            }
            if (bindstring2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(bindstring2);
        }
        bindBytes bindbytes = (bindBytes) bindstring2;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bindbytes, executequerydefault}, getCieXyz.write())).booleanValue()) {
            return createFromParcel.INSTANCE;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bindbytes, sqlSchema}, getCieXyz.write())).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(routerViewModel), null, null, new DividerUiModelImpl$1(routerViewModel, shortNewsContentCardView, 26), 3);
            return new isItemDismissable(new Throwable("No mobile services"));
        }
        if (!(bindbytes instanceof bindString)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        ce ceVar = new ce((bindString) bindbytes);
        if (routerViewModel.MediaMetadataCompat.write()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(routerViewModel), null, null, new PushEventPublisherImpl$emit$1(routerViewModel, ceVar, shortNewsContentCardView, 18), 3);
            int i10 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 105;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            routerViewModel.ResultReceiver.serializer(ceVar);
        }
        return new isItemDismissable(new Throwable("Resolvable error related to the mobile services"));
    }
}
