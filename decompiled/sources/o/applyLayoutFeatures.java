package o;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.foodora.courier.delivery.service.DeliveryService;
import com.google.firebase.Timestamp;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.common.data.api.CloudflareErrorClassifier;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.diagnostics.domain.CheckDeviceTokenUseCase;
import com.roadrunner.diagnostics.domain.FixTokenUseCase;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.login.logging.AuthenticationLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.sentiance.core.model.events.C$b;
import io.grpc.internal.SharedResourcePool;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class applyLayoutFeatures implements getColorIntegerOrNulllambda0 {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer;
    public final mergeJsonObjects write;

    public applyLayoutFeatures(Timestamp.Companion companion, mergeJsonObjects mergejsonobjects, hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects2) {
        this.serializer = 1;
        this.write = mergejsonobjects;
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.read = mergejsonobjects2;
    }

    public static applyLayoutFeatures write(mergeJsonObjects mergejsonobjects, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15) {
        int i = 2 % 2;
        applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(mergejsonobjects, r8lambdapkx6kfybgp4leowkebovjpb0ug, lambdaprocessandresolvedeeplink15, 14);
        int i2 = RatingCompat + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return applylayoutfeatures;
    }

    public static applyLayoutFeatures read(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        int i = 2 % 2;
        applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(androidIndirectPointerEvent_androidKt, mergejsonobjects, mergejsonobjects2, 5);
        int i2 = RemoteActionCompatParcelizer + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return applylayoutfeatures;
    }

    public static applyLayoutFeatures read(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getFailureMessage getfailuremessage) {
        int i = 2 % 2;
        applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(mergejsonobjects, mergejsonobjects2, getfailuremessage, 13);
        int i2 = RemoteActionCompatParcelizer + 101;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return applylayoutfeatures;
    }

    public /* synthetic */ applyLayoutFeatures(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, int i) {
        this.serializer = i;
        this.write = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.read = mergejsonobjects3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.read;
        mergeJsonObjects mergejsonobjects2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.write;
        switch (i3) {
            case 0:
                return new FixTokenUseCase((getPivotOffsetF1C5BW0) mergejsonobjects3.write(), (accessgetOldDependenciesSetp) mergejsonobjects2.write(), (NotificationsDiagnosticsRepository) mergejsonobjects.write());
            case 1:
                setVerticalStyle setverticalstyle = (setVerticalStyle) mergejsonobjects3.write();
                Application application = (Application) mergejsonobjects2.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects.write();
                setverticalstyle.getClass();
                application.getClass();
                transfersessionpackagei.getClass();
                Intent intent = new Intent(application, (Class<?>) DeliveryService.class);
                intent.setAction("com.roadrunner.delivery.service.action.LAUNCH");
                intent.setPackage("com.foodora.courier.delivery.service");
                PendingIntent service = PendingIntent.getService(application, 0, intent, 33554432);
                int iWrite = (int) ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("activity_monitoring_max_limit");
                if (setverticalstyle.write() == setPaddingTop.GOOGLE) {
                    service.getClass();
                    return new accessgetTouchcp(iWrite, service, application);
                }
                service.getClass();
                return new accessgetKeyboardcp(iWrite, service, application);
            case 2:
                return new SignInDataStore(getColorIntegerOrNull.serializer(mergejsonobjects3), getColorIntegerOrNull.serializer(mergejsonobjects2), (setTextCompositionRangepsREZIo) mergejsonobjects.write());
            case 3:
                return new ReportPictureUseCase((setComposingText) mergejsonobjects3.write(), (ExecuteApiRequest) mergejsonobjects2.write(), (getDefaulteUduSuo) mergejsonobjects.write(), 1);
            case 4:
                return new ReportPictureUseCase((setComposingText) mergejsonobjects3.write(), (ExecuteApiRequest) mergejsonobjects2.write(), (getDefaulteUduSuo) mergejsonobjects.write(), 0);
            case 5:
                return new SignInDataStore((CrowdSourcingImageRepositoryImpl) mergejsonobjects3.write(), (r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 6:
                return new SignInDataStore((setTransactionSuccessful) mergejsonobjects3.write(), (openSessionlambda1) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 7:
                return new timesadjELrA(new SharedResourcePool(24), (ComposeViewAdapter_androidKt) mergejsonobjects3.write(), (getMToDpValues) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 8:
                return new CheckDeviceTokenUseCase((getPivotOffsetF1C5BW0) mergejsonobjects3.write(), (accessgetOldDependenciesSetp) mergejsonobjects2.write(), (NotificationsDiagnosticsRepository) mergejsonobjects.write());
            case 9:
                return new SignInDataStore((SelfieFlowRepository) mergejsonobjects3.write(), (onExitLayoutOrScroll) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 10:
                return new SignInDataStore((ExecuteApiRequest) mergejsonobjects3.write(), (getSuccessfulruntime) mergejsonobjects2.write(), (lottieComposition) mergejsonobjects.write());
            case 11:
                return new AuthenticationLogger((decode) mergejsonobjects3.write(), (setConstraintSet) mergejsonobjects2.write(), (Application) mergejsonobjects.write(), new Path$Companion(), new CloudflareErrorClassifier());
            case 12:
                return new r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I((setTransactionSuccessful) mergejsonobjects3.write(), new SharedResourcePool(24), (r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s) mergejsonobjects2.write(), (r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo) mergejsonobjects.write());
            case 13:
                return new getPurchaseVerificationCallback((transferSessionPackageI) mergejsonobjects3.write(), (r8lambdaPnQjar0gr6y5YvWKJl7PF6WWjMM) mergejsonobjects2.write(), (getFirstErrorCode) mergejsonobjects.write());
            case 14:
                return new PermissionHistoryRepository((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) mergejsonobjects3.write(), (disableCoppaComplianceInDelay) mergejsonobjects2.write(), (setEventDeduplicationIdsMaxSize) mergejsonobjects.write());
            case 15:
                disableCoppaComplianceInDelay disablecoppacomplianceindelay = (disableCoppaComplianceInDelay) mergejsonobjects3.write();
                setEventDeduplicationIdsMaxSize seteventdeduplicationidsmaxsize = (setEventDeduplicationIdsMaxSize) mergejsonobjects2.write();
                enablePlayStoreKidsComplianceInDelay enableplaystorekidscomplianceindelay = (enablePlayStoreKidsComplianceInDelay) mergejsonobjects.write();
                disablecoppacomplianceindelay.getClass();
                seteventdeduplicationidsmaxsize.getClass();
                enableplaystorekidscomplianceindelay.getClass();
                C$b c$b = new C$b();
                c$b.serializer = disablecoppacomplianceindelay;
                c$b.write = seteventdeduplicationidsmaxsize;
                c$b.IconCompatParcelizer = enableplaystorekidscomplianceindelay;
                int i4 = RatingCompat + 99;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 51 / 0;
                }
                return c$b;
            default:
                getInstallBeginTimeServerInSeconds getinstallbegintimeserverinseconds = (getInstallBeginTimeServerInSeconds) mergejsonobjects3.write();
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) mergejsonobjects2.write();
                r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) mergejsonobjects.write();
                getinstallbegintimeserverinseconds.getClass();
                executeApiRequest.getClass();
                r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
                C$b c$b2 = new C$b();
                c$b2.serializer = getinstallbegintimeserverinseconds;
                c$b2.write = executeApiRequest;
                c$b2.IconCompatParcelizer = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
                return c$b2;
        }
    }
}
