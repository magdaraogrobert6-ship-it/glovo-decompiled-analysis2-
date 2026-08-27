package fwfd.com.fwfsdk.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FWFTrackInfo {

    @SerializedName("flagEnabled")
    @Expose
    private Boolean flagEnabled;

    @SerializedName("flagType")
    @Expose
    private String flagType;
    private List<String> trackerServices;

    @SerializedName("variationName")
    @Expose
    private Object variationName;

    public Boolean getFlagEnabled() {
        return this.flagEnabled;
    }

    public String getFlagType() {
        return this.flagType;
    }

    public List<String> getTrackerServices() {
        return this.trackerServices;
    }

    public Object getVariationName() {
        return this.variationName;
    }

    public void setFlagEnabled(Boolean bool) {
        this.flagEnabled = bool;
    }

    public void setFlagType(String str) {
        this.flagType = str;
    }

    public void setTrackerServices(List<String> list) {
        this.trackerServices = list;
    }

    public void setVariationName(Object obj) {
        this.variationName = obj;
    }
}
