package com.mapbox.navigation.core.trip.session.eh;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigator.ElectronicHorizonObserver;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.RoadObjectEnterExitInfo;
import com.mapbox.navigator.RoadObjectPassInfo;
import com.mapbox.navigator.RoadObjectsStoreObserver;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 implements ElectronicHorizonObserver, RoadObjectsStoreObserver {
    public final /* synthetic */ DropShadowEffect this$0;

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onCustomRoadObjectAddingCancelled(String str) {
        str.getClass();
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onCustomRoadObjectMatched(String str) {
        str.getClass();
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onCustomRoadObjectMatchingFailed(String str) {
        str.getClass();
    }

    public /* synthetic */ EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1(DropShadowEffect dropShadowEffect) {
        this.this$0 = dropShadowEffect;
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onPositionUpdated(ElectronicHorizonPosition electronicHorizonPosition, List list) {
        electronicHorizonPosition.getClass();
        list.getClass();
        DropShadowEffect dropShadowEffect = this.this$0;
        BuildersKt.RemoteActionCompatParcelizer(((JobControl) dropShadowEffect.RatingCompat).scope, null, null, new SignInDataStore$set$2(electronicHorizonPosition, list, dropShadowEffect, null, 11), 3);
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectAdded(String str) {
        str.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(0, str, null));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectEnterExitInfo) {
        roadObjectEnterExitInfo.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1(roadObjectEnterExitInfo, null, 1));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectEnterExitInfo) {
        roadObjectEnterExitInfo.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new EHorizonSubscriptionManagerImpl$electronicHorizonObserver$1$onRoadObjectExit$1(roadObjectEnterExitInfo, null, 0));
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectRemoved(String str) {
        str.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(1, str, null));
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectUpdated(String str) {
        str.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1$onRoadObjectAdded$1(2, str, null));
    }

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public void onRoadObjectPassed(RoadObjectPassInfo roadObjectPassInfo) {
        roadObjectPassInfo.getClass();
        DropShadowEffect.access$notifyAllObservers(this.this$0, new FlowLiveDataConversions$asFlow$1$1(roadObjectPassInfo, null, 21));
    }
}
