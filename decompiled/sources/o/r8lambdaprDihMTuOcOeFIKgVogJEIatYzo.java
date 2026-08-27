package o;

import com.huawei.hmf.tasks.a.d$a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaprDihMTuOcOeFIKgVogJEIatYzo {
    public final /* synthetic */ r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM serializer;

    public /* synthetic */ r8lambdaprDihMTuOcOeFIKgVogJEIatYzo(r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm) {
        this.serializer = r8lambdach50szxgsvgzrle_f5bmf0a81gm;
    }

    public void IconCompatParcelizer(Object[] objArr) {
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm;
        int length = objArr.length;
        int i = 0;
        while (true) {
            r8lambdach50szxgsvgzrle_f5bmf0a81gm = this.serializer;
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            if (obj instanceof String) {
                contentCardsUpdatelambda0 contentcardsupdatelambda0 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat;
                contentcardsupdatelambda0.getClass();
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(contentcardsupdatelambda0, 20, (String) obj));
            } else if (obj instanceof byte[]) {
                contentCardsUpdatelambda0 contentcardsupdatelambda1 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat;
                contentcardsupdatelambda1.getClass();
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(contentcardsupdatelambda1, 21, (byte[]) obj));
            }
            i++;
        }
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.RatingCompat = false;
        ArrayList arrayList = r8lambdach50szxgsvgzrle_f5bmf0a81gm.ParcelableVolumeInfo;
        if (arrayList.isEmpty() || r8lambdach50szxgsvgzrle_f5bmf0a81gm.RatingCompat) {
            return;
        }
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.write((r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) arrayList.remove(0));
    }
}
