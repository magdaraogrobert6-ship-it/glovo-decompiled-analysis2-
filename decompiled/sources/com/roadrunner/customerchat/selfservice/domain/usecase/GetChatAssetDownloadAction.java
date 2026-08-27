package com.roadrunner.customerchat.selfservice.domain.usecase;

import coil3.ImageLoader$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class GetChatAssetDownloadAction {
    private static int serializer = 1;
    private static int write;
    public final ImageLoader$Builder IconCompatParcelizer;
    public final ProtobufEncoder RemoteActionCompatParcelizer;

    public GetChatAssetDownloadAction(ProtobufEncoder protobufEncoder, ImageLoader$Builder imageLoader$Builder) {
        protobufEncoder.getClass();
        imageLoader$Builder.getClass();
        this.RemoteActionCompatParcelizer = protobufEncoder;
        this.IconCompatParcelizer = imageLoader$Builder;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[PHI: r4 r6
  0x0031: PHI (r4v12 o.requireLineIndexInRange) = (r4v11 o.requireLineIndexInRange), (r4v14 o.requireLineIndexInRange) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r6v8 int) = (r6v7 int), (r6v10 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r2 == r4) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadAction.invoke(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
