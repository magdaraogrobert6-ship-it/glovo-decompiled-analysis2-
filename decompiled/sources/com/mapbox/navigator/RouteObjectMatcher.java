package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface RouteObjectMatcher {
    void cancel(List<String> list);

    void cancelAll();

    void matchRouteObjects(List<MatchableRouteObject> list);

    void setListener(RouteObjectMatcherListener routeObjectMatcherListener);
}
