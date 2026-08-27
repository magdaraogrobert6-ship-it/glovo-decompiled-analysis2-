package com.mapbox.navigation.ui.maps.route.callout.model;

import android.view.View;
import com.mapbox.maps.ViewAnnotationOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class CalloutViewHolder {
    public final ViewAnnotationOptions options;
    public final View view;

    public final int hashCode() {
        return this.options.hashCode() + (this.view.hashCode() * 31);
    }

    public CalloutViewHolder(View view, ViewAnnotationOptions viewAnnotationOptions) {
        this.view = view;
        this.options = viewAnnotationOptions;
    }

    public final String toString() {
        return "CalloutViewHolder(view=" + this.view + ", options=" + this.options + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CalloutViewHolder.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CalloutViewHolder calloutViewHolder = (CalloutViewHolder) obj;
        return this.view.equals(calloutViewHolder.view) && this.options.equals(calloutViewHolder.options);
    }
}
