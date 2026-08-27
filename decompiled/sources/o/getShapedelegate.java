package o;

import android.app.Application;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.domain.AuthenticateUseCase;
import com.roadrunner.auth.domain.AuthenticateWith2FaUseCase;
import com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase;
import com.roadrunner.auth.domain.SignInUseCaseImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.country.config.implementation.data.CountryConfigFallbackDataSource;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.map.integration.search.InitialiseMapboxSearch;
import com.roadrunner.map.integration.search.SelectorReverseGeocoder;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantTokenExpiryUseCaseImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.sentiance.core.model.events.C$b;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getShapedelegate implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 3;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public getShapedelegate(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = publisherrorlambda1;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public getShapedelegate(hasNestedScrollingParent hasnestedscrollingparent, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, q0 q0Var, postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        hasnestedscrollingparent.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        q0Var.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = hasnestedscrollingparent;
        this.IconCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.write = q0Var;
        this.read = postanimationrunner;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public getShapedelegate(transformCanvas transformcanvas, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        transformcanvas.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = transformcanvas;
        this.IconCompatParcelizer = dataModule_ProvideSchedulerFactory;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RatingCompat = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public getShapedelegate(backgroundTimerFiredI backgroundtimerfiredi, publishErrorlambda1 publisherrorlambda1, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, q0 q0Var) {
        backgroundtimerfiredi.getClass();
        publisherrorlambda1.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        shouldShowHeatmap_Factory.getClass();
        this.serializer = backgroundtimerfiredi;
        this.IconCompatParcelizer = publisherrorlambda1;
        this.write = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RatingCompat = shouldShowHeatmap_Factory;
        this.MediaMetadataCompat = q0Var;
    }

    public getShapedelegate(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        fontVariationSettingInt.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = fontVariationSettingInt;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.RatingCompat = generateandroidfontktforapicompatibility;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public getShapedelegate(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, q0 q0Var, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, backgroundTimerFiredI backgroundtimerfiredi, setPresentationView setpresentationview) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        q0Var.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = q0Var;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.RatingCompat = backgroundtimerfiredi;
        this.MediaMetadataCompat = setpresentationview;
    }

    public getShapedelegate(lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, publishErrorlambda1 publisherrorlambda1, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase46, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase47, setStateDescription setstatedescription) {
        lambdaverifyplaystorepurchase45.getClass();
        publisherrorlambda1.getClass();
        lambdaverifyplaystorepurchase46.getClass();
        transactionwithresultsuspendimpl.getClass();
        this.serializer = lambdaverifyplaystorepurchase45;
        this.IconCompatParcelizer = publisherrorlambda1;
        this.write = lambdaverifyplaystorepurchase46;
        this.read = transactionwithresultsuspendimpl;
        this.RatingCompat = lambdaverifyplaystorepurchase47;
        this.MediaMetadataCompat = setstatedescription;
    }

    public getShapedelegate(isEqualTo isequalto, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, publishErrorlambda1 publisherrorlambda1, SimpleExecutableQuery simpleExecutableQuery, setPresentationView setpresentationview, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        isequalto.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        publisherrorlambda1.getClass();
        setpresentationview.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.serializer = isequalto;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = publisherrorlambda1;
        this.read = simpleExecutableQuery;
        this.RatingCompat = setpresentationview;
        this.MediaMetadataCompat = dataModule_ProvideSchedulerFactory;
    }

    public getShapedelegate(isMenuVisible ismenuvisible, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, isMenuVisible ismenuvisible2, accessgetRelayoutTimep accessgetrelayouttimep, newTransaction newtransaction) {
        this.serializer = ismenuvisible;
        this.IconCompatParcelizer = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.read = ismenuvisible2;
        this.RatingCompat = accessgetrelayouttimep;
        this.MediaMetadataCompat = newtransaction;
    }

    public getShapedelegate(AndroidUiFrameClock androidUiFrameClock, mergeJsonObjects mergejsonobjects, hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects2, AbsSavedState absSavedState, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects3) {
        this.serializer = mergejsonobjects;
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.write = mergejsonobjects2;
        this.RatingCompat = absSavedState;
        this.read = setpresentationview;
        this.MediaMetadataCompat = mergejsonobjects3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.serializer;
        switch (i4) {
            case 0:
                return new SignInUseCaseImpl((AuthenticateUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (SemanticsOwner) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (AuthenticateWith2FaUseCase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ProcessSuccessfulSignInUseCase) ((accessgetRelayoutTimep) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (com.huawei.wisesecurity.ucs_credential.g0) isEditabledelegate.serializer.write(), (C$b) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 1:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite.getClass();
                CountryConfigListLocalDataSource countryConfigListLocalDataSource = (CountryConfigListLocalDataSource) objWrite;
                accessisMainThread accessismainthread = new accessisMainThread();
                unpackMetaGesturable unpackmetagesturable = (unpackMetaGesturable) ((com.data.injection.DataModule_ProvideSchedulerFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite2.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite2;
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite3.getClass();
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite4.getClass();
                CountryConfigFallbackDataSource countryConfigFallbackDataSource = (CountryConfigFallbackDataSource) objWrite4;
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new CountryConfigListRepository(countryConfigListLocalDataSource, accessismainthread, unpackmetagesturable, transfersessionpackagei, executeApiRequest, countryConfigFallbackDataSource, (getContentViewGroupParentLayout) objWrite5);
            case 2:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite6.getClass();
                decode decodeVar = (decode) objWrite6;
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite7.getClass();
                FontVariationSettingFloat fontVariationSettingFloat = (FontVariationSettingFloat) objWrite7;
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite8.getClass();
                FontEj4NQ78 fontEj4NQ78 = (FontEj4NQ78) objWrite8;
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite9.getClass();
                StaticImageDecoder staticImageDecoder = (StaticImageDecoder) objWrite9;
                FontEj4NQ78default fontEj4NQ78default = (FontEj4NQ78default) ((generateAndroidFontKtForApiCompatibility) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new DeliveryAcceptanceLogger(decodeVar, fontVariationSettingFloat, fontEj4NQ78, staticImageDecoder, fontEj4NQ78default, (getContentViewGroupParentLayout) objWrite10);
            case 3:
                setVerticalStyle setverticalstyle = (setVerticalStyle) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write();
                Application application = (Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write();
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
                CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl = (CanRequestLocationUpdatesImpl) ((AbsSavedState) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                setverticalstyle.getClass();
                application.getClass();
                getcontentviewgroupparentlayout.getClass();
                isopeninternalroom_runtime.getClass();
                transfersessionpackagei2.getClass();
                if (setverticalstyle.write() != setPaddingTop.GOOGLE) {
                    if (((FirebaseRemoteConfigImpl) transfersessionpackagei2).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Using Deferrable HMS location API", new Object[0]);
                        return new doWork(application, getcontentviewgroupparentlayout, canRequestLocationUpdatesImpl, isopeninternalroom_runtime);
                    }
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Using HMS location API", new Object[0]);
                    return new ExtensionWindowBackendApi1(application);
                }
                int i5 = MediaSessionCompatQueueItem + 1;
                MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    ((FirebaseRemoteConfigImpl) transfersessionpackagei2).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED);
                    throw null;
                }
                if (((FirebaseRemoteConfigImpl) transfersessionpackagei2).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Using Deferrable GMS location API", new Object[0]);
                    return new test(application, getcontentviewgroupparentlayout, canRequestLocationUpdatesImpl, isopeninternalroom_runtime);
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Using GMS location API", new Object[0]);
                return new DistinctElementSidecarCallback(application);
            case 4:
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq6);
                lazySerializer.getClass();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite11.getClass();
                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) objWrite11;
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite12.getClass();
                GetRiderStateImpl getRiderStateImpl = (GetRiderStateImpl) objWrite12;
                SharedResourcePool sharedResourcePool = (SharedResourcePool) ((SimpleExecutableQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime2 = (isOpenInternalroom_runtime) objWrite13;
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new AppEventInfoChangeHandler(lazySerializer, getcontentviewgroupparentlayout2, getRiderStateImpl, sharedResourcePool, isopeninternalroom_runtime2, (getAllSemanticsNodesToMap) objWrite14);
            case 5:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite15.getClass();
                Application application2 = (Application) objWrite15;
                j4 j4Var = new j4();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite16.getClass();
                resolveBulletTextUnitToPxo2QH7mI resolvebullettextunittopxo2qh7mi = (resolveBulletTextUnitToPxo2QH7mI) objWrite16;
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite17.getClass();
                md mdVar = (md) objWrite17;
                shouldSkipDump shouldskipdump = (shouldSkipDump) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite18.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite18;
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new m7(application2, j4Var, resolvebullettextunittopxo2qh7mi, mdVar, shouldskipdump, settransactionsuccessful, (mb) objWrite19);
            case 6:
                BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = new BrazeExternalSyntheticLambda5(2);
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq6);
                lazySerializer2.getClass();
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq5);
                lazySerializer3.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite20.getClass();
                InitialiseMapboxSearch initialiseMapboxSearch = (InitialiseMapboxSearch) objWrite20;
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite21.getClass();
                n9 n9Var = (n9) objWrite21;
                unpackInt2 unpackint2 = (unpackInt2) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new SelectorReverseGeocoder(brazeExternalSyntheticLambda5, lazySerializer2, lazySerializer3, initialiseMapboxSearch, n9Var, unpackint2, (isOpenInternalroom_runtime) objWrite22);
            case 7:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite23.getClass();
                access800 access800Var = (access800) objWrite23;
                Lazy lazySerializer4 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq5);
                lazySerializer4.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite24.getClass();
                IsUserAuthenticatedWrapper isUserAuthenticatedWrapper = (IsUserAuthenticatedWrapper) objWrite24;
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite25.getClass();
                androidx.work.impl.WorkManagerImpl workManagerImpl = (androidx.work.impl.WorkManagerImpl) objWrite25;
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                return new RegisterPushNotificationUseCaseImpl(access800Var, lazySerializer4, isUserAuthenticatedWrapper, workManagerImpl, (access1200) objWrite26, (NetworkBody) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite27.getClass();
                GetApplicantAccessTokenUseCaseImpl getApplicantAccessTokenUseCaseImpl = (GetApplicantAccessTokenUseCaseImpl) objWrite27;
                Lazy lazySerializer5 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq5);
                lazySerializer5.getClass();
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite28.getClass();
                GetApplicantTokenExpiryUseCaseImpl getApplicantTokenExpiryUseCaseImpl = (GetApplicantTokenExpiryUseCaseImpl) objWrite28;
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite29.getClass();
                ActivityHandler6 activityHandler6 = new ActivityHandler6(getApplicantAccessTokenUseCaseImpl, lazySerializer5, getApplicantTokenExpiryUseCaseImpl, (ApplicantRefreshAccessTokenUseCaseImpl) objWrite29, (a9) ((lambdaverifyPlayStorePurchase45) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AnalyticsServiceImpl) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i6 = MediaBrowserCompatMediaItem + 43;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return activityHandler6;
            default:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
                objWrite30.getClass();
                androidx.work.impl.WorkManagerImpl workManagerImpl2 = (androidx.work.impl.WorkManagerImpl) objWrite30;
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
                objWrite31.getClass();
                GetRiderStatusImpl getRiderStatusImpl = (GetRiderStatusImpl) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
                objWrite32.getClass();
                transferSessionPackageI transfersessionpackagei3 = (transferSessionPackageI) objWrite32;
                getFireTrackingEnabled getfiretrackingenabled = (getFireTrackingEnabled) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite33.getClass();
                EventMetadata eventMetadata = (EventMetadata) objWrite33;
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite34.getClass();
                return new getConnectivityType(workManagerImpl2, getRiderStatusImpl, transfersessionpackagei3, getfiretrackingenabled, eventMetadata, (getContentViewGroupParentLayout) objWrite34);
        }
    }
}
