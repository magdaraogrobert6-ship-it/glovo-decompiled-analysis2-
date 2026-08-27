package com.sentiance.sdk.usercontext.api;

import com.sentiance.sdk.DontObfuscate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface UserContextUpdateListener {
    void onUserContextUpdated(List<UserContextUpdateCriteria> list, UserContext userContext);
}
