package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import o.AndroidPrefetchScheduler;
import o.BasicTextFieldKt;
import o.DragAndDropTargetModifierNode;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuScope {
    public final SnapshotStateList serializer = new SnapshotStateList();

    public final void Content$foundation(BasicTextFieldKt basicTextFieldKt, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-798501095);
        int i2 = (i & 6) == 0 ? (getpostalcode.read(basicTextFieldKt) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(this) ? 32 : 16;
        }
        int i3 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.serializer;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) snapshotStateList.get(i4)).invoke(basicTextFieldKt, getpostalcode, Integer.valueOf(i2 & 14));
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, i3, this, basicTextFieldKt);
        }
    }

    public static void write(ContextMenuScope contextMenuScope, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        Modifier.Companion companion = Modifier.Companion;
        if ((i & 8) != 0) {
            dragAndDropTargetModifierNode = null;
        }
        contextMenuScope.serializer.add(new DragAndDropTargetModifierNode(new ContextMenuScope$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, contextMenuScope, companion, dragAndDropTargetModifierNode, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), true, -1789283891));
    }
}
