package com.mapbox.navigation.voice.api;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceInstructionsTextPlayer$awaitTextToSpeech$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VoiceInstructionsTextPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInstructionsTextPlayer$awaitTextToSpeech$1(VoiceInstructionsTextPlayer voiceInstructionsTextPlayer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = voiceInstructionsTextPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitTextToSpeech$voice_release(this);
    }
}
