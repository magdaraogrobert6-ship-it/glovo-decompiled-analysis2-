package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface RouteObjectMatcherListener {
    void onMatchingCancelled(List<String> list);

    void onRouteObjectsMatched(Expected<List<RouteObjectMatcherError>, List<MatchedRouteObject>> expected);
}
