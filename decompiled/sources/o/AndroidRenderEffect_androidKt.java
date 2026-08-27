package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "dialog")
public final class AndroidRenderEffect_androidKt extends toAndroidPathDashPathEffectStyleoQv6xUo {
    public final Context IconCompatParcelizer;
    public final div7Ah8Wj8 read;
    public final LinkedHashSet RatingCompat = new LinkedHashSet();
    public final Canvas serializer = new Canvas(1, this);
    public final LinkedHashMap MediaBrowserCompatMediaItem = new LinkedHashMap();

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void RemoteActionCompatParcelizer(List list, transform58bKbWc transform58bkbwc) {
        div7Ah8Wj8 div7ah8wj8 = this.read;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cubicTo cubicto = (cubicTo) it.next();
            read(cubicto).RemoteActionCompatParcelizer(div7ah8wj8, cubicto.serializer);
            cubicTo cubicto2 = (cubicTo) onContentCardDismissed.MediaBrowserCompatMediaItem((List) serializer().serializer.read());
            boolean zWrite = onContentCardDismissed.write((Iterable) serializer().MediaBrowserCompatMediaItem.read(), cubicto2);
            serializer().MediaBrowserCompatMediaItem(cubicto);
            if (cubicto2 != null && !zWrite) {
                serializer().IconCompatParcelizer(cubicto2);
            }
        }
    }

    public final androidx.fragment.app.DialogFragment read(cubicTo cubicto) {
        opN5in7k0 opn5in7k0 = cubicto.IconCompatParcelizer;
        opn5in7k0.getClass();
        asComposeRenderEffect ascomposerendereffect = (asComposeRenderEffect) opn5in7k0;
        String str = ascomposerendereffect.read;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.IconCompatParcelizer;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        getMaxDimensionannotations getmaxdimensionannotationsMediaSessionCompatQueueItem = this.read.MediaSessionCompatQueueItem();
        context.getClassLoader();
        androidx.fragment.app.Fragment fragmentSerializer = getmaxdimensionannotationsMediaSessionCompatQueueItem.serializer(str);
        fragmentSerializer.getClass();
        if (androidx.fragment.app.DialogFragment.class.isAssignableFrom(fragmentSerializer.getClass())) {
            androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) fragmentSerializer;
            dialogFragment.setArguments(cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer());
            dialogFragment.getLifecycle().IconCompatParcelizer(this.serializer);
            this.MediaBrowserCompatMediaItem.put(cubicto.serializer, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = ascomposerendereffect.read;
        if (str2 != null) {
            DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("DialogFragment class was not set");
        return null;
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final opN5in7k0 write() {
        return new asComposeRenderEffect(this);
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto) {
        String str = cubicto.serializer;
        div7Ah8Wj8 div7ah8wj8 = this.read;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) this.MediaBrowserCompatMediaItem.get(str);
        if (dialogFragment == null) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag(str);
            dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().read(this.serializer);
            dialogFragment.write();
        }
        read(cubicto).RemoteActionCompatParcelizer(div7ah8wj8, str);
        addRoundRect addroundrectSerializer = serializer();
        List list = (List) addroundrectSerializer.serializer.read();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            cubicTo cubicto2 = (cubicTo) listIterator.previous();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cubicto2.serializer, str}, getCieXyz.write())).booleanValue()) {
                MutableStateFlow mutableStateFlow = addroundrectSerializer.IconCompatParcelizer;
                mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto, RangesKt.RemoteActionCompatParcelizer(cubicto2, (Set) mutableStateFlow.read())));
                addroundrectSerializer.write(cubicto);
                return;
            }
        }
        DrawableTransformation.write("List contains no element matching the predicate.");
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(cubicTo cubicto, boolean z) {
        div7Ah8Wj8 div7ah8wj8 = this.read;
        if (div7ah8wj8.MediaBrowserCompatMediaItem()) {
            return;
        }
        List list = (List) serializer().serializer.read();
        int iIndexOf = list.indexOf(cubicto);
        Iterator it = onContentCardDismissed.MediaMetadataCompat((Iterable) list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag(((cubicTo) it.next()).serializer);
            if (fragmentFindFragmentByTag != null) {
                ((androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag).write();
            }
        }
        RemoteActionCompatParcelizer(iIndexOf, cubicto, z);
    }

    public AndroidRenderEffect_androidKt(Context context, div7Ah8Wj8 div7ah8wj8) {
        this.IconCompatParcelizer = context;
        this.read = div7ah8wj8;
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final void write(addRoundRect addroundrect) {
        supportsColorMatrixQuery lifecycle;
        this.write = addroundrect;
        this.RemoteActionCompatParcelizer = true;
        Iterator it = ((List) addroundrect.serializer.read()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            div7Ah8Wj8 div7ah8wj8 = this.read;
            if (!zHasNext) {
                div7ah8wj8.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.add(new getCenteruvyYCjkannotations() { // from class: o.ActualImageShaderF49vj9s
                    @Override // o.getCenteruvyYCjkannotations
                    public final void read(div7Ah8Wj8 div7ah8wj9, androidx.fragment.app.Fragment fragment) {
                        div7ah8wj9.getClass();
                        AndroidRenderEffect_androidKt androidRenderEffect_androidKt = this.read;
                        LinkedHashSet linkedHashSet = androidRenderEffect_androidKt.RatingCompat;
                        if (pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().IconCompatParcelizer(androidRenderEffect_androidKt.serializer);
                        }
                        LinkedHashMap linkedHashMap = androidRenderEffect_androidKt.MediaBrowserCompatMediaItem;
                        pauseWebviewIfNecessarylambda10.serializer(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            cubicTo cubicto = (cubicTo) it.next();
            androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) div7ah8wj8.findFragmentByTag(cubicto.serializer);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.RatingCompat.add(cubicto.serializer);
            } else {
                lifecycle.IconCompatParcelizer(this.serializer);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, cubicTo cubicto, boolean z) {
        cubicTo cubicto2 = (cubicTo) onContentCardDismissed.read(i - 1, (List) serializer().serializer.read());
        boolean zWrite = onContentCardDismissed.write((Iterable) serializer().MediaBrowserCompatMediaItem.read(), cubicto2);
        serializer().write(cubicto, z);
        if (cubicto2 == null || zWrite) {
            return;
        }
        serializer().IconCompatParcelizer(cubicto2);
    }
}
