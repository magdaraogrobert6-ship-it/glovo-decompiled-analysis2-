package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseRxViewModelKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class paintdefault {
    public final calculateScaledSizeE7KxVPU MediaBrowserCompatMediaItem;
    public setBlockui MediaMetadataCompat;
    public paintdefault MediaSessionCompatQueueItem;
    public final setAlignment RatingCompat;
    public boolean read;
    public int serializer;
    public HashSet write = null;
    public int IconCompatParcelizer = 0;
    public int RemoteActionCompatParcelizer = Integer.MIN_VALUE;

    public final boolean IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem != null;
    }

    public final paintdefault read() {
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu = this.MediaBrowserCompatMediaItem;
        int iOrdinal = calculatescaledsizee7kxvpu.ordinal();
        setAlignment setalignment = this.RatingCompat;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return setalignment.invalidateMenu;
            case 2:
                return setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            case 3:
                return setalignment.onBackPressedDispatcher_delegatelambda010;
            case 4:
                return setalignment.onActivityResult;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) calculatescaledsizee7kxvpu.name());
                return null;
        }
    }

    public final int serializer() {
        paintdefault paintdefaultVar;
        if (this.RatingCompat.onMultiWindowModeChanged == 8) {
            return 0;
        }
        int i = this.RemoteActionCompatParcelizer;
        return (i == Integer.MIN_VALUE || (paintdefaultVar = this.MediaSessionCompatQueueItem) == null || paintdefaultVar.RatingCompat.onMultiWindowModeChanged != 8) ? this.IconCompatParcelizer : i;
    }

    public final String toString() {
        return this.RatingCompat.accessensureViewModelStore + ":" + this.MediaBrowserCompatMediaItem.toString();
    }

    public final boolean IconCompatParcelizer(paintdefault paintdefaultVar, int i, int i2, boolean z) {
        if (paintdefaultVar == null) {
            RatingCompat();
            return true;
        }
        if (!z && !serializer(paintdefaultVar)) {
            return false;
        }
        this.MediaSessionCompatQueueItem = paintdefaultVar;
        if (paintdefaultVar.write == null) {
            paintdefaultVar.write = new HashSet();
        }
        HashSet hashSet = this.MediaSessionCompatQueueItem.write;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        return true;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.serializer = i;
        this.read = true;
    }

    public paintdefault(setAlignment setalignment, calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu) {
        this.RatingCompat = setalignment;
        this.MediaBrowserCompatMediaItem = calculatescaledsizee7kxvpu;
    }

    public final void RemoteActionCompatParcelizer(int i, getClip getclip, ArrayList arrayList) {
        HashSet hashSet = this.write;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                BaseRxViewModelKt.read(((paintdefault) it.next()).RatingCompat, i, arrayList, getclip);
            }
        }
    }

    public final void RatingCompat() {
        HashSet hashSet;
        paintdefault paintdefaultVar = this.MediaSessionCompatQueueItem;
        if (paintdefaultVar != null && (hashSet = paintdefaultVar.write) != null) {
            hashSet.remove(this);
            if (this.MediaSessionCompatQueueItem.write.size() == 0) {
                this.MediaSessionCompatQueueItem.write = null;
            }
        }
        this.write = null;
        this.MediaSessionCompatQueueItem = null;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
        this.read = false;
        this.serializer = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x0070 A[RETURN] */
    public final boolean serializer(paintdefault paintdefaultVar) {
        if (paintdefaultVar != null) {
            setAlignment setalignment = paintdefaultVar.RatingCompat;
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu = paintdefaultVar.MediaBrowserCompatMediaItem;
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2 = this.MediaBrowserCompatMediaItem;
            if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu2) {
                if (calculatescaledsizee7kxvpu2 != calculateScaledSizeE7KxVPU.BASELINE || (setalignment.addObserverForBackInvokerlambda0 && this.RatingCompat.addObserverForBackInvokerlambda0)) {
                    return true;
                }
            } else {
                switch (calculatescaledsizee7kxvpu2) {
                    case NONE:
                    case CENTER_X:
                    case CENTER_Y:
                        break;
                    case LEFT:
                    case RIGHT:
                        boolean z = calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.LEFT || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.RIGHT;
                        if (!(setalignment instanceof setSizeToIntrinsics)) {
                            return z;
                        }
                        if (z || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.CENTER_X) {
                            return true;
                        }
                        break;
                    case TOP:
                    case BOTTOM:
                        boolean z2 = calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.TOP || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.BOTTOM;
                        if (!(setalignment instanceof setSizeToIntrinsics)) {
                            return z2;
                        }
                        if (z2 || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.CENTER_Y) {
                            return true;
                        }
                        break;
                    case BASELINE:
                        if (calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.LEFT && calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.RIGHT) {
                            return true;
                        }
                        break;
                    case CENTER:
                        if (calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.BASELINE && calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.CENTER_X && calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.CENTER_Y) {
                            return true;
                        }
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) calculatescaledsizee7kxvpu2.name());
                        return false;
                }
            }
        }
        return false;
    }

    public final void MediaBrowserCompatMediaItem() {
        setBlockui setblockui = this.MediaMetadataCompat;
        if (setblockui == null) {
            this.MediaMetadataCompat = new setBlockui(DrawWithCacheElement.UNRESTRICTED);
        } else {
            setblockui.RemoteActionCompatParcelizer();
        }
    }

    public final int RemoteActionCompatParcelizer() {
        if (this.read) {
            return this.serializer;
        }
        return 0;
    }

    public final boolean write() {
        HashSet hashSet = this.write;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((paintdefault) it.next()).read().IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    public final void write(paintdefault paintdefaultVar, int i) {
        IconCompatParcelizer(paintdefaultVar, i, Integer.MIN_VALUE, false);
    }
}
