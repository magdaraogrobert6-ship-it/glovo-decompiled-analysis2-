package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class requestPushPermissionPromptlambda2 {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public Object[][] RemoteActionCompatParcelizer;
    public getPrettyPrintedStringlambda0 serializer;
    public List write;

    public requestPushPermissionPromptlambda2(List list, getPrettyPrintedStringlambda0 getprettyprintedstringlambda0, Object[][] objArr) {
        TextStreamsKt.serializer(list, "addresses are not set");
        this.write = list;
        TextStreamsKt.serializer(getprettyprintedstringlambda0, "attrs");
        this.serializer = getprettyprintedstringlambda0;
        TextStreamsKt.serializer(objArr, "customOptions");
        this.RemoteActionCompatParcelizer = objArr;
    }

    public static requestPushPermissionPromptlambda2 write() {
        requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2 = new requestPushPermissionPromptlambda2();
        requestpushpermissionpromptlambda2.serializer = getPrettyPrintedStringlambda0.serializer;
        requestpushpermissionpromptlambda2.RemoteActionCompatParcelizer = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return requestpushpermissionpromptlambda2;
    }

    public Object IconCompatParcelizer() {
        int i = 0;
        while (true) {
            Object[][] objArr = this.RemoteActionCompatParcelizer;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (hasPermissionlambda0.write == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    public void read(wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4) {
        Object[][] objArr;
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks;
        int length = 0;
        while (true) {
            objArr = this.RemoteActionCompatParcelizer;
            int length2 = objArr.length;
            r8lambdakctilwmporjfcawe8asdqv1ks = hasPermissionlambda0.write;
            if (length >= length2) {
                length = -1;
                break;
            } else if (r8lambdakctilwmporjfcawe8asdqv1ks == objArr[length][0]) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + 1, 2);
            Object[][] objArr3 = this.RemoteActionCompatParcelizer;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.RemoteActionCompatParcelizer = objArr2;
            length = objArr2.length - 1;
        }
        this.RemoteActionCompatParcelizer[length] = new Object[]{r8lambdakctilwmporjfcawe8asdqv1ks, wouldpushpermissionpromptdisplaylambda4};
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "addrs");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "attrs");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) Arrays.deepToString(this.RemoteActionCompatParcelizer), "customOptions");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public void RemoteActionCompatParcelizer(List list) {
        TextStreamsKt.read("addrs is empty", !list.isEmpty());
        this.write = Collections.unmodifiableList(new ArrayList(list));
    }

    public /* synthetic */ requestPushPermissionPromptlambda2() {
    }
}
