package o;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.navigation.NavArgsLazy;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.accessgetReusableGraphicsLayerScopep;
import o.component160d7_KjU;
import o.getTranslationY;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetReusableGraphicsLayerScopep implements getScaleX {
    public final LinkedHashMap IconCompatParcelizer;
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final SidecarInterface read;
    public final getTranslationY serializer;
    public androidx.navigation.NavArgsLazy write;

    /* JADX WARN: Multi-variable type inference failed */
    public final void RemoteActionCompatParcelizer(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.read;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.read) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        androidx.navigation.NavArgsLazy navArgsLazy = this.write;
        if (navArgsLazy != null) {
            navArgsLazy.RemoteActionCompatParcelizer(activity, RemoteActionCompatParcelizer(activity));
        }
        LinkedHashMap linkedHashMap2 = this.IconCompatParcelizer;
        if (linkedHashMap2.get(activity) == null && (activity instanceof focusModifier)) {
            updateWko1d7g updatewko1d7g = new updateWko1d7g(this, 3, activity);
            linkedHashMap2.put(activity, updatewko1d7g);
            ((focusModifier) activity).addOnConfigurationChangedListener(updatewko1d7g);
        }
    }

    public final void write(getExponentimpl getexponentimpl) {
        this.write = new androidx.navigation.NavArgsLazy(getexponentimpl);
        SidecarInterface sidecarInterface = this.read;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback(this.serializer, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    sidecarDeviceState.getClass();
                    Collection<Activity> collectionValues = this.IconCompatParcelizer.RemoteActionCompatParcelizer.values();
                    accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep = this.IconCompatParcelizer;
                    for (Activity activity : collectionValues) {
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = accessgetreusablegraphicslayerscopep.read) != null) {
                            windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        NavArgsLazy navArgsLazy = accessgetreusablegraphicslayerscopep.write;
                        if (navArgsLazy != null) {
                            navArgsLazy.RemoteActionCompatParcelizer(activity, accessgetreusablegraphicslayerscopep.serializer.read(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    iBinder.getClass();
                    sidecarWindowLayoutInfo.getClass();
                    Activity activity = (Activity) this.IconCompatParcelizer.RemoteActionCompatParcelizer.get(iBinder);
                    if (activity == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep = this.IconCompatParcelizer;
                    getTranslationY gettranslationy = accessgetreusablegraphicslayerscopep.serializer;
                    SidecarInterface sidecarInterface2 = accessgetreusablegraphicslayerscopep.read;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    component160d7_KjU component160d7_kju = gettranslationy.read(sidecarWindowLayoutInfo, sidecarDeviceState);
                    NavArgsLazy navArgsLazy = this.IconCompatParcelizer.write;
                    if (navArgsLazy != null) {
                        navArgsLazy.RemoteActionCompatParcelizer(activity, component160d7_kju);
                    }
                }
            }));
        }
    }

    public accessgetReusableGraphicsLayerScopep(Context context) {
        context.getClass();
        SidecarInterface sidecarInterface = graphicsLayer2Xn7asI.read(context);
        getTranslationY gettranslationy = new getTranslationY();
        this.read = sidecarInterface;
        this.serializer = gettranslationy;
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.read;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
        FocusOwnerImplmodifier1 focusOwnerImplmodifier1 = (FocusOwnerImplmodifier1) linkedHashMap.get(activity);
        if (focusOwnerImplmodifier1 != null) {
            if (activity instanceof focusModifier) {
                ((focusModifier) activity).removeOnConfigurationChangedListener(focusOwnerImplmodifier1);
            }
            linkedHashMap.remove(activity);
        }
        androidx.navigation.NavArgsLazy navArgsLazy = this.write;
        if (navArgsLazy != null) {
            ReentrantLock reentrantLock = (ReentrantLock) navArgsLazy.read;
            reentrantLock.lock();
            try {
                ((WeakHashMap) navArgsLazy.RatingCompat).put(activity, null);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        LinkedHashMap linkedHashMap2 = this.RemoteActionCompatParcelizer;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.read) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final component160d7_KjU RemoteActionCompatParcelizer(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new component160d7_KjU(instance_delegatelambda0.write);
        }
        SidecarInterface sidecarInterface = this.read;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.read;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.serializer.read(windowLayoutInfo, sidecarDeviceState);
    }

    public final boolean IconCompatParcelizer() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.read;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{returnType, cls5}, getCieXyz.write())).booleanValue()) {
                SidecarInterface sidecarInterface2 = this.read;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.read;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.read;
                Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{returnType2, SidecarWindowLayoutInfo.class}, getCieXyz.write())).booleanValue()) {
                    SidecarInterface sidecarInterface5 = this.read;
                    Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{returnType3, cls5}, getCieXyz.write())).booleanValue()) {
                        SidecarInterface sidecarInterface6 = this.read;
                        Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{returnType4, cls5}, getCieXyz.write())).booleanValue()) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                objInvoke.getClass();
                                if (((Integer) objInvoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            android.graphics.Rect rect = sidecarDisplayFeature.getRect();
                            rect.getClass();
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                objInvoke2.getClass();
                                if (!arrayList.equals((List) objInvoke2)) {
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                            }
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
