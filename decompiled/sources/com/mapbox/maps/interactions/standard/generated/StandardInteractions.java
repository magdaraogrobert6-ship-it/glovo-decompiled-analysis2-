package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardInteractions {
    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardBuildings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardBuildingsFeature(featuresetFeatureId, str, feature, new StandardBuildingsState(value2));
            }
        });
    }

    public static final MapInteraction standardIndoorLabels(ClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardIndoorLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardIndoorLabels.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardIndoorLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardIndoorLabelsFeature(featuresetFeatureId, str, feature, new StandardIndoorLabelsState(value2));
            }
        });
    }

    public static final MapInteraction standardLandmarkIcons(ClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardLandmarkIcons.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardLandmarkIcons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardLandmarkIconsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardLandmarkIconsFeature(featuresetFeatureId, str, feature, new StandardLandmarkIconsState(value2));
            }
        });
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardPlaceLabels.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardPlaceLabelsFeature(featuresetFeatureId, str, feature, new StandardPlaceLabelsState(value2));
            }
        });
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new ClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardPoi.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardPoiFeature(featuresetFeatureId, str, feature, new StandardPoiState(value2));
            }
        });
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(ClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardBuildings(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardIndoorLabels$default(ClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardIndoorLabels(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardLandmarkIcons$default(ClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardLandmarkIcons(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(ClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardPlaceLabels(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardPoi$default(ClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardPoi(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(LongClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardBuildings(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardIndoorLabels$default(LongClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardIndoorLabels(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardLandmarkIcons$default(LongClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardLandmarkIcons(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(LongClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardPlaceLabels(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static /* synthetic */ MapInteraction standardPoi$default(LongClickInteraction.Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            value = null;
        }
        if ((i & 4) != 0) {
            d = null;
        }
        return standardPoi(companion, str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(ClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(ClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(ClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(ClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(LongClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(LongClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(LongClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(LongClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(LongClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(LongClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, str, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardBuildings$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardIndoorLabels(ClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardIndoorLabels$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardLandmarkIcons(ClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardLandmarkIcons$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPlaceLabels$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return standardPoi$default(companion, str, value, (Double) null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardBuildings.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardBuildingsFeature(featuresetFeatureId, str, feature, new StandardBuildingsState(value2));
            }
        });
    }

    public static final MapInteraction standardIndoorLabels(LongClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardIndoorLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardIndoorLabels.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardIndoorLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardIndoorLabelsFeature(featuresetFeatureId, str, feature, new StandardIndoorLabelsState(value2));
            }
        });
    }

    public static final MapInteraction standardLandmarkIcons(LongClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardLandmarkIcons.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardLandmarkIcons.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardLandmarkIconsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardLandmarkIconsFeature(featuresetFeatureId, str, feature, new StandardLandmarkIconsState(value2));
            }
        });
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardPlaceLabels.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardPlaceLabelsFeature(featuresetFeatureId, str, feature, new StandardPlaceLabelsState(value2));
            }
        });
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        companion.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.interactions.standard.generated.StandardInteractions.standardPoi.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                feature.getClass();
                value2.getClass();
                return new StandardPoiFeature(featuresetFeatureId, str, feature, new StandardPoiState(value2));
            }
        });
    }
}
