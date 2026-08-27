package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.re2j.Parser;
import com.roadrunner.auth.domain.WebRefreshAccessTokenUseCaseImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.state.data.HomeRepositoryImpl;
import com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.logger.screenshot.ScreenshotDetectionObserver;
import com.roadrunner.push.core.domain.DeletePushTokenImpl;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.I$b;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import okhttp3.FormBody;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class transactionWithResultsuspendImpl implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public transactionWithResultsuspendImpl(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 22) {
            this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 23) {
            this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else if (i == 27) {
            this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else if (i != 28) {
            this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public transactionWithResultsuspendImpl(getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1) {
        this.RemoteActionCompatParcelizer = 18;
        getverticalscrollaxisrangedelegate.getClass();
        requestsinglelocationupdatelambda1.getClass();
        this.serializer = getverticalscrollaxisrangedelegate;
        this.read = requestsinglelocationupdatelambda1;
    }

    public transactionWithResultsuspendImpl(generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 6;
        generateandroidfontktforapicompatibility.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = generateandroidfontktforapicompatibility;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 11;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = hasnestedscrollingparent;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(setPresentationView setpresentationview, newTransaction newtransaction) {
        this.RemoteActionCompatParcelizer = 29;
        setpresentationview.getClass();
        newtransaction.getClass();
        this.serializer = setpresentationview;
        this.read = newtransaction;
    }

    public transactionWithResultsuspendImpl(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 5;
        transactionwithresultsuspendimpl.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = transactionwithresultsuspendimpl;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, byte b) {
        this.RemoteActionCompatParcelizer = 25;
        transactionwithresultsuspendimpl.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = transactionwithresultsuspendimpl;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory2) {
        this.RemoteActionCompatParcelizer = 12;
        shouldShowHeatmap_Factory.getClass();
        shouldShowHeatmap_Factory2.getClass();
        this.serializer = shouldShowHeatmap_Factory;
        this.read = shouldShowHeatmap_Factory2;
    }

    public transactionWithResultsuspendImpl(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, setVerticalBias setverticalbias) {
        this.RemoteActionCompatParcelizer = 24;
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        setverticalbias.getClass();
        this.serializer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.read = setverticalbias;
    }

    public transactionWithResultsuspendImpl(publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 4;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = publisherrorlambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 17;
        requestsinglelocationupdatelambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = requestsinglelocationupdatelambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i != 20) {
            this.serializer = convertstringjsonarraytolistlambda0;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.serializer = convertstringjsonarraytolistlambda0;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public transactionWithResultsuspendImpl(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, byte b) {
        this.RemoteActionCompatParcelizer = 15;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
    }

    public transactionWithResultsuspendImpl(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        if (i != 16) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        } else {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        }
    }

    public transactionWithResultsuspendImpl(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.RemoteActionCompatParcelizer = 7;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public transactionWithResultsuspendImpl(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.RemoteActionCompatParcelizer = 14;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = convertstringjsonarraytolistlambda0;
    }

    public transactionWithResultsuspendImpl(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        if (i == 3) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            return;
        }
        if (i == 13) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i == 8) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i != 9) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        }
    }

    public transactionWithResultsuspendImpl(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, subscribeToBannersUpdates subscribetobannersupdates) {
        this.RemoteActionCompatParcelizer = 26;
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        subscribetobannersupdates.getClass();
        this.serializer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.read = subscribetobannersupdates;
    }

    public transactionWithResultsuspendImpl(getActionViewIntentlambda0 getactionviewintentlambda0, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 2;
        requestsinglelocationupdatelambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = requestsinglelocationupdatelambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transactionWithResultsuspendImpl(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 10;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = dataModule_ProvideSchedulerFactory;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [o.q9] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        int i4 = 23;
        int i5 = 0;
        int i6 = 1;
        switch (i3) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new transactionWithResult((getContentViewGroupParentLayout) objWrite, (isOpenInternalroom_runtime) objWrite2);
            case 1:
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq);
                lazySerializer2.getClass();
                return new snapToTargetExistingView(lazySerializer, lazySerializer2);
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite3;
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite4;
                return new I$b(new BrazeExternalSyntheticLambda28(settransactionsuccessful, 6), new compileStatement(settransactionsuccessful, i5), new compileStatement(settransactionsuccessful, i6), new compileStatement(settransactionsuccessful, i), new compileStatement(settransactionsuccessful, 3), new compileStatement(settransactionsuccessful, 4), new compileStatement(settransactionsuccessful, 5), new compileStatement(settransactionsuccessful, 7), new compileStatement(settransactionsuccessful, 8), new compileStatement(settransactionsuccessful, 9), new compileStatement(settransactionsuccessful, 6), r8lambda4txk7kovp_j84hgvzl3zo6mzli8);
            case 3:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new Parser.Pair((WorkManagerImpl) objWrite5, 24, (accessrunWorker) objWrite6);
            case 4:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                GetOfflineLocationRequestStateImpl getOfflineLocationRequestStateImpl = new GetOfflineLocationRequestStateImpl((GetRiderStatusImpl) objWrite7, (transferSessionPackageI) objWrite8);
                int i7 = write + 65;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 1 / 0;
                }
                return getOfflineLocationRequestStateImpl;
            case 5:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new WorkerWrapperBuilder((GetOfflineLocationRequestStateImpl) objWrite9, (WorkManagerImpl) objWrite10);
            case 6:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                ScreenshotDetectionObserver screenshotDetectionObserver = new ScreenshotDetectionObserver((FontEj4NQ78default) objWrite11, (decode) objWrite12);
                int i9 = write + 23;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return screenshotDetectionObserver;
            case 7:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new ja((transferSessionPackageI) objWrite13, (setFirstVerticalBias) objWrite14);
            case 8:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new k7((getHeadingrAG3T2k) objWrite15, (transferSessionPackageI) objWrite16);
            case 9:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new N((SharedPreferences) objWrite17, (setTransactionSuccessful) objWrite18, 1);
            case 10:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
                return new qdExternalSyntheticLambda0(r8lambdaktwlyipskq3tfa9ey3gatonixfq2, new Lazy() { // from class: o.q9
                    private static int read = 0;
                    private static int serializer = 1;

                    @Override // dagger.Lazy
                    public final Object write() {
                        int i11 = 2 % 2;
                        int i12 = read + 63;
                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        Gson gsonIconCompatParcelizer = onDependencyAdded.IconCompatParcelizer();
                        int i14 = read + 7;
                        serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i14 % 2 != 0) {
                            return gsonIconCompatParcelizer;
                        }
                        throw null;
                    }
                });
            case 11:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                return new qdExternalSyntheticLambda8((Application) objWrite20, (getContentViewGroupParentLayout) objWrite21);
            case 12:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new DeletePushTokenImpl((access1200) objWrite22, (r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU) objWrite23);
            case 13:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite24.getClass();
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new H$b((parseLayoutDescription) objWrite24, i4, (CustomerChatProviderImpl) objWrite25);
            case 14:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new handleThirdPartySharingCallbackI((decode) objWrite26, (getError) objWrite27);
            case 15:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite28.getClass();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new lambdaaddGlobalCallbackParameter21((SharedPreferences) objWrite28, (Clock) objWrite29);
            case 16:
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer3.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new ActivityHandler52(lazySerializer3, (isOpenInternalroom_runtime) objWrite30);
            case 17:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite31.getClass();
                isDisabled isdisabled = new isDisabled();
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new AddRiderHiringQueryParamsImpl((ApplicantRepository) objWrite31, isdisabled, (transferSessionPackageI) objWrite32);
            case 18:
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite33.getClass();
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite34.getClass();
                return new ApplicantRefreshAccessTokenUseCaseImpl((WebRefreshAccessTokenUseCaseImpl) objWrite33, (ApplicantRepository) objWrite34);
            case 19:
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite35.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new isOnline((AppEventInfoChangeHandler) objWrite35, (setConfig) objWrite36);
            case 20:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite38.getClass();
                return new setOnRemoteTriggerListener((HomeRepositoryImpl) objWrite37, (loadCachedui_text) objWrite38);
            case 21:
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite39.getClass();
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite40.getClass();
                return new FormBody.Builder((verifyAndTrackPlayStorePurchaseI) objWrite39, (transferSessionPackageI) objWrite40);
            case 22:
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite41.getClass();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite42.getClass();
                return new isBound((verifyAndTrackPlayStorePurchaseI) objWrite41, (transferSessionPackageI) objWrite42, 1);
            case 23:
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite43.getClass();
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite44.getClass();
                return new getSessionInterval((transferSessionPackageI) objWrite44, (verifyAndTrackPlayStorePurchaseI) objWrite43);
            case 24:
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite45.getClass();
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite46.getClass();
                return new OkHttpCall$1((addSerializedCardJsonToStoragelambda10) objWrite45, (getActionList) objWrite46);
            case 25:
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite47.getClass();
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite48.getClass();
                return new UpdateStateUseCaseImpl((setOnRemoteTriggerListener) objWrite47, (getPivotOffsetF1C5BW0) objWrite48);
            case 26:
                isMainThread ismainthread = new isMainThread(19);
                xb xbVar = new xb();
                accessisMainThread accessismainthread = new accessisMainThread();
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite49.getClass();
                getStoreIdFromSystem getstoreidfromsystem = (getStoreIdFromSystem) objWrite49;
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite50.getClass();
                return new sendAttributionRequest(ismainthread, xbVar, accessismainthread, getstoreidfromsystem, (logPushStoryPageClickedlambda11) objWrite50);
            case 27:
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite51.getClass();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite52.getClass();
                return new checkSdkClickResponse((transferSessionPackageI) objWrite52, (verifyAndTrackPlayStorePurchaseI) objWrite51);
            case 28:
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite53.getClass();
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite54.getClass();
                return new AttributionHandler1((transferSessionPackageI) objWrite54, (verifyAndTrackPlayStorePurchaseI) objWrite53);
            default:
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite55.getClass();
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite56.getClass();
                SharedResourcePool sharedResourcePool = new SharedResourcePool();
                sharedResourcePool.IconCompatParcelizer = (v9) objWrite56;
                return sharedResourcePool;
        }
    }
}
