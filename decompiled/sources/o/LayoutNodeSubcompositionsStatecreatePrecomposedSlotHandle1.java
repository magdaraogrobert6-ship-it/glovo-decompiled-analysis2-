package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public final LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 IconCompatParcelizer;
    public final Object read;
    public final String write;
    public final Object serializer = new Object();
    public volatile Object MediaDescriptionCompat = null;

    public final Object IconCompatParcelizer(Object obj) {
        Object objSerializer;
        synchronized (this.serializer) {
        }
        if (obj != null) {
            return obj;
        }
        if (Measured.serializer == null) {
            return this.read;
        }
        synchronized (RemoteActionCompatParcelizer) {
            if (accessgetWcp.read()) {
                return this.MediaDescriptionCompat == null ? this.read : this.MediaDescriptionCompat;
            }
            try {
                for (LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 : premeasure0kLqBqw.removeOnConfigurationChangedListener) {
                    if (accessgetWcp.read()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    try {
                        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer;
                        objSerializer = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 != null ? layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2.serializer() : null;
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (RemoteActionCompatParcelizer) {
                        layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.MediaDescriptionCompat = objSerializer;
                    }
                }
            } catch (SecurityException unused2) {
            }
            LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3 = this.IconCompatParcelizer;
            if (layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3 != null) {
                try {
                    return layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle3.serializer();
                } catch (IllegalStateException | SecurityException unused3) {
                }
            }
            return this.read;
        }
    }

    public /* synthetic */ LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1(String str, Object obj, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2) {
        this.write = str;
        this.read = obj;
        this.IconCompatParcelizer = layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2;
    }
}
