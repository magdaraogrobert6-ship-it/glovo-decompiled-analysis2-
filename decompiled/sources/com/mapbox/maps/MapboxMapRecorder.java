package com.mapbox.maps;

import com.mapbox.bindgen.DataRef;
import java.nio.ByteBuffer;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public final class MapboxMapRecorder {
    private final MapRecorder mapRecorder;

    public final String getPlaybackState() {
        String playbackState = this.mapRecorder.getPlaybackState();
        playbackState.getClass();
        return playbackState;
    }

    public final ByteBuffer stopRecording() {
        ByteBuffer buffer = this.mapRecorder.stopRecording().getBuffer();
        buffer.getClass();
        buffer.rewind();
        return buffer;
    }

    public final void togglePauseReplay() {
        this.mapRecorder.togglePauseReplay();
    }

    public MapboxMapRecorder(MapRecorder mapRecorder) {
        mapRecorder.getClass();
        this.mapRecorder = mapRecorder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replay$lambda$4(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void replay(ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        byteBuffer.getClass();
        mapPlayerOptions.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        DataRef dataRefAllocateNative = DataRef.allocateNative(byteBuffer.limit());
        ByteBuffer buffer = dataRefAllocateNative.getBuffer();
        byteBuffer.rewind();
        buffer.put(byteBuffer).rewind();
        this.mapRecorder.replay(dataRefAllocateNative, mapPlayerOptions, new MapboxMapRecorder$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void startRecording(MapRecorderOptions mapRecorderOptions) {
        mapRecorderOptions.getClass();
        this.mapRecorder.startRecording(mapRecorderOptions);
    }

    public static /* synthetic */ void replay$default(MapboxMapRecorder mapboxMapRecorder, ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            mapPlayerOptions = new MapPlayerOptions.Builder().build();
            mapPlayerOptions.getClass();
        }
        if ((i & 4) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapboxMapRecorder.replay.2
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4703invoke() {
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m4703invoke();
                    return createFromParcel.INSTANCE;
                }
            };
        }
        mapboxMapRecorder.replay(byteBuffer, mapPlayerOptions, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static /* synthetic */ void startRecording$default(MapboxMapRecorder mapboxMapRecorder, MapRecorderOptions mapRecorderOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            mapRecorderOptions = new MapRecorderOptions.Builder().build();
            mapRecorderOptions.getClass();
        }
        mapboxMapRecorder.startRecording(mapRecorderOptions);
    }

    public final void startRecording() {
        startRecording$default(this, null, 1, null);
    }

    public final void replay(ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions) {
        byteBuffer.getClass();
        mapPlayerOptions.getClass();
        replay$default(this, byteBuffer, mapPlayerOptions, null, 4, null);
    }

    public final void replay(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        replay$default(this, byteBuffer, null, null, 6, null);
    }
}
