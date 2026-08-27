package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE implements r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final List IconCompatParcelizer;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final String serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE(setTransactionSuccessful settransactionsuccessful, int i) {
        this(settransactionsuccessful, (char) 0);
        this.write = i;
        if (i == 1) {
            settransactionsuccessful.getClass();
            this(settransactionsuccessful, (char) 0);
            this.serializer = "web-apps.pedidosya.com";
            this.IconCompatParcelizer = AnnotatedStringSaverlambda0.RemoteActionCompatParcelizer;
            return;
        }
        if (i != 2) {
            settransactionsuccessful.getClass();
            this.serializer = "hurrier.com";
            this.IconCompatParcelizer = r8lambdasrbP4n1zahpfrQoOR4II4zdDhc.write;
            return;
        }
        settransactionsuccessful.getClass();
        this(settransactionsuccessful, (char) 0);
        this.serializer = "talabatrh.retainly.dev";
        this.IconCompatParcelizer = AnnotationRangeSaverlambda1.serializer;
    }

    public r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE(setTransactionSuccessful settransactionsuccessful, char c) {
        settransactionsuccessful.getClass();
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
    }

    @Override // o.r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk
    public final r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw IconCompatParcelizer(Uri uri) {
        String path;
        int i;
        int i2 = 2 % 2;
        uri.getClass();
        String host = uri.getHost();
        if (host != null) {
            int i3 = read + 31;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (setCarryoverInAppMessage.read(host, this.serializer, false) && (path = uri.getPath()) != null) {
                List list = this.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList.iterator();
                        if (!it2.hasNext()) {
                            i = MediaMetadataCompat + 37;
                        } else {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int length = ((r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q) next).IconCompatParcelizer.length();
                                do {
                                    Object next2 = it2.next();
                                    int length2 = ((r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q) next2).IconCompatParcelizer.length();
                                    if (length < length2) {
                                        int i5 = read + 13;
                                        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i5 % 2 == 0) {
                                            int i6 = 14 / 0;
                                        }
                                        next = next2;
                                        length = length2;
                                    }
                                } while (it2.hasNext());
                            }
                            obj = next;
                            i = MediaMetadataCompat + 33;
                        }
                        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i % 2;
                        r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q r8lambdaivr8c8pelydb8u3ulyfmsno8j1q = (r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q) obj;
                        if (r8lambdaivr8c8pelydb8u3ulyfmsno8j1q == null) {
                            break;
                        }
                        String string = uri.buildUpon().scheme(com.adjust.sdk.Constants.SCHEME).build().toString();
                        string.getClass();
                        return new r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4(new r8lambdaXjIFM2Rv3TSSvQET1b2_Nyl7Sp8(string, this.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdaivr8c8pelydb8u3ulyfmsno8j1q.RemoteActionCompatParcelizer), r8lambdaivr8c8pelydb8u3ulyfmsno8j1q.serializer, r8lambdaivr8c8pelydb8u3ulyfmsno8j1q.write));
                    }
                    Object next3 = it.next();
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(path, ((r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q) next3).IconCompatParcelizer, false)) {
                        int i8 = read + 31;
                        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            arrayList.add(next3);
                            throw null;
                        }
                        arrayList.add(next3);
                    }
                }
            }
        }
        return r8lambdaaaxtvaNwmBe7UPVWXtk2Gth7cyE.serializer;
    }
}
