package o;

import android.app.Application;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.roadrunner.web.performance.WebViewInitializer;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class elambda0 implements getColorIntegerOrNulllambda0 {
    private static int serializer = 0;
    private static int write = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;

    public /* synthetic */ elambda0(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.read;
        switch (i2) {
            case 0:
                return new dlambda0((Application) mergejsonobjects2.write(), (r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q) mergejsonobjects.write());
            case 1:
                r8lambdacqEJOAZiJRBqYtVLdvjougzNXbY r8lambdacqejoazijrbqytvldvjougznxby = new r8lambdacqEJOAZiJRBqYtVLdvjougzNXbY((r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) mergejsonobjects2.write(), (accessgetOldDependencyp) mergejsonobjects.write());
                int i3 = serializer + 71;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                return r8lambdacqejoazijrbqytvldvjougznxby;
            case 2:
                return new r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs((decode) mergejsonobjects2.write(), (QualtricsManagerImpl) mergejsonobjects.write());
            case 3:
                return new StartWorkingRepository((deserializeContentCardlambda2) mergejsonobjects2.write(), (ImageHeaderParserImageType) configure.read.write(), (ExecuteApiRequest) mergejsonobjects.write());
            case 4:
                return new lambda39((logPushDeliverylambda0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 5:
                return new logPurchaselambda1((transferSessionPackageI) mergejsonobjects2.write(), (verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
            case 6:
                return new logPushDeliverylambda0((Application) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 7:
                return new logPushDeliverylambda1((logPushDeliverylambda0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 8:
                return new NafathTimerDataStore((performCustomExitMxy_nc0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write(), 1);
            case 9:
                return new addSingleSynchronousSubscription((changeUser) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 10:
                Application application = (Application) mergejsonobjects2.write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) mergejsonobjects.write();
                application.getClass();
                isopeninternalroom_runtime.getClass();
                OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
                okHttpCall$1.write = application;
                okHttpCall$1.serializer = isopeninternalroom_runtime;
                return okHttpCall$1;
            case 11:
                BrazeExternalSyntheticLambda29 brazeExternalSyntheticLambda29 = new BrazeExternalSyntheticLambda29((WebViewInitializer) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
                int i5 = write + 119;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return brazeExternalSyntheticLambda29;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            default:
                return new r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q((setTransactionSuccessful) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
        }
    }
}
