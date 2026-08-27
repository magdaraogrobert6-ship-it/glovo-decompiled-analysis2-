package o;

import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Serializable
public final class read {
    public final List components;
    public final String type;
    public static final serializer Companion = new serializer();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RemoteActionCompatParcelizer(0))};

    public final int hashCode() {
        return this.components.hashCode() + (this.type.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof read)) {
            return false;
        }
        read readVar = (read) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, readVar.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, readVar.components}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ read(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.type = str;
            this.components = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, write.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        return IconCompatParcelizer.read("NestHost(type=", this.type, ", components=", this.components, ")");
    }
}
