package androidx.datastore.preferences.protobuf;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(af$$ExternalSyntheticOutline0.m(i, "Unpaired surrogate at index ", i2, " of "));
    }
}
