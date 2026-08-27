package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.navigation.NavController$onBackPressedCallback$1;
import androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Machine$Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class relativeMoveTo {
    public boolean IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final androidx.navigation.internal.NavContext MediaMetadataCompat;
    public final NavController$onBackPressedCallback$1 MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final toAndroidTileMode0vamqd0 read;
    public final Activity serializer;
    public final Context write;

    public final Bundle IconCompatParcelizer() {
        Bundle bundle;
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        LinkedHashMap linkedHashMap = toandroidtilemode0vamqd0.MediaMetadataCompat;
        BrazeContentCardsManager<cubicTo> brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
        LinkedHashMap linkedHashMap2 = toandroidtilemode0vamqd0.MediaDescriptionCompat;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
        for (Map.Entry entry : onMove.serializer(toandroidtilemode0vamqd0.IconCompatParcelizer.serializer).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundle3 = ((toAndroidPathDashPathEffectStyleoQv6xUo) entry.getValue()).read();
            if (bundle3 != null) {
                arrayList.add(str);
                str.getClass();
                bundle2.putBundle(str, bundle3);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(arrayList));
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!brazeContentCardsManager.isEmpty()) {
            if (bundle == null) {
                bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            }
            ArrayList arrayList2 = new ArrayList();
            for (cubicTo cubicto : brazeContentCardsManager) {
                cubicto.getClass();
                int i2 = cubicto.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer;
                String str2 = cubicto.serializer;
                validateColorStops validatecolorstops = cubicto.MediaBrowserCompatMediaItem;
                Bundle bundleRemoteActionCompatParcelizer = validatecolorstops.RemoteActionCompatParcelizer();
                Bundle bundle4 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                validatecolorstops.PlaybackStateCompat.read(bundle4);
                Bundle bundle5 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                str2.getClass();
                bundle5.putString("nav-entry-state:id", str2);
                bundle5.putInt("nav-entry-state:destination-id", i2);
                if (bundleRemoteActionCompatParcelizer == null) {
                    bundleRemoteActionCompatParcelizer = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                }
                bundle5.putBundle("nav-entry-state:args", bundleRemoteActionCompatParcelizer);
                bundle5.putBundle("nav-entry-state:saved-state", bundle4);
                arrayList2.add(bundle5);
            }
            bundle.putParcelableArrayList("android-support-nav:controller:backStack", getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(arrayList2));
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str3 = (String) entry2.getValue();
                iArr[i3] = iIntValue;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList3.add(str3);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(arrayList3));
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str4 = (String) entry3.getKey();
                BrazeContentCardsManager brazeContentCardsManager2 = (BrazeContentCardsManager) entry3.getValue();
                arrayList4.add(str4);
                ArrayList arrayList5 = new ArrayList();
                Iterator it = brazeContentCardsManager2.iterator();
                while (it.hasNext()) {
                    Machine$Queue machine$Queue = ((arcTo) it.next()).RemoteActionCompatParcelizer;
                    machine$Queue.getClass();
                    Bundle bundle6 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[i], i)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                    String str5 = (String) machine$Queue.IconCompatParcelizer;
                    str5.getClass();
                    bundle6.putString("nav-entry-state:id", str5);
                    bundle6.putInt("nav-entry-state:destination-id", machine$Queue.read);
                    Bundle bundle7 = (Bundle) machine$Queue.serializer;
                    if (bundle7 == null) {
                        bundle7 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[i], i)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                    }
                    bundle6.putBundle("nav-entry-state:args", bundle7);
                    Bundle bundle8 = (Bundle) machine$Queue.write;
                    bundle8.getClass();
                    bundle6.putBundle("nav-entry-state:saved-state", bundle8);
                    arrayList5.add(bundle6);
                    i = 0;
                }
                bundle.putParcelableArrayList(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("android-support-nav:controller:backStackStates:", str4), getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(arrayList5));
                i = 0;
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(arrayList4));
        }
        if (this.IconCompatParcelizer) {
            if (bundle == null) {
                bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.IconCompatParcelizer);
        }
        return bundle;
    }

    public final void RemoteActionCompatParcelizer(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        toandroidtilemode0vamqd0.getClass();
        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer(str, setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public final boolean write() {
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        if (toandroidtilemode0vamqd0.MediaSessionCompatQueueItem.isEmpty()) {
            return false;
        }
        opN5in7k0 opn5in7k0Write = toandroidtilemode0vamqd0.write();
        opn5in7k0Write.getClass();
        return toandroidtilemode0vamqd0.write(opn5in7k0Write.serializer.RemoteActionCompatParcelizer, true, false) && toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
    }

    public relativeMoveTo(Context context) {
        context.getClass();
        this.write = context;
        this.read = new toAndroidTileMode0vamqd0(this, new addRect(this, 0));
        this.MediaMetadataCompat = new androidx.navigation.internal.NavContext(context, 0, false);
        for (Object obj : resetAfterInAppMessageCloselambda2.write(context, new accessgetBlendMode0nO6VwUjd(13))) {
            if (((Context) obj) instanceof Activity) {
                this.serializer = (Activity) obj;
                this.MediaSessionCompatQueueItem = new NavController$onBackPressedCallback$1(this);
                this.RemoteActionCompatParcelizer = true;
                AndroidPathIterator androidPathIterator = this.read.IconCompatParcelizer;
                androidPathIterator.write(new rewind(androidPathIterator));
                this.read.IconCompatParcelizer.write(new AndroidPath(this.write));
                this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new addRect(this, 1));
            }
        }
        obj = null;
        this.serializer = (Activity) obj;
        this.MediaSessionCompatQueueItem = new NavController$onBackPressedCallback$1(this);
        this.RemoteActionCompatParcelizer = true;
        AndroidPathIterator androidPathIterator2 = this.read.IconCompatParcelizer;
        androidPathIterator2.write(new rewind(androidPathIterator2));
        this.read.IconCompatParcelizer.write(new AndroidPath(this.write));
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new addRect(this, 1));
    }

    public static void RemoteActionCompatParcelizer(relativeMoveTo relativemoveto, String str, boolean z) {
        relativemoveto.getClass();
        str.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemoveto.read;
        toandroidtilemode0vamqd0.getClass();
        if (toandroidtilemode0vamqd0.write(str, z, false)) {
            toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
        }
    }

    public final void write(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        supportsColorMatrixQuery lifecycle;
        accessisrendernodecompatiblecp.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        FragmentNavigator$$ExternalSyntheticLambda0 fragmentNavigator$$ExternalSyntheticLambda0 = toandroidtilemode0vamqd0.ComponentActivity;
        if (accessisrendernodecompatiblecp.equals(toandroidtilemode0vamqd0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys)) {
            return;
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = toandroidtilemode0vamqd0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (accessisrendernodecompatiblecp2 != null && (lifecycle = accessisrendernodecompatiblecp2.getLifecycle()) != null) {
            lifecycle.read(fragmentNavigator$$ExternalSyntheticLambda0);
        }
        toandroidtilemode0vamqd0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = accessisrendernodecompatiblecp;
        accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(fragmentNavigator$$ExternalSyntheticLambda0);
    }

    public final void write(getFilterQualityfv9h1I getfilterqualityfv9h1i) {
        getfilterqualityfv9h1i.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        toandroidtilemode0vamqd0.getClass();
        Object[] objArr = {toandroidtilemode0vamqd0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, fireOnDismissCallback.IconCompatParcelizer(getfilterqualityfv9h1i)};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        if (toandroidtilemode0vamqd0.MediaSessionCompatQueueItem.isEmpty()) {
            toandroidtilemode0vamqd0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = fireOnDismissCallback.IconCompatParcelizer(getfilterqualityfv9h1i);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ViewModelStore should be set before setGraph call");
        }
    }

    public static void IconCompatParcelizer(relativeMoveTo relativemoveto, String str, transform58bKbWc transform58bkbwc, int i) {
        if ((i & 2) != 0) {
            transform58bkbwc = null;
        }
        relativemoveto.getClass();
        str.getClass();
        relativemoveto.read.RemoteActionCompatParcelizer(str, transform58bkbwc);
    }

    public final void read(Bundle bundle) {
        Bundle bundle2;
        Bundle[] bundleArr;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (bundle != null) {
            bundle.setClassLoader(this.write.getClassLoader());
        }
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.read;
        LinkedHashMap linkedHashMap = toandroidtilemode0vamqd0.MediaMetadataCompat;
        if (bundle != null) {
            if (bundle.containsKey("android-support-nav:controller:navigatorState")) {
                bundle2 = bundle.getBundle("android-support-nav:controller:navigatorState");
                if (bundle2 == null) {
                    accessbootstrapIfNeeded.write("android-support-nav:controller:navigatorState");
                    throw null;
                }
            } else {
                bundle2 = null;
            }
            toandroidtilemode0vamqd0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = bundle2;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                Class cls = Options.Companion.read(displayInAppMessagelambda1.serializer(Bundle.class));
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelableArrayList2 = focusTargetAvailable.read(bundle, "android-support-nav:controller:backStack", cls);
                } else {
                    parcelableArrayList2 = bundle.getParcelableArrayList("android-support-nav:controller:backStack");
                }
                if (parcelableArrayList2 != null) {
                    bundleArr = (Bundle[]) parcelableArrayList2.toArray(new Bundle[0]);
                } else {
                    accessbootstrapIfNeeded.write("android-support-nav:controller:backStack");
                    throw null;
                }
            } else {
                bundleArr = null;
            }
            toandroidtilemode0vamqd0.MediaSessionCompatToken = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (stringArrayList != null) {
                        int length = intArray.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            toandroidtilemode0vamqd0.MediaDescriptionCompat.put(Integer.valueOf(intArray[i]), !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{stringArrayList.get(i2), ""}, getCieXyz.write())).booleanValue() ? stringArrayList.get(i2) : null);
                            i++;
                            i2++;
                        }
                    } else {
                        accessbootstrapIfNeeded.write("android-support-nav:controller:backStackIds");
                        throw null;
                    }
                } else {
                    accessbootstrapIfNeeded.write("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
            }
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    for (String str : stringArrayList2) {
                        if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                            String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("android-support-nav:controller:backStackStates:", str);
                            Class cls2 = Options.Companion.read(displayInAppMessagelambda1.serializer(Bundle.class));
                            if (Build.VERSION.SDK_INT >= 34) {
                                parcelableArrayList = focusTargetAvailable.read(bundle, strSerializer, cls2);
                            } else {
                                parcelableArrayList = bundle.getParcelableArrayList(strSerializer);
                            }
                            if (parcelableArrayList != null) {
                                BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager(parcelableArrayList.size());
                                Iterator it = parcelableArrayList.iterator();
                                while (it.hasNext()) {
                                    brazeContentCardsManager.addLast(new arcTo((Bundle) it.next()));
                                }
                                linkedHashMap.put(str, brazeContentCardsManager);
                            } else {
                                accessbootstrapIfNeeded.write(strSerializer);
                                throw null;
                            }
                        }
                    }
                } else {
                    accessbootstrapIfNeeded.write("android-support-nav:controller:backStackStates");
                    throw null;
                }
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
            this.IconCompatParcelizer = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
    }
}
