package com.mapbox.maps;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@com.mapbox.annotation.MapboxExperimental
public final class IndoorFloor implements Serializable {
    private final String id;
    private final String name;

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: loaded from: classes4.dex */
    @com.mapbox.annotation.MapboxExperimental
    public static final class Builder {
        private String id;
        private String name;

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public Builder(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.name = str2;
        }

        /* JADX INFO: renamed from: setId, reason: collision with other method in class */
        public final /* synthetic */ void m4681setId(String str) {
            str.getClass();
            this.id = str;
        }

        /* JADX INFO: renamed from: setName, reason: collision with other method in class */
        public final /* synthetic */ void m4682setName(String str) {
            str.getClass();
            this.name = str;
        }

        @com.mapbox.annotation.MapboxExperimental
        public final IndoorFloor build() {
            String str = this.id;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of IndoorFloor through IndoorFloor.Builder because id was null.");
                return null;
            }
            if (this.name == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of IndoorFloor through IndoorFloor.Builder because name was null.");
                return null;
            }
            str.getClass();
            String str2 = this.name;
            str2.getClass();
            return new IndoorFloor(str, str2, defaultConstructorMarker);
        }

        public final Builder setId(String str) {
            str.getClass();
            this.id = str;
            return this;
        }

        public final Builder setName(String str) {
            str.getClass();
            this.name = str;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Builder toBuilder() {
        return new Builder(this.id, this.name).setId(this.id).setName(this.name);
    }

    private IndoorFloor(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorFloor)) {
            return false;
        }
        IndoorFloor indoorFloor = (IndoorFloor) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, indoorFloor.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, indoorFloor.name}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorFloor(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.name, ')');
    }

    public /* synthetic */ IndoorFloor(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
