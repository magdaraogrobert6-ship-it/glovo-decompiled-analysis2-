package o;

import android.app.Application;
import androidx.transition.Transition$1;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.gms.dynamite.zzj;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.GetIdVerificationLocationsImpl;
import com.roadrunner.auth.domain.IsRiderOnboardingEligibleImpl;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.SaveSignInDataUseCaseImpl;
import com.roadrunner.auth.domain.logout.ClearAuthDataUseCaseImpl;
import com.roadrunner.auth.domain.mapper.MapAuthEntityToRefreshTokenRequest;
import com.roadrunner.auth.domain.token.DoesAccessTokenExistUseCaseImpl;
import com.roadrunner.common.data.api.CloudflareErrorClassifier;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getContentDataType implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public getContentDataType(zzj zzjVar, hasNestedScrollingParent hasnestedscrollingparent) {
        this.serializer = 10;
        this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
    }

    public /* synthetic */ getContentDataType(mergeJsonObjects mergejsonobjects, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        switch (i4) {
            case 0:
                return new getDisabled((decode) mergejsonobjects.write(), new Path$Companion(), new CloudflareErrorClassifier());
            case 1:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                makeNativePaint makenativepaintIconCompatParcelizer = makeNativePaint.IconCompatParcelizer(application.getApplicationContext());
                makenativepaintIconCompatParcelizer.getClass();
                return makenativepaintIconCompatParcelizer;
            case 2:
                CourierApplication courierApplication = (CourierApplication) mergejsonobjects.write();
                courierApplication.getClass();
                return courierApplication;
            case 3:
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                settransactionsuccessful.getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(settransactionsuccessful);
            case 4:
                return new getExponentimpl((CourierApplication) mergejsonobjects.write());
            case 5:
                return new PlatformHapticFeedbackType((Application) mergejsonobjects.write(), 0);
            case 6:
                return new getMove4ZHQPSE((transferSessionPackageI) mergejsonobjects.write());
            case 7:
                return new getPress4ZHQPSE((transferSessionPackageI) mergejsonobjects.write());
            case 8:
                return new IndirectPointerInputChange((s2) mergejsonobjects.write());
            case 9:
                Transition$1 transition$1 = new Transition$1(19);
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new getExponentimpl(transition$1, (r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA) objWrite);
            case 10:
                Application application2 = (Application) mergejsonobjects.write();
                application2.getClass();
                return androidx.work.impl.WorkManagerImpl.RemoteActionCompatParcelizer(application2);
            case 11:
                getEmannotations getemannotations = (getEmannotations) mergejsonobjects.write();
                getemannotations.getClass();
                coil3.memory.MemoryCacheService memoryCacheService = new coil3.memory.MemoryCacheService();
                memoryCacheService.RemoteActionCompatParcelizer = getemannotations;
                return memoryCacheService;
            case 12:
                return new getOrNull((Application) mergejsonobjects.write());
            case 13:
                mergedSemanticsConfiguration mergedsemanticsconfiguration = new mergedSemanticsConfiguration((decode) mergejsonobjects.write());
                int i5 = IconCompatParcelizer + 45;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 53 / 0;
                }
                return mergedsemanticsconfiguration;
            case 14:
                return new InitializeAppStartupItemsImpl((addSemanticsPropertiesFrom) SemanticsNode.read.write(), (Application) mergejsonobjects.write());
            case 15:
                return new SignInDataStore((performCustomExitMxy_nc0) mergejsonobjects.write());
            case 16:
                return new getCustomActionsdelegate((boundingRectInRoot) mergejsonobjects.write());
            case 17:
                return new GetIdVerificationLocationsImpl((AuthRepository) mergejsonobjects.write(), 0);
            case 18:
                return new getHorizontalScrollAxisRangedelegate((getContentDescription) mergejsonobjects.write());
            case 19:
                return new getLiveRegiondelegate((AuthRepository) mergejsonobjects.write());
            case 20:
                return new getInputTextSuggestionStatedelegate((AuthRepository) mergejsonobjects.write());
            case 21:
                return new getImeActiondelegate((AuthRepository) mergejsonobjects.write());
            case 22:
                return new IsRiderOnboardingEligibleImpl((AuthRepository) mergejsonobjects.write());
            case 23:
                return new SaveAuthDataUseCase((AuthRepository) mergejsonobjects.write());
            case 24:
                return new SaveSignInDataUseCaseImpl((getContentDescription) mergejsonobjects.write());
            case 25:
                return new ClearAuthDataUseCaseImpl((AuthRepository) mergejsonobjects.write());
            case 26:
                return new insertTextAtCursor((SemanticsPropertiesTestTag1) mergejsonobjects.write());
            case 27:
                return new MapAuthEntityToRefreshTokenRequest((toNativeBlendMode) mergejsonobjects.write());
            case 28:
                DoesAccessTokenExistUseCaseImpl doesAccessTokenExistUseCaseImpl = new DoesAccessTokenExistUseCaseImpl((AuthRepository) mergejsonobjects.write());
                int i7 = write + 47;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 0;
                }
                return doesAccessTokenExistUseCaseImpl;
            default:
                return new pageLeft((AuthRepository) mergejsonobjects.write());
        }
    }
}
