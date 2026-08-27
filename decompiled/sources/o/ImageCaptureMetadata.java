package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCaptureMetadata {
    public static final onRoutesRefreshed r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new onRoutesRefreshed();

    DrawModifierNodeKt IconCompatParcelizer(androidx.camera.core.FocusMeteringAction focusMeteringAction);

    void IconCompatParcelizer();

    void IconCompatParcelizer(int i);

    void IconCompatParcelizer(InitializationException initializationException);

    default void MediaDescriptionCompat() {
    }

    DrawModifierNodeKt read(float f);

    DrawModifierNodeKt read(ArrayList arrayList, int i, int i2);

    DrawModifierNodeKt read(boolean z);

    default void read() {
    }

    DrawModifierNodeKt serializer(float f);

    void serializer();

    default void serializer(setTitleMarginBottom settitlemarginbottom) {
    }

    InitializationException write();

    void write(UseCaseAdditionSimulator useCaseAdditionSimulator);

    default DrawModifierNodeKt RemoteActionCompatParcelizer(int i) {
        return VideoQualityQuirk.read(new getWithMapboxGeofencingConsent());
    }
}
