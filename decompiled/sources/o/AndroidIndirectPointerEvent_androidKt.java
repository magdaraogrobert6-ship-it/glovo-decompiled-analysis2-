package o;

import android.app.Application;
import androidx.transition.Transition$1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.re2j.Parser;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesLocalRepositoryImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesViewModel;
import com.roadrunner.delivery.accept.declinebutton.domain.AcceptOrderClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineOrderClickEventRetriever;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsViewModel;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.domain.ContactRiderEventsLogger;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.login.logging.OtpLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent_androidKt implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final mergeJsonObjects write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | i6;
        int i9 = (~(i7 | (~i2))) | (~((~i6) | i7)) | (~(i6 | i4 | i2));
        int i10 = ~(i2 | i6);
        int i11 = i6 + i4 + i3 + ((-813770285) * i) + (135932771 * i5);
        int i12 = i11 * i11;
        int i13 = (526900465 * i6) + 74317824 + ((-1745228167) * i4) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i) + ((-366739456) * i5) + ((-1308753920) * i12);
        int i14 = (i6 * 1149714451) + 247108311 + (i4 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i * 1918847289) + (i5 * (-2006650391)) + (i12 * 460980224);
        return i13 + ((i14 * i14) * (-1418592256)) != 1 ? write(objArr) : IconCompatParcelizer(objArr);
    }

    public /* synthetic */ AndroidIndirectPointerEvent_androidKt(mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.write = mergejsonobjects;
    }

    public static AndroidIndirectPointerEvent_androidKt IconCompatParcelizer(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 9);
        int i2 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt IconCompatParcelizer(setPresentationView setpresentationview) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(setpresentationview, 15);
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt read(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 18);
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return androidIndirectPointerEvent_androidKt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AndroidIndirectPointerEvent_androidKt serializer(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 16);
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt write(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 8);
        int i2 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt write(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, 17);
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt read(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2 = new AndroidIndirectPointerEvent_androidKt(androidIndirectPointerEvent_androidKt, 10);
        int i2 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return androidIndirectPointerEvent_androidKt2;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) objArr[0], 19);
        int i2 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return androidIndirectPointerEvent_androidKt;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt((hasNestedScrollingParent) objArr[0], 14);
        int i2 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return androidIndirectPointerEvent_androidKt;
    }

    public static AndroidIndirectPointerEvent_androidKt IconCompatParcelizer(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        int i = 2 % 2;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, 13);
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return androidIndirectPointerEvent_androidKt;
        }
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        mergeJsonObjects mergejsonobjects = this.write;
        switch (i2) {
            case 0:
                return new toContentCaptureSessionCompat((Application) mergejsonobjects.write(), (Transition$1) drawForPersistenceui_graphics.read.write());
            case 1:
                return new AnalyticsServiceImpl((getPopupBackground) mergejsonobjects.write());
            case 2:
                return new OtpLogger((decode) mergejsonobjects.write(), 2);
            case 3:
                return new a9((Application) mergejsonobjects.write(), 3);
            case 4:
                return new AutoAcceptPreferencesViewModel((AutoAcceptPreferencesLocalRepositoryImpl) mergejsonobjects.write(), new getQueryContext());
            case 5:
                return new AcceptOrderClickEventRetriever((accessrequireViewFactoryHolder) mergejsonobjects.write());
            case 6:
                return new DeclineOrderClickEventRetriever((accessrequireViewFactoryHolder) mergejsonobjects.write());
            case 7:
                return new InAppCameraWithTagsViewModel((transferSessionPackageI) mergejsonobjects.write(), new IsFixableByRetry(17), new com.huawei.wisesecurity.ucs_credential.p0(0), new getQueryContext(), new ImageCaptureUseCaseImpl(1));
            case 8:
                return new CrowdSourcingImageRepositoryImpl((accessrequireViewFactoryHolder) mergejsonobjects.write());
            case 9:
                return new CrowdSourcingFloatingImageRepositoryImpl((CrowdSourcingDataStore) mergejsonobjects.write());
            case 10:
                CrowdSourcingFloatingImageRepositoryImpl crowdSourcingFloatingImageRepositoryImpl = (CrowdSourcingFloatingImageRepositoryImpl) mergejsonobjects.write();
                crowdSourcingFloatingImageRepositoryImpl.getClass();
                SendTestPushUseCase sendTestPushUseCase = new SendTestPushUseCase();
                sendTestPushUseCase.serializer = crowdSourcingFloatingImageRepositoryImpl;
                return sendTestPushUseCase;
            case 11:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 2);
            case 12:
                return new Parser.Pair((CrowdSourcingImageRepositoryImpl) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.g0) NullableInputConnectionWrapperApi25.serializer.write());
            case 13:
                return (setComposingText) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", setComposingText.class);
            case 14:
                Application application = (Application) mergejsonobjects.write();
                beginBatchEditInternal.read.getClass();
                application.getClass();
                return new CrowdSourcingDataStore((performCustomExitMxy_nc0) beginBatchEditInternal.serializer.getValue(application, beginBatchEditInternal.write[0]));
            case 15:
                getCompositionMzsxiRA getcompositionmzsxira = new getCompositionMzsxiRA((isOpenInternalroom_runtime) mergejsonobjects.write());
                int i3 = RemoteActionCompatParcelizer + 49;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 33 / 0;
                }
                return getcompositionmzsxira;
            case 16:
                return new ObserveUploadCompletionUseCase((androidx.work.impl.WorkManagerImpl) mergejsonobjects.write());
            case 17:
                SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", SetComposingTextCommand.class);
                int i5 = IconCompatParcelizer + 97;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return setComposingTextCommand;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 18:
                return new sendInputCommandlambda0((CrowdSourcingDataStore) mergejsonobjects.write());
            case 19:
                getPhonePjHm6EEannotations getphonepjhm6eeannotations = (getPhonePjHm6EEannotations) mergejsonobjects.write();
                getphonepjhm6eeannotations.getClass();
                SendTestPushUseCase sendTestPushUseCase2 = new SendTestPushUseCase();
                sendTestPushUseCase2.serializer = getphonepjhm6eeannotations;
                return sendTestPushUseCase2;
            case 20:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 3);
            case 21:
                return new OtpLogger((decode) mergejsonobjects.write(), 3);
            case 22:
                return new ContactRiderEventsLogger((decode) mergejsonobjects.write());
            case 23:
                return new InitiateTransferChangeUseCase((ConfirmationRepository) mergejsonobjects.write(), 0);
            case 24:
                return new r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ((isOpenInternalroom_runtime) mergejsonobjects.write());
            case 25:
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) mergejsonobjects.write(), 4);
            case 26:
                return new InitiateTransferChangeUseCase((ConfirmationRepository) mergejsonobjects.write(), 1);
            case 27:
                return new InitiateTransferChangeUseCase((ConfirmationRepository) mergejsonobjects.write(), 2);
            case 28:
                return new InitiateTransferChangeUseCase((ConfirmationRepository) mergejsonobjects.write(), 3);
            default:
                return new InitiateTransferChangeUseCase((ConfirmationRepository) mergejsonobjects.write(), 4);
        }
    }

    public static AndroidIndirectPointerEvent_androidKt IconCompatParcelizer(r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug) {
        int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
        return (AndroidIndirectPointerEvent_androidKt) RemoteActionCompatParcelizer(bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{r8lambdapkx6kfybgp4leowkebovjpb0ug}, iIconCompatParcelizer2, -1075503797, bo.app.n5.IconCompatParcelizer(), 1075503798);
    }

    public static AndroidIndirectPointerEvent_androidKt RemoteActionCompatParcelizer(hasNestedScrollingParent hasnestedscrollingparent) {
        int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
        return (AndroidIndirectPointerEvent_androidKt) RemoteActionCompatParcelizer(bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{hasnestedscrollingparent}, iIconCompatParcelizer2, -1798125367, bo.app.n5.IconCompatParcelizer(), 1798125367);
    }
}
