package o;

import android.app.Application;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.state.provider.domain.GetWorkOpportunitiesImpl;
import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import dagger.Lazy;
import java.time.Clock;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class callbackFailAsync implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public callbackFailAsync(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestBannersRefreshlambda1 requestbannersrefreshlambda2, requestBannersRefreshlambda1 requestbannersrefreshlambda3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        requestbannersrefreshlambda1.getClass();
        requestbannersrefreshlambda2.getClass();
        requestbannersrefreshlambda3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = hasnestedscrollingparent;
        this.MediaDescriptionCompat = setpresentationview;
        this.MediaMetadataCompat = requestbannersrefreshlambda1;
        this.MediaSessionCompatQueueItem = requestbannersrefreshlambda2;
        this.RatingCompat = requestbannersrefreshlambda3;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public callbackFailAsync(q0 q0Var, requestBannersRefreshlambda1 requestbannersrefreshlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, getScrollRange getscrollrange, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setVerticalBias setverticalbias, setPresentationView setpresentationview2) {
        q0Var.getClass();
        requestbannersrefreshlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        getscrollrange.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setverticalbias.getClass();
        setpresentationview2.getClass();
        this.IconCompatParcelizer = q0Var;
        this.serializer = requestbannersrefreshlambda1;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaMetadataCompat = setpresentationview;
        this.MediaSessionCompatQueueItem = getscrollrange;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = setverticalbias;
        this.write = setpresentationview2;
    }

    public callbackFailAsync(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, isEqualTo isequalto, getContentDataType getcontentdatatype, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, q0 q0Var, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        isequalto.getClass();
        getcontentdatatype.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        q0Var.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = isequalto;
        this.MediaDescriptionCompat = getcontentdatatype;
        this.MediaMetadataCompat = dataModule_ProvideSchedulerFactory;
        this.MediaSessionCompatQueueItem = q0Var;
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.read = setpresentationview;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 29;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        mergeJsonObjects mergejsonobjects = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.IconCompatParcelizer;
        if (i4 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
            objWrite.getClass();
            GetWorkOpportunitiesImpl getWorkOpportunitiesImpl = (GetWorkOpportunitiesImpl) objWrite;
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
            objWrite2.getClass();
            getHuaweiAdsReferrer gethuaweiadsreferrer = (getHuaweiAdsReferrer) objWrite2;
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite3.getClass();
            removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener = (removeRearDisplayPresentationStatusListener) objWrite3;
            Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite4.getClass();
            IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl = (IsRiderInsideAreaUseCaseImpl) objWrite4;
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite5.getClass();
            CoreComponentFactory coreComponentFactory = (CoreComponentFactory) objWrite5;
            Object objWrite6 = mergejsonobjects.write();
            objWrite6.getClass();
            vg vgVar = (vg) objWrite6;
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite7.getClass();
            OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) objWrite7;
            Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite8.getClass();
            getActionList getactionlist = (getActionList) objWrite8;
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite9.getClass();
            return new GetWorkNowOpportunity(getWorkOpportunitiesImpl, gethuaweiadsreferrer, removereardisplaypresentationstatuslistener, isRiderInsideAreaUseCaseImpl, coreComponentFactory, vgVar, opportunitiesRepository, getactionlist, (Clock) objWrite9);
        }
        if (i4 == 1) {
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
            objWrite10.getClass();
            com.deliveryhero.fwf_client.FwFClient fwFClient = (com.deliveryhero.fwf_client.FwFClient) objWrite10;
            Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
            objWrite11.getClass();
            Set set = (Set) objWrite11;
            Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite12.getClass();
            accessgetOldDependencyp accessgetolddependencyp = (accessgetOldDependencyp) objWrite12;
            Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite13.getClass();
            getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) objWrite13;
            Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite14.getClass();
            EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) objWrite14;
            Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite15.getClass();
            decode decodeVar = (decode) objWrite15;
            Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite16.getClass();
            isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite16;
            Object objWrite17 = mergejsonobjects.write();
            objWrite17.getClass();
            endFirstSessionDelay endfirstsessiondelay = (endFirstSessionDelay) objWrite17;
            Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite18.getClass();
            return new Gen2FunWithFlagsConfigRepository(fwFClient, set, accessgetolddependencyp, getallsemanticsnodestomap, enumColumnAdapter, decodeVar, isopeninternalroom_runtime, endfirstsessiondelay, (getContentViewGroupParentLayout) objWrite18);
        }
        Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
        objWrite19.getClass();
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objWrite19;
        Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
        objWrite20.getClass();
        Application application = (Application) objWrite20;
        Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
        objWrite21.getClass();
        isOpenInternalroom_runtime isopeninternalroom_runtime2 = (isOpenInternalroom_runtime) objWrite21;
        Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
        objWrite22.getClass();
        subscribeToFeatureFlagsUpdateslambda30 subscribetofeatureflagsupdateslambda30 = (subscribeToFeatureFlagsUpdateslambda30) objWrite22;
        Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
        objWrite23.getClass();
        subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31 = (subscribeToChangeUserEventslambda31) objWrite23;
        Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
        objWrite24.getClass();
        subscribeToContentCardsUpdateslambda31 subscribetocontentcardsupdateslambda31 = (subscribeToContentCardsUpdateslambda31) objWrite24;
        Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
        objWrite25.getClass();
        subscribeToNetworkFailureslambda1 subscribetonetworkfailureslambda1 = (subscribeToNetworkFailureslambda1) objWrite25;
        Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
        lazySerializer.getClass();
        Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite26.getClass();
        DefaultBackgroundSoundManager defaultBackgroundSoundManager = new DefaultBackgroundSoundManager(getcontentviewgroupparentlayout, application, isopeninternalroom_runtime2, subscribetofeatureflagsupdateslambda30, subscribetochangeusereventslambda31, subscribetocontentcardsupdateslambda31, subscribetonetworkfailureslambda1, lazySerializer, (transferSessionPackageI) objWrite26);
        int i5 = PlaybackStateCompatCustomAction + 79;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return defaultBackgroundSoundManager;
    }
}
