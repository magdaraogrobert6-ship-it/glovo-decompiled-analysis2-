package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZone implements Serializable {
    private final String abbreviation;
    private final String identifier;
    private final String offset;

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getOffset() {
        return this.offset;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.offset, this.identifier, this.abbreviation);
    }

    public TimeZone(String str, String str2, String str3) {
        this.offset = str;
        this.identifier = str2;
        this.abbreviation = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[offset: ");
        IconCompatParcelizer.read(sb, this.offset, ", identifier: ");
        IconCompatParcelizer.read(sb, this.identifier, ", abbreviation: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.abbreviation, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeZone timeZone = (TimeZone) obj;
        return Objects.equals(this.offset, timeZone.offset) && Objects.equals(this.identifier, timeZone.identifier) && Objects.equals(this.abbreviation, timeZone.abbreviation);
    }
}
