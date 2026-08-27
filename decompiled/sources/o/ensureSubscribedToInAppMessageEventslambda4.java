package o;

import java.util.Iterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureSubscribedToInAppMessageEventslambda4 implements ensureSubscribedToInAppMessageEventslambda3, Iterable, displayInAppMessagelambda121 {
    public final char RemoteActionCompatParcelizer;
    public final char read;
    public final int write = 1;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ensureSubscribedToInAppMessageEventslambda1(this.RemoteActionCompatParcelizer, this.read, this.write);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer + ".." + this.read;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final boolean write() {
        return removeNodeAtDepth.serializer(this.RemoteActionCompatParcelizer, this.read) > 0;
    }

    public ensureSubscribedToInAppMessageEventslambda4(char c, char c2) {
        this.RemoteActionCompatParcelizer = c;
        this.read = (char) TuplesKt.read(c, c2, 1);
    }

    static {
        new ensureSubscribedToInAppMessageEventslambda4((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ensureSubscribedToInAppMessageEventslambda4)) {
            return false;
        }
        if (write() && ((ensureSubscribedToInAppMessageEventslambda4) obj).write()) {
            return true;
        }
        ensureSubscribedToInAppMessageEventslambda4 ensuresubscribedtoinappmessageeventslambda4 = (ensureSubscribedToInAppMessageEventslambda4) obj;
        return this.RemoteActionCompatParcelizer == ensuresubscribedtoinappmessageeventslambda4.RemoteActionCompatParcelizer && this.read == ensuresubscribedtoinappmessageeventslambda4.read;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable IconCompatParcelizer() {
        return Character.valueOf(this.read);
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable RemoteActionCompatParcelizer() {
        return Character.valueOf(this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        if (write()) {
            return -1;
        }
        return (this.RemoteActionCompatParcelizer * 31) + this.read;
    }
}
