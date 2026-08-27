package o;

import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class resetLayoutParamsIfAppropriate extends AbstractPolymorphicSerializer {
    public final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public List RemoteActionCompatParcelizer;
    public final getUnregisteredInAppMessageannotations read;

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final getUnregisteredInAppMessageannotations read() {
        return this.read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    public resetLayoutParamsIfAppropriate(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        this.read = getunregisteredinappmessageannotations;
        this.RemoteActionCompatParcelizer = instance_delegatelambda0.write;
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ResourceFileSystem$$ExternalSyntheticLambda0(21, this));
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.read + ')';
    }
}
