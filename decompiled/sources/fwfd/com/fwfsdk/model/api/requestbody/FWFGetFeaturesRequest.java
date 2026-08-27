package fwfd.com.fwfsdk.model.api.requestbody;

import fwfd.com.fwfsdk.model.db.FWFUserAttributes;

/* JADX INFO: loaded from: classes5.dex */
public class FWFGetFeaturesRequest extends FWFGetFlagRequest {
    private String[] featureList;

    public String[] getFeatureList() {
        return this.featureList;
    }

    public FWFGetFeaturesRequest(FWFUserAttributes fWFUserAttributes, String[] strArr) {
        super(fWFUserAttributes);
        this.featureList = strArr;
    }
}
