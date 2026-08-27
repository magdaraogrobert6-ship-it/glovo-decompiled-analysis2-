package com.mapbox.navigation.voice.api;

import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSpeechApi$retrieveVoiceFile$1 extends ContinuationImpl {
    public x L$0;
    public VoiceInstructions L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSpeechApi$retrieveVoiceFile$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return x.access$retrieveVoiceFile(this.this$0, null, this);
    }
}
