package com.mapbox.navigation.core.telemetry.events;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class BitmapEncodeOptions {
    private final int compressQuality;
    private final int width;

    public static final class Builder {
        private int width = 250;
        private int compressQuality = 20;

        public final BitmapEncodeOptions build() {
            return new BitmapEncodeOptions(this.width, this.compressQuality, null);
        }

        public final Builder width(int i) {
            if (i >= 1) {
                this.width = i;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("width must be >= 1");
            return null;
        }

        public final Builder compressQuality(int i) {
            if (i >= 0 && i < 101) {
                this.compressQuality = i;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("compressQuality must be in 0..100");
            return null;
        }
    }

    public final int getCompressQuality() {
        return this.compressQuality;
    }

    public final int getWidth() {
        return this.width;
    }

    public final Builder toBuilder() {
        return new Builder().compressQuality(this.compressQuality).width(this.width);
    }

    private BitmapEncodeOptions(int i, int i2) {
        this.width = i;
        this.compressQuality = i2;
    }

    public int hashCode() {
        return (this.width * 31) + this.compressQuality;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BitmapEncodeOptions(width=");
        sb.append(this.width);
        sb.append(", compressQuality=");
        return af$$ExternalSyntheticOutline0.m(sb, this.compressQuality, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BitmapEncodeOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BitmapEncodeOptions bitmapEncodeOptions = (BitmapEncodeOptions) obj;
        return this.width == bitmapEncodeOptions.width && this.compressQuality == bitmapEncodeOptions.compressQuality;
    }

    public /* synthetic */ BitmapEncodeOptions(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
