package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerChatActivity implements logError {
    public final writeSelf serializer;
    public int write = 0;

    @Override // o.logError
    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.logError
    public final InputStream RemoteActionCompatParcelizer() throws IOException {
        String str;
        writeSelf writeself = this.serializer;
        int i = writeself.serializer;
        if (i >= 1) {
            int i2 = writeself.read();
            this.write = i2;
            if (i2 > 0) {
                if (i < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (i2 > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                }
            }
            return writeself;
        }
        str = "content octets cannot be empty";
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
        return null;
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return TokenRefreshAuthenticator.write(this.serializer.RemoteActionCompatParcelizer());
    }

    public CustomerChatActivity(writeSelf writeself) {
        this.serializer = writeself;
    }

    @Override // o.logErrordefault
    public final provideRequest RatingCompat() {
        try {
            return write();
        } catch (IOException e) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("IOException converting stream to byte array: ", (Object) e.getMessage(), (Exception) e);
            return null;
        }
    }
}
