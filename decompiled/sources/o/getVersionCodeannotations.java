package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getVersionCodeannotations extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ r8lambdaBEyrNr8p6809BwlBoRO_sTaNs IconCompatParcelizer;
    public final /* synthetic */ getGenericEnumSetFromStringSet read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getVersionCodeannotations(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.read = getgenericenumsetfromstringset;
        this.write = i;
        this.IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans;
        this.serializer = i2;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        try {
            getFirebaseCloudMessagingSenderIdKey getfirebasecloudmessagingsenderidkey = this.read.ComponentActivity;
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            int i = this.serializer;
            getfirebasecloudmessagingsenderidkey.getClass();
            r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(i);
            this.read.write.read(this.write, ErrorCode.CANCEL);
            synchronized (this.read) {
                this.read.RatingCompat.remove(Integer.valueOf(this.write));
            }
        } catch (IOException unused) {
        }
    }
}
