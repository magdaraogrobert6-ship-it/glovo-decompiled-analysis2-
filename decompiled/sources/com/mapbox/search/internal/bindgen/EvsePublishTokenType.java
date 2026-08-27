package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class EvsePublishTokenType implements Serializable {
    private final String groupId;
    private final String issuer;
    private final EvseTokenType tokenType;
    private final String uid;
    private final String visualNumber;

    public String getGroupId() {
        return this.groupId;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public EvseTokenType getTokenType() {
        return this.tokenType;
    }

    public String getUid() {
        return this.uid;
    }

    public String getVisualNumber() {
        return this.visualNumber;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.uid, this.tokenType, this.visualNumber, this.issuer, this.groupId);
    }

    public EvsePublishTokenType(String str, EvseTokenType evseTokenType, String str2, String str3, String str4) {
        this.uid = str;
        this.tokenType = evseTokenType;
        this.visualNumber = str2;
        this.issuer = str3;
        this.groupId = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uid: ");
        IconCompatParcelizer.read(sb, this.uid, ", tokenType: ");
        sb.append(RecordUtils.fieldToString(this.tokenType));
        sb.append(", visualNumber: ");
        IconCompatParcelizer.read(sb, this.visualNumber, ", issuer: ");
        IconCompatParcelizer.read(sb, this.issuer, ", groupId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.groupId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvsePublishTokenType evsePublishTokenType = (EvsePublishTokenType) obj;
        return Objects.equals(this.uid, evsePublishTokenType.uid) && Objects.equals(this.tokenType, evsePublishTokenType.tokenType) && Objects.equals(this.visualNumber, evsePublishTokenType.visualNumber) && Objects.equals(this.issuer, evsePublishTokenType.issuer) && Objects.equals(this.groupId, evsePublishTokenType.groupId);
    }
}
