package com.mapbox.navigation.base.internal.maneuver;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverTypeModifierPair {
    public final String modifier;
    public final String type;

    public final int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.modifier;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public ManeuverTypeModifierPair(String str, String str2) {
        this.type = str;
        this.modifier = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManeuverTypeModifierPair)) {
            return false;
        }
        ManeuverTypeModifierPair maneuverTypeModifierPair = (ManeuverTypeModifierPair) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, maneuverTypeModifierPair.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modifier, maneuverTypeModifierPair.modifier}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManeuverTypeModifierPair(type=");
        sb.append(this.type);
        sb.append(", modifier=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.modifier, ')');
    }
}
