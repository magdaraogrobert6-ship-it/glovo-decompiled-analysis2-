package com.mapbox.navigation.base.trip.model.roadobject.bridge;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Bridge extends RoadObject {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bridge(String str, int i, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject, int i2) {
        super(str, i, d, str2, bool, roadObject);
        this.$r8$classId = i2;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public boolean equals(Object obj) {
        if (this.$r8$classId != 1) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        return Bridge.class.equals(obj != null ? obj.getClass() : null) && super.equals(obj);
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        int i = this.$r8$classId;
        if (i == 0) {
            return "Bridge() ".concat(super.toString());
        }
        if (i != 1) {
            return i != 2 ? "RestrictedArea() ".concat(super.toString()) : "Custom() ".concat(super.toString());
        }
        return "Notification";
    }
}
