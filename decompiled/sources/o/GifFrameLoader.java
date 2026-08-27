package o;

/* JADX INFO: loaded from: classes4.dex */
public final class GifFrameLoader implements ItemSingleChoiceBinding {
    public final RegistryMissingComponentException IconCompatParcelizer;
    public final RegistryNoSourceEncoderAvailableException MediaBrowserCompatMediaItem;
    public boolean RemoteActionCompatParcelizer;
    public long read;
    public int serializer;
    public SVGParseException write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
    }

    public GifFrameLoader(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        this.MediaBrowserCompatMediaItem = registryNoSourceEncoderAvailableException;
        RegistryMissingComponentException registryMissingComponentExceptionMediaSessionCompatQueueItem = registryNoSourceEncoderAvailableException.MediaSessionCompatQueueItem();
        this.IconCompatParcelizer = registryMissingComponentExceptionMediaSessionCompatQueueItem;
        SVGParseException sVGParseException = registryMissingComponentExceptionMediaSessionCompatQueueItem.head;
        this.write = sVGParseException;
        this.serializer = sVGParseException != null ? sVGParseException.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.pos) goto L15;
     */
    @Override // o.ItemSingleChoiceBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long RemoteActionCompatParcelizer(o.RegistryMissingComponentException r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L66
            boolean r3 = r8.RemoteActionCompatParcelizer
            if (r3 != 0) goto L60
            o.SVGParseException r3 = r8.write
            o.RegistryMissingComponentException r4 = r8.IconCompatParcelizer
            if (r3 == 0) goto L27
            o.SVGParseException r5 = r4.head
            if (r3 != r5) goto L21
            int r3 = r8.serializer
            r5.getClass()
            int r5 = r5.pos
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.read
            o.RegistryNoSourceEncoderAvailableException r2 = r8.MediaBrowserCompatMediaItem
            r5 = 1
            long r0 = r0 + r5
            boolean r0 = r2.write(r0)
            if (r0 != 0) goto L3a
            r9 = -1
            return r9
        L3a:
            o.SVGParseException r0 = r8.write
            if (r0 != 0) goto L48
            o.SVGParseException r0 = r4.head
            if (r0 == 0) goto L48
            r8.write = r0
            int r0 = r0.pos
            r8.serializer = r0
        L48:
            long r0 = r4.size
            long r2 = r8.read
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o.RegistryMissingComponentException r2 = r8.IconCompatParcelizer
            long r4 = r8.read
            r3 = r9
            r6 = r10
            r2.IconCompatParcelizer(r3, r4, r6)
            long r0 = r8.read
            long r0 = r0 + r10
            r8.read = r0
            return r10
        L60:
            java.lang.String r9 = "closed"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r0
        L66:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = bo.app.af$$ExternalSyntheticOutline0.m(r10, r9)
            o.DrawableTransformation.serializer(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GifFrameLoader.RemoteActionCompatParcelizer(o.RegistryMissingComponentException, long):long");
    }
}
