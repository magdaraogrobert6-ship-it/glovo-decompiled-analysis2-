package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class supportedSearch implements addPathUv8p0NA {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 serializer;
    public final long write;

    static {
        int i = r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.$stable;
        int i2 = read + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8 = this.serializer;
        int i5 = i3 + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacmvjstjhw3hzog60vfqxbrs6hs8;
    }

    public supportedSearch(long j, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8) {
        this.write = j;
        this.serializer = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 107;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Long.hashCode(this.write);
            iHashCode = this.serializer.hashCode();
            i = iHashCode2 * 104;
        } else {
            int iHashCode3 = Long.hashCode(this.write);
            iHashCode = this.serializer.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = MediaSessionCompatQueueItem + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TransferChangeFragmentArgs(deliveryId=" + this.write + ", transferChangeFragmentData=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 33;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof supportedSearch) {
                supportedSearch supportedsearch = (supportedSearch) obj;
                if (this.write != supportedsearch.write || !this.serializer.equals(supportedsearch.serializer)) {
                    return false;
                }
            } else {
                int i2 = IconCompatParcelizer + 39;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 5;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static final supportedSearch fromBundle(Bundle bundle) {
        int i = 2 % 2;
        bundle.getClass();
        bundle.setClassLoader(supportedSearch.class.getClassLoader());
        Object obj = null;
        if (!bundle.containsKey("deliveryId")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required argument \"deliveryId\" is missing and does not have an android:defaultValue");
            int i2 = MediaSessionCompatQueueItem + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        long j = bundle.getLong("deliveryId");
        if (!bundle.containsKey("transferChangeFragmentData")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required argument \"transferChangeFragmentData\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i4 = IconCompatParcelizer + 101;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            Parcelable.class.isAssignableFrom(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.class);
            obj.hashCode();
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.class) && !Serializable.class.isAssignableFrom(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.class)) {
            IBraze$$ExternalSyntheticBUOutline0.m(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8 = (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) bundle.get("transferChangeFragmentData");
        if (r8lambdacmvjstjhw3hzog60vfqxbrs6hs8 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Argument \"transferChangeFragmentData\" is marked as non-null but was passed a null value.");
            return null;
        }
        supportedSearch supportedsearch = new supportedSearch(j, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
        int i5 = MediaSessionCompatQueueItem + 97;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return supportedsearch;
    }
}
