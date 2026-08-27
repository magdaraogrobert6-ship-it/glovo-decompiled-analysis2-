package o;

import android.content.Context;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordScreenKt$ForgotPasswordScreen$2$1$1;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import kotlinx.coroutines.BuildersKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subscribeToBannersErrorslambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ isInvalidIndex serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ subscribeToBannersErrorslambda1(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, SoftwareKeyboardController softwareKeyboardController, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.write = 4;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = softwareKeyboardController;
        this.MediaMetadataCompat = focusRequester;
    }

    public /* synthetic */ subscribeToBannersErrorslambda1(isInvalidIndex isinvalidindex, isInvalidIndex isinvalidindex2, isInvalidIndex isinvalidindex3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, isInvalidIndex isinvalidindex4, Object obj, int i) {
        this.write = i;
        this.serializer = isinvalidindex;
        this.read = isinvalidindex2;
        this.IconCompatParcelizer = isinvalidindex3;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = isinvalidindex4;
        this.MediaMetadataCompat = obj;
    }

    public /* synthetic */ subscribeToBannersErrorslambda1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Context context, getContentViewGroupParentLayout getcontentviewgroupparentlayout, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.write = 2;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = context;
        this.read = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ subscribeToBannersErrorslambda1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SoftwareKeyboardController softwareKeyboardController, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, Context context, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = 3;
        this.RemoteActionCompatParcelizer = softwareKeyboardController;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.MediaMetadataCompat = context;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = accessgetMenucp.IconCompatParcelizer;
        onSizeChanged onsizechanged = accessgetMenucp.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaMetadataCompat;
        Object obj3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.read;
        Object obj5 = this.RemoteActionCompatParcelizer;
        isInvalidIndex isinvalidindex = this.serializer;
        Object obj6 = this.IconCompatParcelizer;
        if (i2 == 0) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6;
            NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = (NetworkingCoreModule$$ExternalSyntheticLambda2) obj5;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
            Context context = (Context) obj2;
            runGuardedForResultandroid_sdk_base_releasedefault runguardedforresultandroid_sdk_base_releasedefault = (runGuardedForResultandroid_sdk_base_releasedefault) obj;
            runguardedforresultandroid_sdk_base_releasedefault.getClass();
            if (runguardedforresultandroid_sdk_base_releasedefault instanceof setGoogleAdvertisingIdlambda0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((setGoogleAdvertisingIdlambda0) runguardedforresultandroid_sdk_base_releasedefault).IconCompatParcelizer);
                return createfromparcel;
            }
            if (runguardedforresultandroid_sdk_base_releasedefault instanceof setEndpointProvider) {
                int i3 = MediaDescriptionCompat + 71;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((setEndpointProvider) runguardedforresultandroid_sdk_base_releasedefault).IconCompatParcelizer);
                return createfromparcel;
            }
            if (runguardedforresultandroid_sdk_base_releasedefault instanceof schedulePushDeliverylambda1) {
                int i5 = MediaDescriptionCompat + 81;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Boolean.valueOf(((schedulePushDeliverylambda1) runguardedforresultandroid_sdk_base_releasedefault).write));
                return createfromparcel;
            }
            if (runguardedforresultandroid_sdk_base_releasedefault instanceof schedulePushDeliverylambda0) {
                int i7 = RatingCompat + 87;
                MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((schedulePushDeliverylambda0) runguardedforresultandroid_sdk_base_releasedefault).serializer);
                networkingCoreModule$$ExternalSyntheticLambda2.invoke();
                return createfromparcel;
            }
            if (runguardedforresultandroid_sdk_base_releasedefault instanceof safeCallFlushDelayedInitPushAnalyticsQueuelambda0) {
                safeCallFlushDelayedInitPushAnalyticsQueuelambda0 safecallflushdelayedinitpushanalyticsqueuelambda0 = (safeCallFlushDelayedInitPushAnalyticsQueuelambda0) runguardedforresultandroid_sdk_base_releasedefault;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(safecallflushdelayedinitpushanalyticsqueuelambda0.write, safecallflushdelayedinitpushanalyticsqueuelambda0.IconCompatParcelizer);
                return createfromparcel;
            }
            if (!runguardedforresultandroid_sdk_base_releasedefault.equals(safeCallFlushDelayedInitPushAnalyticsQueue.IconCompatParcelizer)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            new KeyCompanion(context, null, new accessgetNumLockcp("SmsRetriever.API", onsizechanged, playbackStateCompatCustomAction), accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer).serializer();
            return createfromparcel;
        }
        if (i2 == 1) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1 dBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1 = (DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1) obj6;
            DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1 dBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform2 = (DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1) obj5;
            GestureNodeKt$$ExternalSyntheticLambda0 gestureNodeKt$$ExternalSyntheticLambda0 = (GestureNodeKt$$ExternalSyntheticLambda0) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
            syncTriggersroom_runtime synctriggersroom_runtime = (syncTriggersroom_runtime) obj;
            synctriggersroom_runtime.getClass();
            if (synctriggersroom_runtime.equals(TriggerBasedInvalidationTrackernotifyInvalidation2invalidatedTableIds1.read)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createfromparcel;
            }
            if (synctriggersroom_runtime.equals(ConnectionWithLock.RemoteActionCompatParcelizer)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                return createfromparcel;
            }
            if (synctriggersroom_runtime.equals(TriggerBasedInvalidationTrackersyncTriggers2111.IconCompatParcelizer)) {
                int i9 = MediaDescriptionCompat + 81;
                RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                dBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1.invoke();
                return createfromparcel;
            }
            if (!(!synctriggersroom_runtime.equals(ConnectionPoolImpl.IconCompatParcelizer))) {
                int i11 = RatingCompat + 35;
                MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                dBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform2.invoke();
                return createfromparcel;
            }
            if (!(synctriggersroom_runtime instanceof accesscheckInvalidatedTables)) {
                if (synctriggersroom_runtime.equals(TriggerBasedInvalidationTrackercreateFlow12.RemoteActionCompatParcelizer)) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i13 = MediaDescriptionCompat + 55;
            RatingCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                gestureNodeKt$$ExternalSyntheticLambda0.invoke(((accesscheckInvalidatedTables) synctriggersroom_runtime).write);
                return createfromparcel;
            }
            gestureNodeKt$$ExternalSyntheticLambda0.invoke(((accesscheckInvalidatedTables) synctriggersroom_runtime).write);
            int i14 = 32 / 0;
            return createfromparcel;
        }
        if (i2 == 2) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            Context context2 = (Context) obj2;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj4;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
            a1 a1Var = (a1) obj;
            a1Var.getClass();
            if (!(a1Var instanceof a0)) {
                if (a1Var.equals(a2.read)) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ForgotPasswordScreenKt$ForgotPasswordScreen$2$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, null, 1), 3);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(((a0) a1Var).write);
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                return createfromparcel;
            }
            populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
            ModuleDSLKt.RemoteActionCompatParcelizer(context2, Boolean.FALSE);
            return createfromparcel;
        }
        if (i2 != 3) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj3;
            androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) obj2;
            ActivityHandler30 activityHandler30 = (ActivityHandler30) obj;
            activityHandler30.getClass();
            if (!(!activityHandler30.equals(onFail.write))) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                return createfromparcel;
            }
            if (activityHandler30 instanceof ActivityHandler33) {
                int i15 = RatingCompat + 101;
                MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(activityHandler30);
                return createfromparcel;
            }
            if (activityHandler30.equals(ActivityHandler34.write)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k6.invoke();
                return createfromparcel;
            }
            if (!(!(activityHandler30 instanceof ActivityHandler32))) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(((ActivityHandler32) activityHandler30).write);
                return createfromparcel;
            }
            if (activityHandler30.equals(ActivityHandler31.RemoteActionCompatParcelizer)) {
                if (softwareKeyboardController == null) {
                    return createfromparcel;
                }
                softwareKeyboardController.hide();
                return createfromparcel;
            }
            if (activityHandler30.equals(onInstallReferrerRead.IconCompatParcelizer)) {
                androidx.compose.ui.focus.FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) obj5;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
        Context context3 = (Context) obj2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
        setAskingAttribution setaskingattribution = (setAskingAttribution) obj;
        setaskingattribution.getClass();
        if (setaskingattribution instanceof trackMeasurementConsent) {
            if (softwareKeyboardController2 != null) {
                softwareKeyboardController2.hide();
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(((trackMeasurementConsent) setaskingattribution).IconCompatParcelizer);
            return createfromparcel;
        }
        if (setaskingattribution instanceof trackAdRevenue) {
            int i17 = MediaDescriptionCompat + 31;
            RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Boolean.valueOf(((trackAdRevenue) setaskingattribution).write));
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(Boolean.valueOf(((trackAdRevenue) setaskingattribution).write));
            throw null;
        }
        if (setaskingattribution.equals(setPushToken.read)) {
            new KeyCompanion(context3, null, new accessgetNumLockcp("SmsRetriever.API", onsizechanged, playbackStateCompatCustomAction), accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer).serializer();
            return createfromparcel;
        }
        if (setaskingattribution instanceof teardown) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(((teardown) setaskingattribution).RemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (!setaskingattribution.equals(trackEvent.serializer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int i18 = MediaDescriptionCompat + 67;
            RatingCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            return null;
        }
        if (softwareKeyboardController2 != null) {
            int i20 = RatingCompat + 43;
            MediaDescriptionCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            softwareKeyboardController2.hide();
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k7.invoke();
        return createfromparcel;
    }
}
