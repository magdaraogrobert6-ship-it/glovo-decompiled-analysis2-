package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class requestCursorUpdates implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaDescriptionCompat;
    public final /* synthetic */ long MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ Object write;

    public /* synthetic */ requestCursorUpdates(String str, boolean z, androidx.compose.ui.Modifier modifier, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.read = str;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaSessionCompatQueueItem = j;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = dragAndDropTargetModifierNode;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ requestCursorUpdates(String str, boolean z, String str2, androidx.compose.ui.Modifier modifier, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.read = str;
        this.IconCompatParcelizer = z;
        this.write = str2;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaSessionCompatQueueItem = j;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        ((java.lang.Integer) r18).getClass();
        r15 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1);
        com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt.m4913FloatingImageButtonEmojiContent3f6hBDE(r16.read, r16.IconCompatParcelizer, (java.lang.String) r5, r16.RemoteActionCompatParcelizer, r16.MediaSessionCompatQueueItem, r16.RatingCompat, r16.MediaDescriptionCompat, (o.getBirthDateFull) r17, r15);
        r2 = o.requestCursorUpdates.MediaMetadataCompat + 1;
        o.requestCursorUpdates.PlaybackStateCompatCustomAction = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        ((java.lang.Integer) r18).getClass();
        r15 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1);
        com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt.RemoteActionCompatParcelizer(r16.read, r16.IconCompatParcelizer, r16.RemoteActionCompatParcelizer, r16.MediaSessionCompatQueueItem, r16.RatingCompat, r16.MediaDescriptionCompat, (o.DragAndDropTargetModifierNode) r5, (o.getBirthDateFull) r17, r15);
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.requestCursorUpdates.MediaMetadataCompat
            int r2 = r2 + 105
            int r3 = r2 % 128
            o.requestCursorUpdates.PlaybackStateCompatCustomAction = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L1f
            int r2 = r0.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r0.MediaBrowserCompatMediaItem
            java.lang.Object r5 = r0.write
            r6 = 96
            int r6 = r6 / 0
            if (r2 == 0) goto L4d
            goto L29
        L1f:
            int r2 = r0.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r0.MediaBrowserCompatMediaItem
            java.lang.Object r5 = r0.write
            if (r2 == 0) goto L4d
        L29:
            r13 = r5
            o.DragAndDropTargetModifierNode r13 = (o.DragAndDropTargetModifierNode) r13
            r14 = r17
            o.getBirthDateFull r14 = (o.getBirthDateFull) r14
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r4 | 1
            int r15 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r1)
            java.lang.String r6 = r0.read
            boolean r7 = r0.IconCompatParcelizer
            androidx.compose.ui.Modifier r8 = r0.RemoteActionCompatParcelizer
            long r9 = r0.MediaSessionCompatQueueItem
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r11 = r0.RatingCompat
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r12 = r0.MediaDescriptionCompat
            com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt.RemoteActionCompatParcelizer(r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return r3
        L4d:
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r14 = r17
            o.getBirthDateFull r14 = (o.getBirthDateFull) r14
            r2 = r18
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r2 = r4 | 1
            int r15 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r2)
            java.lang.String r6 = r0.read
            boolean r7 = r0.IconCompatParcelizer
            androidx.compose.ui.Modifier r9 = r0.RemoteActionCompatParcelizer
            long r10 = r0.MediaSessionCompatQueueItem
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r12 = r0.RatingCompat
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r13 = r0.MediaDescriptionCompat
            com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt.m4913FloatingImageButtonEmojiContent3f6hBDE(r6, r7, r8, r9, r10, r12, r13, r14, r15)
            int r2 = o.requestCursorUpdates.MediaMetadataCompat
            int r2 = r2 + 1
            int r4 = r2 % 128
            o.requestCursorUpdates.PlaybackStateCompatCustomAction = r4
            int r2 = r2 % r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestCursorUpdates.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
