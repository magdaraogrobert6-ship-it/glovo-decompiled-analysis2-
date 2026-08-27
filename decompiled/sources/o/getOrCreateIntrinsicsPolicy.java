package o;

import com.google.android.gms.dynamite.zzj;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getOrCreateIntrinsicsPolicy implements isHitInMinimumTouchTargetBetter {
    public final zzj RemoteActionCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor serializer;
    public final zzj write;

    @Override // o.isHitInMinimumTouchTargetBetter
    public final void serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        zzj zzjVar = this.RemoteActionCompatParcelizer;
        if (length <= 5) {
            zzjVar.getClass();
            getAlignmentLinesMap.write("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.serializer;
        for (listIterator listiterator : emojiProcessor.IconCompatParcelizer(bArrCopyOf)) {
            try {
                ((isHitInMinimumTouchTargetBetter) listiterator.MediaBrowserCompatMediaItem).serializer(bArrCopyOfRange, listiterator.RatingCompat.equals(requestRemeasureui.LEGACY) ? coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr2, hitTestSemantics6fMxITsuidefault.IconCompatParcelizer) : bArr2);
                zzjVar.getClass();
                return;
            } catch (GeneralSecurityException e) {
                hitTestSemantics6fMxITsuidefault.RemoteActionCompatParcelizer.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = emojiProcessor.IconCompatParcelizer(accessgetHitDepthp.serializer).iterator();
        while (it.hasNext()) {
            try {
                ((isHitInMinimumTouchTargetBetter) ((listIterator) it.next()).MediaBrowserCompatMediaItem).serializer(bArr, bArr2);
                zzjVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        zzjVar.getClass();
        getAlignmentLinesMap.write("invalid MAC");
    }

    @Override // o.isHitInMinimumTouchTargetBetter
    public final byte[] read(byte[] bArr) throws GeneralSecurityException {
        zzj zzjVar = this.write;
        listIterator listiterator = (listIterator) this.serializer.read;
        if (listiterator.RatingCompat.equals(requestRemeasureui.LEGACY)) {
            bArr = coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr, hitTestSemantics6fMxITsuidefault.IconCompatParcelizer);
        }
        try {
            byte[] bArr2 = listiterator.serializer;
            byte[] bArrRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((isHitInMinimumTouchTargetBetter) listiterator.MediaBrowserCompatMediaItem).read(bArr));
            int i = listiterator.RemoteActionCompatParcelizer;
            zzjVar.getClass();
            return bArrRemoteActionCompatParcelizer;
        } catch (GeneralSecurityException e) {
            zzjVar.getClass();
            throw e;
        }
    }

    public getOrCreateIntrinsicsPolicy(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.serializer = emojiProcessor;
        boolean zIsEmpty = ((getZSortedChildrenannotations) emojiProcessor.IconCompatParcelizer).serializer.isEmpty();
        zzj zzjVar = getLayoutModifierNode.read;
        if (zIsEmpty) {
            this.write = zzjVar;
            this.RemoteActionCompatParcelizer = zzjVar;
            return;
        }
        getLookaheadConstraintsDWUhwKwui getlookaheadconstraintsdwuhwkwuiWrite = accessgetModifierBoundsPaintcp.read.write();
        getLayoutModifierNode.IconCompatParcelizer(emojiProcessor);
        getlookaheadconstraintsdwuhwkwuiWrite.getClass();
        this.write = zzjVar;
        this.RemoteActionCompatParcelizer = zzjVar;
    }
}
