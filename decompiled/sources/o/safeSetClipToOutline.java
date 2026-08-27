package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractList;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class safeSetClipToOutline implements Map, Serializable, displayInAppMessagelambda120 {
    public static final safeSetClipToOutline RemoteActionCompatParcelizer;
    public setActionHintText IconCompatParcelizer;
    public Object[] MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int[] MediaSessionCompatResultReceiverWrapper;
    public ContentCardViewHolder MediaSessionCompatToken;
    public Object[] ParcelableVolumeInfo;
    public int PlaybackStateCompatCustomAction;
    public getImageView RatingCompat;
    public int read;
    public boolean serializer;
    public int[] write;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return read(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return IconCompatParcelizer(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.PlaybackStateCompatCustomAction == 0;
    }

    @Override // java.util.Map
    public final int size() {
        return this.PlaybackStateCompatCustomAction;
    }

    public safeSetClipToOutline(int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.MediaBrowserCompatMediaItem = objArr;
        this.ParcelableVolumeInfo = null;
        this.MediaSessionCompatResultReceiverWrapper = iArr;
        this.write = new int[iHighestOneBit];
        this.MediaSessionCompatQueueItem = 2;
        this.MediaMetadataCompat = 0;
        this.read = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final void IconCompatParcelizer(int i) {
        int i2;
        int i3;
        int iWrite;
        int[] iArr;
        Object[] objArr = this.MediaBrowserCompatMediaItem;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.ParcelableVolumeInfo;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.MediaSessionCompatResultReceiverWrapper[i];
        loop0: while (true) {
            int length = i4;
            int i5 = 0;
            do {
                length = length == 0 ? this.write.length - 1 : length - 1;
                int[] iArr2 = this.write;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.MediaSessionCompatQueueItem) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iWrite = write(this.MediaBrowserCompatMediaItem[i3]);
                    iArr = this.write;
                }
            } while (((iWrite - length) & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.MediaSessionCompatResultReceiverWrapper[i3] = i4;
            i4 = length;
        }
        this.MediaSessionCompatResultReceiverWrapper[i] = -1;
        this.PlaybackStateCompatCustomAction--;
        this.MediaDescriptionCompat++;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.PlaybackStateCompatCustomAction == map.size() && RemoteActionCompatParcelizer(map.entrySet());
    }

    public final void read(int i) {
        Object[] objArr = this.MediaBrowserCompatMediaItem;
        int length = objArr.length;
        int i2 = this.MediaMetadataCompat;
        int i3 = length - i2;
        int i4 = i2 - this.PlaybackStateCompatCustomAction;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            serializer(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
            int length2 = objArr.length;
            defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
            int iIconCompatParcelizer = DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(length2, i5);
            Object[] objArr2 = this.MediaBrowserCompatMediaItem;
            objArr2.getClass();
            this.MediaBrowserCompatMediaItem = Arrays.copyOf(objArr2, iIconCompatParcelizer);
            Object[] objArr3 = this.ParcelableVolumeInfo;
            this.ParcelableVolumeInfo = objArr3 != null ? Arrays.copyOf(objArr3, iIconCompatParcelizer) : null;
            this.MediaSessionCompatResultReceiverWrapper = Arrays.copyOf(this.MediaSessionCompatResultReceiverWrapper, iIconCompatParcelizer);
            int iHighestOneBit = Integer.highestOneBit((iIconCompatParcelizer >= 1 ? iIconCompatParcelizer : 1) * 3);
            if (iHighestOneBit > this.write.length) {
                RemoteActionCompatParcelizer(iHighestOneBit);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.PlaybackStateCompatCustomAction * 3) + 2);
        sb.append("{");
        CaptionedImageContentCardViewViewHolder captionedImageContentCardViewViewHolder = new CaptionedImageContentCardViewViewHolder(this, 1);
        int i = 0;
        while (captionedImageContentCardViewViewHolder.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = captionedImageContentCardViewViewHolder.read;
            safeSetClipToOutline safesetcliptooutline = captionedImageContentCardViewViewHolder.RemoteActionCompatParcelizer;
            if (i2 >= safesetcliptooutline.MediaMetadataCompat) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            captionedImageContentCardViewViewHolder.read = i2 + 1;
            captionedImageContentCardViewViewHolder.serializer = i2;
            Object obj = safesetcliptooutline.MediaBrowserCompatMediaItem[i2];
            if (obj == safesetcliptooutline) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
            objArr.getClass();
            Object obj2 = objArr[captionedImageContentCardViewViewHolder.serializer];
            if (obj2 == safesetcliptooutline) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            captionedImageContentCardViewViewHolder.serializer();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final int write(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.read;
    }

    static {
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline(0);
        safesetcliptooutline.serializer = true;
        RemoteActionCompatParcelizer = safesetcliptooutline;
    }

    public final boolean RemoteActionCompatParcelizer(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                Map.Entry entry = (Map.Entry) obj;
                int i = read(entry.getKey());
                if (i < 0) {
                    return false;
                }
                Object[] objArr = this.ParcelableVolumeInfo;
                objArr.getClass();
                Object[] objArr2 = {objArr[i], entry.getValue()};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        read();
        int i = this.MediaMetadataCompat - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.MediaSessionCompatResultReceiverWrapper;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.write[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        MathKt.write(0, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem);
        Object[] objArr = this.ParcelableVolumeInfo;
        if (objArr != null) {
            MathKt.write(0, this.MediaMetadataCompat, objArr);
        }
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat++;
    }

    @Override // java.util.Map
    public final int hashCode() {
        CaptionedImageContentCardViewViewHolder captionedImageContentCardViewViewHolder = new CaptionedImageContentCardViewViewHolder(this, 1);
        int i = 0;
        while (captionedImageContentCardViewViewHolder.hasNext()) {
            int i2 = captionedImageContentCardViewViewHolder.read;
            safeSetClipToOutline safesetcliptooutline = captionedImageContentCardViewViewHolder.RemoteActionCompatParcelizer;
            if (i2 < safesetcliptooutline.MediaMetadataCompat) {
                captionedImageContentCardViewViewHolder.read = i2 + 1;
                captionedImageContentCardViewViewHolder.serializer = i2;
                Object obj = safesetcliptooutline.MediaBrowserCompatMediaItem[i2];
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
                objArr.getClass();
                Object obj2 = objArr[captionedImageContentCardViewViewHolder.serializer];
                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                captionedImageContentCardViewViewHolder.serializer();
                i += iHashCode ^ iHashCode2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return 0;
            }
        }
        return i;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        read();
        int iSerializer = serializer(obj);
        Object[] objArr = this.ParcelableVolumeInfo;
        if (objArr == null) {
            int length = this.MediaBrowserCompatMediaItem.length;
            if (length < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.ParcelableVolumeInfo = objArr;
        }
        if (iSerializer >= 0) {
            objArr[iSerializer] = obj2;
            return null;
        }
        int i = (-iSerializer) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        read();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        read(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iSerializer = serializer(entry.getKey());
            Object[] objArr = this.ParcelableVolumeInfo;
            if (objArr == null) {
                int length = this.MediaBrowserCompatMediaItem.length;
                if (length < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.ParcelableVolumeInfo = objArr;
                }
            }
            if (iSerializer >= 0) {
                objArr[iSerializer] = entry.getValue();
            } else {
                int i = (-iSerializer) - 1;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getValue(), objArr[i]}, getCieXyz.write())).booleanValue()) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        read();
        int i = read(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.ParcelableVolumeInfo;
        objArr.getClass();
        Object obj2 = objArr[i];
        IconCompatParcelizer(i);
        return obj2;
    }

    public final int serializer(Object obj) {
        read();
        while (true) {
            int iWrite = write(obj);
            int i = this.MediaSessionCompatQueueItem * 2;
            int length = this.write.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.write;
                int i3 = iArr[iWrite];
                if (i3 == 0) {
                    int i4 = this.MediaMetadataCompat;
                    Object[] objArr = this.MediaBrowserCompatMediaItem;
                    if (i4 >= objArr.length) {
                        read(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.MediaMetadataCompat = i5;
                    objArr[i4] = obj;
                    this.MediaSessionCompatResultReceiverWrapper[i4] = iWrite;
                    iArr[iWrite] = i5;
                    this.PlaybackStateCompatCustomAction++;
                    this.MediaDescriptionCompat++;
                    if (i2 > this.MediaSessionCompatQueueItem) {
                        this.MediaSessionCompatQueueItem = i2;
                    }
                    return i4;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem[i3 - 1], obj}, getCieXyz.write())).booleanValue()) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    RemoteActionCompatParcelizer(this.write.length * 2);
                    break;
                }
                if (iWrite == 0) {
                    iWrite = this.write.length;
                }
                iWrite--;
            }
        }
    }

    public final safeSetClipToOutline IconCompatParcelizer() {
        read();
        this.serializer = true;
        if (this.PlaybackStateCompatCustomAction > 0) {
            return this;
        }
        safeSetClipToOutline safesetcliptooutline = RemoteActionCompatParcelizer;
        safesetcliptooutline.getClass();
        return safesetcliptooutline;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int[] iArr;
        this.MediaDescriptionCompat++;
        int i2 = 0;
        if (this.MediaMetadataCompat > this.PlaybackStateCompatCustomAction) {
            serializer(false);
        }
        this.write = new int[i];
        this.read = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.MediaMetadataCompat) {
            int i3 = i2 + 1;
            int iWrite = write(this.MediaBrowserCompatMediaItem[i2]);
            int i4 = this.MediaSessionCompatQueueItem;
            while (true) {
                iArr = this.write;
                if (iArr[iWrite] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                } else {
                    if (iWrite == 0) {
                        iWrite = iArr.length;
                    }
                    iWrite--;
                }
            }
            iArr[iWrite] = i3;
            this.MediaSessionCompatResultReceiverWrapper[i2] = iWrite;
            i2 = i3;
        }
    }

    public final int read(Object obj) {
        int iWrite = write(obj);
        int i = this.MediaSessionCompatQueueItem;
        while (true) {
            int i2 = this.write[iWrite];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem[i3], obj}, getCieXyz.write())).booleanValue()) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iWrite = iWrite == 0 ? this.write.length - 1 : iWrite - 1;
        }
    }

    public final void serializer(boolean z) {
        int i;
        Object[] objArr = this.ParcelableVolumeInfo;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.MediaMetadataCompat;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.MediaSessionCompatResultReceiverWrapper;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.write[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        MathKt.write(i3, i, this.MediaBrowserCompatMediaItem);
        if (objArr != null) {
            MathKt.write(i3, this.MediaMetadataCompat, objArr);
        }
        this.MediaMetadataCompat = i3;
    }

    public final void read() {
        if (this.serializer) {
            getAlignmentLinesMap.write();
        }
    }

    public final int IconCompatParcelizer(Object obj) {
        int i = this.MediaMetadataCompat;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.MediaSessionCompatResultReceiverWrapper[i] >= 0) {
                Object[] objArr = this.ParcelableVolumeInfo;
                objArr.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr[i], obj}, getCieXyz.write())).booleanValue()) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        setActionHintText setactionhinttext = this.IconCompatParcelizer;
        if (setactionhinttext != null) {
            return setactionhinttext;
        }
        setActionHintText setactionhinttext2 = new setActionHintText(this);
        this.IconCompatParcelizer = setactionhinttext2;
        return setactionhinttext2;
    }

    @Override // java.util.Map
    public final Collection values() {
        ContentCardViewHolder contentCardViewHolder = this.MediaSessionCompatToken;
        if (contentCardViewHolder != null) {
            return contentCardViewHolder;
        }
        ContentCardViewHolder contentCardViewHolder2 = new ContentCardViewHolder(this);
        this.MediaSessionCompatToken = contentCardViewHolder2;
        return contentCardViewHolder2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        getImageView getimageview = this.RatingCompat;
        if (getimageview != null) {
            return getimageview;
        }
        getImageView getimageview2 = new getImageView(0, this);
        this.RatingCompat = getimageview2;
        return getimageview2;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i = read(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.ParcelableVolumeInfo;
        objArr.getClass();
        return objArr[i];
    }

    public safeSetClipToOutline() {
        this(8);
    }
}
