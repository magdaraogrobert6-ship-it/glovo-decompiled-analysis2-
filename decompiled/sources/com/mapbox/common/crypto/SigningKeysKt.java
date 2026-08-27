package com.mapbox.common.crypto;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.DataRef;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.interfaces.ECKey;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SigningKeysKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SignatureAlgorithm getSignatureAlgorithm(String str) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "EC"}, iWrite3)).booleanValue()) {
            return SignatureAlgorithm.ECDSA;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unsupported algorithm: ", str));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSignatureName(SignatureAlgorithm signatureAlgorithm, Key key) {
        if (WhenMappings.$EnumSwitchMapping$0[signatureAlgorithm.ordinal()] != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        key.getClass();
        int fieldSize = ((ECKey) key).getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return "SHA256withECDSA";
        }
        if (fieldSize == 384) {
            return "SHA384withECDSA";
        }
        if (fieldSize == 521) {
            return "SHA512withECDSA";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(fieldSize, "Unsupported ECDSA key size: "));
        return null;
    }

    /* JADX INFO: loaded from: classes4.dex */
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
