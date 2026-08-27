package o;

import com.sentiance.sdk.services.ServiceStartResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaXcYWiJFQ022HfKxRmj6WpvsH7TA {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[ServiceStartResult.values().length];
        serializer = iArr;
        try {
            iArr[ServiceStartResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[ServiceStartResult.NOT_PERMITTED_BY_OS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[ServiceStartResult.FAILURE_REASON_OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
