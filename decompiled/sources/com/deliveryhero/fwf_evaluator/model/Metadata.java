package com.deliveryhero.fwf_evaluator.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata {
    private final Boolean featureEnabled;
    private final String featureKind;
    private final Long featureVersion;

    public final String component1() {
        return this.featureKind;
    }

    public final Boolean component2() {
        return this.featureEnabled;
    }

    public final Long component3() {
        return this.featureVersion;
    }

    public final Boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public final String getFeatureKind() {
        return this.featureKind;
    }

    public final Long getFeatureVersion() {
        return this.featureVersion;
    }

    public final Metadata copy(String str, Boolean bool, Long l) {
        return new Metadata(str, bool, l);
    }

    public String toString() {
        return "Metadata(featureKind=" + this.featureKind + ", featureEnabled=" + this.featureEnabled + ", featureVersion=" + this.featureVersion + ")";
    }

    public /* synthetic */ Metadata(String str, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? -1L : l);
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.featureKind;
        }
        if ((i & 2) != 0) {
            bool = metadata.featureEnabled;
        }
        if ((i & 4) != 0) {
            l = metadata.featureVersion;
        }
        return metadata.copy(str, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureKind, metadata.featureKind}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureEnabled, metadata.featureEnabled}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureVersion, metadata.featureVersion}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        String str = this.featureKind;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.featureEnabled;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Long l = this.featureVersion;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l != null ? l.hashCode() : 0);
    }

    public Metadata(String str, Boolean bool, Long l) {
        this.featureKind = str;
        this.featureEnabled = bool;
        this.featureVersion = l;
    }

    public Metadata() {
        this(null, null, null, 7, null);
    }
}
