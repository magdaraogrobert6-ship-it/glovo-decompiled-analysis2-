package o;

import com.google.android.gms.measurement.internal.zzgz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setThrottleMillis {
    public final boolean IconCompatParcelizer;
    public final ImageKt MediaBrowserCompatMediaItem;
    public final BitSet MediaSessionCompatQueueItem;
    public final ImageKt RatingCompat;
    public final /* synthetic */ setContent RemoteActionCompatParcelizer;
    public final BitSet read;
    public final getWEK5gGoQ serializer;
    public final String write;

    public setThrottleMillis(setContent setcontent, String str, getWEK5gGoQ getwek5ggoq, BitSet bitSet, BitSet bitSet2, ImageKt imageKt, ImageKt imageKt2) {
        this.RemoteActionCompatParcelizer = setcontent;
        this.write = str;
        this.read = bitSet;
        this.MediaSessionCompatQueueItem = bitSet2;
        this.MediaBrowserCompatMediaItem = imageKt;
        this.RatingCompat = new ImageKt(0);
        for (Integer num : (Image) imageKt2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) imageKt2.get(num));
            this.RatingCompat.put(num, arrayList);
        }
        this.IconCompatParcelizer = false;
        this.serializer = getwek5ggoq;
    }

    public final getTvNumberEntryEK5gGoQ RemoteActionCompatParcelizer(int i) {
        ArrayList arrayList;
        List list;
        getTvMediaContextMenuEK5gGoQ gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer = getTvNumberEntryEK5gGoQ.RemoteActionCompatParcelizer();
        gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.ParcelableVolumeInfo();
        ((getTvNumberEntryEK5gGoQ) gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer).IconCompatParcelizer(i);
        gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.ParcelableVolumeInfo();
        ((getTvNumberEntryEK5gGoQ) gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer).serializer(this.IconCompatParcelizer);
        getWEK5gGoQ getwek5ggoq = this.serializer;
        if (getwek5ggoq != null) {
            gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.ParcelableVolumeInfo();
            ((getTvNumberEntryEK5gGoQ) gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer).write(getwek5ggoq);
        }
        getVolumeDownEK5gGoQ getvolumedownek5ggoqSerializer = getWEK5gGoQ.serializer();
        ArrayList arrayListSerializer = zzgz.serializer(this.read);
        getvolumedownek5ggoqSerializer.ParcelableVolumeInfo();
        ((getWEK5gGoQ) getvolumedownek5ggoqSerializer.IconCompatParcelizer).serializer(arrayListSerializer);
        ArrayList arrayListSerializer2 = zzgz.serializer(this.MediaSessionCompatQueueItem);
        getvolumedownek5ggoqSerializer.ParcelableVolumeInfo();
        ((getWEK5gGoQ) getvolumedownek5ggoqSerializer.IconCompatParcelizer).IconCompatParcelizer(arrayListSerializer2);
        ImageKt imageKt = this.MediaBrowserCompatMediaItem;
        if (imageKt == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(imageKt.MediaMetadataCompat);
            for (Integer num : (Image) imageKt.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) imageKt.get(num);
                if (l != null) {
                    getTvSatelliteEK5gGoQ gettvsatelliteek5ggoqWrite = getTvSatelliteCsEK5gGoQ.write();
                    gettvsatelliteek5ggoqWrite.ParcelableVolumeInfo();
                    ((getTvSatelliteCsEK5gGoQ) gettvsatelliteek5ggoqWrite.IconCompatParcelizer).read(iIntValue);
                    long jLongValue = l.longValue();
                    gettvsatelliteek5ggoqWrite.ParcelableVolumeInfo();
                    ((getTvSatelliteCsEK5gGoQ) gettvsatelliteek5ggoqWrite.IconCompatParcelizer).RemoteActionCompatParcelizer(jLongValue);
                    arrayList2.add((getTvSatelliteCsEK5gGoQ) gettvsatelliteek5ggoqWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            getvolumedownek5ggoqSerializer.ParcelableVolumeInfo();
            ((getWEK5gGoQ) getvolumedownek5ggoqSerializer.IconCompatParcelizer).RemoteActionCompatParcelizer(arrayList);
        }
        ImageKt imageKt2 = this.RatingCompat;
        if (imageKt2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(imageKt2.MediaMetadataCompat);
            for (Integer num2 : (Image) imageKt2.keySet()) {
                getVolumeUpEK5gGoQ getvolumeupek5ggoqIconCompatParcelizer = getVoiceAssistEK5gGoQ.IconCompatParcelizer();
                int iIntValue2 = num2.intValue();
                getvolumeupek5ggoqIconCompatParcelizer.ParcelableVolumeInfo();
                ((getVoiceAssistEK5gGoQ) getvolumeupek5ggoqIconCompatParcelizer.IconCompatParcelizer).serializer(iIntValue2);
                List list2 = (List) imageKt2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    getvolumeupek5ggoqIconCompatParcelizer.ParcelableVolumeInfo();
                    ((getVoiceAssistEK5gGoQ) getvolumeupek5ggoqIconCompatParcelizer.IconCompatParcelizer).read(list2);
                }
                arrayList3.add((getVoiceAssistEK5gGoQ) getvolumeupek5ggoqIconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            }
            list = arrayList3;
        }
        getvolumedownek5ggoqSerializer.ParcelableVolumeInfo();
        ((getWEK5gGoQ) getvolumedownek5ggoqSerializer.IconCompatParcelizer).RemoteActionCompatParcelizer(list);
        gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.ParcelableVolumeInfo();
        ((getTvNumberEntryEK5gGoQ) gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer).serializer((getWEK5gGoQ) getvolumedownek5ggoqSerializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        return (getTvNumberEntryEK5gGoQ) gettvmediacontextmenuek5ggoqRemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    public final void RemoteActionCompatParcelizer(setForceRecompose setforcerecompose) {
        int iRemoteActionCompatParcelizer = setforcerecompose.IconCompatParcelizer != 0 ? ((getSystemNavigationUpEK5gGoQ) setforcerecompose.RatingCompat).RemoteActionCompatParcelizer() : ((getSpacebarEK5gGoQ) setforcerecompose.RatingCompat).write();
        if (setforcerecompose.RemoteActionCompatParcelizer != null) {
            this.MediaSessionCompatQueueItem.set(iRemoteActionCompatParcelizer, true);
        }
        Boolean bool = setforcerecompose.MediaMetadataCompat;
        if (bool != null) {
            this.read.set(iRemoteActionCompatParcelizer, bool.booleanValue());
        }
        if (setforcerecompose.MediaBrowserCompatMediaItem != null) {
            Integer numValueOf = Integer.valueOf(iRemoteActionCompatParcelizer);
            ImageKt imageKt = this.MediaBrowserCompatMediaItem;
            Long l = (Long) imageKt.get(numValueOf);
            long jLongValue = setforcerecompose.MediaBrowserCompatMediaItem.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                imageKt.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (setforcerecompose.MediaDescriptionCompat != null) {
            Integer numValueOf2 = Integer.valueOf(iRemoteActionCompatParcelizer);
            ImageKt imageKt2 = this.RatingCompat;
            List arrayList = (List) imageKt2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                imageKt2.put(numValueOf2, arrayList);
            }
            if (setforcerecompose.IconCompatParcelizer != 0) {
                arrayList.clear();
            }
            accessgetRelocatecp.write();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
            LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.accessensureViewModelStore;
            String str = this.write;
            if (setcomposedwithreusablecontenthost.write(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) && setforcerecompose.IconCompatParcelizer == 0 && ((getSpacebarEK5gGoQ) setforcerecompose.RatingCompat).RatingCompat()) {
                arrayList.clear();
            }
            accessgetRelocatecp.write();
            boolean zWrite = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1);
            Long l2 = setforcerecompose.MediaDescriptionCompat;
            if (!zWrite) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public setThrottleMillis(setContent setcontent, String str) {
        this.RemoteActionCompatParcelizer = setcontent;
        this.write = str;
        this.IconCompatParcelizer = true;
        this.read = new BitSet();
        this.MediaSessionCompatQueueItem = new BitSet();
        this.MediaBrowserCompatMediaItem = new ImageKt(0);
        this.RatingCompat = new ImageKt(0);
    }
}
