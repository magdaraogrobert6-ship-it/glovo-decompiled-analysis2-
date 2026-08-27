package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsViewModel;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyRepository;
import com.roadrunner.rider.safety.authentication.domain.GetSentianceAuthCodeUseCase;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdapkx6kfYbgP4lEOWkebovjPb0ug implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final getColorIntegerOrNulllambda0 serializer;

    public /* synthetic */ r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.read = i;
        this.serializer = getcolorintegerornulllambda0;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug IconCompatParcelizer(getFailureMessage getfailuremessage) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(getfailuremessage, 15);
        int i2 = IconCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdapkx6kfybgp4leowkebovjpb0ug;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug write(r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug2 = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(r8lambdapkx6kfybgp4leowkebovjpb0ug, 16);
        int i2 = write + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdapkx6kfybgp4leowkebovjpb0ug2;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug write(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(androidIndirectPointerEvent_androidKt, 3);
        int i2 = IconCompatParcelizer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdapkx6kfybgp4leowkebovjpb0ug;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug serializer(applyLayoutFeatures applylayoutfeatures) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(applylayoutfeatures, 12);
        int i2 = IconCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdapkx6kfybgp4leowkebovjpb0ug;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug read(getFailureMessage getfailuremessage) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(getfailuremessage, 10);
        int i2 = IconCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdapkx6kfybgp4leowkebovjpb0ug;
    }

    public static r8lambdapkx6kfYbgP4lEOWkebovjPb0ug RemoteActionCompatParcelizer(lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15) {
        int i = 2 % 2;
        r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(lambdaprocessandresolvedeeplink15, 13);
        int i2 = write + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdapkx6kfybgp4leowkebovjpb0ug;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.serializer;
        Object obj = null;
        switch (i2) {
            case 0:
                return new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getcolorintegerornulllambda0);
            case 1:
                return new AnalyticsServiceImpl((setTextSubstitutiondefault) ((setStateDescription) getcolorintegerornulllambda0).write());
            case 2:
                AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl((com.huawei.agconnect.config.impl.m) ((PreferenceGroupAdapter) getcolorintegerornulllambda0).write());
                int i3 = write + 77;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return analyticsServiceImpl;
                }
                throw null;
            case 3:
                return new getPhonePjHm6EEannotations((CrowdSourcingImageRepositoryImpl) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda0).write());
            case 4:
                EntrancePictureRepository entrancePictureRepository = (EntrancePictureRepository) ((accessgetTextBottomcp) getcolorintegerornulllambda0).write();
                entrancePictureRepository.getClass();
                SendTestPushUseCase sendTestPushUseCase = new SendTestPushUseCase();
                sendTestPushUseCase.serializer = entrancePictureRepository;
                return sendTestPushUseCase;
            case 5:
                return new FullScreenDetailsViewModel(new SharedResourcePool(24), (H$b) ((acquire) getcolorintegerornulllambda0).write());
            case 6:
                return new Vw$Vw((BrazeExternalSyntheticLambda28) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda0).write(), (com.huawei.wisesecurity.ucs_credential.g0) parseParametersToValueparseDp.IconCompatParcelizer.write());
            case 7:
                Vw$Vw vw$Vw = (Vw$Vw) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write();
                vw$Vw.getClass();
                SendTestPushUseCase sendTestPushUseCase2 = new SendTestPushUseCase();
                sendTestPushUseCase2.serializer = vw$Vw;
                return sendTestPushUseCase2;
            case 8:
                com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) ((acquire) getcolorintegerornulllambda0).write();
                mVar.getClass();
                SendTestPushUseCase sendTestPushUseCase3 = new SendTestPushUseCase();
                sendTestPushUseCase3.serializer = mVar;
                int i4 = IconCompatParcelizer + 15;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return sendTestPushUseCase3;
                }
                throw null;
            case 9:
                return new GetAppStateImpl((N$b) ((isHiddenannotations) getcolorintegerornulllambda0).write());
            case 10:
                return new GetSentianceAuthCodeUseCase((RiderSafetyRepository) ((getFailureMessage) getcolorintegerornulllambda0).write());
            case 11:
                return new GetAppStateImpl((Parser.Pair) ((acquire) getcolorintegerornulllambda0).write());
            case 12:
                return new GetAppStateImpl((PermissionHistoryRepository) ((applyLayoutFeatures) getcolorintegerornulllambda0).write());
            case 13:
                return new disableCoppaComplianceInDelay(new stopInstancelambda11(7), (disablePlayStoreKidsComplianceInDelay) ((lambdaprocessAndResolveDeeplink15) getcolorintegerornulllambda0).write());
            case 14:
                return new GetAppStateImpl((GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write());
            case 15:
                return new GetAppStateImpl((getFirstErrorCode) ((getFailureMessage) getcolorintegerornulllambda0).write());
            case 16:
                return new NetworkBody((GetAppStateImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) getcolorintegerornulllambda0).write());
            case 17:
                GetAppStateImpl getAppStateImpl = new GetAppStateImpl((FormBody.Builder) ((r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8) getcolorintegerornulllambda0).write());
                int i5 = IconCompatParcelizer + 125;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return getAppStateImpl;
                }
                obj.hashCode();
                throw null;
            default:
                return new _set_registeredPushToken_lambda1((IOParser$Decoder) ((requestSingleLocationUpdatelambda1) getcolorintegerornulllambda0).write());
        }
    }
}
