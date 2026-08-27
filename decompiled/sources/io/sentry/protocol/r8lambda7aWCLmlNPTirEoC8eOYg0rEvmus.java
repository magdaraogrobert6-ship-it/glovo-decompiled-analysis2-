package io.sentry.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus implements IBrazeActionStep {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    public static ResultReceiver read(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        ResultReceiver resultReceiver = new ResultReceiver();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            switch (strPlaybackStateCompat) {
                case "status_code":
                    b = 0;
                    break;
                case "data":
                    b = 1;
                    break;
                case "headers":
                    b = 2;
                    break;
                case "cookies":
                    b = 3;
                    break;
                case "body_size":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                resultReceiver.serializer = getsecondarg.PlaybackStateCompatCustomAction();
            } else if (b == 1) {
                resultReceiver.RemoteActionCompatParcelizer = getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            } else if (b == 2) {
                Map map = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                if (map != null) {
                    resultReceiver.read = Options.Companion.RemoteActionCompatParcelizer(map);
                }
            } else if (b == 3) {
                resultReceiver.write = getsecondarg.ComponentActivity();
            } else if (b != 4) {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
            } else {
                resultReceiver.IconCompatParcelizer = getsecondarg.ParcelableVolumeInfo();
            }
        }
        resultReceiver.MediaDescriptionCompat = concurrentHashMap;
        getsecondarg.serializer();
        return resultReceiver;
    }
}
