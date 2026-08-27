package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class DelimiterComponentNode implements ComponentNode {
    public final String text;

    public final int hashCode() {
        return this.text.hashCode();
    }

    public DelimiterComponentNode(String str) {
        this.text = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("DelimiterComponentNode(text='"), this.text, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DelimiterComponentNode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.text.equals(((DelimiterComponentNode) obj).text);
    }
}
