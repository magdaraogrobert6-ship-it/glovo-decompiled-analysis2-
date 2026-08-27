package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();
    private final Uri a;
    private final int b;
    private final int c;

    public final int getHeight() {
        return this.c;
    }

    public final Uri getUrl() {
        return this.a;
    }

    public final int getWidth() {
        return this.b;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.b;
        int i2 = this.c;
        String string = this.a.toString();
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "Image ", "x", " ");
        sbM.append(string);
        return sbM.toString();
    }

    public WebServerPic(Uri uri, int i, int i2) throws IllegalArgumentException {
        this.a = uri;
        this.b = i;
        this.c = i2;
        if (uri == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("url is not able to be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("width and height should be positive or 0");
            throw null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
}
