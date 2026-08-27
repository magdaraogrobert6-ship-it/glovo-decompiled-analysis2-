package o;

import android.app.Application;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.diagnostics.presentation.view.DiagnosticsUiStateMapper;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.domain.GetAppStateImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class executeQuery implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;
    public final mergeJsonObjects write;

    public /* synthetic */ executeQuery(mergeJsonObjects mergejsonobjects, int i) {
        this.serializer = i;
        this.write = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.write;
        switch (i4) {
            case 0:
                return new OtpLogger((decode) mergejsonobjects.write(), 0);
            case 1:
                r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI r8lambdacdgnlpxslcstkef_ldjaoz3voi = (r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI) mergejsonobjects.write();
                r8lambdacdgnlpxslcstkef_ldjaoz3voi.getClass();
                SendTestPushUseCase sendTestPushUseCase = new SendTestPushUseCase();
                sendTestPushUseCase.serializer = r8lambdacdgnlpxslcstkef_ldjaoz3voi;
                return sendTestPushUseCase;
            case 2:
                return new OtpLogger((decode) mergejsonobjects.write(), 4);
            case 3:
                NotificationsDiagnosticsRepository notificationsDiagnosticsRepository = (NotificationsDiagnosticsRepository) mergejsonobjects.write();
                notificationsDiagnosticsRepository.getClass();
                SendTestPushUseCase sendTestPushUseCase2 = new SendTestPushUseCase();
                sendTestPushUseCase2.serializer = notificationsDiagnosticsRepository;
                return sendTestPushUseCase2;
            case 4:
                return new DiagnosticsUiStateMapper((setTransactionSuccessful) mergejsonobjects.write());
            case 5:
                return new OtpLogger((decode) mergejsonobjects.write(), 5);
            case 6:
                return new setGuidelineBegin((resetOutlineParams) mergejsonobjects.write(), 0);
            case 7:
                return new OtpLogger((decode) mergejsonobjects.write(), 6);
            case 8:
                return new setUdmandroid_sdk_base_release((EnumColumnAdapter) mergejsonobjects.write(), 2);
            case 9:
                return new setDivider((setTransactionSuccessful) mergejsonobjects.write());
            case 10:
                return new a9((Application) mergejsonobjects.write(), 4);
            case 11:
                InstantShiftRepository instantShiftRepository = (InstantShiftRepository) mergejsonobjects.write();
                instantShiftRepository.getClass();
                SendTestPushUseCase sendTestPushUseCase3 = new SendTestPushUseCase();
                sendTestPushUseCase3.serializer = instantShiftRepository;
                return sendTestPushUseCase3;
            case 12:
                return new OtpLogger((decode) mergejsonobjects.write(), 7);
            case 13:
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                settransactionsuccessful.getClass();
                return new accessstartTrackingTable(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_error_message), 0);
            case 14:
                return new setDistanceToTriggerSync((onUpgrade) mergejsonobjects.write(), 1);
            case 15:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 7);
            case 16:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 8);
            case 17:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 9);
            case 18:
                return new setDistanceToTriggerSync((onUpgrade) mergejsonobjects.write(), 2);
            case 19:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 10);
            case 20:
                return new TransactionWithoutReturn((RectManager) mergejsonobjects.write());
            case 21:
                return new GetAppStateImpl((accessgetOldDependencyp) mergejsonobjects.write());
            case 22:
                return new getAfterVersion((isOpenInternalroom_runtime) mergejsonobjects.write());
            case 23:
                return new executedefault((SemanticsOwner) mergejsonobjects.write());
            case 24:
                return new a5(new com.huawei.agconnect.config.impl.m(28), (accessgetOldDependencyp) mergejsonobjects.write());
            case 25:
                return new a9((Application) mergejsonobjects.write(), 0);
            case 26:
                return new a9((Application) mergejsonobjects.write(), 5);
            case 27:
                return new OtpLogger((decode) mergejsonobjects.write(), 8);
            case 28:
                return new unpackInt2((transferSessionPackageI) mergejsonobjects.write(), 7);
            default:
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 11);
                int i5 = read + 1;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return brazeExternalSyntheticLambda28;
                }
                throw null;
        }
    }
}
