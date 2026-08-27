package com.data.extensions;

import com.data.error.ApiException;
import kotlinx.collections.immutable.ImmutableList$SubList;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ThrowableExtensionsKt {
    public static ImmutableList$SubList RemoteActionCompatParcelizer(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, int i, int i2) {
        return new ImmutableList$SubList(r8lambdaiidsddyirtymdul5lt6pmt2zysq, i, i2);
    }

    public static final String IconCompatParcelizer(Throwable th) {
        th.getClass();
        String message = th.getMessage();
        return message == null ? "" : message;
    }

    public static final boolean RemoteActionCompatParcelizer(Throwable th) {
        int iRemoteActionCompatParcelizer;
        int i;
        if (!(th instanceof HttpException) || 400 > (i = ((HttpException) th).read) || i >= 500) {
            return (th instanceof ApiException) && 400 <= (iRemoteActionCompatParcelizer = ((ApiException) th).RemoteActionCompatParcelizer()) && iRemoteActionCompatParcelizer < 500;
        }
        return true;
    }
}
