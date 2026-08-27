package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface RoadObjectMatcherInterface {
    void cancel(List<String> list);

    void cancelAll();

    void matchGantries(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void matchOpenLRs(List<MatchableOpenLr> list, MatchingOptions matchingOptions);

    void matchPoints(List<MatchablePoint> list, MatchingOptions matchingOptions);

    void matchPolygons(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void matchPolylines(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void setListener(RoadObjectMatcherListener roadObjectMatcherListener);
}
