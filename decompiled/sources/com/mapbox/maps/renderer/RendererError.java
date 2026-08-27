package com.mapbox.maps.renderer;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class RendererError {
    public static final Companion Companion = new Companion(null);
    public static final RendererError NO_VALID_EGL_CONFIG_FOUND = new RendererError(0);
    public static final RendererError OUT_OF_MEMORY = new RendererError(12291);
    private final int eglErrorCode;

    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.eglErrorCode);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RendererError(int i) {
        this.eglErrorCode = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RendererError) && this.eglErrorCode == ((RendererError) obj).eglErrorCode;
    }

    public String toString() {
        return this.eglErrorCode == 0 ? "RendererError(NO_VALID_EGL_CONFIG_FOUND)" : af$$ExternalSyntheticOutline0.m(new StringBuilder("RendererError(EGL_ERROR_CODE="), this.eglErrorCode, ')');
    }
}
