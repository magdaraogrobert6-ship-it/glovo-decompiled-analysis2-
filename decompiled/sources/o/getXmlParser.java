package o;

import android.app.Application;
import coil3.ComponentRegistry$Builder;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.map.integration.mapbox.speedlimit.SpeedLimitApi;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.ondemand.presentation.GetOnDemandUiState;
import com.roadrunner.rider.state.onpause.domain.GetOnPauseUiState;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getXmlParser implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 2;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public getXmlParser(postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, setPresentationView setpresentationview) {
        postanimationrunner.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        setpresentationview.getClass();
        this.write = postanimationrunner;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.serializer = setpresentationview;
    }

    public getXmlParser(publishErrorlambda1 publisherrorlambda1, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, newTransaction newtransaction, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        publisherrorlambda1.getClass();
        transactionwithresultsuspendimpl.getClass();
        newtransaction.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = transactionwithresultsuspendimpl;
        this.MediaDescriptionCompat = newtransaction;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public getXmlParser(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setStateDescription setstatedescription, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda1) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setstatedescription.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        convertstringjsonarraytolistlambda1.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = setstatedescription;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.serializer = convertstringjsonarraytolistlambda1;
    }

    public getXmlParser(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, transactiondefault transactiondefaultVar, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        transactiondefaultVar.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = transactiondefaultVar;
        this.MediaDescriptionCompat = convertstringjsonarraytolistlambda0;
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public getXmlParser(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, newTransaction newtransaction, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, AbsSavedState absSavedState) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        subscribetofeatureflagsupdateslambda0.getClass();
        newtransaction.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        absSavedState.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = subscribetofeatureflagsupdateslambda0;
        this.MediaDescriptionCompat = newtransaction;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.serializer = absSavedState;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 123;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.write;
        if (i3 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite.getClass();
            setMaxElementsWrap setmaxelementswrap = (setMaxElementsWrap) objWrite;
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite2.getClass();
            RectManager rectManager = (RectManager) objWrite2;
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite3.getClass();
            setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = (setOnEventTrackingSucceededListener) objWrite3;
            Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite4.getClass();
            subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2 = (subscribeToBannersUpdateslambda2) objWrite4;
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite5.getClass();
            return new setConfig(setmaxelementswrap, rectManager, setoneventtrackingsucceededlistener, subscribetobannersupdateslambda2, (getError) objWrite5);
        }
        if (i3 == 1) {
            Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite6.getClass();
            SemanticsOwner semanticsOwner = (SemanticsOwner) objWrite6;
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite7.getClass();
            SuspendingTransactionWrapper suspendingTransactionWrapper = (SuspendingTransactionWrapper) objWrite7;
            Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite8.getClass();
            AppEventInfoChangeHandler appEventInfoChangeHandler = (AppEventInfoChangeHandler) objWrite8;
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite9.getClass();
            Application application = (Application) objWrite9;
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite10.getClass();
            return new ComponentRegistry$Builder(semanticsOwner, suspendingTransactionWrapper, appEventInfoChangeHandler, application, (transferSessionPackageI) objWrite10);
        }
        if (i3 == 2) {
            Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite11.getClass();
            k6 k6Var = (k6) objWrite11;
            Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite12.getClass();
            transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite12;
            Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite13.getClass();
            nExternalSyntheticLambda2 nexternalsyntheticlambda2 = (nExternalSyntheticLambda2) objWrite13;
            Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite14.getClass();
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite14;
            Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite15.getClass();
            SpeedLimitApi speedLimitApi = new SpeedLimitApi(k6Var, transfersessionpackagei, nexternalsyntheticlambda2, getcontentviewgroupparentlayout, (isOpenInternalroom_runtime) objWrite15);
            int i4 = RatingCompat + 3;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
            return speedLimitApi;
        }
        if (i3 != 3) {
            Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite16.getClass();
            GetRiderStatusImpl getRiderStatusImpl = (GetRiderStatusImpl) objWrite16;
            Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite17.getClass();
            checkSdkClickResponse checksdkclickresponse = (checkSdkClickResponse) objWrite17;
            Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite18.getClass();
            vd vdVar = (vd) objWrite18;
            Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite19.getClass();
            subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda3 = (subscribeToBannersUpdateslambda2) objWrite19;
            Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite20.getClass();
            return new GetOnPauseUiState(getRiderStatusImpl, checksdkclickresponse, vdVar, subscribetobannersupdateslambda3, (dispatchChildDetached) objWrite20);
        }
        Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
        objWrite21.getClass();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite21;
        Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
        objWrite22.getClass();
        GetStatusUseCaseImpl getStatusUseCaseImpl = (GetStatusUseCaseImpl) objWrite22;
        Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite23.getClass();
        v9 v9Var = (v9) objWrite23;
        Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite24.getClass();
        subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda4 = (subscribeToBannersUpdateslambda2) objWrite24;
        Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite25.getClass();
        return new GetOnDemandUiState(settransactionsuccessful, getStatusUseCaseImpl, v9Var, subscribetobannersupdateslambda4, (CanRequestLocationUpdatesImpl) objWrite25);
    }
}
