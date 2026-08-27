package com.roadrunner.logger.api.data;

import androidx.annotation.Keep;
import java.util.Map;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface AppInfoChangedListener {
    void onInfoUpdated(executeAsOneOrNull executeasoneornull);

    void updateProperties(Map<String, ? extends Object> map);

    void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1);

    void updateUserProperty(String str, String str2);
}
