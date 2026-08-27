package com.mapbox.navigation.core.routealternatives;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateRouteSuggestion {
    public final List newRoutes;
    public final SuggestionType$AlternativesUpdated type;

    public final int hashCode() {
        return this.type.hashCode() + (this.newRoutes.hashCode() * 31);
    }

    public UpdateRouteSuggestion(List list, SuggestionType$AlternativesUpdated suggestionType$AlternativesUpdated) {
        this.newRoutes = list;
        this.type = suggestionType$AlternativesUpdated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRouteSuggestion)) {
            return false;
        }
        UpdateRouteSuggestion updateRouteSuggestion = (UpdateRouteSuggestion) obj;
        return this.newRoutes.equals(updateRouteSuggestion.newRoutes) && this.type.equals(updateRouteSuggestion.type);
    }

    public final String toString() {
        return "UpdateRouteSuggestion(newRoutes=" + this.newRoutes + ", type=" + this.type + ')';
    }
}
