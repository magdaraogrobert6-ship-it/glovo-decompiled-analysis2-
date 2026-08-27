package fwfd.com.fwfsdk.model.api;

import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.model.db.FWFResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FWFSubscribeResult {
    private FWFSubscribeCallbackExplanation explanation;
    private Map<String, FWFResult> flags;

    public FWFSubscribeCallbackExplanation getExplanation() {
        return this.explanation;
    }

    public Map<String, FWFResult> getFlags() {
        return this.flags;
    }

    public enum FWFSubscribeCallbackExplanation {
        SINGLE_FLAG_UPDATE(FWFConstants.EXPLANATION_SINGLE_FLAG_UPDATE),
        MULTI_FLAG_UPDATE(FWFConstants.EXPLANATION_MULTI_FLAG_UPDATE),
        BACKGROUND_UPDATE(FWFConstants.EXPLANATION_BACKGROUND_UPDATE);

        private String value;

        public String getValue() {
            return this.value;
        }

        FWFSubscribeCallbackExplanation(String str) {
            this.value = str;
        }
    }

    public FWFSubscribeResult(String str, FWFResult fWFResult, FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation) {
        this.explanation = fWFSubscribeCallbackExplanation;
        HashMap map = new HashMap();
        this.flags = map;
        map.put(str, fWFResult);
    }

    public FWFSubscribeResult(Map<String, FWFResult> map, FWFSubscribeCallbackExplanation fWFSubscribeCallbackExplanation) {
        this.flags = map;
        this.explanation = fWFSubscribeCallbackExplanation;
    }
}
