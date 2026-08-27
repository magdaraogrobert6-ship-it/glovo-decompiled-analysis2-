package com.huawei.location.nlp.network.request;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.nlp.network.response.Location;

/* JADX INFO: loaded from: classes4.dex */
public class GPSLocationOnline extends Location {
    private int sourceType;

    public int getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    @Override // com.huawei.location.nlp.network.response.Location
    public String toString() {
        StringBuilder sb = new StringBuilder("GPSLocationOnline{");
        sb.append(super.toString());
        sb.append("sourceType=");
        return af$$ExternalSyntheticOutline0.m(sb, this.sourceType, '}');
    }
}
