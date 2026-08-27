package io.sentry.protocol;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaDescriptionCompat implements IBrazeActionStep {
    public static MediaBrowserCompatMediaItem RemoteActionCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        ArrayList arrayList = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (strPlaybackStateCompat.equals("values")) {
                arrayList = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(2));
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem(arrayList);
        mediaBrowserCompatMediaItem.write = concurrentHashMap;
        getsecondarg.serializer();
        return mediaBrowserCompatMediaItem;
    }
}
