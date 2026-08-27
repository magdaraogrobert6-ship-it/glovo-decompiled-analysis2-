package com.mapbox.search;

import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.search.base.result.SearchResultFactory;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.sentiance.core.model.events.H$b;
import o.isAdapterPositionOnScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxSearchSdk {
    public static final MapboxSearchSdk INSTANCE = new MapboxSearchSdk();
    public static final isAdapterPositionOnScreen formattedTimeProvider$delegate = new isAdapterPositionOnScreen(MapboxSearchSdk$formattedTimeProvider$2.INSTANCE);
    public static H$b indexableDataProvidersRegistry;
    public static Vw$Vw searchRequestContextProvider;
    public static SearchResultFactory searchResultFactory;
    public static p0 timeProvider;
    public static IsFixableByRetry uuidProvider;
}
