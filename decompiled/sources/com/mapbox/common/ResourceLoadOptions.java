package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoadOptions implements Serializable {
    private final Value extraOptions;
    private final ResourceLoadFlags flags;
    private final NetworkRestriction networkRestriction;
    private final String tag;

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public ResourceLoadFlags getFlags() {
        return this.flags;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public String getTag() {
        return this.tag;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.tag, this.flags, this.networkRestriction, this.extraOptions);
    }

    public ResourceLoadOptions(String str, Value value) {
        this.tag = str;
        this.extraOptions = value;
        this.flags = ResourceLoadFlags.NONE;
        this.networkRestriction = NetworkRestriction.NONE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[tag: ");
        IconCompatParcelizer.read(sb, this.tag, ", flags: ");
        sb.append(RecordUtils.fieldToString(this.flags));
        sb.append(", networkRestriction: ");
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", extraOptions: ");
        sb.append(RecordUtils.fieldToString(this.extraOptions));
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
        ResourceLoadOptions resourceLoadOptions = (ResourceLoadOptions) obj;
        return Objects.equals(this.tag, resourceLoadOptions.tag) && Objects.equals(this.flags, resourceLoadOptions.flags) && Objects.equals(this.networkRestriction, resourceLoadOptions.networkRestriction) && Objects.equals(this.extraOptions, resourceLoadOptions.extraOptions);
    }

    public ResourceLoadOptions(String str, ResourceLoadFlags resourceLoadFlags, NetworkRestriction networkRestriction, Value value) {
        this.tag = str;
        this.flags = resourceLoadFlags;
        this.networkRestriction = networkRestriction;
        this.extraOptions = value;
    }
}
