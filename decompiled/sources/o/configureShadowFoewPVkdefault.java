package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class configureShadowFoewPVkdefault {
    public int write;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatQueueItem = DropShadowPainter.serializer;
    public final Object RemoteActionCompatParcelizer = new Object();
    public final Object read = new Object();
    public final LinkedHashMap RatingCompat = new LinkedHashMap();
    public long MediaDescriptionCompat = Long.MIN_VALUE;
    public long IconCompatParcelizer = Long.MIN_VALUE;
    public final createOuterShadowBitmapCqks5Fs MediaBrowserCompatMediaItem = new createOuterShadowBitmapCqks5Fs();
    public final createOuterShadowBitmapCqks5Fs serializer = new createOuterShadowBitmapCqks5Fs();

    public final buildShadow_SMYjrA write(long j, String str) {
        Integer numRemoteActionCompatParcelizer;
        long j2 = this.MediaDescriptionCompat;
        LinkedHashMap linkedHashMap = this.RatingCompat;
        if (j2 == Long.MIN_VALUE) {
            this.MediaDescriptionCompat = j;
        } else if (j - j2 >= 1000) {
            this.MediaDescriptionCompat = j;
            linkedHashMap.clear();
        }
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        linkedHashMap.put(str, Integer.valueOf(iIntValue));
        if (iIntValue == 51 && (numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, j)) != null) {
            return new buildShadow_SMYjrA(str, iIntValue, numRemoteActionCompatParcelizer.intValue());
        }
        return null;
    }

    public final Integer RemoteActionCompatParcelizer(createOuterShadowBitmapCqks5Fs createoutershadowbitmapcqks5fs, long j) {
        long j2 = createoutershadowbitmapcqks5fs.RemoteActionCompatParcelizer;
        if (j2 != -1 && j - j2 < 300000) {
            createoutershadowbitmapcqks5fs.read++;
            return null;
        }
        int i = createoutershadowbitmapcqks5fs.read;
        createoutershadowbitmapcqks5fs.read = 0;
        createoutershadowbitmapcqks5fs.RemoteActionCompatParcelizer = j;
        return Integer.valueOf(i);
    }
}
