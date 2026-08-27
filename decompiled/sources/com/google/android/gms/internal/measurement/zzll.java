package com.google.android.gms.internal.measurement;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzll extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Pos: ", ", limit: ");
        sbM.append(j2);
        sbM.append(", len: ");
        sbM.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM.toString()), indexOutOfBoundsException);
    }

    public zzll(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
