package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum BannerComponentSubType {
    Unknown((byte) 0),
    Aftertoll((byte) 1),
    Cityreal((byte) 2),
    ExpresswayEntrance((byte) 3),
    ExpresswayExit((byte) 4),
    Jct((byte) 5),
    Sapa((byte) 6),
    Sapaguidemap((byte) 7),
    Signboard((byte) 8),
    Tollbranch((byte) 9);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BannerComponentSubType fromByteOrThrow(byte b) {
            if (b == 0) {
                return BannerComponentSubType.Unknown;
            }
            if (b == 1) {
                return BannerComponentSubType.Aftertoll;
            }
            if (b == 2) {
                return BannerComponentSubType.Cityreal;
            }
            if (b == 3) {
                return BannerComponentSubType.ExpresswayEntrance;
            }
            if (b == 4) {
                return BannerComponentSubType.ExpresswayExit;
            }
            if (b == 5) {
                return BannerComponentSubType.Jct;
            }
            if (b == 6) {
                return BannerComponentSubType.Sapa;
            }
            if (b == 7) {
                return BannerComponentSubType.Sapaguidemap;
            }
            if (b == 8) {
                return BannerComponentSubType.Signboard;
            }
            if (b == 9) {
                return BannerComponentSubType.Tollbranch;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown BannerComponentSubType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    BannerComponentSubType(byte b) {
        this.byteValue = b;
    }
}
