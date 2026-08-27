package com.mapbox.navigation.core;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.FallbackVersionsObserver;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.isAppSetIdReadingEnabled;
import o.onContentCardDismissed;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$createInternalFallbackVersionsObserver$1 implements FallbackVersionsObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ MapboxNavigation$createInternalFallbackVersionsObserver$1(int i, Object obj) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public final void onFallbackVersionsFound(List list) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        if (i != 0) {
            list.getClass();
            MapboxTripSession mapboxTripSession = (MapboxTripSession) obj;
            BuildersKt.RemoteActionCompatParcelizer(mapboxTripSession.mainJobController.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(mapboxTripSession, list, (ShortNewsContentCardView) null, 17), 3);
            return;
        }
        MapboxNavigation mapboxNavigation = (MapboxNavigation) obj;
        list.getClass();
        LoggerProviderKt.logI("FallbackVersionsObserver.onFallbackVersionsFound called with versions = " + list, "MapboxNavigation");
        if (list.isEmpty()) {
            return;
        }
        MapboxNavigation.access$recreateNavigatorInstance(mapboxNavigation, true, (String) onContentCardDismissed.MediaDescriptionCompat(list));
        Iterator it = mapboxNavigation.navigationVersionSwitchObservers.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public final void onCanReturnToLatest(String str) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        str.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i != 0) {
            MapboxTripSession mapboxTripSession = (MapboxTripSession) obj;
            BuildersKt.RemoteActionCompatParcelizer(mapboxTripSession.mainJobController.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(mapboxTripSession, str, shortNewsContentCardView, 16), 3);
            return;
        }
        LoggerProviderKt.logI("FallbackVersionsObserver.onCanReturnToLatest called with version = ".concat(str), "MapboxNavigation");
        MapboxNavigation mapboxNavigation = (MapboxNavigation) obj;
        NavigationOptions navigationOptions = mapboxNavigation.navigationOptions;
        navigationOptions.routingTilesOptions.getClass();
        MapboxNavigation.access$recreateNavigatorInstance(mapboxNavigation, false, "");
        Iterator it = mapboxNavigation.navigationVersionSwitchObservers.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                navigationOptions.routingTilesOptions.getClass();
                throw null;
            }
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        }
    }
}
