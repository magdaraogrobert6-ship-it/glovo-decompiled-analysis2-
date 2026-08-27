package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutNodeSubcompositionsStateprecomposePaused1 extends getPairingEK5gGoQ implements isComplete {
    public LayoutNodeSubcompositionsStateprecomposePaused1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // o.isComplete
    public final void IconCompatParcelizer(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzplVar);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(2, parcelSerializer);
    }

    @Override // o.isComplete
    public final void IconCompatParcelizer(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(18, parcelSerializer);
    }

    @Override // o.isComplete
    public final void MediaDescriptionCompat(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(26, parcelSerializer);
    }

    @Override // o.isComplete
    public final zzao MediaMetadataCompat(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        Parcel parcelSerializer2 = serializer(21, parcelSerializer);
        zzao zzaoVar = (zzao) getPageDownEK5gGoQ.IconCompatParcelizer(parcelSerializer2, zzao.CREATOR);
        parcelSerializer2.recycle();
        return zzaoVar;
    }

    @Override // o.isComplete
    public final void MediaSessionCompatQueueItem(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(20, parcelSerializer);
    }

    @Override // o.isComplete
    public final void RatingCompat(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(25, parcelSerializer);
    }

    @Override // o.isComplete
    public final ArrayList RemoteActionCompatParcelizer(zzr zzrVar, boolean z) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        parcelSerializer.writeInt(1);
        Parcel parcelSerializer2 = serializer(7, parcelSerializer);
        ArrayList arrayListCreateTypedArrayList = parcelSerializer2.createTypedArrayList(zzpl.CREATOR);
        parcelSerializer2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // o.isComplete
    public final List RemoteActionCompatParcelizer(String str, String str2, boolean z, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        ClassLoader classLoader = getPageDownEK5gGoQ.serializer;
        parcelSerializer.writeInt(z ? 1 : 0);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        Parcel parcelSerializer2 = serializer(14, parcelSerializer);
        ArrayList arrayListCreateTypedArrayList = parcelSerializer2.createTypedArrayList(zzpl.CREATOR);
        parcelSerializer2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // o.isComplete
    public final void RemoteActionCompatParcelizer(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(6, parcelSerializer);
    }

    @Override // o.isComplete
    public final List read(String str, String str2, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        Parcel parcelSerializer2 = serializer(16, parcelSerializer);
        ArrayList arrayListCreateTypedArrayList = parcelSerializer2.createTypedArrayList(zzah.CREATOR);
        parcelSerializer2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // o.isComplete
    public final void read(Bundle bundle, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(19, parcelSerializer);
    }

    @Override // o.isComplete
    public final void read(zzah zzahVar, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzahVar);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(12, parcelSerializer);
    }

    @Override // o.isComplete
    public final void read(zzbg zzbgVar, zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzbgVar);
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(1, parcelSerializer);
    }

    @Override // o.isComplete
    public final void read(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(4, parcelSerializer);
    }

    @Override // o.isComplete
    public final String serializer(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        Parcel parcelSerializer2 = serializer(11, parcelSerializer);
        String string = parcelSerializer2.readString();
        parcelSerializer2.recycle();
        return string;
    }

    @Override // o.isComplete
    public final void serializer(zzr zzrVar, Bundle bundle, LayoutNodeSubcompositionsStateprecomposePaused2 layoutNodeSubcompositionsStateprecomposePaused2) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        getPageDownEK5gGoQ.serializer(parcelSerializer, layoutNodeSubcompositionsStateprecomposePaused2);
        IconCompatParcelizer(31, parcelSerializer);
    }

    @Override // o.isComplete
    public final void serializer(String str, String str2, long j, String str3) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeLong(j);
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeString(str3);
        IconCompatParcelizer(10, parcelSerializer);
    }

    @Override // o.isComplete
    public final byte[] serializer(zzbg zzbgVar, String str) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzbgVar);
        parcelSerializer.writeString(str);
        Parcel parcelSerializer2 = serializer(9, parcelSerializer);
        byte[] bArrCreateByteArray = parcelSerializer2.createByteArray();
        parcelSerializer2.recycle();
        return bArrCreateByteArray;
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        IconCompatParcelizer(27, parcelSerializer);
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        getPageDownEK5gGoQ.read(parcelSerializer, zzafVar);
        IconCompatParcelizer(30, parcelSerializer);
    }

    @Override // o.isComplete
    public final void write(zzr zzrVar, zzoo zzooVar, LayoutNodeSubcompositionsStatesubcompose41composable1 layoutNodeSubcompositionsStatesubcompose41composable1) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzrVar);
        getPageDownEK5gGoQ.read(parcelSerializer, zzooVar);
        getPageDownEK5gGoQ.serializer(parcelSerializer, layoutNodeSubcompositionsStatesubcompose41composable1);
        IconCompatParcelizer(29, parcelSerializer);
    }

    @Override // o.isComplete
    public final List IconCompatParcelizer(String str, String str2, String str3, boolean z) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(null);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeString(str3);
        ClassLoader classLoader = getPageDownEK5gGoQ.serializer;
        parcelSerializer.writeInt(z ? 1 : 0);
        Parcel parcelSerializer2 = serializer(15, parcelSerializer);
        ArrayList arrayListCreateTypedArrayList = parcelSerializer2.createTypedArrayList(zzpl.CREATOR);
        parcelSerializer2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // o.isComplete
    public final List RemoteActionCompatParcelizer(String str, String str2, String str3) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(null);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeString(str3);
        Parcel parcelSerializer2 = serializer(17, parcelSerializer);
        ArrayList arrayListCreateTypedArrayList = parcelSerializer2.createTypedArrayList(zzah.CREATOR);
        parcelSerializer2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
