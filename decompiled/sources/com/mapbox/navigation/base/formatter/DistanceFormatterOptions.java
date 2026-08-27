package com.mapbox.navigation.base.formatter;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Locale;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DistanceFormatterOptions {
    public final Context applicationContext;
    public final Locale locale;
    public final int roundingIncrement;
    public final UnitType unitType;

    public final int hashCode() {
        int iHashCode = this.applicationContext.hashCode();
        int iHashCode2 = this.locale.hashCode();
        return ((this.unitType.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + this.roundingIncrement;
    }

    public DistanceFormatterOptions(Context context, Locale locale, UnitType unitType, int i) {
        this.applicationContext = context;
        this.locale = locale;
        this.unitType = unitType;
        this.roundingIncrement = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DistanceFormatterOptions(applicationContext=");
        sb.append(this.applicationContext);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", unitType='");
        sb.append(this.unitType);
        sb.append("', roundingIncrement=");
        return af$$ExternalSyntheticOutline0.m(sb, this.roundingIncrement, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DistanceFormatterOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DistanceFormatterOptions distanceFormatterOptions = (DistanceFormatterOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.applicationContext, distanceFormatterOptions.applicationContext}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locale, distanceFormatterOptions.locale}, getCieXyz.write())).booleanValue() && this.unitType == distanceFormatterOptions.unitType && this.roundingIncrement == distanceFormatterOptions.roundingIncrement;
    }
}
