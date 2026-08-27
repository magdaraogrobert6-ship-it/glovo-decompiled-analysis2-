package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AlertControllerButtonHandler implements Menu {
    private static byte r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = 0;
    private static int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 1;
    public static final int[] read;
    public Drawable MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public CharSequence MediaMetadataCompat;
    public final ArrayList ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public Keep RatingCompat;
    public IntentSenderRequest RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public final ArrayList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Resources r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ArrayList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ArrayList serializer;
    public final Context write;
    public int IconCompatParcelizer = 0;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
    public boolean MediaSessionCompatToken = false;
    public boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
    public boolean MediaSessionCompatResultReceiverWrapper = false;
    public final ArrayList r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ArrayList();
    public final CopyOnWriteArrayList ComponentActivity = new CopyOnWriteArrayList();
    public boolean MediaSessionCompatQueueItem = false;

    static {
        MediaSessionCompatQueueItem();
        read = new int[]{1, 4, 5, 3, 2, 0};
    }

    public AlertControllerButtonHandler IconCompatParcelizer() {
        return this;
    }

    public final void MediaBrowserCompatMediaItem() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
        if (this.MediaSessionCompatToken) {
            this.MediaSessionCompatToken = false;
            write(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
    }

    public boolean MediaMetadataCompat() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public boolean RatingCompat() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final void clearHeader() {
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = null;
        this.MediaDescriptionCompat = null;
        write(false);
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return read(i, keyEvent) != null;
    }

    public final void read(boolean z) {
        this.ResultReceiver = z;
    }

    public boolean read() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.MediaSessionCompatQueueItem = z;
    }

    public void write(IntentSenderRequest intentSenderRequest) {
        this.RemoteActionCompatParcelizer = intentSenderRequest;
    }

    public boolean IconCompatParcelizer(Keep keep) {
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
        boolean zWrite = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        MediaDescriptionCompat();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            getResources getresources = (getResources) weakReference.get();
            if (getresources != null) {
                zWrite = getresources.write(keep);
                if (zWrite) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        MediaBrowserCompatMediaItem();
        if (zWrite) {
            this.RatingCompat = keep;
        }
        return zWrite;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        boolean z = this.PlaybackStateCompatCustomAction;
        ArrayList arrayList = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.ParcelableVolumeInfo;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            Keep keep = (Keep) arrayList2.get(i);
            if (keep.isVisible()) {
                arrayList.add(keep);
            }
        }
        this.PlaybackStateCompatCustomAction = false;
        this.PlaybackStateCompat = true;
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        int size = this.ParcelableVolumeInfo.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((onNightModeChanged) item.getSubMenu()).RemoteActionCompatParcelizer(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(write(), sparseArray);
        }
    }

    public final void RemoteActionCompatParcelizer(getResources getresources, Context context) {
        this.ComponentActivity.add(new java.lang.ref.WeakReference(getresources));
        getresources.IconCompatParcelizer(context, this);
        this.PlaybackStateCompat = true;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.write.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            Keep keepIconCompatParcelizer = IconCompatParcelizer(i, i2, i3, resolveInfo.loadLabel(packageManager));
            keepIconCompatParcelizer.setIcon(resolveInfo.loadIcon(packageManager));
            keepIconCompatParcelizer.ParcelableVolumeInfo = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = keepIconCompatParcelizer;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keep keep = (Keep) arrayList.get(i2);
            if (keep.MediaSessionCompatToken == i) {
                return keep;
            }
            if (keep.hasSubMenu() && (menuItemFindItem = keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.ParcelableVolumeInfo.get(i);
    }

    public final Keep read(int i, android.view.KeyEvent keyEvent) {
        ArrayList arrayList = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        arrayList.clear();
        serializer(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (Keep) arrayList.get(0);
        }
        boolean zRatingCompat = RatingCompat();
        for (int i2 = 0; i2 < size; i2++) {
            Keep keep = (Keep) arrayList.get(i2);
            char c = zRatingCompat ? keep.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : keep.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zRatingCompat && c == '\b' && i == 67))) {
                return keep;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((Keep) arrayList.get(i2)).MediaSessionCompatQueueItem == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2 - i2 && ((Keep) arrayList.get(i2)).MediaSessionCompatQueueItem == i; i3++) {
                if (i2 >= 0 && i2 < arrayList.size()) {
                    arrayList.remove(i2);
                }
            }
            write(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((Keep) arrayList.get(i2)).MediaSessionCompatToken == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        write(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keep keep = (Keep) arrayList.get(i2);
            if (keep.MediaSessionCompatQueueItem == i) {
                keep.RatingCompat = (keep.RatingCompat & (-5)) | (z2 ? 4 : 0);
                keep.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keep keep = (Keep) arrayList.get(i2);
            if (keep.MediaSessionCompatQueueItem == i) {
                keep.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            Keep keep = (Keep) arrayList.get(i2);
            if (keep.MediaSessionCompatQueueItem == i) {
                int i3 = keep.RatingCompat;
                int i4 = (z ? 0 : 8) | (i3 & (-9));
                keep.RatingCompat = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            write(true);
        }
    }

    @Override // android.view.Menu
    public final int size() {
        return this.ParcelableVolumeInfo.size();
    }

    public String write() {
        return "android:menu:actionviewstates";
    }

    public final void write(getResources getresources) {
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            getResources getresources2 = (getResources) weakReference.get();
            if (getresources2 == null || getresources2 == getresources) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public boolean write(Keep keep) {
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
        boolean zRemoteActionCompatParcelizer = false;
        if (!copyOnWriteArrayList.isEmpty() && this.RatingCompat == keep) {
            MediaDescriptionCompat();
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                getResources getresources = (getResources) weakReference.get();
                if (getresources != null) {
                    zRemoteActionCompatParcelizer = getresources.RemoteActionCompatParcelizer(keep);
                    if (zRemoteActionCompatParcelizer) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            MediaBrowserCompatMediaItem();
            if (zRemoteActionCompatParcelizer) {
                this.RatingCompat = null;
            }
        }
        return zRemoteActionCompatParcelizer;
    }

    public final void serializer(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(write());
        int size = this.ParcelableVolumeInfo.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((onNightModeChanged) item.getSubMenu()).serializer(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = z;
        write(false);
    }

    public AlertControllerButtonHandler(Context context) {
        boolean z = false;
        this.write = context;
        Resources resources = context.getResources();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = resources;
        this.ParcelableVolumeInfo = new ArrayList();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ArrayList();
        this.PlaybackStateCompatCustomAction = true;
        this.serializer = new ArrayList();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ArrayList();
        this.PlaybackStateCompat = true;
        if (resources.getConfiguration().keyboard != 1 && android.view.ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = z;
    }

    @Override // android.view.Menu
    public final void clear() {
        Keep keep = this.RatingCompat;
        if (keep != null) {
            write(keep);
        }
        this.ParcelableVolumeInfo.clear();
        write(true);
    }

    public final void serializer() {
        ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (this.PlaybackStateCompat) {
            CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
            boolean z = false;
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                getResources getresources = (getResources) weakReference.get();
                if (getresources == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= getresources.read();
                }
            }
            ArrayList arrayList = this.serializer;
            ArrayList arrayList2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListRemoteActionCompatParcelizer.size();
                for (int i = 0; i < size; i++) {
                    Keep keep = (Keep) arrayListRemoteActionCompatParcelizer.get(i);
                    if ((keep.RatingCompat & 32) == 32) {
                        arrayList.add(keep);
                    } else {
                        arrayList2.add(keep);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(RemoteActionCompatParcelizer());
            }
            this.PlaybackStateCompat = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    public final void serializer(List list, int i, android.view.KeyEvent keyEvent) {
        boolean zRatingCompat = RatingCompat();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.ParcelableVolumeInfo;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Keep keep = (Keep) arrayList.get(i2);
                if (keep.hasSubMenu()) {
                    keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.serializer(list, i, keyEvent);
                }
                char c = zRatingCompat ? keep.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : keep.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                if ((modifiers & 69647) == ((zRatingCompat ? keep.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : keep.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zRatingCompat && c == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (keep.isEnabled()) {
                        list.add(keep);
                    }
                }
            }
        }
    }

    public boolean serializer(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        IntentSenderRequest intentSenderRequest = this.RemoteActionCompatParcelizer;
        return intentSenderRequest != null && intentSenderRequest.read(alertControllerButtonHandler, menuItem);
    }

    public final void MediaDescriptionCompat() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        this.MediaSessionCompatToken = false;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean RemoteActionCompatParcelizer(MenuItem menuItem, getResources getresources, int i) {
        attachBaseContext attachbasecontext;
        boolean zExpandActionView;
        attachBaseContext attachbasecontext2;
        boolean z;
        onNightModeChanged onnightmodechanged;
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList;
        getResources getresources2;
        Keep keep = (Keep) menuItem;
        boolean zRemoteActionCompatParcelizer = false;
        if (keep == null || !keep.isEnabled()) {
            return false;
        }
        AlertControllerButtonHandler alertControllerButtonHandler = keep.ResultReceiver;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = keep.write;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(keep)) && !alertControllerButtonHandler.serializer(alertControllerButtonHandler, keep)) {
            Intent intent = keep.ParcelableVolumeInfo;
            if (intent != null) {
                try {
                    alertControllerButtonHandler.write.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    SentryLogcatAdapter.read("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    attachbasecontext = keep.IconCompatParcelizer;
                    if (attachbasecontext == null) {
                    }
                    zExpandActionView = false;
                    attachbasecontext2 = keep.IconCompatParcelizer;
                    if (attachbasecontext2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (keep.IconCompatParcelizer()) {
                        zExpandActionView |= keep.expandActionView();
                        if (zExpandActionView) {
                            RemoteActionCompatParcelizer(true);
                        }
                    } else if (keep.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            RemoteActionCompatParcelizer(false);
                        }
                        if (!keep.hasSubMenu()) {
                            onNightModeChanged onnightmodechanged2 = new onNightModeChanged(this.write, this, keep);
                            keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = onnightmodechanged2;
                            onnightmodechanged2.setHeaderTitle(keep.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                        }
                        onnightmodechanged = keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        if (z) {
                            attachbasecontext2.RemoteActionCompatParcelizer.onPrepareSubMenu(onnightmodechanged);
                        }
                        copyOnWriteArrayList = this.ComponentActivity;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (getresources != null) {
                            }
                            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                                getresources2 = (getResources) weakReference.get();
                                if (getresources2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zRemoteActionCompatParcelizer) {
                                    zRemoteActionCompatParcelizer = getresources2.RemoteActionCompatParcelizer(onnightmodechanged);
                                }
                            }
                        }
                        zExpandActionView |= zRemoteActionCompatParcelizer;
                        if (!zExpandActionView) {
                            RemoteActionCompatParcelizer(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            RemoteActionCompatParcelizer(false);
                        }
                        if (!keep.hasSubMenu()) {
                            onNightModeChanged onnightmodechanged3 = new onNightModeChanged(this.write, this, keep);
                            keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = onnightmodechanged3;
                            onnightmodechanged3.setHeaderTitle(keep.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                        }
                        onnightmodechanged = keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        if (z) {
                            attachbasecontext2.RemoteActionCompatParcelizer.onPrepareSubMenu(onnightmodechanged);
                        }
                        copyOnWriteArrayList = this.ComponentActivity;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zRemoteActionCompatParcelizer = getresources != null ? getresources.RemoteActionCompatParcelizer(onnightmodechanged) : false;
                            while (r8.hasNext()) {
                                getresources2 = (getResources) weakReference.get();
                                if (getresources2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zRemoteActionCompatParcelizer) {
                                    zRemoteActionCompatParcelizer = getresources2.RemoteActionCompatParcelizer(onnightmodechanged);
                                }
                            }
                        }
                        zExpandActionView |= zRemoteActionCompatParcelizer;
                        if (!zExpandActionView) {
                            RemoteActionCompatParcelizer(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                attachbasecontext = keep.IconCompatParcelizer;
                if (attachbasecontext == null && attachbasecontext.RemoteActionCompatParcelizer.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        attachbasecontext2 = keep.IconCompatParcelizer;
        if (attachbasecontext2 == null && attachbasecontext2.RemoteActionCompatParcelizer.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (keep.IconCompatParcelizer()) {
            zExpandActionView |= keep.expandActionView();
            if (zExpandActionView) {
                RemoteActionCompatParcelizer(true);
            }
        } else if (keep.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                RemoteActionCompatParcelizer(false);
            }
            if (!keep.hasSubMenu()) {
                onNightModeChanged onnightmodechanged4 = new onNightModeChanged(this.write, this, keep);
                keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = onnightmodechanged4;
                onnightmodechanged4.setHeaderTitle(keep.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            }
            onnightmodechanged = keep.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (z) {
                attachbasecontext2.RemoteActionCompatParcelizer.onPrepareSubMenu(onnightmodechanged);
            }
            copyOnWriteArrayList = this.ComponentActivity;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (getresources != null) {
                }
                while (r8.hasNext()) {
                    getresources2 = (getResources) weakReference.get();
                    if (getresources2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zRemoteActionCompatParcelizer) {
                        zRemoteActionCompatParcelizer = getresources2.RemoteActionCompatParcelizer(onnightmodechanged);
                    }
                }
            }
            zExpandActionView |= zRemoteActionCompatParcelizer;
            if (!zExpandActionView) {
                RemoteActionCompatParcelizer(true);
            }
        } else if ((i & 1) == 0) {
            RemoteActionCompatParcelizer(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.ResultReceiver) {
            return true;
        }
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Keep) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return RemoteActionCompatParcelizer(findItem(i), null, i2);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = true;
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            getResources getresources = (getResources) weakReference.get();
            if (getresources == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                getresources.IconCompatParcelizer(this, z);
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        Keep keepIconCompatParcelizer = IconCompatParcelizer(i, i2, i3, charSequence);
        onNightModeChanged onnightmodechanged = new onNightModeChanged(this.write, this, keepIconCompatParcelizer);
        keepIconCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = onnightmodechanged;
        onnightmodechanged.setHeaderTitle(keepIconCompatParcelizer.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        return onnightmodechanged;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        Keep keep = read(i, keyEvent);
        boolean zRemoteActionCompatParcelizer = keep != null ? RemoteActionCompatParcelizer(keep, null, i2) : false;
        if ((i2 & 2) != 0) {
            RemoteActionCompatParcelizer(true);
        }
        return zRemoteActionCompatParcelizer;
    }

    public final void write(boolean z) {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            this.MediaSessionCompatToken = true;
            if (z) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
                return;
            }
            return;
        }
        if (z) {
            this.PlaybackStateCompatCustomAction = true;
            this.PlaybackStateCompat = true;
        }
        CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.ComponentActivity;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        MediaDescriptionCompat();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            getResources getresources = (getResources) weakReference.get();
            if (getresources == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                getresources.MediaDescriptionCompat();
            }
        }
        MediaBrowserCompatMediaItem();
    }

    public final Keep IconCompatParcelizer(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (read[i5] << 16) | (65535 & i3);
            Keep keep = new Keep(this, i, i2, i3, i6, charSequence, this.IconCompatParcelizer);
            ArrayList arrayList = this.ParcelableVolumeInfo;
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    i4 = 0;
                }
                arrayList.add(i4, keep);
                write(true);
                return keep;
            } while (((Keep) arrayList.get(size)).r8lambda54BeH8ZsBru0CXI2CCSP2syNys > i6);
            i4 = size + 1;
            arrayList.add(i4, keep);
            write(true);
            return keep;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("order does not contain a valid category.");
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        int i2 = 2 % 2;
        String string = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getString(i);
        if (string.startsWith("%('")) {
            int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 1;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 5;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Keep keepIconCompatParcelizer = IconCompatParcelizer(0, 0, 0, string);
        int i7 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 111;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return keepIconCompatParcelizer;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return IconCompatParcelizer(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return IconCompatParcelizer(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        String string = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getString(i4);
        if (string.startsWith("%('")) {
            int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 45;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
            int i8 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 77;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 4 % 3;
            }
        }
        return IconCompatParcelizer(i, i2, i3, string);
    }

    public final void RemoteActionCompatParcelizer(getResources getresources) {
        RemoteActionCompatParcelizer(getresources, this.write);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 33;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String string = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getString(i);
        if (string.startsWith("%('")) {
            int i5 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 123;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String strSubstring = string.substring(3);
            Object[] objArr = new Object[1];
            if (i6 == 0) {
                a(strSubstring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            a(strSubstring, objArr);
            string = ((String) objArr[0]).intern();
        }
        return addSubMenu(0, 0, 0, string);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        String string = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getString(i4);
        if (!(!string.startsWith("%('"))) {
            int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 65;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        SubMenu subMenuAddSubMenu = addSubMenu(i, i2, i3, string);
        int i8 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 49;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return subMenuAddSubMenu;
        }
        throw null;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final void IconCompatParcelizer(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        CharSequence charSequence2;
        String strIntern;
        int i3 = 2 % 2;
        if (view != null) {
            int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 33;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.MediaDescriptionCompat = view;
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompatMediaItem = null;
        } else {
            if (i > 0) {
                int i6 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 25;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                Resources resources = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                String string = resources.getString(i);
                if (!(!string.startsWith("%('"))) {
                    int i8 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 27;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        charSequence2 = string;
                        Object[] objArr = new Object[1];
                        a(string.substring(3), objArr);
                        ((String) objArr[0]).intern();
                        boolean z = resources.getText(i) instanceof Spanned;
                        throw null;
                    }
                    Object[] objArr2 = new Object[1];
                    a(string.substring(3), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    CharSequence text = resources.getText(i);
                    if (text instanceof Spanned) {
                        charSequence2 = string;
                        charSequence2 = strIntern;
                        SpannableString spannableString = new SpannableString(strIntern);
                        TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                        charSequence2 = spannableString;
                    }
                }
                charSequence2 = string;
                charSequence2 = strIntern;
                charSequence2 = string;
                this.MediaMetadataCompat = charSequence2;
            } else if (charSequence != null) {
                this.MediaMetadataCompat = charSequence;
            }
            if (i2 > 0) {
                this.MediaBrowserCompatMediaItem = this.write.getDrawable(i2);
            } else if (drawable != null) {
                this.MediaBrowserCompatMediaItem = drawable;
            }
            this.MediaDescriptionCompat = null;
        }
        write(false);
    }

    @Override // android.view.Menu
    public final void close() {
        RemoteActionCompatParcelizer(true);
    }

    static void MediaSessionCompatQueueItem() {
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (byte) -112;
    }
}
