package o;

import android.app.Application;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.SaveSignInDataUseCaseImpl;
import com.roadrunner.auth.domain.mapper.MapAuthEntityToRefreshTokenRequest;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase;
import com.roadrunner.customerchat.legacy.core.usecases.DeliveryChatVisibilityUseCase;
import com.roadrunner.delivery.midshiftverification.LastDropoffConfirmedEventImpl;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.face.verification.domain.CheckSelfieStatusUseCaseImpl;
import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.map.container.enabled.presentation.MapViewModel;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.SaveWorkOpportunities;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import com.roadrunner.rider.state.searchshifts.domain.GetSearchShiftsWithBonusUiState;
import com.roadrunner.user.properties.domain.SaveUserPropertiesUseCaseImpl;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.i$c;
import dagger.Lazy;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class indexForKey implements getColorIntegerOrNulllambda0 {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public indexForKey(AbsSavedState absSavedState, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, q0 q0Var, requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, requestBannersRefreshlambda1 requestbannersrefreshlambda2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, requestBannersRefreshlambda1 requestbannersrefreshlambda3, setVerticalBias setverticalbias) {
        this.IconCompatParcelizer = 9;
        absSavedState.getClass();
        r8lambdazvx83uidsl68vmn7rpqxcy0me.getClass();
        q0Var.getClass();
        requestbannersrefreshlambda1.getClass();
        requestgeofencesinitializationlambda1.getClass();
        requestbannersrefreshlambda2.getClass();
        requestsinglelocationupdatelambda1.getClass();
        setverticalbias.getClass();
        this.write = absSavedState;
        this.read = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.RatingCompat = q0Var;
        this.RemoteActionCompatParcelizer = requestbannersrefreshlambda1;
        this.MediaMetadataCompat = requestgeofencesinitializationlambda1;
        this.MediaDescriptionCompat = requestbannersrefreshlambda2;
        this.MediaBrowserCompatMediaItem = requestsinglelocationupdatelambda1;
        this.MediaSessionCompatQueueItem = requestbannersrefreshlambda3;
        this.serializer = setverticalbias;
    }

    public /* synthetic */ indexForKey(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, int i) {
        this.IconCompatParcelizer = i;
        this.write = mergejsonobjects;
        this.read = getcolorintegerornulllambda0;
        this.RatingCompat = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.MediaMetadataCompat = mergejsonobjects4;
        this.MediaDescriptionCompat = mergejsonobjects5;
        this.MediaBrowserCompatMediaItem = mergejsonobjects6;
        this.MediaSessionCompatQueueItem = mergejsonobjects7;
        this.serializer = getcolorintegerornulllambda1;
    }

    public indexForKey(transformCanvas transformcanvas, getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, transformCanvas transformcanvas2, SingleProcessDataStore singleProcessDataStore, FontVariationSettingInt fontVariationSettingInt, FontVariationSettingInt fontVariationSettingInt2, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 3;
        transformcanvas.getClass();
        getdoubleornull.getClass();
        getdoubleornull2.getClass();
        transformcanvas2.getClass();
        singleProcessDataStore.getClass();
        fontVariationSettingInt.getClass();
        fontVariationSettingInt2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = transformcanvas;
        this.read = getdoubleornull;
        this.RatingCompat = getdoubleornull2;
        this.RemoteActionCompatParcelizer = transformcanvas2;
        this.MediaMetadataCompat = singleProcessDataStore;
        this.MediaDescriptionCompat = fontVariationSettingInt;
        this.MediaBrowserCompatMediaItem = fontVariationSettingInt2;
        this.MediaSessionCompatQueueItem = semanticsPropertiesLinkTestMarker1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public /* synthetic */ indexForKey(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda5, getColorIntegerOrNulllambda0 getcolorintegerornulllambda6, int i) {
        this.IconCompatParcelizer = i;
        this.write = getcolorintegerornulllambda0;
        this.read = mergejsonobjects;
        this.RatingCompat = getcolorintegerornulllambda1;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda2;
        this.MediaMetadataCompat = getcolorintegerornulllambda3;
        this.MediaDescriptionCompat = mergejsonobjects2;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda4;
        this.serializer = getcolorintegerornulllambda5;
        this.MediaSessionCompatQueueItem = getcolorintegerornulllambda6;
    }

    public indexForKey(requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestBannersRefreshlambda1 requestbannersrefreshlambda2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        this.IconCompatParcelizer = 11;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        requestbannersrefreshlambda1.getClass();
        requestbannersrefreshlambda2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.write = requestgeofencesinitializationlambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RatingCompat = hasnestedscrollingparent;
        this.RemoteActionCompatParcelizer = setpresentationview;
        this.MediaMetadataCompat = requestbannersrefreshlambda1;
        this.MediaDescriptionCompat = requestbannersrefreshlambda2;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public indexForKey(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, backgroundTimerFiredI backgroundtimerfiredi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, q0 q0Var, getEditableText geteditabletext, transactionWithResultsuspendImpl transactionwithresultsuspendimpl2, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 7;
        transactionwithresultsuspendimpl.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        q0Var.getClass();
        geteditabletext.getClass();
        transactionwithresultsuspendimpl2.getClass();
        setpresentationview.getClass();
        this.write = transactionwithresultsuspendimpl;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaDescriptionCompat = q0Var;
        this.MediaBrowserCompatMediaItem = geteditabletext;
        this.MediaSessionCompatQueueItem = transactionwithresultsuspendimpl2;
        this.serializer = setpresentationview;
    }

    public indexForKey(newTransaction newtransaction, newTransaction newtransaction2, BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        this.IconCompatParcelizer = 10;
        newtransaction.getClass();
        newtransaction2.getClass();
        brazeExternalSyntheticLambda102.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.write = newtransaction;
        this.read = newtransaction2;
        this.RatingCompat = brazeExternalSyntheticLambda102;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaDescriptionCompat = subscribetofeatureflagsupdateslambda0;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaSessionCompatQueueItem = convertstringjsonarraytolistlambda0;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public indexForKey(mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects2, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, mergeJsonObjects mergejsonobjects3, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, q0 q0Var, mergeJsonObjects mergejsonobjects4, getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate) {
        this.IconCompatParcelizer = 4;
        this.write = mergejsonobjects;
        this.read = setpresentationview;
        this.RatingCompat = mergejsonobjects2;
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.MediaMetadataCompat = dataModule_ProvideSchedulerFactory;
        this.MediaDescriptionCompat = q0Var;
        this.MediaBrowserCompatMediaItem = mergejsonobjects4;
        this.MediaSessionCompatQueueItem = getverticalscrollaxisrangedelegate;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq9 = this.write;
        switch (i2) {
            case 0:
                return new getTextSelectionRangedelegate((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4, (mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3, (transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq, (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 1:
                RefreshAccessTokenUseCaseImpl refreshAccessTokenUseCaseImpl = new RefreshAccessTokenUseCaseImpl((AuthRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (MapAuthEntityToRefreshTokenRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (getMaxTextLengthdelegate) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (SaveAuthDataUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (getDisabled) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (getInputText) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (IncogniaManagerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (Set) ((isEqualTo) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i3 = ParcelableVolumeInfo + 119;
                PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return refreshAccessTokenUseCaseImpl;
            case 2:
                return new LegacyCustomerChatCommunicatorImpl((getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (ChatRegisterUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (CourierApplication) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (DeliveryChatVisibilityUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (setGlobalChangeEntries) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (getViewToWindowMatrix3i98HWw) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (ProtobufEncoder) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (InitializeAppStartupItemsImpl) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (zzz) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
                objWrite.getClass();
                LastDropoffConfirmedEventImpl lastDropoffConfirmedEventImpl = (LastDropoffConfirmedEventImpl) objWrite;
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite2.getClass();
                setApiKeyPresentandroid_sdk_base_release setapikeypresentandroid_sdk_base_release = (setApiKeyPresentandroid_sdk_base_release) objWrite2;
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite3.getClass();
                requestSingleLocationUpdateandroid_sdk_base_release requestsinglelocationupdateandroid_sdk_base_release = (requestSingleLocationUpdateandroid_sdk_base_release) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite4.getClass();
                EditProcessor editProcessor = (EditProcessor) objWrite4;
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite5.getClass();
                CheckSelfieStatusUseCaseImpl checkSelfieStatusUseCaseImpl = (CheckSelfieStatusUseCaseImpl) objWrite5;
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite6.getClass();
                DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) objWrite6;
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite7.getClass();
                generateBatchErrorMessage generatebatcherrormessage = (generateBatchErrorMessage) objWrite7;
                ProtobufEncoder protobufEncoder = (ProtobufEncoder) ((SemanticsPropertiesLinkTestMarker1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new MidShiftIdVerificationCoordinator(lastDropoffConfirmedEventImpl, setapikeypresentandroid_sdk_base_release, requestsinglelocationupdateandroid_sdk_base_release, editProcessor, checkSelfieStatusUseCaseImpl, deleteSurroundingTextInCodePointsCommand, generatebatcherrormessage, protobufEncoder, (getContentViewGroupParentLayout) objWrite8);
            case 4:
                return new IncogniaManagerImpl((getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (IncogniaInitializerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (GetUserDataUseCaseImpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (decode) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (EnumColumnAdapter) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (getInputText) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 5:
                MapViewModel mapViewModel = new MapViewModel((RecenterMapTriggerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (dg) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (WindowAreaComponentApi3Requirements) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (consumeFlingInStretch) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (isStateSaved) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (SafeAreaPublisherImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (e4) ((getDoubleOrNull) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write, new SharedResourcePool(24));
                int i5 = ParcelableVolumeInfo + 77;
                PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return mapViewModel;
            case 6:
                access500 access500Var = new access500((WindowInsetsCompatImpl20) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (changeUserlambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (readAndInitOrPropagateFailure) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (accessgetLineHeightSpans) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (AndroidAccessibilitySpannableString_androidKt) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (x9) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (wgExternalSyntheticLambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (xe) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getStartOrEndOffsetForRectWithinLine) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i7 = ParcelableVolumeInfo + 69;
                PlaybackStateCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 40 / 0;
                }
                return access500Var;
            case 7:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
                objWrite9.getClass();
                handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = (handleThirdPartySharingCallbackI) objWrite9;
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite10.getClass();
                isEnabledI isenabledi = (isEnabledI) objWrite10;
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite11.getClass();
                getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) objWrite11;
                gotOptOutResponseI gotoptoutresponsei = (gotOptOutResponseI) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite12.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite12;
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite13.getClass();
                EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) objWrite13;
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite14.getClass();
                getToggleableState gettoggleablestate = (getToggleableState) objWrite14;
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20 = (lambdaaddGlobalCallbackParameter20) objWrite15;
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new lambdaisEnabled9(handlethirdpartysharingcallbacki, isenabledi, getpivotoffsetf1c5bw0, gotoptoutresponsei, transfersessionpackagei, enumColumnAdapter, gettoggleablestate, lambdaaddglobalcallbackparameter20, (Clock) objWrite16);
            case 8:
                return new i$c((FetchRemoteConfigUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (AppEventInfoChangeHandler) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (isOffline) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (isOnline) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (RegisterPushNotificationUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (H$b) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (SaveSignInDataUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 9:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite18.getClass();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite23.getClass();
                injectStoreInfoToParameters injectstoreinfotoparameters = (injectStoreInfoToParameters) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                CallOptions$Builder callOptions$Builder = new CallOptions$Builder();
                callOptions$Builder.serializer = (asBinder) objWrite17;
                callOptions$Builder.RemoteActionCompatParcelizer = (SaveWorkOpportunities) objWrite19;
                callOptions$Builder.read = (onRemoteTrigger) objWrite20;
                callOptions$Builder.write = (onThirdPartySharingSettingsRead) objWrite21;
                callOptions$Builder.MediaMetadataCompat = (SaveUserPropertiesUseCaseImpl) objWrite22;
                callOptions$Builder.RatingCompat = (buildSubscriptionPackage) objWrite23;
                callOptions$Builder.IconCompatParcelizer = injectstoreinfotoparameters;
                callOptions$Builder.MediaSessionCompatQueueItem = (getActionList) objWrite24;
                return callOptions$Builder;
            case 10:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
                objWrite25.getClass();
                v9 v9Var = (v9) objWrite25;
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite26.getClass();
                va vaVar = (va) objWrite26;
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite27.getClass();
                readFileContent readfilecontent = (readFileContent) objWrite27;
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite28.getClass();
                OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) objWrite28;
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite29.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite29;
                GetStatusUseCaseImpl getStatusUseCaseImpl = (GetStatusUseCaseImpl) ((subscribeToFeatureFlagsUpdateslambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite30.getClass();
                vg vgVar = (vg) objWrite30;
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite31.getClass();
                subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2 = (subscribeToBannersUpdateslambda2) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                GetSearchShiftsWithBonusUiState getSearchShiftsWithBonusUiState = new GetSearchShiftsWithBonusUiState(v9Var, vaVar, readfilecontent, opportunitiesRepository, settransactionsuccessful, getStatusUseCaseImpl, vgVar, subscribetobannersupdateslambda2, (QuickSessionsRepository) objWrite32);
                int i9 = ParcelableVolumeInfo + 51;
                PlaybackStateCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return getSearchShiftsWithBonusUiState;
            default:
                CallTracer callTracer = (CallTracer) ((requestGeofencesInitializationlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write();
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
                objWrite33.getClass();
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite33;
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
                objWrite34.getClass();
                Application application = (Application) objWrite34;
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite35.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite35;
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite36.getClass();
                subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31 = (subscribeToChangeUserEventslambda31) objWrite36;
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite37.getClass();
                subscribeToContentCardsUpdateslambda31 subscribetocontentcardsupdateslambda31 = (subscribeToContentCardsUpdateslambda31) objWrite37;
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite38.getClass();
                subscribeToNetworkFailureslambda1 subscribetonetworkfailureslambda1 = (subscribeToNetworkFailureslambda1) objWrite38;
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                return new DefaultForegroundSoundManager(callTracer, getcontentviewgroupparentlayout, application, isopeninternalroom_runtime, subscribetochangeusereventslambda31, subscribetocontentcardsupdateslambda31, subscribetonetworkfailureslambda1, lazySerializer, (transferSessionPackageI) objWrite39);
        }
    }
}
