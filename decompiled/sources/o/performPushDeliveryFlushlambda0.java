package o;

import android.app.Application;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.Base64;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.fwf_tracking.model.FwFTrackingConfig;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener;
import com.roadrunner.logger.logger.firebase.FirebaseEventLogger;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.domain.OpportunitiesMapper;
import com.roadrunner.opportunities.domain.ProcessStartNowOpportunities;
import com.roadrunner.order.history.data.HistoryRepository;
import com.roadrunner.order.history.data.database.HistoryDatabase;
import com.roadrunner.order.history.data.network.HistoryApiRequest;
import com.roadrunner.overlay.bubble.service.OverlayCoordinator;
import com.roadrunner.push.core.domain.UpdateApplicantPushToken;
import com.roadrunner.push.core.domain.UpdatePushToken;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.fwf.genii.SentryFwfHttpRequestClient;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.startworking.data.StartWorkingRepository;
import dagger.Lazy;
import io.grpc.internal.CallTracer;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class performPushDeliveryFlushlambda0 implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static byte MediaSessionCompatQueueItem = -112;
    private static int RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public performPushDeliveryFlushlambda0(setPresentationView setpresentationview, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, newTransaction newtransaction, newTransaction newtransaction2) {
        this.serializer = 16;
        setpresentationview.getClass();
        newtransaction.getClass();
        newtransaction2.getClass();
        this.IconCompatParcelizer = setpresentationview;
        this.RemoteActionCompatParcelizer = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.read = newtransaction;
        this.write = newtransaction2;
    }

    public performPushDeliveryFlushlambda0(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 6;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = transactionwithresultsuspendimpl;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ MediaSessionCompatQueueItem);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public performPushDeliveryFlushlambda0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mc mcVar, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime) {
        this.serializer = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        mcVar.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = mcVar;
        this.write = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.RemoteActionCompatParcelizer = setusetemptrackingtableroom_runtime;
    }

    public performPushDeliveryFlushlambda0(hasNestedScrollingParent hasnestedscrollingparent, LayoutCompat layoutCompat, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 2;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.RemoteActionCompatParcelizer = layoutCompat;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public /* synthetic */ performPushDeliveryFlushlambda0(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.write = mergejsonobjects3;
        this.RemoteActionCompatParcelizer = mergejsonobjects4;
    }

    public performPushDeliveryFlushlambda0(postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        this.serializer = 4;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.RemoteActionCompatParcelizer = postanimationrunner;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.write = setpresentationview;
    }

    public performPushDeliveryFlushlambda0(lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 12;
        lambdaverifyplaystorepurchase45.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = lambdaverifyplaystorepurchase45;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public performPushDeliveryFlushlambda0(publishErrorlambda1 publisherrorlambda1, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, publishErrorlambda1 publisherrorlambda2, backgroundTimerFiredI backgroundtimerfiredi) {
        this.serializer = 11;
        publisherrorlambda1.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        publisherrorlambda2.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.read = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.write = publisherrorlambda2;
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
    }

    public performPushDeliveryFlushlambda0(publishErrorlambda1 publisherrorlambda1, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, transactionWithResultsuspendImpl transactionwithresultsuspendimpl) {
        this.serializer = 15;
        publisherrorlambda1.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.read = convertstringjsonarraytolistlambda0;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = transactionwithresultsuspendimpl;
    }

    public performPushDeliveryFlushlambda0(requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, getContentDataType getcontentdatatype, getContentDataType getcontentdatatype2, r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq) {
        this.serializer = 13;
        requestsinglelocationupdatelambda1.getClass();
        getcontentdatatype.getClass();
        getcontentdatatype2.getClass();
        this.IconCompatParcelizer = requestsinglelocationupdatelambda1;
        this.read = getcontentdatatype;
        this.write = getcontentdatatype2;
        this.RemoteActionCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
    }

    public performPushDeliveryFlushlambda0(hasNestedScrollingParent hasnestedscrollingparent, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, getContentDataType getcontentdatatype, getShapedelegate getshapedelegate) {
        this.serializer = 7;
        hasnestedscrollingparent.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        getcontentdatatype.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.read = convertstringjsonarraytolistlambda0;
        this.write = getcontentdatatype;
        this.RemoteActionCompatParcelizer = getshapedelegate;
    }

    public performPushDeliveryFlushlambda0(isEqualTo isequalto, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.serializer = 1;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.write = isequalto;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
        this.RemoteActionCompatParcelizer = convertstringjsonarraytolistlambda0;
    }

    public performPushDeliveryFlushlambda0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, hasNestedScrollingParent hasnestedscrollingparent, r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, setPresentationView setpresentationview) {
        this.serializer = 0;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = hasnestedscrollingparent;
        this.RemoteActionCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.write = setpresentationview;
    }

    public performPushDeliveryFlushlambda0(hasNestedScrollingParent hasnestedscrollingparent, isEqualTo isequalto, q0 q0Var, publishErrorlambda1 publisherrorlambda1) {
        this.serializer = 14;
        hasnestedscrollingparent.getClass();
        isequalto.getClass();
        q0Var.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.read = isequalto;
        this.write = q0Var;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() throws Throwable {
        int i = 2 % 2;
        int i2 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite;
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                Application application = (Application) objWrite2;
                openSessionlambda1 opensessionlambda1 = (openSessionlambda1) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) mergejsonobjects).write();
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new publishError(settransactionsuccessful, application, opensessionlambda1, getactionviewintentlambda0, (Clock) objWrite3);
            case 1:
                Object objWrite4 = ((isEqualTo) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                objWrite4.getClass();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite6.getClass();
                Object objWrite7 = ((convertStringJsonArrayToListlambda0) mergejsonobjects).write();
                objWrite7.getClass();
                return new SuspendingTransacterDefaultImpls((Set) objWrite4, (getContentViewGroupParentLayout) objWrite5, (isOpenInternalroom_runtime) objWrite6, (AppEventInfoChangeHandler) objWrite7);
            case 2:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite8.getClass();
                CreateHomeScope createHomeScope = (CreateHomeScope) ((LayoutCompat) mergejsonobjects).write();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new FirebaseEventLogger((Application) objWrite8, createHomeScope, (transferSessionPackageI) objWrite9, (FirebaseAnalyticsUserAttributesChangedListener) objWrite10);
            case 3:
                return new C((E) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (SaveHeatmapUrlImpl) ((setPresentationView) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 4:
                k6 k6Var = (k6) ((postAnimationRunner) mergejsonobjects).write();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite12.getClass();
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                ManeuverApi maneuverApi = new ManeuverApi(k6Var, (transferSessionPackageI) objWrite11, (getContentViewGroupParentLayout) objWrite12, (isOpenInternalroom_runtime) objWrite13);
                int i3 = RatingCompat + 101;
                MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return maneuverApi;
            case 5:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite14.getClass();
                mg mgVar = (mg) objWrite14;
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                ma maVar = (ma) objWrite15;
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new SecondaryRouteApi(mgVar, maVar, (FetchMapboxRouteUseCase) objWrite16, (m9) me.IconCompatParcelizer.write(), (SaveHeatmapUrlImpl) ((setUseTempTrackingTableroom_runtime) mergejsonobjects).write());
            case 6:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite18.getClass();
                N n = (N) ((transactionWithResultsuspendImpl) mergejsonobjects).write();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new mh((Application) objWrite17, (nExternalSyntheticLambda4) objWrite18, n, (transferSessionPackageI) objWrite19);
            case 7:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                ActivityHandler6 activityHandler6 = (ActivityHandler6) ((getShapedelegate) mergejsonobjects).write();
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = ((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) objWrite21).read();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(30L, timeUnit);
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(30L, timeUnit);
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(activityHandler6);
                return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
            case 8:
                return new OpportunitiesRepository((OpportunitiesMapper) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (resetTransientState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ProcessStartNowOpportunities) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getActionList) ((setVerticalBias) mergejsonobjects).write());
            case 9:
                return new HistoryRepository((HistoryApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (y6) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (HistoryDatabase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteDatabaseRequest) ((com.data.injection.DataModule_ProvideSchedulerFactory) mergejsonobjects).write());
            case 10:
                return new OverlayCoordinator((UpdateStateUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ContentPainterNode) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ContentPainterNode) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 11:
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new UpdatePushToken(lazySerializer, (IsUserAuthenticatedWrapper) objWrite23, (UpdateApplicantPushToken) objWrite24, (GetAppStateImpl) ((backgroundTimerFiredI) mergejsonobjects).write());
            case 12:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = (lambdaremoveGlobalCallbackParameter24) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) mergejsonobjects).write();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new lambdasetPushToken32((lambdasetCoppaComplianceInDelay49) objWrite25, (qdExternalSyntheticLambda8) objWrite26, lambdaremoveglobalcallbackparameter24, (getContentViewGroupParentLayout) objWrite27);
            case 13:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite28.getClass();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite29.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                foregroundTimerFired foregroundtimerfired = new foregroundTimerFired((r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite28, (accessgetOldDependencyp) objWrite29, (insertTextAtCursor) objWrite30, (OkHttpCall$1) ((r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ) mergejsonobjects).write());
                int i5 = MediaBrowserCompatMediaItem + 31;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return foregroundtimerfired;
            case 14:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite31.getClass();
                Application application2 = (Application) objWrite31;
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite32.getClass();
                Set set = (Set) objWrite32;
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite33.getClass();
                SentryFwfHttpRequestClient sentryFwfHttpRequestClient = (SentryFwfHttpRequestClient) objWrite33;
                getAttribution getattribution = new getAttribution();
                FwFTrackingConfig fwFTrackingConfig = (FwFTrackingConfig) ((publishErrorlambda1) mergejsonobjects).write();
                com.deliveryhero.fwf_client.FwFClient.Companion companion = com.deliveryhero.fwf_client.FwFClient.Companion;
                String string = application2.getString(com.logistics.rider.glovo.R.string.funWithFlagToken);
                if (string.startsWith("%('")) {
                    Object[] objArr = new Object[1];
                    a(string.substring(3), objArr);
                    string = ((String) objArr[0]).intern();
                }
                String str = string;
                str.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int i7 = RatingCompat + 47;
                    MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    linkedHashSet.add(((updateHandlersStatusAndSendI) it.next()).RemoteActionCompatParcelizer);
                }
                com.deliveryhero.fwf_client.FwFClient fwFClientCreate = com.deliveryhero.fwf_client.FwFClientExtensionKt.create(companion, application2, new com.deliveryhero.fwf_client.FwFClientConfig(str, linkedHashSet, null, null, null, null, null, null, null, null, false, 2044, null), (44 & 4) != 0 ? null : null, (44 & 8) != 0 ? null : null, (44 & 16) != 0 ? null : sentryFwfHttpRequestClient, (44 & 32) != 0 ? null : null, (44 & 64) != 0 ? null : fwFTrackingConfig, (44 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? null : getattribution);
                setNativeShader.RemoteActionCompatParcelizer(fwFClientCreate, "Cannot return null from a non-@Nullable @Provides method");
                return fwFClientCreate;
            case 15:
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite34.getClass();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite35.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new AttributionHandler5((GetRiderStateImpl) objWrite34, (subscribeToBannersUpdateslambda2) objWrite35, (setTransactionSuccessful) objWrite36, (AttributionHandler1) ((transactionWithResultsuspendImpl) mergejsonobjects).write());
            case 16:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite38.getClass();
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
                okHttpCall$1.write = (xa) objWrite38;
                okHttpCall$1.serializer = (v9) objWrite39;
                return okHttpCall$1;
            case 17:
                try {
                    Object[] objArr2 = {(transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new canReadAppSetId(), (getContentViewGroupParentLayout) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) mergejsonobjects).write()};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1122229495);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 3104), TextUtils.indexOf("", "", 0, 0) + 4856, ImageFormat.getBitsPerPixel(0) + 14, 1842086632, false, null, new Class[]{transferSessionPackageI.class, canReadAppSetId.class, getContentViewGroupParentLayout.class, isOpenInternalroom_runtime.class, (Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 4870, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15)});
                    }
                    return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr2);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 18:
                return new ComponentRegistry$Builder((Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ComponentRegistry$Builder) ((requestGeofencesInitializationlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getActionViewIntentlambda0) addSingleSynchronousSubscriptionlambda1.IconCompatParcelizer.write(), (removeRearDisplayPresentationStatusListener) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            default:
                return new CallTracer((lambda39) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (logPushDeliverylambda1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (StartWorkingRepository) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
        }
    }
}
