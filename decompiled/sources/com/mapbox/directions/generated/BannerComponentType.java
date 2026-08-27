package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum BannerComponentType {
    Unknown((byte) 0),
    Text((byte) 1),
    Icon((byte) 2),
    Delimiter((byte) 3),
    ExitNumber((byte) 4),
    Exit((byte) 5),
    Lane((byte) 6),
    GuidanceView((byte) 7);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BannerComponentType fromByteOrThrow(byte b) {
            if (b == 0) {
                return BannerComponentType.Unknown;
            }
            if (b == 1) {
                return BannerComponentType.Text;
            }
            if (b == 2) {
                return BannerComponentType.Icon;
            }
            if (b == 3) {
                return BannerComponentType.Delimiter;
            }
            if (b == 4) {
                return BannerComponentType.ExitNumber;
            }
            if (b == 5) {
                return BannerComponentType.Exit;
            }
            if (b == 6) {
                return BannerComponentType.Lane;
            }
            if (b == 7) {
                return BannerComponentType.GuidanceView;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown BannerComponentType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    BannerComponentType(byte b) {
        this.byteValue = b;
    }
}
