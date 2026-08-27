package com.mapbox.navigation.ui.maps.route.line.model;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExpressionOffsetData {
    public final int legIndex;
    public final double offset;

    public abstract ExpressionOffsetData copyWithNewOffset(double d);

    public int hashCode() {
        return (Double.hashCode(this.offset) * 31) + this.legIndex;
    }

    public ExpressionOffsetData(double d, int i) {
        this.offset = d;
        this.legIndex = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ExpressionOffsetData expressionOffsetData = (ExpressionOffsetData) obj;
        return this.offset == expressionOffsetData.offset && this.legIndex == expressionOffsetData.legIndex;
    }
}
