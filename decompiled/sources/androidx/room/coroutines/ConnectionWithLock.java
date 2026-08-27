package androidx.room.coroutines;

import com.google.android.gms.measurement.internal.zzhm;
import java.util.Iterator;
import kotlinx.coroutines.sync.MutexImpl;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.UncheckedColordefault;
import o.copywmQWz5c;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.hideCurrentlyDisplayingInAppMessage;
import o.markOnScreenCardsAsReadlambda1;
import o.onContentCardDismissed;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionWithLock implements tintxETnrds, setCustomInAppMessageAnimationFactorylambda0 {
    public TextAnnouncementContentCardView IconCompatParcelizer;
    public final tintxETnrds RemoteActionCompatParcelizer;
    public Throwable read;
    public final setCustomInAppMessageAnimationFactorylambda0 serializer;
    public final zzhm write;

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final void write(Object obj) {
        this.serializer.write(null);
    }

    @Override // o.tintxETnrds
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final void dump(StringBuilder sb) {
        int i;
        zzhm zzhmVar = this.write;
        if (this.IconCompatParcelizer == null && this.read == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            TextAnnouncementContentCardView textAnnouncementContentCardView = this.IconCompatParcelizer;
            if (textAnnouncementContentCardView != null) {
                sb.append("\t\tCoroutine: " + textAnnouncementContentCardView);
                sb.append('\n');
            }
            Throwable th = this.read;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = onContentCardDismissed.serializer(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(markOnScreenCardsAsReadlambda1.RemoteActionCompatParcelizer(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (zzhmVar != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (zzhmVar.IconCompatParcelizer) {
                i = zzhmVar.MediaMetadataCompat;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final Object lock(ShortNewsContentCardView shortNewsContentCardView) {
        return this.serializer.lock(shortNewsContentCardView);
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final boolean read() {
        return this.serializer.read();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final boolean write() {
        return this.serializer.write();
    }

    @Override // o.tintxETnrds
    public final UncheckedColordefault RemoteActionCompatParcelizer(String str) {
        str.getClass();
        zzhm zzhmVar = this.write;
        if (zzhmVar == null) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str);
        }
        Object obj = zzhmVar.get(str);
        obj.getClass();
        return new copywmQWz5c((UncheckedColordefault) obj);
    }

    public ConnectionWithLock(tintxETnrds tintxetnrds) {
        MutexImpl mutexImplIconCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        tintxetnrds.getClass();
        this.RemoteActionCompatParcelizer = tintxetnrds;
        this.serializer = mutexImplIconCompatParcelizer;
        this.write = new zzhm(this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        zzhm zzhmVar = this.write;
        if (zzhmVar != null) {
            zzhmVar.trimToSize(-1);
        }
        this.RemoteActionCompatParcelizer.close();
    }
}
