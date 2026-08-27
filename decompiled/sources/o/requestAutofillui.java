package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class requestAutofillui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ requestAutofillui(String str, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, boolean z2, String str2, int i, int i2) {
        this.read = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = modifier;
        this.RatingCompat = z2;
        this.MediaMetadataCompat = str2;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public /* synthetic */ requestAutofillui(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, boolean z2, onSemanticsChanged onsemanticschanged, int i, int i2) {
        this.RemoteActionCompatParcelizer = z;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = modifier;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RatingCompat = z2;
        this.MediaMetadataCompat = onsemanticschanged;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        ((java.lang.Integer) r18).getClass();
        r14 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1);
        androidx.compose.material3.SwitchKt.IconCompatParcelizer(r16.RemoteActionCompatParcelizer, r16.write, r16.serializer, (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r6, r16.RatingCompat, (o.onSemanticsChanged) r5, (o.getBirthDateFull) r17, r14, r16.MediaBrowserCompatMediaItem);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r2 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        ((java.lang.Integer) r18).getClass();
        r14 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1);
        com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleKt.AutoAcceptPreferencesToggleContent((java.lang.String) r6, r16.RemoteActionCompatParcelizer, r16.write, r16.serializer, r16.RatingCompat, (java.lang.String) r5, (o.getBirthDateFull) r17, r14, r16.MediaBrowserCompatMediaItem);
        r2 = o.requestAutofillui.MediaSessionCompatQueueItem + 77;
        o.requestAutofillui.MediaSessionCompatToken = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
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
            int r2 = o.requestAutofillui.MediaSessionCompatToken
            int r2 = r2 + 45
            int r3 = r2 % 128
            o.requestAutofillui.MediaSessionCompatQueueItem = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L21
            int r2 = r0.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r0.MediaDescriptionCompat
            java.lang.Object r5 = r0.MediaMetadataCompat
            java.lang.Object r6 = r0.read
            r7 = 48
            int r7 = r7 / 0
            if (r2 == 0) goto L5b
            goto L2d
        L21:
            int r2 = r0.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r0.MediaDescriptionCompat
            java.lang.Object r5 = r0.MediaMetadataCompat
            java.lang.Object r6 = r0.read
            if (r2 == 0) goto L5b
        L2d:
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r13 = r17
            o.getBirthDateFull r13 = (o.getBirthDateFull) r13
            r2 = r18
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r2 = r4 | 1
            int r14 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r2)
            boolean r8 = r0.RemoteActionCompatParcelizer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r9 = r0.write
            androidx.compose.ui.Modifier r10 = r0.serializer
            boolean r11 = r0.RatingCompat
            int r15 = r0.MediaBrowserCompatMediaItem
            com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleKt.AutoAcceptPreferencesToggleContent(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r2 = o.requestAutofillui.MediaSessionCompatQueueItem
            int r2 = r2 + 77
            int r4 = r2 % 128
            o.requestAutofillui.MediaSessionCompatToken = r4
            int r2 = r2 % r1
            return r3
        L5b:
            r10 = r6
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r10 = (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r10
            r12 = r5
            o.onSemanticsChanged r12 = (o.onSemanticsChanged) r12
            r13 = r17
            o.getBirthDateFull r13 = (o.getBirthDateFull) r13
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r4 | 1
            int r14 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r1)
            boolean r7 = r0.RemoteActionCompatParcelizer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8 = r0.write
            androidx.compose.ui.Modifier r9 = r0.serializer
            boolean r11 = r0.RatingCompat
            int r15 = r0.MediaBrowserCompatMediaItem
            androidx.compose.material3.SwitchKt.IconCompatParcelizer(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestAutofillui.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
