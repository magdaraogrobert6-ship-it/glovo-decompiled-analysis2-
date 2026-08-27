package com.roadrunner.liveness.domain;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.liveness.api.recording.CameraImage;
import java.io.File;
import java.io.IOException;
import o.onUpgrade;
import o.recreateDisplayListIfNeeded;
import o.resetOutlineParams;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateEmptyCameraImageUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final resetOutlineParams IconCompatParcelizer;
    public final onUpgrade write;

    public CreateEmptyCameraImageUseCaseImpl(resetOutlineParams resetoutlineparams, onUpgrade onupgrade) {
        resetoutlineparams.getClass();
        onupgrade.getClass();
        this.IconCompatParcelizer = resetoutlineparams;
        this.write = onupgrade;
    }

    public final void RemoteActionCompatParcelizer() throws IOException {
        int i = 2 % 2;
        recreateDisplayListIfNeeded recreatedisplaylistifneeded = (recreateDisplayListIfNeeded) this.IconCompatParcelizer;
        File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer("JPEG_liveness_selfie");
        Uri uri = recreatedisplaylistifneeded.read(fileIconCompatParcelizer);
        String absolutePath = fileIconCompatParcelizer.getAbsolutePath();
        absolutePath.getClass();
        CameraImage cameraImage = new CameraImage("JPEG_liveness_selfie", uri, absolutePath, false);
        onUpgrade onupgrade = this.write;
        onupgrade.getClass();
        Timber.RemoteActionCompatParcelizer.getClass();
        onupgrade.serializer = cameraImage;
        int i2 = serializer + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
