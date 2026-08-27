package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardIndoorLabelsState extends FeatureState {
    private final Value internalState;

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSelect$annotations() {
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }

    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardIndoorLabelsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardIndoorLabelsState. Is this intended?");
            }
            return new StandardIndoorLabelsState(new Value(getRawStateMap()));
        }

        public final Builder highlight(boolean z) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(z);
            valueValueOf.getClass();
            rawStateMap.put("highlight", valueValueOf);
            return this;
        }

        public final Builder select(boolean z) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(z);
            valueValueOf.getClass();
            rawStateMap.put("select", valueValueOf);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIndoorLabelsState(Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }

    public final Boolean getHighlight() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("highlight");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    public final Boolean getSelect() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("select");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }
}
