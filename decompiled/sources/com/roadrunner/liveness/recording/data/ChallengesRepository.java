package com.roadrunner.liveness.recording.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.RoomOpenHelperDelegate;
import o.finishSpinner;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.moveSpinner;
import o.resetTransientState;
import o.setColorViewAlpha;
import o.setGraphicModalMaxWidthDp;
import o.unpackInt2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengesRepository {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final AtomicInteger IconCompatParcelizer;
    public final setColorViewAlpha RemoteActionCompatParcelizer;
    public final AtomicInteger read;
    public List serializer;
    public RoomOpenHelperDelegate write;

    public ChallengesRepository(unpackInt2 unpackint2) {
        setColorViewAlpha setcolorviewalpha;
        unpackint2.getClass();
        this.read = new AtomicInteger(0);
        String str = ((FirebaseRemoteConfigImpl) unpackint2.RemoteActionCompatParcelizer).IconCompatParcelizer.read("head_movement_thresholds");
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = setColorViewAlpha.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            setcolorviewalpha = (setColorViewAlpha) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdpSerializer);
            int i = 2 % 2;
        } catch (Throwable unused) {
            Timber.RemoteActionCompatParcelizer.write(new ThresholdsParsingException("Failed to parse Firebase thresholds jsonString ".concat(str), null));
            setcolorviewalpha = new setColorViewAlpha(new moveSpinner(), new finishSpinner());
        }
        this.RemoteActionCompatParcelizer = setcolorviewalpha;
        this.IconCompatParcelizer = new AtomicInteger(0);
        this.serializer = instance_delegatelambda0.write;
        int i2 = MediaDescriptionCompat + 77;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
