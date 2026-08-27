package o;

/* JADX INFO: loaded from: classes.dex */
public final class getDrawResultui extends coil3.util.ContextsKt {
    @Override // coil3.util.ContextsKt
    public final boolean IconCompatParcelizer(getGraphicsContext getgraphicscontext, getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2) {
        synchronized (getgraphicscontext) {
            if (getgraphicscontext.MediaDescriptionCompat != getgraphicscontextproviderui) {
                return false;
            }
            getgraphicscontext.MediaDescriptionCompat = getgraphicscontextproviderui2;
            return true;
        }
    }

    @Override // coil3.util.ContextsKt
    public final void read(getGraphicsContextProviderui getgraphicscontextproviderui, Thread thread) {
        getgraphicscontextproviderui.read = thread;
    }

    @Override // coil3.util.ContextsKt
    public final boolean read(getGraphicsContext getgraphicscontext, Object obj, Object obj2) {
        synchronized (getgraphicscontext) {
            if (getgraphicscontext.MediaBrowserCompatMediaItem != obj) {
                return false;
            }
            getgraphicscontext.MediaBrowserCompatMediaItem = obj2;
            return true;
        }
    }

    @Override // coil3.util.ContextsKt
    public final void serializer(getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2) {
        getgraphicscontextproviderui.write = getgraphicscontextproviderui2;
    }

    @Override // coil3.util.ContextsKt
    public final boolean serializer(getGraphicsContext getgraphicscontext, getCacheParamsui getcacheparamsui, getCacheParamsui getcacheparamsui2) {
        synchronized (getgraphicscontext) {
            if (getgraphicscontext.RemoteActionCompatParcelizer != getcacheparamsui) {
                return false;
            }
            getgraphicscontext.RemoteActionCompatParcelizer = getcacheparamsui2;
            return true;
        }
    }
}
