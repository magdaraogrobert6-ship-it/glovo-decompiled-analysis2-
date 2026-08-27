package o;

import android.app.Application;
import com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks;
import com.roadrunner.country.config.implementation.data.CountryConfigFallbackDataSource;
import com.roadrunner.map.integration.search.InitialiseMapboxSearch;
import com.roadrunner.realtime.data.SocketIoGuard;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        if (i != 8) {
            this.IconCompatParcelizer = mergejsonobjects;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        } else {
            this.IconCompatParcelizer = mergejsonobjects;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        }
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.RemoteActionCompatParcelizer = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, mergeJsonObjects mergejsonobjects) {
        this.RemoteActionCompatParcelizer = 11;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        subscribetofeatureflagsupdateslambda0.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = subscribetofeatureflagsupdateslambda0;
        this.IconCompatParcelizer = mergejsonobjects;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.RemoteActionCompatParcelizer = 4;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = mergejsonobjects;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects) {
        this.RemoteActionCompatParcelizer = 6;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        this.serializer = hasnestedscrollingparent;
        this.read = setpresentationview;
        this.IconCompatParcelizer = mergejsonobjects;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview) {
        this.RemoteActionCompatParcelizer = 2;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        this.serializer = hasnestedscrollingparent;
        this.IconCompatParcelizer = mergejsonobjects;
        this.read = setpresentationview;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects) {
        this.RemoteActionCompatParcelizer = 9;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = publisherrorlambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = mergejsonobjects;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(mergeJsonObjects mergejsonobjects, backgroundTimerFiredI backgroundtimerfiredi, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.RemoteActionCompatParcelizer = 10;
        backgroundtimerfiredi.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = backgroundtimerfiredi;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.RemoteActionCompatParcelizer = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(mergeJsonObjects mergejsonobjects, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, getContentDataType getcontentdatatype) {
        this.RemoteActionCompatParcelizer = 0;
        dataModule_ProvideSchedulerFactory.getClass();
        getcontentdatatype.getClass();
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = dataModule_ProvideSchedulerFactory;
        this.read = getcontentdatatype;
    }

    public r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI(hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 1;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = hasnestedscrollingparent;
        this.IconCompatParcelizer = mergejsonobjects;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        switch (i3) {
            case 0:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer.getClass();
                r8lambda3LykK_dh7npnNoSi5rY1HPXio9g r8lambda3lykk_dh7npnnosi5ry1hpxio9g = new r8lambda3LykK_dh7npnNoSi5rY1HPXio9g();
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new r8lambda2tFXStZN_MXijoyymezhxf14xPY(lazySerializer, r8lambda3lykk_dh7npnnosi5ry1hpxio9g, (getAllSemanticsNodesToMap) objWrite, (accessgetOldDependencyp) objWrite2);
            case 1:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                Object objWrite4 = mergejsonobjects.write();
                objWrite4.getClass();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new getAllUncoveredSemanticsNodesToIntObjectMaplambda0virtualViewId((Application) objWrite3, (SentryActivityScreenPerformanceCallbacks) objWrite4, (transferSessionPackageI) objWrite5);
            case 2:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite6.getClass();
                Object objWrite7 = mergejsonobjects.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new CountryConfigFallbackDataSource((Application) objWrite6, (resetTransientState) objWrite7, (isOpenInternalroom_runtime) objWrite8);
            case 3:
                io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new io.sentry.util.MediaBrowserCompatMediaItem(8);
                Object objWrite9 = mergejsonobjects.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite10.getClass();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new com.huawei.wisesecurity.ucs_credential.n0(mediaBrowserCompatMediaItem, (TextForegroundStyle) objWrite9, (localeSpan) objWrite10, (Clock) objWrite11);
            case 4:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite12.getClass();
                Object objWrite13 = mergejsonobjects.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new getHeadingrAG3T2k((requestPermissions) objWrite12, (accessgetParagraphcp) objWrite13, (getContentViewGroupParentLayout) objWrite14);
            case 5:
                Object objWrite15 = mergejsonobjects.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite16.getClass();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new SuspendingTransacterDefaultImpls((setOnEventTrackingSucceededListener) objWrite15, (transferSessionPackageI) objWrite16, (transactionWithResult) objWrite17);
            case 6:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite18.getClass();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                Object objWrite20 = mergejsonobjects.write();
                objWrite20.getClass();
                InitialiseMapboxSearch initialiseMapboxSearch = new InitialiseMapboxSearch((Application) objWrite18, (isOpenInternalroom_runtime) objWrite19, (igExternalSyntheticLambda2) objWrite20);
                int i4 = MediaDescriptionCompat + 69;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return initialiseMapboxSearch;
            case 7:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer2.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled.read = new qb(lazySerializer2);
                getidentifiersvalidationsenabled.write((r1) objWrite22);
                getidentifiersvalidationsenabled.write((qdExternalSyntheticLambda0) objWrite21);
                return getidentifiersvalidationsenabled;
            case 8:
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer3.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled2.read = new qb(lazySerializer3);
                getidentifiersvalidationsenabled2.write((r1) objWrite24);
                getidentifiersvalidationsenabled2.write((qdExternalSyntheticLambda0) objWrite23);
                return getidentifiersvalidationsenabled2;
            case 9:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                Object objWrite27 = mergejsonobjects.write();
                objWrite27.getClass();
                return new isEnabledI((lambdagdprForgetMe35) objWrite25, (setOnEventTrackingSucceededListener) objWrite26, (getNeedsDensityui_text) objWrite27);
            case 10:
                BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = new BrazeCompanionExternalSyntheticLambda21(5);
                Object objWrite28 = mergejsonobjects.write();
                objWrite28.getClass();
                lambdasetPushToken32 lambdasetpushtoken32 = (lambdasetPushToken32) objWrite28;
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite29.getClass();
                lambdasendReftagReferrer17 lambdasendreftagreferrer17 = (lambdasendReftagReferrer17) objWrite29;
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new SocketIoGuard(brazeCompanionExternalSyntheticLambda21, lambdasetpushtoken32, lambdasendreftagreferrer17, (lambdaremoveGlobalCallbackParameter24) objWrite30, new SharedResourcePool(10));
            default:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite31.getClass();
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                return new subscribeToFeatureFlagsUpdateslambda31((transferSessionPackageI) objWrite31, r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergejsonobjects);
        }
    }
}
