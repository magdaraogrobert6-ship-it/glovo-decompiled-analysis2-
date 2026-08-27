package com.roadrunner.login.presentation.welcome;

import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import coil3.network.NetworkHeaders$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.presentation.identitypopup.IdentityPopupViewModel;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.login.presentation.welcome.WelcomeViewModel;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.rider.recruitment.accountcreation.navigation.AccountCreationButtonUiModelImpl;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.PasswordCreationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.CaptchaWebViewKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt$passwordCreationComposable$9$1$1;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.roadrunner.settings.SettingsFragment;
import kotlinx.coroutines.BuildersKt;
import o.ActivityHandler28;
import o.ActivityHandler29;
import o.ActivityHandler39;
import o.AndroidColorFilter_androidKt;
import o.AndroidContentCaptureManager;
import o.AndroidPaint_androidKt;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RgbCompanionExternalSyntheticLambda0;
import o.SemanticsOwnerKt;
import o.SwitchDefaults;
import o.SwitchKt;
import o.addRect;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.cubicTo;
import o.d8;
import o.da;
import o.displayInAppMessagelambda1;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getOldListSize;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getRootSemanticsNode;
import o.getSuggestedMinimumWidth;
import o.getSuspendingTransactionContext;
import o.isInvalidIndex;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.sendDragEventEu1f8Dk;
import o.setPathEffect;
import o.setStatusBarBackgroundColor;
import o.setStatusBarBackgroundResource;
import o.setStrokeCapBeK7IIE;
import o.setStrokeJoinWw9F2mQ;
import o.subscribeToBannersErrorslambda1;
import o.usePrepared;
import o.validateColorStops;
import okhttp3.Cookie$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WelcomeNavigationKt$$ExternalSyntheticLambda0 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ isInvalidIndex RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ WelcomeNavigationKt$$ExternalSyntheticLambda0(Object obj, Object obj2, isInvalidIndex isinvalidindex, Object obj3, Object obj4, Object obj5, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
        this.RemoteActionCompatParcelizer = isinvalidindex;
        this.write = obj3;
        this.MediaSessionCompatQueueItem = obj4;
        this.RatingCompat = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0403  */
    /* JADX WARN: Code duplicated, block: B:136:0x04db  */
    /* JADX WARN: Code duplicated, block: B:66:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x027b  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a9  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        setStrokeCapBeK7IIE defaultViewModelCreationExtras;
        String string;
        String string2;
        String string3;
        setStrokeCapBeK7IIE defaultViewModelCreationExtras2;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        Object obj5 = this.RatingCompat;
        Object obj6 = this.MediaSessionCompatQueueItem;
        Object obj7 = this.write;
        isInvalidIndex isinvalidindex = this.RemoteActionCompatParcelizer;
        Object obj8 = this.serializer;
        Object obj9 = this.read;
        if (i4 == 0) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            getQueryContext getquerycontext = (getQueryContext) obj7;
            relativeMoveTo relativemoveto = (relativeMoveTo) obj6;
            SwitchDefaults switchDefaults = (SwitchDefaults) obj5;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            final WelcomeViewModel welcomeViewModel = (WelcomeViewModel) Cookie$Companion.IconCompatParcelizer(WelcomeViewModel.class, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9, getbirthdatefull);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(welcomeViewModel.MediaBrowserCompatMediaItem, getbirthdatefull, 0);
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(welcomeViewModel);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new WelcomeViewModel.AnonymousClass1(welcomeViewModel, null, 1);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            getQueryContext getquerycontext2 = ((AccountCreationButtonUiModelImpl) welcomeViewModel.write.MediaSessionCompatResultReceiverWrapper()).write;
            boolean z = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            boolean z2 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new getOldListSize(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1);
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(welcomeViewModel);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                final int i5 = 0;
                objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d5
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj10) {
                        int i6 = 2 % 2;
                        int i7 = i5;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        WelcomeViewModel welcomeViewModel2 = welcomeViewModel;
                        if (i7 == 0) {
                            LogSqliteDrivernewTransaction1 logSqliteDrivernewTransaction1 = (LogSqliteDrivernewTransaction1) obj10;
                            logSqliteDrivernewTransaction1.getClass();
                            int i8 = d4ExternalSyntheticLambda6.read[logSqliteDrivernewTransaction1.ordinal()];
                            if (i8 != 1) {
                                int i9 = write + 37;
                                int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                serializer = i10;
                                if (i9 % 2 != 0 ? i8 != 2 : i8 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                int i11 = i10 + 67;
                                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                            }
                            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(welcomeViewModel2), null, null, new ReconnectScheduler$schedule$1(welcomeViewModel2, null, 17), 3);
                            return createfromparcel2;
                        }
                        initI initi = (initI) obj10;
                        initi.getClass();
                        getBytes getbytes = welcomeViewModel2.read;
                        String str = initi.read;
                        getbytes.getClass();
                        ff$$ExternalSyntheticOutline0.m("accountCreationType", str, getbytes.RemoteActionCompatParcelizer, "arara_landing_page");
                        getQueryContext getquerycontext3 = ((AccountCreationButtonUiModelImpl) welcomeViewModel2.write.MediaSessionCompatResultReceiverWrapper()).write;
                        if (initi.equals(launchSessionResponseTasks.RemoteActionCompatParcelizer)) {
                            getquerycontext3.serializer(getFirstSessionDelayManager.serializer);
                            return createfromparcel2;
                        }
                        if (initi instanceof launchSdkClickResponseTasks) {
                            getquerycontext3.serializer(new launchPurchaseVerificationResponseTasks(((launchSdkClickResponseTasks) initi).IconCompatParcelizer));
                            return createfromparcel2;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i13 = serializer + 69;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        return null;
                    }
                };
                getpostalcode.write(objComponentActivity3);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            da daVar = (da) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new addRect(relativemoveto, 9);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new addRect(relativemoveto, 10);
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5;
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(welcomeViewModel);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5 || objComponentActivity6 == androidContentCaptureManager) {
                final int i6 = 1;
                objComponentActivity6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d5
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj10) {
                        int i7 = 2 % 2;
                        int i8 = i6;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        WelcomeViewModel welcomeViewModel2 = welcomeViewModel;
                        if (i8 == 0) {
                            LogSqliteDrivernewTransaction1 logSqliteDrivernewTransaction1 = (LogSqliteDrivernewTransaction1) obj10;
                            logSqliteDrivernewTransaction1.getClass();
                            int i9 = d4ExternalSyntheticLambda6.read[logSqliteDrivernewTransaction1.ordinal()];
                            if (i9 != 1) {
                                int i10 = write + 37;
                                int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                serializer = i11;
                                if (i10 % 2 != 0 ? i9 != 2 : i9 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                int i12 = i11 + 67;
                                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                            }
                            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(welcomeViewModel2), null, null, new ReconnectScheduler$schedule$1(welcomeViewModel2, null, 17), 3);
                            return createfromparcel2;
                        }
                        initI initi = (initI) obj10;
                        initi.getClass();
                        getBytes getbytes = welcomeViewModel2.read;
                        String str = initi.read;
                        getbytes.getClass();
                        ff$$ExternalSyntheticOutline0.m("accountCreationType", str, getbytes.RemoteActionCompatParcelizer, "arara_landing_page");
                        getQueryContext getquerycontext3 = ((AccountCreationButtonUiModelImpl) welcomeViewModel2.write.MediaSessionCompatResultReceiverWrapper()).write;
                        if (initi.equals(launchSessionResponseTasks.RemoteActionCompatParcelizer)) {
                            getquerycontext3.serializer(getFirstSessionDelayManager.serializer);
                            return createfromparcel2;
                        }
                        if (initi instanceof launchSdkClickResponseTasks) {
                            getquerycontext3.serializer(new launchPurchaseVerificationResponseTasks(((launchSdkClickResponseTasks) initi).IconCompatParcelizer));
                            return createfromparcel2;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i14 = serializer + 69;
                        write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        return null;
                    }
                };
                getpostalcode.write(objComponentActivity6);
            }
            d8.serializer(daVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, PaddingKt.IconCompatParcelizer(Modifier.Companion, switchDefaults), getpostalcode, 0);
            return createfromparcel;
        }
        if (i4 == 1) {
            getSuggestedMinimumWidth getsuggestedminimumwidth = (getSuggestedMinimumWidth) obj9;
            IdentityVerificationParams identityVerificationParams = (IdentityVerificationParams) obj8;
            n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3 = (n$$ExternalSyntheticLambda3) isinvalidindex;
            DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj7;
            RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0 = (RgbCompanionExternalSyntheticLambda0) obj6;
            SwitchKt switchKt = (SwitchKt) obj5;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj3);
            SemanticsOwnerKt semanticsOwnerKt = (SemanticsOwnerKt) getpostalcode2.write((getNewPassword) getRootSemanticsNode.write);
            boolean zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(getsuggestedminimumwidth);
            boolean zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(identityVerificationParams);
            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer6 | zIconCompatParcelizer7) || objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(getsuggestedminimumwidth, 15, identityVerificationParams);
                getpostalcode2.write(objComponentActivity7);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7;
            asFrameworkPaint asframeworkpaintIconCompatParcelizer = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getpostalcode2);
            if (asframeworkpaintIconCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(IdentityPopupViewModel.class);
            NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(2);
            networkHeaders$Builder.RemoteActionCompatParcelizer(displayInAppMessagelambda1.serializer(IdentityPopupViewModel.class), r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            AndroidPaint_androidKt androidPaint_androidKtWrite = networkHeaders$Builder.write();
            if (asframeworkpaintIconCompatParcelizer instanceof AndroidColorFilter_androidKt) {
                int i7 = MediaBrowserCompatMediaItem + 3;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras();
                    throw null;
                }
                defaultViewModelCreationExtras = ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = setPathEffect.IconCompatParcelizer;
            }
            IdentityPopupViewModel identityPopupViewModel = (IdentityPopupViewModel) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, androidPaint_androidKtWrite, defaultViewModelCreationExtras);
            Object objComponentActivity8 = getpostalcode2.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity8);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity8;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(identityPopupViewModel.serializer, getpostalcode2, 0);
            getQueryContext getquerycontext3 = identityPopupViewModel.write;
            boolean zIconCompatParcelizer8 = getpostalcode2.IconCompatParcelizer(identityPopupViewModel);
            Object objComponentActivity9 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer8 || objComponentActivity9 == androidContentCaptureManager) {
                objComponentActivity9 = new NestScreenKt$NestScreen$1$1(0, identityPopupViewModel, IdentityPopupViewModel.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0, 5);
                getpostalcode2.write(objComponentActivity9);
                int i8 = MediaBrowserCompatMediaItem + 65;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity9;
            setStatusBarBackgroundResource setstatusbarbackgroundresource = (setStatusBarBackgroundResource) populateViewStructure_androidKtpopulate7Write2.getValue();
            boolean z3 = getpostalcode2.read(n__externalsyntheticlambda3);
            Object objComponentActivity10 = getpostalcode2.ComponentActivity();
            if (z3) {
                objComponentActivity10 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(19, n__externalsyntheticlambda3);
                getpostalcode2.write(objComponentActivity10);
            } else {
                int i10 = MediaBrowserCompatMediaItem + 123;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(19, n__externalsyntheticlambda3);
                    getpostalcode2.write(objComponentActivity10);
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10;
            boolean zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(identityPopupViewModel);
            Object objComponentActivity11 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity11 == androidContentCaptureManager) {
                objComponentActivity11 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(20, identityPopupViewModel);
                getpostalcode2.write(objComponentActivity11);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity11;
            boolean zIconCompatParcelizer10 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean zIconCompatParcelizer11 = getpostalcode2.IconCompatParcelizer(rgbCompanionExternalSyntheticLambda0);
            Object objComponentActivity12 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer10 | zIconCompatParcelizer11) || objComponentActivity12 == androidContentCaptureManager) {
                objComponentActivity12 = new DeviceManager$$ExternalSyntheticLambda1(getcontentviewgroupparentlayout, 16, rgbCompanionExternalSyntheticLambda0);
                getpostalcode2.write(objComponentActivity12);
            }
            setStatusBarBackgroundColor.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getquerycontext3, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity12, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, switchKt, setstatusbarbackgroundresource, null, getpostalcode2, 64);
            boolean zIconCompatParcelizer12 = getpostalcode2.IconCompatParcelizer(identityPopupViewModel);
            Object objComponentActivity13 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer12 || objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = new NestScreenKt$NestScreen$1$1(0, identityPopupViewModel, IdentityPopupViewModel.class, "onStartCamera", "onStartCamera()V", 0, 6);
                getpostalcode2.write(objComponentActivity13);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity13;
            boolean zIconCompatParcelizer13 = getpostalcode2.IconCompatParcelizer(identityPopupViewModel);
            Object objComponentActivity14 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer13 || objComponentActivity14 == androidContentCaptureManager) {
                objComponentActivity14 = new NestScreenKt$NestScreen$1$1(0, identityPopupViewModel, IdentityPopupViewModel.class, "onPermissionDenied", "onPermissionDenied()V", 0, 7);
                getpostalcode2.write(objComponentActivity14);
            }
            getSuspendingTransactionContext.write(rgbCompanionExternalSyntheticLambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity14), null, false, getpostalcode2, 8, 24);
            boolean z4 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Write2);
            boolean z5 = getpostalcode2.read(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
            Object objComponentActivity15 = getpostalcode2.ComponentActivity();
            if (!z4 && !z5) {
                int i11 = MediaDescriptionCompat + 51;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (objComponentActivity15 == androidContentCaptureManager) {
                    objComponentActivity15 = new DeviceManager$$ExternalSyntheticLambda1(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, 17, populateViewStructure_androidKtpopulate7Write2);
                    getpostalcode2.write(objComponentActivity15);
                }
            } else {
                objComponentActivity15 = new DeviceManager$$ExternalSyntheticLambda1(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, 17, populateViewStructure_androidKtpopulate7Write2);
                getpostalcode2.write(objComponentActivity15);
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity15, getpostalcode2, 0, 1);
            ((setStatusBarBackgroundResource) populateViewStructure_androidKtpopulate7Write2.getValue()).getClass();
            Boolean bool = Boolean.FALSE;
            boolean zIconCompatParcelizer14 = getpostalcode2.IconCompatParcelizer(semanticsOwnerKt);
            Object objComponentActivity16 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer14 || objComponentActivity16 == androidContentCaptureManager) {
                objComponentActivity16 = new usePrepared(semanticsOwnerKt, 1);
                getpostalcode2.write(objComponentActivity16);
            }
            getPhoneNumberNational.serializer(bool, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity16, getpostalcode2);
            return createfromparcel;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6;
        Modifier modifier = (Modifier) obj5;
        cubicTo cubicto = (cubicTo) obj2;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        ((Integer) obj4).getClass();
        ((sendDragEventEu1f8Dk) obj).getClass();
        cubicto.getClass();
        validateColorStops validatecolorstops = cubicto.MediaBrowserCompatMediaItem;
        Bundle bundleRemoteActionCompatParcelizer = validatecolorstops.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer == null || (string = bundleRemoteActionCompatParcelizer.getString("email")) == null) {
            string = "";
        }
        Bundle bundleRemoteActionCompatParcelizer2 = validatecolorstops.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer2 == null || (string2 = bundleRemoteActionCompatParcelizer2.getString("phone")) == null) {
            string2 = "";
        }
        Bundle bundleRemoteActionCompatParcelizer3 = validatecolorstops.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer3 == null || (string3 = bundleRemoteActionCompatParcelizer3.getString("originalMessageId")) == null) {
            string3 = "";
        }
        Bundle bundleRemoteActionCompatParcelizer4 = validatecolorstops.RemoteActionCompatParcelizer();
        boolean z6 = bundleRemoteActionCompatParcelizer4 != null ? bundleRemoteActionCompatParcelizer4.getBoolean("isPassFlow") : false;
        asFrameworkPaint asframeworkpaintIconCompatParcelizer2 = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull2);
        if (asframeworkpaintIconCompatParcelizer2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        if (asframeworkpaintIconCompatParcelizer2 instanceof AndroidColorFilter_androidKt) {
            int i13 = MediaDescriptionCompat + 121;
            MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            defaultViewModelCreationExtras2 = ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer2).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras2 = setPathEffect.IconCompatParcelizer;
        }
        PasswordCreationViewModel passwordCreationViewModel = (PasswordCreationViewModel) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer2, displayInAppMessagelambda1.serializer(PasswordCreationViewModel.class), r8lambdaudhhxliolpu0hpccqh6voskpny, defaultViewModelCreationExtras2);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = ExtrasKt.write(passwordCreationViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, getbirthdatefull2, 0);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = ExtrasKt.write(passwordCreationViewModel.MediaBrowserCompatMediaItem, getbirthdatefull2, 0);
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) getpostalcode3.write((getNewPassword) CompositionLocalsKt.getLocalSoftwareKeyboardController());
        Object objComponentActivity17 = getpostalcode3.ComponentActivity();
        if (objComponentActivity17 == androidContentCaptureManager) {
            objComponentActivity17 = new FocusRequester();
            getpostalcode3.write(objComponentActivity17);
        }
        FocusRequester focusRequester = (FocusRequester) objComponentActivity17;
        boolean zIconCompatParcelizer15 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
        boolean z7 = getpostalcode3.read(string);
        boolean z8 = getpostalcode3.read(string2);
        boolean z9 = getpostalcode3.read(string3);
        boolean zWrite = getpostalcode3.write(z6);
        Object objComponentActivity18 = getpostalcode3.ComponentActivity();
        if (((zIconCompatParcelizer15 | z7 | z8 | z9) || zWrite) || objComponentActivity18 == androidContentCaptureManager) {
            objComponentActivity18 = new PasswordCreationScreenKt$passwordCreationComposable$9$1$1(passwordCreationViewModel, string, string2, string3, z6, null);
            getpostalcode3.write(objComponentActivity18);
        } else {
            int i15 = MediaBrowserCompatMediaItem + 75;
            MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity18);
        getQueryContext getquerycontext4 = passwordCreationViewModel.MediaSessionCompatResultReceiverWrapper;
        boolean z10 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k5);
        boolean z11 = getpostalcode3.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
        boolean z12 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
        boolean z13 = getpostalcode3.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
        boolean z14 = getpostalcode3.read(softwareKeyboardController);
        Object objComponentActivity19 = getpostalcode3.ComponentActivity();
        if ((z10 | z11 | z12 | z13 | z14) || objComponentActivity19 == androidContentCaptureManager) {
            objComponentActivity19 = new subscribeToBannersErrorslambda1(r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, softwareKeyboardController, focusRequester);
            getpostalcode3.write(objComponentActivity19);
        }
        SQLite.write(getquerycontext4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity19, getpostalcode3, 8);
        if (((ActivityHandler29) populateViewStructure_androidKtpopulate7Write4.getValue()) instanceof ActivityHandler28) {
            getpostalcode3.serializer(1507475849);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OpenCaptchaWebView", new Object[0]);
            ActivityHandler29 activityHandler29 = (ActivityHandler29) populateViewStructure_androidKtpopulate7Write4.getValue();
            activityHandler29.getClass();
            String str = ((ActivityHandler28) activityHandler29).write;
            boolean zIconCompatParcelizer16 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
            Object objComponentActivity20 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer16 || objComponentActivity20 == androidContentCaptureManager) {
                objComponentActivity20 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onCaptchaError", "onCaptchaError(Lcom/roadrunner/rider/recruitment/accountcreation/password_creation/presentation/CaptchaError;)V", 0, 12);
                getpostalcode3.write(objComponentActivity20);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity20;
            boolean zIconCompatParcelizer17 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
            Object objComponentActivity21 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer17 || objComponentActivity21 == androidContentCaptureManager) {
                objComponentActivity21 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onCaptchaSuccess", "onCaptchaSuccess(Ljava/lang/String;)V", 0, 13);
                getpostalcode3.write(objComponentActivity21);
            }
            CaptchaWebViewKt.CaptchaWebView(str, null, 0L, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity21), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda2, getpostalcode3, 0);
            getpostalcode3.IconCompatParcelizer(false);
        } else {
            softwareKeyboardController = softwareKeyboardController;
            getpostalcode3.serializer(1507759344);
            getpostalcode3.IconCompatParcelizer(false);
        }
        ActivityHandler39 activityHandler39 = (ActivityHandler39) populateViewStructure_androidKtpopulate7Write3.getValue();
        boolean zIconCompatParcelizer18 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
        Object objComponentActivity22 = getpostalcode3.ComponentActivity();
        if (zIconCompatParcelizer18 || objComponentActivity22 == androidContentCaptureManager) {
            objComponentActivity22 = new CashBlockKt$CashBlock$1$1(0, passwordCreationViewModel, PasswordCreationViewModel.class, "onAccountCreationClicked", "onAccountCreationClicked()V", 0, 12);
            getpostalcode3.write(objComponentActivity22);
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity22;
        boolean zIconCompatParcelizer19 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
        Object objComponentActivity23 = getpostalcode3.ComponentActivity();
        if (zIconCompatParcelizer19) {
            objComponentActivity23 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onPasswordUpdated", "onPasswordUpdated(Ljava/lang/String;)V", 0, 14);
            getpostalcode3.write(objComponentActivity23);
        } else {
            int i17 = MediaDescriptionCompat + 83;
            MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (objComponentActivity23 == androidContentCaptureManager) {
                objComponentActivity23 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onPasswordUpdated", "onPasswordUpdated(Ljava/lang/String;)V", 0, 14);
                getpostalcode3.write(objComponentActivity23);
            }
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda4 = (registerInAppMessageManagerlambda0) objComponentActivity23;
        boolean zIconCompatParcelizer20 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
        Object objComponentActivity24 = getpostalcode3.ComponentActivity();
        if (!zIconCompatParcelizer20) {
            int i19 = MediaBrowserCompatMediaItem + 61;
            MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            if (objComponentActivity24 == androidContentCaptureManager) {
                objComponentActivity24 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onConfirmationPasswordUpdated", "onConfirmationPasswordUpdated(Ljava/lang/String;)V", 0, 15);
                getpostalcode3.write(objComponentActivity24);
            }
        } else {
            objComponentActivity24 = new SettingsFragment.AnonymousClass1(1, passwordCreationViewModel, PasswordCreationViewModel.class, "onConfirmationPasswordUpdated", "onConfirmationPasswordUpdated(Ljava/lang/String;)V", 0, 15);
            getpostalcode3.write(objComponentActivity24);
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda5 = (registerInAppMessageManagerlambda0) objComponentActivity24;
        boolean zIconCompatParcelizer21 = getpostalcode3.IconCompatParcelizer(passwordCreationViewModel);
        Object objComponentActivity25 = getpostalcode3.ComponentActivity();
        if (zIconCompatParcelizer21) {
            objComponentActivity25 = new CashBlockKt$CashBlock$1$1(0, passwordCreationViewModel, PasswordCreationViewModel.class, "requestFocus", "requestFocus()V", 0, 13);
            getpostalcode3.write(objComponentActivity25);
        } else {
            int i21 = MediaBrowserCompatMediaItem + 97;
            MediaDescriptionCompat = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            if (objComponentActivity25 == androidContentCaptureManager) {
                objComponentActivity25 = new CashBlockKt$CashBlock$1$1(0, passwordCreationViewModel, PasswordCreationViewModel.class, "requestFocus", "requestFocus()V", 0, 13);
                getpostalcode3.write(objComponentActivity25);
            }
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda6 = (registerInAppMessageManagerlambda0) objComponentActivity25;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda4;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda5;
        boolean z15 = getpostalcode3.read(softwareKeyboardController);
        Object objComponentActivity26 = getpostalcode3.ComponentActivity();
        if (z15 || objComponentActivity26 == androidContentCaptureManager) {
            objComponentActivity26 = new r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw(softwareKeyboardController, 1);
            getpostalcode3.write(objComponentActivity26);
        }
        PasswordCreationScreenKt.RemoteActionCompatParcelizer(activityHandler39, focusRequester, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity26, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda6, getpostalcode3, 48);
        return createfromparcel;
    }
}
