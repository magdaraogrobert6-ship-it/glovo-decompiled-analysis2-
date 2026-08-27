package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzd;
import o.OnVisibilityChangedNode;
import o.OnVisibilityChangedNoderectChanged1;
import o.OnVisibilityChangedNodeupdateViewport1;
import o.OuterRectRulers;
import o.accessgetTwocp;
import o.fireExitIfNeeded;
import o.getButtonL2EK5gGoQ;
import o.getDirectionCenterEK5gGoQ;
import o.setLastReportedResult;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzv extends zzd implements OuterRectRulers {
    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        setLastReportedResult onVisibilityChangedNoderectChanged1;
        if (i != 1) {
            return false;
        }
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcel.readStrongBinder());
        IBinder strongBinder = parcel.readStrongBinder();
        OnVisibilityChangedNode fireexitifneeded = null;
        if (strongBinder == null) {
            onVisibilityChangedNoderectChanged1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
            if (iInterfaceQueryLocalInterface instanceof setLastReportedResult) {
                onVisibilityChangedNoderectChanged1 = (setLastReportedResult) iInterfaceQueryLocalInterface;
            } else {
                onVisibilityChangedNoderectChanged1 = new OnVisibilityChangedNoderectChanged1(strongBinder);
            }
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
            if (iInterfaceQueryLocalInterface2 instanceof OnVisibilityChangedNode) {
                fireexitifneeded = (OnVisibilityChangedNode) iInterfaceQueryLocalInterface2;
            } else {
                fireexitifneeded = new fireExitIfNeeded(strongBinder2);
            }
        }
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        getButtonL2EK5gGoQ service = getService(accessgettwocpAsInterface, onVisibilityChangedNoderectChanged1, fireexitifneeded);
        parcel2.writeNoException();
        getDirectionCenterEK5gGoQ.write(parcel2, service);
        return true;
    }

    public static OuterRectRulers asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        if (iInterfaceQueryLocalInterface instanceof OuterRectRulers) {
            return (OuterRectRulers) iInterfaceQueryLocalInterface;
        }
        return new OnVisibilityChangedNodeupdateViewport1(iBinder);
    }
}
