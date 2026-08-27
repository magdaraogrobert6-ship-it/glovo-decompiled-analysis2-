package com.mapbox.navigation.voice.api;

import android.content.Context;
import android.os.Trace;
import android.speech.tts.TextToSpeech;
import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import io.sentry.util.UrlUtils;
import java.lang.reflect.Method;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.onBackInvokedlambda0;
import o.prepareForActivityTransitionCarryover;
import o.releaseFocus;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceInstructionsTextPlayer {
    public MapboxNavigation$$ExternalSyntheticLambda4 clientCallback;
    public SpeechAnnouncement currentPlay;
    public boolean isLanguageSupported;
    public final JobControl jobControl;
    public final String language;
    public final VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes playerAttributes;
    public final CompletableDeferredImpl textToSpeech;
    public final CompletableDeferredImpl textToSpeechStatus;
    public float volumeLevel;

    public VoiceInstructionsTextPlayer(Context context, String str, VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes) {
        this.language = str;
        this.playerAttributes = voiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
        this.jobControl = new JobControl(onbackinvokedlambda0Serializer, contextScopeRemoteActionCompatParcelizer);
        CompletableDeferredImpl completableDeferredImplWrite = JobKt.write();
        this.textToSpeech = completableDeferredImplWrite;
        this.textToSpeechStatus = JobKt.write();
        this.volumeLevel = 1.0f;
        Method method = releaseFocus.serializer;
        Trace.beginSection("VoiceInstructionsTextPlayer.getTextToSpeech");
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            completableDeferredImplWrite.MediaSessionCompatQueueItem(new TextToSpeech(applicationContext, new TextToSpeech.OnInitListener() { // from class: com.mapbox.navigation.voice.api.VoiceInstructionsTextPlayer$$ExternalSyntheticLambda0
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    this.f$0.textToSpeechStatus.MediaSessionCompatQueueItem(Integer.valueOf(i));
                }
            }));
            Trace.endSection();
            BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 2), 3);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object awaitTextToSpeech$voice_release(ContinuationImpl continuationImpl) {
        VoiceInstructionsTextPlayer$awaitTextToSpeech$1 voiceInstructionsTextPlayer$awaitTextToSpeech$1;
        VoiceInstructionsTextPlayer voiceInstructionsTextPlayer;
        TextToSpeech textToSpeech;
        if (continuationImpl instanceof VoiceInstructionsTextPlayer$awaitTextToSpeech$1) {
            voiceInstructionsTextPlayer$awaitTextToSpeech$1 = (VoiceInstructionsTextPlayer$awaitTextToSpeech$1) continuationImpl;
            int i = voiceInstructionsTextPlayer$awaitTextToSpeech$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                voiceInstructionsTextPlayer$awaitTextToSpeech$1.label = i - Integer.MIN_VALUE;
            } else {
                voiceInstructionsTextPlayer$awaitTextToSpeech$1 = new VoiceInstructionsTextPlayer$awaitTextToSpeech$1(this, continuationImpl);
            }
        } else {
            voiceInstructionsTextPlayer$awaitTextToSpeech$1 = new VoiceInstructionsTextPlayer$awaitTextToSpeech$1(this, continuationImpl);
        }
        Object objAwaitInternal = voiceInstructionsTextPlayer$awaitTextToSpeech$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = voiceInstructionsTextPlayer$awaitTextToSpeech$1.label;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
                CompletableDeferredImpl completableDeferredImpl = this.textToSpeech;
                voiceInstructionsTextPlayer$awaitTextToSpeech$1.L$0 = this;
                voiceInstructionsTextPlayer$awaitTextToSpeech$1.label = 1;
                objAwaitInternal = completableDeferredImpl.awaitInternal(voiceInstructionsTextPlayer$awaitTextToSpeech$1);
                if (objAwaitInternal != coroutineSingletons) {
                    voiceInstructionsTextPlayer = this;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                voiceInstructionsTextPlayer = (VoiceInstructionsTextPlayer) voiceInstructionsTextPlayer$awaitTextToSpeech$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                textToSpeech = (TextToSpeech) voiceInstructionsTextPlayer$awaitTextToSpeech$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            }
            if (((Number) objAwaitInternal).intValue() == 0) {
                return textToSpeech;
            }
            return null;
            TextToSpeech textToSpeech2 = (TextToSpeech) objAwaitInternal;
            CompletableDeferredImpl completableDeferredImpl2 = voiceInstructionsTextPlayer.textToSpeechStatus;
            voiceInstructionsTextPlayer$awaitTextToSpeech$1.L$0 = textToSpeech2;
            voiceInstructionsTextPlayer$awaitTextToSpeech$1.label = 2;
            Object objAwaitInternal2 = completableDeferredImpl2.awaitInternal(voiceInstructionsTextPlayer$awaitTextToSpeech$1);
            if (objAwaitInternal2 != coroutineSingletons) {
                textToSpeech = textToSpeech2;
                objAwaitInternal = objAwaitInternal2;
                if (((Number) objAwaitInternal).intValue() == 0) {
                    return textToSpeech;
                }
                return null;
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }

    public final void donePlaying() {
        SpeechAnnouncement speechAnnouncement = this.currentPlay;
        if (speechAnnouncement != null) {
            this.currentPlay = null;
            MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = this.clientCallback;
            if (mapboxNavigation$$ExternalSyntheticLambda4 != null) {
                mapboxNavigation$$ExternalSyntheticLambda4.onDone(speechAnnouncement);
            }
        }
    }
}
