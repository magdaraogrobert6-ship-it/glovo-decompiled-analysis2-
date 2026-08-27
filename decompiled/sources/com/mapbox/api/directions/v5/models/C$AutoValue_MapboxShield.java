package com.mapbox.api.directions.v5.models;

import android.os.Process;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.annotations.SerializedName;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.util.Map;

/* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MapboxShield, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C$AutoValue_MapboxShield extends MapboxShield {
    public static int IconCompatParcelizer;
    public static int serializer;
    private final String baseUrl;
    private final String displayRef;
    private final String name;
    private final String textColor;
    private final Map<String, SerializableJsonElement> unrecognized;

    /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_MapboxShield$Builder */
    /* JADX INFO: loaded from: classes4.dex */
    public static class Builder extends MapboxShield.Builder {
        private String baseUrl;
        private String displayRef;
        private String name;
        private String textColor;
        private Map<String, SerializableJsonElement> unrecognized;

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
            return unrecognized((Map<String, SerializableJsonElement>) map);
        }

        @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
        public MapboxShield.Builder baseUrl(String str) {
            if (str != null) {
                this.baseUrl = str;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null baseUrl");
            return null;
        }

        @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
        public MapboxShield.Builder displayRef(String str) {
            if (str != null) {
                this.displayRef = str;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null displayRef");
            return null;
        }

        @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
        public MapboxShield.Builder name(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
            return null;
        }

        @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
        public MapboxShield.Builder textColor(String str) {
            if (str != null) {
                this.textColor = str;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null textColor");
            return null;
        }

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public MapboxShield.Builder unrecognized(Map<String, SerializableJsonElement> map) {
            this.unrecognized = map;
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.MapboxShield.Builder
        public MapboxShield build() {
            String strConcat = this.baseUrl == null ? " baseUrl" : "";
            if (this.name == null) {
                strConcat = strConcat.concat(" name");
            }
            if (this.textColor == null) {
                strConcat = strConcat.concat(" textColor");
            }
            if (this.displayRef == null) {
                strConcat = strConcat.concat(" displayRef");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_MapboxShield(this.unrecognized, this.baseUrl, this.name, this.textColor, this.displayRef);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    @Override // com.mapbox.api.directions.v5.models.MapboxShield
    @SerializedName("base_url")
    public String baseUrl() {
        return this.baseUrl;
    }

    @Override // com.mapbox.api.directions.v5.models.MapboxShield
    @SerializedName("display_ref")
    public String displayRef() {
        return this.displayRef;
    }

    @Override // com.mapbox.api.directions.v5.models.MapboxShield
    public String name() {
        return this.name;
    }

    @Override // com.mapbox.api.directions.v5.models.MapboxShield
    @SerializedName(InAppMessageBase.MESSAGE_TEXT_COLOR)
    public String textColor() {
        return this.textColor;
    }

    @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
    public Map<String, SerializableJsonElement> unrecognized() {
        return this.unrecognized;
    }

    public C$AutoValue_MapboxShield(Map<String, SerializableJsonElement> map, String str, String str2, String str3, String str4) {
        this.unrecognized = map;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null baseUrl");
            throw null;
        }
        this.baseUrl = str;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
            throw null;
        }
        this.name = str2;
        if (str3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null textColor");
            throw null;
        }
        this.textColor = str3;
        if (str4 != null) {
            this.displayRef = str4;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null displayRef");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapboxShield)) {
            return false;
        }
        MapboxShield mapboxShield = (MapboxShield) obj;
        Map<String, SerializableJsonElement> map = this.unrecognized;
        if (map == null) {
            if (mapboxShield.unrecognized() != null) {
                return false;
            }
        } else if (!map.equals(mapboxShield.unrecognized())) {
            return false;
        }
        return this.baseUrl.equals(mapboxShield.baseUrl()) && this.name.equals(mapboxShield.name()) && this.textColor.equals(mapboxShield.textColor()) && this.displayRef.equals(mapboxShield.displayRef());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MapboxShield{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", displayRef=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.displayRef, "}");
    }

    public int hashCode() {
        Map<String, SerializableJsonElement> map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        int iHashCode2 = this.baseUrl.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.displayRef.hashCode();
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 6609143;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMyUid = Process.myUid();
        serializer = iMyUid;
        return iMyUid;
    }
}
