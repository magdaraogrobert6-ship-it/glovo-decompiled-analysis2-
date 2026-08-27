package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.rider.state.quests.data.QuestsCache;
import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import com.roadrunner.startworking.data.StartWorkingRepository;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import io.socket.parser.IOParser$Decoder;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class requestSingleLocationUpdatelambda1 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final mergeJsonObjects write;

    public /* synthetic */ requestSingleLocationUpdatelambda1(mergeJsonObjects mergejsonobjects, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = mergejsonobjects;
    }

    public /* synthetic */ requestSingleLocationUpdatelambda1(Object obj, mergeJsonObjects mergejsonobjects, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.write;
        int i3 = 0;
        switch (i2) {
            case 0:
                return new requestSingleLocationUpdatelambda0((decode) mergejsonobjects.write(), new Path$Companion());
            case 1:
                return new OtpLogger((decode) mergejsonobjects.write(), 10);
            case 2:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new ApplicantRepository((ActivityHandler52) objWrite);
            case 3:
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) mergejsonobjects.write(), 8);
            case 4:
                return new createQuery((transferSessionPackageI) mergejsonobjects.write(), 3);
            case 5:
                return new SaveHeatmapUrlImpl((getProductId) mergejsonobjects.write());
            case 6:
                return (getProductId) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", getProductId.class);
            case 7:
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                return (UpdateStateUseCaseImpl) objWrite2;
            case 8:
                Object objWrite3 = mergejsonobjects.write();
                objWrite3.getClass();
                return new buildSubscriptionPackage((QuestsCache) objWrite3);
            case 9:
                return new setGdprForgetMe((setTransactionSuccessful) mergejsonobjects.write());
            case 10:
                Object objWrite4 = mergejsonobjects.write();
                objWrite4.getClass();
                return new r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U((r8lambda2tFXStZN_MXijoyymezhxf14xPY) objWrite4);
            case 11:
                return (r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE.class);
            case 12:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                return new SettingsCacheImpl(new buildSessionPackage(androidx.datastore.preferences.core.PreferencesSerializer.write(null, new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, i3), 7)));
            case 13:
                showTextSubstitution showtextsubstitution = (showTextSubstitution) mergejsonobjects.write();
                showtextsubstitution.getClass();
                return new r8lambdadaazyEDDzwnij76sC1FsKvBpnqQ(showtextsubstitution);
            case 14:
                OtpLogger otpLogger = new OtpLogger((decode) mergejsonobjects.write(), 15);
                int i4 = IconCompatParcelizer + 55;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return otpLogger;
            case 15:
                return new SaveHeatmapUrlImpl((SideMenuRepository) mergejsonobjects.write());
            case 16:
                return (r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk.class);
            case 17:
                Application application2 = (Application) mergejsonobjects.write();
                application2.getClass();
                return new SideMenuCacheImpl(new buildSessionPackage(androidx.datastore.preferences.core.PreferencesSerializer.write(null, new subscribeToContentCardsUpdateslambda30(application2, 13), 7)));
            case 18:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder((SideMenuRepository) mergejsonobjects.write(), (getSdkEnablementProviderandroid_sdk_base_release) _get_currentUser_lambda0.read.write());
                int i6 = IconCompatParcelizer + 97;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 0 / 0;
                }
                return iOParser$Decoder;
            case 19:
                return new removeSingleSubscriptionlambda101((decode) mergejsonobjects.write(), 4);
            case 20:
                return new applyPendingRuntimeConfigurationlambda00((setTransactionSuccessful) mergejsonobjects.write());
            case 21:
                return (deserializeContentCardlambda2) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", deserializeContentCardlambda2.class);
            case 22:
                return (handleInternalBannerRefreshlambda0) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", handleInternalBannerRefreshlambda0.class);
            case 23:
                return new GetAppStateImpl((logPushDeliverylambda1) mergejsonobjects.write());
            case 24:
                return new SaveHeatmapUrlImpl((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) mergejsonobjects.write());
            case 25:
                return new isApiKeyPresentandroid_sdk_base_releaseannotations((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) mergejsonobjects.write());
            case 26:
                return new GetAppStateImpl((StartWorkingRepository) mergejsonobjects.write());
            case 27:
                return new JsonObjectSerializer((logPushDeliverylambda1) mergejsonobjects.write());
            case 28:
                SemanticsOwner semanticsOwner = (SemanticsOwner) mergejsonobjects.write();
                semanticsOwner.getClass();
                SharedResourcePool sharedResourcePool = new SharedResourcePool();
                sharedResourcePool.IconCompatParcelizer = semanticsOwner;
                return sharedResourcePool;
            default:
                return getLightGray0d7_KjUannotations.RemoteActionCompatParcelizer((getIdentifiersValidationsEnabled) mergejsonobjects.write());
        }
    }
}
