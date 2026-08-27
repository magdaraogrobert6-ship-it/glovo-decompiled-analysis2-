package com.mapbox.maps;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@com.mapbox.annotation.MapboxExperimental
public final class IndoorState implements Serializable {
    private final List<IndoorFloor> floors;
    private final String selectedFloorId;

    @com.mapbox.annotation.MapboxExperimental
    public static /* synthetic */ void getFloors$annotations() {
    }

    public final List<IndoorFloor> getFloors() {
        return this.floors;
    }

    public final String getSelectedFloorId() {
        return this.selectedFloorId;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @com.mapbox.annotation.MapboxExperimental
    public static final class Builder {
        private List<IndoorFloor> floors;
        private String selectedFloorId;

        @com.mapbox.annotation.MapboxExperimental
        public static /* synthetic */ void getFloors$annotations() {
        }

        public final List<IndoorFloor> getFloors() {
            return this.floors;
        }

        public final String getSelectedFloorId() {
            return this.selectedFloorId;
        }

        public Builder(List<IndoorFloor> list, String str) {
            list.getClass();
            str.getClass();
            this.floors = list;
            this.selectedFloorId = str;
        }

        /* JADX INFO: renamed from: setFloors, reason: collision with other method in class */
        public final /* synthetic */ void m4684setFloors(List list) {
            list.getClass();
            this.floors = list;
        }

        /* JADX INFO: renamed from: setSelectedFloorId, reason: collision with other method in class */
        public final /* synthetic */ void m4685setSelectedFloorId(String str) {
            str.getClass();
            this.selectedFloorId = str;
        }

        @com.mapbox.annotation.MapboxExperimental
        public final IndoorState build() {
            List<IndoorFloor> list = this.floors;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (list == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of IndoorState through IndoorState.Builder because floors was null.");
                return null;
            }
            if (this.selectedFloorId == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of IndoorState through IndoorState.Builder because selectedFloorId was null.");
                return null;
            }
            list.getClass();
            String str = this.selectedFloorId;
            str.getClass();
            return new IndoorState(list, str, defaultConstructorMarker);
        }

        @com.mapbox.annotation.MapboxExperimental
        public final Builder setFloors(List<IndoorFloor> list) {
            list.getClass();
            this.floors = list;
            return this;
        }

        public final Builder setSelectedFloorId(String str) {
            str.getClass();
            this.selectedFloorId = str;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.floors, this.selectedFloorId);
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Builder toBuilder() {
        return new Builder(this.floors, this.selectedFloorId).setFloors(this.floors).setSelectedFloorId(this.selectedFloorId);
    }

    private IndoorState(List<IndoorFloor> list, String str) {
        this.floors = list;
        this.selectedFloorId = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorState)) {
            return false;
        }
        IndoorState indoorState = (IndoorState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.floors, indoorState.floors}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selectedFloorId, indoorState.selectedFloorId}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorState(floors=");
        sb.append(this.floors);
        sb.append(", selectedFloorId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.selectedFloorId, ')');
    }

    public /* synthetic */ IndoorState(List list, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str);
    }
}
