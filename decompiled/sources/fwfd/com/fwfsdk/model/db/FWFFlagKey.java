package fwfd.com.fwfsdk.model.db;

import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.model.api.FlagKey;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class FWFFlagKey {
    private Long date;
    private Boolean enabled;
    private String key;
    private String kind;
    private String token;

    public Long getDate() {
        return this.date;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public String getKey() {
        return this.key;
    }

    public String getKind() {
        return this.kind;
    }

    public String getToken() {
        return this.token;
    }

    public FlagKey toFlagKey() {
        return new FlagKey(this.key, this.kind, this.enabled);
    }

    public FWFFlagKey(String str, String str2, String str3, Boolean bool, Long l) {
        this.key = str;
        this.token = str2;
        this.kind = str3;
        this.enabled = bool;
        this.date = l;
    }

    public Boolean isValid() {
        return Boolean.valueOf(this.date.longValue() + TimeUnit.SECONDS.toMillis(FunWithFlags.getInstance().getFlagKeysExpirationTime().longValue()) > System.currentTimeMillis());
    }
}
