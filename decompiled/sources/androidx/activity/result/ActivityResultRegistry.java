package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import androidx.sqlite.SQLite;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AndroidColorSpace_androidKt;
import o.DrawableTransformation;
import o.FocusDirection;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.getNavigationEventDispatcher;
import o.invalidateMenu;
import o.onActivityResult;
import o.onBackPressed;
import o.onConfigurationChanged;
import o.onCreatePanelMenu;
import o.onNewIntent;
import o.pauseWebviewIfNecessarylambda10;
import o.requestDisplayInAppMessagelambda4;
import o.resetAfterInAppMessageCloselambda1;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final invalidateMenu serializer = new invalidateMenu();
    private final Map<Integer, String> RatingCompat = new LinkedHashMap();
    private final Map<String, Integer> read = new LinkedHashMap();
    private final Map<String, onActivityResult> RemoteActionCompatParcelizer = new LinkedHashMap();
    private final List<String> write = new ArrayList();
    private final transient Map<String, onConfigurationChanged> IconCompatParcelizer = new LinkedHashMap();
    private final Map<String, Object> MediaBrowserCompatMediaItem = new LinkedHashMap();
    private final Bundle MediaDescriptionCompat = new Bundle();

    public abstract void onLaunch(int i, onNewIntent onnewintent, Object obj, FocusDirection focusDirection);

    public final void registerKey(String str) {
        if (this.read.get(str) != null) {
            return;
        }
        b8$$ExternalSyntheticLambda4 b8__externalsyntheticlambda4 = new b8$$ExternalSyntheticLambda4(2);
        for (Number number : new requestDisplayInAppMessagelambda4(new resetAfterInAppMessageCloselambda1(new RoomDatabase$$ExternalSyntheticLambda4(3, b8__externalsyntheticlambda4), b8__externalsyntheticlambda4))) {
            if (!this.RatingCompat.containsKey(Integer.valueOf(number.intValue()))) {
                int iIntValue = number.intValue();
                this.RatingCompat.put(Integer.valueOf(iIntValue), str);
                this.read.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        DrawableTransformation.write("Sequence contains no element matching the predicate.");
    }

    public final <I, O> onBackPressed register(final String str, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, final onNewIntent onnewintent, final getNavigationEventDispatcher getnavigationeventdispatcher) {
        str.getClass();
        accessisrendernodecompatiblecp.getClass();
        onnewintent.getClass();
        getnavigationeventdispatcher.getClass();
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        accessregisterComponentCallback accessregistercomponentcallback = (accessregisterComponentCallback) lifecycle;
        if (accessregistercomponentcallback.RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(accessisrendernodecompatiblecp);
            toColorLong8_81llA tocolorlong8_81lla = accessregistercomponentcallback.RatingCompat;
            sb.append(" is attempting to register while current state is ");
            sb.append(tocolorlong8_81lla);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        registerKey(str);
        onActivityResult onactivityresult = this.RemoteActionCompatParcelizer.get(str);
        if (onactivityresult == null) {
            onactivityresult = new onActivityResult(lifecycle);
        }
        toAndroidColorSpace toandroidcolorspace = new toAndroidColorSpace() { // from class: o.initializeViewTreeOwners
            @Override // o.toAndroidColorSpace
            public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                androidx.activity.result.ActivityResultRegistry.m4$r8$lambda$TWvtyPFkiHdx0RbtWVLevVLT0(this.IconCompatParcelizer, str, getnavigationeventdispatcher, onnewintent, accessisrendernodecompatiblecp2, androidColorSpace_androidKt);
            }
        };
        onactivityresult.read.IconCompatParcelizer(toandroidcolorspace);
        onactivityresult.write.add(toandroidcolorspace);
        this.RemoteActionCompatParcelizer.put(str, onactivityresult);
        return new onCreatePanelMenu(this, str, onnewintent, 0);
    }

    public final void unregister$activity(String str) {
        Integer numRemove;
        str.getClass();
        if (!this.write.contains(str) && (numRemove = this.read.remove(str)) != null) {
            this.RatingCompat.remove(numRemove);
        }
        this.IconCompatParcelizer.remove(str);
        if (this.MediaBrowserCompatMediaItem.containsKey(str)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Dropping pending result for request ", str, ": ");
            sbM.append(this.MediaBrowserCompatMediaItem.get(str));
            SentryLogcatAdapter.IconCompatParcelizer("ActivityResultRegistry", sbM.toString());
            this.MediaBrowserCompatMediaItem.remove(str);
        }
        if (this.MediaDescriptionCompat.containsKey(str)) {
            SentryLogcatAdapter.IconCompatParcelizer("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) SQLite.read(this.MediaDescriptionCompat, str, ActivityResult.class)));
            this.MediaDescriptionCompat.remove(str);
        }
        onActivityResult onactivityresult = this.RemoteActionCompatParcelizer.get(str);
        if (onactivityresult != null) {
            ArrayList arrayList = onactivityresult.write;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                onactivityresult.read.read((toAndroidColorSpace) it.next());
            }
            arrayList.clear();
            this.RemoteActionCompatParcelizer.remove(str);
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$TWvtyPFk-iHdx0R-btWVLevVLT0, reason: not valid java name */
    public static void m4$r8$lambda$TWvtyPFkiHdx0RbtWVLevVLT0(ActivityResultRegistry activityResultRegistry, String str, getNavigationEventDispatcher getnavigationeventdispatcher, onNewIntent onnewintent, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (AndroidColorSpace_androidKt.ON_START != androidColorSpace_androidKt) {
            if (AndroidColorSpace_androidKt.ON_STOP == androidColorSpace_androidKt) {
                activityResultRegistry.IconCompatParcelizer.remove(str);
                return;
            } else {
                if (AndroidColorSpace_androidKt.ON_DESTROY == androidColorSpace_androidKt) {
                    activityResultRegistry.unregister$activity(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.IconCompatParcelizer.put(str, new onConfigurationChanged(onnewintent, getnavigationeventdispatcher));
        if (activityResultRegistry.MediaBrowserCompatMediaItem.containsKey(str)) {
            Object obj = activityResultRegistry.MediaBrowserCompatMediaItem.get(str);
            activityResultRegistry.MediaBrowserCompatMediaItem.remove(str);
            getnavigationeventdispatcher.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) SQLite.read(activityResultRegistry.MediaDescriptionCompat, str, ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.MediaDescriptionCompat.remove(str);
            getnavigationeventdispatcher.onActivityResult(onnewintent.serializer(activityResult.write, activityResult.RemoteActionCompatParcelizer));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.read.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.read.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.write));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.MediaDescriptionCompat));
    }

    public final boolean dispatchResult(int i, int i2, Intent intent) {
        String str = this.RatingCompat.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        onConfigurationChanged onconfigurationchanged = this.IconCompatParcelizer.get(str);
        if ((onconfigurationchanged != null ? onconfigurationchanged.write : null) == null || !this.write.contains(str)) {
            this.MediaBrowserCompatMediaItem.remove(str);
            this.MediaDescriptionCompat.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        onconfigurationchanged.write.onActivityResult(onconfigurationchanged.serializer.serializer(i2, intent));
        this.write.remove(str);
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.write.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.MediaDescriptionCompat.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.read.containsKey(str)) {
                Integer numRemove = this.read.remove(str);
                if (!this.MediaDescriptionCompat.containsKey(str)) {
                    pauseWebviewIfNecessarylambda10.serializer(this.RatingCompat).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i);
            num.getClass();
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i);
            str2.getClass();
            String str3 = str2;
            this.RatingCompat.put(Integer.valueOf(iIntValue), str3);
            this.read.put(str3, Integer.valueOf(iIntValue));
        }
    }

    public final <O> boolean dispatchResult(int i, O o2) {
        String str = this.RatingCompat.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        onConfigurationChanged onconfigurationchanged = this.IconCompatParcelizer.get(str);
        if ((onconfigurationchanged != null ? onconfigurationchanged.write : null) == null) {
            this.MediaDescriptionCompat.remove(str);
            this.MediaBrowserCompatMediaItem.put(str, o2);
            return true;
        }
        getNavigationEventDispatcher getnavigationeventdispatcher = onconfigurationchanged.write;
        if (!this.write.remove(str)) {
            return true;
        }
        getnavigationeventdispatcher.onActivityResult(o2);
        return true;
    }

    public final <I, O> onBackPressed register(String str, onNewIntent onnewintent, getNavigationEventDispatcher getnavigationeventdispatcher) {
        str.getClass();
        onnewintent.getClass();
        getnavigationeventdispatcher.getClass();
        registerKey(str);
        this.IconCompatParcelizer.put(str, new onConfigurationChanged(onnewintent, getnavigationeventdispatcher));
        if (this.MediaBrowserCompatMediaItem.containsKey(str)) {
            Object obj = this.MediaBrowserCompatMediaItem.get(str);
            this.MediaBrowserCompatMediaItem.remove(str);
            getnavigationeventdispatcher.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) SQLite.read(this.MediaDescriptionCompat, str, ActivityResult.class);
        if (activityResult != null) {
            this.MediaDescriptionCompat.remove(str);
            getnavigationeventdispatcher.onActivityResult(onnewintent.serializer(activityResult.write, activityResult.RemoteActionCompatParcelizer));
        }
        return new onCreatePanelMenu(this, str, onnewintent, 1);
    }
}
