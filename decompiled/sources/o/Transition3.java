package o;

import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Transition3 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ Transition3(float f, setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, androidx.compose.ui.Modifier modifier, int i) {
        this.RemoteActionCompatParcelizer = 0;
        this.read = f;
        this.IconCompatParcelizer = setlegacyrequestdisallowintercepttoucheventenabled;
        this.write = modifier;
        this.serializer = i;
    }

    public /* synthetic */ Transition3(InAppCameraOverlayState inAppCameraOverlayState, androidx.compose.ui.Modifier modifier, float f, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = inAppCameraOverlayState;
        this.write = modifier;
        this.read = f;
        this.serializer = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        ((java.lang.Integer) r11).getClass();
        com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.CameraOverlayV2Content((com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState) r7, r6, r5, (o.getBirthDateFull) r10, o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1));
        r10 = o.Transition3.MediaMetadataCompat + 75;
        o.Transition3.MediaSessionCompatQueueItem = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r10 = 4 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        ((java.lang.Integer) r11).getClass();
        com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.CameraOverlayV2Content((com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState) r7, r6, r5, (o.getBirthDateFull) r10, o.ContentType_androidKt.RemoteActionCompatParcelizer(r4 | 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.Transition3.MediaSessionCompatQueueItem
            int r1 = r1 + 77
            int r2 = r1 % 128
            o.Transition3.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L24
            int r1 = r9.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r9.serializer
            float r5 = r9.read
            androidx.compose.ui.Modifier r6 = r9.write
            java.lang.Object r7 = r9.IconCompatParcelizer
            r8 = 58
            int r8 = r8 / 0
            if (r1 == 0) goto L68
            if (r1 == r2) goto L55
            goto L34
        L24:
            int r1 = r9.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            int r4 = r9.serializer
            float r5 = r9.read
            androidx.compose.ui.Modifier r6 = r9.write
            java.lang.Object r7 = r9.IconCompatParcelizer
            if (r1 == 0) goto L68
            if (r1 == r2) goto L55
        L34:
            com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState r7 = (com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState) r7
            o.getBirthDateFull r10 = (o.getBirthDateFull) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = r4 | 1
            int r11 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r11)
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.CameraOverlayV2Content(r7, r6, r5, r10, r11)
            int r10 = o.Transition3.MediaMetadataCompat
            int r10 = r10 + 75
            int r11 = r10 % 128
            o.Transition3.MediaSessionCompatQueueItem = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L54
            r10 = 4
            int r10 = r10 / 0
        L54:
            return r3
        L55:
            com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState r7 = (com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState) r7
            o.getBirthDateFull r10 = (o.getBirthDateFull) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = r4 | 1
            int r11 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r11)
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.CameraOverlayV2Content(r7, r6, r5, r10, r11)
            return r3
        L68:
            o.setLegacyRequestDisallowInterceptTouchEventEnabled r7 = (o.setLegacyRequestDisallowInterceptTouchEventEnabled) r7
            o.getBirthDateFull r10 = (o.getBirthDateFull) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = r4 | 1
            int r11 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r11)
            com.roadrunner.liveness.recording.presentation.compose.CameraOverlayKt.read(r5, r7, r6, r10, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Transition3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
