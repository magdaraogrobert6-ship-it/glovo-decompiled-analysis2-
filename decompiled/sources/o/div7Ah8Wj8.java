package o;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView$1;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.div7Ah8Wj8;

/* JADX INFO: loaded from: classes.dex */
public abstract class div7Ah8Wj8 {
    public ArrayList MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final io.sentry.hints.PlaybackStateCompatCustomAction MediaMetadataCompat;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public isEllipse PlaybackStateCompat;
    public getSafeInnerRect RemoteActionCompatParcelizer;
    public androidx.fragment.app.Fragment _init_lambda3;
    public onBackPressed _init_lambda4;
    public boolean addObserverForBackInvoker;
    public ArrayList addObserverForBackInvokerlambda0;
    public onBackPressed createFullyDrawnExecutor;
    public onBackPressed defaultViewModelProviderFactory_delegatelambda0;
    public boolean ensureViewModelStore;
    public ArrayList getSavedStateRegistryControllerannotations;
    public ArrayList menuHostHelperlambda0;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public defaultViewModelProviderFactory_delegatelambda0 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public getZeroNHjbRc r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public androidx.fragment.app.Fragment r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final translateUv8p0NA r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final translateUv8p0NA r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final translateUv8p0NA r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final translateUv8p0NA r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final ArrayList _init_lambda2 = new ArrayList();
    public final isSpecifieduvyYCjk PlaybackStateCompatCustomAction = new isSpecifieduvyYCjk();
    public ArrayList serializer = new ArrayList();
    public final copyxjbvk4A r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new copyxjbvk4A(this);
    public isInfiniteannotations fullyDrawnReporter_delegatelambda0 = null;
    public boolean ParcelableVolumeInfo = false;
    public final getMaxDimensionimpl r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new getMaxDimensionimpl(this);
    public final AtomicInteger read = new AtomicInteger();
    public final Map IconCompatParcelizer = Collections.synchronizedMap(new HashMap());
    public final Map _init_lambda1 = Collections.synchronizedMap(new HashMap());
    public final Map accessensureViewModelStore = Collections.synchronizedMap(new HashMap());
    public final ArrayList write = new ArrayList();
    public final CardView$1 ResultReceiver = new CardView$1(this);
    public final CopyOnWriteArrayList r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new CopyOnWriteArrayList();
    public final getMinDimensionannotations r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getMinDimensionannotations(this);
    public int RatingCompat = -1;
    public final getMaxDimensionannotations ComponentActivity = new getMaxDimensionannotations(this);
    public ArrayDeque r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayDeque();
    public final component6kKHJgLs MediaSessionCompatQueueItem = new component6kKHJgLs(1, this);

