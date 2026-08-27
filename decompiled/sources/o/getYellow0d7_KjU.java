package o;

import java.security.GeneralSecurityException;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public enum getYellow0d7_KjU {
    AES256_SIV("AES256_SIV");

    private final String mDeterministicAeadKeyTemplateName;

    public acceptHits getKeyTemplate() throws GeneralSecurityException {
        return DelayKt.MediaSessionCompatResultReceiverWrapper(this.mDeterministicAeadKeyTemplateName);
    }

    getYellow0d7_KjU(String str) {
        this.mDeterministicAeadKeyTemplateName = str;
    }
}
