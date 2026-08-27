package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU<T, E> {
    public r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final class read<E> extends r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU {
        private final E serializer;

        public read(E e) {
            super(null);
            this.serializer = e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((read) obj).serializer}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("Failure(error="), (Object) this.serializer, ')');
        }

        public final int hashCode() {
            E e = this.serializer;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }
    }

    public static final class write<T> extends r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU {
        private final T IconCompatParcelizer;

        public write(T t) {
            super(null);
            this.IconCompatParcelizer = t;
        }

        public final T serializer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((write) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("Success(value="), (Object) this.IconCompatParcelizer, ')');
        }

        public final int hashCode() {
            T t = this.IconCompatParcelizer;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }
    }
}
