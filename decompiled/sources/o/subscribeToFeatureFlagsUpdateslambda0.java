package o;

import android.app.Application;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.sentiance.core.model.events.C$b;
import io.sentry.CombinedScopeView;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToFeatureFlagsUpdateslambda0 implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public subscribeToFeatureFlagsUpdateslambda0(hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i != 6) {
            this.write = hasnestedscrollingparent;
            this.IconCompatParcelizer = setpresentationview;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.write = hasnestedscrollingparent;
            this.IconCompatParcelizer = setpresentationview;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public subscribeToFeatureFlagsUpdateslambda0(AbsSavedState absSavedState, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.RemoteActionCompatParcelizer = 3;
        absSavedState.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        requestbannersrefreshlambda1.getClass();
        this.write = absSavedState;
        this.IconCompatParcelizer = dataModule_ProvideSchedulerFactory;
        this.serializer = requestbannersrefreshlambda1;
    }

    public subscribeToFeatureFlagsUpdateslambda0(lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, publishErrorlambda1 publisherrorlambda1) {
        this.RemoteActionCompatParcelizer = 1;
        lambdaverifyplaystorepurchase45.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        publisherrorlambda1.getClass();
        this.write = lambdaverifyplaystorepurchase45;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
        this.serializer = publisherrorlambda1;
    }

    public subscribeToFeatureFlagsUpdateslambda0(publishErrorlambda1 publisherrorlambda1, SingleProcessDataStore singleProcessDataStore, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 2;
        publisherrorlambda1.getClass();
        singleProcessDataStore.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = publisherrorlambda1;
        this.IconCompatParcelizer = singleProcessDataStore;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public subscribeToFeatureFlagsUpdateslambda0(publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, newTransaction newtransaction) {
        this.RemoteActionCompatParcelizer = 5;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        newtransaction.getClass();
        this.write = publisherrorlambda1;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = newtransaction;
    }

    public subscribeToFeatureFlagsUpdateslambda0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        this.RemoteActionCompatParcelizer = 4;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.serializer = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.write;
        if (i2 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite.getClass();
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite2.getClass();
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite3.getClass();
            return new subscribeToContentCardsUpdateslambda2((Application) objWrite, (isOpenInternalroom_runtime) objWrite2, (getContentViewGroupParentLayout) objWrite3);
        }
        if (i2 == 1) {
            Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite4.getClass();
            getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite5.getClass();
            Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite6.getClass();
            return new GetStatusUseCaseImpl((setSubscriptionUrl) objWrite4, getactionviewintentlambda0, (subscribeToBannersUpdateslambda2) objWrite5, (GetRiderStateImpl) objWrite6);
        }
        if (i2 == 2) {
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite7.getClass();
            Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite8.getClass();
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite9.getClass();
            return new C$b((GetRiderStatusImpl) objWrite7, (CachedDeliveryRepository) objWrite8, (dispatchChildDetached) objWrite9);
        }
        if (i2 == 3) {
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite10.getClass();
            Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite11.getClass();
            Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite12.getClass();
            ClearRiderStateDatabaseImpl clearRiderStateDatabaseImpl = new ClearRiderStateDatabaseImpl((asBinder) objWrite10, (ExecuteDatabaseRequest) objWrite11, (onRemoteTrigger) objWrite12);
            int i3 = read + 11;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return clearRiderStateDatabaseImpl;
        }
        if (i2 == 4) {
            Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite13.getClass();
            Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite14.getClass();
            Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite15.getClass();
            return new FormBody.Builder((decode) objWrite13, (getContentViewGroupParentLayout) objWrite14, (isOpenInternalroom_runtime) objWrite15);
        }
        if (i2 == 5) {
            Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite16.getClass();
            Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite17.getClass();
            Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite18.getClass();
            return new CombinedScopeView((accesssetShouldRequestFrameworkListenToNetworkUpdatescp) objWrite16, (setLastHorizontalStyle) objWrite17, (v4) objWrite18, 22);
        }
        Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite19.getClass();
        Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite20.getClass();
        Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite21.getClass();
        subscribeToFeatureFlagsUpdateslambda2 subscribetofeatureflagsupdateslambda2 = new subscribeToFeatureFlagsUpdateslambda2((Application) objWrite19, (isOpenInternalroom_runtime) objWrite20, (getContentViewGroupParentLayout) objWrite21);
        int i5 = MediaMetadataCompat + 57;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return subscribetofeatureflagsupdateslambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
