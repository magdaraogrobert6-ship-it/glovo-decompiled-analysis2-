package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.logout.ClearServicesUseCase;
import com.roadrunner.auth.domain.logout.ClearStorageUseCase;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.database.domain.ClearDatabaseUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.order.history.domain.ClearHistoryDatabaseUseCaseImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class insertTextAtCursordefault implements getColorIntegerOrNulllambda0 {
    private static int ComponentActivity = 1;
    private static int MediaSessionCompatResultReceiverWrapper;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatToken;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ PlaybackStateCompatCustomAction;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public insertTextAtCursordefault(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, newTransaction newtransaction, newTransaction newtransaction2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, accessgetRelayoutTimep accessgetrelayouttimep, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5, setVerticalBias setverticalbias, newTransaction newtransaction3, publishErrorlambda1 publisherrorlambda1, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.serializer = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        newtransaction.getClass();
        newtransaction2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq5.getClass();
        setverticalbias.getClass();
        newtransaction3.getClass();
        publisherrorlambda1.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.ParcelableVolumeInfo = newtransaction;
        this.RatingCompat = newtransaction2;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.PlaybackStateCompat = accessgetrelayouttimep;
        this.RemoteActionCompatParcelizer = absSavedState;
        this.MediaSessionCompatToken = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq5;
        this.PlaybackStateCompatCustomAction = setverticalbias;
        this.write = newtransaction3;
        this.read = publisherrorlambda1;
        this.MediaBrowserCompatMediaItem = convertstringjsonarraytolistlambda0;
    }

    public /* synthetic */ insertTextAtCursordefault(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects5, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, mergeJsonObjects mergejsonobjects8, mergeJsonObjects mergejsonobjects9, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.MediaSessionCompatQueueItem = mergejsonobjects2;
        this.ParcelableVolumeInfo = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
        this.MediaMetadataCompat = getcolorintegerornulllambda0;
        this.PlaybackStateCompat = mergejsonobjects5;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda1;
        this.MediaSessionCompatToken = mergejsonobjects6;
        this.MediaDescriptionCompat = mergejsonobjects7;
        this.PlaybackStateCompatCustomAction = getcolorintegerornulllambda2;
        this.write = mergejsonobjects8;
        this.read = mergejsonobjects9;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda3;
    }

    public insertTextAtCursordefault(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, accessgetTextBottomcp accessgettextbottomcp, mergeJsonObjects mergejsonobjects, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, LayoutCompat layoutCompat, mergeJsonObjects mergejsonobjects2, publishErrorlambda1 publisherrorlambda1, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, requestBannersRefreshlambda1 requestbannersrefreshlambda1, getIterationDuration getiterationduration, getIterationDuration getiterationduration2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1) {
        this.serializer = 0;
        this.IconCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.MediaSessionCompatQueueItem = accessgettextbottomcp;
        this.ParcelableVolumeInfo = mergejsonobjects;
        this.RatingCompat = subscribetofeatureflagsupdateslambda0;
        this.MediaMetadataCompat = layoutCompat;
        this.PlaybackStateCompat = mergejsonobjects2;
        this.PlaybackStateCompatCustomAction = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.MediaSessionCompatToken = mergejsonobjects4;
        this.MediaDescriptionCompat = requestbannersrefreshlambda1;
        this.write = getiterationduration;
        this.read = getiterationduration2;
        this.MediaBrowserCompatMediaItem = requestsinglelocationupdatelambda1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 13;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.PlaybackStateCompatCustomAction;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.MediaSessionCompatToken;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.PlaybackStateCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq9 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq10 = this.ParcelableVolumeInfo;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq11 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq12 = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new ClearStorageUseCase((ClearHistoryDatabaseUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq12).write(), (ClearDatabaseUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq11).write(), (createOpenHelper) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq10).write(), (ClearRiderStateDatabaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (SystemFontFamily) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (setNextTransition) mergejsonobjects.write(), (getAdidWithTimeout) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (OpportunitiesRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (vg) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (injectStoreInfoToParameters) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (SendTestPushUseCase) ((getIterationDuration) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (SendTestPushUseCase) ((getIterationDuration) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (GetAppStateImpl) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
        }
        if (i4 == 1) {
            ClearServicesUseCase clearServicesUseCase = new ClearServicesUseCase((getTouchaOaMEAU) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq12).write(), (accessgetOldDependenciesSetp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq11).write(), (s2) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq10).write(), (QualtricsManagerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (getMinWidth) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (CustomerChatProviderImpl) mergejsonobjects.write(), (addStyle) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (getInstallBeginTimeInSeconds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (bootstrapLifecycleI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (parseLayoutDescription) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (TextForegroundStyle) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SignInDataStore) ((ShouldShowHeatmap_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            int i5 = ComponentActivity + 23;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return clearServicesUseCase;
            }
            throw null;
        }
        if (i4 == 2) {
            return new detach((InInspectionModeOnlylambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq12).write(), (setState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq11).write(), (r8lambdaVHSID8XYAK9qohA91T4_vt60qNY) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq10).write(), (setClockTime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (getTrackedUnsupportedAnimations) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (parseParametersToValueparametersAreValid) mergejsonobjects.write(), (lerpIDex15A) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (getMaxnOccac) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (getRightD9Ej5fM) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (IntRectE1MhUcY) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (TextUnit) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (checkArithmeticR2X_6o) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (div0680j_4) ((getDoubleOrNull) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write);
        }
        Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq12.write();
        objWrite.getClass();
        GetWorkNowOpportunity getWorkNowOpportunity = (GetWorkNowOpportunity) objWrite;
        Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq11.write();
        objWrite2.getClass();
        setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) objWrite2;
        Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq10.write();
        objWrite3.getClass();
        v9 v9Var = (v9) objWrite3;
        Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
        objWrite4.getClass();
        va vaVar = (va) objWrite4;
        Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
        objWrite5.getClass();
        vg vgVar = (vg) objWrite5;
        getActiveNotifications getactivenotifications = (getActiveNotifications) getNotificationChannelCompat.IconCompatParcelizer.write();
        androidx.work.impl.WorkerWrapper.Builder builder = (androidx.work.impl.WorkerWrapper.Builder) ((accessgetRelayoutTimep) mergejsonobjects).write();
        Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
        objWrite6.getClass();
        CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl = (CanRequestLocationUpdatesImpl) objWrite6;
        Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
        objWrite7.getClass();
        getCurrentInterruptionFilter getcurrentinterruptionfilter = (getCurrentInterruptionFilter) objWrite7;
        Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
        objWrite8.getClass();
        E e = (E) objWrite8;
        Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
        objWrite9.getClass();
        getActionList getactionlist = (getActionList) objWrite9;
        Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite10.getClass();
        v4 v4Var = (v4) objWrite10;
        Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite11.getClass();
        GetRiderStatusImpl getRiderStatusImpl = (GetRiderStatusImpl) objWrite11;
        Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite12.getClass();
        return new getRootStableInsets(getWorkNowOpportunity, setlasthorizontalstyle, v9Var, vaVar, vgVar, getactivenotifications, builder, canRequestLocationUpdatesImpl, getcurrentinterruptionfilter, e, getactionlist, v4Var, getRiderStatusImpl, (subscribeToBannersUpdateslambda2) objWrite12);
    }
}
