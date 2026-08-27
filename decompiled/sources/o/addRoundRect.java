package o;

import android.os.Bundle;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class addRoundRect {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final /* synthetic */ relativeMoveTo MediaDescriptionCompat;
    public final toAndroidPathDashPathEffectStyleoQv6xUo MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final com.huawei.hmf.tasks.a.j write;

    public final cubicTo read(opN5in7k0 opn5in7k0, Bundle bundle) {
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.MediaDescriptionCompat.read;
        toandroidtilemode0vamqd0.getClass();
        return toContentCaptureSession.serializer(toandroidtilemode0vamqd0.ResultReceiver.MediaMetadataCompat, opn5in7k0, bundle, toandroidtilemode0vamqd0.IconCompatParcelizer(), toandroidtilemode0vamqd0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
    }

    public final void write(cubicTo cubicto) {
        int iNextIndex;
        synchronized (this.write) {
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) this.serializer.read());
            ListIterator listIterator = arrayListIconCompatParcelizer.listIterator(arrayListIconCompatParcelizer.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                Object[] objArr = {((cubicTo) listIterator.previous()).serializer, cubicto.serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListIconCompatParcelizer.set(iNextIndex, cubicto);
            this.read.IconCompatParcelizer(arrayListIconCompatParcelizer);
        }
    }

    public addRoundRect(relativeMoveTo relativemoveto, toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo) {
        toandroidpathdashpatheffectstyleoqv6xuo.getClass();
        this.MediaDescriptionCompat = relativemoveto;
        this.write = new com.huawei.hmf.tasks.a.j(10);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(instance_delegatelambda0.write);
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(ItemTouchHelperAdapter.serializer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.serializer = FlowKt.write(mutableStateFlow);
        this.MediaBrowserCompatMediaItem = FlowKt.write(mutableStateFlow2);
        this.MediaMetadataCompat = toandroidpathdashpatheffectstyleoqv6xuo;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    public final void IconCompatParcelizer(cubicTo cubicto) {
        getInternalPath getinternalpath;
        getFilterQualityfv9h1I getfilterqualityfv9h1i;
        cubicto.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.MediaDescriptionCompat.read;
        MutableStateFlow mutableStateFlow = toandroidtilemode0vamqd0.read;
        String str = cubicto.serializer;
        LinkedHashMap linkedHashMap = toandroidtilemode0vamqd0.ParcelableVolumeInfo;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{linkedHashMap.get(cubicto), Boolean.TRUE}, getCieXyz.write())).booleanValue();
        MutableStateFlow mutableStateFlow2 = this.IconCompatParcelizer;
        Set set = (Set) mutableStateFlow2.read();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, cubicto}, getCieXyz.write())).booleanValue()) {
                    z = true;
                    z2 = false;
                }
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        mutableStateFlow2.IconCompatParcelizer(linkedHashSet);
        linkedHashMap.remove(cubicto);
        BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
        if (brazeContentCardsManager.contains(cubicto)) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            toandroidtilemode0vamqd0.MediaDescriptionCompat();
            toandroidtilemode0vamqd0.serializer.write(new ArrayList(brazeContentCardsManager));
            mutableStateFlow.write(toandroidtilemode0vamqd0.MediaBrowserCompatMediaItem());
            return;
        }
        toandroidtilemode0vamqd0.IconCompatParcelizer(cubicto);
        if (cubicto.MediaBrowserCompatMediaItem.RatingCompat.RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
            cubicto.read(toColorLong8_81llA.DESTROYED);
        }
        if (!brazeContentCardsManager.isEmpty()) {
            Iterator it = brazeContentCardsManager.iterator();
            while (it.hasNext()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((cubicTo) it.next()).serializer, str}, getCieXyz.write())).booleanValue()) {
                }
            }
            if (!zBooleanValue) {
                str.getClass();
                getfilterqualityfv9h1i = (getFilterQualityfv9h1I) getinternalpath.read.remove(str);
                if (getfilterqualityfv9h1i != null) {
                    getfilterqualityfv9h1i.read();
                }
            }
        } else if (!zBooleanValue && (getinternalpath = toandroidtilemode0vamqd0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) != null) {
            str.getClass();
            getfilterqualityfv9h1i = (getFilterQualityfv9h1I) getinternalpath.read.remove(str);
            if (getfilterqualityfv9h1i != null) {
                getfilterqualityfv9h1i.read();
            }
        }
        toandroidtilemode0vamqd0.MediaDescriptionCompat();
        mutableStateFlow.write(toandroidtilemode0vamqd0.MediaBrowserCompatMediaItem());
    }

    public final void MediaBrowserCompatMediaItem(cubicTo cubicto) {
        cubicto.getClass();
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        Iterable iterable = (Iterable) mutableStateFlow.read();
        boolean z = iterable instanceof Collection;
        StateFlow stateFlow = this.serializer;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((cubicTo) it.next()) == cubicto) {
                    Iterable iterable2 = (Iterable) stateFlow.read();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((cubicTo) it2.next()) == cubicto) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        cubicTo cubicto2 = (cubicTo) onContentCardDismissed.MediaBrowserCompatMediaItem((List) stateFlow.read());
        if (cubicto2 != null) {
            mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto2, (Set) mutableStateFlow.read()));
        }
        mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto, (Set) mutableStateFlow.read()));
        RemoteActionCompatParcelizer(cubicto);
    }

    public final void RemoteActionCompatParcelizer(cubicTo cubicto) {
        cubicto.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.MediaDescriptionCompat.read;
        toandroidtilemode0vamqd0.getClass();
        toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer.RemoteActionCompatParcelizer(cubicto.IconCompatParcelizer.MediaMetadataCompat);
        if (!toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer.equals(this.MediaMetadataCompat)) {
            Object obj = toandroidtilemode0vamqd0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.get(toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer);
            if (obj != null) {
                ((addRoundRect) obj).RemoteActionCompatParcelizer(cubicto);
                return;
            } else {
                DrawableTransformation.read((Object) ff$$ExternalSyntheticOutline0.m(new StringBuilder("NavigatorBackStack for "), cubicto.IconCompatParcelizer.MediaMetadataCompat, " should already be created"));
                return;
            }
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = toandroidtilemode0vamqd0.MediaBrowserCompatMediaItem;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            Objects.toString(cubicto.IconCompatParcelizer);
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cubicto);
            serializer(cubicto);
        }
    }

    public final void RemoteActionCompatParcelizer(cubicTo cubicto, boolean z) {
        cubicto.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.MediaDescriptionCompat.read;
        ah$$ExternalSyntheticLambda0 ah__externalsyntheticlambda0 = new ah$$ExternalSyntheticLambda0(this, cubicto, z);
        toandroidtilemode0vamqd0.getClass();
        toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer = toandroidtilemode0vamqd0.IconCompatParcelizer.RemoteActionCompatParcelizer(cubicto.IconCompatParcelizer.MediaMetadataCompat);
        toandroidtilemode0vamqd0.ParcelableVolumeInfo.put(cubicto, Boolean.valueOf(z));
        if (!toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer.equals(this.MediaMetadataCompat)) {
            Object obj = toandroidtilemode0vamqd0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.get(toandroidpathdashpatheffectstyleoqv6xuoRemoteActionCompatParcelizer);
            obj.getClass();
            ((addRoundRect) obj).RemoteActionCompatParcelizer(cubicto, z);
            return;
        }
        Api26Bitmap api26Bitmap = toandroidtilemode0vamqd0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (api26Bitmap != null) {
            api26Bitmap.invoke(cubicto);
            ah__externalsyntheticlambda0.invoke();
            return;
        }
        BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
        int iIndexOf = brazeContentCardsManager.indexOf(cubicto);
        if (iIndexOf < 0) {
            cubicto.toString();
            return;
        }
        int i = iIndexOf + 1;
        if (i != brazeContentCardsManager.RemoteActionCompatParcelizer) {
            toandroidtilemode0vamqd0.write(((cubicTo) brazeContentCardsManager.get(i)).IconCompatParcelizer.serializer.RemoteActionCompatParcelizer, true, false);
        }
        toAndroidTileMode0vamqd0.write(toandroidtilemode0vamqd0, cubicto);
        ah__externalsyntheticlambda0.invoke();
        toandroidtilemode0vamqd0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.invoke();
        toandroidtilemode0vamqd0.RemoteActionCompatParcelizer();
    }

    public final void read(cubicTo cubicto) {
        cubicto.getClass();
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto, (Set) mutableStateFlow.read()));
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.MediaDescriptionCompat.read;
        toandroidtilemode0vamqd0.getClass();
        if (toandroidtilemode0vamqd0.MediaSessionCompatQueueItem.contains(cubicto)) {
            cubicto.read(toColorLong8_81llA.STARTED);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot transition entry that is not in the back stack");
        }
    }

    public final void serializer(cubicTo cubicto) {
        cubicto.getClass();
        synchronized (this.write) {
            MutableStateFlow mutableStateFlow = this.read;
            mutableStateFlow.IconCompatParcelizer(onContentCardDismissed.RemoteActionCompatParcelizer((Collection) mutableStateFlow.read(), (Object) cubicto));
        }
    }

    public final void write(cubicTo cubicto, boolean z) {
        Object objPrevious;
        cubicto.getClass();
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        Iterable iterable = (Iterable) mutableStateFlow.read();
        boolean z2 = iterable instanceof Collection;
        StateFlow stateFlow = this.serializer;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((cubicTo) it.next()) == cubicto) {
                    Iterable iterable2 = (Iterable) stateFlow.read();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((cubicTo) it2.next()) == cubicto) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto, (Set) mutableStateFlow.read()));
        List list = (List) stateFlow.read();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            cubicTo cubicto2 = (cubicTo) objPrevious;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{cubicto2, cubicto}, iWrite3)).booleanValue() && ((List) stateFlow.read()).lastIndexOf(cubicto2) < ((List) stateFlow.read()).lastIndexOf(cubicto)) {
                break;
            }
        }
        cubicTo cubicto3 = (cubicTo) objPrevious;
        if (cubicto3 != null) {
            mutableStateFlow.IconCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(cubicto3, (Set) mutableStateFlow.read()));
        }
        RemoteActionCompatParcelizer(cubicto, z);
    }
}
