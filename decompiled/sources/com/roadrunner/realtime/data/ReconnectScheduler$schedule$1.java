package com.roadrunner.realtime.data;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.data.GetConfirmationStateImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.liveness.review.presentation.ReviewViewModel;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.login.presentation.welcome.WelcomeViewModel;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.overlay.bubble.service.OverlayCoordinator;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import o.ActivityHandler33;
import o.ActivityState;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreferenceScreen;
import o.ShortNewsContentCardView;
import o.UnsupportedSearchInfo;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.decryptAndGetPasswordBWLJW6A;
import o.deleteDatabaseFile;
import o.divu2uoSUM;
import o.endStream;
import o.execSessionSuccessCallbackCommand;
import o.getAutofillManager;
import o.getContentViewGroupParentLayout;
import o.getHasFixedWidthimpl;
import o.getIsTraversalGroup;
import o.getRouternavigation_release;
import o.getTopD9Ej5fMannotations;
import o.getUnspecifiedrAG3T2kannotations;
import o.lambdasetOfflineMode7;
import o.lambdasetPushToken32;
import o.launchDeeplinkMain;
import o.markCardAsClicked;
import o.r8lambda8L8lXCy99H67Fo1WTKvaQj9opM;
import o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;
import o.setApplicationContext;
import o.setCoppaComplianceInDelay;
import o.setStatusBarBackground;
import o.setSuccessfulruntime;
import o.setWebView;
import o.showSystemUi;
import o.sourceInformationContextOf;
import o.t5;
import o.x1;

