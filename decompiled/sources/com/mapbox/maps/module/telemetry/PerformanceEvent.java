package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint
public final class PerformanceEvent extends MapBaseEvent {
    public static final Companion Companion = new Companion(null);
    private static final String PERFORMANCE_TRACE = "mobile.performance_trace";

    @SerializedName("attributes")
    private final List<PerformanceAttribute<String>> attributes;

    @SerializedName("counters")
    private final List<PerformanceAttribute<Double>> counters;

    @SerializedName("metadata")
    private final JsonObject metadata;

    @SerializedName("sessionId")
    private final String sessionId;

    public final List<PerformanceAttribute<String>> getAttributes() {
        return this.attributes;
    }

    public final List<PerformanceAttribute<Double>> getCounters() {
        return this.counters;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public static final class PerformanceAttribute<T> {
        private final String name;
        private final T value;

        public PerformanceAttribute(String str, T t) {
            this.name = str;
            this.value = t;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = str != null ? str.hashCode() : 0;
            T t = this.value;
            return (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !PerformanceAttribute.class.equals(obj.getClass())) {
                return false;
            }
            PerformanceAttribute performanceAttribute = (PerformanceAttribute) obj;
            Object[] objArr = {this.name, performanceAttribute.name};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.value, performanceAttribute.value};
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
        }
    }

    private final <T> ArrayList<PerformanceAttribute<T>> initList(String str, TypeToken<?> typeToken) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        Object objFromJson = new Gson().fromJson(str, typeToken.getType());
        objFromJson.getClass();
        return (ArrayList) objFromJson;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    public String getEventName() {
        return PERFORMANCE_TRACE;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceEvent(PhoneState phoneState, String str, Bundle bundle) {
        super(phoneState);
        phoneState.getClass();
        bundle.getClass();
        this.sessionId = str;
        this.attributes = initList(bundle.getString("attributes"), new TypeToken<ArrayList<PerformanceAttribute<String>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.1
        });
        this.counters = initList(bundle.getString("counters"), new TypeToken<ArrayList<PerformanceAttribute<Double>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.2
        });
        this.metadata = initMetaData(bundle.getString("metadata"));
    }

    private final JsonObject initMetaData(String str) {
        if (str == null) {
            return new JsonObject();
        }
        Object objFromJson = new Gson().fromJson(str, (Class<Object>) JsonObject.class);
        objFromJson.getClass();
        return (JsonObject) objFromJson;
    }

    public String toString() {
        return "PerformanceEvent{sessionId='" + this.sessionId + "', attributes=" + this.attributes + ", counters=" + this.counters + ", metadata=" + this.metadata + '}';
    }

    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = getEvent().hashCode();
        int iHashCode3 = getCreated().hashCode();
        List<PerformanceAttribute<String>> list = this.attributes;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        List<PerformanceAttribute<Double>> list2 = this.counters;
        int iHashCode5 = list2 != null ? list2.hashCode() : 0;
        JsonObject jsonObject = this.metadata;
        return ((((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !PerformanceEvent.class.equals(obj.getClass())) {
            return false;
        }
        PerformanceEvent performanceEvent = (PerformanceEvent) obj;
        Object[] objArr = {getEvent(), performanceEvent.getEvent()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {getCreated(), performanceEvent.getCreated()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.sessionId, performanceEvent.sessionId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.attributes, performanceEvent.attributes};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.counters, performanceEvent.counters};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.metadata, performanceEvent.metadata};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue();
    }
}
