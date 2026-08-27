package o;

import com.google.android.gms.dynamite.zzj;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getMinIndex implements findBestHitDistancefn2tFes {
    public final zzj RemoteActionCompatParcelizer;
    public final zzj serializer;
    public final androidx.emoji2.text.EmojiProcessor write;

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.write;
        zzj zzjVar = this.RemoteActionCompatParcelizer;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = emojiProcessor.IconCompatParcelizer(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrSerializer = ((findBestHitDistancefn2tFes) ((listIterator) it.next()).MediaBrowserCompatMediaItem).serializer(bArrCopyOfRange, bArr2);
                    zzjVar.getClass();
                    return bArrSerializer;
                } catch (GeneralSecurityException e) {
                    nextIndex.write.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = emojiProcessor.IconCompatParcelizer(accessgetHitDepthp.serializer).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrSerializer2 = ((findBestHitDistancefn2tFes) ((listIterator) it2.next()).MediaBrowserCompatMediaItem).serializer(bArr, bArr2);
                zzjVar.getClass();
                return bArrSerializer2;
            } catch (GeneralSecurityException unused) {
            }
        }
        zzjVar.getClass();
        getAlignmentLinesMap.write("decryption failed");
        return null;
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzj zzjVar = this.serializer;
        listIterator listiterator = (listIterator) this.write.read;
        try {
            byte[] bArr3 = listiterator.serializer;
            byte[] bArrRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((findBestHitDistancefn2tFes) listiterator.MediaBrowserCompatMediaItem).IconCompatParcelizer(bArr, bArr2));
            int i = listiterator.RemoteActionCompatParcelizer;
            int length = bArr.length;
            zzjVar.getClass();
            return bArrRemoteActionCompatParcelizer;
        } catch (GeneralSecurityException e) {
            zzjVar.getClass();
            throw e;
        }
    }

    public getMinIndex(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.write = emojiProcessor;
        boolean zIsEmpty = ((getZSortedChildrenannotations) emojiProcessor.IconCompatParcelizer).serializer.isEmpty();
        zzj zzjVar = getLayoutModifierNode.read;
        if (zIsEmpty) {
            this.serializer = zzjVar;
            this.RemoteActionCompatParcelizer = zzjVar;
            return;
        }
        getLookaheadConstraintsDWUhwKwui getlookaheadconstraintsdwuhwkwuiWrite = accessgetModifierBoundsPaintcp.read().write();
        getLayoutModifierNode.IconCompatParcelizer(emojiProcessor);
        getlookaheadconstraintsdwuhwkwuiWrite.getClass();
        this.serializer = zzjVar;
        this.RemoteActionCompatParcelizer = zzjVar;
    }
}
