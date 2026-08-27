package o;

import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.domain.IsRiderInsideActiveAreaBoundaryImpl;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.domain.PhoneValidationUseCase;
import com.roadrunner.rider.recruitment.accountcreation.presentation.SnackBarErrorMapper;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.ondemand.bonus.GetOnDemandWithBonusUiState;

/* JADX INFO: loaded from: classes3.dex */
public final class sendAttributionRequestI implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final getColorIntegerOrNulllambda0 MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatToken;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ ParcelableVolumeInfo;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ PlaybackStateCompat;
    public final mergeJsonObjects RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public sendAttributionRequestI(subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, newTransaction newtransaction, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, AbsSavedState absSavedState, SharedPreferencesMigration sharedPreferencesMigration, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, newTransaction newtransaction2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setPresentationView setpresentationview, newTransaction newtransaction3) {
        subscribetofeatureflagsupdateslambda0.getClass();
        newtransaction.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        absSavedState.getClass();
        transactionwithresultsuspendimpl.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        newtransaction3.getClass();
        this.serializer = subscribetofeatureflagsupdateslambda0;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.ParcelableVolumeInfo = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.PlaybackStateCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = convertstringjsonarraytolistlambda0;
        this.write = absSavedState;
        this.RatingCompat = sharedPreferencesMigration;
        this.MediaDescriptionCompat = transactionwithresultsuspendimpl;
        this.MediaMetadataCompat = newtransaction2;
        this.MediaSessionCompatToken = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaBrowserCompatMediaItem = setpresentationview;
        this.IconCompatParcelizer = newtransaction3;
    }

    public sendAttributionRequestI(onCapabilitiesChanged oncapabilitieschanged, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory2, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, newTransaction newtransaction, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, mergeJsonObjects mergejsonobjects3, setStateDescription setstatedescription, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory3, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me) {
        this.serializer = oncapabilitieschanged;
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.ParcelableVolumeInfo = mergejsonobjects2;
        this.PlaybackStateCompat = dataModule_ProvideSchedulerFactory;
        this.read = dataModule_ProvideSchedulerFactory2;
        this.write = requestgeofencesinitializationlambda1;
        this.MediaDescriptionCompat = newtransaction;
        this.MediaSessionCompatToken = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.MediaBrowserCompatMediaItem = mergejsonobjects3;
        this.IconCompatParcelizer = setstatedescription;
        this.RatingCompat = dataModule_ProvideSchedulerFactory3;
        this.MediaMetadataCompat = r8lambdazvx83uidsl68vmn7rpqxcy0me;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 1;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.MediaSessionCompatToken;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.PlaybackStateCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.ParcelableVolumeInfo;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq9 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq10 = this.serializer;
        if (i4 != 0) {
            removeGlobalPartnerParameter removeglobalpartnerparameter = new removeGlobalPartnerParameter((getBindingAdapter) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq10).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (unpackMetaUpdated) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (PhoneValidationUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), new getQueryContext(), (SnackBarErrorMapper) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (AccountCreationLogger) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (setLastHorizontalStyle) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (unpackMetaValue) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (unpackX) mergejsonobjects.write(), (markCardAsVisuallyRead) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) getcolorintegerornulllambda0).write());
            int i5 = PlaybackStateCompatCustomAction + 91;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return removeglobalpartnerparameter;
        }
        Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq10.write();
        objWrite.getClass();
        GetStatusUseCaseImpl getStatusUseCaseImpl = (GetStatusUseCaseImpl) objWrite;
        Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
        objWrite2.getClass();
        v9 v9Var = (v9) objWrite2;
        Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
        objWrite3.getClass();
        OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) objWrite3;
        Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
        objWrite4.getClass();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite4;
        Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
        objWrite5.getClass();
        subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2 = (subscribeToBannersUpdateslambda2) objWrite5;
        Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
        objWrite6.getClass();
        CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl = (CanRequestLocationUpdatesImpl) objWrite6;
        IsRiderInsideActiveAreaBoundaryImpl isRiderInsideActiveAreaBoundaryImpl = (IsRiderInsideActiveAreaBoundaryImpl) ((SharedPreferencesMigration) mergejsonobjects).write();
        Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
        objWrite7.getClass();
        checkSdkClickResponse checksdkclickresponse = (checkSdkClickResponse) objWrite7;
        vd vdVar = (vd) ((newTransaction) getcolorintegerornulllambda0).write();
        Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite8.getClass();
        removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener = (removeRearDisplayPresentationStatusListener) objWrite8;
        Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite9.getClass();
        IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl = (IsRiderInsideAreaUseCaseImpl) objWrite9;
        Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite10.getClass();
        return new GetOnDemandWithBonusUiState(getStatusUseCaseImpl, v9Var, opportunitiesRepository, settransactionsuccessful, subscribetobannersupdateslambda2, canRequestLocationUpdatesImpl, isRiderInsideActiveAreaBoundaryImpl, checksdkclickresponse, vdVar, removereardisplaypresentationstatuslistener, isRiderInsideAreaUseCaseImpl, (v4) objWrite10);
    }
}
