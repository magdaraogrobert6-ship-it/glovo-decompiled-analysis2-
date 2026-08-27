package com.huawei.location.nlp.network.request;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RequestExtraInfo {
    int arStatus;
    List<CacheLocationOnline> cacheLocationList;
    List<IndoorLocation> indoorGlobalLocation;
    List<IndoorLocation> indoorLocalLocation;
    int isFilter;
    NLPLocationOnLine nlpLastLocation;

    public int getArStatus() {
        return this.arStatus;
    }

    public List<CacheLocationOnline> getCacheLocationList() {
        return this.cacheLocationList;
    }

    public List<IndoorLocation> getIndoorGlobalLocation() {
        return this.indoorGlobalLocation;
    }

    public List<IndoorLocation> getIndoorLocalLocation() {
        return this.indoorLocalLocation;
    }

    public int getIsFilter() {
        return this.isFilter;
    }

    public NLPLocationOnLine getNlpLastLocation() {
        return this.nlpLastLocation;
    }

    public void setArStatus(int i) {
        this.arStatus = i;
    }

    public void setCacheLocationList(List<CacheLocationOnline> list) {
        this.cacheLocationList = list;
    }

    public void setIndoorGlobalLocation(List<IndoorLocation> list) {
        this.indoorGlobalLocation = list;
    }

    public void setIndoorLocalLocation(List<IndoorLocation> list) {
        this.indoorLocalLocation = list;
    }

    public void setIsFilter(int i) {
        this.isFilter = i;
    }

    public void setNlpLastLocation(NLPLocationOnLine nLPLocationOnLine) {
        this.nlpLastLocation = nLPLocationOnLine;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestExtraInfo{nlpLastLocation=");
        sb.append(this.nlpLastLocation);
        sb.append(", cacheLocationList=");
        sb.append(this.cacheLocationList);
        sb.append(", indoorGlobalLocation=");
        sb.append(this.indoorGlobalLocation);
        sb.append(", indoorLocalLocation=");
        sb.append(this.indoorLocalLocation);
        sb.append(", arStatus=");
        sb.append(this.arStatus);
        sb.append(", isFilter=");
        return af$$ExternalSyntheticOutline0.m(sb, this.isFilter, '}');
    }
}
