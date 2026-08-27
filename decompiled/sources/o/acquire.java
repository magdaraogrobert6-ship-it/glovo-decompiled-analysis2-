package o;

import android.app.Application;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.ExtractCriticalHttpIssueData;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyRepository;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.roadrunner.rider.safety.report.data.SafetyPreferencesDataStore;
import com.roadrunner.rider.safety.report.data.SafetySideMenuItemTagRepository;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.sentiance.core.model.events.H$b;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class acquire implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int serializer;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final mergeJsonObjects write;

    public acquire(BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        this.RemoteActionCompatParcelizer = 26;
        this.write = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
    }

    public static acquire RemoteActionCompatParcelizer(hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(hasnestedscrollingparent, mergejsonobjects, 29);
        int i2 = serializer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return acquireVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static acquire serializer(mergeJsonObjects mergejsonobjects, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(mergejsonobjects, generateandroidfontktforapicompatibility, 8);
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acquireVar;
    }

    public static acquire write(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(mergejsonobjects, mergejsonobjects2, 28);
        int i2 = serializer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acquireVar;
    }

    public static acquire RemoteActionCompatParcelizer(q0 q0Var, SemanticsPropertiesFillableData1 semanticsPropertiesFillableData1) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(q0Var, semanticsPropertiesFillableData1, 7);
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return acquireVar;
    }

    public static acquire read(getFailureMessage getfailuremessage, getFailureMessage getfailuremessage2) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(getfailuremessage, getfailuremessage2, 25);
        int i2 = serializer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acquireVar;
    }

    public /* synthetic */ acquire(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
    }

    public static acquire RemoteActionCompatParcelizer(BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21, hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview) {
        int i = 2 % 2;
        acquire acquireVar = new acquire(brazeCompanionExternalSyntheticLambda21, hasnestedscrollingparent, setpresentationview);
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acquireVar;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.write;
        switch (i2) {
            case 0:
                return new com.huawei.agconnect.config.impl.m((createNewStatement) mergejsonobjects2.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 1:
                return new H$b((setTextCompositionRangepsREZIo) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 2:
                return new Vw$Vw((setTextCompositionRangepsREZIo) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 3:
                return new Parser.Pair(getColorIntegerOrNull.serializer(mergejsonobjects2), getColorIntegerOrNull.serializer(mergejsonobjects));
            case 4:
                return new Vw$Vw((hasPositionalLayerTransformations) mergejsonobjects2.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 5:
                return new setCache((getNone_3YsG6Y) mergejsonobjects2.write(), (getDefault_3YsG6Y) mergejsonobjects.write());
            case 6:
                H$b h$b = new H$b((RefreshAccessTokenUseCaseImpl) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                int i3 = read + 5;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return h$b;
            case 7:
                return new getDefaulteUduSuo((EnumColumnAdapter) mergejsonobjects2.write(), (ExtractCriticalHttpIssueData) mergejsonobjects.write());
            case 8:
                getDoneeUduSuo getdoneeudusuo = new getDoneeUduSuo((FontEj4NQ78default) mergejsonobjects.write(), (decode) mergejsonobjects2.write());
                int i5 = serializer + 63;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return getdoneeudusuo;
            case 9:
                return new copy3r_uNRQdefault((CrowdSourcingImageRepositoryImpl) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 10:
                return new H$b((androidx.work.impl.WorkManagerImpl) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 11:
                return new SignInDataStore((accessgetSubscriptcp) mergejsonobjects2.write(), (com.huawei.wisesecurity.ucs_credential.p0) CustomBulletSpanExternalSyntheticLambda0.IconCompatParcelizer.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 12:
                return new H$b((FontEj4NQ78default) mergejsonobjects.write(), (decode) mergejsonobjects2.write());
            case 13:
                return new com.huawei.agconnect.config.impl.m((setOnEventTrackingSucceededListener) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 14:
                return new ConstraintHelper((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (NotificationsDiagnosticsRepository) mergejsonobjects.write());
            case 15:
                return new com.huawei.agconnect.config.impl.m((BackStackState) mergejsonobjects2.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 16:
                return new H$b((GetCourierStatusUseCaseImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 17:
                return new withTransaction((setTransactionSuccessful) mergejsonobjects2.write(), (RectManager) mergejsonobjects.write());
            case 18:
                QueryResultValue queryResultValue = new QueryResultValue((setTransactionSuccessful) mergejsonobjects2.write(), (setLastHorizontalStyle) mergejsonobjects.write());
                int i7 = read + 95;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return queryResultValue;
            case 19:
                return new a3((decode) mergejsonobjects2.write(), (EnumColumnAdapter) mergejsonobjects.write());
            case 20:
                return new com.huawei.agconnect.config.impl.m((w5) mergejsonobjects2.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 21:
                return new subscribeToBannersDismissedEventandroid_sdk_base_release((decode) mergejsonobjects2.write(), (QualtricsManagerImpl) mergejsonobjects.write(), 1);
            case 22:
                publishError publisherror = (publishError) mergejsonobjects2.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                publisherror.getClass();
                settransactionsuccessful.getClass();
                FormBody.Builder builder = new FormBody.Builder();
                builder.serializer = publisherror;
                builder.RemoteActionCompatParcelizer = settransactionsuccessful;
                return builder;
            case 23:
                return new Parser.Pair((setTransactionSuccessful) mergejsonobjects.write(), (publishError) mergejsonobjects2.write());
            case 24:
                return new RealImageLoaderexecuteresult1((setTransactionSuccessful) mergejsonobjects2.write(), (publishError) mergejsonobjects.write());
            case 25:
                return new IsSafetyTrackingAllowedUseCase((RiderSafetyRepository) mergejsonobjects2.write(), (getFirstErrorCode) mergejsonobjects.write());
            case 26:
                Application application = (Application) mergejsonobjects2.write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) mergejsonobjects.write();
                application.getClass();
                isopeninternalroom_runtime.getClass();
                return new SafetyPreferencesDataStore((performCustomExitMxy_nc0) getWaitBeforeSendTimeSeconds.read.getValue(application, getWaitBeforeSendTimeSeconds.serializer[0]), isopeninternalroom_runtime);
            case 27:
                return new Parser.Pair((androidx.work.impl.WorkManagerImpl) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 28:
                return new SafetySideMenuItemTagRepository((SafetyPreferencesDataStore) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            default:
                return new isPreinstallTrackingEnabled((Application) mergejsonobjects2.write(), (MulticastConsumer) mergejsonobjects.write());
        }
    }
}
