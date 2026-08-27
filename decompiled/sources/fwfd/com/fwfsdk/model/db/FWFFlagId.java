package fwfd.com.fwfsdk.model.db;

import fwfd.com.fwfsdk.FunWithFlags;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class FWFFlagId {
    private String accessToken;
    private Long date;
    private String key;

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getDate() {
        return this.date;
    }

    public String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.accessToken);
    }

    public FWFFlagId(String str, String str2, Long l) {
        this.key = str;
        this.accessToken = str2;
        this.date = l;
    }

    public Boolean requiresUpdate() {
        return Boolean.valueOf(Math.abs(System.currentTimeMillis() - this.date.longValue()) / 60000 > FunWithFlags.getInstance().getFeatureExpirationTime().longValue() / 60);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FWFFlagId fWFFlagId = (FWFFlagId) obj;
        return this.key.equals(fWFFlagId.key) && this.accessToken.equals(fWFFlagId.accessToken);
    }
}
