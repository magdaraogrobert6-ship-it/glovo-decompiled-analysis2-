package kotlinx.coroutines.rx2;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockUiModelImpl;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftUiModelImpl;
import com.roadrunner.rider.state.noorders.presentation.HomeNoOrdersUiModelImpl;
import com.roadrunner.rider.state.quests.presentation.list.QuestListUiModelImpl;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import com.roadrunner.web.presentation.WebViewFragment;
import com.sentiance.core.model.thrift.k$c;
import io.grpc.internal.CallTracer;
import io.reactivex.ObservableEmitter;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.reactive.PublisherAsFlow;
import o.AdjustInstance;
import o.AdjustInstanceExternalSyntheticLambda1;
import o.BrazeCompanion;
import o.BrazeExternalSyntheticLambda9;
import o.BrazeExternalSyntheticLambda96;
import o.BrazeExternalSyntheticLambda99;
import o.BrazeLogger;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RectListDebuggerModifierNode;
import o.SdkClickHandler2;
import o.SessionResponseData;
import o.ShortNewsContentCardView;
import o.StoreInfoUtil;
import o.accesssafeCallFlushDelayedInitPushAnalyticsQueue;
import o.addDuration;
import o.addLong;
import o.areCachedContentCardsStale;
import o.bbExternalSyntheticLambda0;
import o.createFromParcel;
import o.decode;
import o.enableSdk;
import o.getActionViewIntentlambda0;
import o.getAdapterPositionInRecyclerView;
import o.getAdvertisingInfoObject;
import o.getAppSetId;
import o.getCallbackId;
import o.getCieXyz;
import o.getConnectionOptions;
import o.getContentViewGroupParentLayout;
import o.getInstallSessionBackoffStrategy;
import o.getOriginatingPackageName;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getStoreInfoFromClient;
import o.invokeMethod;
import o.lambda316;
import o.lambda317;
import o.lambda318;
import o.logCustomEventlambda1;
import o.logPushNotificationOpenedlambda31;
import o.logPushStoryPageClicked;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.q1;
import o.r8lambda3bU44Zoh4poQG1b9BbDBVanKQ;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA;
import o.r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I;
import o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o;
import o.r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import o.r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs;
import o.removeNodeAtDepth;
import o.saveControlParams;
import o.saveInteger;
import o.saveThirdPartySharingResult;
import o.setConnectionOptions;
import o.setGdprUrl;
import o.setHttpsURLConnectionProvider;
import o.setInputTextSuggestionState;
import o.setInstallTracked;
import o.setLicenseVerificationTracked;
import o.setRolekuIjeqM;
import o.setSdkAuthenticationSignaturelambda11;
import o.setTransactionSuccessful;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.tf;
import o.tg;
import o.toBitmapConfig1JJdX4A;
import o.trackThirdPartySharing;
import o.verifyProperSdkSetuplambda0;
import o.verifyProperSdkSetuplambda2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public int write;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        private static int read = 0;
        private static int serializer = 1;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int write;

        public /* synthetic */ AnonymousClass1(int i, Object obj) {
            this.write = i;
            this.RemoteActionCompatParcelizer = obj;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x022c A[PHI: r14 r15
  0x022c: PHI (r14v49 java.lang.Long) = (r14v48 java.lang.Long), (r14v56 java.lang.Long) binds: [B:88:0x022a, B:85:0x021b] A[DONT_GENERATE, DONT_INLINE]
  0x022c: PHI (r15v39 o.decode) = (r15v38 o.decode), (r15v43 o.decode) binds: [B:88:0x022a, B:85:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:90:0x022f A[PHI: r14 r15
  0x022f: PHI (r14v54 java.lang.Long) = (r14v48 java.lang.Long), (r14v56 java.lang.Long) binds: [B:88:0x022a, B:85:0x021b] A[DONT_GENERATE, DONT_INLINE]
  0x022f: PHI (r15v41 o.decode) = (r15v38 o.decode), (r15v43 o.decode) binds: [B:88:0x022a, B:85:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [o.ShortNewsContentCardView] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v5, types: [androidx.fragment.app.DialogFragment] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            NafathModalFragment nafathModalFragment;
            Object obj2;
            Object objSerializer;
            Object obj3;
            Long l;
            decode decodeVar;
            String str;
            Object obj4;
            Object obj5;
            int i = 2 % 2;
            int i2 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj6 = this.RemoteActionCompatParcelizer;
            int i3 = 26;
            ?? r6 = 0;
            boolean z = true;
            switch (i2) {
                case 0:
                    ((ObservableEmitter) obj6).write(obj);
                    return createfromparcel;
                case 1:
                    RectListDebuggerModifierNode rectListDebuggerModifierNode = (RectListDebuggerModifierNode) obj;
                    BrazeLogger brazeLogger = ((OtpViewModel) obj6).MediaMetadataCompat;
                    brazeLogger.getClass();
                    brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger.write(), rectListDebuggerModifierNode, false, false, false, 29));
                    return createfromparcel;
                case 2:
                    if (((setInputTextSuggestionState) obj) instanceof setRolekuIjeqM) {
                        ((GetAuthStateViewModel) obj6).IconCompatParcelizer();
                    }
                    return createfromparcel;
                case 3:
                    q1 q1Var = (q1) obj;
                    VerificationStatusLifecycleObserverImpl verificationStatusLifecycleObserverImpl = (VerificationStatusLifecycleObserverImpl) obj6;
                    MainActivity mainActivity = (MainActivity) verificationStatusLifecycleObserverImpl.serializer;
                    if (q1Var != null) {
                        long j = q1Var.expiresAtEpochSeconds;
                        if (((Clock) verificationStatusLifecycleObserverImpl.IconCompatParcelizer).instant().getEpochSecond() >= j) {
                            int i4 = read + 55;
                            serializer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Verification status received but already expired — ignoring", new Object[1]);
                            } else {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Verification status received but already expired — ignoring", new Object[0]);
                            }
                        } else {
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            forest.IconCompatParcelizer("Valid verification status received — opening modal", new Object[0]);
                            if (mainActivity.getSupportFragmentManager().findFragmentByTag("com.roadrunner.nafath.presentation.ui.NafathModalFragment") == null) {
                                forest.IconCompatParcelizer("Opening Nafath modal", new Object[0]);
                                String str2 = q1Var.displayCode;
                                String str3 = q1Var.transactionId;
                                str2.getClass();
                                NafathModalFragment nafathModalFragment2 = new NafathModalFragment();
                                Bundle bundle = new Bundle();
                                bundle.putLong("arg_expires_at", j);
                                bundle.putString("arg_display_code", str2);
                                bundle.putString("arg_transaction_id", str3);
                                nafathModalFragment2.setArguments(bundle);
                                nafathModalFragment2.RemoteActionCompatParcelizer(mainActivity.getSupportFragmentManager(), "com.roadrunner.nafath.presentation.ui.NafathModalFragment");
                            } else {
                                forest.IconCompatParcelizer("Nafath modal already visible, skipping open", new Object[0]);
                            }
                        }
                    } else {
                        int i5 = read + 69;
                        serializer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        Fragment fragmentFindFragmentByTag = mainActivity.getSupportFragmentManager().findFragmentByTag("com.roadrunner.nafath.presentation.ui.NafathModalFragment");
                        if (fragmentFindFragmentByTag != null) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Closing Nafath modal", new Object[0]);
                            if (fragmentFindFragmentByTag instanceof NafathModalFragment) {
                                int i7 = read + 33;
                                serializer = i7 % Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                nafathModalFragment = (NafathModalFragment) fragmentFindFragmentByTag;
                            }
                            if (r6 != 0) {
                                r6 = nafathModalFragment;
                                r6.read(false, false);
                            }
                        }
                    }
                    r6 = nafathModalFragment;
                    return createfromparcel;
                case 4:
                    String str4 = (String) obj;
                    BonusCalendarViewModel bonusCalendarViewModel = (BonusCalendarViewModel) obj6;
                    MutableStateFlow mutableStateFlow = bonusCalendarViewModel.RemoteActionCompatParcelizer;
                    do {
                        obj2 = mutableStateFlow.read();
                        if (obj2 instanceof tg) {
                            objSerializer = tg.RemoteActionCompatParcelizer((tg) obj2, true);
                        } else if (obj2 instanceof tf) {
                            int i9 = read + 23;
                            serializer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            objSerializer = tf.serializer((tf) obj2, true);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, objSerializer));
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = bonusCalendarViewModel.read;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    bonusCalendarViewModel.read = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(bonusCalendarViewModel), null, null, new PushEventPublisherImpl$emit$1(bonusCalendarViewModel, str4, r6, i3), 3);
                    return createfromparcel;
                case 5:
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ((OverlayVisibilityBannerUiModelImpl) obj6).write.IconCompatParcelizer(bool);
                    return createfromparcel;
                case 6:
                    r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) obj;
                    r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I r8lambdasxcf6mwwlj1mupt8fjzle1zmi5i = (r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) obj6;
                    MutableStateFlow mutableStateFlow2 = r8lambdasxcf6mwwlj1mupt8fjzle1zmi5i.write;
                    r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq2 = r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.AVAILABLE;
                    if (r8lambda3bu44zoh4poqg1b9bbdbvankq != r8lambda3bu44zoh4poqg1b9bbdbvankq2) {
                        int i11 = read + 7;
                        serializer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    } else {
                        z = false;
                    }
                    mutableStateFlow2.IconCompatParcelizer(new r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks(z));
                    if (r8lambda3bu44zoh4poqg1b9bbdbvankq == r8lambda3bu44zoh4poqg1b9bbdbvankq2) {
                        r8lambdasxcf6mwwlj1mupt8fjzle1zmi5i.serializer.serializer(r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA.CLOSE_SCREEN);
                    }
                    return createfromparcel;
                case 7:
                    if (((Boolean) obj).booleanValue()) {
                        FocusManager.clearFocus$default((FocusManager) obj6, false, 1, null);
                    }
                    return createfromparcel;
                case 8:
                    RectListDebuggerModifierNode rectListDebuggerModifierNode2 = (RectListDebuggerModifierNode) obj;
                    MutableStateFlow mutableStateFlow3 = ((OtpVerificationViewModel) obj6).IconCompatParcelizer;
                    do {
                        obj3 = mutableStateFlow3.read();
                    } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj3, trackThirdPartySharing.write((trackThirdPartySharing) obj3, null, null, null, null, null, false, rectListDebuggerModifierNode2, false, 383)));
                    return createfromparcel;
                case 9:
                    Object objAccess$invalidateTripStatus = RiderSafetyLifecycleManager.access$invalidateTripStatus((RiderSafetyLifecycleManager) obj6, (getCallbackId) obj, shortNewsContentCardView);
                    return objAccess$invalidateTripStatus == CoroutineSingletons.COROUTINE_SUSPENDED ? objAccess$invalidateTripStatus : createfromparcel;
                case 10:
                    getConnectionOptions getconnectionoptions = (getConnectionOptions) obj;
                    CashBlockUiModelImpl cashBlockUiModelImpl = (CashBlockUiModelImpl) obj6;
                    cashBlockUiModelImpl.serializer.IconCompatParcelizer(getconnectionoptions);
                    cashBlockUiModelImpl.write.IconCompatParcelizer(Boolean.valueOf(!(getconnectionoptions instanceof getInstallSessionBackoffStrategy)));
                    return createfromparcel;
                case 11:
                    setGdprUrl setgdprurl = (setGdprUrl) obj;
                    setHttpsURLConnectionProvider sethttpsurlconnectionprovider = (setHttpsURLConnectionProvider) obj6;
                    sethttpsurlconnectionprovider.write.IconCompatParcelizer(setgdprurl);
                    sethttpsurlconnectionprovider.serializer.IconCompatParcelizer(Boolean.valueOf(setgdprurl instanceof setConnectionOptions));
                    return createfromparcel;
                case 12:
                    Boolean bool2 = (Boolean) obj;
                    bool2.getClass();
                    ((FinishedShiftUiModelImpl) obj6).write.IconCompatParcelizer(bool2);
                    return createfromparcel;
                case 13:
                    AdjustInstance adjustInstance = (AdjustInstance) obj;
                    AdjustInstanceExternalSyntheticLambda1 adjustInstanceExternalSyntheticLambda1 = (AdjustInstanceExternalSyntheticLambda1) obj6;
                    adjustInstanceExternalSyntheticLambda1.write.IconCompatParcelizer(Boolean.valueOf(adjustInstance instanceof r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs));
                    adjustInstanceExternalSyntheticLambda1.RemoteActionCompatParcelizer.IconCompatParcelizer(adjustInstance);
                    return createfromparcel;
                case 14:
                    Boolean bool3 = (Boolean) obj;
                    bool3.getClass();
                    ((HomeNoOrdersUiModelImpl) obj6).write.IconCompatParcelizer(bool3);
                    return createfromparcel;
                case 15:
                    addLong addlong = (addLong) obj;
                    QuestListUiModelImpl questListUiModelImpl = (QuestListUiModelImpl) obj6;
                    questListUiModelImpl.write.IconCompatParcelizer(addlong);
                    questListUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!(addlong instanceof addDuration)));
                    return createfromparcel;
                case 16:
                    Integer num = (Integer) obj;
                    if (num != null) {
                        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6).invoke(num);
                    }
                    return createfromparcel;
                case 17:
                    getAppSetId getappsetid = (getAppSetId) obj;
                    invokeMethod invokemethod = (invokeMethod) obj6;
                    invokemethod.RemoteActionCompatParcelizer.IconCompatParcelizer(getappsetid);
                    if ((getappsetid instanceof getAdvertisingInfoObject) && !invokemethod.serializer) {
                        int i13 = read + 77;
                        serializer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            invokemethod.serializer = false;
                            OtpLogger otpLogger = invokemethod.write;
                            getAdvertisingInfoObject getadvertisinginfoobject = (getAdvertisingInfoObject) getappsetid;
                            boolean z2 = getadvertisinginfoobject.write;
                            l = getadvertisinginfoobject.read;
                            decodeVar = otpLogger.IconCompatParcelizer;
                            if (z2) {
                                str = "on";
                            } else {
                                str = "off";
                            }
                        } else {
                            invokemethod.serializer = true;
                            OtpLogger otpLogger2 = invokemethod.write;
                            getAdvertisingInfoObject getadvertisinginfoobject2 = (getAdvertisingInfoObject) getappsetid;
                            boolean z3 = getadvertisinginfoobject2.write;
                            l = getadvertisinginfoobject2.read;
                            decodeVar = otpLogger2.IconCompatParcelizer;
                            if (z3) {
                                str = "on";
                            } else {
                                str = "off";
                            }
                        }
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("current_state", str);
                        String strValueOf = l != null ? String.valueOf(l.longValue()) : null;
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        decodeVar.logEvent("shift_extension_impression", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("shift_id", strValueOf), new onViewAttachedToWindowlambda0("screenName", "nest")));
                    }
                    return createfromparcel;
                case 18:
                    Object obj7 = (SdkClickHandler2) obj;
                    saveInteger saveinteger = (saveInteger) obj6;
                    boolean z4 = obj7 instanceof SessionResponseData;
                    saveinteger.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z4));
                    MutableStateFlow mutableStateFlow4 = saveinteger.write;
                    SdkClickHandler2 sdkClickHandler2 = (SdkClickHandler2) mutableStateFlow4.read();
                    if (z4 && (sdkClickHandler2 instanceof SessionResponseData)) {
                        obj7 = SessionResponseData.read((SessionResponseData) obj7, ((SessionResponseData) sdkClickHandler2).write);
                    }
                    mutableStateFlow4.IconCompatParcelizer(obj7);
                    return createfromparcel;
                case 19:
                    setLicenseVerificationTracked setlicenseverificationtracked = (setLicenseVerificationTracked) obj;
                    getOriginatingPackageName getoriginatingpackagename = (getOriginatingPackageName) obj6;
                    setTransactionSuccessful settransactionsuccessful = getoriginatingpackagename.write.read;
                    setlicenseverificationtracked.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (setlicenseverificationtracked.IconCompatParcelizer) {
                        arrayList.add(new setInstallTracked(settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_auto_accept_title), settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_auto_accept_description)));
                    }
                    if (setlicenseverificationtracked.write) {
                        arrayList.add(new setInstallTracked(settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_shift_extension_title), settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_shift_extension_description)));
                    }
                    getoriginatingpackagename.serializer.IconCompatParcelizer(new StoreInfoUtil(settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_title), settransactionsuccessful.IconCompatParcelizer(R.string.settings_info_button), arrayList));
                    return createfromparcel;
                case 20:
                    saveThirdPartySharingResult savethirdpartysharingresult = (saveThirdPartySharingResult) obj;
                    getStoreInfoFromClient getstoreinfofromclient = (getStoreInfoFromClient) obj6;
                    getstoreinfofromclient.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(savethirdpartysharingresult instanceof saveControlParams));
                    getstoreinfofromclient.RemoteActionCompatParcelizer.IconCompatParcelizer(savethirdpartysharingresult);
                    return createfromparcel;
                case 21:
                    r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao = (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj;
                    if (r8lambdanyj3ixzjgs1drw4t7o1og6tkao != null) {
                        ((SettingsViewModel) obj6).MediaDescriptionCompat.emit(r8lambdanyj3ixzjgs1drw4t7o1og6tkao, shortNewsContentCardView);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                    return createfromparcel;
                case 22:
                    ((r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) obj6).read.IconCompatParcelizer((r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I) obj);
                    return createfromparcel;
                case 23:
                    ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) obj6).IconCompatParcelizer.IconCompatParcelizer((r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) obj);
                    return createfromparcel;
                case 24:
                    getAdapterPositionInRecyclerView getadapterpositioninrecyclerview = (getAdapterPositionInRecyclerView) obj;
                    MutableStateFlow mutableStateFlow5 = ((r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) obj6).read;
                    if (getadapterpositioninrecyclerview != null) {
                        int i14 = read + 67;
                        serializer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    } else {
                        z = false;
                    }
                    mutableStateFlow5.IconCompatParcelizer(Boolean.valueOf(z));
                    return createfromparcel;
                case 25:
                    accesssafeCallFlushDelayedInitPushAnalyticsQueue accesssafecallflushdelayedinitpushanalyticsqueue = (accesssafeCallFlushDelayedInitPushAnalyticsQueue) obj;
                    ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) obj6;
                    if (accesssafecallflushdelayedinitpushanalyticsqueue == null) {
                        return createfromparcel;
                    }
                    double d = accesssafecallflushdelayedinitpushanalyticsqueue.IconCompatParcelizer;
                    double d2 = accesssafecallflushdelayedinitpushanalyticsqueue.serializer;
                    StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "geo:", ",");
                    sbM.append(d2);
                    sbM.append("?q=");
                    sbM.append(d);
                    sbM.append(",");
                    sbM.append(d2);
                    String string = sbM.toString();
                    ((getActionViewIntentlambda0) componentRegistry$Builder.RemoteActionCompatParcelizer).getClass();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                    intent.addFlags(268435456);
                    try {
                        ((Application) componentRegistry$Builder.write).startActivity(intent);
                        return createfromparcel;
                    } catch (ActivityNotFoundException e) {
                        Object objAccess$handleMapNotFound = ComponentRegistry$Builder.access$handleMapNotFound(componentRegistry$Builder, e, shortNewsContentCardView);
                        return objAccess$handleMapNotFound == CoroutineSingletons.COROUTINE_SUSPENDED ? objAccess$handleMapNotFound : createfromparcel;
                    }
                case 26:
                    List listSerializer = ((logPushNotificationOpenedlambda31) obj).serializer;
                    lambda318 lambda318Var = (lambda318) obj6;
                    lambda316 lambda316VarSerializer = lambda318.serializer("vehicle", listSerializer);
                    if (lambda316VarSerializer != null) {
                        int i16 = serializer + 95;
                        read = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        listSerializer = lambda318.serializer(listSerializer, "vehicle", lambda316VarSerializer);
                    }
                    List list = listSerializer;
                    MutableStateFlow mutableStateFlow6 = lambda318Var.serializer;
                    do {
                        obj4 = mutableStateFlow6.read();
                        ((lambda317) obj4).getClass();
                    } while (!mutableStateFlow6.RemoteActionCompatParcelizer(obj4, new lambda317(list)));
                    return createfromparcel;
                case 27:
                    RectListDebuggerModifierNode rectListDebuggerModifierNode3 = (RectListDebuggerModifierNode) obj;
                    MutableStateFlow mutableStateFlow7 = ((TwoFaViewModel) obj6).RemoteActionCompatParcelizer;
                    do {
                        obj5 = mutableStateFlow7.read();
                    } while (!mutableStateFlow7.RemoteActionCompatParcelizer(obj5, setSdkAuthenticationSignaturelambda11.RemoteActionCompatParcelizer((setSdkAuthenticationSignaturelambda11) obj5, null, null, null, false, rectListDebuggerModifierNode3, 31)));
                    return createfromparcel;
                case 28:
                    areCachedContentCardsStale arecachedcontentcardsstale = (areCachedContentCardsStale) obj;
                    MutableStateFlow mutableStateFlow8 = ((VendorReviewOptionUiModelImpl) obj6).write;
                    ReviewState reviewState = arecachedcontentcardsstale != null ? arecachedcontentcardsstale.read : null;
                    int i18 = reviewState == null ? -1 : logPushStoryPageClicked.write[reviewState.ordinal()];
                    if (i18 == -1) {
                        return createfromparcel;
                    }
                    int i19 = read + 87;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    if (i18 == 1) {
                        mutableStateFlow8.IconCompatParcelizer(verifyProperSdkSetuplambda2.serializer);
                        return createfromparcel;
                    }
                    if (i18 == 2) {
                        mutableStateFlow8.IconCompatParcelizer(new verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE));
                        return createfromparcel;
                    }
                    if (i18 == 3) {
                        mutableStateFlow8.IconCompatParcelizer(new verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0.POSITIVE));
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                default:
                    BrazeCompanion brazeCompanion = (BrazeCompanion) obj;
                    WebViewFragment webViewFragment = (WebViewFragment) obj6;
                    LayoutTileBinding layoutTileBinding = webViewFragment.getOnBackPressedDispatcher;
                    layoutTileBinding.getClass();
                    boolean z5 = brazeCompanion instanceof BrazeExternalSyntheticLambda96;
                    int i21 = 8;
                    ((WebView) layoutTileBinding.write).setVisibility(!z5 ? 8 : 0);
                    LayoutTileBinding layoutTileBinding2 = webViewFragment.getOnBackPressedDispatcher;
                    layoutTileBinding2.getClass();
                    ComposeView composeView = (ComposeView) layoutTileBinding2.RemoteActionCompatParcelizer;
                    boolean z6 = brazeCompanion instanceof BrazeExternalSyntheticLambda9;
                    if (z6) {
                        i21 = 0;
                    } else {
                        int i22 = serializer + 105;
                        read = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 != 0) {
                            int i23 = 38 / 0;
                        }
                    }
                    composeView.setVisibility(i21);
                    if (!z5) {
                        if (z6) {
                            LayoutTileBinding layoutTileBinding3 = webViewFragment.getOnBackPressedDispatcher;
                            layoutTileBinding3.getClass();
                            UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{(ComposeView) layoutTileBinding3.RemoteActionCompatParcelizer, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(i3, brazeCompanion), true, -710909711)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
                            return createfromparcel;
                        }
                        if (brazeCompanion instanceof BrazeExternalSyntheticLambda99) {
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    LayoutTileBinding layoutTileBinding4 = webViewFragment.getOnBackPressedDispatcher;
                    layoutTileBinding4.getClass();
                    String url = ((WebView) layoutTileBinding4.write).getUrl();
                    String str5 = ((BrazeExternalSyntheticLambda96) brazeCompanion).write;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url, str5}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel;
                    }
                    LayoutTileBinding layoutTileBinding5 = webViewFragment.getOnBackPressedDispatcher;
                    layoutTileBinding5.getClass();
                    ((WebView) layoutTileBinding5.write).loadUrl(str5);
                    return createfromparcel;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asObservable$1$job$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.read = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asObservable$1$job$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 3:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                Object objInvokeSuspend = ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = MediaDescriptionCompat + 9;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 82 / 0;
                }
                return objInvokeSuspend;
            default:
                return ((RxConvertKt$asObservable$1$job$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r3 r4
  0x0028: PHI (r3v11 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v11 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[PHI: r3 r4
  0x0033: PHI (r3v10 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r4v10 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r3 r4
  0x0047: PHI (r3v9 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r4v9 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005b A[PHI: r3 r4
  0x005b: PHI (r3v8 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r4v8 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[PHI: r3 r4
  0x0078: PHI (r3v6 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r4v6 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0082 A[PHI: r3 r4
  0x0082: PHI (r3v5 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r4v5 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0096 A[PHI: r3 r4
  0x0096: PHI (r3v3 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[PHI: r3 r4
  0x00a2: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v13 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        Object obj3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 5;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = 0;
        if (i3 % 2 == 0) {
            int i5 = this.IconCompatParcelizer;
            obj2 = this.read;
            obj3 = this.serializer;
            switch (i5) {
                case 0:
                    RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1((Flow) obj3, (ObservableEmitter) obj2, shortNewsContentCardView, i4);
                    rxConvertKt$asObservable$1$job$1.RemoteActionCompatParcelizer = obj;
                    return rxConvertKt$asObservable$1$job$1;
                case 1:
                    return new RxConvertKt$asObservable$1$job$1((LazyListState) this.RemoteActionCompatParcelizer, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 1);
                case 2:
                    return new RxConvertKt$asObservable$1$job$1((getAdvertisingInfoObject) obj3, (invokeMethod) obj2, shortNewsContentCardView, i);
                case 3:
                    RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$2 = new RxConvertKt$asObservable$1$job$1((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer, (logCustomEventlambda1) obj3, (SnackbarHostState) obj2, shortNewsContentCardView, 3);
                    int i6 = RatingCompat + 53;
                    MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return rxConvertKt$asObservable$1$job$2;
                case 4:
                    return new RxConvertKt$asObservable$1$job$1((CallTracer) this.RemoteActionCompatParcelizer, (enableSdk) obj3, (enableSdk) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new RxConvertKt$asObservable$1$job$1((k$c) this.RemoteActionCompatParcelizer, (WebResourceRequest) obj3, (getPendingWebViewPauseRunnableandroid_sdk_ui_release) obj2, shortNewsContentCardView, 5);
                case 6:
                    RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$3 = new RxConvertKt$asObservable$1$job$1((r8lambdahgODiqgPByAI8PyoNAxx8PBqX4) obj3, obj2, shortNewsContentCardView, 6);
                    rxConvertKt$asObservable$1$job$3.RemoteActionCompatParcelizer = obj;
                    return rxConvertKt$asObservable$1$job$3;
                default:
                    RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$4 = new RxConvertKt$asObservable$1$job$1((FlowCollector) obj3, (PublisherAsFlow) obj2, shortNewsContentCardView, 7);
                    rxConvertKt$asObservable$1$job$4.RemoteActionCompatParcelizer = obj;
                    return rxConvertKt$asObservable$1$job$4;
            }
        }
        int i8 = this.IconCompatParcelizer;
        obj2 = this.read;
        obj3 = this.serializer;
        int i9 = 44 / 0;
        switch (i8) {
            case 0:
                RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$5 = new RxConvertKt$asObservable$1$job$1((Flow) obj3, (ObservableEmitter) obj2, shortNewsContentCardView, i4);
                rxConvertKt$asObservable$1$job$5.RemoteActionCompatParcelizer = obj;
                return rxConvertKt$asObservable$1$job$5;
            case 1:
                return new RxConvertKt$asObservable$1$job$1((LazyListState) this.RemoteActionCompatParcelizer, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 1);
            case 2:
                return new RxConvertKt$asObservable$1$job$1((getAdvertisingInfoObject) obj3, (invokeMethod) obj2, shortNewsContentCardView, i);
            case 3:
                RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$6 = new RxConvertKt$asObservable$1$job$1((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer, (logCustomEventlambda1) obj3, (SnackbarHostState) obj2, shortNewsContentCardView, 3);
                int i10 = RatingCompat + 53;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return rxConvertKt$asObservable$1$job$6;
            case 4:
                return new RxConvertKt$asObservable$1$job$1((CallTracer) this.RemoteActionCompatParcelizer, (enableSdk) obj3, (enableSdk) obj2, shortNewsContentCardView, 4);
            case 5:
                return new RxConvertKt$asObservable$1$job$1((k$c) this.RemoteActionCompatParcelizer, (WebResourceRequest) obj3, (getPendingWebViewPauseRunnableandroid_sdk_ui_release) obj2, shortNewsContentCardView, 5);
            case 6:
                RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$7 = new RxConvertKt$asObservable$1$job$1((r8lambdahgODiqgPByAI8PyoNAxx8PBqX4) obj3, obj2, shortNewsContentCardView, 6);
                rxConvertKt$asObservable$1$job$7.RemoteActionCompatParcelizer = obj;
                return rxConvertKt$asObservable$1$job$7;
            default:
                RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$8 = new RxConvertKt$asObservable$1$job$1((FlowCollector) obj3, (PublisherAsFlow) obj2, shortNewsContentCardView, 7);
                rxConvertKt$asObservable$1$job$8.RemoteActionCompatParcelizer = obj;
                return rxConvertKt$asObservable$1$job$8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0113, code lost:
    
        if (r0 == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r0 == r6) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
