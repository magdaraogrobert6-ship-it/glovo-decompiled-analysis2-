package com.mapbox.navigation.base.internal.route.parsing.models.nn;

import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class ContinuousAlternativesParsingSuccessfulResult {
    public final List routes;

    public final int hashCode() {
        return this.routes.hashCode();
    }

    public ContinuousAlternativesParsingSuccessfulResult(List list) {
        this.routes = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContinuousAlternativesParsingSuccessfulResult) && this.routes.equals(((ContinuousAlternativesParsingSuccessfulResult) obj).routes);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("ContinuousAlternativesParsingSuccessfulResult(routes="), this.routes, ')');
    }
}
