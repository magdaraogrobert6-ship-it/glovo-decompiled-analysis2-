package o;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat$Impl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class getFocusRequester extends FocusRequesterModifier {
    public static Field MediaBrowserCompatMediaItem = null;
    public static boolean MediaMetadataCompat = false;
    public static boolean MediaSessionCompatQueueItem = false;
    public static Constructor serializer;
    public WindowInsets MediaDescriptionCompat;
    public setRight RatingCompat;

    @Override // o.FocusRequesterModifier
    public void IconCompatParcelizer(setRight setright) {
        this.RatingCompat = setright;
    }

    public getFocusRequester() {
        this.MediaDescriptionCompat = IconCompatParcelizer();
    }

    @Override // o.FocusRequesterModifier
    public FocusRequesterModifierKt RemoteActionCompatParcelizer() {
        serializer();
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, this.MediaDescriptionCompat);
        setRight[] setrightArr = this.read;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKtWrite.IconCompatParcelizer;
        windowInsetsCompat$Impl.setOverriddenInsets(setrightArr);
        windowInsetsCompat$Impl.setStableInsets(this.RatingCompat);
        windowInsetsCompat$Impl.setDisplayShape(null);
        windowInsetsCompat$Impl.setTypeBoundingRectsMap(this.RemoteActionCompatParcelizer);
        windowInsetsCompat$Impl.setTypeMaxBoundingRectsMap(this.IconCompatParcelizer);
        return focusRequesterModifierKtWrite;
    }

    @Override // o.FocusRequesterModifier
    public void write(setRight setright) {
        WindowInsets windowInsets = this.MediaDescriptionCompat;
        if (windowInsets != null) {
            this.MediaDescriptionCompat = windowInsets.replaceSystemWindowInsets(setright.RemoteActionCompatParcelizer, setright.write, setright.read, setright.serializer);
        }
    }

    private static WindowInsets IconCompatParcelizer() {
        if (!MediaMetadataCompat) {
            try {
                MediaBrowserCompatMediaItem = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            MediaMetadataCompat = true;
        }
        Field field = MediaBrowserCompatMediaItem;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!MediaSessionCompatQueueItem) {
            try {
                serializer = WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            MediaSessionCompatQueueItem = true;
        }
        Constructor constructor = serializer;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    public getFocusRequester(FocusRequesterModifierKt focusRequesterModifierKt) {
        super(focusRequesterModifierKt);
        this.MediaDescriptionCompat = focusRequesterModifierKt.IconCompatParcelizer();
    }
}
