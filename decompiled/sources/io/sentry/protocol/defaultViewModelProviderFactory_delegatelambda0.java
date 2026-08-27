package io.sentry.protocol;

import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class defaultViewModelProviderFactory_delegatelambda0 implements IBrazeActionStep {
    public static addObserverForBackInvokerlambda0 read(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        String strComponentActivity = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (strPlaybackStateCompat.equals("source")) {
                strComponentActivity = getsecondarg.ComponentActivity();
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
            }
        }
        addObserverForBackInvokerlambda0 addobserverforbackinvokerlambda0 = new addObserverForBackInvokerlambda0(strComponentActivity);
        addobserverforbackinvokerlambda0.RemoteActionCompatParcelizer = concurrentHashMap;
        getsecondarg.serializer();
        return addobserverforbackinvokerlambda0;
    }
}
