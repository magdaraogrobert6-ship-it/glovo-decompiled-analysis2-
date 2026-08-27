package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@ExperimentalPreviewMapboxNavigationAPI
public final class SearchResults {
    private final String error;
    private final String provider;
    private final String request;
    private final String response;
    private final List<HistorySearchResult> results;
    private final String searchQuery;

    public final String getError() {
        return this.error;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getRequest() {
        return this.request;
    }

    public final String getResponse() {
        return this.response;
    }

    public final List<HistorySearchResult> getResults() {
        return this.results;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.provider.hashCode() * 31, 31, this.request);
        String str = this.response;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.error;
        int iM2 = af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.searchQuery);
        List<HistorySearchResult> list = this.results;
        return iM2 + (list != null ? list.hashCode() : 0);
    }

    public SearchResults(String str, String str2, String str3, String str4, String str5, List<HistorySearchResult> list) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str5);
        this.provider = str;
        this.request = str2;
        this.response = str3;
        this.error = str4;
        this.searchQuery = str5;
        this.results = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchResults(provider='");
        sb.append(this.provider);
        sb.append("', request='");
        sb.append(this.request);
        sb.append("', response=");
        sb.append(this.response);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", searchQuery='");
        sb.append(this.searchQuery);
        sb.append("', results=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.results, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchResults.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchResults searchResults = (SearchResults) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.provider, searchResults.provider}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, searchResults.request}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.response, searchResults.response}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, searchResults.error}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.searchQuery, searchResults.searchQuery}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.results, searchResults.results}, getCieXyz.write())).booleanValue();
    }
}
