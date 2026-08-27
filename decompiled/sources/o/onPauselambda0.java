package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class onPauselambda0 {
    private final HashMap IconCompatParcelizer = new HashMap();
    private final onResumelambda2 read = new onResumelambda2();
    private final double serializer;

    public onPauselambda0(int i) {
        this.serializer = 1000.0d / ((double) i);
    }

    public final void read(onResumelambda2 onresumelambda2) {
        byte bSerializer = onresumelambda2.serializer();
        HashMap map = this.IconCompatParcelizer;
        onResumelambda2 onresumelambda3 = (onResumelambda2) map.get(Byte.valueOf(bSerializer));
        if (onresumelambda3 == null) {
            onresumelambda3 = new onResumelambda2(bSerializer);
            map.put(Byte.valueOf(bSerializer), onresumelambda3);
        }
        onResumelambda2 onresumelambda4 = this.read;
        onresumelambda4.write();
        onresumelambda4.RemoteActionCompatParcelizer(onresumelambda2.serializer());
        for (int i = 0; i < onresumelambda2.MediaBrowserCompatMediaItem(); i++) {
            if (onresumelambda3.MediaSessionCompatQueueItem()) {
                serializer(onresumelambda3, onresumelambda2, i);
            } else {
                long j = onresumelambda2.RemoteActionCompatParcelizer().read(i);
                if (j - onresumelambda3.RemoteActionCompatParcelizer().read(0) >= this.serializer) {
                    if (j - onresumelambda3.RemoteActionCompatParcelizer().read(onresumelambda3.MediaBrowserCompatMediaItem() - 1) < 1000) {
                        onresumelambda4.RemoteActionCompatParcelizer().serializer(onresumelambda3.RemoteActionCompatParcelizer().write());
                        onresumelambda4.read().write(onresumelambda3.read().read());
                        onresumelambda4.IconCompatParcelizer().write(onresumelambda3.IconCompatParcelizer().read());
                        onresumelambda4.MediaMetadataCompat().write(onresumelambda3.MediaMetadataCompat().read());
                    }
                    onresumelambda3.write();
                }
                serializer(onresumelambda3, onresumelambda2, i);
            }
        }
        onresumelambda2.write();
        onresumelambda2.read(onresumelambda4);
    }

    private static void serializer(onResumelambda2 onresumelambda2, onResumelambda2 onresumelambda3, int i) {
        onresumelambda2.RemoteActionCompatParcelizer().serializer(onresumelambda3.RemoteActionCompatParcelizer().read(i));
        onresumelambda2.read().write(onresumelambda3.read().read(i));
        onresumelambda2.IconCompatParcelizer().write(onresumelambda3.IconCompatParcelizer().read(i));
        onresumelambda2.MediaMetadataCompat().write(onresumelambda3.MediaMetadataCompat().read(i));
    }
}
