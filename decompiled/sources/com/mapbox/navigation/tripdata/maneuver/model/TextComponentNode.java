package com.mapbox.navigation.tripdata.maneuver.model;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TextComponentNode implements ComponentNode {
    public final String abbr;
    public final Integer abbrPriority;
    public final String text;

    public final int hashCode() {
        int iHashCode = this.text.hashCode();
        String str = this.abbr;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Integer num = this.abbrPriority;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.intValue() : 0);
    }

    public TextComponentNode(String str, String str2, Integer num) {
        this.text = str;
        this.abbr = str2;
        this.abbrPriority = num;
    }

    public final String toString() {
        return "TextComponentNode(text='" + this.text + "', abbr=" + this.abbr + ", abbrPriority=" + this.abbrPriority + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TextComponentNode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        TextComponentNode textComponentNode = (TextComponentNode) obj;
        if (!this.text.equals(textComponentNode.text)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.abbr, textComponentNode.abbr}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.abbrPriority, textComponentNode.abbrPriority}, getCieXyz.write())).booleanValue();
    }
}
