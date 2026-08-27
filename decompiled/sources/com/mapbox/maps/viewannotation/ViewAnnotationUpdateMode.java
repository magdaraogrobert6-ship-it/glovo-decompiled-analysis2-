package com.mapbox.maps.viewannotation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationUpdateMode {
    public static final Companion Companion = new Companion(null);
    public static final ViewAnnotationUpdateMode MAP_FIXED_DELAY = new ViewAnnotationUpdateMode("MAP_FIXED_DELAY");
    public static final ViewAnnotationUpdateMode MAP_SYNCHRONIZED = new ViewAnnotationUpdateMode("MAP_SYNCHRONIZED");
    private final String mode;

    public String toString() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ViewAnnotationUpdateMode(String str) {
        this.mode = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ViewAnnotationUpdateMode)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mode, ((ViewAnnotationUpdateMode) obj).mode}, getCieXyz.write())).booleanValue();
    }
}
