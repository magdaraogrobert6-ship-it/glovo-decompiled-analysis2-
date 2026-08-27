package com.mapbox.maps;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes2.dex */
public final class ClickInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MapInteraction featureset(final String str, final String str2, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return new ClickInteraction(new FeaturesetDescriptor(str, str2, null), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.ClickInteraction$Companion$featureset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                    feature.getClass();
                    value2.getClass();
                    return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Featureset(str, str2), new FeatureState(value2), feature);
                }
            });
        }

        public final MapInteraction layer(final String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return new ClickInteraction(new FeaturesetDescriptor(null, null, str), value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.mapbox.maps.ClickInteraction$Companion$layer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value value2) {
                    feature.getClass();
                    value2.getClass();
                    return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Layer(str), new FeatureState(value2), feature);
                }
            });
        }

        private Companion() {
        }

        public final ClickInteraction map(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            return new ClickInteraction(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
            if ((i & 2) != 0) {
                value = null;
            }
            if ((i & 4) != 0) {
                d = null;
            }
            return companion.layer(str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
            return companion.featureset(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : value, (i & 8) != 0 ? null : d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        public final MapInteraction layer(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return layer$default(this, str, null, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, null);
        }

        public final MapInteraction layer(String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return layer$default(this, str, value, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 4, null);
        }

        public final MapInteraction featureset(String str, String str2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return featureset$default(this, str, str2, null, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 12, null);
        }

        public final MapInteraction featureset(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return featureset$default(this, str, null, null, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 14, null);
        }

        public final MapInteraction featureset(String str, String str2, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            str.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            return featureset$default(this, str, str2, value, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 8, null);
        }
    }

    public static final MapInteraction layer(String str, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.layer(str, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final ClickInteraction map(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return Companion.map(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public ClickInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        featuresetDescriptor.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        this.coreInteraction = new Interaction(featuresetDescriptor, value, InteractionType.CLICK, new InteractionHandler() { // from class: com.mapbox.maps.ClickInteraction.1
            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext interactionContext) {
                interactionContext.getClass();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext interactionContext) {
                interactionContext.getClass();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext) {
                Feature feature;
                interactionContext.getClass();
                if (((queriedFeature == null || (feature = queriedFeature.getFeature()) == null) ? null : feature.geometry()) == null) {
                    return false;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                Feature feature2 = queriedFeature.getFeature();
                feature2.getClass();
                FeaturesetFeatureId featuresetFeatureId = queriedFeature.getFeaturesetFeatureId();
                Value state = queriedFeature.getState();
                state.getClass();
                return ((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(feature2, featuresetFeatureId, state), interactionContext)).booleanValue();
            }
        }, d);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.featureset(str, str2, value, d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction layer(String str, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.layer(str, value, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction layer(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.layer(str, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.featureset(str, str2, value, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction featureset(String str, String str2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.featureset(str, str2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final MapInteraction featureset(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return Companion.featureset(str, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public /* synthetic */ ClickInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(featuresetDescriptor, (i & 2) != 0 ? null : value, (i & 4) != 0 ? null : d, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public /* synthetic */ ClickInteraction(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    private ClickInteraction(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.coreInteraction = new Interaction(null, null, InteractionType.CLICK, new InteractionHandler() { // from class: com.mapbox.maps.ClickInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext interactionContext) {
                interactionContext.getClass();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext interactionContext) {
                interactionContext.getClass();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext) {
                interactionContext.getClass();
                return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(interactionContext)).booleanValue();
            }
        }, null);
    }
}
