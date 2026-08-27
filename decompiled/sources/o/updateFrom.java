package o;

import com.google.android.gms.dynamite.zzj;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class updateFrom implements accessgetValuesp {
    public final zzj read;
    public final androidx.emoji2.text.EmojiProcessor serializer;
    public final zzj write;

    @Override // o.accessgetValuesp
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.serializer;
        zzj zzjVar = this.write;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = emojiProcessor.IconCompatParcelizer(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrSerializer = ((accessgetValuesp) ((listIterator) it.next()).MediaBrowserCompatMediaItem).serializer(bArrCopyOfRange, bArr2);
                    zzjVar.getClass();
                    return bArrSerializer;
                } catch (GeneralSecurityException e) {
                    minLookaheadIntrinsicWidth.serializer.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = emojiProcessor.IconCompatParcelizer(accessgetHitDepthp.serializer).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrSerializer2 = ((accessgetValuesp) ((listIterator) it2.next()).MediaBrowserCompatMediaItem).serializer(bArr, bArr2);
                zzjVar.getClass();
                return bArrSerializer2;
            } catch (GeneralSecurityException unused) {
            }
        }
        zzjVar.getClass();
        getAlignmentLinesMap.write("decryption failed");
        return null;
    }

    @Override // o.accessgetValuesp
    public final byte[] read(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzj zzjVar = this.read;
        listIterator listiterator = (listIterator) this.serializer.read;
        try {
            byte[] bArr3 = listiterator.serializer;
            byte[] bArrRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((accessgetValuesp) listiterator.MediaBrowserCompatMediaItem).read(bArr, bArr2));
            int i = listiterator.RemoteActionCompatParcelizer;
            zzjVar.getClass();
            return bArrRemoteActionCompatParcelizer;
        } catch (GeneralSecurityException e) {
            zzjVar.getClass();
            throw e;
        }
    }

    public updateFrom(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.serializer = emojiProcessor;
        boolean zIsEmpty = ((getZSortedChildrenannotations) emojiProcessor.IconCompatParcelizer).serializer.isEmpty();
        zzj zzjVar = getLayoutModifierNode.read;
        if (zIsEmpty) {
            this.read = zzjVar;
            this.write = zzjVar;
            return;
        }
        getLookaheadConstraintsDWUhwKwui getlookaheadconstraintsdwuhwkwuiWrite = accessgetModifierBoundsPaintcp.read().write();
        getLayoutModifierNode.IconCompatParcelizer(emojiProcessor);
        getlookaheadconstraintsdwuhwkwuiWrite.getClass();
        this.read = zzjVar;
        this.write = zzjVar;
    }
}
