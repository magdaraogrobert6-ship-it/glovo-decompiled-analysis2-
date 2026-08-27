package com.mapbox.maps.interactions;

import com.mapbox.maps.interactions.FeatureState;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public class FeatureStateKey<FS extends FeatureState> {
    public static final Companion Companion = new Companion(null);
    private final String key;

    public final String getKey() {
        return this.key;
    }

    public static final FeatureStateKey<FeatureState> create(String str) {
        return Companion.create(str);
    }

    public int hashCode() {
        return Objects.hash(this.key);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FeatureStateKey<FeatureState> create(String str) {
            str.getClass();
            return new FeatureStateKey<>(str);
        }
    }

    public FeatureStateKey(String str) {
        str.getClass();
        this.key = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, ((FeatureStateKey) obj).key}, getCieXyz.write())).booleanValue();
    }
}
