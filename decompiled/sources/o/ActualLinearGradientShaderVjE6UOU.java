package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ActualLinearGradientShaderVjE6UOU {
    public final /* synthetic */ addRoundRect IconCompatParcelizer;
    public final /* synthetic */ countTransparentColors RemoteActionCompatParcelizer;

    public final void read(androidx.fragment.app.Fragment fragment, boolean z) {
        Object obj;
        Object objPrevious;
        countTransparentColors counttransparentcolors = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = counttransparentcolors.RatingCompat;
        fragment.getClass();
        addRoundRect addroundrect = this.IconCompatParcelizer;
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Iterable) addroundrect.MediaBrowserCompatMediaItem.read(), (Collection) addroundrect.serializer.read());
        ListIterator listIterator = arrayListIconCompatParcelizer.listIterator(arrayListIconCompatParcelizer.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((cubicTo) objPrevious).serializer, fragment.getTag()}, getCieXyz.write())).booleanValue());
        cubicTo cubicto = (cubicTo) objPrevious;
        boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
        for (Object obj2 : arrayList) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onViewAttachedToWindowlambda0) obj2).serializer, fragment.getTag()}, getCieXyz.write())).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
        if (onviewattachedtowindowlambda0 != null) {
            arrayList.remove(onviewattachedtowindowlambda0);
        }
        if (!z2 && countTransparentColors.RemoteActionCompatParcelizer()) {
            fragment.toString();
            Objects.toString(cubicto);
        }
        boolean z3 = onviewattachedtowindowlambda0 != null && ((Boolean) onviewattachedtowindowlambda0.write).booleanValue();
        if (!z && !z3 && cubicto == null) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (cubicto != null) {
            counttransparentcolors.write(fragment, cubicto, addroundrect);
            if (z2) {
                if (countTransparentColors.RemoteActionCompatParcelizer()) {
                    fragment.toString();
                    cubicto.toString();
                }
                addroundrect.write(cubicto, false);
            }
        }
    }

    public ActualLinearGradientShaderVjE6UOU(addRoundRect addroundrect, countTransparentColors counttransparentcolors) {
        this.IconCompatParcelizer = addroundrect;
        this.RemoteActionCompatParcelizer = counttransparentcolors;
    }

    public final void IconCompatParcelizer(androidx.fragment.app.Fragment fragment, boolean z) {
        Object objPrevious;
        Object[] objArr;
        fragment.getClass();
        if (z) {
            addRoundRect addroundrect = this.IconCompatParcelizer;
            List list = (List) addroundrect.serializer.read();
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
            if (countTransparentColors.RemoteActionCompatParcelizer()) {
                fragment.toString();
                Objects.toString(cubicto);
            }
            if (cubicto != null) {
                addroundrect.read(cubicto);
            }
        }
    }
}
