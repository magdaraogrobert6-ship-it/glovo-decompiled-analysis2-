package o;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManager implements ImageOnlyContentCardViewViewHolder, getPassword {
    public static final /* synthetic */ AndroidContentCaptureManager IconCompatParcelizer = new AndroidContentCaptureManager(1);
    public static final AndroidContentCaptureManager RemoteActionCompatParcelizer = new AndroidContentCaptureManager(0);
    public static final AndroidContentCaptureManager read = new AndroidContentCaptureManager(2);
    public static final AndroidContentCaptureManager serializer = new AndroidContentCaptureManager(3);
    public static final AndroidContentCaptureManager write = new AndroidContentCaptureManager(4);
    public final /* synthetic */ int MediaMetadataCompat;

    public /* synthetic */ AndroidContentCaptureManager(int i) {
        this.MediaMetadataCompat = i;
    }

    public static final void RemoteActionCompatParcelizer(AndroidContentCaptureManager androidContentCaptureManager) {
        MutableStateFlow mutableStateFlow;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet2;
        MutableStateFlow mutableStateFlow2 = sendContentCaptureAppearEvents.serializer;
        do {
            mutableStateFlow = sendContentCaptureAppearEvents.serializer;
            persistentOrderedSet = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet) mutableStateFlow.read();
            getSizeYbymL2gui getsizeybyml2guiRemoteActionCompatParcelizer = persistentOrderedSet.serializer;
            invokeUv8p0NA invokeuv8p0na = (invokeUv8p0NA) getsizeybyml2guiRemoteActionCompatParcelizer.get(androidContentCaptureManager);
            if (invokeuv8p0na == null) {
                persistentOrderedSet2 = persistentOrderedSet;
            } else {
                Object obj = invokeuv8p0na.IconCompatParcelizer;
                Object obj2 = invokeuv8p0na.RemoteActionCompatParcelizer;
                requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = getsizeybyml2guiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mWrite = requestdraganddroptransferk4lq0m.write(androidContentCaptureManager != null ? androidContentCaptureManager.hashCode() : 0, 0, androidContentCaptureManager);
                if (requestdraganddroptransferk4lq0m != requestdraganddroptransferk4lq0mWrite) {
                    getsizeybyml2guiRemoteActionCompatParcelizer = requestdraganddroptransferk4lq0mWrite == null ? getSizeYbymL2gui.read : new getSizeYbymL2gui(requestdraganddroptransferk4lq0mWrite, getsizeybyml2guiRemoteActionCompatParcelizer.size() - 1);
                }
                DragAndDropNodeonEnded1 dragAndDropNodeonEnded1 = DragAndDropNodeonEnded1.write;
                if (obj != dragAndDropNodeonEnded1) {
                    Object obj3 = getsizeybyml2guiRemoteActionCompatParcelizer.get(obj);
                    obj3.getClass();
                    getsizeybyml2guiRemoteActionCompatParcelizer = getsizeybyml2guiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj, new invokeUv8p0NA(((invokeUv8p0NA) obj3).IconCompatParcelizer, obj2));
                }
                if (obj2 != dragAndDropNodeonEnded1) {
                    Object obj4 = getsizeybyml2guiRemoteActionCompatParcelizer.get(obj2);
                    obj4.getClass();
                    getsizeybyml2guiRemoteActionCompatParcelizer = getsizeybyml2guiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj2, new invokeUv8p0NA(obj, ((invokeUv8p0NA) obj4).RemoteActionCompatParcelizer));
                }
                Object obj5 = obj != dragAndDropNodeonEnded1 ? persistentOrderedSet.read : obj2;
                if (obj2 != dragAndDropNodeonEnded1) {
                    obj = persistentOrderedSet.RemoteActionCompatParcelizer;
                }
                persistentOrderedSet2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(obj5, obj, getsizeybyml2guiRemoteActionCompatParcelizer);
            }
            if (persistentOrderedSet == persistentOrderedSet2) {
                return;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(persistentOrderedSet, persistentOrderedSet2));
    }

    public boolean serializer(Object obj, Object obj2) {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            return false;
        }
        if (i == 2) {
            return obj == obj2;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj2}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            return "NeverEqualPolicy";
        }
        if (i == 2) {
            return "ReferentialEqualityPolicy";
        }
        if (i != 4) {
            return i != 6 ? super.toString() : "Empty";
        }
        return "StructuralEqualityPolicy";
    }
}
