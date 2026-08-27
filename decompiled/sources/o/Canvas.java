package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class Canvas implements toAndroidColorSpace {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object serializer;

    public /* synthetic */ Canvas(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int iNextIndex;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = null;
        if (i == 0) {
            new HashMap();
            actualLightingColorFilterOWjLjI[] actuallightingcolorfilterowjljiArr = (actualLightingColorFilterOWjLjI[]) obj;
            if (actuallightingcolorfilterowjljiArr.length > 0) {
                actualLightingColorFilterOWjLjI actuallightingcolorfilterowjlji = actuallightingcolorfilterowjljiArr[0];
                throw null;
            }
            if (actuallightingcolorfilterowjljiArr.length <= 0) {
                return;
            }
            actualLightingColorFilterOWjLjI actuallightingcolorfilterowjlji2 = actuallightingcolorfilterowjljiArr[0];
            throw null;
        }
        AndroidRenderEffect_androidKt androidRenderEffect_androidKt = (AndroidRenderEffect_androidKt) obj;
        int i2 = AndroidShader_androidKt.IconCompatParcelizer[androidColorSpace_androidKt.ordinal()];
        if (i2 == 1) {
            androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) accessisrendernodecompatiblecp;
            Iterable iterable = (Iterable) androidRenderEffect_androidKt.serializer().serializer.read();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object[] objArr = {((cubicTo) it.next()).serializer, dialogFragment.getTag()};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        return;
                    }
                }
            }
            dialogFragment.write();
            return;
        }
        if (i2 == 2) {
            androidx.fragment.app.DialogFragment dialogFragment2 = (androidx.fragment.app.DialogFragment) accessisrendernodecompatiblecp;
            for (Object obj3 : (Iterable) androidRenderEffect_androidKt.serializer().MediaBrowserCompatMediaItem.read()) {
                Object[] objArr2 = {((cubicTo) obj3).serializer, dialogFragment2.getTag()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    obj2 = obj3;
                }
            }
            cubicTo cubicto = (cubicTo) obj2;
            if (cubicto != null) {
                androidRenderEffect_androidKt.serializer().IconCompatParcelizer(cubicto);
                return;
            }
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            androidx.fragment.app.DialogFragment dialogFragment3 = (androidx.fragment.app.DialogFragment) accessisrendernodecompatiblecp;
            for (Object obj4 : (Iterable) androidRenderEffect_androidKt.serializer().MediaBrowserCompatMediaItem.read()) {
                Object[] objArr3 = {((cubicTo) obj4).serializer, dialogFragment3.getTag()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    obj2 = obj4;
                }
            }
            cubicTo cubicto2 = (cubicTo) obj2;
            if (cubicto2 != null) {
                androidRenderEffect_androidKt.serializer().IconCompatParcelizer(cubicto2);
            }
            dialogFragment3.getLifecycle().read(this);
            return;
        }
        androidx.fragment.app.DialogFragment dialogFragment4 = (androidx.fragment.app.DialogFragment) accessisrendernodecompatiblecp;
        if (dialogFragment4.y_().isShowing()) {
            return;
        }
        List list = (List) androidRenderEffect_androidKt.serializer().serializer.read();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Object[] objArr4 = {((cubicTo) listIterator.previous()).serializer, dialogFragment4.getTag()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        cubicTo cubicto3 = (cubicTo) onContentCardDismissed.read(iNextIndex, list);
        Object[] objArr5 = {onContentCardDismissed.MediaBrowserCompatMediaItem(list), cubicto3};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            dialogFragment4.toString();
        }
        if (cubicto3 != null) {
            androidRenderEffect_androidKt.RemoteActionCompatParcelizer(iNextIndex, cubicto3, false);
        }
    }
}
