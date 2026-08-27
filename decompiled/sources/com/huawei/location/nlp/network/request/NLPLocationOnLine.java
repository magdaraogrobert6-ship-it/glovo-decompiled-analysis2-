package com.huawei.location.nlp.network.request;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.nlp.network.response.Location;

/* JADX INFO: loaded from: classes5.dex */
public class NLPLocationOnLine extends Location {
    private int source;
    private int technology;

    public int getSource() {
        return this.source;
    }

    public int getTechnology() {
        return this.technology;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTechnology(int i) {
        this.technology = i;
    }

    @Override // com.huawei.location.nlp.network.response.Location
    public String toString() {
        StringBuilder sb = new StringBuilder("NLPLocationOnLine{");
        sb.append(super.toString());
        sb.append("source=");
        sb.append(this.source);
        sb.append(", technology=");
        return af$$ExternalSyntheticOutline0.m(sb, this.technology, '}');
    }
}
