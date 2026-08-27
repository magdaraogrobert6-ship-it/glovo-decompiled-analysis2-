package o;

import android.app.Application;
import android.view.WindowManager;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.order.history.data.HistoryRepository;
import com.roadrunner.order.history.domain.ClearHistoryDatabaseUseCaseImpl;
import com.roadrunner.password_rules.PopulatePasswordRulesUseCaseImpl;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsAppInfoChangeListener;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.sentiance.core.model.events.H$b;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY implements getColorIntegerOrNulllambda0 {
    private static int serializer = 0;
    private static int write = 1;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY(mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
    }

    public /* synthetic */ r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY(Object obj, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                return new r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA((getContentViewGroupParentLayout) mergejsonobjects.write());
            case 1:
                return new z6((Room) mergejsonobjects.write());
            case 2:
                return new ClearHistoryDatabaseUseCaseImpl((HistoryRepository) mergejsonobjects.write());
            case 3:
                return new CrossfadePainter((decode) mergejsonobjects.write());
            case 4:
                return new ContentPainterElement((SubcomposeAsyncImageContent) mergejsonobjects.write());
            case 5:
                return new ContentPainterNode((SubcomposeAsyncImagegl8XCv8) mergejsonobjects.write(), 1);
            case 6:
                return new ContentPainterNode((SubcomposeAsyncImagegl8XCv8) mergejsonobjects.write(), 0);
            case 7:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                Object systemService = application.getSystemService("window");
                systemService.getClass();
                return (WindowManager) systemService;
            case 8:
                return new RouterLogger((intercept) mergejsonobjects.write(), (getActionViewIntentlambda0) accessdecode.IconCompatParcelizer.write());
            case 9:
                return new DiskLruCachelaunchCleanup1((transferSessionPackageI) mergejsonobjects.write());
            case 10:
                return new PopulatePasswordRulesUseCaseImpl((setTransactionSuccessful) mergejsonobjects.write());
            case 11:
                return new buildRGBAExpression((decode) mergejsonobjects.write());
            case 12:
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) mergejsonobjects.write(), 6);
            case 13:
                return new r8lambdaDq44v2nxKlyM2yb_Rh9Rq5jRnTY((transferSessionPackageI) mergejsonobjects.write());
            case 14:
                return new r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA((r8lambda8ONSZngU81o_LRT9BkSkXpME2w) mergejsonobjects.write());
            case 15:
                return new r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s((r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU) mergejsonobjects.write());
            case 16:
                return new r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo((r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU) mergejsonobjects.write());
            case 17:
                return new r8lambda_xjKNsnSVqrQpdhsT42da52uGY((Application) mergejsonobjects.write());
            case 18:
                return new r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik((Application) mergejsonobjects.write());
            case 19:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new lambdaaddGlobalPartnerParameter22((androidx.work.impl.WorkManagerImpl) objWrite);
            case 20:
                return new TokenRegistryApiRequest((lambdaremoveGlobalCallbackParameters29) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", lambdaremoveGlobalCallbackParameters29.class));
            case 21:
                launchThirdPartySharingResponseTasksI launchthirdpartysharingresponsetasksi = (launchThirdPartySharingResponseTasksI) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", launchThirdPartySharingResponseTasksI.class);
                int i3 = write + 87;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return launchthirdpartysharingresponsetasksi;
                }
                throw null;
            case 22:
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                return (Gen2FunWithFlagsConfigRepository) objWrite2;
            case 23:
                Object objWrite3 = mergejsonobjects.write();
                objWrite3.getClass();
                return new Gen2FunWithFlagsAppInfoChangeListener((com.deliveryhero.fwf_client.FwFClient) objWrite3);
            case 24:
                return new AccountCreationLogger((decode) mergejsonobjects.write(), (getAdjustConfig) getDeviceInfo.serializer.write());
            case 25:
                return new ExecuteAccountCreationApiRequest(new onPauseI(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 26:
                return (onResumeI) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", onResumeI.class);
            case 27:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 16);
            case 28:
                return new NetworkBody((decode) mergejsonobjects.write(), (trackPlayStoreSubscription) verifyAndTrackPlayStorePurchase.serializer.write());
            default:
                H$b h$b = new H$b(new ActivityHandlerExternalSyntheticLambda13(), (isOpenInternalroom_runtime) mergejsonobjects.write());
                int i4 = write + 73;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 86 / 0;
                }
                return h$b;
        }
    }
}
