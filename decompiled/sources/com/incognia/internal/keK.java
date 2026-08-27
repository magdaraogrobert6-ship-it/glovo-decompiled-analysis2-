package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class keK {
    public static FQL BGx(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        try {
            for (Object obj : (List) FQL.mbG.MediaSessionCompatResultReceiverWrapper()) {
                Object[] objArr = {((FQL) obj).BGx.toLowerCase(Locale.US), lowerCase};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return (FQL) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid value: ".concat(str));
            return null;
        }
    }
}
