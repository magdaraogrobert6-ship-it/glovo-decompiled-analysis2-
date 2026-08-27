package com.roadrunner.home.state.domain;

import androidx.compose.ui.graphics.Fields;
import o.dispatchLayoutStep1;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Phase2FallbackReason extends Exception {

    public static final class FailedToParseComponent extends Phase2FallbackReason {
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 3;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 125;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return "FailedToParseComponent(component=null)";
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 11;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (this != obj && (!(obj instanceof FailedToParseComponent))) {
                return false;
            }
            int i5 = i2 + 15;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
    }

    public static final class MissingMandatoryComponent extends Phase2FallbackReason {
        private static int read = 1;
        private static int write;
        public final dispatchLayoutStep1 serializer;

        public final dispatchLayoutStep1 read() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 37;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            dispatchLayoutStep1 dispatchlayoutstep1 = this.serializer;
            int i5 = i2 + 73;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return dispatchlayoutstep1;
        }

        public MissingMandatoryComponent(dispatchLayoutStep1 dispatchlayoutstep1) {
            this.serializer = dispatchlayoutstep1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 51;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.serializer.hashCode();
            }
            this.serializer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "MissingMandatoryComponent(component=" + this.serializer + ")";
            int i2 = write + 99;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
            return str;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof MissingMandatoryComponent) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((MissingMandatoryComponent) obj).serializer}, getCieXyz.write())).booleanValue())) {
                        return true;
                    }
                    int i2 = write + 49;
                    read = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read;
                int i5 = i4 + 85;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i4 + 87;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 94 / 0;
                }
                return false;
            }
            int i9 = read + 123;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return true;
        }
    }

    public static final class RiderStateNullOrEmpty extends Phase2FallbackReason {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 1;
        public static final RiderStateNullOrEmpty read = new RiderStateNullOrEmpty();
        private static int serializer;
        private static int write;

        static {
            int i = serializer + 101;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 47 / 0;
            }
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            int i2 = write + 121;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return "RiderStateNullOrEmpty";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 103;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return -181683158;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 87;
            int i4 = i3 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RiderStateNullOrEmpty)) {
                int i5 = i4 + 97;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = i2 + 13;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
    }
}
