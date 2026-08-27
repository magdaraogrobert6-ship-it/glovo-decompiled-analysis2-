package androidx.camera.core;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.collection.ObjectList$toString$1;
import androidx.compose.animation.core.VectorizedFloatDecaySpec;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$WhenMappings;
import com.mapbox.navigation.voice.api.PlayCallback;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.api.VoiceInstructionsTextPlayer;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.mapbox.navigation.voice.model.SpeechVolume;
import com.mapbox.navigation.voice.options.VoiceInstructionsPlayerOptions;
import io.socket.client.Manager$7;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import o.AuthenticatorUtils;
import o.Camera2DeviceSurfaceManager;
import o.CameraAccessExceptionCompat;
import o.CameraIdUtil;
import o.CameraManagerCompatApi30Impl;
import o.DrawableTransformation;
import o.FingerprintDialogFragment;
import o.ImageUtilCodecFailedException;
import o.ItemTouchHelperAdapter;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.ShortNewsContentCardView;
import o.SmallDisplaySizeQuirk;
import o.TorchControl;
import o.ZoomControl;
import o.accessgetDarkencp;
import o.accessgetDifferencecp;
import o.accessgetDstcp;
import o.accessgetHardlightcp;
import o.accessgetHuecp;
import o.accessgetInstancedelegatecp;
import o.getActiveFocusTargetNode;
import o.getFeatureGroupUseCaseType;
import o.getPositionInRoot;
import o.getTrackDrawable;
import o.getWrapper;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.mf;
import o.onContentCardDismissed;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.renderUrlIntoViewlambda1;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setNavigationOnClickListener;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySessionConfig {
    public final Object IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public boolean serializer;
    public final Object write;

    public boolean IconCompatParcelizer() {
        byte[] bArr = (byte[]) this.RemoteActionCompatParcelizer;
        if (bArr != null) {
            if (!this.serializer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        File file = (File) this.IconCompatParcelizer;
                        FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
                        try {
                            FileChannel channel = fileOutputStreamWrite.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[Fields.RotationY];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i <= 0) {
                                                    read(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStreamWrite.close();
                                                    byteArrayInputStream.close();
                                                    this.RemoteActionCompatParcelizer = null;
                                                    this.read = null;
                                                    return true;
                                                }
                                                fileOutputStreamWrite.write(bArr2, 0, i);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (fileLockTryLock != null) {
                                            try {
                                                fileLockTryLock.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } catch (Throwable th3) {
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                fileOutputStreamWrite.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    this.RemoteActionCompatParcelizer = null;
                    this.read = null;
                    throw th9;
                }
            } catch (FileNotFoundException e) {
                read(6, e);
                this.RemoteActionCompatParcelizer = null;
                this.read = null;
                return false;
            } catch (IOException e2) {
                read(7, e2);
                this.RemoteActionCompatParcelizer = null;
                this.read = null;
                return false;
            }
        }
        return false;
    }

    public boolean RemoteActionCompatParcelizer() {
        File file = (File) this.IconCompatParcelizer;
        if (((byte[]) this.RatingCompat) == null) {
            read(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    read(4, null);
                    return false;
                }
            } catch (IOException unused) {
                read(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            read(4, null);
            return false;
        }
        this.serializer = true;
        return true;
    }

    public void abandonFocus(boolean z) throws InterruptedException, IOException {
        Timer timer = (Timer) this.read;
        if (timer != null) {
            timer.cancel();
        }
        if (!z) {
            ((MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0) this.MediaMetadataCompat).getClass();
            Timer timer2 = new Timer();
            ((VoiceInstructionsPlayerOptions) this.MediaDescriptionCompat).getClass();
            timer2.schedule(new Manager$7(1, this), 0L);
            this.read = timer2;
            return;
        }
        x xVar = (x) this.write;
        xVar.getClass();
        AudioFocusOwner audioFocusOwner = (AudioFocusOwner) xVar.IconCompatParcelizer;
        VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes = (VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) xVar.RemoteActionCompatParcelizer;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
        audioFocusOwner.getClass();
        new MapboxNavigation$notification$1$1(voiceInstructionsPlayerAttributes$OreoAndLaterAttributes, 9, audioFocusOwner).invoke(builder);
        ((AudioManager) xVar.read).abandonAudioFocusRequest(builder.build());
    }

    public void clear() throws InterruptedException, IOException {
        ((ConcurrentLinkedQueue) this.RatingCompat).clear();
        abandonFocus(true);
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = (VectorizedFloatDecaySpec) this.IconCompatParcelizer;
        MediaPlayer mediaPlayer = (MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        vectorizedFloatDecaySpec.IconCompatParcelizer = null;
        vectorizedFloatDecaySpec.RemoteActionCompatParcelizer = null;
        VoiceInstructionsTextPlayer voiceInstructionsTextPlayer = (VoiceInstructionsTextPlayer) this.MediaSessionCompatQueueItem;
        BuildersKt.RemoteActionCompatParcelizer(voiceInstructionsTextPlayer.jobControl.scope, null, null, new DiskLruCache$launchCleanup$1(voiceInstructionsTextPlayer, null, 11), 3);
        voiceInstructionsTextPlayer.currentPlay = null;
    }

    public void play() throws InterruptedException, IOException {
        PlayCallback playCallback = (PlayCallback) ((ConcurrentLinkedQueue) this.RatingCompat).peek();
        if (playCallback == null) {
            return;
        }
        SpeechAnnouncement speechAnnouncement = playCallback.announcement;
        LoggingLevel loggingLevelLogLevel = LoggerProviderKt.logLevel();
        LoggingLevel loggingLevel = LoggingLevel.DEBUG;
        if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel, loggingLevel)) {
            LoggerProviderKt.logD("Peeked from the playCallbackQueue " + speechAnnouncement, "MapboxVoiceInstructionsPlayer");
        }
        AudioFocusOwner audioFocusOwner = speechAnnouncement.file == null ? AudioFocusOwner.TextToSpeech : AudioFocusOwner.MediaPlayer;
        Timer timer = (Timer) this.read;
        if (timer != null) {
            timer.cancel();
        }
        x xVar = (x) this.write;
        xVar.getClass();
        audioFocusOwner.getClass();
        xVar.IconCompatParcelizer = audioFocusOwner;
        VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes = (VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) xVar.RemoteActionCompatParcelizer;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
        new MapboxNavigation$notification$1$1(voiceInstructionsPlayerAttributes$OreoAndLaterAttributes, 9, audioFocusOwner).invoke(builder);
        int iRequestAudioFocus = ((AudioManager) xVar.read).requestAudioFocus(builder.build());
        boolean z = iRequestAudioFocus == 1 || iRequestAudioFocus == 2;
        audioFocusOwner.getClass();
        MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = (MapboxNavigation$$ExternalSyntheticLambda4) this.RemoteActionCompatParcelizer;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
            LoggerProviderKt.logD("Request focus callback: isGranted=" + z + ", owner=" + audioFocusOwner, "MapboxVoiceInstructionsPlayer");
        }
        if (!z) {
            mapboxNavigation$$ExternalSyntheticLambda4.onDone(speechAnnouncement);
            return;
        }
        int i = MapboxVoiceInstructionsPlayer$WhenMappings.$EnumSwitchMapping$0[audioFocusOwner.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            VoiceInstructionsTextPlayer voiceInstructionsTextPlayer = (VoiceInstructionsTextPlayer) this.MediaSessionCompatQueueItem;
            voiceInstructionsTextPlayer.getClass();
            mapboxNavigation$$ExternalSyntheticLambda4.getClass();
            voiceInstructionsTextPlayer.clientCallback = mapboxNavigation$$ExternalSyntheticLambda4;
            if (voiceInstructionsTextPlayer.currentPlay != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Only one announcement can be played at a time.");
                return;
            }
            voiceInstructionsTextPlayer.currentPlay = speechAnnouncement;
            String str = speechAnnouncement.announcement;
            if (!voiceInstructionsTextPlayer.isLanguageSupported || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Language is not supported or announcement from state is blank", "VoiceInstructionsTextPlayer");
                }
                voiceInstructionsTextPlayer.donePlaying();
                return;
            } else {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                    LoggerProviderKt.logD("play: ".concat(str), "VoiceInstructionsTextPlayer");
                }
                BuildersKt.RemoteActionCompatParcelizer(voiceInstructionsTextPlayer.jobControl.scope, null, null, new PerseusLogger$e$1((Object) voiceInstructionsTextPlayer, str, (ShortNewsContentCardView) null, 12), 3);
                return;
            }
        }
        final VectorizedFloatDecaySpec vectorizedFloatDecaySpec = (VectorizedFloatDecaySpec) this.IconCompatParcelizer;
        vectorizedFloatDecaySpec.getClass();
        mapboxNavigation$$ExternalSyntheticLambda4.getClass();
        vectorizedFloatDecaySpec.read = mapboxNavigation$$ExternalSyntheticLambda4;
        if (((SpeechAnnouncement) vectorizedFloatDecaySpec.RemoteActionCompatParcelizer) != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Only one announcement can be played at a time.");
            return;
        }
        vectorizedFloatDecaySpec.RemoteActionCompatParcelizer = speechAnnouncement;
        File file = speechAnnouncement.file;
        if (file == null || !file.canRead()) {
            LoggerProviderKt.logE("Announcement file from state can't be null and needs to be accessible", "VoiceInstructionsFilePlayer");
            vectorizedFloatDecaySpec.donePlaying((MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer);
            return;
        }
        try {
            FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(file, new FileInputStream(file));
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(fileInputStreamWrite.getFD());
                new ObjectList$toString$1(27, (VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) vectorizedFloatDecaySpec.write).invoke(mediaPlayer);
                mediaPlayer.prepareAsync();
                vectorizedFloatDecaySpec.IconCompatParcelizer = mediaPlayer;
                float f = vectorizedFloatDecaySpec.serializer;
                mediaPlayer.setVolume(f, f);
                MediaPlayer mediaPlayer2 = (MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnErrorListener(new VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0());
                    mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda1
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer3) {
                            mediaPlayer3.start();
                        }
                    });
                    mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda2
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer3) {
                            VectorizedFloatDecaySpec vectorizedFloatDecaySpec2 = vectorizedFloatDecaySpec;
                            vectorizedFloatDecaySpec2.getClass();
                            vectorizedFloatDecaySpec2.donePlaying(mediaPlayer3);
                        }
                    });
                }
                fileInputStreamWrite.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamWrite, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            vectorizedFloatDecaySpec.donePlaying((MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer);
        } catch (IOException unused2) {
            vectorizedFloatDecaySpec.donePlaying((MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer);
        }
    }

    public LegacySessionConfig read() {
        FileInputStream fileInputStreamWrite;
        accessgetDstcp[] accessgetdstcpArrSerializer;
        AssetManager assetManager = (AssetManager) this.MediaDescriptionCompat;
        accessgetDarkencp accessgetdarkencp = (accessgetDarkencp) this.MediaMetadataCompat;
        LegacySessionConfig legacySessionConfig = null;
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return null;
        }
        byte[] bArr = (byte[]) this.RatingCompat;
        if (bArr != null) {
            try {
                fileInputStreamWrite = write(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                accessgetdarkencp.IconCompatParcelizer(6, e);
                fileInputStreamWrite = null;
            } catch (IOException e2) {
                accessgetdarkencp.IconCompatParcelizer(7, e2);
                fileInputStreamWrite = null;
            }
            try {
                if (fileInputStreamWrite != null) {
                    try {
                        if (!Arrays.equals(accessgetHuecp.RemoteActionCompatParcelizer, accessgetDifferencecp.RemoteActionCompatParcelizer(4, fileInputStreamWrite))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        accessgetdstcpArrSerializer = accessgetHuecp.serializer(fileInputStreamWrite, accessgetDifferencecp.RemoteActionCompatParcelizer(4, fileInputStreamWrite), (String) this.MediaSessionCompatQueueItem);
                        try {
                            fileInputStreamWrite.close();
                        } catch (IOException e3) {
                            accessgetdarkencp.IconCompatParcelizer(7, e3);
                        }
                        this.read = accessgetdstcpArrSerializer;
                    } catch (IOException e4) {
                        accessgetdarkencp.IconCompatParcelizer(7, e4);
                        try {
                            fileInputStreamWrite.close();
                        } catch (IOException e5) {
                            accessgetdarkencp.IconCompatParcelizer(7, e5);
                        }
                        accessgetdstcpArrSerializer = null;
                    } catch (IllegalStateException e6) {
                        accessgetdarkencp.IconCompatParcelizer(8, e6);
                        fileInputStreamWrite.close();
                        accessgetdstcpArrSerializer = null;
                    }
                }
                accessgetDstcp[] accessgetdstcpArr = (accessgetDstcp[]) this.read;
                if (accessgetdstcpArr != null && Build.VERSION.SDK_INT >= 31) {
                    try {
                        FileInputStream fileInputStreamWrite2 = write(assetManager, "dexopt/baseline.profm");
                        if (fileInputStreamWrite2 != null) {
                            try {
                                if (!Arrays.equals(accessgetHuecp.write, accessgetDifferencecp.RemoteActionCompatParcelizer(4, fileInputStreamWrite2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                this.read = accessgetHuecp.read(fileInputStreamWrite2, accessgetDifferencecp.RemoteActionCompatParcelizer(4, fileInputStreamWrite2), bArr, accessgetdstcpArr);
                                fileInputStreamWrite2.close();
                                legacySessionConfig = this;
                            } catch (Throwable th) {
                                try {
                                    fileInputStreamWrite2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (fileInputStreamWrite2 != null) {
                            fileInputStreamWrite2.close();
                        }
                    } catch (FileNotFoundException e7) {
                        accessgetdarkencp.IconCompatParcelizer(9, e7);
                    } catch (IOException e8) {
                        accessgetdarkencp.IconCompatParcelizer(7, e8);
                    } catch (IllegalStateException e9) {
                        this.read = null;
                        accessgetdarkencp.IconCompatParcelizer(8, e9);
                    }
                    if (legacySessionConfig != null) {
                        return legacySessionConfig;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamWrite.close();
                } catch (IOException e10) {
                    accessgetdarkencp.IconCompatParcelizer(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    public void read(int i, Serializable serializable) {
        ((Executor) this.write).execute(new renderUrlIntoViewlambda1(i, 6, this, serializable));
    }

    public void serializer() {
        accessgetDarkencp accessgetdarkencp = (accessgetDarkencp) this.MediaMetadataCompat;
        accessgetDstcp[] accessgetdstcpArr = (accessgetDstcp[]) this.read;
        byte[] bArr = (byte[]) this.RatingCompat;
        if (accessgetdstcpArr == null || bArr == null) {
            return;
        }
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(accessgetHuecp.RemoteActionCompatParcelizer);
                byteArrayOutputStream.write(bArr);
                if (accessgetHuecp.read(byteArrayOutputStream, bArr, accessgetdstcpArr)) {
                    this.RemoteActionCompatParcelizer = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.read = null;
                } else {
                    accessgetdarkencp.IconCompatParcelizer(5, null);
                    this.read = null;
                    byteArrayOutputStream.close();
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            accessgetdarkencp.IconCompatParcelizer(7, e);
        } catch (IllegalStateException e2) {
            accessgetdarkencp.IconCompatParcelizer(8, e2);
        }
    }

    public void shutdown() throws InterruptedException, IOException {
        ((ConcurrentLinkedQueue) this.RatingCompat).clear();
        abandonFocus(true);
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = (VectorizedFloatDecaySpec) this.IconCompatParcelizer;
        MediaPlayer mediaPlayer = (MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        vectorizedFloatDecaySpec.IconCompatParcelizer = null;
        vectorizedFloatDecaySpec.RemoteActionCompatParcelizer = null;
        vectorizedFloatDecaySpec.serializer = 1.0f;
        VoiceInstructionsTextPlayer voiceInstructionsTextPlayer = (VoiceInstructionsTextPlayer) this.MediaSessionCompatQueueItem;
        JobControl jobControl = voiceInstructionsTextPlayer.jobControl;
        CompletableDeferredImpl completableDeferredImpl = voiceInstructionsTextPlayer.textToSpeech;
        JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) jobControl.job);
        TextToSpeech textToSpeech = completableDeferredImpl.PlaybackStateCompat() ? (TextToSpeech) completableDeferredImpl.RatingCompat() : null;
        if (textToSpeech != null) {
            textToSpeech.setOnUtteranceProgressListener(null);
            textToSpeech.shutdown();
        }
        completableDeferredImpl.write((CancellationException) null);
        voiceInstructionsTextPlayer.textToSpeechStatus.write((CancellationException) null);
        voiceInstructionsTextPlayer.currentPlay = null;
        voiceInstructionsTextPlayer.volumeLevel = 1.0f;
        this.serializer = true;
    }

    public LegacySessionConfig(List list, CameraIdUtil cameraIdUtil, List list2) {
        Object next;
        String str;
        String str2;
        String str3;
        boolean z;
        list.getClass();
        list2.getClass();
        Object obj = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        list.getClass();
        list2.getClass();
        obj.getClass();
        this.MediaDescriptionCompat = cameraIdUtil;
        this.write = list2;
        this.IconCompatParcelizer = obj;
        this.MediaSessionCompatQueueItem = ItemTouchHelperAdapter.serializer;
        this.MediaMetadataCompat = instance_delegatelambda0.write;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(list));
        this.RatingCompat = listPlaybackStateCompat;
        this.read = new SessionConfig$$ExternalSyntheticLambda1(0);
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkIconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();
        reportedVideoQualityNotSupportedQuirkIconCompatParcelizer.getClass();
        this.RemoteActionCompatParcelizer = reportedVideoQualityNotSupportedQuirkIconCompatParcelizer;
        if (!obj.equals(obj)) {
            Iterator it = listPlaybackStateCompat.iterator();
            while (it.hasNext()) {
                if (((UseCase) it.next()).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list3 = (List) this.MediaMetadataCompat;
        Set set = (Set) this.MediaSessionCompatQueueItem;
        if (!set.isEmpty() || !list3.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Camera2DeviceSurfaceManager) it2.next()).write());
            }
            for (ZoomControl zoomControl : onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(arrayList))) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : set2) {
                    if (((Camera2DeviceSurfaceManager) obj2).write() == zoomControl) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() > 1) {
                    DrawableTransformation.serializer(arrayList2, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            List list4 = list3;
            list4.getClass();
            if (onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(list4)).size() != list3.size()) {
                DrawableTransformation.serializer(41, "Duplicate values in preferredFeatures(", list3);
                throw null;
            }
            LinkedHashSet linkedHashSet = onContentCardDismissed.read(set2, list4);
            if (!linkedHashSet.isEmpty()) {
                DrawableTransformation.serializer(linkedHashSet, "requiredFeatures and preferredFeatures have duplicate values: ");
                throw null;
            }
            for (UseCase useCase : (List) this.RatingCompat) {
                TorchControl.Companion.getClass();
                if (CameraManagerCompatApi30Impl.RemoteActionCompatParcelizer(useCase) == TorchControl.UNDEFINED) {
                    getTrackDrawable.IconCompatParcelizer(useCase, " is not supported with feature group");
                    throw null;
                }
                String str4 = useCase instanceof AuthenticatorUtils ? "Preview" : useCase instanceof setNavigationOnClickListener ? "ImageCapture" : useCase instanceof getWrapper ? "ImageAnalysis" : CameraUseCaseAdapter.IconCompatParcelizer(useCase) ? "VideoCapture" : "UseCase";
                Iterator<E> it3 = ZoomControl.getEntries().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    TorchControl.Companion.getClass();
                    int i = CameraAccessExceptionCompat.read[((ZoomControl) next).ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (useCase.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) || useCase.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28)) {
                                    break;
                                }
                            } else {
                                if (i != 4) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    throw null;
                                }
                                z = useCase.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(o.UseCase.MediaMetadataCompat);
                            }
                        } else {
                            z = useCase.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        }
                    } else {
                        z = useCase.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(getFeatureGroupUseCaseType.a_);
                    }
                    if (z) {
                        break;
                    }
                }
                ZoomControl zoomControl2 = (ZoomControl) next;
                if (zoomControl2 != null) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append(zoomControl2.name());
                    sb.append(" value is set to ");
                    sb.append(str4);
                    sb.append(" despite using feature groups. Do not use APIs like ");
                    sb.append(str4);
                    sb.append(".Builder.");
                    int[] iArr = FingerprintDialogFragment.RemoteActionCompatParcelizer;
                    int i2 = iArr[zoomControl2.ordinal()];
                    if (i2 == 1) {
                        str = "setDynamicRange";
                    } else if (i2 == 2) {
                        str = "setTargetFrameRateRange";
                    } else if (i2 == 3) {
                        str = CameraUseCaseAdapter.IconCompatParcelizer(useCase) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
                    } else {
                        if (i2 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            throw null;
                        }
                        str = "setOutputFormat";
                    }
                    sb.append(str);
                    sb.append(" while using feature groups. If ");
                    int i3 = iArr[zoomControl2.ordinal()];
                    if (i3 == 1) {
                        str2 = "HDR";
                    } else if (i3 == 2) {
                        str2 = "60 FPS";
                    } else if (i3 == 3) {
                        str2 = "stabilization";
                    } else {
                        if (i3 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            throw null;
                        }
                        str2 = "JPEG_R output format";
                    }
                    sb.append(str2);
                    sb.append(" is required, instead set ");
                    int i4 = iArr[zoomControl2.ordinal()];
                    if (i4 == 1) {
                        str3 = "GroupableFeature.HDR_HLG10";
                    } else if (i4 == 2) {
                        str3 = "GroupableFeature.FPS_60";
                    } else if (i4 == 3) {
                        str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                    } else {
                        if (i4 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            throw null;
                        }
                        str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                    }
                    DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m(sb, str3, " as either a required or preferred feature."));
                    throw null;
                }
            }
            if (!((List) this.write).isEmpty()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Effects aren't supported with feature group yet");
                throw null;
            }
        }
        this.serializer = true;
    }

    public FileInputStream write(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void volume(SpeechVolume speechVolume) {
        float f = speechVolume.level;
        if (0.0f > f || f > 1.0f) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Volume must be in 0..1 range.");
            return;
        }
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = (VectorizedFloatDecaySpec) this.IconCompatParcelizer;
        vectorizedFloatDecaySpec.getClass();
        vectorizedFloatDecaySpec.serializer = f;
        MediaPlayer mediaPlayer = (MediaPlayer) vectorizedFloatDecaySpec.IconCompatParcelizer;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
        VoiceInstructionsTextPlayer voiceInstructionsTextPlayer = (VoiceInstructionsTextPlayer) this.MediaSessionCompatQueueItem;
        voiceInstructionsTextPlayer.getClass();
        voiceInstructionsTextPlayer.volumeLevel = f;
        BuildersKt.RemoteActionCompatParcelizer(voiceInstructionsTextPlayer.jobControl.scope, null, null, new RealImageLoader$execute$2$job$1(voiceInstructionsTextPlayer, speechVolume, (ShortNewsContentCardView) null, 21), 3);
    }

    public void play(SpeechAnnouncement speechAnnouncement, mf mfVar) throws InterruptedException, IOException {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.RatingCompat;
        speechAnnouncement.getClass();
        if (this.serializer) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                LoggerProviderKt.logE("play is called after MapboxVoiceInstructionsPlayer was shutdown. Invocation is ignored, consumer callback is not called. announcement: " + speechAnnouncement, "MapboxVoiceInstructionsPlayer");
                return;
            }
            return;
        }
        concurrentLinkedQueue.add(new PlayCallback(speechAnnouncement, mfVar));
        if (concurrentLinkedQueue.size() == 1) {
            play();
        }
    }

    public LegacySessionConfig(AssetManager assetManager, Executor executor, accessgetDarkencp accessgetdarkencp, String str, File file) {
        byte[] bArr;
        this.serializer = false;
        this.MediaDescriptionCompat = assetManager;
        this.write = executor;
        this.MediaMetadataCompat = accessgetdarkencp;
        this.MediaSessionCompatQueueItem = str;
        this.IconCompatParcelizer = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = accessgetHardlightcp.MediaBrowserCompatMediaItem;
        } else {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = accessgetHardlightcp.RatingCompat;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.RatingCompat = bArr;
    }

    public LegacySessionConfig(Context context, String str) {
        VoiceInstructionsPlayerOptions voiceInstructionsPlayerOptions = new VoiceInstructionsPlayerOptions();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        x xVar = new x((AudioManager) systemService, new VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes(voiceInstructionsPlayerOptions, new AudioAttributes.Builder()));
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(0);
        this.MediaDescriptionCompat = voiceInstructionsPlayerOptions;
        this.write = xVar;
        this.MediaMetadataCompat = mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
        VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes = new VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes(voiceInstructionsPlayerOptions, new AudioAttributes.Builder());
        this.RatingCompat = new ConcurrentLinkedQueue();
        this.IconCompatParcelizer = new VectorizedFloatDecaySpec(context, voiceInstructionsPlayerAttributes$OreoAndLaterAttributes);
        this.MediaSessionCompatQueueItem = new VoiceInstructionsTextPlayer(context, str, voiceInstructionsPlayerAttributes$OreoAndLaterAttributes);
        this.RemoteActionCompatParcelizer = new MapboxNavigation$$ExternalSyntheticLambda4(17, this);
    }

    public /* synthetic */ LegacySessionConfig(ArrayList arrayList) {
        this(arrayList, null, instance_delegatelambda0.write);
    }
}
