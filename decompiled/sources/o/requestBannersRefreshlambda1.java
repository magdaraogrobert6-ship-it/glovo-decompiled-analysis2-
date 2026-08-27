package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.quests.data.QuestsCache;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import com.roadrunner.user.properties.domain.ClearUserPropertiesUseCaseImpl;
import com.roadrunner.user.properties.domain.SaveUserPropertiesUseCaseImpl;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class requestBannersRefreshlambda1 implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public requestBannersRefreshlambda1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        switch (i) {
            case 4:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 5:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 6:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 7:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 16:
            case 21:
            case 25:
            case 27:
            default:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 9:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 12:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 15:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 17:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 18:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 19:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 20:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 22:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 23:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 24:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 26:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 28:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
        }
    }

    public requestBannersRefreshlambda1(AbsSavedState absSavedState) {
        this.RemoteActionCompatParcelizer = 1;
        absSavedState.getClass();
        this.write = absSavedState;
    }

    public requestBannersRefreshlambda1(publishErrorlambda1 publisherrorlambda1) {
        this.RemoteActionCompatParcelizer = 2;
        publisherrorlambda1.getClass();
        this.write = publisherrorlambda1;
    }

    public requestBannersRefreshlambda1(r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA r8lambda7so9yquzyurvt62dlcnbezickba) {
        this.RemoteActionCompatParcelizer = 29;
        r8lambda7so9yquzyurvt62dlcnbezickba.getClass();
        this.write = r8lambda7so9yquzyurvt62dlcnbezickba;
    }

    public requestBannersRefreshlambda1(publishErrorlambda1 publisherrorlambda1, int i) {
        this.RemoteActionCompatParcelizer = i;
        publisherrorlambda1.getClass();
        if (i != 14) {
            this.write = publisherrorlambda1;
        } else {
            this.write = publisherrorlambda1;
        }
    }

    public requestBannersRefreshlambda1(AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.RemoteActionCompatParcelizer = 13;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.write = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public requestBannersRefreshlambda1(isMainThread ismainthread, hasNestedScrollingParent hasnestedscrollingparent) {
        this.RemoteActionCompatParcelizer = 21;
        hasnestedscrollingparent.getClass();
        this.write = hasnestedscrollingparent;
    }

    public requestBannersRefreshlambda1(AndroidUiFrameClock androidUiFrameClock, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public requestBannersRefreshlambda1(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.RemoteActionCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        if (i == 25) {
            this.write = hasnestedscrollingparent;
        } else if (i != 27) {
            this.write = hasnestedscrollingparent;
        } else {
            this.write = hasnestedscrollingparent;
        }
    }

    public requestBannersRefreshlambda1(getEventParameters geteventparameters, hasNestedScrollingParent hasnestedscrollingparent) {
        this.RemoteActionCompatParcelizer = 8;
        hasnestedscrollingparent.getClass();
        this.write = hasnestedscrollingparent;
    }

    public requestBannersRefreshlambda1(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.RemoteActionCompatParcelizer = 10;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.write = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        Object obj = null;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new removeSingleSubscriptionlambda101((decode) objWrite, (byte) 0);
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new onRemoteTrigger((IActivityHandler) objWrite2);
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new OnSessionTrackingFailedListener((GetRiderStatusImpl) objWrite3);
            case 3:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return (ISdkClickHandler) objWrite4;
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new addDateInMilliseconds((decode) objWrite5);
            case 5:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new injectStoreInfoToParameters((QuestsCache) objWrite6);
            case 6:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                return new buildGdprPackage((setLastHorizontalStyle) objWrite7);
            case 7:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new buildMeasurementConsentPackage((QuestsCache) objWrite8);
            case 8:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new QuestsCache(new buildSessionPackage(androidx.datastore.preferences.core.PreferencesSerializer.write(null, new subscribeToContentCardsUpdateslambda30((Application) objWrite9, 12), 7)));
            case 9:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                getHardwareName gethardwarename = new getHardwareName((decode) objWrite10, false);
                int i3 = read + 33;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return gethardwarename;
                }
                obj.hashCode();
                throw null;
            case 10:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return PurchaseVerificationResponseData.IconCompatParcelizer((getIdentifiersValidationsEnabled) objWrite11);
            case 11:
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new getHuaweiAdsReferrer(getactionviewintentlambda0, (GetRiderStateImpl) objWrite12);
            case 12:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new OtpLogger((decode) objWrite13, (char) 0, false);
            case 13:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite14;
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite15 = getidentifiersvalidationsenabled.write().write(getPlayAdId.class);
                objWrite15.getClass();
                return (getPlayAdId) objWrite15;
            case 14:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new GetCourierStatusUseCaseImpl((GetRiderStateImpl) objWrite16, new accessisMainThread());
            case 15:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new getDeeplinkUrl((decode) objWrite17);
            case 16:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                Application application = (Application) objWrite18;
                SharedPreferences sharedPreferences = application.getSharedPreferences(getStartY.read(application), 0);
                sharedPreferences.getClass();
                int i4 = serializer + 67;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return sharedPreferences;
            case 17:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new r8lambda3LkgUPgEP7f5l_VmxVAeZOL0A7Y((r8lambda2tFXStZN_MXijoyymezhxf14xPY) objWrite19);
            case 18:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new r8lambda3kVrWtRC8n86EcXsBaaaVTQnb4((r8lambda2tFXStZN_MXijoyymezhxf14xPY) objWrite20);
            case 19:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                return new requestBannersRefreshlambda120((requestContentCardsRefreshlambda1) objWrite21);
            case 20:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new requestBannersRefreshlambda1unsubscribeLocalListeners((requestContentCardsRefreshlambda1) objWrite22);
            case 21:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new UserPropertiesDataStore(androidx.datastore.preferences.core.PreferencesSerializer.write(null, new subscribeToContentCardsUpdateslambda30((Application) objWrite23, 14), 7));
            case 22:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new ClearUserPropertiesUseCaseImpl((UserPropertiesRepository) objWrite24);
            case 23:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new SharedResourcePool((UserPropertiesRepository) objWrite25);
            case 24:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                return new SaveUserPropertiesUseCaseImpl((UserPropertiesRepository) objWrite26);
            case 25:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new subscribeToChangeUserEventslambda31((Application) objWrite27);
            case 26:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new subscribeToContentCardsUpdateslambda31((transferSessionPackageI) objWrite28);
            case 27:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new subscribeToFeatureFlagsUpdateslambda30((Application) objWrite29);
            case 28:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new subscribeToNetworkFailureslambda0((transferSessionPackageI) objWrite30);
            default:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                JsonObjectSerializer jsonObjectSerializer = new JsonObjectSerializer(3, (r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE) objWrite31);
                int i6 = read + 105;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return jsonObjectSerializer;
        }
    }
}
