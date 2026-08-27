package com.huawei.location.nlp.scan;

import androidx.compose.ui.graphics.Fields;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class FB implements Comparator {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ int read;
    public static final /* synthetic */ FB IconCompatParcelizer = new FB(9);
    public static final /* synthetic */ FB RemoteActionCompatParcelizer = new FB(11);
    public static final /* synthetic */ FB serializer = new FB(12);

    public /* synthetic */ FB(int i) {
        this.read = i;
    }

    static {
        int i = RatingCompat + 15;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d1, code lost:
    
        if (r13.getRssi() > r14.getRssi()) goto L116;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.nlp.scan.FB.compare(java.lang.Object, java.lang.Object):int");
    }
}
