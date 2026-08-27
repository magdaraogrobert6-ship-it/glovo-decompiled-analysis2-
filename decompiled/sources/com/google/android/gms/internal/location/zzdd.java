package com.google.android.gms.internal.location;

import android.os.Parcel;
import kotlin.LazyKt__LazyJVMKt;
import o.ParentDataModifierDefaultImpls;
import o.getMinusEK5gGoQ;
import o.getNumPad1EK5gGoQ;
import o.getNumPad2EK5gGoQ;
import o.getNumPad8EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends zzb implements getNumPad8EK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ParentDataModifierDefaultImpls write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzdd(Boolean bool, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this();
        this.IconCompatParcelizer = 1;
        this.RemoteActionCompatParcelizer = bool;
        this.write = parentDataModifierDefaultImpls;
    }

    @Override // o.getNumPad8EK5gGoQ
    public final void serializer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((getNumPad1EK5gGoQ) obj).zzf();
        } else if (i != 1) {
            ((getNumPad2EK5gGoQ) obj).zze();
        }
    }

    @Override // o.getNumPad8EK5gGoQ
    public final void write(zzl zzlVar) {
        int i = this.IconCompatParcelizer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.write;
        if (i == 0) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzlVar.read, (Object) null, parentDataModifierDefaultImpls);
        } else if (i != 1) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzlVar.read, (Object) null, parentDataModifierDefaultImpls);
        } else {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzlVar.read, this.RemoteActionCompatParcelizer, parentDataModifierDefaultImpls);
        }
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            serializer();
            return true;
        }
        zzl zzlVar = (zzl) getMinusEK5gGoQ.read(parcel, zzl.CREATOR);
        getMinusEK5gGoQ.serializer(parcel);
        write(zzlVar);
        return true;
    }

    public zzdd() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdd(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, zzb zzbVar, int i) {
        this();
        this.IconCompatParcelizer = i;
        this.write = parentDataModifierDefaultImpls;
        this.RemoteActionCompatParcelizer = zzbVar;
    }
}
