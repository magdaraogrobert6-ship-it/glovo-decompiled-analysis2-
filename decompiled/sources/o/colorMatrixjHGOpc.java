package o;

import java.security.GeneralSecurityException;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public enum colorMatrixjHGOpc {
    AES256_GCM("AES256_GCM");

    private final String mAeadKeyTemplateName;

    public acceptHits getKeyTemplate() throws GeneralSecurityException {
        return DelayKt.MediaSessionCompatResultReceiverWrapper(this.mAeadKeyTemplateName);
    }

    colorMatrixjHGOpc(String str) {
        this.mAeadKeyTemplateName = str;
    }
}
