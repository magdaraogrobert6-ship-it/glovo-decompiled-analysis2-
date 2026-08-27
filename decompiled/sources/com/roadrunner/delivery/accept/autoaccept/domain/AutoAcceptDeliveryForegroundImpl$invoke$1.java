package com.roadrunner.delivery.accept.autoaccept.domain;

import androidx.compose.ui.graphics.Fields;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.copyNs73l9sdefault;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptDeliveryForegroundImpl$invoke$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public copyNs73l9sdefault IconCompatParcelizer;
    public final /* synthetic */ ProtobufEncoder MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptDeliveryForegroundImpl$invoke$1(ProtobufEncoder protobufEncoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = protobufEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            this.MediaMetadataCompat.m4474invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4474invokegIAlus = this.MediaMetadataCompat.m4474invokegIAlus(null, this);
        if (objM4474invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4474invokegIAlus);
        }
        int i3 = MediaDescriptionCompat + 77;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM4474invokegIAlus;
    }
}
