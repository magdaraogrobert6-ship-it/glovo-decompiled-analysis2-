package o;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class onFirstVisibledefault extends zzbm implements LayoutNodeSubcompositionsStateprecomposePaused2 {
    public final /* synthetic */ AtomicReference write;

    @Override // o.LayoutNodeSubcompositionsStateprecomposePaused2
    public final void write(List list) {
        AtomicReference atomicReference = this.write;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        getPageDownEK5gGoQ.read(parcel);
        write(arrayListCreateTypedArrayList);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onFirstVisibledefault(setViewportBounds setviewportbounds, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.write = atomicReference;
    }
}
