package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
final class refreshBannersIfAppropriatelambda1 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ prefetchBitmapsIfNewlyReceivedStoryPushlambda10 read;

    public refreshBannersIfAppropriatelambda1(prefetchBitmapsIfNewlyReceivedStoryPushlambda10 prefetchbitmapsifnewlyreceivedstorypushlambda10) {
        this.read = prefetchbitmapsifnewlyreceivedstorypushlambda10;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        prefetchBitmapsIfNewlyReceivedStoryPushlambda10 prefetchbitmapsifnewlyreceivedstorypushlambda10 = this.read;
        return new Pair(prefetchbitmapsifnewlyreceivedstorypushlambda10.write.write(prefetchbitmapsifnewlyreceivedstorypushlambda10.RemoteActionCompatParcelizer, prefetchbitmapsifnewlyreceivedstorypushlambda10.read, prefetchbitmapsifnewlyreceivedstorypushlambda10.serializer, prefetchbitmapsifnewlyreceivedstorypushlambda10.IconCompatParcelizer), null);
    }
}
