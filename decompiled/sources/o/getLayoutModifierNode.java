package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLayoutModifierNode {
    public static final zzj read = new zzj(25);

    public static void IconCompatParcelizer(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        removeNodesInRange removenodesinrange;
        accessgetTvTeletextcp accessgettvteletextcp = invalidateUnfoldedVirtualChildren.read();
        accessgettvteletextcp.read((getZSortedChildrenannotations) emojiProcessor.IconCompatParcelizer);
        Iterator it = ((ConcurrentMap) emojiProcessor.serializer).values().iterator();
        while (it.hasNext()) {
            for (listIterator listiterator : (List) it.next()) {
                int i = LayoutModifierNodeCoordinator.write[listiterator.MediaSessionCompatQueueItem.ordinal()];
                if (i == 1) {
                    removenodesinrange = removeNodesInRange.write;
                } else if (i == 2) {
                    removenodesinrange = removeNodesInRange.RemoteActionCompatParcelizer;
                } else {
                    if (i != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown key status");
                        return;
                    }
                    removenodesinrange = removeNodesInRange.read;
                }
                int i2 = listiterator.RemoteActionCompatParcelizer;
                String strSubstring = listiterator.IconCompatParcelizer;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                accessgettvteletextcp.write(removenodesinrange, i2, strSubstring, listiterator.RatingCompat.name());
            }
        }
        listIterator listiterator2 = (listIterator) emojiProcessor.read;
        if (listiterator2 != null) {
            accessgettvteletextcp.serializer(listiterator2.RemoteActionCompatParcelizer);
        }
        try {
            accessgettvteletextcp.MediaBrowserCompatMediaItem();
        } catch (GeneralSecurityException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
        }
    }
}
