package com.mapbox.maps.interactions;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public class FeatureState {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FeatureState";
    private final Value internalState;

    /* JADX INFO: loaded from: classes4.dex */
    public static class Builder {
        private final HashMap<String, Value> rawStateMap = new HashMap<>();

        public final HashMap<String, Value> getRawStateMap() {
            return this.rawStateMap;
        }

        public FeatureState build() {
            if (this.rawStateMap.isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty FeatureState. Is this intended?");
            }
            return new FeatureState(new Value(this.rawStateMap));
        }

        public final Builder addBooleanState(String str, boolean z) {
            str.getClass();
            HashMap<String, Value> map = this.rawStateMap;
            Value valueValueOf = Value.valueOf(z);
            valueValueOf.getClass();
            map.put(str, valueValueOf);
            return this;
        }

        public final Builder addDoubleState(String str, double d) {
            str.getClass();
            HashMap<String, Value> map = this.rawStateMap;
            Value valueValueOf = Value.valueOf(d);
            valueValueOf.getClass();
            map.put(str, valueValueOf);
            return this;
        }

        public final Builder addLongState(String str, long j) {
            str.getClass();
            HashMap<String, Value> map = this.rawStateMap;
            Value valueValueOf = Value.valueOf(j);
            valueValueOf.getClass();
            map.put(str, valueValueOf);
            return this;
        }

        public final Builder addStringState(String str, String str2) {
            str.getClass();
            str2.getClass();
            HashMap<String, Value> map = this.rawStateMap;
            Value valueValueOf = Value.valueOf(str2);
            valueValueOf.getClass();
            map.put(str, valueValueOf);
            return this;
        }
    }

    public Value getInternalState() {
        return this.internalState;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FeatureState(Value value) {
        value.getClass();
        this.internalState = value;
    }

    public final Boolean getBooleanState(String str) {
        str.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(str);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    public final Double getDoubleState(String str) {
        str.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(str);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Double) {
            return (Double) contents2;
        }
        return null;
    }

    public final Long getLongState(String str) {
        str.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(str);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Long) {
            return (Long) contents2;
        }
        return null;
    }

    public final String getStringState(String str) {
        str.getClass();
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get(str);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof String) {
            return (String) contents2;
        }
        return null;
    }

    public final String asJsonString() {
        String json = getInternalState().toJson();
        json.getClass();
        return json;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getInternalState(), ((FeatureState) obj).getInternalState()}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        return Objects.hash(getInternalState());
    }

    public String toString() {
        return "FeatureStateValue(state=" + getInternalState().toJson() + ')';
    }
}
