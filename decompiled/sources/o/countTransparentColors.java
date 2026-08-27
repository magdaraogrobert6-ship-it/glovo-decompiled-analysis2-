package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentManager$SaveBackStackState;
import androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda0;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.ImageLoader$Builder;
import coil3.network.NetworkHeaders$Builder;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "fragment")
public class countTransparentColors extends toAndroidPathDashPathEffectStyleoQv6xUo {
    public final int IconCompatParcelizer;
    public final Context read;
    public final div7Ah8Wj8 serializer;
    public final LinkedHashSet MediaDescriptionCompat = new LinkedHashSet();
    public final ArrayList RatingCompat = new ArrayList();
    public final FragmentNavigator$$ExternalSyntheticLambda0 MediaBrowserCompatMediaItem = new FragmentNavigator$$ExternalSyntheticLambda0(0, this);
    public final f2$$ExternalSyntheticLambda4 MediaMetadataCompat = new f2$$ExternalSyntheticLambda4(4, this);

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.MediaDescriptionCompat;
            linkedHashSet.clear();
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) stringArrayList, (Collection) linkedHashSet);
        }
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cubicTo cubicto = (cubicTo) it.next();
            boolean zIsEmpty = ((List) serializer().serializer.read()).isEmpty();
            int i = 1;
            if (transform58bkbwc == null || zIsEmpty || !transform58bkbwc.RatingCompat || !this.MediaDescriptionCompat.remove(cubicto.serializer)) {
                isInfiniteannotations isinfiniteannotationsWrite = write(cubicto, transform58bkbwc);
                String str = cubicto.serializer;
                if (!zIsEmpty) {
                    cubicTo cubicto2 = (cubicTo) onContentCardDismissed.MediaBrowserCompatMediaItem((List) serializer().serializer.read());
                    if (cubicto2 != null) {
                        IconCompatParcelizer(this, cubicto2.serializer, 6);
                    }
                    IconCompatParcelizer(this, str, 6);
                    if (!isinfiniteannotationsWrite.IconCompatParcelizer) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("This FragmentTransaction is not allowed to be added to the back stack.");
                        return;
                    } else {
                        isinfiniteannotationsWrite.write = true;
                        isinfiniteannotationsWrite.ParcelableVolumeInfo = str;
                    }
                }
                isinfiniteannotationsWrite.read();
                if (RemoteActionCompatParcelizer()) {
                    cubicto.toString();
                }
                serializer().MediaBrowserCompatMediaItem(cubicto);
            } else {
                div7ah8wj8.RemoteActionCompatParcelizer((getUnspecifiedNHjbRcannotations) new FragmentManager$SaveBackStackState(div7ah8wj8, cubicto.serializer, i), false);
                serializer().MediaBrowserCompatMediaItem(cubicto);
            }
        }
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final Bundle read() {
        LinkedHashSet linkedHashSet = this.MediaDescriptionCompat;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet))};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        return (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
    }

    public final isInfiniteannotations write(cubicTo cubicto, transform58bKbWc transform58bkbwc) {
        opN5in7k0 opn5in7k0 = cubicto.IconCompatParcelizer;
        opn5in7k0.getClass();
        Bundle bundleRemoteActionCompatParcelizer = cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        String str = ((makeTransparentColors) opn5in7k0).read;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.read;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        getMaxDimensionannotations getmaxdimensionannotationsMediaSessionCompatQueueItem = div7ah8wj8.MediaSessionCompatQueueItem();
        context.getClassLoader();
        androidx.fragment.app.Fragment fragmentSerializer = getmaxdimensionannotationsMediaSessionCompatQueueItem.serializer(str);
        fragmentSerializer.getClass();
        fragmentSerializer.setArguments(bundleRemoteActionCompatParcelizer);
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        int i = transform58bkbwc != null ? transform58bkbwc.serializer : -1;
        int i2 = transform58bkbwc != null ? transform58bkbwc.IconCompatParcelizer : -1;
        int i3 = transform58bkbwc != null ? transform58bkbwc.write : -1;
        int i4 = transform58bkbwc != null ? transform58bkbwc.RemoteActionCompatParcelizer : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            isinfiniteannotations.MediaDescriptionCompat = i;
            isinfiniteannotations.PlaybackStateCompat = i2;
            isinfiniteannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
            isinfiniteannotations.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5;
        }
        isinfiniteannotations.IconCompatParcelizer(this.IconCompatParcelizer, fragmentSerializer, cubicto.serializer);
        isinfiniteannotations.RemoteActionCompatParcelizer(fragmentSerializer);
        isinfiniteannotations.ComponentActivity = true;
        return isinfiniteannotations;
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final opN5in7k0 write() {
        return new makeTransparentColors(this);
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto) {
        String str = cubicto.serializer;
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        isInfiniteannotations isinfiniteannotationsWrite = write(cubicto, (transform58bKbWc) null);
        List list = (List) serializer().serializer.read();
        if (list.size() > 1) {
            cubicTo cubicto2 = (cubicTo) onContentCardDismissed.read(list.size() - 2, list);
            if (cubicto2 != null) {
                IconCompatParcelizer(this, cubicto2.serializer, 6);
            }
            IconCompatParcelizer(this, str, 4);
            div7ah8wj8.RemoteActionCompatParcelizer((getUnspecifiedNHjbRcannotations) new SizeCompanion(div7ah8wj8, str, -1), false);
            IconCompatParcelizer(this, str, 2);
            if (!isinfiniteannotationsWrite.IconCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            } else {
                isinfiniteannotationsWrite.write = true;
                isinfiniteannotationsWrite.ParcelableVolumeInfo = str;
            }
        }
        isinfiniteannotationsWrite.read();
        serializer().write(cubicto);
    }

    public static final class read extends androidx.lifecycle.ViewModel {
        public java.lang.ref.WeakReference read;

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            java.lang.ref.WeakReference weakReference = this.read;
            if (weakReference == null) {
                removeNodeAtDepth.serializer("completeTransition");
                throw null;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) weakReference.get();
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }
    }

    public countTransparentColors(Context context, div7Ah8Wj8 div7ah8wj8, int i) {
        this.read = context;
        this.serializer = div7ah8wj8;
        this.IconCompatParcelizer = i;
    }

    public static boolean RemoteActionCompatParcelizer() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    public final void write(androidx.fragment.app.Fragment fragment, cubicTo cubicto, addRoundRect addroundrect) {
        fragment.getClass();
        getFilterQualityfv9h1I viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(2);
        networkHeaders$Builder.RemoteActionCompatParcelizer(displayInAppMessagelambda1.serializer(read.class), new accessgetBlendMode0nO6VwUjd(24));
        AndroidPaint_androidKt androidPaint_androidKtWrite = networkHeaders$Builder.write();
        setPathEffect setpatheffect = setPathEffect.IconCompatParcelizer;
        setpatheffect.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, androidPaint_androidKtWrite, setpatheffect);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(read.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        } else {
            ((read) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer))).read = new java.lang.ref.WeakReference(new ah$$ExternalSyntheticLambda0(cubicto, addroundrect, this, fragment));
        }
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(final addRoundRect addroundrect) {
        this.write = addroundrect;
        this.RemoteActionCompatParcelizer = true;
        RemoteActionCompatParcelizer();
        getCenteruvyYCjkannotations getcenteruvyycjkannotations = new getCenteruvyYCjkannotations() { // from class: o.ActualRadialGradientShader8uybcMk
            @Override // o.getCenteruvyYCjkannotations
            public final void read(div7Ah8Wj8 div7ah8wj8, androidx.fragment.app.Fragment fragment) {
                Object objPrevious;
                Object[] objArr;
                div7ah8wj8.getClass();
                addRoundRect addroundrect2 = addroundrect;
                List list = (List) addroundrect2.serializer.read();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    objArr = new Object[]{((cubicTo) objPrevious).serializer, fragment.getTag()};
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
                cubicTo cubicto = (cubicTo) objPrevious;
                boolean zRemoteActionCompatParcelizer = countTransparentColors.RemoteActionCompatParcelizer();
                countTransparentColors counttransparentcolors = this;
                if (zRemoteActionCompatParcelizer) {
                    fragment.toString();
                    Objects.toString(cubicto);
                    Objects.toString(counttransparentcolors.serializer);
                }
                if (cubicto != null) {
                    fragment.getViewLifecycleOwnerLiveData().serializer(fragment, new ActualSweepGradientShader9KIMszo(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(counttransparentcolors, fragment, cubicto, 21), 0));
                    fragment.getLifecycle().IconCompatParcelizer(counttransparentcolors.MediaBrowserCompatMediaItem);
                    counttransparentcolors.write(fragment, cubicto, addroundrect2);
                }
            }
        };
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        div7ah8wj8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.add(getcenteruvyycjkannotations);
        div7ah8wj8.write.add(new ActualLinearGradientShaderVjE6UOU(addroundrect, this));
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto, boolean z) {
        div7Ah8Wj8 div7ah8wj8 = this.serializer;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        List list = (List) serializer().serializer.read();
        int iIndexOf = list.indexOf(cubicto);
        List listSubList = list.subList(iIndexOf, list.size());
        cubicTo cubicto2 = (cubicTo) onContentCardDismissed.read(list);
        cubicTo cubicto3 = (cubicTo) onContentCardDismissed.read(iIndexOf - 1, list);
        if (cubicto3 != null) {
            IconCompatParcelizer(this, cubicto3.serializer, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                Object next = it.next();
                cubicTo cubicto4 = (cubicTo) next;
                r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww = onContentCardDismissed.read((Iterable) this.RatingCompat);
                String str = cubicto4.serializer;
                Iterator it2 = r8lambdan7z0ea2bnxeplvipqp_gdhwww.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it2.next();
                        onviewattachedtowindowlambda0.getClass();
                        String str2 = (String) onviewattachedtowindowlambda0.serializer;
                        if (i >= 0) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
                                if (i >= 0) {
                                }
                                arrayList.add(next);
                            } else {
                                i++;
                            }
                        } else {
                            androidx.sqlite.SQLite.serializer();
                            throw null;
                        }
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cubicto4.serializer, cubicto2.serializer}, getCieXyz.write())).booleanValue()) {
                        arrayList.add(next);
                    }
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    IconCompatParcelizer(this, ((cubicTo) it3.next()).serializer, 4);
                }
                if (z) {
                    for (cubicTo cubicto5 : onContentCardDismissed.MediaMetadataCompat((Iterable) list2)) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cubicto5, cubicto2}, getCieXyz.write())).booleanValue()) {
                            Objects.toString(cubicto5);
                        } else {
                            div7ah8wj8.RemoteActionCompatParcelizer((getUnspecifiedNHjbRcannotations) new FragmentManager$SaveBackStackState(div7ah8wj8, cubicto5.serializer, i), false);
                            this.MediaDescriptionCompat.add(cubicto5.serializer);
                        }
                    }
                } else {
                    div7ah8wj8.RemoteActionCompatParcelizer((getUnspecifiedNHjbRcannotations) new SizeCompanion(div7ah8wj8, cubicto.serializer, -1), false);
                }
                if (RemoteActionCompatParcelizer()) {
                    cubicto.toString();
                }
                serializer().write(cubicto, z);
                return;
            }
        }
    }

    public static void IconCompatParcelizer(countTransparentColors counttransparentcolors, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = counttransparentcolors.RatingCompat;
        if (z2) {
            onContentCardDismissed.write((List) arrayList, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str, 3));
        }
        arrayList.add(new onViewAttachedToWindowlambda0(str, Boolean.valueOf(z)));
    }
}
