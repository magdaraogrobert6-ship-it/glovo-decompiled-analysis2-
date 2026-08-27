package o;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getWaterfall extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        getTargetValueInsetshdzbrEE gettargetvalueinsetshdzbree = (getTargetValueInsetshdzbrEE) this;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = getSystemGestures.serializer;
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail <= 0) {
                gettargetvalueinsetshdzbree.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(gettargetvalueinsetshdzbree.RemoteActionCompatParcelizer);
                gettargetvalueinsetshdzbree.read.write("onCompleteUpdate", new Object[0]);
                return true;
            }
            throw new BadParcelableException(c8$$ExternalSyntheticOutline0.m(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i4 = getSystemGestures.serializer;
        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 <= 0) {
            zzx zzxVar = gettargetvalueinsetshdzbree.IconCompatParcelizer.RemoteActionCompatParcelizer;
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = gettargetvalueinsetshdzbree.RemoteActionCompatParcelizer;
            zzxVar.IconCompatParcelizer(parentDataModifierDefaultImpls);
            gettargetvalueinsetshdzbree.read.write("onRequestInfo", new Object[0]);
            if (bundle.getInt("error.code", -2) != 0) {
                parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) new InstallException(bundle.getInt("error.code", -2)));
                return true;
            }
            bundle.getInt("version.code", -1);
            int i5 = bundle.getInt("update.availability");
            bundle.getInt("install.status", 0);
            if (bundle.getInt("client.version.staleness", -1) != -1) {
                bundle.getInt("client.version.staleness");
            }
            bundle.getInt("in.app.update.priority", 0);
            bundle.getLong("bytes.downloaded");
            bundle.getLong("total.bytes.to.download");
            long j = bundle.getLong("additional.size.required");
            getSourceValueInsetshdzbrEE getsourcevalueinsetshdzbree = gettargetvalueinsetshdzbree.serializer.MediaBrowserCompatMediaItem;
            getsourcevalueinsetshdzbree.getClass();
            long j2 = getSourceValueInsetshdzbrEE.read(new File(getsourcevalueinsetshdzbree.read.getFilesDir(), "assetpacks"));
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
            PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
            PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
            HashMap map = new HashMap();
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
            HashSet hashSet = new HashSet();
            if (integerArrayList != null) {
                hashSet.addAll(integerArrayList);
            }
            map.put("blocking.destructive.intent", hashSet);
            ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
            HashSet hashSet2 = new HashSet();
            if (integerArrayList2 != null) {
                hashSet2.addAll(integerArrayList2);
            }
            map.put("nonblocking.destructive.intent", hashSet2);
            ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
            HashSet hashSet3 = new HashSet();
            if (integerArrayList3 != null) {
                hashSet3.addAll(integerArrayList3);
            }
            map.put("blocking.intent", hashSet3);
            ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
            HashSet hashSet4 = new HashSet();
            if (integerArrayList4 != null) {
                hashSet4.addAll(integerArrayList4);
            }
            map.put("nonblocking.intent", hashSet4);
            parentDataModifierDefaultImpls.write(new getSafeDrawing(i5, j, j2, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
            return true;
        }
        throw new BadParcelableException(c8$$ExternalSyntheticOutline0.m(iDataAvail2, "Parcel data not fully consumed, unread size: "));
    }
}
