package com.google.android.gms.internal.measurement;

import androidx.transition.TransitionValuesMaps;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import o.accessgetTvTeletextcp;
import o.getNumPadDivideEK5gGoQ;
import o.getNumPadEqualsEK5gGoQ;
import o.getNumPadInsertEK5gGoQ;
import o.getNumPadLeftParenthesisEK5gGoQ;
import o.getNumPadMoveHomeEK5gGoQ;
import o.getNumPadPageUpEK5gGoQ;
import o.getZEK5gGoQ;
import o.getZenkakuHankaruEK5gGoQ;
import o.getZoomInEK5gGoQ;
import o.getZoomOutEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    public final TransitionValuesMaps IconCompatParcelizer;
    public final accessgetTvTeletextcp RemoteActionCompatParcelizer;
    public TransitionValuesMaps read;
    public final zzz write;

    public final void RemoteActionCompatParcelizer(getZoomOutEK5gGoQ getzoomoutek5ggoq) throws zzd {
        getNumPadInsertEK5gGoQ getnumpadinsertek5ggoq;
        try {
            TransitionValuesMaps transitionValuesMaps = this.IconCompatParcelizer;
            this.read = ((TransitionValuesMaps) transitionValuesMaps.MediaDescriptionCompat).PlaybackStateCompatCustomAction();
            if (transitionValuesMaps.serializer(this.read, (getZEK5gGoQ[]) getzoomoutek5ggoq.read().toArray(new getZEK5gGoQ[0])) instanceof getNumPadEqualsEK5gGoQ) {
                throw new IllegalStateException("Program loading failed");
            }
            for (getZoomInEK5gGoQ getzoominek5ggoq : getzoomoutek5ggoq.RemoteActionCompatParcelizer().IconCompatParcelizer()) {
                List listWrite = getzoominek5ggoq.write();
                String strRemoteActionCompatParcelizer = getzoominek5ggoq.RemoteActionCompatParcelizer();
                Iterator it = listWrite.iterator();
                while (it.hasNext()) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqSerializer = transitionValuesMaps.serializer(this.read, (getZEK5gGoQ) it.next());
                    if (!(getnumpadmovehomeek5ggoqSerializer instanceof getNumPadPageUpEK5gGoQ)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    TransitionValuesMaps transitionValuesMaps2 = this.read;
                    if (transitionValuesMaps2.serializer(strRemoteActionCompatParcelizer)) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqIconCompatParcelizer = transitionValuesMaps2.IconCompatParcelizer(strRemoteActionCompatParcelizer);
                        if (!(getnumpadmovehomeek5ggoqIconCompatParcelizer instanceof getNumPadInsertEK5gGoQ)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strRemoteActionCompatParcelizer)));
                        }
                        getnumpadinsertek5ggoq = (getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqIconCompatParcelizer;
                    } else {
                        getnumpadinsertek5ggoq = null;
                    }
                    if (getnumpadinsertek5ggoq == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strRemoteActionCompatParcelizer)));
                    }
                    getnumpadinsertek5ggoq.RemoteActionCompatParcelizer(this.read, Collections.singletonList(getnumpadmovehomeek5ggoqSerializer));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean serializer(getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq) throws zzd {
        accessgetTvTeletextcp accessgettvteletextcp = this.RemoteActionCompatParcelizer;
        try {
            accessgettvteletextcp.RemoteActionCompatParcelizer = getnumpaddivideek5ggoq;
            accessgettvteletextcp.serializer = getnumpaddivideek5ggoq.clone();
            ((ArrayList) accessgettvteletextcp.write).clear();
            ((TransitionValuesMaps) this.IconCompatParcelizer.MediaMetadataCompat).RemoteActionCompatParcelizer("runtime.counter", new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(0.0d)));
            this.write.read(this.read.PlaybackStateCompatCustomAction(), accessgettvteletextcp);
            return (((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).equals((getNumPadDivideEK5gGoQ) accessgettvteletextcp.RemoteActionCompatParcelizer) && ((ArrayList) accessgettvteletextcp.write).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public zzc() {
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(17);
        this.IconCompatParcelizer = transitionValuesMaps;
        this.read = ((TransitionValuesMaps) transitionValuesMaps.MediaDescriptionCompat).PlaybackStateCompatCustomAction();
        this.RemoteActionCompatParcelizer = new accessgetTvTeletextcp(10);
        final int i = 0;
        this.write = new zzz(0);
        final int i2 = 1;
        Callable callable = new Callable(this) { // from class: o.getNumPadDirectionDownEK5gGoQ
            public final /* synthetic */ zzc serializer;

            {
                this.serializer = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                zzc zzcVar = this.serializer;
                return i3 != 0 ? new KeyEvent_androidKt(zzcVar.write) : new KeyEvent_androidKt(zzcVar.RemoteActionCompatParcelizer);
            }
        };
        getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq = (getZenkakuHankaruEK5gGoQ) transitionValuesMaps.RatingCompat;
        ((HashMap) getzenkakuhankaruek5ggoq.write).put("internal.registerCallback", callable);
        ((HashMap) getzenkakuhankaruek5ggoq.write).put("internal.eventLogger", new Callable(this) { // from class: o.getNumPadDirectionDownEK5gGoQ
            public final /* synthetic */ zzc serializer;

            {
                this.serializer = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i;
                zzc zzcVar = this.serializer;
                return i3 != 0 ? new KeyEvent_androidKt(zzcVar.write) : new KeyEvent_androidKt(zzcVar.RemoteActionCompatParcelizer);
            }
        });
    }
}
