package fwfd.com.fwfsdk.model.db;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.model.api.FWFExplanation;
import fwfd.com.fwfsdk.model.api.FWFTrackInfo;
import fwfd.com.fwfsdk.util.FWFGson;
import fwfd.com.fwfsdk.util.FWFHelper;
import fwfd.com.fwfsdk.util.FWFLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FWFResult {
    public boolean abtest;
    private FWFExplanation explanation;
    private Map<String, Boolean> holdoutsEvaluations;
    private FWFResultTrackInfo trackInfo;
    public Object variation;

    public Map<String, Boolean> getHoldoutsEvaluations() {
        return this.holdoutsEvaluations;
    }

    public FWFResultTrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    public Object getVariation() {
        return this.variation;
    }

    public boolean isNullVariation() {
        return this.variation == null;
    }

    public void setAbtest(boolean z) {
        this.abtest = z;
    }

    public void setExplanation(FWFExplanation fWFExplanation) {
        this.explanation = fWFExplanation;
    }

    public void setTrackInfo(FWFResultTrackInfo fWFResultTrackInfo) {
        this.trackInfo = fWFResultTrackInfo;
    }

    public void setVariation(Object obj) {
        this.variation = obj;
    }

    public Boolean getBooleanVariation() {
        Object obj = this.variation;
        if (!(obj instanceof Boolean)) {
            return null;
        }
        try {
            return (Boolean) obj;
        } catch (ClassCastException unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public JsonObject getExplanation() {
        JsonObject jsonObject = new JsonObject();
        if (this.explanation != null) {
            try {
                return FWFGson.getInstance().toJsonTree(this.explanation).getAsJsonObject();
            } catch (Exception unused) {
                FWFLogger.logError("FWFFeature - Cannot create json from explanation");
                jsonObject.addProperty(FWFConstants.EXPLANATION_TYPE_ERROR, "FWFFeature - Cannot create json from explanation");
            }
        }
        return jsonObject;
    }

    public String getExplanationKind() {
        return this.explanation.getKind();
    }

    public Float getFloatVariation() {
        Object obj = this.variation;
        if (!(obj instanceof Number)) {
            return null;
        }
        try {
            return Float.valueOf(((Double) obj).floatValue());
        } catch (ClassCastException unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public Integer getIntegerVariation() {
        Object obj = this.variation;
        if (!(obj instanceof Number)) {
            return null;
        }
        try {
            return Integer.valueOf(((Double) obj).intValue());
        } catch (ClassCastException unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public JsonArray getJsonArrayVariation() {
        try {
            Object obj = this.variation;
            return (JsonArray) FWFGson.getInstance().fromJson(obj instanceof List ? FWFGson.getInstance().toJson(this.variation) : obj.toString(), JsonArray.class);
        } catch (Exception unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public JsonObject getJsonVariation() {
        try {
            Object obj = this.variation;
            return (JsonObject) FWFGson.getInstance().fromJson(((obj instanceof LinkedTreeMap) || (obj instanceof LinkedHashMap)) ? FWFGson.getInstance().toJson(this.variation) : obj.toString(), JsonObject.class);
        } catch (Exception unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public String getStringVariation() {
        Object obj = this.variation;
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            FWFLogger.logError(FWFHelper.ERROR_VARIATION_CAST);
            return null;
        }
    }

    public List<String> getTrackerServices() {
        FWFResultTrackInfo fWFResultTrackInfo = this.trackInfo;
        return (fWFResultTrackInfo == null || fWFResultTrackInfo.getTrackerServices() == null) ? new ArrayList() : this.trackInfo.getTrackerServices();
    }

    public String toString() {
        return "\nvariation=" + this.variation + "\nabtest=" + this.abtest + "\nexplanation=" + this.explanation + "\ntrackInfo=" + this.trackInfo;
    }

    public FWFResult(Object obj, String str, String str2, FWFTrackInfo fWFTrackInfo) {
        FWFExplanation fWFExplanation = new FWFExplanation();
        this.explanation = fWFExplanation;
        fWFExplanation.setError(str);
        this.explanation.setKind(str2);
        this.variation = obj;
        this.abtest = false;
        if (fWFTrackInfo != null) {
            this.trackInfo = new FWFResultTrackInfo(fWFTrackInfo.getVariationName(), fWFTrackInfo.getFlagType(), fWFTrackInfo.getFlagEnabled(), fWFTrackInfo.getTrackerServices());
        }
    }

    public Boolean getAbtest() {
        return Boolean.valueOf(this.abtest);
    }

    public FWFResult(Object obj, boolean z, FWFExplanation fWFExplanation, FWFTrackInfo fWFTrackInfo, Map<String, Boolean> map) {
        this.variation = obj;
        this.abtest = z;
        this.explanation = fWFExplanation;
        if (fWFTrackInfo != null) {
            this.trackInfo = new FWFResultTrackInfo(fWFTrackInfo.getVariationName(), fWFTrackInfo.getFlagType(), fWFTrackInfo.getFlagEnabled(), fWFTrackInfo.getTrackerServices());
        }
        this.holdoutsEvaluations = map;
    }

    public FWFResult(Object obj, String str, String str2) {
        FWFExplanation fWFExplanation = new FWFExplanation();
        this.explanation = fWFExplanation;
        fWFExplanation.setError(str);
        this.explanation.setKind(str2);
        this.variation = obj;
        this.abtest = false;
    }

    public FWFResult() {
    }
}
