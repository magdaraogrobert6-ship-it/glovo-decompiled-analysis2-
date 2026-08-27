package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManagerupdateBuffersOnAppeared1 implements getOrBuildCachedDrawBlock, Iterable, displayInAppMessagelambda121 {
    public final int IconCompatParcelizer;
    public final AndroidContentCaptureManagersendContentCaptureAppearEvents1 serializer;
    public final int write;

    @Override // o.BlurredEdgeTreatmentCompanion
    public final Iterable write() {
        return this;
    }

    @Override // o.getOrBuildCachedDrawBlock
    public final Object IconCompatParcelizer() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.serializer;
        int[] iArr = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 536870912) == 0) {
            return Integer.valueOf(iArr[i2]);
        }
        Object obj = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat[AbstractC0170getTimestamp.write(iArr, i)];
        obj.getClass();
        return obj;
    }

    @Override // o.getOrBuildCachedDrawBlock
    public final String MediaMetadataCompat() {
        this.serializer.read(this.IconCompatParcelizer);
        return null;
    }

    @Override // o.getOrBuildCachedDrawBlock
    public final Iterable RemoteActionCompatParcelizer() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.serializer;
        int i = this.IconCompatParcelizer;
        androidContentCaptureManagersendContentCaptureAppearEvents1.read(i);
        return new AndroidContentCaptureManagerWhenMappings(androidContentCaptureManagersendContentCaptureAppearEvents1, i);
    }

    public final int hashCode() {
        return (this.serializer.hashCode() * 31) + this.IconCompatParcelizer;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.serializer;
        if (androidContentCaptureManagersendContentCaptureAppearEvents1.MediaMetadataCompat != this.write) {
            AbstractC0170getTimestamp.IconCompatParcelizer();
        }
        int i = this.IconCompatParcelizer;
        androidContentCaptureManagersendContentCaptureAppearEvents1.read(i);
        return new component3(androidContentCaptureManagersendContentCaptureAppearEvents1, i + 1, androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer[(i * 5) + 3] + i);
    }

    @Override // o.getOrBuildCachedDrawBlock
    public final Object read() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.serializer;
        int[] iArr = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer * 5;
        if ((iArr[i + 1] & 1073741824) != 0) {
            return androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat[iArr[i + 4]];
        }
        return null;
    }

    @Override // o.getOrBuildCachedDrawBlock
    public final Object serializer() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.serializer;
        if (androidContentCaptureManagersendContentCaptureAppearEvents1.MediaMetadataCompat != this.write) {
            AbstractC0170getTimestamp.IconCompatParcelizer();
        }
        component4 component4VarSerializer = androidContentCaptureManagersendContentCaptureAppearEvents1.serializer();
        try {
            return component4VarSerializer.read(this.IconCompatParcelizer);
        } finally {
            component4VarSerializer.write();
        }
    }

    public AndroidContentCaptureManagerupdateBuffersOnAppeared1(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1, int i, int i2) {
        this.serializer = androidContentCaptureManagersendContentCaptureAppearEvents1;
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidContentCaptureManagerupdateBuffersOnAppeared1)) {
            return false;
        }
        AndroidContentCaptureManagerupdateBuffersOnAppeared1 androidContentCaptureManagerupdateBuffersOnAppeared1 = (AndroidContentCaptureManagerupdateBuffersOnAppeared1) obj;
        return androidContentCaptureManagerupdateBuffersOnAppeared1.IconCompatParcelizer == this.IconCompatParcelizer && androidContentCaptureManagerupdateBuffersOnAppeared1.write == this.write && androidContentCaptureManagerupdateBuffersOnAppeared1.serializer == this.serializer;
    }
}
