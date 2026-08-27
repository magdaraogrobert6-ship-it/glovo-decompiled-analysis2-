package com.sentiance.sdk.usercontext.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public interface IUserContextApi {
    void addProvisionalAwareUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener);

    void addProvisionalAwareUserContextUpdateListenerWithCriteria(List<UserContextUpdateCriteria> list, UserContextUpdateListener userContextUpdateListener);

    void addUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener);

    void addUserContextUpdateListener(List<UserContextUpdateCriteria> list, UserContextUpdateListener userContextUpdateListener);

    void removeUserContextUpdateListener(UserContextUpdateListener userContextUpdateListener);

    PendingOperation<UserContext, RequestUserContextError> requestUserContext();

    PendingOperation<UserContext, RequestUserContextError> requestUserContextIncludingProvisionalEvents();
}
