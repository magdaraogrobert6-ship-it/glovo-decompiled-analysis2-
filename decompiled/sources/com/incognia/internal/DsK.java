package com.incognia.internal;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class DsK implements PG {
    public final c7l BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final Qpt mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        String title;
        String title2;
        String title3;
        try {
            Qpt qpt = this.mbG;
            Integer numValueOf = null;
            try {
                Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(qpt.BGx, 1);
                if (actualDefaultRingtoneUri == null) {
                    actualDefaultRingtoneUri = RingtoneManager.getDefaultUri(1);
                }
                Ringtone ringtone = RingtoneManager.getRingtone(qpt.BGx, actualDefaultRingtoneUri);
                title = ringtone != null ? ringtone.getTitle(qpt.BGx) : null;
            } catch (Throwable unused) {
            }
            Qpt qpt2 = this.mbG;
            try {
                Uri actualDefaultRingtoneUri2 = RingtoneManager.getActualDefaultRingtoneUri(qpt2.BGx, 4);
                if (actualDefaultRingtoneUri2 == null) {
                    actualDefaultRingtoneUri2 = RingtoneManager.getDefaultUri(4);
                }
                Ringtone ringtone2 = RingtoneManager.getRingtone(qpt2.BGx, actualDefaultRingtoneUri2);
                title2 = ringtone2 != null ? ringtone2.getTitle(qpt2.BGx) : null;
            } catch (Throwable unused2) {
            }
            Qpt qpt3 = this.mbG;
            try {
                Uri actualDefaultRingtoneUri3 = RingtoneManager.getActualDefaultRingtoneUri(qpt3.BGx, 2);
                if (actualDefaultRingtoneUri3 == null) {
                    actualDefaultRingtoneUri3 = RingtoneManager.getDefaultUri(2);
                }
                Ringtone ringtone3 = RingtoneManager.getRingtone(qpt3.BGx, actualDefaultRingtoneUri3);
                title3 = ringtone3 != null ? ringtone3.getTitle(qpt3.BGx) : null;
            } catch (Throwable unused3) {
            }
            try {
                numValueOf = Integer.valueOf(this.BGx.BGx.getRingerMode());
            } catch (Throwable unused4) {
            }
            isitemdismissable = new AA((String) W4i.dGU.MediaSessionCompatResultReceiverWrapper(), new aUL(numValueOf, title, title2, title3));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public DsK(c7l c7lVar, Qpt qpt) {
        this.BGx = c7lVar;
        this.mbG = qpt;
        Object[] objArr = {om3.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
