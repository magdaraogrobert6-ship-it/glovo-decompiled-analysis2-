package fwfd.com.fwfsdk.model.api;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import com.google.gson.annotations.SerializedName;
import fwfd.com.fwfsdk.model.db.FWFFlagKey;

/* JADX INFO: loaded from: classes5.dex */
public class FlagKey {

    @SerializedName(FeatureFlag.ENABLED)
    private Boolean isEnabled;
    private String key;
    private String kind;

    public String getKey() {
        return this.key;
    }

    public String getKind() {
        return this.kind;
    }

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    public FWFFlagKey toFWFFlagKey(String str) {
        return new FWFFlagKey(this.key, str, this.kind, this.isEnabled, Long.valueOf(System.currentTimeMillis()));
    }

    public FlagKey(String str, String str2, Boolean bool) {
        this.key = str;
        this.kind = str2;
        this.isEnabled = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlagKey{key='");
        sb.append(this.key);
        sb.append("', kind='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.kind, "'}");
    }

    public FlagKey() {
    }
}
