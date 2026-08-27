package o;

/* JADX INFO: loaded from: classes.dex */
public final class doTranslation {
    public final onRemeasuredozmzZPI RemoteActionCompatParcelizer;

    public static final Object IconCompatParcelizer(onRemeasuredozmzZPI onremeasuredozmzzpi) {
        Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(null);
        if (objMediaBrowserCompatMediaItem == null) {
            return null;
        }
        if (!(objMediaBrowserCompatMediaItem instanceof ContentInViewNode)) {
            onremeasuredozmzzpi.IconCompatParcelizer((Object) null);
            return objMediaBrowserCompatMediaItem;
        }
        ContentInViewNode contentInViewNode = (ContentInViewNode) objMediaBrowserCompatMediaItem;
        Object objSerializer = onVirtualViewTranslationResponseslambda0.serializer(contentInViewNode);
        objSerializer.getClass();
        if (contentInViewNode.write()) {
            onremeasuredozmzzpi.IconCompatParcelizer((Object) null);
        }
        if (contentInViewNode.IconCompatParcelizer == 1) {
            onremeasuredozmzzpi.write(null, contentInViewNode.serializer());
        }
        return objSerializer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public /* synthetic */ doTranslation(onRemeasuredozmzZPI onremeasuredozmzzpi) {
        this.RemoteActionCompatParcelizer = onremeasuredozmzzpi;
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.RemoteActionCompatParcelizer + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof doTranslation) {
            return this.RemoteActionCompatParcelizer.equals(((doTranslation) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final ContentInViewNode serializer(onRemeasuredozmzZPI onremeasuredozmzzpi) {
        if (onremeasuredozmzzpi.read()) {
            ContentInViewNode contentInViewNode = DefaultFlingBehaviorperformFling2.write;
            contentInViewNode.getClass();
            return contentInViewNode;
        }
        ContentInViewNode contentInViewNode2 = new ContentInViewNode();
        Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi.write;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof ContentInViewNode) {
                                contentInViewNode2.serializer((ContentInViewNode) obj);
                            } else {
                                obj.getClass();
                                contentInViewNode2.read(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return contentInViewNode2;
    }
}