/* JADX INFO: loaded from: classes3.dex */
public final class ReconnectScheduler$schedule$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReconnectScheduler$schedule$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.write = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReconnectScheduler$schedule$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReconnectScheduler$schedule$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    private final Object invokeSuspend$com$roadrunner$rider$recruitment$accountcreation$presentation$AccountCreationScreenKt$AccountCreationScreen$6$1$1$6$1(Object obj) {
        getAutofillManager getautofillmanager;
        int i = 2 % 2;
        ActivityHandler33 activityHandler33 = (ActivityHandler33) this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.serializer;
        String str = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            populateViewStructure_androidKtpopulate7.setValue(activityHandler33.read);
            SnackbarHostState snackbarHostState = (SnackbarHostState) this.write;
            setApplicationContext setapplicationcontext = activityHandler33.read;
            String str2 = setapplicationcontext.serializer;
            execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = setapplicationcontext.IconCompatParcelizer;
            if (execsessionsuccesscallbackcommand != null) {
                int i3 = MediaSessionCompatQueueItem + 25;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    String str3 = execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer;
                    str.hashCode();
                    throw null;
                }
                str = execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer;
            }
            String str4 = str;
            setWebView setwebview = (setWebView) populateViewStructure_androidKtpopulate7.getValue();
            if (setwebview != null) {
                int i4 = MediaSessionCompatQueueItem + 111;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getautofillmanager = setwebview.read;
                if (getautofillmanager == null) {
                    getautofillmanager = getAutofillManager.Short;
                }
            } else {
                getautofillmanager = getAutofillManager.Short;
            }
            this.serializer = 1;
            if (SnackbarHostState.RemoteActionCompatParcelizer(snackbarHostState, str2, str4, getautofillmanager, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 1:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 2:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                return ((ReconnectScheduler$schedule$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 4:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 5:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 6:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 7:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 8:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 9:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 10:
                Object objInvokeSuspend = ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = MediaBrowserCompatMediaItem + 123;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 49 / 0;
                }
                return objInvokeSuspend;
            case 11:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 12:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 13:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 14:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 15:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 16:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 17:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 18:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 19:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 20:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 21:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 22:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 23:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 24:
                return ((ReconnectScheduler$schedule$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 25:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 26:
                return ((ReconnectScheduler$schedule$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 27:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 28:
                Object objInvokeSuspend2 = ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i6 = MediaSessionCompatQueueItem + 75;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return objInvokeSuspend2;
                }
                obj3.hashCode();
                throw null;
            default:
                return ((ReconnectScheduler$schedule$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        switch (i3) {
            case 0:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$1 = new ReconnectScheduler$schedule$1((lambdasetPushToken32) this.read, (lambdasetOfflineMode7) obj2, shortNewsContentCardView, 0);
                reconnectScheduler$schedule$1.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$1;
            case 1:
                return new ReconnectScheduler$schedule$1((UnsupportedSearchInfo) this.IconCompatParcelizer, (CustomerUnavailableViewModelV2) this.read, (String) obj2, shortNewsContentCardView, 1);
            case 2:
                return new ReconnectScheduler$schedule$1((CustomerUnavailableViewModelV2) this.IconCompatParcelizer, (showSystemUi) this.read, (String) obj2, shortNewsContentCardView, 2);
            case 3:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$2 = new ReconnectScheduler$schedule$1((GetConfirmationStateImpl) this.read, (r8lambda8L8lXCy99H67Fo1WTKvaQj9opM) obj2, shortNewsContentCardView, 3);
                reconnectScheduler$schedule$2.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$2;
            case 4:
                return new ReconnectScheduler$schedule$1((CodeScanViewModel) this.IconCompatParcelizer, (divu2uoSUM) this.read, (sourceInformationContextOf) obj2, shortNewsContentCardView, 4);
            case 5:
                return new ReconnectScheduler$schedule$1((String) this.IconCompatParcelizer, (r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8) this.read, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 5);
            case 6:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$3 = new ReconnectScheduler$schedule$1((getTopD9Ej5fMannotations) this.read, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 6);
                reconnectScheduler$schedule$3.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$3;
            case 7:
                return new ReconnectScheduler$schedule$1((accessgetLOREM_IPSUM_SOURCEp) this.IconCompatParcelizer, (TakePictureTaskUiModelImpl) this.read, (getHasFixedWidthimpl) obj2, shortNewsContentCardView, 7);
            case 8:
                return new ReconnectScheduler$schedule$1((TakePictureTaskUiModelImpl) this.read, (accessgetLOREM_IPSUM_SOURCEp) obj2, shortNewsContentCardView, 8);
            case 9:
                return new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (setStatusBarBackground) this.read, (SnackbarHostState) obj2, shortNewsContentCardView, 9);
            case 10:
                return new ReconnectScheduler$schedule$1((decryptAndGetPasswordBWLJW6A) this.IconCompatParcelizer, (getRouternavigation_release) this.read, (PreferenceScreen) obj2, shortNewsContentCardView, 10);
            case 11:
                return new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (deleteDatabaseFile) this.read, (SnackbarHostState) obj2, shortNewsContentCardView, 11);
            case 12:
                return new ReconnectScheduler$schedule$1((ReviewViewModel) obj2, shortNewsContentCardView, 12);
            case 13:
                return new ReconnectScheduler$schedule$1((endStream) this.IconCompatParcelizer, (N$b) this.read, (setSuccessfulruntime) obj2, shortNewsContentCardView, 13);
            case 14:
                return new ReconnectScheduler$schedule$1((LoginActivityViewModel) this.IconCompatParcelizer, (getIsTraversalGroup) this.read, (String) obj2, shortNewsContentCardView, 14);
            case 15:
                return new ReconnectScheduler$schedule$1((LoginActivityViewModel) this.read, (markCardAsClicked) obj2, shortNewsContentCardView, 15);
            case 16:
                return new ReconnectScheduler$schedule$1((SignInViewModel) obj2, shortNewsContentCardView, 16);
            case 17:
                return new ReconnectScheduler$schedule$1((WelcomeViewModel) obj2, shortNewsContentCardView, 17);
            case 18:
                return new ReconnectScheduler$schedule$1((MapNavigationImpl) this.IconCompatParcelizer, (MapboxNavigation) this.read, (LocationComponentPluginImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$4 = new ReconnectScheduler$schedule$1((MapNavigationImpl) this.read, (LocationComponentPluginImpl) obj2, shortNewsContentCardView, 19);
                reconnectScheduler$schedule$4.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$4;
            case 20:
                return new ReconnectScheduler$schedule$1((accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, (MapNavigationImpl) this.read, (LocationComponentPluginImpl) obj2, shortNewsContentCardView, 20);
            case 21:
                return new ReconnectScheduler$schedule$1((FetchMapboxRouteUseCase) this.IconCompatParcelizer, (MapboxNavigation) this.read, (RouteOptions) obj2, shortNewsContentCardView, 21);
            case 22:
                return new ReconnectScheduler$schedule$1((getUnspecifiedrAG3T2kannotations) this.IconCompatParcelizer, (SecondaryRouteApi) this.read, (MapboxNavigation) obj2, shortNewsContentCardView, 22);
            case 23:
                return new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (t5) this.read, (SnackbarHostState) obj2, shortNewsContentCardView, 23);
            case 24:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$5 = new ReconnectScheduler$schedule$1((FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2) this.read, (x1) obj2, shortNewsContentCardView, 24);
                reconnectScheduler$schedule$5.IconCompatParcelizer = obj;
                int i4 = MediaSessionCompatQueueItem + 123;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return reconnectScheduler$schedule$5;
                }
                throw null;
            case 25:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$6 = new ReconnectScheduler$schedule$1((OverlayCoordinator) this.read, (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj2, shortNewsContentCardView, 25);
                reconnectScheduler$schedule$6.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$6;
            case 26:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$7 = new ReconnectScheduler$schedule$1((launchDeeplinkMain) obj2, shortNewsContentCardView, 26);
                reconnectScheduler$schedule$7.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$7;
            case 27:
                return new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (setCoppaComplianceInDelay) this.read, (SnackbarHostState) obj2, shortNewsContentCardView, 27);
            case 28:
                return new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (ActivityHandler33) this.read, (SnackbarHostState) obj2, shortNewsContentCardView, 28);
            default:
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$8 = new ReconnectScheduler$schedule$1((ActivityState) this.read, (FragmentActivity) obj2, shortNewsContentCardView, 29);
                reconnectScheduler$schedule$8.IconCompatParcelizer = obj;
                return reconnectScheduler$schedule$8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:246:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:296:0x081d  */
    /* JADX WARN: Code duplicated, block: B:447:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:450:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:455:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:481:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0817 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0432, code lost:
    
        if (r0 == r1) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0858, code lost:
    
        if (r1.invoke(r13, r4, r5, r6, r28) == r12) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0c6a, code lost:
    
        if (r0.emit(r11, r28) == r12) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0c97, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r13 * 1000, r28) == r12) goto L457;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:447:0x0c06, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:456:0x0c97 -> B:458:0x0c9b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.realtime.data.ReconnectScheduler$schedule$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
