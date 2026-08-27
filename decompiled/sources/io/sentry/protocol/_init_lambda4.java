package io.sentry.protocol;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _init_lambda4 implements IBrazeActionStep {
    public static _init_lambda1 read(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        _init_lambda1 _init_lambda1Var = new _init_lambda1();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (strPlaybackStateCompat.equals("active_profiles")) {
                List list = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                if (list != null) {
                    String[] strArr = new String[list.size()];
                    list.toArray(strArr);
                    _init_lambda1Var.serializer = strArr;
                }
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
            }
        }
        _init_lambda1Var.IconCompatParcelizer = concurrentHashMap;
        getsecondarg.serializer();
        return _init_lambda1Var;
    }
}
