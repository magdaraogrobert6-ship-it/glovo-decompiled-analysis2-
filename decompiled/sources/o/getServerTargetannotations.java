package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getServerTargetannotations extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getServerTargetannotations(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, Object[] objArr) {
        super("OkHttp %s settings", objArr);
        this.write = getcustomhtmlwebviewactivityclassname;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        int i = this.read;
        Object obj = this.write;
        if (i != 0) {
            getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) ((getCustomHtmlWebViewActivityClassName) obj).write;
            getgenericenumsetfromstringset.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(getgenericenumsetfromstringset);
            return;
        }
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset2 = (getGenericEnumSetFromStringSet) obj;
        getgenericenumsetfromstringset2.getClass();
        try {
            getgenericenumsetfromstringset2.write.read(2, 0, false);
        } catch (IOException unused) {
            getgenericenumsetfromstringset2.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getServerTargetannotations(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, Object[] objArr) {
        super("OkHttp %s ping", objArr);
        this.write = getgenericenumsetfromstringset;
    }
}
