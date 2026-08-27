package o;

import com.google.android.gms.tasks.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasuredSizeYbymL2g extends ParentDataModifier {
    public final zzw write = new zzw();

    @Override // o.ParentDataModifier
    public final getMeasuredSizeYbymL2g RemoteActionCompatParcelizer(pin pinVar) {
        this.write.addOnSuccessListener(Placeable.RemoteActionCompatParcelizer, new PinnableContainerKtLocalPinnableContainer1(this, pinVar));
        return this;
    }

    @Override // o.ParentDataModifier
    public final boolean serializer() {
        return this.write.isComplete();
    }
}
