package o;

import android.app.Application;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.database.Database;
import com.roadrunner.database.domain.ClearDatabaseUseCase;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ConfirmDeliveryStepUseCaseImpl;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.domain.detection.DetectFaceWithFirebase;
import com.roadrunner.home.nest.NestLoadingServiceImpl;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.liveness.domain.CreateEmptyCameraImageUseCaseImpl;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.sentiance.core.model.events.H$b;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetTextBottomcp implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ accessgetTextBottomcp(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.read = mergejsonobjects2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.read;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                return new ClearDatabaseUseCase((Database) mergejsonobjects2.write(), (ExecuteDatabaseRequest) mergejsonobjects.write());
            case 1:
                return new InitializeAppStartupItemsImpl((processingInstruction) mergejsonobjects2.write(), (WebChatNativeCacheDataStore) mergejsonobjects.write());
            case 2:
                return new resolveParagraphStyleDefaults((CustomerChatProviderImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 3:
                return new InitializeAppStartupItemsImpl((accessrequireViewFactoryHolder) mergejsonobjects2.write(), (StateDataStoreImpl) mergejsonobjects.write());
            case 4:
                return new Nonelambda0((Application) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 5:
                return new EntrancePictureRepository((accessrequireViewFactoryHolder) mergejsonobjects2.write(), (AndroidFontListTypeface) mergejsonobjects.write());
            case 6:
                return new createCharSequence((FontEj4NQ78default) mergejsonobjects.write(), (decode) mergejsonobjects2.write());
            case 7:
                return new ObserveEntrancePicture((EntrancePictureRepository) mergejsonobjects2.write(), (isStateSaved) mergejsonobjects.write());
            case 8:
                Application application = (Application) mergejsonobjects2.write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) mergejsonobjects.write();
                AndroidParagraphIntrinsics_androidKt.serializer.getClass();
                application.getClass();
                isopeninternalroom_runtime.getClass();
                return new AndroidFontListTypeface((performCustomExitMxy_nc0) AndroidParagraphIntrinsics_androidKt.read.getValue(application, AndroidParagraphIntrinsics_androidKt.IconCompatParcelizer[0]), isopeninternalroom_runtime);
            case 9:
                return new accessgetVisiblecp((getEllipsisgIe3tQ8annotations) mergejsonobjects2.write(), (TextOverflowCompanion) mergejsonobjects.write());
            case 10:
                return new findComposableMethod((createAnimation) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            case 11:
                return new r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU((FontEj4NQ78default) mergejsonobjects.write(), (decode) mergejsonobjects2.write());
            case 12:
                return new ConfirmDeliveryStepUseCaseImpl((ConfirmationRepository) mergejsonobjects2.write(), (com.huawei.wisesecurity.ucs_credential.g0) CompositionDataRecordImpl.serializer.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 13:
                return new H$b((setStateParametersdefault) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 14:
                return new r8lambdaGtlc562Nvrrf3JdxYhx1fNZ8ac((unpackMetaLastChildOffset) mergejsonobjects2.write(), (openSessionlambda1) mergejsonobjects.write());
            case 15:
                return new DensityImpl((setInitialStateToCurrentAnimationValue) mergejsonobjects2.write(), (createClocklambda0) mergejsonobjects.write());
            case 16:
                return new minusqkQi6aY((setInitialStateToCurrentAnimationValue) mergejsonobjects.write(), (createClocklambda0) mergejsonobjects2.write());
            case 17:
                return new setGuidelineEnd((transferSessionPackageI) mergejsonobjects2.write(), (convertReferenceString) mergejsonobjects.write());
            case 18:
                return new DetectFaceWithFirebase((Application) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 19:
                return new SignInDataStore((NestComponentRepositoryImpl) mergejsonobjects2.write(), (NestLoadingServiceImpl) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.n0) getChangePayload.read.write());
            case 20:
                return new SignInDataStore((NestComponentRepositoryImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.p0) prefetch.serializer.write());
            case 21:
                return new SignInDataStore((NestComponentRepositoryImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write(), (IsFixableByRetry) chooseDropTarget.IconCompatParcelizer.write());
            case 22:
                return new addItemDecoration((Application) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 23:
                addFlags addflags = new addFlags((IncogniaManagerImpl) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
                int i3 = IconCompatParcelizer + 45;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return addflags;
            case 24:
                return new isBound((verifyAndTrackPlayStorePurchaseI) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write(), 0);
            case 25:
                return new syncroom_runtime((AdjustLinkResolution) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 26:
                return new CreateEmptyCameraImageUseCaseImpl((resetOutlineParams) mergejsonobjects2.write(), (onUpgrade) mergejsonobjects.write());
            case 27:
                com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(new FormBody.Builder(1), (CircularProgressDrawable2) mergejsonobjects2.write(), (setBackgroundColor) mergejsonobjects.write());
                int i5 = write + 97;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return dropShadowEffect;
            case 28:
                return new setBackgroundColor((ChallengesRepository) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write(), (IsFixableByRetry) getProgressViewEndOffset.read.write());
            default:
                getRearDisplayMetrics getreardisplaymetrics = new getRearDisplayMetrics((getPresentationContext) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
                int i7 = IconCompatParcelizer + 121;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 29 / 0;
                }
                return getreardisplaymetrics;
        }
    }
}
