package com.mapbox.common.crypto;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
public interface PublicKey {
    SignatureAlgorithm getAlgorithm();

    Expected<String, Boolean> verify(Signature signature, DataRef dataRef);
}
