package com.roadrunner.twofa.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.b1$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.liveness.review.presentation.ReviewViewModel;
import com.roadrunner.liveness.review.presentation.compose.ReviewScreenKt;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.roadrunner.twofa.presentation.compose.TwoFaScreenKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC0162f;
import o.AndroidColorFilter_androidKt;
import o.AndroidContentCaptureManager;
import o.C0179j;
import o.C0180k;
import o.C0188n;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DragAndDropNodeKtDragAndDropTargetModifierNode1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsPropertyKeydefault;
import o.SwitchKt;
import o.addRect;
import o.af;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.cubicTo;
import o.d4ExternalSyntheticLambda2;
import o.displayInAppMessagelambda1;
import o.fastForEachIndexedWithFilter;
import o.getBirthDateFull;
import o.getCachedCardsAsEvent;
import o.getCreditCardExpirationMonth;
import o.getInvalidationTracker;
import o.getMergePolicyui;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.isInvalidIndex;
import o.markCardAsDismissed;
import o.onBackPressedDispatcher_delegatelambda010;
import o.onDependentViewRemoved;
import o.onInterceptTouchEvent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.removeGlobalCallbackParameters;
import o.removeGlobalCallbackParametersI;
import o.removeGlobalPartnerParameter;
import o.safeCallFlushDelayedInitPushAnalyticsQueuelambda1;
import o.sendDragEventEu1f8Dk;
import o.setCurrentItem;
import o.setPathEffect;
import o.setStrokeJoinWw9F2mQ;
import o.subscribeToBannersErrorslambda1;
import o.times7Ah8Wj8;
import o.toAndroidVertexModeJOOmi9M;
import o.trackThirdPartySharing;
import o.validateColorStops;
import okhttp3.Cookie$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TwoFaNavigationImpl$$ExternalSyntheticLambda0 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ isInvalidIndex serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(safeCallFlushDelayedInitPushAnalyticsQueuelambda1 safecallflushdelayedinitpushanalyticsqueuelambda1, SwitchKt switchKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2) {
        this.write = safecallflushdelayedinitpushanalyticsqueuelambda1;
        this.RemoteActionCompatParcelizer = switchKt;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.RatingCompat = networkingCoreModule$$ExternalSyntheticLambda2;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, SemanticsPropertyKeydefault semanticsPropertyKeydefault, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SwitchKt switchKt, relativeMoveTo relativemoveto, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getInvalidationTracker getinvalidationtracker) {
        this.write = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.MediaSessionCompatQueueItem = semanticsPropertyKeydefault;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = switchKt;
        this.MediaMetadataCompat = relativemoveto;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = getinvalidationtracker;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, relativeMoveTo relativemoveto, SwitchKt switchKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getInvalidationTracker getinvalidationtracker) {
        this.write = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = relativemoveto;
        this.RemoteActionCompatParcelizer = switchKt;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RatingCompat = getinvalidationtracker;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, SwitchKt switchKt) {
        this.write = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RemoteActionCompatParcelizer = switchKt;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, Modifier modifier) {
        this.write = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.RatingCompat = modifier;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ TwoFaNavigationImpl$$ExternalSyntheticLambda0(StateFlow stateFlow, SwitchKt switchKt, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, relativeMoveTo relativemoveto, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4) {
        this.write = stateFlow;
        this.RemoteActionCompatParcelizer = switchKt;
        this.serializer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.MediaSessionCompatQueueItem = relativemoveto;
        this.MediaMetadataCompat = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
        this.IconCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
        this.RatingCompat = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0433  */
    /* JADX WARN: Code duplicated, block: B:134:0x051f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0561  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d1  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        Object obj5;
        Modifier modifierIconCompatParcelizer;
        int i;
        String string2;
        createFromParcel createfromparcel;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        boolean zIconCompatParcelizer;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zIconCompatParcelizer2;
        boolean z7;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        boolean z8;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        boolean z9;
        Object objComponentActivity2;
        int i2 = 2 % 2;
        int i3 = this.read;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj6 = this.RatingCompat;
        Object obj7 = this.IconCompatParcelizer;
        Object obj8 = this.RemoteActionCompatParcelizer;
        Object obj9 = this.MediaMetadataCompat;
        Object obj10 = this.MediaSessionCompatQueueItem;
        isInvalidIndex isinvalidindex = this.serializer;
        Object obj11 = this.write;
        if (i3 == 0) {
            SwitchKt switchKt = (SwitchKt) obj8;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj10;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj9;
            NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = (NetworkingCoreModule$$ExternalSyntheticLambda2) obj6;
            cubicTo cubicto = (cubicTo) obj2;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            cubicto.getClass();
            TwoFaViewModel twoFaViewModel = (TwoFaViewModel) Cookie$Companion.IconCompatParcelizer(TwoFaViewModel.class, ((safeCallFlushDelayedInitPushAnalyticsQueuelambda1) obj11).write, getbirthdatefull);
            validateColorStops validatecolorstops = cubicto.MediaBrowserCompatMediaItem;
            Bundle bundleRemoteActionCompatParcelizer = validatecolorstops.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer != null) {
                int i4 = MediaDescriptionCompat + 121;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                string = bundleRemoteActionCompatParcelizer.getString("phoneNumber");
            } else {
                string = null;
            }
            if (string != null) {
                int i6 = MediaDescriptionCompat + 45;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    validatecolorstops.RemoteActionCompatParcelizer();
                    throw null;
                }
                Bundle bundleRemoteActionCompatParcelizer2 = validatecolorstops.RemoteActionCompatParcelizer();
                String string3 = bundleRemoteActionCompatParcelizer2 != null ? bundleRemoteActionCompatParcelizer2.getString("flowId") : null;
                if (string3 != null) {
                    Bundle bundleRemoteActionCompatParcelizer3 = validatecolorstops.RemoteActionCompatParcelizer();
                    String string4 = bundleRemoteActionCompatParcelizer3 != null ? bundleRemoteActionCompatParcelizer3.getString("password") : null;
                    if (string4 != null) {
                        int i7 = MediaBrowserCompatMediaItem + 53;
                        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt);
                            i = 1;
                        } else {
                            modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt);
                            i = 0;
                        }
                        TwoFaScreenKt.TwoFaScreen(twoFaViewModel, string, string3, string4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, networkingCoreModule$$ExternalSyntheticLambda2, modifierIconCompatParcelizer, getbirthdatefull, i);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("password must not be null");
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("flow id must not be null");
                }
                obj5 = null;
            } else {
                obj5 = null;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Phone number must not be null");
            }
            return obj5;
        }
        if (i3 == 1) {
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) isinvalidindex;
            relativeMoveTo relativemoveto = (relativeMoveTo) obj10;
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj9;
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj7;
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj6;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write((StateFlow) obj11, getbirthdatefull2, 0);
            Modifier modifierIconCompatParcelizer2 = PaddingKt.IconCompatParcelizer(Modifier.Companion, (SwitchKt) obj8);
            onDependentViewRemoved ondependentviewremoved = (onDependentViewRemoved) populateViewStructure_androidKtpopulate7Write.getValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull2;
            boolean z10 = getpostalcode.read(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z10 | zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new DeviceManager$$ExternalSyntheticLambda1(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, 19, relativemoveto);
                getpostalcode.write(objComponentActivity3);
            }
            onInterceptTouchEvent.read(0, getpostalcode, modifierIconCompatParcelizer2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4, ondependentviewremoved, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3);
            return createfromparcel2;
        }
        if (i3 == 2) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj11;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj10;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
            SwitchKt switchKt2 = (SwitchKt) obj8;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            asFrameworkPaint asframeworkpaintIconCompatParcelizer = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull3);
            if (asframeworkpaintIconCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            ReviewViewModel reviewViewModel = (ReviewViewModel) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer, displayInAppMessagelambda1.serializer(ReviewViewModel.class), r8lambdaudhhxliolpu0hpccqh6voskpny, (asframeworkpaintIconCompatParcelizer instanceof AndroidColorFilter_androidKt) ^ true ? setPathEffect.IconCompatParcelizer : ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras());
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(reviewViewModel.MediaSessionCompatQueueItem, getbirthdatefull3, 0);
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull3;
            boolean z11 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (z11 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new b1$$ExternalSyntheticLambda0(20, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode2.write(objComponentActivity4);
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode2, 0, 1);
            getQueryContext getquerycontext = reviewViewModel.RemoteActionCompatParcelizer;
            boolean z12 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm6);
            boolean z13 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
            boolean z14 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm7);
            boolean z15 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if ((z12 | z13 | z14 | z15) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new NavControllerImpl$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm7, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, 16);
                getpostalcode2.write(objComponentActivity5);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode2, 8);
            setCurrentItem setcurrentitem = (setCurrentItem) populateViewStructure_androidKtpopulate7Write2.getValue();
            boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(reviewViewModel);
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(29, reviewViewModel);
                getpostalcode2.write(objComponentActivity6);
            }
            ReviewScreenKt.IconCompatParcelizer(setcurrentitem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6, PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt2), getpostalcode2, 0);
            return createfromparcel2;
        }
        if (i3 == 3) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj11;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
            relativeMoveTo relativemoveto2 = (relativeMoveTo) obj7;
            SwitchKt switchKt3 = (SwitchKt) obj8;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj10;
            getInvalidationTracker getinvalidationtracker = (getInvalidationTracker) obj6;
            cubicTo cubicto2 = (cubicTo) obj2;
            getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            cubicto2.getClass();
            Bundle bundleRemoteActionCompatParcelizer4 = cubicto2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer4 == null || (string2 = bundleRemoteActionCompatParcelizer4.getString("userName")) == null) {
                string2 = "";
            }
            C0180k c0180k = (C0180k) Cookie$Companion.IconCompatParcelizer(C0180k.class, r8lambdaudhhxliolpu0hpccqh6voskpny2, getbirthdatefull4);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = DragAndDropNodeKtDragAndDropTargetModifierNode1.read(c0180k.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer, getbirthdatefull4);
            getQueryContext getquerycontext2 = c0180k.MediaDescriptionCompat;
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull4;
            boolean z16 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k5);
            boolean zIconCompatParcelizer5 = getpostalcode3.IconCompatParcelizer(relativemoveto2);
            Object objComponentActivity7 = getpostalcode3.ComponentActivity();
            if (!z16 && !zIconCompatParcelizer5) {
                int i8 = MediaBrowserCompatMediaItem + 47;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (objComponentActivity7 == androidContentCaptureManager) {
                    objComponentActivity7 = new af(r8lambdardpfsr94j4iebcwx_kpqzpm8k5, relativemoveto2);
                    getpostalcode3.write(objComponentActivity7);
                }
            } else {
                objComponentActivity7 = new af(r8lambdardpfsr94j4iebcwx_kpqzpm8k5, relativemoveto2);
                getpostalcode3.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer6 = getpostalcode3.IconCompatParcelizer(c0180k);
            boolean z17 = getpostalcode3.read(string2);
            Object objComponentActivity8 = getpostalcode3.ComponentActivity();
            if ((zIconCompatParcelizer6 | z17) || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new GetNestScope$invoke$3(c0180k, string2, null, 27);
                getpostalcode3.write(objComponentActivity8);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, string2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity8);
            boolean z18 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
            Object objComponentActivity9 = getpostalcode3.ComponentActivity();
            if (z18) {
                objComponentActivity9 = new b1$$ExternalSyntheticLambda0(24, r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
                getpostalcode3.write(objComponentActivity9);
            } else {
                int i10 = MediaDescriptionCompat + 119;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (objComponentActivity9 == androidContentCaptureManager) {
                    objComponentActivity9 = new b1$$ExternalSyntheticLambda0(24, r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
                    getpostalcode3.write(objComponentActivity9);
                }
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9, getpostalcode3, 0, 1);
            C0179j c0179j = (C0179j) populateViewStructure_androidKtpopulate7.getValue();
            if (c0179j == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("View state should not be null in forgot password flow");
                return null;
            }
            int i12 = MediaBrowserCompatMediaItem + 9;
            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(c0180k);
            Object objComponentActivity10 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer7 || objComponentActivity10 == androidContentCaptureManager) {
                objComponentActivity10 = new LoginActivity$onCreate$1$1$1$1$5$1(0, c0180k, C0180k.class, "onRequestNewPasswordClicked", "onRequestNewPasswordClicked()V", 0, 27);
                getpostalcode3.write(objComponentActivity10);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity10;
            boolean zIconCompatParcelizer8 = getpostalcode3.IconCompatParcelizer(c0180k);
            Object objComponentActivity11 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer8 || objComponentActivity11 == androidContentCaptureManager) {
                objComponentActivity11 = new LoginActivity$onCreate$1$1$1$1$5$1(0, c0180k, C0180k.class, "onScreenOpened", "onScreenOpened()V", 0, 28);
                getpostalcode3.write(objComponentActivity11);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity11;
            boolean zIconCompatParcelizer9 = getpostalcode3.IconCompatParcelizer(c0180k);
            Object objComponentActivity12 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity12 == androidContentCaptureManager) {
                objComponentActivity12 = new LoginActivity$onCreate$1$1$1$1$5$1(0, c0180k, C0180k.class, "onScreenClosed", "onScreenClosed()V", 0, 29);
                getpostalcode3.write(objComponentActivity12);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity12;
            boolean zIconCompatParcelizer10 = getpostalcode3.IconCompatParcelizer(c0180k);
            Object objComponentActivity13 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer10 || objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = new NafathModalContentKt$NafathModal$1$1(0, c0180k, C0180k.class, "onAlternateForgetPasswordTypeClicked", "onAlternateForgetPasswordTypeClicked()V", 0, 1);
                getpostalcode3.write(objComponentActivity13);
            }
            Modifier modifierIconCompatParcelizer3 = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity13);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2;
            boolean zIconCompatParcelizer11 = getpostalcode3.IconCompatParcelizer(relativemoveto2);
            Object objComponentActivity14 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer11 || objComponentActivity14 == androidContentCaptureManager) {
                objComponentActivity14 = new C0188n(relativemoveto2, 1);
                getpostalcode3.write(objComponentActivity14);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity14;
            boolean zIconCompatParcelizer12 = getpostalcode3.IconCompatParcelizer(relativemoveto2);
            Object objComponentActivity15 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer12 || objComponentActivity15 == androidContentCaptureManager) {
                objComponentActivity15 = new C0188n(relativemoveto2, 2);
                getpostalcode3.write(objComponentActivity15);
            }
            AbstractC0162f.serializer(c0179j, getquerycontext2, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, r8lambdardpfsr94j4iebcwx_kpqzpm8k10, r8lambdaunavo3sxub_pc9xroryotnrlvsm8, r8lambdaunavo3sxub_pc9xroryotnrlvsm9, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm10, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity15, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, modifierIconCompatParcelizer3, getinvalidationtracker, getpostalcode3, 72, 0);
            return createfromparcel2;
        }
        if (i3 == 4) {
            SemanticsPropertyKeydefault semanticsPropertyKeydefault = (SemanticsPropertyKeydefault) obj10;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            SwitchKt switchKt4 = (SwitchKt) obj8;
            relativeMoveTo relativemoveto3 = (relativeMoveTo) obj9;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
            getInvalidationTracker getinvalidationtracker2 = (getInvalidationTracker) obj6;
            getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            SignInViewModel signInViewModel = (SignInViewModel) Cookie$Companion.IconCompatParcelizer(SignInViewModel.class, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj11, getbirthdatefull5);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = DragAndDropNodeKtDragAndDropTargetModifierNode1.read(signInViewModel.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer, getbirthdatefull5);
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull5;
            boolean zIconCompatParcelizer13 = getpostalcode4.IconCompatParcelizer(signInViewModel);
            Object objComponentActivity16 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer13 || objComponentActivity16 == androidContentCaptureManager) {
                objComponentActivity16 = new HomeViewModel.AnonymousClass1(signInViewModel, null, 22);
                getpostalcode4.write(objComponentActivity16);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode4, createfromparcel2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity16);
            getMergePolicyui getmergepolicyui = (getMergePolicyui) signInViewModel.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer14 = getpostalcode4.IconCompatParcelizer(signInViewModel);
            boolean z19 = getpostalcode4.read(populateViewStructure_androidKtpopulate8);
            boolean z20 = getpostalcode4.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm11);
            Object objComponentActivity17 = getpostalcode4.ComponentActivity();
            if ((zIconCompatParcelizer14 | z19 | z20) || objComponentActivity17 == androidContentCaptureManager) {
                objComponentActivity17 = new NestScreenKt$$ExternalSyntheticLambda0(signInViewModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm11, populateViewStructure_androidKtpopulate8, 10);
                getpostalcode4.write(objComponentActivity17);
            }
            SemanticsPropertyKeydefault.RemoteActionCompatParcelizer(semanticsPropertyKeydefault, getmergepolicyui, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity17, null, null, 12).invoke(getpostalcode4, 0);
            Modifier modifierIconCompatParcelizer4 = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt4);
            d4ExternalSyntheticLambda2 d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) populateViewStructure_androidKtpopulate8.getValue();
            d4externalsyntheticlambda2.getClass();
            boolean zIconCompatParcelizer15 = getpostalcode4.IconCompatParcelizer(relativemoveto3);
            Object objComponentActivity18 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer15) {
                objComponentActivity18 = new C0188n(relativemoveto3, 0);
                getpostalcode4.write(objComponentActivity18);
            } else {
                int i14 = MediaDescriptionCompat + 27;
                MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity18 == androidContentCaptureManager) {
                    objComponentActivity18 = new C0188n(relativemoveto3, 0);
                    getpostalcode4.write(objComponentActivity18);
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity18;
            boolean zIconCompatParcelizer16 = getpostalcode4.IconCompatParcelizer(relativemoveto3);
            Object objComponentActivity19 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer16 || objComponentActivity19 == androidContentCaptureManager) {
                objComponentActivity19 = new addRect(relativemoveto3, 8);
                getpostalcode4.write(objComponentActivity19);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity19;
            boolean zIconCompatParcelizer17 = getpostalcode4.IconCompatParcelizer(relativemoveto3);
            Object objComponentActivity20 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer17 || objComponentActivity20 == androidContentCaptureManager) {
                objComponentActivity20 = new C0188n(relativemoveto3, 6);
                getpostalcode4.write(objComponentActivity20);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity20;
            boolean zIconCompatParcelizer18 = getpostalcode4.IconCompatParcelizer(relativemoveto3);
            Object objComponentActivity21 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer18 || objComponentActivity21 == androidContentCaptureManager) {
                objComponentActivity21 = new C0188n(relativemoveto3, 7);
                getpostalcode4.write(objComponentActivity21);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity21;
            boolean zIconCompatParcelizer19 = getpostalcode4.IconCompatParcelizer(signInViewModel);
            Object objComponentActivity22 = getpostalcode4.ComponentActivity();
            if (zIconCompatParcelizer19 || objComponentActivity22 == androidContentCaptureManager) {
                objComponentActivity22 = new markCardAsDismissed(signInViewModel, 1);
                getpostalcode4.write(objComponentActivity22);
            }
            getCachedCardsAsEvent.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm11, d4externalsyntheticlambda2, r8lambdaunavo3sxub_pc9xroryotnrlvsm12, r8lambdardpfsr94j4iebcwx_kpqzpm8k12, r8lambdaunavo3sxub_pc9xroryotnrlvsm13, r8lambdaunavo3sxub_pc9xroryotnrlvsm14, r8lambdardpfsr94j4iebcwx_kpqzpm8k11, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity22, modifierIconCompatParcelizer4, getinvalidationtracker2, getpostalcode4, 64);
            return createfromparcel2;
        }
        if (i3 == 5) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj11;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm16 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj10;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k14 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm17 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj9;
            Modifier modifier = (Modifier) obj6;
            getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            asFrameworkPaint asframeworkpaintIconCompatParcelizer2 = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull6);
            if (asframeworkpaintIconCompatParcelizer2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            removeGlobalPartnerParameter removeglobalpartnerparameter = (removeGlobalPartnerParameter) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer2, displayInAppMessagelambda1.serializer(removeGlobalPartnerParameter.class), r8lambdaudhhxliolpu0hpccqh6voskpny3, !((asframeworkpaintIconCompatParcelizer2 instanceof AndroidColorFilter_androidKt) ^ true) ? ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer2).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = ExtrasKt.write(removeglobalpartnerparameter.PlaybackStateCompatCustomAction, getbirthdatefull6, 0);
            getQueryContext getquerycontext3 = removeglobalpartnerparameter.MediaBrowserCompatMediaItem;
            getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull6;
            boolean z21 = getpostalcode5.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k13);
            boolean z22 = getpostalcode5.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm15);
            boolean z23 = getpostalcode5.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm16);
            boolean z24 = getpostalcode5.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k14);
            boolean z25 = getpostalcode5.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm17);
            Object objComponentActivity23 = getpostalcode5.ComponentActivity();
            if ((z21 | z22 | z23 | z24 | z25) || objComponentActivity23 == androidContentCaptureManager) {
                objComponentActivity23 = new toAndroidVertexModeJOOmi9M(r8lambdardpfsr94j4iebcwx_kpqzpm8k13, r8lambdaunavo3sxub_pc9xroryotnrlvsm15, r8lambdaunavo3sxub_pc9xroryotnrlvsm16, r8lambdardpfsr94j4iebcwx_kpqzpm8k14, r8lambdaunavo3sxub_pc9xroryotnrlvsm17, 10);
                getpostalcode5.write(objComponentActivity23);
            }
            SQLite.write(getquerycontext3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity23, getpostalcode5, 8);
            if (((removeGlobalCallbackParametersI) populateViewStructure_androidKtpopulate7Write3.getValue()).PlaybackStateCompat) {
                getpostalcode5.serializer(198531478);
                removeGlobalCallbackParametersI removeglobalcallbackparametersi = (removeGlobalCallbackParametersI) populateViewStructure_androidKtpopulate7Write3.getValue();
                removeGlobalCallbackParameters removeglobalcallbackparameters = new removeGlobalCallbackParameters(removeglobalcallbackparametersi.MediaSessionCompatQueueItem, removeglobalcallbackparametersi.RemoteActionCompatParcelizer, removeglobalcallbackparametersi.serializer, removeglobalcallbackparametersi.write, removeglobalcallbackparametersi.read);
                boolean zIconCompatParcelizer20 = getpostalcode5.IconCompatParcelizer(removeglobalpartnerparameter);
                Object objComponentActivity24 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer20 || objComponentActivity24 == androidContentCaptureManager) {
                    objComponentActivity24 = new SettingsFragment.AnonymousClass1(1, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onCountryCodeSearchQueryChanged", "onCountryCodeSearchQueryChanged(Ljava/lang/String;)V", 0, 9);
                    getpostalcode5.write(objComponentActivity24);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm18 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity24);
                boolean zIconCompatParcelizer21 = getpostalcode5.IconCompatParcelizer(removeglobalpartnerparameter);
                Object objComponentActivity25 = getpostalcode5.ComponentActivity();
                if (!zIconCompatParcelizer21) {
                    int i15 = MediaDescriptionCompat + 91;
                    MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        Object obj12 = null;
                        obj12.hashCode();
                        throw null;
                    }
                    if (objComponentActivity25 == androidContentCaptureManager) {
                        objComponentActivity25 = new SettingsFragment.AnonymousClass1(1, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onCountryCodeSelected", "onCountryCodeSelected(Ljava/lang/String;)V", 0, 10);
                        getpostalcode5.write(objComponentActivity25);
                    }
                } else {
                    objComponentActivity25 = new SettingsFragment.AnonymousClass1(1, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onCountryCodeSelected", "onCountryCodeSelected(Ljava/lang/String;)V", 0, 10);
                    getpostalcode5.write(objComponentActivity25);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm19 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity25);
                boolean zIconCompatParcelizer22 = getpostalcode5.IconCompatParcelizer(removeglobalpartnerparameter);
                Object objComponentActivity26 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer22 || objComponentActivity26 == androidContentCaptureManager) {
                    objComponentActivity26 = new CashBlockKt$CashBlock$1$1(0, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onCountryPickerDismissed", "onCountryPickerDismissed()V", 0, 2);
                    getpostalcode5.write(objComponentActivity26);
                }
                CountryCodePickerBottomSheetKt.RemoteActionCompatParcelizer(removeglobalcallbackparameters, r8lambdaunavo3sxub_pc9xroryotnrlvsm18, r8lambdaunavo3sxub_pc9xroryotnrlvsm19, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity26), getpostalcode5, 0);
                getpostalcode5.IconCompatParcelizer(false);
            } else {
                getpostalcode5.serializer(198861101);
                getpostalcode5.IconCompatParcelizer(false);
            }
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((removeGlobalCallbackParametersI) populateViewStructure_androidKtpopulate7Write3.getValue()).PlaybackStateCompatCustomAction, null, null, null, ExtrasKt.write(441566573, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(modifier, removeglobalpartnerparameter, populateViewStructure_androidKtpopulate7Write3, 13), getpostalcode5), getpostalcode5, 24576, 14);
            return createfromparcel2;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj11;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm20 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm21 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj10;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm22 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj9;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm23 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm24 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k15 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
        cubicTo cubicto3 = (cubicTo) obj2;
        getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj3;
        ((Integer) obj4).getClass();
        ((sendDragEventEu1f8Dk) obj).getClass();
        cubicto3.getClass();
        validateColorStops validatecolorstops2 = cubicto3.MediaBrowserCompatMediaItem;
        Bundle bundleRemoteActionCompatParcelizer5 = validatecolorstops2.RemoteActionCompatParcelizer();
        String string5 = bundleRemoteActionCompatParcelizer5 != null ? bundleRemoteActionCompatParcelizer5.getString("otpPhoneNumber") : null;
        if (string5 == null) {
            string5 = "";
        }
        Bundle bundleRemoteActionCompatParcelizer6 = validatecolorstops2.RemoteActionCompatParcelizer();
        String string6 = bundleRemoteActionCompatParcelizer6 != null ? bundleRemoteActionCompatParcelizer6.getString("email") : null;
        if (string6 == null) {
            string6 = "";
        }
        asFrameworkPaint asframeworkpaintIconCompatParcelizer3 = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull7);
        if (asframeworkpaintIconCompatParcelizer3 != null) {
            OtpVerificationViewModel otpVerificationViewModel = (OtpVerificationViewModel) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer3, displayInAppMessagelambda1.serializer(OtpVerificationViewModel.class), r8lambdaudhhxliolpu0hpccqh6voskpny4, asframeworkpaintIconCompatParcelizer3 instanceof AndroidColorFilter_androidKt ? ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer3).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer);
            getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull7;
            Context context = (Context) getpostalcode6.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) getpostalcode6.write((getNewPassword) CompositionLocalsKt.getLocalSoftwareKeyboardController());
            times7Ah8Wj8 times7ah8wj8 = new times7Ah8Wj8(2);
            boolean zIconCompatParcelizer23 = getpostalcode6.IconCompatParcelizer(otpVerificationViewModel);
            Object objComponentActivity27 = getpostalcode6.ComponentActivity();
            if (zIconCompatParcelizer23) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k15;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = r8lambdaunavo3sxub_pc9xroryotnrlvsm24;
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k15;
                int i16 = MediaBrowserCompatMediaItem + 15;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = r8lambdaunavo3sxub_pc9xroryotnrlvsm24;
                MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity27 == androidContentCaptureManager) {
                }
                fastForEachIndexedWithFilter.serializer(onBackPressedDispatcher_delegatelambda010.write(times7ah8wj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity27, getpostalcode6), getpostalcode6, 8);
                zIconCompatParcelizer = getpostalcode6.IconCompatParcelizer(otpVerificationViewModel);
                z = getpostalcode6.read(string5);
                z2 = getpostalcode6.read(string6);
                objComponentActivity = getpostalcode6.ComponentActivity();
                if (!(zIconCompatParcelizer | z | z2) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new NafathTimerDataStore$set$2(otpVerificationViewModel, string5, string6, null, 10);
                    getpostalcode6.write(objComponentActivity);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode6, createfromparcel2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                getQueryContext getquerycontext4 = otpVerificationViewModel.MediaMetadataCompat;
                z3 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm20);
                z4 = getpostalcode6.read(softwareKeyboardController);
                z5 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm21);
                z6 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm22);
                zIconCompatParcelizer2 = getpostalcode6.IconCompatParcelizer(context);
                z7 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm23);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                z8 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                z9 = getpostalcode6.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                objComponentActivity2 = getpostalcode6.ComponentActivity();
                if (!(z3 | z4 | z5 | z6 | zIconCompatParcelizer2 | z7 | z8 | z9) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new subscribeToBannersErrorslambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm20, softwareKeyboardController, r8lambdaunavo3sxub_pc9xroryotnrlvsm21, r8lambdaunavo3sxub_pc9xroryotnrlvsm22, context, r8lambdaunavo3sxub_pc9xroryotnrlvsm23, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode6.write(objComponentActivity2);
                }
                SQLite.write(getquerycontext4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode6, 8);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = ExtrasKt.write(otpVerificationViewModel.ParcelableVolumeInfo, getpostalcode6, 0);
                LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((trackThirdPartySharing) populateViewStructure_androidKtpopulate7Write4.getValue()).RemoteActionCompatParcelizer, null, null, null, ExtrasKt.write(1318427960, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(otpVerificationViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7Write4, 14), getpostalcode6), getpostalcode6, 24576, 14);
                createfromparcel = createfromparcel2;
            }
            objComponentActivity27 = new TncContentKt$$ExternalSyntheticLambda2(12, otpVerificationViewModel);
            getpostalcode6.write(objComponentActivity27);
            fastForEachIndexedWithFilter.serializer(onBackPressedDispatcher_delegatelambda010.write(times7ah8wj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity27, getpostalcode6), getpostalcode6, 8);
            zIconCompatParcelizer = getpostalcode6.IconCompatParcelizer(otpVerificationViewModel);
            z = getpostalcode6.read(string5);
            z2 = getpostalcode6.read(string6);
            objComponentActivity = getpostalcode6.ComponentActivity();
            if (!(zIconCompatParcelizer | z) && !z2) {
                objComponentActivity = new NafathTimerDataStore$set$2(otpVerificationViewModel, string5, string6, null, 10);
                getpostalcode6.write(objComponentActivity);
            } else {
                objComponentActivity = new NafathTimerDataStore$set$2(otpVerificationViewModel, string5, string6, null, 10);
                getpostalcode6.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode6, createfromparcel2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            getQueryContext getquerycontext5 = otpVerificationViewModel.MediaMetadataCompat;
            z3 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm20);
            z4 = getpostalcode6.read(softwareKeyboardController);
            z5 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm21);
            z6 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm22);
            zIconCompatParcelizer2 = getpostalcode6.IconCompatParcelizer(context);
            z7 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm23);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            z8 = getpostalcode6.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            z9 = getpostalcode6.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            objComponentActivity2 = getpostalcode6.ComponentActivity();
            if (!(z3 | z4 | z5 | z6 | zIconCompatParcelizer2 | z7 | z8) && !z9) {
                objComponentActivity2 = new subscribeToBannersErrorslambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm20, softwareKeyboardController, r8lambdaunavo3sxub_pc9xroryotnrlvsm21, r8lambdaunavo3sxub_pc9xroryotnrlvsm22, context, r8lambdaunavo3sxub_pc9xroryotnrlvsm23, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode6.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new subscribeToBannersErrorslambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm20, softwareKeyboardController, r8lambdaunavo3sxub_pc9xroryotnrlvsm21, r8lambdaunavo3sxub_pc9xroryotnrlvsm22, context, r8lambdaunavo3sxub_pc9xroryotnrlvsm23, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode6.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode6, 8);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write5 = ExtrasKt.write(otpVerificationViewModel.ParcelableVolumeInfo, getpostalcode6, 0);
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((trackThirdPartySharing) populateViewStructure_androidKtpopulate7Write5.getValue()).RemoteActionCompatParcelizer, null, null, null, ExtrasKt.write(1318427960, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(otpVerificationViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7Write5, 14), getpostalcode6), getpostalcode6, 24576, 14);
            createfromparcel = createfromparcel2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            createfromparcel = null;
        }
        int i17 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            int i18 = 6 / 0;
        }
        return createfromparcel;
    }
}
