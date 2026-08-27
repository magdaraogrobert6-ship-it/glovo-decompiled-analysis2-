package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getLogoDescription {
    public static final getLogoDescription serializer;
    public static final getLogoDescription write;
    public final LinkedHashSet RemoteActionCompatParcelizer;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new toFlashState(0));
        write = new getLogoDescription(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new toFlashState(1));
        serializer = new getLogoDescription(linkedHashSet2);
    }

    public final ImageCapture1 IconCompatParcelizer(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ImageCapture1) it.next()).ResultReceiver());
        }
        List listWrite = write(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ImageCapture1 imageCapture1 = (ImageCapture1) it2.next();
            if (listWrite.contains(imageCapture1.ResultReceiver())) {
                linkedHashSet2.add(imageCapture1);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (ImageCapture1) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            FocusMeteringAction focusMeteringActionMediaMetadataCompat = ((ImageCapture1) it4.next()).MediaMetadataCompat();
            sb.append(" Id:" + focusMeteringActionMediaMetadataCompat.read() + "  Lens:" + focusMeteringActionMediaMetadataCompat.MediaBrowserCompatMediaItem());
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        LinkedHashSet<getCurrentContentInsetLeft> linkedHashSet3 = this.RemoteActionCompatParcelizer;
        sb2.append("PhyId:null  Filters:" + linkedHashSet3.size());
        for (getCurrentContentInsetLeft getcurrentcontentinsetleft : linkedHashSet3) {
            sb2.append(" Id:");
            getcurrentcontentinsetleft.getClass();
            sb2.append(getCurrentContentInsetLeft.write);
            if (getcurrentcontentinsetleft instanceof toFlashState) {
                sb2.append(" LensFilter:");
                sb2.append(((toFlashState) getcurrentcontentinsetleft).IconCompatParcelizer);
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }

    public final Integer read() {
        Integer num = null;
        for (getCurrentContentInsetLeft getcurrentcontentinsetleft : this.RemoteActionCompatParcelizer) {
            if (getcurrentcontentinsetleft instanceof toFlashState) {
                Integer numValueOf = Integer.valueOf(((toFlashState) getcurrentcontentinsetleft).IconCompatParcelizer);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final List write(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList2 = ((getCurrentContentInsetLeft) it.next()).read(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public getLogoDescription(LinkedHashSet linkedHashSet) {
        this.RemoteActionCompatParcelizer = linkedHashSet;
    }
}
