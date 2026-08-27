package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getSessionId extends SdkDataWipeEvent {
    @Override // o.SdkDataWipeEvent
    public final void read(long j, Object obj, Object obj2) {
        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
        onSuccess onsuccess = (onSuccess) r8lambdabnqylh_upxuvzpqwd9sltrjrla.MediaMetadataCompat(j, obj);
        onSuccess onsuccess2 = (onSuccess) r8lambdabnqylh_upxuvzpqwd9sltrjrla.MediaMetadataCompat(j, obj2);
        int size = onsuccess.size();
        int size2 = onsuccess2.size();
        if (size > 0 && size2 > 0) {
            if (!((InAppMessageEvent) onsuccess).read) {
                onsuccess = onsuccess.read(size2 + size);
            }
            onsuccess.addAll(onsuccess2);
        }
        if (size > 0) {
            onsuccess2 = onsuccess;
        }
        SimpleValueCallback.serializer(j, obj, onsuccess2);
    }

    @Override // o.SdkDataWipeEvent
    public final List write(long j, Object obj) {
        onSuccess onsuccess = (onSuccess) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj);
        if (((InAppMessageEvent) onsuccess).read) {
            return onsuccess;
        }
        int size = onsuccess.size();
        onSuccess onsuccess2 = onsuccess.read(size == 0 ? 10 : size * 2);
        SimpleValueCallback.serializer(j, obj, onsuccess2);
        return onsuccess2;
    }

    @Override // o.SdkDataWipeEvent
    public final void IconCompatParcelizer(long j, Object obj) {
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) ((onSuccess) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj));
        if (inAppMessageEvent.read) {
            inAppMessageEvent.read = false;
        }
    }
}
