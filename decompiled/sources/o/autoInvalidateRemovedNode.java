package o;

import com.google.firestore.v1.Value;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class autoInvalidateRemovedNode extends autoInvalidateInsertedNode {
    public static final autoInvalidateRemovedNode IconCompatParcelizer;
    public final childHitTestqzLsGqo RemoteActionCompatParcelizer;
    public final String write;

    static {
        childHitTestqzLsGqo childhittestqzlsgqo = childHitTestqzLsGqo.write;
        childhittestqzlsgqo.getClass();
        IconCompatParcelizer = new autoInvalidateRemovedNode(childhittestqzlsgqo);
        childHitTestqzLsGqo childhittestqzlsgqo2 = childHitTestqzLsGqo.read;
        childhittestqzlsgqo2.getClass();
        new autoInvalidateRemovedNode(childhittestqzlsgqo2);
        childHitTestqzLsGqo childhittestqzlsgqo3 = childHitTestqzLsGqo.serializer;
        childhittestqzlsgqo3.getClass();
        new autoInvalidateRemovedNode(childhittestqzlsgqo3);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public autoInvalidateRemovedNode(childHitTestqzLsGqo childhittestqzlsgqo) {
        childhittestqzlsgqo.getClass();
        this.RemoteActionCompatParcelizer = childhittestqzlsgqo;
        this.write = childhittestqzlsgqo.write();
    }

    @Override // o.autoInvalidateInsertedNode
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        return new SessionDao_Impl$$ExternalSyntheticLambda1(this, 1, pinnableContainerKtLocalPinnableContainer1);
    }

    @Override // o.autoInvalidateInsertedNode
    public final String RemoteActionCompatParcelizer() {
        return "fld(" + this.RemoteActionCompatParcelizer.write() + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof autoInvalidateRemovedNode)) {
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, ((autoInvalidateRemovedNode) obj).RemoteActionCompatParcelizer};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // o.autoInvalidateInsertedNode
    public final Value serializer(toContentCaptureSession tocontentcapturesession) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        String strWrite = this.RemoteActionCompatParcelizer.write();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setFieldReferenceValue(strWrite);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }
}
