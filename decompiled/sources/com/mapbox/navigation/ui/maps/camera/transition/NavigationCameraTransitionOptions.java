package com.mapbox.navigation.ui.maps.camera.transition;

import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationCameraTransitionOptions {
    public final long maxDuration;

    public final int hashCode() {
        return Long.hashCode(this.maxDuration);
    }

    public NavigationCameraTransitionOptions(long j) {
        this.maxDuration = j;
    }

    public final String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(new StringBuilder("NavigationCameraTransitionOptions(maxDuration="), this.maxDuration, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationCameraTransitionOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.maxDuration == ((NavigationCameraTransitionOptions) obj).maxDuration;
    }
}
