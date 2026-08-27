package o;

import com.sentiance.sdk.services.ServiceType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class BannersDataStoreProviderCompanion {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[ServiceType.values().length];
        serializer = iArr;
        try {
            iArr[ServiceType.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[ServiceType.FOREGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
