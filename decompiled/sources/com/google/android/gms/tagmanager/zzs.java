package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzd;
import o.OnVisibilityChangedNode;
import o.OnVisibilityChangedNodecheckVisibility1;
import o.OnVisibilityChangedNoderectChanged1;
import o.accessgetTwocp;
import o.fireExitIfNeeded;
import o.getDirectionCenterEK5gGoQ;
import o.getLastReportedResult;
import o.setLastReportedResult;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzs extends zzd implements getLastReportedResult {
    public static getLastReportedResult asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        if (iInterfaceQueryLocalInterface instanceof getLastReportedResult) {
            return (getLastReportedResult) iInterfaceQueryLocalInterface;
        }
        return new OnVisibilityChangedNodecheckVisibility1(iBinder);
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        setLastReportedResult onVisibilityChangedNoderectChanged1;
        setLastReportedResult onVisibilityChangedNoderectChanged2;
        setLastReportedResult setlastreportedresult;
        OnVisibilityChangedNode fireexitifneeded = null;
        if (i == 1) {
            accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
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
            initialize(accessgettwocpAsInterface, onVisibilityChangedNoderectChanged1, fireexitifneeded);
        } else if (i == 2) {
            Intent intent = (Intent) getDirectionCenterEK5gGoQ.serializer(parcel, Intent.CREATOR);
            accessgetTwocp accessgettwocpAsInterface2 = ObjectWrapper.asInterface(parcel.readStrongBinder());
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            preview(intent, accessgettwocpAsInterface2);
        } else {
            if (i != 3) {
                return false;
            }
            Intent intent2 = (Intent) getDirectionCenterEK5gGoQ.serializer(parcel, Intent.CREATOR);
            accessgetTwocp accessgettwocpAsInterface3 = ObjectWrapper.asInterface(parcel.readStrongBinder());
            accessgetTwocp accessgettwocpAsInterface4 = ObjectWrapper.asInterface(parcel.readStrongBinder());
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 == null) {
                setlastreportedresult = null;
            } else {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                if (iInterfaceQueryLocalInterface3 instanceof setLastReportedResult) {
                    onVisibilityChangedNoderectChanged2 = (setLastReportedResult) iInterfaceQueryLocalInterface3;
                } else {
                    onVisibilityChangedNoderectChanged2 = new OnVisibilityChangedNoderectChanged1(strongBinder3);
                }
                setlastreportedresult = onVisibilityChangedNoderectChanged2;
            }
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                if (iInterfaceQueryLocalInterface4 instanceof OnVisibilityChangedNode) {
                    fireexitifneeded = (OnVisibilityChangedNode) iInterfaceQueryLocalInterface4;
                } else {
                    fireexitifneeded = new fireExitIfNeeded(strongBinder4);
                }
            }
            OnVisibilityChangedNode onVisibilityChangedNode = fireexitifneeded;
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            previewIntent(intent2, accessgettwocpAsInterface3, accessgettwocpAsInterface4, setlastreportedresult, onVisibilityChangedNode);
        }
        parcel2.writeNoException();
        return true;
    }
}
