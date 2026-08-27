package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardLandmarkIconsState extends FeatureState {
    private final Value internalState;

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }

    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardLandmarkIconsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardLandmarkIconsState. Is this intended?");
            }
            return new StandardLandmarkIconsState(new Value(getRawStateMap()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardLandmarkIconsState(Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }
}
