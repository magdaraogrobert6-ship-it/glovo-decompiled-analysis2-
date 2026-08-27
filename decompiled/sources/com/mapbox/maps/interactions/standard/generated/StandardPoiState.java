package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPoiState extends FeatureState {
    private final Value internalState;

    public static /* synthetic */ void getHide$annotations() {
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }

    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardPoiState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardPoiState. Is this intended?");
            }
            return new StandardPoiState(new Value(getRawStateMap()));
        }

        public final Builder hide(boolean z) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(z);
            valueValueOf.getClass();
            rawStateMap.put("hide", valueValueOf);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPoiState(Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }

    public final Boolean getHide() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("hide");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }
}