    public final boolean IconCompatParcelizer(int i, int i2) {
        RemoteActionCompatParcelizer(false);
        read(true);
        androidx.fragment.app.Fragment fragment = this._init_lambda3;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().MediaSessionCompatResultReceiverWrapper()) {
            return true;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations, null, i, i2);
        if (zRemoteActionCompatParcelizer) {
            this.MediaSessionCompatResultReceiverWrapper = true;
            try {
                serializer(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
                serializer();
            } catch (Throwable th) {
                serializer();
                throw th;
            }
        }
        ParcelableVolumeInfo();
        boolean z = this.MediaSessionCompatToken;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        if (z) {
            this.MediaSessionCompatToken = false;
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : isspecifieduvyycjk.read()) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                if (fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                    if (this.MediaSessionCompatResultReceiverWrapper) {
                        this.MediaSessionCompatToken = true;
                    } else {
                        fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
                        isspecifieduvyycjkannotations.MediaDescriptionCompat();
                    }
                }
            }
        }
        isspecifieduvyycjk.write.values().removeAll(Collections.singleton(null));
        return zRemoteActionCompatParcelizer;
    }

    public final void MediaMetadataCompat(androidx.fragment.app.Fragment fragment) {
        if (RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragment);
        }
        if (fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            return;
        }
        fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
        if (fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            if (RemoteActionCompatParcelizer(2)) {
                fragment.toString();
            }
            isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
            synchronized (isspecifieduvyycjk.RemoteActionCompatParcelizer) {
                isspecifieduvyycjk.RemoteActionCompatParcelizer.remove(fragment);
            }
            fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
            if (read(fragment)) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            }
            MediaSessionCompatResultReceiverWrapper(fragment);
        }
    }

    public final void MediaSessionCompatQueueItem(androidx.fragment.app.Fragment fragment) {
        if (RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ && zIsInBackStack) {
            return;
        }
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        synchronized (isspecifieduvyycjk.RemoteActionCompatParcelizer) {
            isspecifieduvyycjk.RemoteActionCompatParcelizer.remove(fragment);
        }
        fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        if (read(fragment)) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        }
        fragment.onBackPressedDispatcher_delegatelambda010 = true;
        MediaSessionCompatResultReceiverWrapper(fragment);
    }

    public final void serializer() {
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.getSavedStateRegistryControllerannotations.clear();
        this.menuHostHelperlambda0.clear();
    }

    public final void serializer(androidx.fragment.app.Fragment fragment) {
        if (RemoteActionCompatParcelizer(2)) {
            Objects.toString(fragment);
        }
        if (fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
            if (fragment.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                return;
            }
            this.PlaybackStateCompatCustomAction.read(fragment);
            if (RemoteActionCompatParcelizer(2)) {
                fragment.toString();
            }
            if (read(fragment)) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[LOOP:1: B:13:0x003d->B:15:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final void write() {
        boolean zIsChangingConfigurations;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        onBackPressed onbackpressed;
        Iterator it;
        Iterator it2;
        this.MediaDescriptionCompat = true;
        RemoteActionCompatParcelizer(true);
        read();
        isEllipse isellipse = this.PlaybackStateCompat;
        boolean z = isellipse instanceof asFrameworkPaint;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        if (!z) {
            androidx.fragment.app.FragmentActivity fragmentActivity = isellipse.RemoteActionCompatParcelizer;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            } else {
                it = this.IconCompatParcelizer.values().iterator();
                while (it.hasNext()) {
                    it2 = ((androidx.fragment.app.BackStackState) it.next()).serializer.iterator();
                    while (it2.hasNext()) {
                        isspecifieduvyycjk.serializer.read((String) it2.next(), false);
                    }
                }
            }
            IconCompatParcelizer(-1);
            obj = this.PlaybackStateCompat;
            if (obj instanceof moveFocus3ESFkO8) {
                ((moveFocus3ESFkO8) obj).removeOnTrimMemoryListener(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            }
            obj2 = this.PlaybackStateCompat;
            if (obj2 instanceof focusModifier) {
                ((focusModifier) obj2).removeOnConfigurationChangedListener(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            }
            obj3 = this.PlaybackStateCompat;
            if (obj3 instanceof toFocusDirection) {
                ((toFocusDirection) obj3).removeOnMultiWindowModeChangedListener(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            }
            obj4 = this.PlaybackStateCompat;
            if (obj4 instanceof toFocusDirectionZmokQxo) {
                ((toFocusDirectionZmokQxo) obj4).removeOnPictureInPictureModeChangedListener(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            }
            obj5 = this.PlaybackStateCompat;
            if ((obj5 instanceof setOnExit) && this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
                ((setOnExit) obj5).removeMenuProvider(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            }
            this.PlaybackStateCompat = null;
            this.RemoteActionCompatParcelizer = null;
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.remove();
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
            }
            onbackpressed = this.createFullyDrawnExecutor;
            if (onbackpressed != null) {
                onbackpressed.serializer();
                this.defaultViewModelProviderFactory_delegatelambda0.serializer();
                this._init_lambda4.serializer();
            }
        }
        zIsChangingConfigurations = isspecifieduvyycjk.serializer.serializer;
        if (zIsChangingConfigurations) {
            it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                it2 = ((androidx.fragment.app.BackStackState) it.next()).serializer.iterator();
                while (it2.hasNext()) {
                    isspecifieduvyycjk.serializer.read((String) it2.next(), false);
                }
            }
        }
        IconCompatParcelizer(-1);
        obj = this.PlaybackStateCompat;
        if (obj instanceof moveFocus3ESFkO8) {
            ((moveFocus3ESFkO8) obj).removeOnTrimMemoryListener(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
        obj2 = this.PlaybackStateCompat;
        if (obj2 instanceof focusModifier) {
            ((focusModifier) obj2).removeOnConfigurationChangedListener(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        obj3 = this.PlaybackStateCompat;
        if (obj3 instanceof toFocusDirection) {
            ((toFocusDirection) obj3).removeOnMultiWindowModeChangedListener(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
        obj4 = this.PlaybackStateCompat;
        if (obj4 instanceof toFocusDirectionZmokQxo) {
            ((toFocusDirectionZmokQxo) obj4).removeOnPictureInPictureModeChangedListener(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
        obj5 = this.PlaybackStateCompat;
        if (obj5 instanceof setOnExit) {
            ((setOnExit) obj5).removeMenuProvider(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        this.PlaybackStateCompat = null;
        this.RemoteActionCompatParcelizer = null;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.remove();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        }
        onbackpressed = this.createFullyDrawnExecutor;
        if (onbackpressed != null) {
            onbackpressed.serializer();
            this.defaultViewModelProviderFactory_delegatelambda0.serializer();
            this._init_lambda4.serializer();
        }
    }

    public static boolean RemoteActionCompatParcelizer(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static HashSet serializer(isInfiniteannotations isinfiniteannotations) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.size(); i++) {
            androidx.fragment.app.Fragment fragment = ((timesd16Qtg0) isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.get(i)).serializer;
            if (fragment != null && isinfiniteannotations.write) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public final HashSet IconCompatParcelizer(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((isInfiniteannotations) arrayList.get(i)).MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = ((timesd16Qtg0) it.next()).serializer;
                if (fragment != null && (viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                    hashSet.add(isFiniteannotations.read(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final isSpecifieduvyYCjkannotations IconCompatParcelizer(androidx.fragment.app.Fragment fragment) {
        String str = fragment.getViewModelStore;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = (isSpecifieduvyYCjkannotations) isspecifieduvyycjk.write.get(str);
        if (isspecifieduvyycjkannotations != null) {
            return isspecifieduvyycjkannotations;
        }
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations2 = new isSpecifieduvyYCjkannotations(this.ResultReceiver, isspecifieduvyycjk, fragment);
        isspecifieduvyycjkannotations2.write(this.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader());
        isspecifieduvyycjkannotations2.read = this.RatingCompat;
        return isspecifieduvyycjkannotations2;
    }

    public final void IconCompatParcelizer() {
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer();
            }
        }
    }

    public final void IconCompatParcelizer(int i) {
        try {
            this.MediaSessionCompatResultReceiverWrapper = true;
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : this.PlaybackStateCompatCustomAction.write.values()) {
                if (isspecifieduvyycjkannotations != null) {
                    isspecifieduvyycjkannotations.read = i;
                }
            }
            read(i, false);
            Iterator it = RemoteActionCompatParcelizer().iterator();
            while (it.hasNext()) {
                ((isFiniteannotations) it.next()).RemoteActionCompatParcelizer();
            }
            this.MediaSessionCompatResultReceiverWrapper = false;
            RemoteActionCompatParcelizer(true);
        } catch (Throwable th) {
            this.MediaSessionCompatResultReceiverWrapper = false;
            throw th;
        }
    }

    public final void MediaBrowserCompatMediaItem(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.PlaybackStateCompatCustomAction.IconCompatParcelizer(fragment.getViewModelStore)) || (fragment._init_lambda4 != null && fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != this)) {
                getOffVariationName.read("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        androidx.fragment.app.Fragment fragment2 = this._init_lambda3;
        this._init_lambda3 = fragment;
        MediaDescriptionCompat(fragment2);
        MediaDescriptionCompat(this._init_lambda3);
    }

    public final void MediaDescriptionCompat(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.PlaybackStateCompatCustomAction.IconCompatParcelizer(fragment.getViewModelStore))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void MediaSessionCompatToken() {
        synchronized (this._init_lambda2) {
            if (this._init_lambda2.size() == 1) {
                this.PlaybackStateCompat.serializer.removeCallbacks(this.MediaSessionCompatQueueItem);
                this.PlaybackStateCompat.serializer.post(this.MediaSessionCompatQueueItem);
                ParcelableVolumeInfo();
            }
        }
    }

    public final void ParcelableVolumeInfo() {
        synchronized (this._init_lambda2) {
            if (!this._init_lambda2.isEmpty()) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setEnabled(true);
                if (RemoteActionCompatParcelizer(3)) {
                    toString();
                }
            } else {
                boolean z = this.serializer.size() + (this.fullyDrawnReporter_delegatelambda0 != null ? 1 : 0) > 0 && RemoteActionCompatParcelizer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                if (RemoteActionCompatParcelizer(3)) {
                    toString();
                }
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setEnabled(z);
            }
        }
    }

    public final Bundle PlaybackStateCompatCustomAction() {
        androidx.fragment.app.BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        MediaMetadataCompat();
        read();
        RemoteActionCompatParcelizer(true);
        this.ensureViewModelStore = true;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = true;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        isspecifieduvyycjk.getClass();
        HashMap map = isspecifieduvyycjk.write;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : map.values()) {
            if (isspecifieduvyycjkannotations != null) {
                androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                isspecifieduvyycjk.IconCompatParcelizer(isspecifieduvyycjkannotations.MediaSessionCompatToken(), fragment.getViewModelStore);
                arrayList2.add(fragment.getViewModelStore);
                if (RemoteActionCompatParcelizer(2)) {
                    fragment.toString();
                    Objects.toString(fragment.addOnMultiWindowModeChangedListener);
                }
            }
        }
        HashMap map2 = this.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        if (map2.isEmpty()) {
            RemoteActionCompatParcelizer(2);
            return bundle;
        }
        isSpecifieduvyYCjk isspecifieduvyycjk2 = this.PlaybackStateCompatCustomAction;
        synchronized (isspecifieduvyycjk2.RemoteActionCompatParcelizer) {
            backStackRecordStateArr = null;
            if (isspecifieduvyycjk2.RemoteActionCompatParcelizer.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(isspecifieduvyycjk2.RemoteActionCompatParcelizer.size());
                for (androidx.fragment.app.Fragment fragment2 : isspecifieduvyycjk2.RemoteActionCompatParcelizer) {
                    arrayList.add(fragment2.getViewModelStore);
                    if (RemoteActionCompatParcelizer(2)) {
                        fragment2.toString();
                    }
                }
            }
        }
        int size = this.serializer.size();
        if (size > 0) {
            backStackRecordStateArr = new androidx.fragment.app.BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new androidx.fragment.app.BackStackRecordState((isInfiniteannotations) this.serializer.get(i));
                if (RemoteActionCompatParcelizer(2)) {
                    Objects.toString(this.serializer.get(i));
                }
            }
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = new androidx.fragment.app.FragmentManagerState();
        fragmentManagerState.serializer = arrayList2;
        fragmentManagerState.write = arrayList;
        fragmentManagerState.RemoteActionCompatParcelizer = backStackRecordStateArr;
        fragmentManagerState.IconCompatParcelizer = this.read.get();
        androidx.fragment.app.Fragment fragment3 = this._init_lambda3;
        if (fragment3 != null) {
            fragmentManagerState.MediaMetadataCompat = fragment3.getViewModelStore;
        }
        fragmentManagerState.read.addAll(this.IconCompatParcelizer.keySet());
        fragmentManagerState.MediaDescriptionCompat.addAll(this.IconCompatParcelizer.values());
        fragmentManagerState.RatingCompat = new ArrayList(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this._init_lambda1.keySet()) {
            bundle.putBundle(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("result_", str), (Bundle) this._init_lambda1.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    public final HashSet RemoteActionCompatParcelizer() {
        isFiniteannotations isfiniteannotations;
        HashSet hashSet = new HashSet();
        Iterator it = this.PlaybackStateCompatCustomAction.read().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((isSpecifieduvyYCjkannotations) it.next()).RemoteActionCompatParcelizer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (viewGroup != null) {
                MediaDescriptionCompat().getClass();
                Object tag = viewGroup.getTag(com.logistics.rider.glovo.R.id.special_effects_controller_view_tag);
                if (tag instanceof isFiniteannotations) {
                    isfiniteannotations = (isFiniteannotations) tag;
                } else {
                    isfiniteannotations = new isFiniteannotations(viewGroup);
                    viewGroup.setTag(com.logistics.rider.glovo.R.id.special_effects_controller_view_tag, isfiniteannotations);
                }
                hashSet.add(isfiniteannotations);
            }
        }
        return hashSet;
    }

    public final void RemoteActionCompatParcelizer(FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks, boolean z) {
        CardView$1 cardView$1 = this.ResultReceiver;
        cardView$1.getClass();
        fragmentManager$FragmentLifecycleCallbacks.getClass();
        ((CopyOnWriteArrayList) cardView$1.IconCompatParcelizer).add(new Size(fragmentManager$FragmentLifecycleCallbacks, z));
    }

    public final void RemoteActionCompatParcelizer(getUnspecifiedNHjbRcannotations getunspecifiednhjbrcannotations, boolean z) {
        if (!z) {
            if (this.PlaybackStateCompat == null) {
                if (this.MediaDescriptionCompat) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("FragmentManager has been destroyed");
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (MediaBrowserCompatMediaItem()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this._init_lambda2) {
            if (this.PlaybackStateCompat == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this._init_lambda2.add(getunspecifiednhjbrcannotations);
                MediaSessionCompatToken();
            }
        }
    }

    public final androidx.fragment.app.Fragment findFragmentById(int i) {
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        ArrayList arrayList = isspecifieduvyycjk.RemoteActionCompatParcelizer;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : isspecifieduvyycjk.write.values()) {
                    if (isspecifieduvyycjkannotations != null) {
                        androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                        if (fragment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == i) {
                return fragment2;
            }
        }
    }

    public final androidx.fragment.app.Fragment findFragmentByTag(String str) {
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        ArrayList arrayList = isspecifieduvyycjk.RemoteActionCompatParcelizer;
        if (str != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.addOnUserLeaveHintListener)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : isspecifieduvyycjk.write.values()) {
            if (isspecifieduvyycjkannotations != null) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                if (str.equals(fragment2.addOnUserLeaveHintListener)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void read(androidx.fragment.app.Fragment fragment, toColorLong8_81llA tocolorlong8_81lla) {
        if (fragment.equals(this.PlaybackStateCompatCustomAction.IconCompatParcelizer(fragment.getViewModelStore)) && (fragment._init_lambda4 == null || fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == this)) {
            fragment.getSavedStateRegistryControllerannotations = tocolorlong8_81lla;
        } else {
            getOffVariationName.read("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void read(FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks) {
        CardView$1 cardView$1 = this.ResultReceiver;
        cardView$1.getClass();
        fragmentManager$FragmentLifecycleCallbacks.getClass();
        synchronized (((CopyOnWriteArrayList) cardView$1.IconCompatParcelizer)) {
            int size = ((CopyOnWriteArrayList) cardView$1.IconCompatParcelizer).size();
            for (int i = 0; i < size; i++) {
                if (((Size) ((CopyOnWriteArrayList) cardView$1.IconCompatParcelizer).get(i)).read == fragmentManager$FragmentLifecycleCallbacks) {
                    ((CopyOnWriteArrayList) cardView$1.IconCompatParcelizer).remove(i);
                    break;
                }
            }
        }
    }

    public final void read(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, "    ");
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        ArrayList arrayList = isspecifieduvyycjk.RemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, "    ");
        HashMap map = isspecifieduvyycjk.write;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : map.values()) {
                printWriter.print(str);
                if (isspecifieduvyycjkannotations != null) {
                    androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                    printWriter.println(fragment);
                    fragment.dump(strRemoteActionCompatParcelizer2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.MediaBrowserCompatMediaItem;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) this.MediaBrowserCompatMediaItem.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.serializer.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                isInfiniteannotations isinfiniteannotations = (isInfiniteannotations) this.serializer.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(isinfiniteannotations.toString());
                isinfiniteannotations.write(strRemoteActionCompatParcelizer, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.read.get());
        synchronized (this._init_lambda2) {
            int size4 = this._init_lambda2.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (getUnspecifiedNHjbRcannotations) this._init_lambda2.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.PlaybackStateCompat);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.RemoteActionCompatParcelizer);
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.RatingCompat);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.ensureViewModelStore);
        printWriter.print(" mStopped=");
        printWriter.print(this.addObserverForBackInvoker);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.MediaDescriptionCompat);
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        }
    }

    public final void read(boolean z, Configuration configuration) {
        if (z && (this.PlaybackStateCompat instanceof focusModifier)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(true, configuration);
                }
            }
        }
    }

    public final void read(boolean z, boolean z2) {
        if (z2 && (this.PlaybackStateCompat instanceof toFocusDirectionZmokQxo)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(z, true);
                }
            }
        }
    }

    public final int serializer(String str, int i, boolean z) {
        if (this.serializer.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.serializer.size() - 1;
        }
        int size = this.serializer.size() - 1;
        while (size >= 0) {
            isInfiniteannotations isinfiniteannotations = (isInfiniteannotations) this.serializer.get(size);
            if ((str != null && str.equals(isinfiniteannotations.ParcelableVolumeInfo)) || (i >= 0 && i == isinfiniteannotations.MediaSessionCompatToken)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.serializer.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            isInfiniteannotations isinfiniteannotations2 = (isInfiniteannotations) this.serializer.get(size - 1);
            if ((str == null || !str.equals(isinfiniteannotations2.ParcelableVolumeInfo)) && (i < 0 || i != isinfiniteannotations2.MediaSessionCompatToken)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final void serializer(isInfiniteannotations isinfiniteannotations, boolean z) {
        if (z && (this.PlaybackStateCompat == null || this.MediaDescriptionCompat)) {
            return;
        }
        read(z);
        isInfiniteannotations isinfiniteannotations2 = this.fullyDrawnReporter_delegatelambda0;
        if (isinfiniteannotations2 != null) {
            isinfiniteannotations2.MediaSessionCompatQueueItem = false;
            isinfiniteannotations2.IconCompatParcelizer();
            if (RemoteActionCompatParcelizer(3)) {
                Objects.toString(this.fullyDrawnReporter_delegatelambda0);
                Objects.toString(isinfiniteannotations);
            }
            this.fullyDrawnReporter_delegatelambda0.read(false, false);
            this.fullyDrawnReporter_delegatelambda0.write(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
            Iterator it = this.fullyDrawnReporter_delegatelambda0.MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = ((timesd16Qtg0) it.next()).serializer;
                if (fragment != null) {
                    fragment.getDefaultViewModelCreationExtras = false;
                }
            }
            this.fullyDrawnReporter_delegatelambda0 = null;
        }
        isinfiniteannotations.write(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
        this.MediaSessionCompatResultReceiverWrapper = true;
        try {
            serializer(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
            serializer();
            ParcelableVolumeInfo();
            boolean z2 = this.MediaSessionCompatToken;
            isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
            if (z2) {
                this.MediaSessionCompatToken = false;
                for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : isspecifieduvyycjk.read()) {
                    androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                    if (fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                        if (this.MediaSessionCompatResultReceiverWrapper) {
                            this.MediaSessionCompatToken = true;
                        } else {
                            fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
                            isspecifieduvyycjkannotations.MediaDescriptionCompat();
                        }
                    }
                }
            }
            isspecifieduvyycjk.write.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            serializer();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void write(Bundle bundle, String str) {
        getWidthimpl getwidthimpl = (getWidthimpl) this.accessensureViewModelStore.get(str);
        if (getwidthimpl != null) {
            if (((accessregisterComponentCallback) getwidthimpl.read).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                getwidthimpl.onFragmentResult(bundle, str);
            } else {
                this._init_lambda1.put(str, bundle);
            }
        } else {
            this._init_lambda1.put(str, bundle);
        }
        if (RemoteActionCompatParcelizer(2)) {
            Objects.toString(bundle);
        }
    }

    public final void write(String str) {
        getWidthimpl getwidthimpl = (getWidthimpl) this.accessensureViewModelStore.remove(str);
        if (getwidthimpl != null) {
            getwidthimpl.read.read(getwidthimpl.serializer);
        }
        RemoteActionCompatParcelizer(2);
    }

    public final void write(boolean z) {
        if (z && (this.PlaybackStateCompat instanceof moveFocus3ESFkO8)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(true);
                }
            }
        }
    }

    public final void write(boolean z, boolean z2) {
        if (z2 && (this.PlaybackStateCompat instanceof toFocusDirection)) {
            IconCompatParcelizer(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(z, true);
                }
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        div7Ah8Wj8 div7ah8wj8 = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        return fragment.equals(div7ah8wj8._init_lambda3) && RemoteActionCompatParcelizer(div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        ArrayList arrayList;
        isInfiniteannotations isinfiniteannotations;
        read(z);
        if (!this.ParcelableVolumeInfo && (isinfiniteannotations = this.fullyDrawnReporter_delegatelambda0) != null) {
            isinfiniteannotations.MediaSessionCompatQueueItem = false;
            isinfiniteannotations.IconCompatParcelizer();
            if (RemoteActionCompatParcelizer(3)) {
                Objects.toString(this.fullyDrawnReporter_delegatelambda0);
                Objects.toString(this._init_lambda2);
            }
            this.fullyDrawnReporter_delegatelambda0.read(false, false);
            this._init_lambda2.add(0, this.fullyDrawnReporter_delegatelambda0);
            Iterator it = this.fullyDrawnReporter_delegatelambda0.MediaSessionCompatResultReceiverWrapper.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = ((timesd16Qtg0) it.next()).serializer;
                if (fragment != null) {
                    fragment.getDefaultViewModelCreationExtras = false;
                }
            }
            this.fullyDrawnReporter_delegatelambda0 = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.menuHostHelperlambda0;
            ArrayList arrayList3 = this.getSavedStateRegistryControllerannotations;
            synchronized (this._init_lambda2) {
                if (this._init_lambda2.isEmpty()) {
                    break;
                }
                try {
                    int size = this._init_lambda2.size();
                    int i = 0;
                    boolean zWrite = false;
                    while (true) {
                        arrayList = this._init_lambda2;
                        if (i >= size) {
                            break;
                        }
                        zWrite |= ((getUnspecifiedNHjbRcannotations) arrayList.get(i)).write(arrayList2, arrayList3);
                        i++;
                    }
                    arrayList.clear();
                    this.PlaybackStateCompat.serializer.removeCallbacks(this.MediaSessionCompatQueueItem);
                    if (!zWrite) {
                        break;
                    }
                    this.MediaSessionCompatResultReceiverWrapper = true;
                    try {
                        serializer(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
                        serializer();
                        z2 = true;
                    } catch (Throwable th) {
                        serializer();
                        throw th;
                    }
                } catch (Throwable th2) {
                    this._init_lambda2.clear();
                    this.PlaybackStateCompat.serializer.removeCallbacks(this.MediaSessionCompatQueueItem);
                    throw th2;
                }
            }
        }
        ParcelableVolumeInfo();
        if (this.MediaSessionCompatToken) {
            this.MediaSessionCompatToken = false;
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : this.PlaybackStateCompatCustomAction.read()) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                if (fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                    if (this.MediaSessionCompatResultReceiverWrapper) {
                        this.MediaSessionCompatToken = true;
                    } else {
                        fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
                        isspecifieduvyycjkannotations.MediaDescriptionCompat();
                    }
                }
            }
        }
        this.PlaybackStateCompatCustomAction.write.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public static boolean read(androidx.fragment.app.Fragment fragment) {
        if (fragment.accessensureViewModelStore && fragment.getOnBackPressedInput) {
            return true;
        }
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment2 : fragment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer()) {
            if (fragment2 != null) {
                z = read(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        CardView$1 cardView$1;
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader());
                this._init_lambda1.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        HashMap map2 = isspecifieduvyycjk.IconCompatParcelizer;
        HashMap map3 = isspecifieduvyycjk.write;
        map2.clear();
        map2.putAll(map);
        androidx.fragment.app.FragmentManagerState fragmentManagerState = (androidx.fragment.app.FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.serializer.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cardView$1 = this.ResultReceiver;
            if (!zHasNext) {
                break;
            }
            Bundle bundleIconCompatParcelizer = isspecifieduvyycjk.IconCompatParcelizer(null, (String) it.next());
            if (bundleIconCompatParcelizer != null) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer.get(((androidx.fragment.app.FragmentState) bundleIconCompatParcelizer.getParcelable("state")).PlaybackStateCompat);
                if (fragment != null) {
                    if (RemoteActionCompatParcelizer(2)) {
                        fragment.toString();
                    }
                    isspecifieduvyycjkannotations = new isSpecifieduvyYCjkannotations(cardView$1, isspecifieduvyycjk, fragment, bundleIconCompatParcelizer);
                } else {
                    isspecifieduvyycjkannotations = new isSpecifieduvyYCjkannotations(this.ResultReceiver, this.PlaybackStateCompatCustomAction, this.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader(), MediaSessionCompatQueueItem(), bundleIconCompatParcelizer);
                }
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                fragment2.addOnMultiWindowModeChangedListener = bundleIconCompatParcelizer;
                fragment2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this;
                if (RemoteActionCompatParcelizer(2)) {
                    fragment2.toString();
                }
                isspecifieduvyycjkannotations.write(this.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader());
                isspecifieduvyycjk.serializer(isspecifieduvyycjkannotations);
                isspecifieduvyycjkannotations.read = this.RatingCompat;
            }
        }
        getZeroNHjbRc getzeronhjbrc = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        getzeronhjbrc.getClass();
        for (androidx.fragment.app.Fragment fragment3 : new ArrayList(getzeronhjbrc.RemoteActionCompatParcelizer.values())) {
            if (map3.get(fragment3.getViewModelStore) == null) {
                if (RemoteActionCompatParcelizer(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.serializer);
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(fragment3);
                fragment3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this;
                isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations2 = new isSpecifieduvyYCjkannotations(cardView$1, isspecifieduvyycjk, fragment3);
                isspecifieduvyycjkannotations2.read = 1;
                isspecifieduvyycjkannotations2.MediaDescriptionCompat();
                fragment3.onBackPressedDispatcher_delegatelambda010 = true;
                isspecifieduvyycjkannotations2.MediaDescriptionCompat();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.write;
        isspecifieduvyycjk.RemoteActionCompatParcelizer.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                androidx.fragment.app.Fragment fragmentIconCompatParcelizer = isspecifieduvyycjk.IconCompatParcelizer(str3);
                if (fragmentIconCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (RemoteActionCompatParcelizer(2)) {
                        fragmentIconCompatParcelizer.toString();
                    }
                    isspecifieduvyycjk.read(fragmentIconCompatParcelizer);
                }
            }
        }
        if (fragmentManagerState.RemoteActionCompatParcelizer != null) {
            this.serializer = new ArrayList(fragmentManagerState.RemoteActionCompatParcelizer.length);
            int i = 0;
            while (true) {
                androidx.fragment.app.BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.RemoteActionCompatParcelizer;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                isInfiniteannotations isinfiniteannotationsRemoteActionCompatParcelizer = backStackRecordStateArr[i].RemoteActionCompatParcelizer(this);
                if (RemoteActionCompatParcelizer(2)) {
                    isinfiniteannotationsRemoteActionCompatParcelizer.toString();
                    PrintWriter printWriter = new PrintWriter(new drawRawLines());
                    isinfiniteannotationsRemoteActionCompatParcelizer.write("  ", printWriter, false);
                    printWriter.close();
                }
                this.serializer.add(isinfiniteannotationsRemoteActionCompatParcelizer);
                i++;
            }
        } else {
            this.serializer = new ArrayList();
        }
        this.read.set(fragmentManagerState.IconCompatParcelizer);
        String str4 = fragmentManagerState.MediaMetadataCompat;
        if (str4 != null) {
            androidx.fragment.app.Fragment fragmentIconCompatParcelizer2 = isspecifieduvyycjk.IconCompatParcelizer(str4);
            this._init_lambda3 = fragmentIconCompatParcelizer2;
            MediaDescriptionCompat(fragmentIconCompatParcelizer2);
        }
        ArrayList arrayList2 = fragmentManagerState.read;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.IconCompatParcelizer.put((String) arrayList2.get(i2), (androidx.fragment.app.BackStackState) fragmentManagerState.MediaDescriptionCompat.get(i2));
            }
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayDeque(fragmentManagerState.RatingCompat);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.ensureViewModelStore || this.addObserverForBackInvoker;
    }

    public final io.sentry.hints.PlaybackStateCompatCustomAction MediaDescriptionCompat() {
        androidx.fragment.app.Fragment fragment = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        return fragment != null ? fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaDescriptionCompat() : this.MediaMetadataCompat;
    }

    public final void MediaMetadataCompat() {
        for (isFiniteannotations isfiniteannotations : RemoteActionCompatParcelizer()) {
            if (isfiniteannotations.read) {
                RemoteActionCompatParcelizer(2);
                isfiniteannotations.read = false;
                isfiniteannotations.write();
            }
        }
    }

    public final getMaxDimensionannotations MediaSessionCompatQueueItem() {
        androidx.fragment.app.Fragment fragment = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        return fragment != null ? fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem() : this.ComponentActivity;
    }

    public final void read() {
        Iterator it = RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            ((isFiniteannotations) it.next()).RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void read(isEllipse isellipse, getSafeInnerRect getsafeinnerrect, androidx.fragment.app.Fragment fragment) {
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp;
        if (this.PlaybackStateCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already attached");
            return;
        }
        this.PlaybackStateCompat = isellipse;
        this.RemoteActionCompatParcelizer = getsafeinnerrect;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (fragment != null) {
            copyOnWriteArrayList.add(new isEmptyimpl(fragment));
        } else if (isellipse instanceof getCenteruvyYCjkannotations) {
            copyOnWriteArrayList.add((getCenteruvyYCjkannotations) isellipse);
        }
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
            ParcelableVolumeInfo();
        }
        if (isellipse instanceof fullyDrawnReporter_delegatelambda0) {
            fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0 = (fullyDrawnReporter_delegatelambda0) isellipse;
            defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = fullydrawnreporter_delegatelambda0.getOnBackPressedDispatcher();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = onBackPressedDispatcher;
            if (fragment != null) {
                accessisrendernodecompatiblecp = fullydrawnreporter_delegatelambda0;
                accessisrendernodecompatiblecp = fragment;
            }
            accessisrendernodecompatiblecp = fullydrawnreporter_delegatelambda0;
            onBackPressedDispatcher.read(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, accessisrendernodecompatiblecp);
        }
        final int i = 0;
        if (fragment != null) {
            getZeroNHjbRc getzeronhjbrc = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            HashMap map = getzeronhjbrc.IconCompatParcelizer;
            getZeroNHjbRc getzeronhjbrc2 = (getZeroNHjbRc) map.get(fragment.getViewModelStore);
            if (getzeronhjbrc2 == null) {
                getzeronhjbrc2 = new getZeroNHjbRc(getzeronhjbrc.MediaDescriptionCompat);
                map.put(fragment.getViewModelStore, getzeronhjbrc2);
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getzeronhjbrc2;
        } else if (isellipse instanceof asFrameworkPaint) {
            getFilterQualityfv9h1I viewModelStore = ((asFrameworkPaint) isellipse).getViewModelStore();
            viewModelStore.getClass();
            setPathEffect setpatheffect = setPathEffect.IconCompatParcelizer;
            setpatheffect.getClass();
            ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, getZeroNHjbRc.write, setpatheffect);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getZeroNHjbRc.class);
            String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (getZeroNHjbRc) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        } else {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getZeroNHjbRc(false);
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = MediaBrowserCompatMediaItem();
        this.PlaybackStateCompatCustomAction.serializer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        Object obj = this.PlaybackStateCompat;
        if ((obj instanceof getTransparent0d7_KjU) && fragment == null) {
            getLightGray0d7_KjU savedStateRegistry = ((getTransparent0d7_KjU) obj).getSavedStateRegistry();
            savedStateRegistry.RemoteActionCompatParcelizer("android:support:fragments", new getHeightimpl(0, this));
            Bundle bundleWrite = savedStateRegistry.write("android:support:fragments");
            if (bundleWrite != null) {
                IconCompatParcelizer(bundleWrite);
            }
        }
        Object obj2 = this.PlaybackStateCompat;
        if (obj2 instanceof onMultiWindowModeChanged) {
            androidx.activity.result.ActivityResultRegistry activityResultRegistry = ((onMultiWindowModeChanged) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fragment != null ? ff$$ExternalSyntheticOutline0.m(new StringBuilder(), fragment.getViewModelStore, ":") : "");
            final int i2 = 2;
            this.createFullyDrawnExecutor = activityResultRegistry.register(strConcat.concat("StartActivityForResult"), new times7Ah8Wj8(i2), new getNavigationEventDispatcher(this) { // from class: androidx.fragment.app.FragmentManager$8
                public final /* synthetic */ div7Ah8Wj8 RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // o.getNavigationEventDispatcher
                public final void onActivityResult(Object obj3) {
                    int i3 = i;
                    div7Ah8Wj8 div7ah8wj8 = this.RemoteActionCompatParcelizer;
                    if (i3 == 0) {
                        ActivityResult activityResult = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollLast();
                        if (fragmentManager$LaunchedFragmentInfo == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No Activities were started for result for " + this);
                            return;
                        }
                        String str = fragmentManager$LaunchedFragmentInfo.RemoteActionCompatParcelizer;
                        int i4 = fragmentManager$LaunchedFragmentInfo.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str);
                        if (fragmentRemoteActionCompatParcelizer != null) {
                            fragmentRemoteActionCompatParcelizer.onActivityResult(i4, activityResult.write, activityResult.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        return;
                    }
                    if (i3 != 1) {
                        ActivityResult activityResult2 = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                        if (fragmentManager$LaunchedFragmentInfo2 == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No IntentSenders were started for " + this);
                            return;
                        }
                        String str2 = fragmentManager$LaunchedFragmentInfo2.RemoteActionCompatParcelizer;
                        int i5 = fragmentManager$LaunchedFragmentInfo2.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer2 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str2);
                        if (fragmentRemoteActionCompatParcelizer2 != null) {
                            fragmentRemoteActionCompatParcelizer2.onActivityResult(i5, activityResult2.write, activityResult2.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        return;
                    }
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        iArr[i6] = ((Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                    if (fragmentManager$LaunchedFragmentInfo3 == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str3 = fragmentManager$LaunchedFragmentInfo3.RemoteActionCompatParcelizer;
                    int i7 = fragmentManager$LaunchedFragmentInfo3.serializer;
                    Fragment fragmentRemoteActionCompatParcelizer3 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str3);
                    if (fragmentRemoteActionCompatParcelizer3 != null) {
                        fragmentRemoteActionCompatParcelizer3.onRequestPermissionsResult(i7, strArr, iArr);
                        return;
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
                }
            });
            this.defaultViewModelProviderFactory_delegatelambda0 = activityResultRegistry.register(strConcat.concat("StartIntentSenderForResult"), new times7Ah8Wj8(i), new getNavigationEventDispatcher(this) { // from class: androidx.fragment.app.FragmentManager$8
                public final /* synthetic */ div7Ah8Wj8 RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // o.getNavigationEventDispatcher
                public final void onActivityResult(Object obj3) {
                    int i3 = i2;
                    div7Ah8Wj8 div7ah8wj8 = this.RemoteActionCompatParcelizer;
                    if (i3 == 0) {
                        ActivityResult activityResult = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollLast();
                        if (fragmentManager$LaunchedFragmentInfo == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No Activities were started for result for " + this);
                            return;
                        }
                        String str = fragmentManager$LaunchedFragmentInfo.RemoteActionCompatParcelizer;
                        int i4 = fragmentManager$LaunchedFragmentInfo.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str);
                        if (fragmentRemoteActionCompatParcelizer != null) {
                            fragmentRemoteActionCompatParcelizer.onActivityResult(i4, activityResult.write, activityResult.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        return;
                    }
                    if (i3 != 1) {
                        ActivityResult activityResult2 = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                        if (fragmentManager$LaunchedFragmentInfo2 == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No IntentSenders were started for " + this);
                            return;
                        }
                        String str2 = fragmentManager$LaunchedFragmentInfo2.RemoteActionCompatParcelizer;
                        int i5 = fragmentManager$LaunchedFragmentInfo2.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer2 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str2);
                        if (fragmentRemoteActionCompatParcelizer2 != null) {
                            fragmentRemoteActionCompatParcelizer2.onActivityResult(i5, activityResult2.write, activityResult2.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        return;
                    }
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        iArr[i6] = ((Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                    if (fragmentManager$LaunchedFragmentInfo3 == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str3 = fragmentManager$LaunchedFragmentInfo3.RemoteActionCompatParcelizer;
                    int i7 = fragmentManager$LaunchedFragmentInfo3.serializer;
                    Fragment fragmentRemoteActionCompatParcelizer3 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str3);
                    if (fragmentRemoteActionCompatParcelizer3 != null) {
                        fragmentRemoteActionCompatParcelizer3.onRequestPermissionsResult(i7, strArr, iArr);
                        return;
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
                }
            });
            final int i3 = 1;
            this._init_lambda4 = activityResultRegistry.register(strConcat.concat("RequestPermissions"), new times7Ah8Wj8(i3), new getNavigationEventDispatcher(this) { // from class: androidx.fragment.app.FragmentManager$8
                public final /* synthetic */ div7Ah8Wj8 RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // o.getNavigationEventDispatcher
                public final void onActivityResult(Object obj3) {
                    int i4 = i3;
                    div7Ah8Wj8 div7ah8wj8 = this.RemoteActionCompatParcelizer;
                    if (i4 == 0) {
                        ActivityResult activityResult = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollLast();
                        if (fragmentManager$LaunchedFragmentInfo == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No Activities were started for result for " + this);
                            return;
                        }
                        String str = fragmentManager$LaunchedFragmentInfo.RemoteActionCompatParcelizer;
                        int i5 = fragmentManager$LaunchedFragmentInfo.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str);
                        if (fragmentRemoteActionCompatParcelizer != null) {
                            fragmentRemoteActionCompatParcelizer.onActivityResult(i5, activityResult.write, activityResult.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        return;
                    }
                    if (i4 != 1) {
                        ActivityResult activityResult2 = (ActivityResult) obj3;
                        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                        if (fragmentManager$LaunchedFragmentInfo2 == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No IntentSenders were started for " + this);
                            return;
                        }
                        String str2 = fragmentManager$LaunchedFragmentInfo2.RemoteActionCompatParcelizer;
                        int i6 = fragmentManager$LaunchedFragmentInfo2.serializer;
                        Fragment fragmentRemoteActionCompatParcelizer2 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str2);
                        if (fragmentRemoteActionCompatParcelizer2 != null) {
                            fragmentRemoteActionCompatParcelizer2.onActivityResult(i6, activityResult2.write, activityResult2.RemoteActionCompatParcelizer);
                            return;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        return;
                    }
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) div7ah8wj8.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.pollFirst();
                    if (fragmentManager$LaunchedFragmentInfo3 == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str3 = fragmentManager$LaunchedFragmentInfo3.RemoteActionCompatParcelizer;
                    int i8 = fragmentManager$LaunchedFragmentInfo3.serializer;
                    Fragment fragmentRemoteActionCompatParcelizer3 = div7ah8wj8.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(str3);
                    if (fragmentRemoteActionCompatParcelizer3 != null) {
                        fragmentRemoteActionCompatParcelizer3.onRequestPermissionsResult(i8, strArr, iArr);
                        return;
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
                }
            });
        }
        Object obj3 = this.PlaybackStateCompat;
        if (obj3 instanceof focusModifier) {
            ((focusModifier) obj3).addOnConfigurationChangedListener(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        Object obj4 = this.PlaybackStateCompat;
        if (obj4 instanceof moveFocus3ESFkO8) {
            ((moveFocus3ESFkO8) obj4).addOnTrimMemoryListener(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
        Object obj5 = this.PlaybackStateCompat;
        if (obj5 instanceof toFocusDirection) {
            ((toFocusDirection) obj5).addOnMultiWindowModeChangedListener(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
        Object obj6 = this.PlaybackStateCompat;
        if (obj6 instanceof toFocusDirectionZmokQxo) {
            ((toFocusDirectionZmokQxo) obj6).addOnPictureInPictureModeChangedListener(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
        Object obj7 = this.PlaybackStateCompat;
        if ((obj7 instanceof setOnExit) && fragment == null) {
            ((setOnExit) obj7).addMenuProvider(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
    }

    public final void read(boolean z) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("FragmentManager is already executing transactions");
            return;
        }
        if (this.PlaybackStateCompat == null) {
            if (this.MediaDescriptionCompat) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("FragmentManager has been destroyed");
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.PlaybackStateCompat.serializer.getLooper()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Must be called from main thread of fragment host");
            return;
        }
        if (!z && MediaBrowserCompatMediaItem()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can not perform this action after onSaveInstanceState");
        } else if (this.menuHostHelperlambda0 == null) {
            this.menuHostHelperlambda0 = new ArrayList();
            this.getSavedStateRegistryControllerannotations = new ArrayList();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.Fragment fragment = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs)));
            sb.append("}");
        } else {
            isEllipse isellipse = this.PlaybackStateCompat;
            if (isellipse != null) {
                sb.append(isellipse.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.PlaybackStateCompat)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final isSpecifieduvyYCjkannotations write(androidx.fragment.app.Fragment fragment) {
        String str = fragment.onBackPressedInput_delegatelambda0;
        if (str != null) {
            androidx.fragment.app.strictmode.FragmentStrictMode.write(fragment, str);
        }
        if (RemoteActionCompatParcelizer(2)) {
            fragment.toString();
        }
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotationsIconCompatParcelizer = IconCompatParcelizer(fragment);
        fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this;
        isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
        isspecifieduvyycjk.serializer(isspecifieduvyycjkannotationsIconCompatParcelizer);
        if (!fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            isspecifieduvyycjk.read(fragment);
            fragment.onBackPressedDispatcher_delegatelambda010 = false;
            if (fragment.getActivityResultRegistry == null) {
                fragment._init_lambda3 = false;
            }
            if (read(fragment)) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            }
        }
        return isspecifieduvyycjkannotationsIconCompatParcelizer;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o.translateUv8p0NA] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.translateUv8p0NA] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.translateUv8p0NA] */
    /* JADX WARN: Type inference failed for: r1v11, types: [o.translateUv8p0NA] */
    public div7Ah8Wj8() {
        final int i = 0;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new FocusOwnerImplmodifier1(this) { // from class: o.translateUv8p0NA
            public final /* synthetic */ div7Ah8Wj8 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i2 = i;
                div7Ah8Wj8 div7ah8wj8 = this.IconCompatParcelizer;
                if (i2 == 0) {
                    Configuration configuration = (Configuration) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(false, configuration);
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    Integer num = (Integer) obj;
                    if (div7ah8wj8.RatingCompat() && num.intValue() == 80) {
                        div7ah8wj8.write(false);
                        return;
                    }
                    return;
                }
                if (i2 != 2) {
                    toLayoutDirection tolayoutdirection = (toLayoutDirection) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(tolayoutdirection.read(), false);
                        return;
                    }
                    return;
                }
                accessgetExitcp accessgetexitcp = (accessgetExitcp) obj;
                if (div7ah8wj8.RatingCompat()) {
                    div7ah8wj8.write(accessgetexitcp.IconCompatParcelizer(), false);
                }
            }
        };
        final int i2 = 1;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new FocusOwnerImplmodifier1(this) { // from class: o.translateUv8p0NA
            public final /* synthetic */ div7Ah8Wj8 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i3 = i2;
                div7Ah8Wj8 div7ah8wj8 = this.IconCompatParcelizer;
                if (i3 == 0) {
                    Configuration configuration = (Configuration) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(false, configuration);
                        return;
                    }
                    return;
                }
                if (i3 == 1) {
                    Integer num = (Integer) obj;
                    if (div7ah8wj8.RatingCompat() && num.intValue() == 80) {
                        div7ah8wj8.write(false);
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    toLayoutDirection tolayoutdirection = (toLayoutDirection) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(tolayoutdirection.read(), false);
                        return;
                    }
                    return;
                }
                accessgetExitcp accessgetexitcp = (accessgetExitcp) obj;
                if (div7ah8wj8.RatingCompat()) {
                    div7ah8wj8.write(accessgetexitcp.IconCompatParcelizer(), false);
                }
            }
        };
        final int i3 = 2;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new FocusOwnerImplmodifier1(this) { // from class: o.translateUv8p0NA
            public final /* synthetic */ div7Ah8Wj8 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i4 = i3;
                div7Ah8Wj8 div7ah8wj8 = this.IconCompatParcelizer;
                if (i4 == 0) {
                    Configuration configuration = (Configuration) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(false, configuration);
                        return;
                    }
                    return;
                }
                if (i4 == 1) {
                    Integer num = (Integer) obj;
                    if (div7ah8wj8.RatingCompat() && num.intValue() == 80) {
                        div7ah8wj8.write(false);
                        return;
                    }
                    return;
                }
                if (i4 != 2) {
                    toLayoutDirection tolayoutdirection = (toLayoutDirection) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(tolayoutdirection.read(), false);
                        return;
                    }
                    return;
                }
                accessgetExitcp accessgetexitcp = (accessgetExitcp) obj;
                if (div7ah8wj8.RatingCompat()) {
                    div7ah8wj8.write(accessgetexitcp.IconCompatParcelizer(), false);
                }
            }
        };
        final int i4 = 3;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new FocusOwnerImplmodifier1(this) { // from class: o.translateUv8p0NA
            public final /* synthetic */ div7Ah8Wj8 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.FocusOwnerImplmodifier1
            public final void accept(Object obj) {
                int i5 = i4;
                div7Ah8Wj8 div7ah8wj8 = this.IconCompatParcelizer;
                if (i5 == 0) {
                    Configuration configuration = (Configuration) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(false, configuration);
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    Integer num = (Integer) obj;
                    if (div7ah8wj8.RatingCompat() && num.intValue() == 80) {
                        div7ah8wj8.write(false);
                        return;
                    }
                    return;
                }
                if (i5 != 2) {
                    toLayoutDirection tolayoutdirection = (toLayoutDirection) obj;
                    if (div7ah8wj8.RatingCompat()) {
                        div7ah8wj8.read(tolayoutdirection.read(), false);
                        return;
                    }
                    return;
                }
                accessgetExitcp accessgetexitcp = (accessgetExitcp) obj;
                if (div7ah8wj8.RatingCompat()) {
                    div7ah8wj8.write(accessgetexitcp.IconCompatParcelizer(), false);
                }
            }
        };
        this.MediaMetadataCompat = new io.sentry.hints.PlaybackStateCompatCustomAction(i3);
    }

    public final ViewGroup RatingCompat(androidx.fragment.app.Fragment fragment) {
        ViewGroup viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= 0 || !this.RemoteActionCompatParcelizer.write()) {
            return null;
        }
        View viewIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        if (viewIconCompatParcelizer instanceof ViewGroup) {
            return (ViewGroup) viewIconCompatParcelizer;
        }
        return null;
    }

    public final void read(String str, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, isUnspecifieduvyYCjk isunspecifieduvyycjk) {
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        if (((accessregisterComponentCallback) lifecycle).RatingCompat == toColorLong8_81llA.DESTROYED) {
            return;
        }
        getMinDimensionimpl getmindimensionimpl = new getMinDimensionimpl(this, str, isunspecifieduvyycjk, lifecycle);
        getWidthimpl getwidthimpl = (getWidthimpl) this.accessensureViewModelStore.put(str, new getWidthimpl(lifecycle, isunspecifieduvyycjk, getmindimensionimpl));
        if (getwidthimpl != null) {
            getwidthimpl.read.read(getwidthimpl.serializer);
        }
        if (RemoteActionCompatParcelizer(2)) {
            lifecycle.toString();
            Objects.toString(isunspecifieduvyycjk);
        }
        lifecycle.IconCompatParcelizer(getmindimensionimpl);
    }

    public static androidx.fragment.app.Fragment write(View view) {
        while (view != null) {
            Object tag = view.getTag(com.logistics.rider.glovo.R.id.fragment_container_view_tag);
            androidx.fragment.app.Fragment fragment = tag instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public final void IconCompatParcelizer(RuntimeException runtimeException) {
        SentryLogcatAdapter.serializer("FragmentManager", runtimeException.getMessage());
        SentryLogcatAdapter.serializer("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new drawRawLines());
        isEllipse isellipse = this.PlaybackStateCompat;
        if (isellipse == null) {
            try {
                read("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                SentryLogcatAdapter.read("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((RoundRectZAM2FJodefault) isellipse).write.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            SentryLogcatAdapter.read("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void MediaSessionCompatResultReceiverWrapper(androidx.fragment.app.Fragment fragment) {
        ViewGroup viewGroupRatingCompat = RatingCompat(fragment);
        if (viewGroupRatingCompat != null) {
            int enterAnim = fragment.getEnterAnim();
            int exitAnim = fragment.getExitAnim();
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + exitAnim + enterAnim > 0) {
                if (viewGroupRatingCompat.getTag(com.logistics.rider.glovo.R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupRatingCompat.setTag(com.logistics.rider.glovo.R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((androidx.fragment.app.Fragment) viewGroupRatingCompat.getTag(com.logistics.rider.glovo.R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void PlaybackStateCompat() {
        if (this.PlaybackStateCompat == null) {
            return;
        }
        this.ensureViewModelStore = false;
        this.addObserverForBackInvoker = false;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read = false;
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean RatingCompat() {
        androidx.fragment.app.Fragment fragment = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getParentFragmentManager().RatingCompat();
    }

    public final void read(Menu menu) {
        if (this.RatingCompat < 1) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void serializer(androidx.fragment.app.Fragment fragment, boolean z) {
        ViewGroup viewGroupRatingCompat = RatingCompat(fragment);
        if (viewGroupRatingCompat == null || !(viewGroupRatingCompat instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) viewGroupRatingCompat).setDrawDisappearingViewsLast(!z);
    }

    public final boolean IconCompatParcelizer(MenuItem menuItem) {
        if (this.RatingCompat < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(Menu menu) {
        boolean z = false;
        if (this.RatingCompat < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean read(MenuItem menuItem) {
        if (this.RatingCompat < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void serializer(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((isInfiniteannotations) arrayList.get(i)).ComponentActivity) {
                if (i2 != i) {
                    read(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((isInfiniteannotations) arrayList.get(i2)).ComponentActivity) {
                        i2++;
                    }
                }
                read(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            read(arrayList, arrayList2, i2, size);
        }
    }

    public final boolean write(Menu menu, MenuInflater menuInflater) {
        if (this.RatingCompat < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment : this.PlaybackStateCompatCustomAction.IconCompatParcelizer()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) this.MediaBrowserCompatMediaItem.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.MediaBrowserCompatMediaItem = arrayList;
        return z;
    }

    public final boolean RemoteActionCompatParcelizer(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iSerializer = serializer(str, i, (i2 & 1) != 0);
        if (iSerializer < 0) {
            return false;
        }
        int size = this.serializer.size();
        while (true) {
            size--;
            if (size < iSerializer) {
                return true;
            }
            arrayList.add((isInfiniteannotations) this.serializer.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
    }

    public final void read(int i, boolean z) {
        isEllipse isellipse;
        if (this.PlaybackStateCompat == null && i != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No activity");
            return;
        }
        if (z || i != this.RatingCompat) {
            this.RatingCompat = i;
            isSpecifieduvyYCjk isspecifieduvyycjk = this.PlaybackStateCompatCustomAction;
            HashMap map = isspecifieduvyycjk.write;
            Iterator it = isspecifieduvyycjk.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = (isSpecifieduvyYCjkannotations) map.get(((androidx.fragment.app.Fragment) it.next()).getViewModelStore);
                if (isspecifieduvyycjkannotations != null) {
                    isspecifieduvyycjkannotations.MediaDescriptionCompat();
                }
            }
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations2 : map.values()) {
                if (isspecifieduvyycjkannotations2 != null) {
                    isspecifieduvyycjkannotations2.MediaDescriptionCompat();
                    androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations2.RemoteActionCompatParcelizer;
                    if (fragment.onBackPressedDispatcher_delegatelambda010 && !fragment.isInBackStack()) {
                        if (fragment.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && !isspecifieduvyycjk.IconCompatParcelizer.containsKey(fragment.getViewModelStore)) {
                            isspecifieduvyycjk.IconCompatParcelizer(isspecifieduvyycjkannotations2.MediaSessionCompatToken(), fragment.getViewModelStore);
                        }
                        isspecifieduvyycjk.RemoteActionCompatParcelizer(isspecifieduvyycjkannotations2);
                    }
                }
            }
            for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations3 : isspecifieduvyycjk.read()) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations3.RemoteActionCompatParcelizer;
                if (fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                    if (this.MediaSessionCompatResultReceiverWrapper) {
                        this.MediaSessionCompatToken = true;
                    } else {
                        fragment2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
                        isspecifieduvyycjkannotations3.MediaDescriptionCompat();
                    }
                }
            }
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && (isellipse = this.PlaybackStateCompat) != null && this.RatingCompat == 7) {
                ((RoundRectZAM2FJodefault) isellipse).write.invalidateMenu();
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0220 A[PHI: r15
  0x0220: PHI (r15v14 int) = (r15v13 int), (r15v15 int) binds: [B:101:0x020b, B:104:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    public final void read(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        isInfiniteannotations isinfiniteannotations;
        isSpecifieduvyYCjk isspecifieduvyycjk;
        int i3;
        int i4;
        androidx.fragment.app.Fragment fragment;
        ArrayList arrayList3 = arrayList;
        boolean z = ((isInfiniteannotations) arrayList3.get(i)).ComponentActivity;
        ArrayList arrayList4 = this.addObserverForBackInvokerlambda0;
        if (arrayList4 == null) {
            this.addObserverForBackInvokerlambda0 = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.addObserverForBackInvokerlambda0;
        isSpecifieduvyYCjk isspecifieduvyycjk2 = this.PlaybackStateCompatCustomAction;
        arrayList5.addAll(isspecifieduvyycjk2.IconCompatParcelizer());
        androidx.fragment.app.Fragment fragment2 = this._init_lambda3;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                isInfiniteannotations isinfiniteannotations2 = (isInfiniteannotations) arrayList3.get(i5);
                boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
                ArrayList arrayList6 = this.addObserverForBackInvokerlambda0;
                if (!zBooleanValue) {
                    ArrayList arrayList7 = isinfiniteannotations2.MediaSessionCompatResultReceiverWrapper;
                    int i7 = 0;
                    while (i7 < arrayList7.size()) {
                        timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) arrayList7.get(i7);
                        int i8 = timesd16qtg0.RemoteActionCompatParcelizer;
                        if (i8 != i6) {
                            if (i8 != 2) {
                                if (i8 == 3 || i8 == 6) {
                                    arrayList6.remove(timesd16qtg0.serializer);
                                    androidx.fragment.app.Fragment fragment3 = timesd16qtg0.serializer;
                                    if (fragment3 == fragment2) {
                                        arrayList7.add(i7, new timesd16Qtg0(fragment3, 9));
                                        i7++;
                                        fragment = null;
                                    } else {
                                        fragment = fragment2;
                                    }
                                } else if (i8 == 7) {
                                    i3 = 1;
                                } else if (i8 != 8) {
                                    fragment = fragment2;
                                } else {
                                    arrayList7.add(i7, new timesd16Qtg0(fragment2, 9, 0));
                                    timesd16qtg0.MediaDescriptionCompat = true;
                                    i7++;
                                    fragment = timesd16qtg0.serializer;
                                }
                                fragment2 = fragment;
                                isspecifieduvyycjk2 = isspecifieduvyycjk2;
                                i3 = 1;
                            } else {
                                androidx.fragment.app.Fragment fragment4 = timesd16qtg0.serializer;
                                int i9 = fragment4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                int size = arrayList6.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    isSpecifieduvyYCjk isspecifieduvyycjk3 = isspecifieduvyycjk2;
                                    androidx.fragment.app.Fragment fragment5 = (androidx.fragment.app.Fragment) arrayList6.get(size);
                                    if (fragment5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != i9) {
                                        i9 = i9;
                                    } else if (fragment5 == fragment4) {
                                        i9 = i9;
                                        z3 = true;
                                    } else {
                                        if (fragment5 == fragment2) {
                                            i4 = 0;
                                            arrayList7.add(i7, new timesd16Qtg0(fragment5, 9, 0));
                                            i7++;
                                            fragment2 = null;
                                        } else {
                                            i4 = 0;
                                        }
                                        timesd16Qtg0 timesd16qtg1 = new timesd16Qtg0(fragment5, 3, i4);
                                        timesd16qtg1.write = timesd16qtg0.write;
                                        timesd16qtg1.RatingCompat = timesd16qtg0.RatingCompat;
                                        timesd16qtg1.read = timesd16qtg0.read;
                                        timesd16qtg1.MediaBrowserCompatMediaItem = timesd16qtg0.MediaBrowserCompatMediaItem;
                                        arrayList7.add(i7, timesd16qtg1);
                                        arrayList6.remove(fragment5);
                                        i7++;
                                        fragment2 = fragment2;
                                    }
                                    size--;
                                    i9 = i9;
                                    isspecifieduvyycjk2 = isspecifieduvyycjk3;
                                }
                                isspecifieduvyycjk2 = isspecifieduvyycjk2;
                                i3 = 1;
                                if (z3) {
                                    arrayList7.remove(i7);
                                    i7--;
                                } else {
                                    timesd16qtg0.RemoteActionCompatParcelizer = 1;
                                    timesd16qtg0.MediaDescriptionCompat = true;
                                    arrayList6.add(fragment4);
                                }
                            }
                            i7 += i3;
                            i6 = i3;
                            isspecifieduvyycjk2 = isspecifieduvyycjk2;
                        } else {
                            i3 = i6;
                        }
                        arrayList6.add(timesd16qtg0.serializer);
                        i7 += i3;
                        i6 = i3;
                        isspecifieduvyycjk2 = isspecifieduvyycjk2;
                    }
                    isspecifieduvyycjk = isspecifieduvyycjk2;
                } else {
                    isspecifieduvyycjk = isspecifieduvyycjk2;
                    int i10 = 1;
                    ArrayList arrayList8 = isinfiniteannotations2.MediaSessionCompatResultReceiverWrapper;
                    int size2 = arrayList8.size() - 1;
                    while (size2 >= 0) {
                        timesd16Qtg0 timesd16qtg2 = (timesd16Qtg0) arrayList8.get(size2);
                        int i11 = timesd16qtg2.RemoteActionCompatParcelizer;
                        if (i11 != i10) {
                            if (i11 != 3) {
                                switch (i11) {
                                    case 6:
                                        arrayList6.add(timesd16qtg2.serializer);
                                        break;
                                    case 8:
                                        fragment2 = null;
                                        break;
                                    case 9:
                                        fragment2 = timesd16qtg2.serializer;
                                        break;
                                    case 10:
                                        timesd16qtg2.IconCompatParcelizer = timesd16qtg2.MediaSessionCompatQueueItem;
                                        break;
                                }
                            } else {
                                arrayList6.add(timesd16qtg2.serializer);
                            }
                            size2--;
                            i10 = 1;
                        }
                        arrayList6.remove(timesd16qtg2.serializer);
                        size2--;
                        i10 = 1;
                    }
                }
                z2 = z2 || isinfiniteannotations2.write;
                i5++;
                arrayList3 = arrayList;
                isspecifieduvyycjk2 = isspecifieduvyycjk;
            } else {
                isSpecifieduvyYCjk isspecifieduvyycjk4 = isspecifieduvyycjk2;
                this.addObserverForBackInvokerlambda0.clear();
                if (!z && this.RatingCompat >= 1) {
                    for (int i12 = i; i12 < i2; i12++) {
                        Iterator it = ((isInfiniteannotations) arrayList.get(i12)).MediaSessionCompatResultReceiverWrapper.iterator();
                        while (it.hasNext()) {
                            androidx.fragment.app.Fragment fragment6 = ((timesd16Qtg0) it.next()).serializer;
                            if (fragment6 != null && fragment6.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
                                isspecifieduvyycjk4.serializer(IconCompatParcelizer(fragment6));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i2; i13++) {
                    isInfiniteannotations isinfiniteannotations3 = (isInfiniteannotations) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        isinfiniteannotations3.serializer(-1);
                        div7Ah8Wj8 div7ah8wj8 = isinfiniteannotations3.PlaybackStateCompatCustomAction;
                        ArrayList arrayList9 = isinfiniteannotations3.MediaSessionCompatResultReceiverWrapper;
                        boolean z4 = true;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            timesd16Qtg0 timesd16qtg3 = (timesd16Qtg0) arrayList9.get(size3);
                            androidx.fragment.app.Fragment fragment7 = timesd16qtg3.serializer;
                            if (fragment7 != null) {
                                fragment7.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = isinfiniteannotations3.read;
                                fragment7.setPopDirection(z4);
                                int i14 = isinfiniteannotations3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                int i15 = 4097;
                                int i16 = 8194;
                                if (i14 == 4097) {
                                    i15 = i16;
                                } else if (i14 != 8194) {
                                    i16 = 4100;
                                    if (i14 != 8197) {
                                        i15 = 4099;
                                        if (i14 != 4099) {
                                            i15 = i14 != 4100 ? 0 : 8197;
                                        }
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                fragment7.setNextTransition(i15);
                                fragment7.setSharedElementNames(isinfiniteannotations3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfiniteannotations3.ResultReceiver);
                            }
                            switch (timesd16qtg3.RemoteActionCompatParcelizer) {
                                case 1:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    z4 = true;
                                    div7ah8wj8.serializer(fragment7, true);
                                    div7ah8wj8.MediaSessionCompatQueueItem(fragment7);
                                    break;
                                case 2:
                                default:
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write(timesd16qtg3.RemoteActionCompatParcelizer, "Unknown cmd: ");
                                    break;
                                case 3:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    div7ah8wj8.write(fragment7);
                                    z4 = true;
                                    break;
                                case 4:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    div7ah8wj8.getClass();
                                    if (RemoteActionCompatParcelizer(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7._init_lambda2) {
                                        fragment7._init_lambda2 = false;
                                        fragment7._init_lambda3 = !fragment7._init_lambda3;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    div7ah8wj8.serializer(fragment7, true);
                                    if (RemoteActionCompatParcelizer(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (!fragment7._init_lambda2) {
                                        fragment7._init_lambda2 = true;
                                        fragment7._init_lambda3 = !fragment7._init_lambda3;
                                        div7ah8wj8.MediaSessionCompatResultReceiverWrapper(fragment7);
                                    }
                                    z4 = true;
                                    break;
                                case 6:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    div7ah8wj8.serializer(fragment7);
                                    z4 = true;
                                    break;
                                case 7:
                                    fragment7.setAnimations(timesd16qtg3.write, timesd16qtg3.read, timesd16qtg3.RatingCompat, timesd16qtg3.MediaBrowserCompatMediaItem);
                                    div7ah8wj8.serializer(fragment7, true);
                                    div7ah8wj8.MediaMetadataCompat(fragment7);
                                    z4 = true;
                                    break;
                                case 8:
                                    div7ah8wj8.MediaBrowserCompatMediaItem(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    div7ah8wj8.MediaBrowserCompatMediaItem(fragment7);
                                    z4 = true;
                                    break;
                                case 10:
                                    timesd16qtg3.IconCompatParcelizer = fragment7.getSavedStateRegistryControllerannotations;
                                    div7ah8wj8.read(fragment7, timesd16qtg3.MediaSessionCompatQueueItem);
                                    z4 = true;
                                    break;
                            }
                            return;
                        }
                    }
                    isinfiniteannotations3.serializer(1);
                    div7Ah8Wj8 div7ah8wj9 = isinfiniteannotations3.PlaybackStateCompatCustomAction;
                    ArrayList arrayList10 = isinfiniteannotations3.MediaSessionCompatResultReceiverWrapper;
                    int size4 = arrayList10.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        timesd16Qtg0 timesd16qtg4 = (timesd16Qtg0) arrayList10.get(i17);
                        androidx.fragment.app.Fragment fragment8 = timesd16qtg4.serializer;
                        if (fragment8 != null) {
                            fragment8.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = isinfiniteannotations3.read;
                            fragment8.setPopDirection(false);
                            fragment8.setNextTransition(isinfiniteannotations3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                            fragment8.setSharedElementNames(isinfiniteannotations3.ResultReceiver, isinfiniteannotations3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        }
                        switch (timesd16qtg4.RemoteActionCompatParcelizer) {
                            case 1:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.serializer(fragment8, false);
                                div7ah8wj9.write(fragment8);
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 2:
                            default:
                                ScreenStartObserver$$ExternalSyntheticLambda0.write(timesd16qtg4.RemoteActionCompatParcelizer, "Unknown cmd: ");
                                break;
                            case 3:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.MediaSessionCompatQueueItem(fragment8);
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 4:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.getClass();
                                if (RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment8);
                                }
                                if (!fragment8._init_lambda2) {
                                    fragment8._init_lambda2 = true;
                                    fragment8._init_lambda3 = !fragment8._init_lambda3;
                                    div7ah8wj9.MediaSessionCompatResultReceiverWrapper(fragment8);
                                }
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 5:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.serializer(fragment8, false);
                                if (RemoteActionCompatParcelizer(2)) {
                                    Objects.toString(fragment8);
                                }
                                if (fragment8._init_lambda2) {
                                    fragment8._init_lambda2 = false;
                                    fragment8._init_lambda3 = !fragment8._init_lambda3;
                                }
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 6:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.MediaMetadataCompat(fragment8);
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 7:
                                isinfiniteannotations = isinfiniteannotations3;
                                fragment8.setAnimations(timesd16qtg4.write, timesd16qtg4.read, timesd16qtg4.RatingCompat, timesd16qtg4.MediaBrowserCompatMediaItem);
                                div7ah8wj9.serializer(fragment8, false);
                                div7ah8wj9.serializer(fragment8);
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 8:
                                div7ah8wj9.MediaBrowserCompatMediaItem(fragment8);
                                isinfiniteannotations = isinfiniteannotations3;
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 9:
                                div7ah8wj9.MediaBrowserCompatMediaItem(null);
                                isinfiniteannotations = isinfiniteannotations3;
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                            case 10:
                                timesd16qtg4.MediaSessionCompatQueueItem = fragment8.getSavedStateRegistryControllerannotations;
                                div7ah8wj9.read(fragment8, timesd16qtg4.IconCompatParcelizer);
                                isinfiniteannotations = isinfiniteannotations3;
                                i17++;
                                isinfiniteannotations3 = isinfiniteannotations;
                                break;
                        }
                        return;
                    }
                }
                boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList<ActualLinearGradientShaderVjE6UOU> arrayList11 = this.write;
                if (z2 && !arrayList11.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(serializer((isInfiniteannotations) it2.next()));
                    }
                    if (this.fullyDrawnReporter_delegatelambda0 == null) {
                        for (ActualLinearGradientShaderVjE6UOU actualLinearGradientShaderVjE6UOU : arrayList11) {
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                actualLinearGradientShaderVjE6UOU.IconCompatParcelizer((androidx.fragment.app.Fragment) it3.next(), zBooleanValue2);
                            }
                        }
                        for (ActualLinearGradientShaderVjE6UOU actualLinearGradientShaderVjE6UOU2 : arrayList11) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                actualLinearGradientShaderVjE6UOU2.read((androidx.fragment.app.Fragment) it4.next(), zBooleanValue2);
                            }
                        }
                    }
                }
                for (int i18 = i; i18 < i2; i18++) {
                    isInfiniteannotations isinfiniteannotations4 = (isInfiniteannotations) arrayList.get(i18);
                    if (zBooleanValue2) {
                        for (int size5 = isinfiniteannotations4.MediaSessionCompatResultReceiverWrapper.size() - 1; size5 >= 0; size5--) {
                            androidx.fragment.app.Fragment fragment9 = ((timesd16Qtg0) isinfiniteannotations4.MediaSessionCompatResultReceiverWrapper.get(size5)).serializer;
                            if (fragment9 != null) {
                                IconCompatParcelizer(fragment9).MediaDescriptionCompat();
                            }
                        }
                    } else {
                        Iterator it5 = isinfiniteannotations4.MediaSessionCompatResultReceiverWrapper.iterator();
                        while (it5.hasNext()) {
                            androidx.fragment.app.Fragment fragment10 = ((timesd16Qtg0) it5.next()).serializer;
                            if (fragment10 != null) {
                                IconCompatParcelizer(fragment10).MediaDescriptionCompat();
                            }
                        }
                    }
                }
                read(this.RatingCompat, true);
                int i19 = i;
                for (isFiniteannotations isfiniteannotations : IconCompatParcelizer(arrayList, i19, i2)) {
                    isfiniteannotations.write = zBooleanValue2;
                    isfiniteannotations.serializer();
                    isfiniteannotations.write();
                }
                while (i19 < i2) {
                    isInfiniteannotations isinfiniteannotations5 = (isInfiniteannotations) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && isinfiniteannotations5.MediaSessionCompatToken >= 0) {
                        isinfiniteannotations5.MediaSessionCompatToken = -1;
                    }
                    if (isinfiniteannotations5.MediaMetadataCompat != null) {
                        for (int i20 = 0; i20 < isinfiniteannotations5.MediaMetadataCompat.size(); i20++) {
                            ((Runnable) isinfiniteannotations5.MediaMetadataCompat.get(i20)).run();
                        }
                        isinfiniteannotations5.MediaMetadataCompat = null;
                    }
                    i19++;
                }
                if (z2) {
                    for (int i21 = 0; i21 < arrayList11.size(); i21++) {
                        ((ActualLinearGradientShaderVjE6UOU) arrayList11.get(i21)).getClass();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return IconCompatParcelizer(-1, 0);
    }
}
