package o;

import bo.app.w$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class undelegate extends delegateUnprotectedui {
    public final transient int RemoteActionCompatParcelizer;
    public final /* synthetic */ delegateUnprotectedui read;
    public final transient int serializer;

    @Override // o.delegateUnprotectedui, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.delegateUnprotectedui, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    public undelegate(delegateUnprotectedui delegateunprotectedui, int i, int i2) {
        this.read = delegateunprotectedui;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }

    @Override // o.getSelfKindSetui
    public final int IconCompatParcelizer() {
        return this.read.IconCompatParcelizer() + this.RemoteActionCompatParcelizer;
    }

    @Override // o.getSelfKindSetui
    public final int RemoteActionCompatParcelizer() {
        return this.read.IconCompatParcelizer() + this.RemoteActionCompatParcelizer + this.serializer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer(i, this.serializer);
        return this.read.get(i + this.RemoteActionCompatParcelizer);
    }

    @Override // o.delegateUnprotectedui, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final delegateUnprotectedui subList(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.serializer)};
        int iWrite = w$$ExternalSyntheticLambda0.write();
        TextStreamsKt.read(objArr, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, iWrite);
        int i3 = this.RemoteActionCompatParcelizer;
        return this.read.subList(i + i3, i2 + i3);
    }

    @Override // o.getSelfKindSetui
    public final Object[] write() {
        return this.read.write();
    }

    @Override // o.delegateUnprotectedui, java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
