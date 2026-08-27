package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 {
    private final String read;

    public final String write() {
        return this.read;
    }

    public r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.read = str;
    }

    public static abstract class serializer extends r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 {
        private final String RemoteActionCompatParcelizer;

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public static final class RemoteActionCompatParcelizer extends serializer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(String str) {
                super("InvalidServerResponse", str, null);
                str.getClass();
            }
        }

        public static final class write extends serializer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(String str) {
                super("OtherError", str, null);
                str.getClass();
            }
        }

        public /* synthetic */ serializer(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }

        public serializer(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            super(str, false, null);
            this.RemoteActionCompatParcelizer = str2;
        }
    }

    public static final class IconCompatParcelizer extends r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 {
        private final r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI IconCompatParcelizer;

        public final r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi) {
            super("Success", true, null);
            r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi.getClass();
            this.IconCompatParcelizer = r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi;
        }
    }
}
