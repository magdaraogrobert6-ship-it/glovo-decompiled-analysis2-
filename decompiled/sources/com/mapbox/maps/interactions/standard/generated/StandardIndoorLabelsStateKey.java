package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardIndoorLabelsStateKey extends FeatureStateKey<StandardIndoorLabelsState> {
    public static final Companion Companion = new Companion(null);
    private static final StandardIndoorLabelsStateKey HIGHLIGHT = new StandardIndoorLabelsStateKey("highlight");
    private static final StandardIndoorLabelsStateKey SELECT = new StandardIndoorLabelsStateKey("select");

    public /* synthetic */ StandardIndoorLabelsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StandardIndoorLabelsStateKey getHIGHLIGHT() {
            return StandardIndoorLabelsStateKey.HIGHLIGHT;
        }

        public final StandardIndoorLabelsStateKey getSELECT() {
            return StandardIndoorLabelsStateKey.SELECT;
        }

        private Companion() {
        }

        @MapboxDelicateApi
        public final StandardIndoorLabelsStateKey create(String str) {
            str.getClass();
            return new StandardIndoorLabelsStateKey(str, null);
        }
    }

    private StandardIndoorLabelsStateKey(String str) {
        super(str);
    }
}
