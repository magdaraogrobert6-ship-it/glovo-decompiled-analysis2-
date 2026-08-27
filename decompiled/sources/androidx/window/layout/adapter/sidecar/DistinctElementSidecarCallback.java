package androidx.window.layout.adapter.sidecar;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import java.util.WeakHashMap;
import o.getTranslationY;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState read;
    public final getTranslationY serializer;
    public final SidecarInterface.SidecarCallback write;
    public final Object RemoteActionCompatParcelizer = new Object();
    public final WeakHashMap IconCompatParcelizer = new WeakHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (o.getTranslationY.read(o.accesssetReusableGraphicsLayerScopep.serializer(r1), o.accesssetReusableGraphicsLayerScopep.serializer(r12)) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWindowLayoutChanged(android.os.IBinder r11, androidx.window.sidecar.SidecarWindowLayoutInfo r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.RemoteActionCompatParcelizer
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r10.IconCompatParcelizer     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L59
            androidx.window.sidecar.SidecarWindowLayoutInfo r1 = (androidx.window.sidecar.SidecarWindowLayoutInfo) r1     // Catch: java.lang.Throwable -> L59
            o.getTranslationY r2 = r10.serializer     // Catch: java.lang.Throwable -> L59
            r2.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r12}     // Catch: java.lang.Throwable -> L59
            int r3 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L59
            int r7 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L59
            int r9 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L59
            int r6 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L59
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L59
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L37
            goto L4b
        L37:
            if (r1 != 0) goto L3a
            goto L4d
        L3a:
            if (r12 != 0) goto L3d
            goto L4d
        L3d:
            java.util.List r1 = o.accesssetReusableGraphicsLayerScopep.serializer(r1)     // Catch: java.lang.Throwable -> L59
            java.util.List r2 = o.accesssetReusableGraphicsLayerScopep.serializer(r12)     // Catch: java.lang.Throwable -> L59
            boolean r1 = o.getTranslationY.read(r1, r2)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L4d
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L4d:
            java.util.WeakHashMap r1 = r10.IconCompatParcelizer     // Catch: java.lang.Throwable -> L59
            r1.put(r11, r12)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            androidx.window.sidecar.SidecarInterface$SidecarCallback r0 = r10.write
            r0.onWindowLayoutChanged(r11, r12)
            return
        L59:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onWindowLayoutChanged(android.os.IBinder, androidx.window.sidecar.SidecarWindowLayoutInfo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (o.accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(r2) == o.accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(r11)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r10.RemoteActionCompatParcelizer
            monitor-enter(r0)
            o.getTranslationY r1 = r10.serializer     // Catch: java.lang.Throwable -> L4c
            androidx.window.sidecar.SidecarDeviceState r2 = r10.read     // Catch: java.lang.Throwable -> L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r11}     // Catch: java.lang.Throwable -> L4c
            int r3 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L4c
            int r7 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L4c
            int r9 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L4c
            int r6 = o.getCieXyz.write()     // Catch: java.lang.Throwable -> L4c
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L34
            goto L41
        L34:
            if (r2 != 0) goto L37
            goto L43
        L37:
            int r1 = o.accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(r2)     // Catch: java.lang.Throwable -> L4c
            int r2 = o.accesssetReusableGraphicsLayerScopep.RemoteActionCompatParcelizer(r11)     // Catch: java.lang.Throwable -> L4c
            if (r1 != r2) goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L43:
            r10.read = r11     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            androidx.window.sidecar.SidecarInterface$SidecarCallback r0 = r10.write
            r0.onDeviceStateChanged(r11)
            return
        L4c:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public DistinctElementSidecarCallback(getTranslationY gettranslationy, SidecarInterface.SidecarCallback sidecarCallback) {
        this.serializer = gettranslationy;
        this.write = sidecarCallback;
    }
}
