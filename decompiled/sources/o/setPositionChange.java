package o;

import com.google.android.gms.internal.measurement.zzz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setPositionChange extends getNumPadInsertEK5gGoQ {
    public final boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ KeyEvent_androidKt read;
    public final boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPositionChange(KeyEvent_androidKt keyEvent_androidKt, boolean z, boolean z2) {
        super("log");
        this.read = keyEvent_androidKt;
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0 A[LOOP:0: B:24:0x0096->B:26:0x00a0, LOOP_END] */
    @Override // o.getNumPadInsertEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        int i;
        int i2;
        String strIconCompatParcelizer;
        ArrayList arrayList;
        getTvInputComposite2EK5gGoQ.read(list, 1, "log");
        int size = list.size();
        getOEK5gGoQ getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        KeyEvent_androidKt keyEvent_androidKt = this.read;
        if (size == 1) {
            ((PinnableContainerKtLocalPinnableContainer1) keyEvent_androidKt.write).IconCompatParcelizer(3, ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0)).IconCompatParcelizer(), Collections.EMPTY_LIST, this.write, this.RemoteActionCompatParcelizer);
            return getoek5ggoq;
        }
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) list.get(0);
        zzz zzzVar = (zzz) transitionValuesMaps.MediaDescriptionCompat;
        zzz zzzVar2 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
        int iWrite = getTvInputComposite2EK5gGoQ.write(zzzVar.write(transitionValuesMaps, getnumpadmovehomeek5ggoq).write().doubleValue());
        if (iWrite != 2) {
            i = 3;
            if (iWrite == 3) {
                i2 = 1;
            } else if (iWrite == 5) {
                i2 = 5;
            } else if (iWrite == 6) {
                i2 = 2;
            }
            strIconCompatParcelizer = zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(1)).IconCompatParcelizer();
            if (list.size() == 2) {
                ((PinnableContainerKtLocalPinnableContainer1) keyEvent_androidKt.write).IconCompatParcelizer(i2, strIconCompatParcelizer, Collections.EMPTY_LIST, this.write, this.RemoteActionCompatParcelizer);
                return getoek5ggoq;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(i3)).IconCompatParcelizer());
            }
            ((PinnableContainerKtLocalPinnableContainer1) keyEvent_androidKt.write).IconCompatParcelizer(i2, strIconCompatParcelizer, arrayList, this.write, this.RemoteActionCompatParcelizer);
            return getoek5ggoq;
        }
        i = 4;
        i2 = i;
        strIconCompatParcelizer = zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(1)).IconCompatParcelizer();
        if (list.size() == 2) {
            ((PinnableContainerKtLocalPinnableContainer1) keyEvent_androidKt.write).IconCompatParcelizer(i2, strIconCompatParcelizer, Collections.EMPTY_LIST, this.write, this.RemoteActionCompatParcelizer);
            return getoek5ggoq;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(i3)).IconCompatParcelizer());
        }
        ((PinnableContainerKtLocalPinnableContainer1) keyEvent_androidKt.write).IconCompatParcelizer(i2, strIconCompatParcelizer, arrayList, this.write, this.RemoteActionCompatParcelizer);
        return getoek5ggoq;
    }
}
