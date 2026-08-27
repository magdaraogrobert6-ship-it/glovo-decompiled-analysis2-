package com.mapbox.navigation.base.internal.route.operations;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OptionallyRefreshedData {

    public final class NoUpdates extends OptionallyRefreshedData {
        @Override // com.mapbox.navigation.base.internal.route.operations.OptionallyRefreshedData
        public final Object update(Object obj) {
            return obj;
        }
    }

    public abstract Object update(Object obj);

    public final class Updated extends OptionallyRefreshedData {
        public final Object newValue;

        @Override // com.mapbox.navigation.base.internal.route.operations.OptionallyRefreshedData
        public final Object update(Object obj) {
            return this.newValue;
        }

        public Updated(Object obj) {
            this.newValue = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Updated)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newValue, ((Updated) obj).newValue}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("Updated(newValue="), this.newValue, ')');
        }

        public final int hashCode() {
            Object obj = this.newValue;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }
    }
}
