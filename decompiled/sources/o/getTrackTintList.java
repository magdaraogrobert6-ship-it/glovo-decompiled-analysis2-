package o;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getTrackTintList implements setSplitTrack {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Object serializer;

    public getTrackTintList(Object obj) {
        this.serializer = (DynamicRangeProfiles) obj;
    }

    @Override // o.setSplitTrack
    public DynamicRangeProfiles ap_() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) this.serializer;
        int i4 = i2 + 103;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return dynamicRangeProfiles;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getTrackTintList(Object obj, boolean z) {
        this.serializer = obj;
    }

    @Override // o.setSplitTrack
    public Set serializer() {
        int i = 2 % 2;
        int i2 = write + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setSerializer = serializer(((DynamicRangeProfiles) this.serializer).getSupportedProfiles());
        int i4 = IconCompatParcelizer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return setSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1 r3
  0x0029: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v8 java.lang.Object) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r3v3 java.lang.Long) = (r3v2 java.lang.Long), (r3v7 java.lang.Long) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setSplitTrack
    public Set read(getNavigationIcon getnavigationicon) {
        Object obj;
        Long lAm_;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 33;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = false;
        if (i3 % 2 != 0) {
            obj = this.serializer;
            lAm_ = setEnforceSwitchWidth.am_(getnavigationicon, (DynamicRangeProfiles) obj);
            int i4 = 24 / 0;
            if (lAm_ != null) {
                i = write + 45;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    z = true;
                }
            }
        } else {
            obj = this.serializer;
            lAm_ = setEnforceSwitchWidth.am_(getnavigationicon, (DynamicRangeProfiles) obj);
            if (lAm_ != null) {
                i = write + 45;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    z = true;
                }
            }
        }
        coil3.util.UtilsKt.IconCompatParcelizer("DynamicRange is not supported: " + getnavigationicon, z);
        return serializer(((DynamicRangeProfiles) obj).getProfileCaptureRequestConstraints(lAm_.longValue()));
    }

    public static getTrackTintList serializer(getThumbTintList getthumbtintlist) {
        getTrackTintList gettracktintlist;
        DynamicRangeProfiles dynamicRangeProfilesAj_;
        int i = 2 % 2;
        int i2 = write + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 || (dynamicRangeProfilesAj_ = getTrackDrawable.aj_(getthumbtintlist.write(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) == null) {
            gettracktintlist = null;
        } else {
            boolean z = false;
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i4 >= 33);
            gettracktintlist = new getTrackTintList(new getTrackTintList(dynamicRangeProfilesAj_), z);
        }
        if (gettracktintlist != null) {
            return gettracktintlist;
        }
        getTrackTintList gettracktintlist2 = getTrackTintMode.write;
        int i5 = write + 69;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return gettracktintlist2;
    }

    public static Set serializer(Set set) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            set.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (set.isEmpty()) {
            int i3 = write + 51;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            getNavigationIcon getnavigationicon = (getNavigationIcon) setEnforceSwitchWidth.read.get(l);
            if (getnavigationicon == null) {
                setInflatedId.read("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
                int i5 = IconCompatParcelizer + 63;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            if (getnavigationicon != null) {
                hashSet.add(getnavigationicon);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Object write(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        Object next;
        String str2;
        int i = 2 % 2;
        str.getClass();
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str);
        intent.putExtra("key_language_to", java.util.Locale.getDefault().getLanguage());
        int i2 = Build.VERSION.SDK_INT;
        Application application = (Application) this.serializer;
        if (i2 >= 33) {
            int i3 = write + 45;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            listQueryIntentActivities = (i3 % 2 == 0 ? application.getPackageManager() : application.getPackageManager()).queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
        } else {
            listQueryIntentActivities = application.getPackageManager().queryIntentActivities(intent, 0);
            int i4 = IconCompatParcelizer + 37;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
        }
        listQueryIntentActivities.getClass();
        Iterator<T> it = listQueryIntentActivities.iterator();
        int i6 = write + 125;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str2 = ((ResolveInfo) next).activityInfo.packageName;
            str2.getClass();
        } while (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "com.google.android.apps.translate", false));
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            return new isItemDismissable(new IllegalStateException("Google Translate could not be found"));
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        int i8 = write + 27;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return intent;
    }
}
