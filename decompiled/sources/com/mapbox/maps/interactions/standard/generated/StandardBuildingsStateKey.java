package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardBuildingsStateKey extends FeatureStateKey<StandardBuildingsState> {
    public static final Companion Companion = new Companion(null);
    private static final StandardBuildingsStateKey HIGHLIGHT = new StandardBuildingsStateKey("highlight");
    private static final StandardBuildingsStateKey SELECT = new StandardBuildingsStateKey("select");

    public /* synthetic */ StandardBuildingsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StandardBuildingsStateKey getHIGHLIGHT() {
            return StandardBuildingsStateKey.HIGHLIGHT;
        }

        public final StandardBuildingsStateKey getSELECT() {
            return StandardBuildingsStateKey.SELECT;
        }

        private Companion() {
        }

        @MapboxDelicateApi
        public final StandardBuildingsStateKey create(String str) {
            str.getClass();
            return new StandardBuildingsStateKey(str, null);
        }
    }

    private StandardBuildingsStateKey(String str) {
        super(str);
    }
}
