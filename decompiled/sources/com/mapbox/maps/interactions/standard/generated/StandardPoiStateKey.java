package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPoiStateKey extends FeatureStateKey<StandardPoiState> {
    public static final Companion Companion = new Companion(null);
    private static final StandardPoiStateKey HIDE = new StandardPoiStateKey("hide");

    public /* synthetic */ StandardPoiStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StandardPoiStateKey getHIDE() {
            return StandardPoiStateKey.HIDE;
        }

        private Companion() {
        }

        @MapboxDelicateApi
        public final StandardPoiStateKey create(String str) {
            str.getClass();
            return new StandardPoiStateKey(str, null);
        }
    }

    private StandardPoiStateKey(String str) {
        super(str);
    }
}
