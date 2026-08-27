package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException serializer(zzw zzwVar) {
        String strConcat;
        if (!zzwVar.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = zzwVar.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (zzwVar.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(zzwVar.getResult()));
        } else {
            strConcat = zzwVar.write ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
    }

    public DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }
}
