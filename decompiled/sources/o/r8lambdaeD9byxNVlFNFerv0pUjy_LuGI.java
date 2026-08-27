package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaeD9byxNVlFNFerv0pUjy_LuGI {

    public static final class RemoteActionCompatParcelizer extends r8lambdaeD9byxNVlFNFerv0pUjy_LuGI {
        private final long IconCompatParcelizer;

        public RemoteActionCompatParcelizer(long j) {
            super(null);
            this.IconCompatParcelizer = j;
        }

        public final long serializer() {
            return this.IconCompatParcelizer;
        }

        public final int hashCode() {
            return Long.hashCode(this.IconCompatParcelizer);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.IconCompatParcelizer == ((RemoteActionCompatParcelizer) obj).IconCompatParcelizer;
        }

        public final String toString() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(new StringBuilder("ConfigUpdate(minConfigModifTimeMillis="), this.IconCompatParcelizer, ')');
        }
    }

    public r8lambdaeD9byxNVlFNFerv0pUjy_LuGI(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
