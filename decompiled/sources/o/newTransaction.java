package o;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.router.LoadAbTestConfigUseCase;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.recruitment.accountcreation.presentation.SnackBarErrorMapper;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.sentry.CombinedScopeView;
import io.sentry.util.network.NetworkBody;
import okhttp3.FormBody;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class newTransaction implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects write;

    public /* synthetic */ newTransaction(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.write = mergejsonobjects2;
    }

    public /* synthetic */ newTransaction(io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.write = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.write;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                return new RouterLogger((decode) mergejsonobjects2.write(), (AppEventInfoChangeHandler) mergejsonobjects.write());
            case 1:
                return new ObserveDistanceToLocationUseCaseImpl((GetLocationUpdatesUseCaseImpl) mergejsonobjects2.write(), new getActionViewIntentlambda0(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 2:
                return new CombinedScopeView((WebViewBuilderException) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 3:
                return new N$b((performCustomExitMxy_nc0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 4:
                return new C$b((QueryResultCompanion) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write(), (BrazeExternalSyntheticLambda5) QueryResult.serializer.write());
            case 5:
                RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach1 = (RectListDebuggerModifierNodeonAttach1) mergejsonobjects2.write();
                RectListDebugger rectListDebugger = (RectListDebugger) mergejsonobjects.write();
                rectListDebuggerModifierNodeonAttach1.getClass();
                rectListDebugger.getClass();
                return new CountDownTimerUiModel(rectListDebuggerModifierNodeonAttach1, rectListDebugger);
            case 6:
                RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach2 = (RectListDebuggerModifierNodeonAttach1) mergejsonobjects2.write();
                RectListDebugger rectListDebugger2 = (RectListDebugger) mergejsonobjects.write();
                rectListDebuggerModifierNodeonAttach2.getClass();
                rectListDebugger2.getClass();
                return new CountDownTimerUiModel(rectListDebuggerModifierNodeonAttach2, rectListDebugger2);
            case 7:
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects2.write();
                boundingRectInRoot boundingrectinroot = (boundingRectInRoot) mergejsonobjects.write();
                transfersessionpackagei.getClass();
                boundingrectinroot.getClass();
                PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.read();
                phoneNumberUtil.getClass();
                return new QueryResultCompanion(transfersessionpackagei, boundingrectinroot, phoneNumberUtil);
            case 8:
                return new c6((transferSessionPackageI) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 9:
                return new LoadAbTestConfigUseCase((updateStatusI) mergejsonobjects2.write(), (AppEventInfoChangeHandler) mergejsonobjects.write());
            case 10:
                return new dg((FontEj4NQ78default) mergejsonobjects.write(), (decode) mergejsonobjects2.write());
            case 11:
                return new NafathTimerDataStore((performCustomExitMxy_nc0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write(), 0);
            case 12:
                return new FormBody.Builder((decode) mergejsonobjects2.write(), (CachedDeliveryRepository) mergejsonobjects.write());
            case 13:
                v4 v4Var = new v4((transferSessionPackageI) mergejsonobjects2.write(), (verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
                int i4 = serializer + 51;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return v4Var;
            case 14:
                return new v9((transferSessionPackageI) mergejsonobjects.write(), (verifyAndTrackPlayStorePurchaseI) mergejsonobjects2.write());
            case 15:
                return new va((transferSessionPackageI) mergejsonobjects2.write(), (verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
            case 16:
                return new vd((transferSessionPackageI) mergejsonobjects2.write(), (verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
            case 17:
                return new getSupportedCipherSuites((OpportunitiesRepository) mergejsonobjects2.write(), (E) mergejsonobjects.write());
            case 18:
                return new xa((v9) mergejsonobjects2.write(), (setLastHorizontalStyle) mergejsonobjects.write());
            case 19:
                return new SubcomposeAsyncImageKt((SubcomposeAsyncImagegl8XCv8) mergejsonobjects2.write(), (s2) mergejsonobjects.write());
            case 20:
                return new AbstractContentPainterNode((SubcomposeAsyncImagegl8XCv8) mergejsonobjects2.write(), (subscribeToPushNotificationEventslambda1) mergejsonobjects.write());
            case 21:
                return new intercept((DiskLruCachelaunchCleanup1) mergejsonobjects2.write(), (DiskLruCacheEditor) mergejsonobjects.write());
            case 22:
                return new RouterLogger((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) mergejsonobjects2.write(), (r8lambda_xjKNsnSVqrQpdhsT42da52uGY) mergejsonobjects.write());
            case 23:
                return new r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY(new Path$Companion(), new ImageHeaderParserImageType(), (r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo) mergejsonobjects2.write(), (getAllSemanticsNodesToMap) mergejsonobjects.write());
            case 24:
                return new com.airbnb.lottie.parser.DropShadowEffect((performCustomExitMxy_nc0) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 25:
                return new PhoneValidationRepository((ExecuteAccountCreationApiRequest) mergejsonobjects2.write(), (onResumeI) mergejsonobjects.write(), 1);
            case 26:
                return new NetworkBody((ExecuteAccountCreationApiRequest) mergejsonobjects2.write(), (onResumeI) mergejsonobjects.write());
            case 27:
                return new SnackBarErrorMapper((setTransactionSuccessful) mergejsonobjects2.write(), (NetworkErrorMapperImpl) mergejsonobjects.write());
            case 28:
                return new ActivityState(getColorIntegerOrNull.serializer(mergejsonobjects2), getColorIntegerOrNull.serializer(mergejsonobjects), getColorIntegerOrNull.serializer((mergeJsonObjects) stamp.write));
            default:
                return new RiderSupportRootedCheckImpl((SystemLifecycleSystemLifecycleCallback) mergejsonobjects2.write(), (GetCourierStatusUseCaseImpl) mergejsonobjects.write());
        }
    }
}
