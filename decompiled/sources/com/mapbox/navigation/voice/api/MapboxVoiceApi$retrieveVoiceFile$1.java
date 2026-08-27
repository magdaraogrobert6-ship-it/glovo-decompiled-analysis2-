package com.mapbox.navigation.voice.api;

import com.huawei.agconnect.config.impl.m;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxVoiceApi$retrieveVoiceFile$1 extends ContinuationImpl {
    public m L$0;
    public VoiceInstructions L$1;
    public m L$2;
    public m L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxVoiceApi$retrieveVoiceFile$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveVoiceFile(null, this);
    }
}
