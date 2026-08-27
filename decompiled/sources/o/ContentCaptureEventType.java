package o;

import java.util.ArrayList;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes.dex */
public final class ContentCaptureEventType {
    public final getPostalCode IconCompatParcelizer;
    public int MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int ParcelableVolumeInfo;
    public ContentCaptureManager RemoteActionCompatParcelizer;
    public int serializer;
    public final getDateMillisOrDefault MediaSessionCompatResultReceiverWrapper = new getDateMillisOrDefault(0);
    public boolean read = true;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();
    public int RatingCompat = -1;
    public int write = -1;
    public int MediaDescriptionCompat = -1;

    public final void IconCompatParcelizer(boolean z) {
        component4 component4Var = this.IconCompatParcelizer.createFullyDrawnExecutor;
        int i = z ? component4Var.PlaybackStateCompat : component4Var.RemoteActionCompatParcelizer;
        int i2 = i - this.ParcelableVolumeInfo;
        if (i2 < 0) {
            getCreditCardExpirationDay.read("Tried to seek backward");
        }
        if (i2 > 0) {
            DragAndDropModifierNode dragAndDropModifierNode = this.RemoteActionCompatParcelizer.read;
            dragAndDropModifierNode.write(ContentCaptureManagerCompanion.write);
            dragAndDropModifierNode.read[dragAndDropModifierNode.serializer - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat - 1].serializer] = i2;
            this.ParcelableVolumeInfo = i;
        }
    }

    public ContentCaptureEventType(getPostalCode getpostalcode, ContentCaptureManager contentCaptureManager) {
        this.IconCompatParcelizer = getpostalcode;
        this.RemoteActionCompatParcelizer = contentCaptureManager;
    }

    public final void serializer() {
        write();
        ArrayList arrayList = this.MediaBrowserCompatMediaItem;
        if (arrayList.isEmpty()) {
            this.MediaMetadataCompat++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void write() {
        int i = this.serializer;
        if (i > 0) {
            int i2 = this.RatingCompat;
            if (i2 >= 0) {
                IconCompatParcelizer();
                DragAndDropModifierNode dragAndDropModifierNode = this.RemoteActionCompatParcelizer.read;
                dragAndDropModifierNode.write(AndroidDragAndDropManagermodifier1.write);
                int i3 = dragAndDropModifierNode.serializer - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat - 1].serializer;
                int[] iArr = dragAndDropModifierNode.read;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.RatingCompat = -1;
            } else {
                int i4 = this.MediaDescriptionCompat;
                int i5 = this.write;
                IconCompatParcelizer();
                DragAndDropModifierNode dragAndDropModifierNode2 = this.RemoteActionCompatParcelizer.read;
                dragAndDropModifierNode2.write(requestDragAndDropTransferUv8p0NA.IconCompatParcelizer);
                int i6 = dragAndDropModifierNode2.serializer - dragAndDropModifierNode2.RemoteActionCompatParcelizer[dragAndDropModifierNode2.RatingCompat - 1].serializer;
                int[] iArr2 = dragAndDropModifierNode2.read;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.write = -1;
                this.MediaDescriptionCompat = -1;
            }
            this.serializer = 0;
        }
    }

    public final void IconCompatParcelizer() {
        int i = this.MediaMetadataCompat;
        if (i > 0) {
            DragAndDropModifierNode dragAndDropModifierNode = this.RemoteActionCompatParcelizer.read;
            dragAndDropModifierNode.write(getDragEventui.IconCompatParcelizer);
            dragAndDropModifierNode.read[dragAndDropModifierNode.serializer - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat - 1].serializer] = i;
            this.MediaMetadataCompat = 0;
        }
        ArrayList arrayList = this.MediaBrowserCompatMediaItem;
        if (arrayList.isEmpty()) {
            return;
        }
        ContentCaptureManager contentCaptureManager = this.RemoteActionCompatParcelizer;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        contentCaptureManager.getClass();
        if (size != 0) {
            DragAndDropModifierNode dragAndDropModifierNode2 = contentCaptureManager.read;
            dragAndDropModifierNode2.write(notifyViewTextChanged.write);
            RegexKt.write(dragAndDropModifierNode2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void IconCompatParcelizer(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                getCreditCardExpirationDay.read("Invalid remove index " + i);
            }
            if (this.RatingCompat == i) {
                this.serializer += i2;
                return;
            }
            write();
            this.RatingCompat = i;
            this.serializer = i2;
        }
    }
}
