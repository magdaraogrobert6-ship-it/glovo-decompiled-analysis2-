package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.collections.AbstractList;
import o.accesssetThisDragAndDropTargetp;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableList$SubList extends AbstractList {
    public final int IconCompatParcelizer;
    public final accesssetThisDragAndDropTargetp serializer;
    public final int write;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        SQLite.RemoteActionCompatParcelizer(i, this.IconCompatParcelizer);
        return this.serializer.get(this.write + i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        SQLite.IconCompatParcelizer(i, i2, this.IconCompatParcelizer);
        int i3 = this.write;
        return new ImmutableList$SubList(this.serializer, i + i3, i3 + i2);
    }

    public ImmutableList$SubList(accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp, int i, int i2) {
        this.serializer = accesssetthisdraganddroptargetp;
        this.write = i;
        SQLite.IconCompatParcelizer(i, i2, accesssetthisdraganddroptargetp.size());
        this.IconCompatParcelizer = i2 - i;
    }
}
