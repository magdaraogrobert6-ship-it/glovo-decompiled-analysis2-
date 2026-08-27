package o;

import com.sentiance.sdk.publicapi.location.Coordinates;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setClickBehaviordefault {
    public static final boolean RemoteActionCompatParcelizer(getAnimateOutannotations getanimateoutannotations, handleLogClickdefault handlelogclickdefault) {
        getanimateoutannotations.getClass();
        handlelogclickdefault.getClass();
        if (!IconCompatParcelizer(getanimateoutannotations, handlelogclickdefault) || !handlelogclickdefault.RatingCompat() || !handlelogclickdefault.MediaMetadataCompat()) {
            return false;
        }
        Float fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer();
        fIconCompatParcelizer.getClass();
        if (fIconCompatParcelizer.floatValue() >= read(getanimateoutannotations, handlelogclickdefault) * 2.0d || !handlelogclickdefault.RatingCompat() || !handlelogclickdefault.MediaMetadataCompat() || handlelogclickdefault.MediaSessionCompatToken()) {
            return false;
        }
        Float fIconCompatParcelizer2 = handlelogclickdefault.IconCompatParcelizer();
        fIconCompatParcelizer2.getClass();
        return ((double) fIconCompatParcelizer2.floatValue()) >= read(getanimateoutannotations, handlelogclickdefault);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004b  */
    public static final double read(getAnimateOutannotations getanimateoutannotations, handleLogClickdefault handlelogclickdefault) {
        double dIconCompatParcelizer;
        getanimateoutannotations.getClass();
        handlelogclickdefault.getClass();
        Float fMediaBrowserCompatMediaItem = handlelogclickdefault.MediaBrowserCompatMediaItem();
        fMediaBrowserCompatMediaItem.getClass();
        double dFloatValue = fMediaBrowserCompatMediaItem.floatValue();
        Coordinates coordinates = new Coordinates(handlelogclickdefault.RemoteActionCompatParcelizer(), handlelogclickdefault.serializer());
        Short shMediaSessionCompatResultReceiverWrapper = getanimateoutannotations.serializer().MediaSessionCompatResultReceiverWrapper();
        if (shMediaSessionCompatResultReceiverWrapper != null) {
            if (getDurationInMilliseconds.IconCompatParcelizer().contains(shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(coordinates.getLatitude(), coordinates.getLongitude(), 12)))) {
                dIconCompatParcelizer = shMediaSessionCompatResultReceiverWrapper.shortValue();
            } else {
                dIconCompatParcelizer = getanimateoutannotations.IconCompatParcelizer();
            }
        } else {
            dIconCompatParcelizer = getanimateoutannotations.IconCompatParcelizer();
        }
        return dFloatValue + (dIconCompatParcelizer / 3.6d);
    }

    public static final getClickAction read(getAnimateOutannotations getanimateoutannotations, String str, ArrayList arrayList) {
        str.getClass();
        List<handleLogClickdefault> list = read(getanimateoutannotations, arrayList);
        if (list.isEmpty()) {
            getanimateoutannotations.MediaMetadataCompat().IconCompatParcelizer(String.format("Skipping the legal score calculation for the transport %s: no suitable waypoints found.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            return null;
        }
        ArrayList<handleLogClickdefault> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (RemoteActionCompatParcelizer(getanimateoutannotations, (handleLogClickdefault) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        for (handleLogClickdefault handlelogclickdefault : arrayList2) {
            Float fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer();
            fIconCompatParcelizer.getClass();
            arrayList3.add(Double.valueOf(((double) fIconCompatParcelizer.floatValue()) / read(getanimateoutannotations, handlelogclickdefault)));
        }
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), 2.0d)));
        }
        return new getClickAction(onContentCardDismissed.MediaSessionCompatToken(arrayList4), list.size());
    }

    public static final List<handleLogClickdefault> read(getAnimateOutannotations getanimateoutannotations, List<? extends handleLogClickdefault> list) {
        getanimateoutannotations.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (IconCompatParcelizer(getanimateoutannotations, (handleLogClickdefault) obj)) {
                arrayList.add(obj);
            }
        }
        if (((double) arrayList.size()) / ((double) list.size()) > getanimateoutannotations.write()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Float fIconCompatParcelizer = ((handleLogClickdefault) obj2).IconCompatParcelizer();
                fIconCompatParcelizer.getClass();
                if (fIconCompatParcelizer.floatValue() >= getanimateoutannotations.RemoteActionCompatParcelizer()) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return instance_delegatelambda0.write;
    }

    private static final boolean IconCompatParcelizer(getAnimateOutannotations getanimateoutannotations, handleLogClickdefault handlelogclickdefault) {
        if (handlelogclickdefault.MediaSessionCompatQueueItem()) {
            Float fWrite = handlelogclickdefault.write();
            fWrite.getClass();
            if (fWrite.floatValue() < getanimateoutannotations.read() && handlelogclickdefault.RatingCompat() && handlelogclickdefault.MediaMetadataCompat()) {
                Float fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer();
                fIconCompatParcelizer.getClass();
                float fFloatValue = fIconCompatParcelizer.floatValue();
                Float fMediaBrowserCompatMediaItem = handlelogclickdefault.MediaBrowserCompatMediaItem();
                fMediaBrowserCompatMediaItem.getClass();
                float fFloatValue2 = fMediaBrowserCompatMediaItem.floatValue();
                boolean z = fFloatValue >= 0.0f;
                boolean z2 = fFloatValue2 > 0.0f;
                if (z && z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
