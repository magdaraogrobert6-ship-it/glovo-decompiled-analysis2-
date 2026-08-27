package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.GenericEventCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.ResourceRequest;
import com.mapbox.maps.ResourceRequestCallback;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.isInteropViewHost;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0 implements CameraChangedCoalescedCallback, CameraChangedCallback, GenericEventCallback, MapLoadedCallback, RenderFrameFinishedCallback, RenderFrameStartedCallback, ResourceRequestCallback, SourceAddedCallback, SourceDataLoadedCallback, SourceRemovedCallback, StyleDataLoadedCallback, StyleImageMissingCallback, StyleImageRemoveUnusedCallback, StyleLoadedCallback {
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 f$0;

    public /* synthetic */ MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
        this.f$0 = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        isInteropViewHost.RemoteActionCompatParcelizer(cameraChanged, this.f$0);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        isInteropViewHost.RemoteActionCompatParcelizer(cameraChangedCoalesced, this.f$0);
    }

    @Override // com.mapbox.maps.GenericEventCallback
    public void run(GenericEvent genericEvent) {
        isInteropViewHost.RemoteActionCompatParcelizer(genericEvent, this.f$0);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        isInteropViewHost.RemoteActionCompatParcelizer(mapLoaded, this.f$0);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        isInteropViewHost.RemoteActionCompatParcelizer(renderFrameFinished, this.f$0);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        isInteropViewHost.RemoteActionCompatParcelizer(renderFrameStarted, this.f$0);
    }

    @Override // com.mapbox.maps.ResourceRequestCallback
    public void run(ResourceRequest resourceRequest) {
        isInteropViewHost.RemoteActionCompatParcelizer(resourceRequest, this.f$0);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        isInteropViewHost.RemoteActionCompatParcelizer(sourceAdded, this.f$0);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        isInteropViewHost.RemoteActionCompatParcelizer(sourceDataLoaded, this.f$0);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        isInteropViewHost.RemoteActionCompatParcelizer(sourceRemoved, this.f$0);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        isInteropViewHost.RemoteActionCompatParcelizer(styleDataLoaded, this.f$0);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        isInteropViewHost.RemoteActionCompatParcelizer(styleImageMissing, this.f$0);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        isInteropViewHost.RemoteActionCompatParcelizer(styleImageRemoveUnused, this.f$0);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        isInteropViewHost.RemoteActionCompatParcelizer(styleLoaded, this.f$0);
    }
}
