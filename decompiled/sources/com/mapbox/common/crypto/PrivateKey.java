package com.mapbox.common.crypto;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
public interface PrivateKey {
    SignatureAlgorithm getAlgorithm();

    Expected<String, Signature> sign(DataRef dataRef);
}
