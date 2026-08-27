package com.mapbox.search.internal.bindgen;

import com.mapbox.common.TileStore;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SearchEngineInterface {
    void addOfflineIndexObserver(OfflineIndexObserver offlineIndexObserver);

    void addUserLayer(UserRecordsLayer userRecordsLayer);

    long brandSearch(BrandSearchOptions brandSearchOptions, SearchCallback searchCallback);

    void cancel(long j);

    long forward(String str, SearchOptions searchOptions, SearchCallback searchCallback);

    void getAddressesOffline(String str, Point point, double d, SearchCallback searchCallback);

    void getEvChargePointOperators(ChargePointOperatorsCallback chargePointOperatorsCallback);

    long listCategories(CategoryOptions categoryOptions, CategoriesCallback categoriesCallback);

    void makeFeedbackEvent(RequestOptions requestOptions, SearchResult searchResult, FeedbackEventCallback feedbackEventCallback);

    void onSelected(RequestOptions requestOptions, SearchResult searchResult);

    void removeOfflineIndexObserver(OfflineIndexObserver offlineIndexObserver);

    void removeUserLayer(UserRecordsLayer userRecordsLayer);

    long retrieve(RequestOptions requestOptions, SearchResult searchResult, RetrieveOptions retrieveOptions, SearchCallback searchCallback);

    long retrieve(RequestOptions requestOptions, SearchResult searchResult, SearchCallback searchCallback);

    long retrieveBucket(RequestOptions requestOptions, List<SearchResult> list, SearchCallback searchCallback);

    long retrieveDetails(String str, DetailsOptions detailsOptions, SearchCallback searchCallback);

    long retrieveMultipleDetails(List<String> list, DetailsOptions detailsOptions, SearchCallback searchCallback);

    long reverseGeocoding(ReverseGeoOptions reverseGeoOptions, SearchCallback searchCallback);

    void reverseGeocodingOffline(ReverseGeoOptions reverseGeoOptions, SearchCallback searchCallback);

    long search(String str, List<String> list, SearchOptions searchOptions, SearchCallback searchCallback);

    void searchOffline(String str, List<String> list, SearchOptions searchOptions, SearchCallback searchCallback);

    void selectTileset(String str, String str2);

    void sendFeedback(FeedbackProperties feedbackProperties, SearchResponse searchResponse, SearchResult searchResult);

    void setTileStore(TileStore tileStore);

    void setTileStore(TileStore tileStore, VoidCallback voidCallback);
}
