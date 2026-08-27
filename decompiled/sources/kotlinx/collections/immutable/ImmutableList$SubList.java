package kotlinx.collections.immutable;

import coil3.ExtrasKt;
import java.util.List;
import kotlin.collections.AbstractList;
import o.handleUrlOverridelambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;

/* JADX INFO: loaded from: classes4.dex */
public final class ImmutableList$SubList extends AbstractList implements r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk {
    public final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ RemoteActionCompatParcelizer;
    public final int serializer;
    public final int write;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.write;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        ExtrasKt.serializer(i, this.write);
        return this.RemoteActionCompatParcelizer.get(this.serializer + i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.write)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        ExtrasKt.read(-1094014857, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1094014862, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        int i3 = this.serializer;
        return new ImmutableList$SubList(this.RemoteActionCompatParcelizer, i + i3, i3 + i2);
    }

    public ImmutableList$SubList(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, int i, int i2) {
        this.RemoteActionCompatParcelizer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.serializer = i;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(r8lambdaiidsddyirtymdul5lt6pmt2zysq.size())};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        ExtrasKt.read(-1094014857, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1094014862, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        this.write = i2 - i;
    }
}
