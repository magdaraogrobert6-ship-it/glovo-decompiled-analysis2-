package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigurationOptions implements Serializable {
    private final Value data;
    private final String digest;
    private final ConfigurationOptionsSource source;

    public Value getData() {
        return this.data;
    }

    public String getDigest() {
        return this.digest;
    }

    public ConfigurationOptionsSource getSource() {
        return this.source;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.data, this.digest, this.source);
    }

    public ConfigurationOptions(Value value, String str, ConfigurationOptionsSource configurationOptionsSource) {
        this.data = value;
        this.digest = str;
        this.source = configurationOptionsSource;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", digest: ");
        IconCompatParcelizer.read(sb, this.digest, ", source: ");
        sb.append(RecordUtils.fieldToString(this.source));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationOptions configurationOptions = (ConfigurationOptions) obj;
        return Objects.equals(this.data, configurationOptions.data) && Objects.equals(this.digest, configurationOptions.digest) && Objects.equals(this.source, configurationOptions.source);
    }
}
