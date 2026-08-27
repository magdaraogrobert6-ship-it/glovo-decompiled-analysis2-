package fwfd.com.fwfsdk.model.db;

import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.model.api.FWFExplanation;
import fwfd.com.fwfsdk.model.api.FWFPut;
import fwfd.com.fwfsdk.model.api.FWFTrackInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FWFFeature {
    private boolean abTest;
    private String accessToken;
    private long date;
    private FWFExplanation explanation;
    private Map<String, Boolean> holdoutsEvaluations;
    private String key;
    private String relevantContext;
    private int subscribe;
    private FWFTrackInfo trackInfo;
    private Object variation;

    public boolean getAbTest() {
        return this.abTest;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getDate() {
        return this.date;
    }

    public FWFExplanation getExplanation() {
        return this.explanation;
    }

    public Map<String, Boolean> getHoldoutsEvaluations() {
        return this.holdoutsEvaluations;
    }

    public String getKey() {
        return this.key;
    }

    public String getRelevantContext() {
        return this.relevantContext;
    }

    public int getSubscribe() {
        return this.subscribe;
    }

    public FWFTrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    public Object getVariation() {
        return this.variation;
    }

    public void setAbTest(boolean z) {
        this.abTest = z;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setExplanation(FWFExplanation fWFExplanation) {
        this.explanation = fWFExplanation;
    }

    public void setHoldoutsEvaluations(Map<String, Boolean> map) {
        this.holdoutsEvaluations = map;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRelevantContext(String str) {
        this.relevantContext = str;
    }

    public void setSubscribe(int i) {
        this.subscribe = i;
    }

    public void setTrackInfo(FWFTrackInfo fWFTrackInfo) {
        this.trackInfo = fWFTrackInfo;
    }

    public void setVariation(Object obj) {
        this.variation = obj;
    }

    public FWFResult toFWFResult() {
        return new FWFResult(this.variation, this.abTest, this.explanation, this.trackInfo, this.holdoutsEvaluations);
    }

    public FWFFeature(String str, FWFPut fWFPut, int i, String str2) {
        this.key = str;
        this.variation = fWFPut.getVariation();
        this.abTest = fWFPut.getAbtest();
        this.accessToken = str2;
        this.trackInfo = fWFPut.getTrackInfo();
        this.relevantContext = fWFPut.getRelevantContext();
        this.explanation = fWFPut.getExplanation();
        this.date = System.currentTimeMillis();
        this.holdoutsEvaluations = fWFPut.getHoldoutsEvaluations();
        this.subscribe = i;
    }

    public boolean equals(Object obj) {
        return getKey().equals(((FWFFeature) obj).getKey());
    }

    public boolean requiresUpdate() {
        return Math.abs(System.currentTimeMillis() - this.date) / 60000 > FunWithFlags.getInstance().getFeatureExpirationTime().longValue() / 60;
    }

    public FWFFeature() {
    }

    public FWFFeature(String str, FWFPut fWFPut, String str2) {
        this.key = str;
        this.variation = fWFPut.getVariation();
        this.abTest = fWFPut.getAbtest();
        this.accessToken = str2;
        this.trackInfo = fWFPut.getTrackInfo();
        this.relevantContext = fWFPut.getRelevantContext();
        this.explanation = fWFPut.getExplanation();
        this.date = System.currentTimeMillis();
        this.holdoutsEvaluations = fWFPut.getHoldoutsEvaluations();
    }
}
