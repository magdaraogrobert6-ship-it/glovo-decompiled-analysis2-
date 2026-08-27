package com.mapbox.common.crypto;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.DataRef;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class KeyReaderImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String keyName(SignatureAlgorithm signatureAlgorithm) {
        if (WhenMappings.$EnumSwitchMapping$0[signatureAlgorithm.ordinal()] == 1) {
            return "EC";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            try {
                iArr[SignatureAlgorithm.ECDSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] asByteArray(DataRef dataRef) {
        ByteBuffer buffer = dataRef.getBuffer();
        buffer.getClass();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return bArr;
    }
}
