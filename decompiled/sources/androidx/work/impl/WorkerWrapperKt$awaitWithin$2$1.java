package androidx.work.impl;

import o.DrawModifierNodeKt;
import o.accesssetSpotShadowColor8_81llAjd;
import o.createFromParcel;
import o.getFontScale;
import o.getOffsetF1C5BW0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.updateDensity;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapperKt$awaitWithin$2$1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ WorkerWrapperKt$awaitWithin$2$1(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        long j;
        if (this.serializer != 0) {
            getFontScale getfontscale = (getFontScale) obj;
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                j = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
                getOffsetF1C5BW0.MediaSessionCompatQueueItem = 1 + j;
            }
            return new updateDensity(j, getfontscale, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.RemoteActionCompatParcelizer);
        }
        Throwable th = (Throwable) obj;
        if (th instanceof WorkerStoppedException) {
            accesssetSpotShadowColor8_81llAjd accesssetspotshadowcolor8_81llajd = (accesssetSpotShadowColor8_81llAjd) this.IconCompatParcelizer;
            accesssetspotshadowcolor8_81llajd.read.compareAndSet(-256, ((WorkerStoppedException) th).serializer);
        }
        ((DrawModifierNodeKt) this.RemoteActionCompatParcelizer).cancel(false);
        return createFromParcel.INSTANCE;
    }
}
