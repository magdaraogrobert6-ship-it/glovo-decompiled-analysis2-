package io.socket.client;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.camera.core.LegacySessionConfig;
import com.huawei.location.Vw$E5;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import io.sentry.android.core.addObserverForBackInvokerlambda0;
import io.sentry.transport.PlaybackStateCompat;
import io.sentry.transport.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
import java.io.IOException;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import o.accessgetDismissSubscriberp;
import o.getSUPPRESSannotations;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74;

/* JADX INFO: loaded from: classes4.dex */
public final class Manager$7 extends TimerTask {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ Manager$7(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        int i2 = 0;
        if (i == 0) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(i2, this));
            return;
        }
        if (i == 1) {
            x xVar = (x) ((LegacySessionConfig) obj).write;
            xVar.getClass();
            AudioFocusOwner audioFocusOwner = (AudioFocusOwner) xVar.IconCompatParcelizer;
            VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes = (VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) xVar.RemoteActionCompatParcelizer;
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
            audioFocusOwner.getClass();
            new MapboxNavigation$notification$1$1(voiceInstructionsPlayerAttributes$OreoAndLaterAttributes, 9, audioFocusOwner).invoke(builder);
            ((AudioManager) xVar.read).abandonAudioFocusRequest(builder.build());
            return;
        }
        if (i == 2) {
            ((getSUPPRESSannotations) obj).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
            return;
        }
        if (i == 3) {
            addObserverForBackInvokerlambda0 addobserverforbackinvokerlambda0 = (addObserverForBackInvokerlambda0) obj;
            accessgetDismissSubscriberp accessgetdismisssubscriberp = addobserverforbackinvokerlambda0.write;
            if (addobserverforbackinvokerlambda0.read) {
                accessgetdismisssubscriberp.serializer();
            }
            accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getReplayController().PlaybackStateCompatCustomAction();
            accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getContinuousProfiler().write(false);
            return;
        }
        if (i != 4) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read((Vw$E5) obj);
            return;
        }
        PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
        Iterator it = ((CopyOnWriteArrayList) playbackStateCompat.serializer).iterator();
        while (it.hasNext()) {
            ((r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) it.next()).serializer(playbackStateCompat);
        }
    }
}
