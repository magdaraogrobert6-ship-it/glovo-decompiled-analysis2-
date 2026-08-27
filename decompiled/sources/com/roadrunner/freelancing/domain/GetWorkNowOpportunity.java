package com.roadrunner.freelancing.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.provider.domain.GetWorkOpportunitiesImpl;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.CoreComponentFactory;
import o.ExtensionWindowAreaStatusRequirements;
import o.ResourcesCompatFontCallback;
import o.endRearDisplayPresentationSession;
import o.getActionList;
import o.getBridge;
import o.getCieXyz;
import o.getGpsAdid;
import o.getHuaweiAdsReferrer;
import o.o7ExternalSyntheticLambda3;
import o.onPopulateAccessibilityEvent;
import o.onServiceConnected;
import o.performAccessibilityAction;
import o.removeNodeAtDepth;
import o.removeRearDisplayPresentationStatusListener;
import o.sendAccessibilityEventUnchecked;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWorkNowOpportunity {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final getHuaweiAdsReferrer IconCompatParcelizer;
    public final vg MediaBrowserCompatMediaItem;
    public final OpportunitiesRepository MediaDescriptionCompat;
    public final removeRearDisplayPresentationStatusListener MediaMetadataCompat;
    public final CoreComponentFactory PlaybackStateCompat;
    public final Clock RemoteActionCompatParcelizer;
    public final IsRiderInsideAreaUseCaseImpl read;
    public final GetWorkOpportunitiesImpl serializer;
    public final getActionList write;
    public final LinkedHashMap RatingCompat = new LinkedHashMap();
    public final MutableStateFlow MediaSessionCompatQueueItem = StateFlowKt.read(performAccessibilityAction.RemoteActionCompatParcelizer);

    public GetWorkNowOpportunity(GetWorkOpportunitiesImpl getWorkOpportunitiesImpl, getHuaweiAdsReferrer gethuaweiadsreferrer, removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener, IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl, CoreComponentFactory coreComponentFactory, vg vgVar, OpportunitiesRepository opportunitiesRepository, getActionList getactionlist, Clock clock) {
        this.serializer = getWorkOpportunitiesImpl;
        this.IconCompatParcelizer = gethuaweiadsreferrer;
        this.MediaMetadataCompat = removereardisplaypresentationstatuslistener;
        this.read = isRiderInsideAreaUseCaseImpl;
        this.PlaybackStateCompat = coreComponentFactory;
        this.MediaBrowserCompatMediaItem = vgVar;
        this.MediaDescriptionCompat = opportunitiesRepository;
        this.write = getactionlist;
        this.RemoteActionCompatParcelizer = clock;
    }

    public static boolean read(getBridge getbridge, String str, String str2) {
        int i = 2 % 2;
        if (getbridge instanceof sendAccessibilityEventUnchecked) {
            int i2 = PlaybackStateCompatCustomAction + 121;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (getbridge instanceof performAccessibilityAction) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
        }
        if (!(getbridge instanceof onPopulateAccessibilityEvent)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        int i4 = MediaSessionCompatToken + 39;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        boolean zEquals = ((onPopulateAccessibilityEvent) getbridge).write().equals(str);
        int i6 = MediaSessionCompatToken + 83;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public final getGpsAdid RemoteActionCompatParcelizer(List list, onServiceConnected onserviceconnected, endRearDisplayPresentationSession endreardisplaypresentationsession) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 51;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = PlaybackStateCompatCustomAction + 103;
            MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object next = it.next();
                getGpsAdid getgpsadid = (getGpsAdid) next;
                if (getgpsadid.MediaDescriptionCompat == onserviceconnected) {
                    ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = endreardisplaypresentationsession.IconCompatParcelizer;
                    if (this.read.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), getgpsadid.MediaMetadataCompat.write.serializer)) {
                        obj = next;
                        break;
                    }
                }
            } else {
                onServiceConnected onserviceconnected2 = ((getGpsAdid) it.next()).MediaDescriptionCompat;
                obj.hashCode();
                throw null;
            }
        }
        getGpsAdid getgpsadid2 = (getGpsAdid) obj;
        int i5 = PlaybackStateCompatCustomAction + 91;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getgpsadid2;
    }

    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 IconCompatParcelizer() {
        int i = 2 % 2;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1Serializer = this.serializer.serializer();
        getHuaweiAdsReferrer gethuaweiadsreferrer = this.IconCompatParcelizer;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SingleProcessDataStore$data$1.AnonymousClass1(this, null, 16), FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(getMapScope$invoke$$inlined$map$1Serializer, new GetMapScope$invoke$$inlined$map$1(gethuaweiadsreferrer.IconCompatParcelizer.write(), gethuaweiadsreferrer, 13), this.MediaMetadataCompat.serializer, this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat.read(), new ResourcesCompatFontCallback(6, 4, GetWorkNowOpportunity.class, this, "mapToWorkNowOpportunity", "mapToWorkNowOpportunity(Ljava/util/List;Lcom/roadrunner/rider/state/api/shift/FutureShift;Lcom/roadrunner/location/api/model/LocationResult;Lcom/roadrunner/freelancing/domain/OpportunitySelectionState;Lcom/roadrunner/opportunities/api/OpportunitiesInfo;)Lcom/roadrunner/freelancing/domain/GetWorkNowOpportunity$WorkNowOpportunity;"))));
        int i2 = MediaSessionCompatToken + 17;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
        }
        throw null;
    }
}
