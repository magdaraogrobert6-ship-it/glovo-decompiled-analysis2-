package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPlaceLabelsStateKey extends FeatureStateKey<StandardPlaceLabelsState> {
    public static final Companion Companion = new Companion(null);
    private static final StandardPlaceLabelsStateKey HIDE = new StandardPlaceLabelsStateKey("hide");
    private static final StandardPlaceLabelsStateKey HIGHLIGHT = new StandardPlaceLabelsStateKey("highlight");
    private static final StandardPlaceLabelsStateKey SELECT = new StandardPlaceLabelsStateKey("select");

    public /* synthetic */ StandardPlaceLabelsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StandardPlaceLabelsStateKey getHIDE() {
            return StandardPlaceLabelsStateKey.HIDE;
        }

        public final StandardPlaceLabelsStateKey getHIGHLIGHT() {
            return StandardPlaceLabelsStateKey.HIGHLIGHT;
        }

        public final StandardPlaceLabelsStateKey getSELECT() {
            return StandardPlaceLabelsStateKey.SELECT;
        }

        private Companion() {
        }

        @MapboxDelicateApi
        public final StandardPlaceLabelsStateKey create(String str) {
            str.getClass();
            return new StandardPlaceLabelsStateKey(str, null);
        }
    }

    private StandardPlaceLabelsStateKey(String str) {
        super(str);
    }
}
