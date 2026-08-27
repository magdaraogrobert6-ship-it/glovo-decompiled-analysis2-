package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class readInstallReferrerHuaweiAppGallery implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ readInstallReferrerHuaweiAppGallery(int i) {
        this.IconCompatParcelizer = i;
    }

    public static readInstallReferrerHuaweiAppGallery read() {
        int i = 2 % 2;
        readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery = new readInstallReferrerHuaweiAppGallery(4);
        int i2 = write + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return readinstallreferrerhuaweiappgallery;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        subscribeToBannersUpdates subscribetobannersupdates = resizeToBitmapDimensionslambda1.serializer;
        int i3 = 5;
        switch (i2) {
            case 0:
                return new BrazeExternalSyntheticLambda5(i3);
            case 1:
                return new com.huawei.wisesecurity.ucs_credential.n0(0);
            case 2:
                return new com.huawei.wisesecurity.ucs_credential.p0(0);
            case 3:
                return new com.huawei.wisesecurity.ucs_credential.g0(0);
            case 4:
                return new com.huawei.agconnect.config.impl.m(new com.huawei.wisesecurity.ucs_credential.n0(0), new com.huawei.wisesecurity.ucs_credential.p0(0));
            case 5:
                return new com.huawei.wisesecurity.ucs_credential.p0(0);
            case 6:
                return new getLambda1163195098ui_tooling((SharedResourcePool) subscribetobannersupdates.write());
            case 7:
                return new attachAllAnimationslambda04((SharedResourcePool) subscribetobannersupdates.write());
            case 8:
                return new com.huawei.wisesecurity.ucs_credential.g0(0);
            case 9:
                return new com.huawei.agconnect.config.impl.m(new IsFixableByRetry(22), (com.huawei.wisesecurity.ucs_credential.g0) trackComposeAnimationlambda0.IconCompatParcelizer.write());
            case 10:
                Parser.Pair pair = new Parser.Pair(new com.huawei.wisesecurity.ucs_credential.g0(0), new notifyItemRangeInserted());
                int i4 = write + 63;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return pair;
            case 11:
                return new com.huawei.agconnect.config.impl.m((com.huawei.wisesecurity.ucs_credential.g0) notifyItemRangeChanged.IconCompatParcelizer.write(), new com.huawei.wisesecurity.ucs_credential.g0(0));
            case 12:
                return new com.huawei.wisesecurity.ucs_credential.g0(0);
            case 13:
                return new H$b(new com.huawei.wisesecurity.ucs_credential.g0(0), new notifyItemRangeInserted());
            case 14:
                return new Vw$Vw((com.huawei.wisesecurity.ucs_credential.p0) onBindViewHolder.read.write(), new com.huawei.wisesecurity.ucs_credential.g0(0));
            case 15:
                return new com.huawei.wisesecurity.ucs_credential.p0(0);
            case 16:
                return new SignInDataStore((IsFixableByRetry) onCreateViewHolder.write.write(), new com.huawei.wisesecurity.ucs_credential.g0(0), new com.huawei.wisesecurity.ucs_credential.n0(0));
            case 17:
                return new IsFixableByRetry(28);
            case 18:
                return new GetAppStateImpl((BrazeExternalSyntheticLambda5) QueryResult.serializer.write());
            case 19:
                return new markCardAsVisuallyRead(new com.huawei.agconnect.config.impl.m(28), 0);
            case 20:
                return new ComponentRegistryBuilder((SharedResourcePool) subscribetobannersupdates.write());
            case 21:
                return new GetAppStateImpl((BrazeExternalSyntheticLambda5) readInstallReferrerMeta.read.write(), (byte) 0);
            case 22:
                return new GetAppStateImpl((BrazeCompanionExternalSyntheticLambda21) readInstallReferrerXiaomi.RemoteActionCompatParcelizer.write());
            case 23:
                return new getSdkEnablementProviderandroid_sdk_base_release(i3);
            case 24:
                BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = new BrazeCompanionExternalSyntheticLambda21(6);
                int i6 = read + 55;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return brazeCompanionExternalSyntheticLambda21;
            case 25:
                return new getIsClick();
            case 26:
                return new increaseRetries();
            case 27:
                return new setPartnerParameters();
            case 28:
                return new switchToOfflineMode();
            default:
                return new GetAppStateImpl();
        }
    }
}
