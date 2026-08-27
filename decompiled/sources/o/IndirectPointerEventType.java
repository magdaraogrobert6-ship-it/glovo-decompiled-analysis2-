package o;

import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class IndirectPointerEventType {
    private static int read = 1;
    private static int write;
    public final getGestureThresholdActivate5zf0vsI IconCompatParcelizer;
    public final CustomerChatCommunicatorImpl serializer;

    public IndirectPointerEventType(CustomerChatCommunicatorImpl customerChatCommunicatorImpl, getGestureThresholdActivate5zf0vsI getgesturethresholdactivate5zf0vsi) {
        this.serializer = customerChatCommunicatorImpl;
        this.IconCompatParcelizer = getgesturethresholdactivate5zf0vsi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((!r7) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r7 = o.IndirectPointerEventType.write + 107;
        o.IndirectPointerEventType.read = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if ((r7 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        o.getGestureThresholdActivate5zf0vsI.read(r6.IconCompatParcelizer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        o.getGestureThresholdActivate5zf0vsI.read(r6.IconCompatParcelizer);
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Intent on main screen. orderConfirmationNumber = ".concat(r1), new java.lang.Object[0]);
        r6.serializer.IconCompatParcelizer(r1, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer(android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.IndirectPointerEventType.read
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.IndirectPointerEventType.write = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "dispatcher_chat_channel"
            java.lang.String r4 = "customer_chat_channel"
            r5 = 1
            if (r1 == 0) goto L22
            r7.getClass()
            java.lang.String r1 = r7.getStringExtra(r4)
            boolean r7 = r7.getBooleanExtra(r3, r5)
            if (r1 == 0) goto L42
            goto L2f
        L22:
            r7.getClass()
            java.lang.String r1 = r7.getStringExtra(r4)
            boolean r7 = r7.getBooleanExtra(r3, r2)
            if (r1 == 0) goto L42
        L2f:
            timber.log.Timber$Forest r7 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.String r0 = "Intent on main screen. orderConfirmationNumber = "
            java.lang.String r0 = r0.concat(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7.IconCompatParcelizer(r0, r2)
            com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl r7 = r6.serializer
            r7.IconCompatParcelizer(r1, r5)
            return
        L42:
            r7 = r7 ^ r5
            if (r7 == r5) goto L60
            int r7 = o.IndirectPointerEventType.write
            int r7 = r7 + 107
            int r1 = r7 % 128
            o.IndirectPointerEventType.read = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L56
            o.getGestureThresholdActivate5zf0vsI r7 = r6.IconCompatParcelizer
            o.getGestureThresholdActivate5zf0vsI.read(r7)
            goto L60
        L56:
            o.getGestureThresholdActivate5zf0vsI r7 = r6.IconCompatParcelizer
            o.getGestureThresholdActivate5zf0vsI.read(r7)
            r7 = 0
            r7.hashCode()
            throw r7
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IndirectPointerEventType.RemoteActionCompatParcelizer(android.content.Intent):void");
    }
}
