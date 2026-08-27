package o;

import coil3.ComponentRegistry$Builder;
import com.deliveryhero.fwf_tracking.model.FwFTrackingConfig;
import com.roadrunner.auth.domain.GetIdVerificationLocationsImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.push.core.data.PushServiceRepository;
import com.roadrunner.push.core.domain.UpdateApplicantPushToken;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsAppInfoChangeListener;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import com.roadrunner.rider.recruitment.applicant.domain.IsApplicantSessionAvailableUseCaseImpl;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class publishErrorlambda1 implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getColorIntegerOrNulllambda0 write;

    public /* synthetic */ publishErrorlambda1(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = getcolorintegerornulllambda0;
    }

    public /* synthetic */ publishErrorlambda1(Object obj, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.write;
        switch (i3) {
            case 0:
                return new reenqueueInAppMessagelambda0((JsonObjectSerializer) ((r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA) getcolorintegerornulllambda0).write());
            case 1:
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) ((r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI) getcolorintegerornulllambda0).write();
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite = getidentifiersvalidationsenabled.write().write(r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k.class);
                objWrite.getClass();
                return (r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k) objWrite;
            case 2:
                return new UpdateApplicantPushToken((PushServiceRepository) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) getcolorintegerornulllambda0).write());
            case 3:
                return new lambdagdprForgetMe35((lambdaaddGlobalPartnerParameter23) ((getEditableText) getcolorintegerornulllambda0).write());
            case 4:
                getAdidWithTimeout getadidwithtimeout = (getAdidWithTimeout) ((onCapabilitiesChanged) getcolorintegerornulllambda0).write();
                int i4 = serializer + 1;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return getadidwithtimeout;
                }
                throw null;
            case 5:
                return (Gen2FunWithFlagsAppInfoChangeListener) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) getcolorintegerornulllambda0).write();
            case 6:
                return new FwFTrackingConfig("rider-app", (OkHttpCall$1) ((AbsSavedState) getcolorintegerornulllambda0).write());
            case 7:
                return new GetAppStateImpl((PhoneValidationRepository) ((newTransaction) getcolorintegerornulllambda0).write());
            case 8:
                ActivityHandler41 activityHandler41 = new ActivityHandler41((OtpLogger) ((requestSingleLocationUpdatelambda1) getcolorintegerornulllambda0).write());
                int i5 = serializer + 91;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return activityHandler41;
            case 9:
                return new IsApplicantSessionAvailableUseCaseImpl((ApplicantRepository) ((requestSingleLocationUpdatelambda1) getcolorintegerornulllambda0).write());
            case 10:
                return new readObject((ActivityPackage) ((AbsSavedState) getcolorintegerornulllambda0).write());
            case 11:
                return new GetAppStateImpl(22, (GetCashBlockUiState) ((requestGeofencesInitializationlambda1) getcolorintegerornulllambda0).write());
            case 12:
                return new SaveHeatmapUrlImpl(23, (isBound) ((transactionWithResultsuspendImpl) getcolorintegerornulllambda0).write());
            case 13:
                return new setSubsessionInterval((GetAppStateImpl) ((lambdaverifyPlayStorePurchase45) getcolorintegerornulllambda0).write());
            case 14:
                return (SaveHeatmapUrlImpl) ((publishErrorlambda1) getcolorintegerornulllambda0).write();
            case 15:
                return (GetRiderStateImpl) ((requestGeofencesInitializationlambda1) getcolorintegerornulllambda0).write();
            case 16:
                return new EndBreakUseCaseImpl((OkHttpCall$1) ((q0) getcolorintegerornulllambda0).write());
            case 17:
                return new GetRiderStatusImpl((asBinder) ((AbsSavedState) getcolorintegerornulllambda0).write(), new ImageHeaderParserImageType());
            case 18:
                return new SaveHeatmapUrlImpl(25, (IActivityHandler) ((AbsSavedState) getcolorintegerornulllambda0).write());
            case 19:
                waitTime waittime = new waitTime(new xb(), new accessisMainThread(), (r8lambda93S_WWydVO4tgS0mQqqSoxDXifE) ((requestGeofencesInitializationlambda1) getcolorintegerornulllambda0).write(), new isMainThread(19));
                int i7 = serializer + 13;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return waittime;
            case 20:
                return new ToggleShiftExtensionUseCase((H$b) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) getcolorintegerornulllambda0).write());
            case 21:
                return new accesssetShouldRequestFrameworkListenToNetworkUpdatescp((ComponentRegistry$Builder) ((isMenuVisible) getcolorintegerornulllambda0).write());
            case 22:
                return new StopWorkingUseCaseImpl((OkHttpCall$1) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) getcolorintegerornulllambda0).write());
            case 23:
                return new requestGeofenceRefreshandroid_sdk_base_release((GetIdVerificationLocationsImpl) ((getContentDataType) getcolorintegerornulllambda0).write());
            default:
                return new SharedResourcePool((r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE) ((r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA) getcolorintegerornulllambda0).write());
        }
    }
}
