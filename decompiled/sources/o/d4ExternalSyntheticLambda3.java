package o;

import com.roadrunner.diagnostics.domain.CheckDeviceTokenUseCase;
import com.roadrunner.diagnostics.domain.FixTokenUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.diagnostics.presentation.view.DiagnosticsUiStateMapper;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class d4ExternalSyntheticLambda3 implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final getColorIntegerOrNulllambda0 MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects PlaybackStateCompat;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public d4ExternalSyntheticLambda3(mergeJsonObjects mergejsonobjects, acquire acquireVar, applyLayoutFeatures applylayoutfeatures, applyLayoutFeatures applylayoutfeatures2, executeQuery executequery, executeQuery executequery2, getContentDataType getcontentdatatype, mergeJsonObjects mergejsonobjects2, acquire acquireVar2, executeQuery executequery3, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, q0 q0Var) {
        this.MediaSessionCompatToken = mergejsonobjects;
        this.MediaMetadataCompat = acquireVar;
        this.write = applylayoutfeatures;
        this.serializer = applylayoutfeatures2;
        this.PlaybackStateCompat = executequery;
        this.MediaSessionCompatQueueItem = executequery2;
        this.RatingCompat = getcontentdatatype;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.MediaDescriptionCompat = acquireVar2;
        this.MediaBrowserCompatMediaItem = executequery3;
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
        this.PlaybackStateCompatCustomAction = q0Var;
    }

    public d4ExternalSyntheticLambda3(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getContentDataType getcontentdatatype, getDataStoreFileName getdatastorefilename, SimpleExecutableQuery simpleExecutableQuery, SimpleExecutableQuery simpleExecutableQuery2, performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0, getDoubleOrNull getdoubleornull, onCapabilitiesChanged oncapabilitieschanged, mergeJsonObjects mergejsonobjects3, newTransaction newtransaction, mergeJsonObjects mergejsonobjects4) {
        this.MediaSessionCompatToken = mergejsonobjects;
        this.RatingCompat = mergejsonobjects2;
        this.IconCompatParcelizer = getcontentdatatype;
        this.MediaBrowserCompatMediaItem = getdatastorefilename;
        this.RemoteActionCompatParcelizer = simpleExecutableQuery;
        this.PlaybackStateCompatCustomAction = simpleExecutableQuery2;
        this.MediaMetadataCompat = performpushdeliveryflushlambda0;
        this.write = getdoubleornull;
        this.serializer = oncapabilitieschanged;
        this.PlaybackStateCompat = mergejsonobjects3;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.MediaDescriptionCompat = mergejsonobjects4;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 103;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        mergeJsonObjects mergejsonobjects = this.PlaybackStateCompatCustomAction;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects3 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects5 = this.RatingCompat;
        mergeJsonObjects mergejsonobjects6 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects7 = this.PlaybackStateCompat;
        mergeJsonObjects mergejsonobjects8 = this.serializer;
        mergeJsonObjects mergejsonobjects9 = this.write;
        mergeJsonObjects mergejsonobjects10 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects11 = this.MediaSessionCompatToken;
        if (i4 == 0) {
            return new SignInViewModel((getPivotOffsetF1C5BW0) mergejsonobjects11.write(), (setTransactionSuccessful) mergejsonobjects5.write(), (accessgetOldDependencyp) mergejsonobjects4.write(), (androidx.lifecycle.BlockRunner) ((getDataStoreFileName) getcolorintegerornulllambda0).write(), (getBytes) mergejsonobjects2.write(), (LoginStorageManager) mergejsonobjects.write(), new getQueryContext(), (SystemLifecycleSystemLifecycleCallback) mergejsonobjects10.write(), (setAccessibilityExtraKeyui) mergejsonobjects9.write(), (getBindingAdapter) mergejsonobjects8.write(), (ForgotPasswordPersistedTimerManager) mergejsonobjects7.write(), new BrazeExternalSyntheticLambda5(1), (QueryResultCompanion) mergejsonobjects6.write(), (transferSessionPackageI) mergejsonobjects3.write());
        }
        getReferencedIds getreferencedids = new getReferencedIds((getPivotOffsetF1C5BW0) mergejsonobjects11.write(), (ConstraintHelper) ((acquire) mergejsonobjects10).write(), (CheckDeviceTokenUseCase) ((applyLayoutFeatures) mergejsonobjects9).write(), (FixTokenUseCase) ((applyLayoutFeatures) mergejsonobjects8).write(), (SendTestPushUseCase) ((executeQuery) mergejsonobjects7).write(), (DiagnosticsUiStateMapper) ((executeQuery) mergejsonobjects6).write(), (makeNativePaint) mergejsonobjects5.write(), (setTransactionSuccessful) mergejsonobjects4.write(), (com.huawei.agconnect.config.impl.m) ((acquire) mergejsonobjects3).write(), (OtpLogger) ((executeQuery) getcolorintegerornulllambda0).write(), (getAllSemanticsNodesToMap) mergejsonobjects2.write(), (EnumColumnAdapter) mergejsonobjects.write(), new SharedResourcePool(24));
        int i5 = ParcelableVolumeInfo + 121;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getreferencedids;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
