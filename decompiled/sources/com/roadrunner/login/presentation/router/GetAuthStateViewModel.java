package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.auth.domain.GetUserAuthenticationStateUseCaseImpl;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.user.properties.domain.SaveUserPropertiesUseCaseImpl;
import com.roadrunner.web.performance.WebViewInitializer;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.bh;
import o.c0ExternalSyntheticLambda0;
import o.c6;
import o.c8ExternalSyntheticOutline0;
import o.c9;
import o.cExternalSyntheticLambda0;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getIndexForKey;
import o.getInputText;
import o.getInputTextdelegate;
import o.getQueryContext;
import o.getTextSelectionRange;
import o.isAdapterPositionOnScreen;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setApiKeyPresentandroid_sdk_base_release;
import o.setInputTextSuggestionState;
import o.setLiveRegionhR3wRGc;
import o.setPaneTitle;
import o.setSelection;
import o.subscribeToChangeUserEventslambda2;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateActivityStateI;
import o.updateAdidI;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthStateViewModel extends ViewModel {
    private static int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final RouterLogger ComponentActivity;
    public final updateActivityStateI IconCompatParcelizer;
    public final SharedResourcePool MediaBrowserCompatMediaItem;
    public final c6 MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final GetUserDataUseCaseImpl MediaSessionCompatQueueItem;
    public final getQueryContext MediaSessionCompatResultReceiverWrapper;
    public final subscribeToChangeUserEventslambda2 MediaSessionCompatToken;
    public final IsUserAuthenticatedWrapper ParcelableVolumeInfo;
    public final getInputText PlaybackStateCompat;
    public final LoadAbTestConfigUseCase PlaybackStateCompatCustomAction;
    public final setApiKeyPresentandroid_sdk_base_release RatingCompat;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final getIndexForKey ResultReceiver;
    public final getAllSemanticsNodesToMap r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Flow r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final SaveUserPropertiesUseCaseImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final BufferedChannel read;
    public final GetUserAuthenticationStateUseCaseImpl serializer;
    public final AuthStateMachine write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAuthStateViewModel(GetUserDataUseCaseImpl getUserDataUseCaseImpl, GetUserAuthenticationStateUseCaseImpl getUserAuthenticationStateUseCaseImpl, getInputText getinputtext, IsUserAuthenticatedWrapper isUserAuthenticatedWrapper, getQueryContext getquerycontext, getIndexForKey getindexforkey, AuthStateMachine authStateMachine, RouterLogger routerLogger, transferSessionPackageI transfersessionpackagei, LoadAbTestConfigUseCase loadAbTestConfigUseCase, updateActivityStateI updateactivitystatei, getAllSemanticsNodesToMap getallsemanticsnodestomap, setApiKeyPresentandroid_sdk_base_release setapikeypresentandroid_sdk_base_release, c6 c6Var, subscribeToChangeUserEventslambda2 subscribetochangeusereventslambda2, SaveUserPropertiesUseCaseImpl saveUserPropertiesUseCaseImpl, SharedResourcePool sharedResourcePool) {
        super(c6Var.serializer());
        getUserDataUseCaseImpl.getClass();
        getUserAuthenticationStateUseCaseImpl.getClass();
        getinputtext.getClass();
        isUserAuthenticatedWrapper.getClass();
        getquerycontext.getClass();
        getindexforkey.getClass();
        authStateMachine.getClass();
        routerLogger.getClass();
        transfersessionpackagei.getClass();
        loadAbTestConfigUseCase.getClass();
        updateactivitystatei.getClass();
        getallsemanticsnodestomap.getClass();
        setapikeypresentandroid_sdk_base_release.getClass();
        c6Var.getClass();
        subscribetochangeusereventslambda2.getClass();
        saveUserPropertiesUseCaseImpl.getClass();
        sharedResourcePool.getClass();
        this.MediaSessionCompatQueueItem = getUserDataUseCaseImpl;
        this.serializer = getUserAuthenticationStateUseCaseImpl;
        this.PlaybackStateCompat = getinputtext;
        this.ParcelableVolumeInfo = isUserAuthenticatedWrapper;
        this.MediaSessionCompatResultReceiverWrapper = getquerycontext;
        this.ResultReceiver = getindexforkey;
        this.write = authStateMachine;
        this.ComponentActivity = routerLogger;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.PlaybackStateCompatCustomAction = loadAbTestConfigUseCase;
        this.IconCompatParcelizer = updateactivitystatei;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getallsemanticsnodestomap;
        this.RatingCompat = setapikeypresentandroid_sdk_base_release;
        this.MediaDescriptionCompat = c6Var;
        this.MediaSessionCompatToken = subscribetochangeusereventslambda2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = saveUserPropertiesUseCaseImpl;
        this.MediaBrowserCompatMediaItem = sharedResourcePool;
        BufferedChannel bufferedChannelIconCompatParcelizer = SQLite.IconCompatParcelizer(-2, 6, (IInAppMessageViewWrapper) null);
        this.read = bufferedChannelIconCompatParcelizer;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = FlowKt.write(bufferedChannelIconCompatParcelizer);
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(5, this));
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 115;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (this.MediaDescriptionCompat.write()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new GetAuthStateViewModel$goToLogin$2(this, shortNewsContentCardView, 0), 3);
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper.serializer(c8ExternalSyntheticOutline0.IconCompatParcelizer);
        int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 107;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public final Object goToLoginBasedOnFeatureFlag(ContinuationImpl continuationImpl) {
        c0ExternalSyntheticLambda0 c0externalsyntheticlambda0;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 5;
        int i4 = i3 % Fields.SpotShadowColor;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i4;
        int i5 = i3 % 2;
        if (!(continuationImpl instanceof c0ExternalSyntheticLambda0)) {
            c0externalsyntheticlambda0 = new c0ExternalSyntheticLambda0(this, continuationImpl);
        } else {
            int i6 = i4 + 121;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            c0externalsyntheticlambda0 = (c0ExternalSyntheticLambda0) continuationImpl;
            int i8 = c0externalsyntheticlambda0.write;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0externalsyntheticlambda0.write = i8 - Integer.MIN_VALUE;
            } else {
                c0externalsyntheticlambda0 = new c0ExternalSyntheticLambda0(this, continuationImpl);
            }
        }
        Object obj = c0externalsyntheticlambda0.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = c0externalsyntheticlambda0.write;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_AUTH_STATE_MACHINE_ENABLED)) {
                IconCompatParcelizer();
                return createFromParcel.INSTANCE;
            }
            StateFlow stateFlow = this.write.read;
            RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(i, this);
            c0externalsyntheticlambda0.write = 1;
            if (stateFlow.collect(anonymousClass1, c0externalsyntheticlambda0) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void RemoteActionCompatParcelizer() {
        Object obj;
        setInputTextSuggestionState setinputtextsuggestionstate;
        int i = 2 % 2;
        AuthStateMachine authStateMachine = this.write;
        int i2 = 3;
        if (authStateMachine.IconCompatParcelizer()) {
            Timber.RemoteActionCompatParcelizer.write(new StaleLogoutStateException());
            int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 115;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 3 / 3;
            }
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("startAuthentication: isLogoutProcessStarted=false", new Object[0]);
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_STALE_LOGOUT_STATE_ENABLED)) {
            MutableStateFlow mutableStateFlow = authStateMachine.IconCompatParcelizer;
            do {
                obj = mutableStateFlow.read();
                setinputtextsuggestionstate = (setInputTextSuggestionState) obj;
                setSelection setselection = setinputtextsuggestionstate.RemoteActionCompatParcelizer;
                if (setselection == setSelection.LOGOUT_REQUESTED || setselection == setSelection.LOGOUT_STARTED) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Resetting stale logout state (" + setselection + ") to INITIAL on app open", new Object[0]);
                    setinputtextsuggestionstate = setLiveRegionhR3wRGc.read;
                    int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 107;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, setinputtextsuggestionstate));
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new GetAuthStateViewModel$goToMain$2(this, null, i2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object loadUserProperties(getTextSelectionRange gettextselectionrange, ContinuationImpl continuationImpl) {
        cExternalSyntheticLambda0 cexternalsyntheticlambda0;
        int i = 2 % 2;
        if (!(continuationImpl instanceof cExternalSyntheticLambda0)) {
            cexternalsyntheticlambda0 = new cExternalSyntheticLambda0(this, continuationImpl);
            int i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 49;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            int i4 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 101;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            cexternalsyntheticlambda0 = (cExternalSyntheticLambda0) continuationImpl;
            int i6 = cexternalsyntheticlambda0.serializer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cexternalsyntheticlambda0.serializer = i6 - Integer.MIN_VALUE;
            } else {
                cexternalsyntheticlambda0 = new cExternalSyntheticLambda0(this, continuationImpl);
                int i7 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 49;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        Object objOfSuspend = cexternalsyntheticlambda0.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = cexternalsyntheticlambda0.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            cexternalsyntheticlambda0.read = gettextselectionrange;
            cexternalsyntheticlambda0.serializer = 1;
            subscribeToChangeUserEventslambda2 subscribetochangeusereventslambda2 = this.MediaSessionCompatToken;
            objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) subscribetochangeusereventslambda2.IconCompatParcelizer).ofSuspend("asti_kiwi_user_properties_loading", new WebViewInitializer.AnonymousClass2(subscribetochangeusereventslambda2, shortNewsContentCardView, 6), cexternalsyntheticlambda0);
            if (objOfSuspend != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 121;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i11 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 89;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            throw null;
        }
        gettextselectionrange = cexternalsyntheticlambda0.read;
        ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
        if (!((Boolean) objOfSuspend).booleanValue()) {
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, gettextselectionrange, shortNewsContentCardView, 24);
            cexternalsyntheticlambda0.read = null;
            cexternalsyntheticlambda0.serializer = 2;
            if (((TraceTimeMeasurementWithPerformanceKit) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).ofSuspend("asti_kiwi_user_properties_migration", authRepository$logoutUser$2, cexternalsyntheticlambda0) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (((com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r12).ofSuspend("asti_auth_go_to_main", r13, r1) == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$onUserAuthenticated(com.roadrunner.login.presentation.router.GetAuthStateViewModel r11, o.getTextSelectionRange r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.GetAuthStateViewModel.access$onUserAuthenticated(com.roadrunner.login.presentation.router.GetAuthStateViewModel, o.getTextSelectionRange, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$goToMain(GetAuthStateViewModel getAuthStateViewModel, ContinuationImpl continuationImpl) {
        bh bhVar;
        boolean z;
        int i = 2 % 2;
        SharedResourcePool sharedResourcePool = getAuthStateViewModel.MediaBrowserCompatMediaItem;
        if (continuationImpl instanceof bh) {
            bhVar = (bh) continuationImpl;
            int i2 = bhVar.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bhVar.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                bhVar = new bh(getAuthStateViewModel, continuationImpl);
            }
        } else {
            bhVar = new bh(getAuthStateViewModel, continuationImpl);
        }
        Object objInvoke = bhVar.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = bhVar.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            z = ((getInputTextdelegate) getAuthStateViewModel.PlaybackStateCompat).read("GetAuthStateViewModel");
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("goToMain: logoutInProgress=", z), new Object[0]);
            if (!(!z)) {
                forest.IconCompatParcelizer("goToMain: logout in progress, staying on auth screen", new Object[0]);
                return obj2;
            }
            IsUserAuthenticatedWrapper isUserAuthenticatedWrapper = getAuthStateViewModel.ParcelableVolumeInfo;
            bhVar.write = z;
            bhVar.IconCompatParcelizer = 1;
            objInvoke = isUserAuthenticatedWrapper.invoke(bhVar);
            if (objInvoke != obj) {
            }
        }
        if (i3 != 1) {
            int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 61;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? i3 != 2 : i3 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            return obj2;
        }
        z = bhVar.write;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        int i6 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 125;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (!((Boolean) objInvoke).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.write(new RouterRuntimeException());
            bhVar.write = z;
            bhVar.IconCompatParcelizer = 2;
            getAuthStateViewModel.write.write(new setPaneTitle("Race condition issue when going to main, user not authenticated"));
            Object objGoToLoginBasedOnFeatureFlag = getAuthStateViewModel.goToLoginBasedOnFeatureFlag(bhVar);
            if (objGoToLoginBasedOnFeatureFlag != obj) {
                objGoToLoginBasedOnFeatureFlag = obj2;
            }
            return objGoToLoginBasedOnFeatureFlag == obj ? obj : obj2;
        }
        int i8 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 119;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            ((IncogniaManagerImpl) sharedResourcePool.IconCompatParcelizer).RemoteActionCompatParcelizer("login", null);
            sharedResourcePool.IconCompatParcelizer();
            getAuthStateViewModel.MediaDescriptionCompat.write();
            throw null;
        }
        ((IncogniaManagerImpl) sharedResourcePool.IconCompatParcelizer).RemoteActionCompatParcelizer("login", null);
        sharedResourcePool.IconCompatParcelizer();
        if (getAuthStateViewModel.MediaDescriptionCompat.write()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel), null, null, new GetAuthStateViewModel$goToMain$2(getAuthStateViewModel, shortNewsContentCardView, i4), 3);
            return obj2;
        }
        getAuthStateViewModel.MediaSessionCompatResultReceiverWrapper.serializer(c9.IconCompatParcelizer);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (((com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r1).ofSuspend("asti_auth_proceed_with_new_user", r11, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (((com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r1).ofSuspend("asti_auth_proceed_with_logout", r11, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (((com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r1).ofSuspend("asti_auth_proceed_with_id_not_verified", r11, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        if (((com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r1).ofSuspend("asti_auth_proceed_on_user_authenticated", r11, r2) == r3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$proceedWithAuth(com.roadrunner.login.presentation.router.GetAuthStateViewModel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.GetAuthStateViewModel.access$proceedWithAuth(com.roadrunner.login.presentation.router.GetAuthStateViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
