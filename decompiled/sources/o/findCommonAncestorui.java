package o;

import android.database.Cursor;
import com.sentiance.core.model.events.I$b;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class findCommonAncestorui implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ I$b serializer;

    public /* synthetic */ findCommonAncestorui(I$b i$b, int i) {
        this.read = i;
        this.serializer = i$b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        I$b i$b = this.serializer;
        int i2 = 1;
        if (i == 0) {
            onLayoutModifierNodeChanged onlayoutmodifiernodechanged = (onLayoutModifierNodeChanged) i$b.read;
            onlayoutmodifiernodechanged.getClass();
            HashMap map = new HashMap();
            headH91voCI headh91voci = onlayoutmodifiernodechanged.serializer;
            com.huawei.wisesecurity.ucs_credential.x xVar = headh91voci.read("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
            xVar.IconCompatParcelizer(onlayoutmodifiernodechanged.ParcelableVolumeInfo);
            xVar.RemoteActionCompatParcelizer(new setForcePlaceWithLookaheadOffsetui(i2, map));
            headh91voci.read("SELECT index_id, collection_group, index_proto FROM index_configuration").RemoteActionCompatParcelizer(new createLayer(onlayoutmodifiernodechanged, i2, map));
            onlayoutmodifiernodechanged.MediaSessionCompatQueueItem = true;
            return;
        }
        androidx.recyclerview.widget.ChildHelper childHelper = (androidx.recyclerview.widget.ChildHelper) i$b.serializer;
        childHelper.getClass();
        ArrayList<String> arrayList = new ArrayList();
        headH91voCI headh91voci2 = (headH91voCI) childHelper.serializer;
        Cursor cursorIconCompatParcelizer = headh91voci2.read("SELECT uid FROM mutation_queues").IconCompatParcelizer();
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                arrayList.add(cursorIconCompatParcelizer.getString(0));
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorIconCompatParcelizer.close();
        childHelper.IconCompatParcelizer = 0;
        for (String str : arrayList) {
            com.huawei.wisesecurity.ucs_credential.x xVar2 = headh91voci2.read("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            xVar2.IconCompatParcelizer(str);
            Cursor cursorIconCompatParcelizer2 = xVar2.IconCompatParcelizer();
            while (cursorIconCompatParcelizer2.moveToNext()) {
                try {
                    childHelper.IconCompatParcelizer = Math.max(childHelper.IconCompatParcelizer, cursorIconCompatParcelizer2.getInt(0));
                } catch (Throwable th3) {
                    if (cursorIconCompatParcelizer2 != null) {
                        try {
                            cursorIconCompatParcelizer2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            cursorIconCompatParcelizer2.close();
        }
        childHelper.IconCompatParcelizer++;
        com.huawei.wisesecurity.ucs_credential.x xVar3 = headh91voci2.read("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        xVar3.IconCompatParcelizer((String) childHelper.read);
        Cursor cursorIconCompatParcelizer3 = xVar3.IconCompatParcelizer();
        try {
            if (!cursorIconCompatParcelizer3.moveToFirst()) {
                cursorIconCompatParcelizer3.close();
                childHelper.RemoteActionCompatParcelizer();
            } else {
                byte[] blob = cursorIconCompatParcelizer3.getBlob(0);
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
                childHelper.MediaSessionCompatQueueItem = getClipMetadata.read(blob, 0, blob.length);
                cursorIconCompatParcelizer3.close();
            }
        } catch (Throwable th5) {
            if (cursorIconCompatParcelizer3 != null) {
                try {
                    cursorIconCompatParcelizer3.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }
}
