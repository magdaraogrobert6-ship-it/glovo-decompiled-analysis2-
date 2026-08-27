package o;

import java.util.Iterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getDisplayingInAppMessageannotations implements ensureSubscribedToInAppMessageEventslambda3, Iterable, displayInAppMessagelambda121 {
    public static final getDisplayingInAppMessageannotations serializer = new getDisplayingInAppMessageannotations(1, 0);
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer = 1;
    public final long read;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new getCarryoverInAppMessageannotations(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return this.read + ".." + this.IconCompatParcelizer;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final boolean write() {
        return this.read > this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getDisplayingInAppMessageannotations)) {
            return false;
        }
        if (write() && ((getDisplayingInAppMessageannotations) obj).write()) {
            return true;
        }
        getDisplayingInAppMessageannotations getdisplayinginappmessageannotations = (getDisplayingInAppMessageannotations) obj;
        return this.read == getdisplayinginappmessageannotations.read && this.IconCompatParcelizer == getdisplayinginappmessageannotations.IconCompatParcelizer;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable IconCompatParcelizer() {
        return Long.valueOf(this.IconCompatParcelizer);
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable RemoteActionCompatParcelizer() {
        return Long.valueOf(this.read);
    }

    public final int hashCode() {
        if (write()) {
            return -1;
        }
        long j = this.read;
        long j2 = this.IconCompatParcelizer;
        return (int) (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32)));
    }

    public getDisplayingInAppMessageannotations(long j, long j2) {
        this.read = j;
        this.IconCompatParcelizer = TuplesKt.serializer(j, j2, 1L);
    }
}
