package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardLandmarkIconsStateKey extends FeatureStateKey<StandardLandmarkIconsState> {
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ StandardLandmarkIconsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @MapboxDelicateApi
        public final StandardLandmarkIconsStateKey create(String str) {
            str.getClass();
            return new StandardLandmarkIconsStateKey(str, null);
        }
    }

    private StandardLandmarkIconsStateKey(String str) {
        super(str);
    }
}
