package com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PinHashDerivationError extends Exception {

    public static final class AlgorithmNotSupported extends PinHashDerivationError {
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        public final String write;

        public AlgorithmNotSupported(String str) {
            super("Algorithm not supported: ".concat(str), null);
            this.write = "algorithm_not_supported";
        }

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 43;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.write;
            int i4 = i3 + 31;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class DerivationFailed extends PinHashDerivationError {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;
        public final String read;
        public final Exception serializer;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.serializer;
            }
            int i3 = 30 / 0;
            return this.serializer;
        }

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 9;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.read;
            int i5 = i2 + 3;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return str;
        }

        public DerivationFailed(Exception exc) {
            super("Key derivation failed: ".concat("PBKDF2 execution failed"), exc);
            this.serializer = exc;
            this.read = "derivation_failed";
        }
    }

    public static final class EmptyPin extends PinHashDerivationError {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        public final String serializer;

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public EmptyPin() {
            super("PIN code cannot be blank", null);
            this.serializer = "empty_pin";
        }
    }

    public static final class EmptySecret extends PinHashDerivationError {
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        public final String read;

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            String str;
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 103;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                str = this.read;
                int i4 = 15 / 0;
            } else {
                str = this.read;
            }
            int i5 = i2 + 29;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public EmptySecret() {
            super("PIN secret cannot be blank", null);
            this.read = "empty_secret";
        }
    }

    public static final class InvalidIterations extends PinHashDerivationError {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        public final String RemoteActionCompatParcelizer;

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 53;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.RemoteActionCompatParcelizer;
            }
            int i3 = 36 / 0;
            return this.RemoteActionCompatParcelizer;
        }

        public InvalidIterations() {
            super("Iterations must be positive", null);
            this.RemoteActionCompatParcelizer = "invalid_iterations";
        }
    }

    public static final class InvalidOutputLength extends PinHashDerivationError {
        private static int read = 1;
        private static int write;
        public final String serializer;

        @Override // com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError
        public final String write() {
            String str;
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 81;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                str = this.serializer;
                int i4 = 41 / 0;
            } else {
                str = this.serializer;
            }
            int i5 = i2 + 53;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public InvalidOutputLength() {
            super("Output length must be positive", null);
            this.serializer = "invalid_output_length";
        }
    }

    public abstract String write();
}
