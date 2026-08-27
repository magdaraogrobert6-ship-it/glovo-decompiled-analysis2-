package com.mapbox.navigation.base.trip.model.roadobject;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalizedString {
    public final String language;
    public final String value;

    public final int hashCode() {
        return this.value.hashCode() + (this.language.hashCode() * 31);
    }

    public LocalizedString(String str, String str2) {
        this.language = str;
        this.value = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalizedString(language='");
        sb.append(this.language);
        sb.append("', value='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.value, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocalizedString.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LocalizedString localizedString = (LocalizedString) obj;
        return this.language.equals(localizedString.language) && this.value.equals(localizedString.value);
    }
}
