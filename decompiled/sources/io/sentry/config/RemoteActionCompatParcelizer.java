package io.sentry.config;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.location.ut;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import o.accessgetSystemNavigationDowncp;
import o.getUriActionForCardlambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RemoteActionCompatParcelizer {
    public static SafeParcelable RemoteActionCompatParcelizer(byte[] bArr, Parcelable.Creator creator) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static write RemoteActionCompatParcelizer() {
        Properties properties;
        Properties propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Properties propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys2;
        String str = "sentry.properties";
        boolean z = false;
        getUriActionForCardlambda0 geturiactionforcardlambda0 = new getUriActionForCardlambda0(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MediaSessionCompatQueueItem("sentry.", System.getProperties()));
        arrayList.add(new read());
        String property = System.getProperty("sentry.properties.file");
        boolean z2 = true;
        int i = 17;
        if (property != null && (propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = new ut(i, geturiactionforcardlambda0, property, z2).r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) != null) {
            arrayList.add(new MediaSessionCompatQueueItem(propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys2));
        }
        String str2 = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str2 != null && (propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ut(i, geturiactionforcardlambda0, str2, z2).r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) != null) {
            arrayList.add(new MediaSessionCompatQueueItem(propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys));
        }
        try {
            InputStream resourceAsStream = io.sentry.util.serializer.read(serializer.class.getClassLoader()).getResourceAsStream("sentry.properties");
            if (resourceAsStream != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    try {
                        properties = new Properties();
                        properties.load(bufferedInputStream);
                        bufferedInputStream.close();
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } else {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                properties = null;
            }
        } catch (IOException e) {
            geturiactionforcardlambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            properties = null;
        }
        if (properties != null) {
            arrayList.add(new MediaSessionCompatQueueItem(properties));
        }
        Properties propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = new ut(i, geturiactionforcardlambda0, str, z).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 != null) {
            arrayList.add(new MediaSessionCompatQueueItem(propertiesR8lambda54BeH8ZsBru0CXI2CCSP2syNys3));
        }
        return new write(arrayList);
    }

    public static SafeParcelable serializer(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(byteArrayExtra, creator);
    }
}
