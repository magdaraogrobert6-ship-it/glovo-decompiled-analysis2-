package o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cubicTo implements asFrameworkPaint, AndroidColorFilter_androidKt, getTransparent0d7_KjU {
    public opN5in7k0 IconCompatParcelizer;
    public final validateColorStops MediaBrowserCompatMediaItem = new validateColorStops(this);
    public final Bundle MediaDescriptionCompat;
    public final getInternalPath MediaMetadataCompat;
    public toColorLong8_81llA RemoteActionCompatParcelizer;
    public final Bundle read;
    public final String serializer;
    public final androidx.navigation.internal.NavContext write;

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // o.AndroidColorFilter_androidKt
    public final setStrokeCapBeK7IIE getDefaultViewModelCreationExtras() {
        Application application;
        validateColorStops validatecolorstops = this.MediaBrowserCompatMediaItem;
        validatecolorstops.getClass();
        setStrokeMiterLimit setstrokemiterlimit = new setStrokeMiterLimit(0);
        cubicTo cubicto = validatecolorstops.IconCompatParcelizer;
        LinkedHashMap linkedHashMap = setstrokemiterlimit.read;
        linkedHashMap.put(prepareToDraw.read, cubicto);
        linkedHashMap.put(prepareToDraw.write, cubicto);
        Bundle bundleRemoteActionCompatParcelizer = validatecolorstops.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer != null) {
            linkedHashMap.put(prepareToDraw.RemoteActionCompatParcelizer, bundleRemoteActionCompatParcelizer);
        }
        androidx.navigation.internal.NavContext navContext = this.write;
        if (navContext == null) {
            application = null;
        } else {
            Context context = navContext.IconCompatParcelizer;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(asImageBitmap.IconCompatParcelizer, application2);
        }
        return setstrokemiterlimit;
    }

    @Override // o.AndroidColorFilter_androidKt
    public final createImageBitmap getDefaultViewModelProviderFactory() {
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return this.MediaBrowserCompatMediaItem.RatingCompat;
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        return this.MediaBrowserCompatMediaItem.PlaybackStateCompat.read;
    }

    @Override // o.asFrameworkPaint
    public final getFilterQualityfv9h1I getViewModelStore() {
        validateColorStops validatecolorstops = this.MediaBrowserCompatMediaItem;
        if (!validatecolorstops.MediaSessionCompatResultReceiverWrapper) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (validatecolorstops.RatingCompat.RatingCompat == toColorLong8_81llA.DESTROYED) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        getInternalPath getinternalpath = validatecolorstops.PlaybackStateCompatCustomAction;
        if (getinternalpath == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = validatecolorstops.read;
        str.getClass();
        LinkedHashMap linkedHashMap = getinternalpath.read;
        getFilterQualityfv9h1I getfilterqualityfv9h1i = (getFilterQualityfv9h1I) linkedHashMap.get(str);
        if (getfilterqualityfv9h1i != null) {
            return getfilterqualityfv9h1i;
        }
        getFilterQualityfv9h1I getfilterqualityfv9h1i2 = new getFilterQualityfv9h1I();
        linkedHashMap.put(str, getfilterqualityfv9h1i2);
        return getfilterqualityfv9h1i2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        Bundle bundle = this.read;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                Object obj = bundle.get((String) it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.MediaBrowserCompatMediaItem.RatingCompat.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.MediaBrowserCompatMediaItem.toString();
    }

    public cubicTo(androidx.navigation.internal.NavContext navContext, opN5in7k0 opn5in7k0, Bundle bundle, toColorLong8_81llA tocolorlong8_81lla, getInternalPath getinternalpath, String str, Bundle bundle2) {
        this.write = navContext;
        this.IconCompatParcelizer = opn5in7k0;
        this.read = bundle;
        this.RemoteActionCompatParcelizer = tocolorlong8_81lla;
        this.MediaMetadataCompat = getinternalpath;
        this.serializer = str;
        this.MediaDescriptionCompat = bundle2;
        new isAdapterPositionOnScreen(new CoroutineLiveData$$ExternalSyntheticLambda0(28, this));
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof cubicTo)) {
            return false;
        }
        cubicTo cubicto = (cubicTo) obj;
        Bundle bundle = cubicto.read;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, cubicto.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, cubicto.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem.RatingCompat, cubicto.MediaBrowserCompatMediaItem.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getSavedStateRegistry(), cubicto.getSavedStateRegistry()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Bundle bundle2 = this.read;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bundle2, bundle}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        if (bundle2 == null || (setKeySet = bundle2.keySet()) == null) {
            return false;
        }
        Set<String> set = setKeySet;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str : set) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bundle2.get(str), bundle != null ? bundle.get(str) : null}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void read(toColorLong8_81llA tocolorlong8_81lla) {
        tocolorlong8_81lla.getClass();
        validateColorStops validatecolorstops = this.MediaBrowserCompatMediaItem;
        validatecolorstops.getClass();
        validatecolorstops.MediaBrowserCompatMediaItem = tocolorlong8_81lla;
        validatecolorstops.read();
    }
}
