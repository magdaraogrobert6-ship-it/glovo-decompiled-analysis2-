package o;

import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class createLayerdefault {
    public static final ReflectionUtils read;
    public static final ReflectionUtils serializer;
    public static final ReflectionUtils write;
    public final isTreeConsistent IconCompatParcelizer;
    public final AbstractComposeViewExternalSyntheticLambda0 MediaDescriptionCompat;
    public final AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    static {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        serializer = new ReflectionUtils("x-firebase-client-log-type", r8lambdakctilwmporjfcawe8asdqv1ks);
        write = new ReflectionUtils("x-firebase-client", r8lambdakctilwmporjfcawe8asdqv1ks);
        read = new ReflectionUtils("x-firebase-gmpid", r8lambdakctilwmporjfcawe8asdqv1ks);
    }

    public createLayerdefault(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1, isTreeConsistent istreeconsistent) {
        this.MediaDescriptionCompat = abstractComposeViewExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = abstractComposeViewExternalSyntheticLambda1;
        this.IconCompatParcelizer = istreeconsistent;
    }
}
