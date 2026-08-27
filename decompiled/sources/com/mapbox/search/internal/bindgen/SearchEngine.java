package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import com.mapbox.common.TilesetDescriptor;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchEngine implements SearchEngineInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class SearchEnginePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SearchEngine.cleanNativePeer(this.peer);
        }

        public SearchEnginePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native TilesetDescriptor createPlacesTilesetDescriptor(String str, String str2);

    public static native TilesetDescriptor createTilesetDescriptor(String str, String str2);

    public static native UserRecordsLayer createUserLayer(String str, int i);

    public static native String formatAddress(SearchAddress searchAddress);

    public static native List<Integer> getHighlights(String str, String str2);

    private native void initialize(EngineOptions engineOptions, LocationProvider locationProvider);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void addOfflineIndexObserver(OfflineIndexObserver offlineIndexObserver);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void addUserLayer(UserRecordsLayer userRecordsLayer);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long brandSearch(BrandSearchOptions brandSearchOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void cancel(long j);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long forward(String str, SearchOptions searchOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void getAddressesOffline(String str, Point point, double d, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void getEvChargePointOperators(ChargePointOperatorsCallback chargePointOperatorsCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long listCategories(CategoryOptions categoryOptions, CategoriesCallback categoriesCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void makeFeedbackEvent(RequestOptions requestOptions, SearchResult searchResult, FeedbackEventCallback feedbackEventCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void onSelected(RequestOptions requestOptions, SearchResult searchResult);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void removeOfflineIndexObserver(OfflineIndexObserver offlineIndexObserver);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void removeUserLayer(UserRecordsLayer userRecordsLayer);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long retrieve(RequestOptions requestOptions, SearchResult searchResult, RetrieveOptions retrieveOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long retrieve(RequestOptions requestOptions, SearchResult searchResult, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long retrieveBucket(RequestOptions requestOptions, List<SearchResult> list, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long retrieveDetails(String str, DetailsOptions detailsOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long retrieveMultipleDetails(List<String> list, DetailsOptions detailsOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long reverseGeocoding(ReverseGeoOptions reverseGeoOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void reverseGeocodingOffline(ReverseGeoOptions reverseGeoOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native long search(String str, List<String> list, SearchOptions searchOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void searchOffline(String str, List<String> list, SearchOptions searchOptions, SearchCallback searchCallback);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void selectTileset(String str, String str2);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void sendFeedback(FeedbackProperties feedbackProperties, SearchResponse searchResponse, SearchResult searchResult);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void setTileStore(TileStore tileStore);

    @Override // com.mapbox.search.internal.bindgen.SearchEngineInterface
    public native void setTileStore(TileStore tileStore, VoidCallback voidCallback);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SearchEngine(EngineOptions engineOptions, LocationProvider locationProvider) {
        initialize(engineOptions, locationProvider);
    }

    public SearchEngine(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SearchEnginePeerCleaner(j));
    }
}
