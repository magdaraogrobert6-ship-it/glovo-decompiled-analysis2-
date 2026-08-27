package fwfd.com.fwfsdk.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FWFExplanation {
    private String error;

    @SerializedName("evalAttrs")
    @Expose
    private List<String> evaluatedAttributes;

    @SerializedName("evalFlags")
    @Expose
    private List<String> evaluatedFlags;

    @SerializedName(RemoteMessageConst.FROM)
    @Expose
    private String from;

    @SerializedName(FWFConstants.EXPLANATION_TYPE_KIND)
    @Expose
    private String kind;

    @SerializedName("ruleIdx")
    @Expose
    private String ruleIndex;

    public String getError() {
        return this.error;
    }

    public List<String> getEvaluatedAttributes() {
        return this.evaluatedAttributes;
    }

    public List<String> getEvaluatedFlags() {
        return this.evaluatedFlags;
    }

    public String getFrom() {
        return this.from;
    }

    public String getKind() {
        return this.kind;
    }

    public String getRuleIndex() {
        return this.ruleIndex;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setEvaluatedAttributes(List<String> list) {
        this.evaluatedAttributes = list;
    }

    public void setEvaluatedFlags(List<String> list) {
        this.evaluatedFlags = list;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setRuleIndex(String str) {
        this.ruleIndex = str;
    }
}
