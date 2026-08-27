package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetNumPadMoveEndcp;
import o.accessgetProgramGreencp;
import o.div7Ah8Wj8;
import o.isInfiniteannotations;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends Fragment implements accessgetNumPadLeftParenthesiscp {
    public static final WeakHashMap serializer = new WeakHashMap();
    public final accessgetProgramGreencp read = new accessgetProgramGreencp();

    public static zzd serializer(FragmentActivity fragmentActivity) {
        zzd zzdVar;
        div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap = serializer;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) supportFragmentManager.findFragmentByTag("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(supportFragmentManager);
                isinfiniteannotations.read(0, zzdVar2, "SLifecycleFragmentImpl", 1);
                isinfiniteannotations.read(true, true);
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.read.read(bundle);
    }

    @Override // o.accessgetNumPadLeftParenthesiscp
    public final accessgetNumPadMoveEndcp serializer(String str, Class cls) {
        return (accessgetNumPadMoveEndcp) cls.cast(this.read.write.get(str));
    }

    @Override // o.accessgetNumPadLeftParenthesiscp
    public final void serializer(String str, accessgetNumPadMoveEndcp accessgetnumpadmoveendcp) {
        this.read.serializer(str, accessgetnumpadmoveendcp);
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.read.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.read.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).read(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.read.RemoteActionCompatParcelizer(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        accessgetProgramGreencp accessgetprogramgreencp = this.read;
        accessgetprogramgreencp.IconCompatParcelizer = 5;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).IconCompatParcelizer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        accessgetProgramGreencp accessgetprogramgreencp = this.read;
        accessgetprogramgreencp.IconCompatParcelizer = 3;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).RemoteActionCompatParcelizer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        accessgetProgramGreencp accessgetprogramgreencp = this.read;
        accessgetprogramgreencp.IconCompatParcelizer = 2;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).serializer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        accessgetProgramGreencp accessgetprogramgreencp = this.read;
        accessgetprogramgreencp.IconCompatParcelizer = 4;
        Iterator it = accessgetprogramgreencp.write.values().iterator();
        while (it.hasNext()) {
            ((accessgetNumPadMoveEndcp) it.next()).read();
        }
    }
}
