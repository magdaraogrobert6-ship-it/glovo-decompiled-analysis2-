package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class accessdrawRectjd extends Binder implements toShaderBrush {
    public static final /* synthetic */ int read = 0;
    public final /* synthetic */ accessdrawArcjd IconCompatParcelizer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public accessdrawRectjd(accessdrawArcjd accessdrawarcjd) {
        this.IconCompatParcelizer = accessdrawarcjd;
        attachInterface(this, toShaderBrush.write);
    }

    @Override // o.toShaderBrush
    public final void read(String[] strArr, int i) {
        strArr.getClass();
        accessdrawArcjd accessdrawarcjd = this.IconCompatParcelizer;
        synchronized (accessdrawarcjd.RemoteActionCompatParcelizer) {
            String str = (String) accessdrawarcjd.read.get(Integer.valueOf(i));
            if (str == null) {
                SentryLogcatAdapter.IconCompatParcelizer("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = accessdrawarcjd.RemoteActionCompatParcelizer.beginBroadcast();
            int i2 = 0;
            while (true) {
                accessskewRadjd accessskewradjd = accessdrawarcjd.RemoteActionCompatParcelizer;
                if (i2 >= iBeginBroadcast) {
                    accessskewradjd.finishBroadcast();
                    return;
                }
                try {
                    Object broadcastCookie = accessskewradjd.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) accessdrawarcjd.read.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((BrushKt) accessdrawarcjd.RemoteActionCompatParcelizer.getBroadcastItem(i2)).IconCompatParcelizer(strArr);
                        } catch (RemoteException e) {
                            SentryLogcatAdapter.write("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    accessdrawarcjd.RemoteActionCompatParcelizer.finishBroadcast();
                    throw th;
                }
            }
        }
    }

    @Override // o.toShaderBrush
    public final void write(BrushKt brushKt, int i) {
        brushKt.getClass();
        accessdrawArcjd accessdrawarcjd = this.IconCompatParcelizer;
        synchronized (accessdrawarcjd.RemoteActionCompatParcelizer) {
            accessdrawarcjd.RemoteActionCompatParcelizer.unregister(brushKt);
        }
    }

    @Override // o.toShaderBrush
    public final int serializer(BrushKt brushKt, String str) {
        brushKt.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        accessdrawArcjd accessdrawarcjd = this.IconCompatParcelizer;
        synchronized (accessdrawarcjd.RemoteActionCompatParcelizer) {
            int i2 = accessdrawarcjd.write + 1;
            accessdrawarcjd.write = i2;
            if (accessdrawarcjd.RemoteActionCompatParcelizer.register(brushKt, Integer.valueOf(i2))) {
                accessdrawarcjd.read.put(Integer.valueOf(i2), str);
                i = i2;
            } else {
                accessdrawarcjd.write--;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = toShaderBrush.write;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        BrushKt brushKt = null;
        BrushKt brushKt2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(BrushKt.IconCompatParcelizer);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof BrushKt)) {
                    lerpFloatList lerpfloatlist = new lerpFloatList();
                    lerpfloatlist.read = strongBinder;
                    brushKt = lerpfloatlist;
                } else {
                    brushKt = (BrushKt) iInterfaceQueryLocalInterface;
                }
            }
            int iSerializer = serializer(brushKt, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iSerializer);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            read(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(BrushKt.IconCompatParcelizer);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof BrushKt)) {
                lerpFloatList lerpfloatlist2 = new lerpFloatList();
                lerpfloatlist2.read = strongBinder2;
                brushKt2 = lerpfloatlist2;
            } else {
                brushKt2 = (BrushKt) iInterfaceQueryLocalInterface2;
            }
        }
        write(brushKt2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
