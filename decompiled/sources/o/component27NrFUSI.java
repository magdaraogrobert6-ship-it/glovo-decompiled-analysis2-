package o;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class component27NrFUSI {
    public final ArrayDeque RemoteActionCompatParcelizer;

    public void serializer(r8lambdaY6_OCuxWIPAEsjS5255j_VVi2Ek r8lambday6_ocuxwipaesjs5255j_vvi2ek) {
        synchronized (this) {
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.IconCompatParcelizer = null;
            r8lambday6_ocuxwipaesjs5255j_vvi2ek.read = null;
            this.RemoteActionCompatParcelizer.offer(r8lambday6_ocuxwipaesjs5255j_vvi2ek);
        }
    }

    public component27NrFUSI(int i) {
        if (i == 1) {
            this.RemoteActionCompatParcelizer = new ArrayDeque();
        } else if (i != 2) {
            this.RemoteActionCompatParcelizer = new ArrayDeque();
        } else {
            this.RemoteActionCompatParcelizer = new ArrayDeque(0);
        }
    }

    public void RemoteActionCompatParcelizer(getClipMetadata getclipmetadata) {
        if (!getclipmetadata.IconCompatParcelizer()) {
            if (!(getclipmetadata instanceof DisposableSaveableStateRegistry)) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(getclipmetadata.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) getclipmetadata;
            RemoteActionCompatParcelizer(disposableSaveableStateRegistry.write);
            RemoteActionCompatParcelizer(disposableSaveableStateRegistry.RatingCompat);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(DisposableSaveableStateRegistry.read, getclipmetadata.RatingCompat());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iIconCompatParcelizer = DisposableSaveableStateRegistry.IconCompatParcelizer(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.RemoteActionCompatParcelizer;
        if (arrayDeque.isEmpty() || ((getClipMetadata) arrayDeque.peek()).RatingCompat() >= iIconCompatParcelizer) {
            arrayDeque.push(getclipmetadata);
            return;
        }
        int iIconCompatParcelizer2 = DisposableSaveableStateRegistry.IconCompatParcelizer(iBinarySearch);
        getClipMetadata disposableSaveableStateRegistry2 = (getClipMetadata) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((getClipMetadata) arrayDeque.peek()).RatingCompat() < iIconCompatParcelizer2) {
            disposableSaveableStateRegistry2 = new DisposableSaveableStateRegistry((getClipMetadata) arrayDeque.pop(), disposableSaveableStateRegistry2);
        }
        DisposableSaveableStateRegistry disposableSaveableStateRegistry3 = new DisposableSaveableStateRegistry(disposableSaveableStateRegistry2, getclipmetadata);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(DisposableSaveableStateRegistry.read, disposableSaveableStateRegistry3.MediaDescriptionCompat);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((getClipMetadata) arrayDeque.peek()).RatingCompat() >= DisposableSaveableStateRegistry.IconCompatParcelizer(iBinarySearch2 + 1)) {
                break;
            } else {
                disposableSaveableStateRegistry3 = new DisposableSaveableStateRegistry((getClipMetadata) arrayDeque.pop(), disposableSaveableStateRegistry3);
            }
        }
        arrayDeque.push(disposableSaveableStateRegistry3);
    }
}
