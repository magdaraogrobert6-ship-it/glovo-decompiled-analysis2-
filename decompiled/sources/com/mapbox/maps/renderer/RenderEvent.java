package com.mapbox.maps.renderer;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderEvent {
    private final boolean needRender;
    private final Runnable runnable;

    public final Runnable component1() {
        return this.runnable;
    }

    public final boolean component2() {
        return this.needRender;
    }

    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final Runnable getRunnable() {
        return this.runnable;
    }

    public final RenderEvent copy(Runnable runnable, boolean z) {
        return new RenderEvent(runnable, z);
    }

    public RenderEvent(Runnable runnable, boolean z) {
        this.runnable = runnable;
        this.needRender = z;
    }

    public static /* synthetic */ RenderEvent copy$default(RenderEvent renderEvent, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = renderEvent.runnable;
        }
        if ((i & 2) != 0) {
            z = renderEvent.needRender;
        }
        return renderEvent.copy(runnable, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderEvent)) {
            return false;
        }
        RenderEvent renderEvent = (RenderEvent) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.runnable, renderEvent.runnable}, getCieXyz.write())).booleanValue() && this.needRender == renderEvent.needRender;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RenderEvent(runnable=");
        sb.append(this.runnable);
        sb.append(", needRender=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.needRender, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        Runnable runnable = this.runnable;
        int iHashCode = runnable == null ? 0 : runnable.hashCode();
        boolean z = this.needRender;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }
}
