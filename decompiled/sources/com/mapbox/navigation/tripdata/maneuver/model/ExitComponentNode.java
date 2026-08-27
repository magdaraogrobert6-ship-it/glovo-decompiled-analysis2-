package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class ExitComponentNode implements ComponentNode {
    public final String text;

    public final int hashCode() {
        return this.text.hashCode();
    }

    public ExitComponentNode(String str) {
        this.text = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ExitComponentNode(text='"), this.text, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ExitComponentNode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.text.equals(((ExitComponentNode) obj).text);
    }
}
