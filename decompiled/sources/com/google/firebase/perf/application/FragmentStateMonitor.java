package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.HashMap;
import java.util.WeakHashMap;
import o.accessget_viewTreeOwners;
import o.div7Ah8Wj8;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getLegacyTextInputServiceAndroid;
import o.getWindowInfoannotations;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.sendMotionEvent8iAsVTc;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentStateMonitor extends FragmentManager$FragmentLifecycleCallbacks {
    public static final getWindowInfoannotations serializer = getWindowInfoannotations.write();
    public final WeakHashMap IconCompatParcelizer = new WeakHashMap();
    public final moveFocusInChildrenViewFocusFix3ESFkO8 MediaMetadataCompat;
    public final accessget_viewTreeOwners RemoteActionCompatParcelizer;
    public final getIntentArrayWithConfiguredBackStacklambda4 read;
    public final AppStateMonitor write;

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void IconCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        getWindowInfoannotations getwindowinfoannotations = serializer;
        getwindowinfoannotations.RemoteActionCompatParcelizer("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.IconCompatParcelizer;
        if (!weakHashMap.containsKey(fragment)) {
            getwindowinfoannotations.write("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        accessget_viewTreeOwners accessget_viewtreeowners = this.RemoteActionCompatParcelizer;
        HashMap map = accessget_viewtreeowners.IconCompatParcelizer;
        getWindowInfoannotations getwindowinfoannotations2 = accessget_viewTreeOwners.write;
        if (!accessget_viewtreeowners.read) {
            getwindowinfoannotations2.read();
            sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
        } else if (map.containsKey(fragment)) {
            getLegacyTextInputServiceAndroid getlegacytextinputserviceandroid = (getLegacyTextInputServiceAndroid) map.remove(fragment);
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accessget_viewtreeowners.write();
            if (sendmotionevent8iasvtcWrite.serializer()) {
                getLegacyTextInputServiceAndroid getlegacytextinputserviceandroid2 = (getLegacyTextInputServiceAndroid) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer();
                sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc(new getLegacyTextInputServiceAndroid(getlegacytextinputserviceandroid2.RemoteActionCompatParcelizer - getlegacytextinputserviceandroid.RemoteActionCompatParcelizer, getlegacytextinputserviceandroid2.write - getlegacytextinputserviceandroid.write, getlegacytextinputserviceandroid2.read - getlegacytextinputserviceandroid.read));
            } else {
                getwindowinfoannotations2.RemoteActionCompatParcelizer("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
            }
        } else {
            getwindowinfoannotations2.RemoteActionCompatParcelizer("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
        }
        if (!sendmotionevent8iasvtc.serializer()) {
            getwindowinfoannotations.write("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            ScreenTraceUtil.IconCompatParcelizer(trace, (getLegacyTextInputServiceAndroid) sendmotionevent8iasvtc.RemoteActionCompatParcelizer());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentResumed(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
        serializer.RemoteActionCompatParcelizer("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.MediaMetadataCompat, this.read, this.write);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.IconCompatParcelizer.put(fragment, trace);
        accessget_viewTreeOwners accessget_viewtreeowners = this.RemoteActionCompatParcelizer;
        HashMap map = accessget_viewtreeowners.IconCompatParcelizer;
        getWindowInfoannotations getwindowinfoannotations = accessget_viewTreeOwners.write;
        if (!accessget_viewtreeowners.read) {
            getwindowinfoannotations.read();
            return;
        }
        if (map.containsKey(fragment)) {
            getwindowinfoannotations.RemoteActionCompatParcelizer("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accessget_viewtreeowners.write();
        if (sendmotionevent8iasvtcWrite.serializer()) {
            map.put(fragment, (getLegacyTextInputServiceAndroid) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer());
        } else {
            getwindowinfoannotations.RemoteActionCompatParcelizer("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public FragmentStateMonitor(getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4, moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, AppStateMonitor appStateMonitor, accessget_viewTreeOwners accessget_viewtreeowners) {
        this.read = getintentarraywithconfiguredbackstacklambda4;
        this.MediaMetadataCompat = movefocusinchildrenviewfocusfix3esfko8;
        this.write = appStateMonitor;
        this.RemoteActionCompatParcelizer = accessget_viewtreeowners;
    }
}
