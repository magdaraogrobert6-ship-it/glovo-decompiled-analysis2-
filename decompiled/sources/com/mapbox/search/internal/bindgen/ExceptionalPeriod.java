package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class ExceptionalPeriod implements Serializable {
    private final String periodBegin;
    private final String periodEnd;

    public String getPeriodBegin() {
        return this.periodBegin;
    }

    public String getPeriodEnd() {
        return this.periodEnd;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.periodBegin, this.periodEnd);
    }

    public ExceptionalPeriod(String str, String str2) {
        this.periodBegin = str;
        this.periodEnd = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[periodBegin: ");
        IconCompatParcelizer.read(sb, this.periodBegin, ", periodEnd: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.periodEnd, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptionalPeriod exceptionalPeriod = (ExceptionalPeriod) obj;
        return Objects.equals(this.periodBegin, exceptionalPeriod.periodBegin) && Objects.equals(this.periodEnd, exceptionalPeriod.periodEnd);
    }
}
