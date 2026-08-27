package com.mapbox.base.common.logger.model;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes5.dex */
public final class Tag {
    public final String tag;

    public final int hashCode() {
        return this.tag.hashCode();
    }

    public Tag(String str) {
        this.tag = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Tag) && this.tag.equals(((Tag) obj).tag);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Tag(tag="), this.tag, ')');
    }
}
