package o;

import android.os.Trace;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class firstDescendantOrNull {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatToken;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void RemoteActionCompatParcelizer() {
        this.serializer = null;
        this.MediaSessionCompatToken = null;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) this.MediaBrowserCompatMediaItem;
        oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
        ((relocationOffsetfbGrOKE) this.MediaSessionCompatQueueItem).serializer();
        this.read = oncreatevirtualviewtranslationrequests;
        ((onCreateVirtualViewTranslationRequests) this.write).RemoteActionCompatParcelizer();
        ((onCreateVirtualViewTranslationRequests) this.MediaDescriptionCompat).RemoteActionCompatParcelizer();
        this.RatingCompat = null;
        this.MediaMetadataCompat = null;
        this.IconCompatParcelizer = null;
    }

    public static final boolean write(createFromAutofillValue createfromautofillvalue, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            updateBuffersOnDisappeared updatebuffersondisappeared = ((createFromAutofillValue) objArr[i2]).read;
            if (updatebuffersondisappeared instanceof DragAndDropNodeKt) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsRemoteActionCompatParcelizer = ((DragAndDropNodeKt) updatebuffersondisappeared).RemoteActionCompatParcelizer();
                if (oncreatevirtualviewtranslationrequestsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(createfromautofillvalue) || write(createfromautofillvalue, oncreatevirtualviewtranslationrequestsRemoteActionCompatParcelizer)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ae */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void IconCompatParcelizer() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.MediaBrowserCompatMediaItem
            o.onCreateVirtualViewTranslationRequests r0 = (o.onCreateVirtualViewTranslationRequests) r0
            java.lang.Object r1 = r9.write
            o.onCreateVirtualViewTranslationRequests r1 = (o.onCreateVirtualViewTranslationRequests) r1
            java.lang.Object r2 = r9.serializer
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L10
            goto Lb3
        L10:
            r3 = 0
            r9.RemoteActionCompatParcelizer = r3
            int r3 = r1.read
            r4 = 16
            if (r3 == 0) goto L72
            java.lang.String r3 = "Compose:onForgotten"
            android.os.Trace.beginSection(r3)
            java.lang.Object r3 = r9.RatingCompat     // Catch: java.lang.Throwable -> L6d
            o.relocationOffsetfbGrOKE r3 = (o.relocationOffsetfbGrOKE) r3     // Catch: java.lang.Throwable -> L6d
            int r5 = r1.read     // Catch: java.lang.Throwable -> L6d
            r6 = -1
            int r5 = r5 + r6
        L26:
            if (r6 >= r5) goto L69
            java.lang.Object[] r7 = r1.write     // Catch: java.lang.Throwable -> L6d
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L6d
            boolean r8 = r7 instanceof o.createFromAutofillValue     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L3b
            r8 = r7
            o.createFromAutofillValue r8 = (o.createFromAutofillValue) r8     // Catch: java.lang.Throwable -> L57
            o.updateBuffersOnDisappeared r8 = r8.read     // Catch: java.lang.Throwable -> L57
            r2.remove(r8)     // Catch: java.lang.Throwable -> L57
            r8.onForgotten()     // Catch: java.lang.Throwable -> L57
        L3b:
            boolean r8 = r7 instanceof o.getAddressStreet     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L54
            if (r3 == 0) goto L4e
            boolean r8 = r3.MediaBrowserCompatMediaItem(r7)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L4e
            r8 = r7
            o.getAddressStreet r8 = (o.getAddressStreet) r8     // Catch: java.lang.Throwable -> L57
            r8.onRelease()     // Catch: java.lang.Throwable -> L57
            goto L54
        L4e:
            r8 = r7
            o.getAddressStreet r8 = (o.getAddressStreet) r8     // Catch: java.lang.Throwable -> L57
            r8.onDeactivate()     // Catch: java.lang.Throwable -> L57
        L54:
            int r5 = r5 + (-1)
            goto L26
        L57:
            r0 = move-exception
            java.lang.Object r1 = r9.MediaSessionCompatToken     // Catch: java.lang.Throwable -> L6d
            o.getUnboundedGoahg r1 = (o.getUnboundedGoahg) r1     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L68
            o.getRectangleGoahg r1 = (o.getRectangleGoahg) r1     // Catch: java.lang.Throwable -> L6d
            bo.app.ah$$ExternalSyntheticLambda0 r2 = new bo.app.ah$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r1, r4, r7)     // Catch: java.lang.Throwable -> L6d
            o.getLayoutDirection.read(r0, r2)     // Catch: java.lang.Throwable -> L6d
        L68:
            throw r0     // Catch: java.lang.Throwable -> L6d
        L69:
            android.os.Trace.endSection()
            goto L72
        L6d:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L72:
            int r1 = r0.read
            if (r1 == 0) goto Lb3
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r9.serializer     // Catch: java.lang.Throwable -> Lae
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L82
            goto Laa
        L82:
            java.lang.Object[] r2 = r0.write     // Catch: java.lang.Throwable -> Lae
            int r0 = r0.read     // Catch: java.lang.Throwable -> Lae
            r3 = 0
        L87:
            if (r3 >= r0) goto Laa
            r5 = r2[r3]     // Catch: java.lang.Throwable -> Lae
            o.createFromAutofillValue r5 = (o.createFromAutofillValue) r5     // Catch: java.lang.Throwable -> Lae
            o.updateBuffersOnDisappeared r6 = r5.read     // Catch: java.lang.Throwable -> Lae
            r1.remove(r6)     // Catch: java.lang.Throwable -> Lae
            r6.onRemembered()     // Catch: java.lang.Throwable -> L98
            int r3 = r3 + 1
            goto L87
        L98:
            r0 = move-exception
            java.lang.Object r1 = r9.MediaSessionCompatToken     // Catch: java.lang.Throwable -> Lae
            o.getUnboundedGoahg r1 = (o.getUnboundedGoahg) r1     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            o.getRectangleGoahg r1 = (o.getRectangleGoahg) r1     // Catch: java.lang.Throwable -> Lae
            bo.app.ah$$ExternalSyntheticLambda0 r2 = new bo.app.ah$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> Lae
            o.getLayoutDirection.read(r0, r2)     // Catch: java.lang.Throwable -> Lae
        La9:
            throw r0     // Catch: java.lang.Throwable -> Lae
        Laa:
            android.os.Trace.endSection()
            return
        Lae:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.firstDescendantOrNull.IconCompatParcelizer():void");
    }

    public void read() {
        Set set = (Set) this.serializer;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                updateBuffersOnDisappeared updatebuffersondisappeared = (updateBuffersOnDisappeared) it.next();
                it.remove();
                updatebuffersondisappeared.onAbandoned();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void serializer() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) this.MediaDescriptionCompat;
        if (oncreatevirtualviewtranslationrequests.read != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                int i = oncreatevirtualviewtranslationrequests.read;
                for (int i2 = 0; i2 < i; i2++) {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objArr[i2]).invoke();
                }
                oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void serializer(createFromAutofillValue createfromautofillvalue) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) this.MediaBrowserCompatMediaItem;
        if (!((relocationOffsetfbGrOKE) this.MediaSessionCompatQueueItem).MediaBrowserCompatMediaItem(createfromautofillvalue)) {
            awaitTouchSlopOrCancellationjO51t88 awaittouchsloporcancellationjo51t88 = (awaitTouchSlopOrCancellationjO51t88) this.RemoteActionCompatParcelizer;
            if (awaittouchsloporcancellationjo51t88 == null || !awaittouchsloporcancellationjo51t88.MediaBrowserCompatMediaItem(createfromautofillvalue)) {
                ((onCreateVirtualViewTranslationRequests) this.write).IconCompatParcelizer(createfromautofillvalue);
                return;
            }
            return;
        }
        ((relocationOffsetfbGrOKE) this.MediaSessionCompatQueueItem).write(createfromautofillvalue);
        if (!((onCreateVirtualViewTranslationRequests) this.read).RemoteActionCompatParcelizer(createfromautofillvalue) && !oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer(createfromautofillvalue)) {
            write(createfromautofillvalue, oncreatevirtualviewtranslationrequests);
        }
        Set set = (Set) this.serializer;
        if (set == null) {
            return;
        }
        set.add(createfromautofillvalue.read);
    }

    public void serializer(Set set, getRectangleGoahg getrectanglegoahg) {
        RemoteActionCompatParcelizer();
        this.serializer = set;
        this.MediaSessionCompatToken = getrectanglegoahg;
    }

    public firstDescendantOrNull() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new createFromAutofillValue[16]);
        this.MediaBrowserCompatMediaItem = oncreatevirtualviewtranslationrequests;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = new relocationOffsetfbGrOKE();
        this.read = oncreatevirtualviewtranslationrequests;
        this.write = new onCreateVirtualViewTranslationRequests(new Object[16]);
        this.MediaDescriptionCompat = new onCreateVirtualViewTranslationRequests(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0[16]);
    }

    public firstDescendantOrNull(int i) {
    }
}
