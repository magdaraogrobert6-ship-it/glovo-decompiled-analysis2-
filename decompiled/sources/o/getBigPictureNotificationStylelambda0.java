package o;

import com.sentiance.sdk.ondevice.api.OnDeviceDebug;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class getBigPictureNotificationStylelambda0 implements Runnable {
    final /* synthetic */ long read;
    final /* synthetic */ OnDeviceDebug write;

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class)).IconCompatParcelizer(InAppMessageFull.read(), this.read, true, 0).iterator();
        while (it.hasNext()) {
            r8lambdamC3IEc_Rvmvul_SD1h7jhUhfLbU transportChangeExternal = this.write.toTransportChangeExternal((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) it.next());
            if (transportChangeExternal != null) {
                arrayList.add(transportChangeExternal);
            }
        }
        readBoolean.serializer(new getInlineImageStylelambda0(this, arrayList));
    }

    public getBigPictureNotificationStylelambda0(OnDeviceDebug onDeviceDebug, long j) {
        this.write = onDeviceDebug;
        this.read = j;
    }
}
