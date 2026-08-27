package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import com.roadrunner.rider.safety.permission.domain.ShouldNavigateToRiderSafetyPermissions;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.N$b;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda31 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final getColorIntegerOrNulllambda0 read;
    public final /* synthetic */ int serializer;
    public final mergeJsonObjects write;

    public lambda31(applyLayoutFeatures applylayoutfeatures, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4 r8lambdamcfkchlmwyb5a6y_zopzjd5uq4) {
        this.serializer = 8;
        this.read = applylayoutfeatures;
        this.write = lambdaprocessandresolvedeeplink15;
        this.RemoteActionCompatParcelizer = r8lambdamcfkchlmwyb5a6y_zopzjd5uq4;
    }

    public static lambda31 serializer(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, mergeJsonObjects mergejsonobjects, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2) {
        int i = 2 % 2;
        lambda31 lambda31Var = new lambda31(androidIndirectPointerEvent_androidKt, mergejsonobjects, androidIndirectPointerEvent_androidKt2, 1);
        int i2 = MediaSessionCompatQueueItem + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return lambda31Var;
        }
        throw null;
    }

    public static lambda31 serializer(mergeJsonObjects mergejsonobjects, getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2) {
        int i = 2 % 2;
        lambda31 lambda31Var = new lambda31(mergejsonobjects, (mergeJsonObjects) getdoubleornull, (getColorIntegerOrNulllambda0) getdoubleornull2, 2);
        int i2 = MediaSessionCompatQueueItem + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return lambda31Var;
    }

    public /* synthetic */ lambda31(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.read = getcolorintegerornulllambda0;
        this.write = getcolorintegerornulllambda1;
    }

    public /* synthetic */ lambda31(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.read = getcolorintegerornulllambda0;
    }

    public /* synthetic */ lambda31(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects, int i) {
        this.serializer = i;
        this.read = getcolorintegerornulllambda0;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda1;
        this.write = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.write;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.read;
        switch (i4) {
            case 0:
                StartWorkingRepository startWorkingRepository = (StartWorkingRepository) ((elambda0) getcolorintegerornulllambda0).write();
                FetchRiderStatusImpl fetchRiderStatusImpl = (FetchRiderStatusImpl) mergejsonobjects.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects2.write();
                startWorkingRepository.getClass();
                fetchRiderStatusImpl.getClass();
                transfersessionpackagei.getClass();
                C$b c$b = new C$b();
                c$b.serializer = startWorkingRepository;
                c$b.write = fetchRiderStatusImpl;
                c$b.IconCompatParcelizer = transfersessionpackagei;
                return c$b;
            case 1:
                return new deleteSurroundingTextInCodePoints((CrowdSourcingImageRepositoryImpl) mergejsonobjects.write(), (r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU) mergejsonobjects2.write(), (SendTestPushUseCase) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda0).write());
            case 2:
                transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) mergejsonobjects.write();
                Object obj = (MoveCursorCommand) mergejsonobjects2.write();
                commitCorrection commitcorrection = (commitCorrection) ((getDoubleOrNull) getcolorintegerornulllambda0).write;
                beginBatchEditInternal.read.getClass();
                transfersessionpackagei2.getClass();
                obj.getClass();
                commitcorrection.getClass();
                if (!((FirebaseRemoteConfigImpl) transfersessionpackagei2).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CROWD_SOURCING_GALLERY_ENABLED.getFirebaseFlagName())) {
                    obj = commitcorrection;
                }
                int i5 = IconCompatParcelizer + 83;
                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return obj;
                }
                throw null;
            case 3:
                return new isIncludeFontPaddingEnabled((transferSessionPackageI) mergejsonobjects.write(), (SendTestPushUseCase) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write(), (createCharSequence) ((accessgetTextBottomcp) mergejsonobjects2).write(), new getQueryContext());
            case 4:
                return new SignInDataStore((InAppNotificationsRepository) mergejsonobjects.write(), (E$b) ((getDataStoreFileName) getcolorintegerornulllambda0).write(), (isOpenInternalroom_runtime) mergejsonobjects2.write());
            case 5:
                RectManager rectManager = (RectManager) mergejsonobjects.write();
                GetAppStateImpl getAppStateImpl = (GetAppStateImpl) ((executeQuery) getcolorintegerornulllambda0).write();
                AddRiderHiringQueryParamsImpl addRiderHiringQueryParamsImpl = (AddRiderHiringQueryParamsImpl) mergejsonobjects2.write();
                rectManager.getClass();
                getAppStateImpl.getClass();
                addRiderHiringQueryParamsImpl.getClass();
                C$b c$b2 = new C$b();
                c$b2.serializer = rectManager;
                c$b2.write = getAppStateImpl;
                c$b2.IconCompatParcelizer = addRiderHiringQueryParamsImpl;
                return c$b2;
            case 6:
                SignInDataStore signInDataStore = (SignInDataStore) ((applyLayoutFeatures) getcolorintegerornulllambda0).write();
                boundingRectInRoot boundingrectinroot = (boundingRectInRoot) mergejsonobjects.write();
                OtpLogger otpLogger = (OtpLogger) ((executeQuery) mergejsonobjects2).write();
                Path$Companion path$Companion = new Path$Companion();
                signInDataStore.getClass();
                boundingrectinroot.getClass();
                otpLogger.getClass();
                N$b n$b = new N$b();
                n$b.read = signInDataStore;
                n$b.write = boundingrectinroot;
                n$b.IconCompatParcelizer = otpLogger;
                n$b.serializer = path$Companion;
                int i6 = IconCompatParcelizer + 89;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 45 / 0;
                }
                return n$b;
            case 7:
                return new afExternalSyntheticOutline0((setTransactionSuccessful) mergejsonobjects.write(), (SemanticsInfoKt) ((ShouldShowHeatmap_Factory) getcolorintegerornulllambda0).write(), (a9) ((executeQuery) mergejsonobjects2).write());
            default:
                C$b c$b3 = (C$b) ((applyLayoutFeatures) getcolorintegerornulllambda0).write();
                MapSafetyReportResponse mapSafetyReportResponse = (MapSafetyReportResponse) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects2).write();
                ShouldNavigateToRiderSafetyPermissions shouldNavigateToRiderSafetyPermissions = (ShouldNavigateToRiderSafetyPermissions) mergejsonobjects.write();
                c$b3.getClass();
                mapSafetyReportResponse.getClass();
                shouldNavigateToRiderSafetyPermissions.getClass();
                C$b c$b4 = new C$b();
                c$b4.serializer = c$b3;
                c$b4.write = mapSafetyReportResponse;
                c$b4.IconCompatParcelizer = shouldNavigateToRiderSafetyPermissions;
                return c$b4;
        }
    }
}
