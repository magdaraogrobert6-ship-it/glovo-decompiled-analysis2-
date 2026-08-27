package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getApplicationIconResourceId extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ getGenericEnumSetFromStringSet read;
    public final /* synthetic */ int serializer = 2;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getApplicationIconResourceId(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.read = getgenericenumsetfromstringset;
        this.write = i;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i == 0) {
            this.read.ComponentActivity.getClass();
            try {
                this.read.write.read(this.write, ErrorCode.CANCEL);
                synchronized (this.read) {
                    this.read.RatingCompat.remove(Integer.valueOf(this.write));
                }
                return;
            } catch (IOException unused) {
                return;
            }
        }
        if (i != 1) {
            this.read.ComponentActivity.getClass();
            synchronized (this.read) {
                this.read.RatingCompat.remove(Integer.valueOf(this.write));
            }
            return;
        }
        this.read.ComponentActivity.getClass();
        try {
            this.read.write.read(this.write, ErrorCode.CANCEL);
            synchronized (this.read) {
                this.read.RatingCompat.remove(Integer.valueOf(this.write));
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getApplicationIconResourceId(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.read = getgenericenumsetfromstringset;
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getApplicationIconResourceId(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.read = getgenericenumsetfromstringset;
        this.write = i;
    }
}
