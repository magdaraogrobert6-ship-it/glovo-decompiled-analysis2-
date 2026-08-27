package com.google.android.gms.oss.licenses;

import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.oss_licenses.zzg;
import java.util.ArrayList;
import java.util.Objects;
import o.OnPlacedElement;
import o.OnPlacedModifierDefaultImpls;
import o.OnPlacedNode;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadPageUpcp;
import o.accessgetScp;
import o.getSlotReusePolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends accessgetNumPadPageUpcp {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;

    public zzh(OnPlacedElement onPlacedElement, zzg zzgVar) {
        this.RemoteActionCompatParcelizer = zzgVar;
        Objects.requireNonNull(onPlacedElement);
    }

    @Override // o.accessgetNumPadPageUpcp
    public final void serializer(accessgetScp accessgetscp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        String string;
        String string2;
        ArrayList arrayList;
        int i = this.read;
        OnPlacedModifierDefaultImpls onPlacedModifierDefaultImpls = null;
        if (i == 0) {
            OnPlacedNode onPlacedNode = (OnPlacedNode) accessgetscp;
            String str = (String) this.RemoteActionCompatParcelizer;
            synchronized (onPlacedNode) {
                try {
                    onPlacedModifierDefaultImpls = (OnPlacedModifierDefaultImpls) onPlacedNode.MediaSessionCompatResultReceiverWrapper();
                } catch (DeadObjectException | IllegalStateException unused) {
                }
                if (onPlacedModifierDefaultImpls == null) {
                    throw new RemoteException("no service for getLicenseDetail call");
                }
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                parcelObtain.writeString(str);
                Parcel parcelRemoteActionCompatParcelizer = onPlacedModifierDefaultImpls.RemoteActionCompatParcelizer(2, parcelObtain);
                string = parcelRemoteActionCompatParcelizer.readString();
                parcelRemoteActionCompatParcelizer.recycle();
            }
            parentDataModifierDefaultImpls.IconCompatParcelizer(string);
            return;
        }
        if (i != 1) {
            OnPlacedNode onPlacedNode2 = (OnPlacedNode) accessgetscp;
            ArrayList arrayList2 = (ArrayList) this.RemoteActionCompatParcelizer;
            synchronized (onPlacedNode2) {
                try {
                    onPlacedModifierDefaultImpls = (OnPlacedModifierDefaultImpls) onPlacedNode2.MediaSessionCompatResultReceiverWrapper();
                } catch (DeadObjectException | IllegalStateException unused2) {
                }
                if (onPlacedModifierDefaultImpls == null) {
                    throw new RemoteException("no service for getLicenseDetail call");
                }
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                parcelObtain2.writeList(arrayList2);
                Parcel parcelRemoteActionCompatParcelizer2 = onPlacedModifierDefaultImpls.RemoteActionCompatParcelizer(5, parcelObtain2);
                arrayList = parcelRemoteActionCompatParcelizer2.readArrayList(getSlotReusePolicy.serializer);
                parcelRemoteActionCompatParcelizer2.recycle();
            }
            parentDataModifierDefaultImpls.IconCompatParcelizer(arrayList);
            return;
        }
        OnPlacedNode onPlacedNode3 = (OnPlacedNode) accessgetscp;
        zzg zzgVar = (zzg) this.RemoteActionCompatParcelizer;
        synchronized (onPlacedNode3) {
            try {
                onPlacedModifierDefaultImpls = (OnPlacedModifierDefaultImpls) onPlacedNode3.MediaSessionCompatResultReceiverWrapper();
            } catch (DeadObjectException | IllegalStateException unused3) {
            }
            if (onPlacedModifierDefaultImpls == null) {
                throw new RemoteException("no service for getLicenseDetail call");
            }
            String str2 = zzgVar.serializer;
            Parcel parcelObtain3 = Parcel.obtain();
            parcelObtain3.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
            parcelObtain3.writeString(str2);
            Parcel parcelRemoteActionCompatParcelizer3 = onPlacedModifierDefaultImpls.RemoteActionCompatParcelizer(4, parcelObtain3);
            string2 = parcelRemoteActionCompatParcelizer3.readString();
            parcelRemoteActionCompatParcelizer3.recycle();
        }
        parentDataModifierDefaultImpls.IconCompatParcelizer(string2);
    }

    public zzh(OnPlacedElement onPlacedElement, String str) {
        this.RemoteActionCompatParcelizer = str;
        Objects.requireNonNull(onPlacedElement);
    }

    public zzh(OnPlacedElement onPlacedElement, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
        Objects.requireNonNull(onPlacedElement);
    }
}
