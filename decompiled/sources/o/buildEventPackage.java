package o;

import android.app.Application;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptRequestManagerImpl;
import com.roadrunner.delivery.accept.domain.AutoAcceptDeliveryImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.localPushNotifications.smartPolling.domain.AutoAcceptLocalPushHandlerImpl;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class buildEventPackage implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public buildEventPackage(hasNestedScrollingParent hasnestedscrollingparent, postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setPresentationView setpresentationview) {
        hasnestedscrollingparent.getClass();
        postanimationrunner.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.MediaBrowserCompatMediaItem = postanimationrunner;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaDescriptionCompat = setpresentationview;
    }

    public buildEventPackage(BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102, requestBannersRefreshlambda1 requestbannersrefreshlambda1, publishErrorlambda1 publisherrorlambda1, SingleProcessDataStore singleProcessDataStore, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        brazeExternalSyntheticLambda102.getClass();
        requestbannersrefreshlambda1.getClass();
        publisherrorlambda1.getClass();
        singleProcessDataStore.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = brazeExternalSyntheticLambda102;
        this.MediaBrowserCompatMediaItem = requestbannersrefreshlambda1;
        this.write = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = singleProcessDataStore;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public buildEventPackage(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setPresentationView setpresentationview, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        generateandroidfontktforapicompatibility.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.write = absSavedState;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.serializer = setpresentationview;
        this.MediaDescriptionCompat = generateandroidfontktforapicompatibility;
    }

    public buildEventPackage(postAnimationRunner postanimationrunner, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, lineEndToVisibleEnd lineendtovisibleend, transformCanvas transformcanvas, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        postanimationrunner.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        lineendtovisibleend.getClass();
        transformcanvas.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = postanimationrunner;
        this.MediaBrowserCompatMediaItem = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.write = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RemoteActionCompatParcelizer = lineendtovisibleend;
        this.serializer = transformcanvas;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public buildEventPackage(hasNestedScrollingParent hasnestedscrollingparent, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, getContentDataType getcontentdatatype, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda1, pasteText pastetext, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1) {
        hasnestedscrollingparent.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        getcontentdatatype.getClass();
        convertstringjsonarraytolistlambda1.getClass();
        pastetext.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.MediaBrowserCompatMediaItem = convertstringjsonarraytolistlambda0;
        this.write = getcontentdatatype;
        this.RemoteActionCompatParcelizer = convertstringjsonarraytolistlambda1;
        this.serializer = pastetext;
        this.MediaDescriptionCompat = semanticsPropertiesLinkTestMarker1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.IconCompatParcelizer;
        if (i2 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite.getClass();
            getAdRevenueParameters getadrevenueparameters = (getAdRevenueParameters) objWrite;
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite2.getClass();
            buildMeasurementConsentPackage buildmeasurementconsentpackage = (buildMeasurementConsentPackage) objWrite2;
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite3.getClass();
            GetRiderStatusImpl getRiderStatusImpl = (GetRiderStatusImpl) objWrite3;
            Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite4.getClass();
            CachedDeliveryRepository cachedDeliveryRepository = (CachedDeliveryRepository) objWrite4;
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite5.getClass();
            setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) objWrite5;
            Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite6.getClass();
            androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner(getadrevenueparameters, buildmeasurementconsentpackage, getRiderStatusImpl, cachedDeliveryRepository, setlasthorizontalstyle, (dispatchChildDetached) objWrite6);
            int i3 = MediaSessionCompatQueueItem + 29;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return blockRunner;
            }
            throw null;
        }
        if (i2 == 1) {
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite7.getClass();
            decode decodeVar = (decode) objWrite7;
            Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite8.getClass();
            ld ldVar = (ld) objWrite8;
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite9.getClass();
            copy8_81llAdefault copy8_81lladefault = (copy8_81llAdefault) objWrite9;
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite10.getClass();
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite10;
            Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite11.getClass();
            isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite11;
            Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite12.getClass();
            return new getPhrasejp8hJ3c(decodeVar, ldVar, copy8_81lladefault, getcontentviewgroupparentlayout, isopeninternalroom_runtime, (FontEj4NQ78default) objWrite12);
        }
        if (i2 == 2) {
            Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite13.getClass();
            ViewPager2SavedState1 viewPager2SavedState1 = (ViewPager2SavedState1) objWrite13;
            Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite14.getClass();
            AutoAcceptDeliveryImpl autoAcceptDeliveryImpl = (AutoAcceptDeliveryImpl) objWrite14;
            AndroidUiFrameClock androidUiFrameClock = new AndroidUiFrameClock();
            Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite15.getClass();
            AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl = (AutoAcceptNotificationMapperImpl) objWrite15;
            Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite16.getClass();
            StoreAutoAcceptedDeliveryIdsImpl storeAutoAcceptedDeliveryIdsImpl = (StoreAutoAcceptedDeliveryIdsImpl) objWrite16;
            Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite17.getClass();
            TextMotionLinearitySaverlambda0 textMotionLinearitySaverlambda0 = (TextMotionLinearitySaverlambda0) objWrite17;
            Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite18.getClass();
            return new AutoAcceptLocalPushHandlerImpl(viewPager2SavedState1, autoAcceptDeliveryImpl, androidUiFrameClock, autoAcceptNotificationMapperImpl, storeAutoAcceptedDeliveryIdsImpl, textMotionLinearitySaverlambda0, (AutoAcceptRequestManagerImpl) objWrite18);
        }
        if (i2 != 3) {
            Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite19.getClass();
            Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite20.getClass();
            Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite21.getClass();
            Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite22.getClass();
            Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite23.getClass();
            Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite24.getClass();
            r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = ((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) objWrite20).read();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(30L, timeUnit);
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(30L, timeUnit);
            ArrayList arrayList = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            arrayList.add((onImeAction9UiTYpYdefault) objWrite24);
            arrayList.add((performImeAction) objWrite23);
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer = (pageRightdefault) objWrite22;
            return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        }
        Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
        objWrite25.getClass();
        Application application = (Application) objWrite25;
        Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
        objWrite26.getClass();
        k6 k6Var = (k6) objWrite26;
        Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
        objWrite27.getClass();
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite27;
        Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite28.getClass();
        n6 n6Var = (n6) objWrite28;
        Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite29.getClass();
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) objWrite29;
        Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite30.getClass();
        TripProgressApi tripProgressApi = new TripProgressApi(application, k6Var, transfersessionpackagei, n6Var, getcontentviewgroupparentlayout2, (isOpenInternalroom_runtime) objWrite30);
        int i4 = MediaSessionCompatQueueItem + 15;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return tripProgressApi;
        }
        throw null;
    }
}
