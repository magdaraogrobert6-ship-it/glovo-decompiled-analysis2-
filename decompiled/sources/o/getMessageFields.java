package o;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getMessageFields extends r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE<read> {
    private static getMessageFields IconCompatParcelizer;
    private final setHeaderTextColor serializer;

    public static class write extends r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE.read<write> {
    }

    public static class read {
        private final getAssetsZipRemoteUrl IconCompatParcelizer;
        private final setRemoteImageUrl RemoteActionCompatParcelizer;
        private final _set_durationInMilliseconds_lambda1 serializer;

        public final _set_durationInMilliseconds_lambda1 read() {
            return this.serializer;
        }

        public final setRemoteImageUrl serializer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final getAssetsZipRemoteUrl write() {
            return this.IconCompatParcelizer;
        }

        public read(_set_durationInMilliseconds_lambda1 _set_durationinmilliseconds_lambda1, setRemoteImageUrl setremoteimageurl, getAssetsZipRemoteUrl getassetszipremoteurl) {
            this.serializer = _set_durationinmilliseconds_lambda1;
            this.RemoteActionCompatParcelizer = setremoteimageurl;
            this.IconCompatParcelizer = getassetszipremoteurl;
        }
    }

    public getMessageFields(setHeaderTextColor setheadertextcolor) {
        this.serializer = setheadertextcolor;
    }

    @Override // o.r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE
    public final read IconCompatParcelizer(Cursor cursor) throws IllegalStateException {
        r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read().getClass();
        _set_durationInMilliseconds_lambda1 _set_durationinmilliseconds_lambda1RemoteActionCompatParcelizer = r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.RemoteActionCompatParcelizer(cursor, "sv");
        getInAppMessageDarkThemeWrapper.read().getClass();
        setRemoteImageUrl setremoteimageurl = getInAppMessageDarkThemeWrapper.read(cursor, "v");
        handleLogClicklambda1.read().getClass();
        return new read(_set_durationinmilliseconds_lambda1RemoteActionCompatParcelizer, setremoteimageurl, handleLogClicklambda1.write(cursor, com.braze.Constants.BRAZE_PUSH_TITLE_KEY));
    }

    public static getMessageFields IconCompatParcelizer(setHeaderTextColor setheadertextcolor) {
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = new getMessageFields(setheadertextcolor);
        }
        return IconCompatParcelizer;
    }

    public final List write(write writeVar, parseLonglambda0 parselonglambda0) {
        return (List) this.serializer.serializer(Collections.EMPTY_LIST, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(this, writeVar, parselonglambda0, 2));
    }

    @Override // o.r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE
    public final Class<read> read() {
        return read.class;
    }
}
