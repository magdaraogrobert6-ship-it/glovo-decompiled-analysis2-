package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetNumPadMoveEndcp;
import o.accessgetProgramGreencp;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends Fragment implements accessgetNumPadLeftParenthesiscp {
    private static final WeakHashMap read = new WeakHashMap();
    private final accessgetProgramGreencp write = new accessgetProgramGreencp();

    @Override // o.accessgetNumPadLeftParenthesiscp
    public final Activity MediaBrowserCompatMediaItem() {
        return getActivity();
    }

    public static zza IconCompatParcelizer(Activity activity) {
        zza zzaVar;
        WeakHashMap weakHashMap = read;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzaVar2));
            return zzaVar2;
        } catch (ClassCastException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            return null;
        }
    }

    @Override // o.accessgetNumPadLeftParenthesiscp
    public final <T extends accessgetNumPadMoveEndcp> T serializer(String str, Class<T> cls) {
        return cls.cast(this.write.write.get(str));
    }

    @Override // o.accessgetNumPadLeftParenthesiscp
    public final void serializer(String str, accessgetNumPadMoveEndcp accessgetnumpadmoveendcp) {
        this.write.serializer(str, accessgetnumpadmoveendcp);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.write.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.write.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).read(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.write.RemoteActionCompatParcelizer(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        accessgetProgramGreencp accessgetprogramgreencp = this.write;
        accessgetprogramgreencp.IconCompatParcelizer = 5;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).IconCompatParcelizer();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        accessgetProgramGreencp accessgetprogramgreencp = this.write;
        accessgetprogramgreencp.IconCompatParcelizer = 3;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).RemoteActionCompatParcelizer();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.write.read(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        accessgetProgramGreencp accessgetprogramgreencp = this.write;
        accessgetprogramgreencp.IconCompatParcelizer = 2;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).serializer();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        accessgetProgramGreencp accessgetprogramgreencp = this.write;
        accessgetprogramgreencp.IconCompatParcelizer = 4;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).read();
        }
    }
}
