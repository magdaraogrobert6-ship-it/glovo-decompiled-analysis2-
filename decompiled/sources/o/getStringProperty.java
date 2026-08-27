package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getStringProperty {
    private final setSoundIfPresentAndSupportedlambda1 RemoteActionCompatParcelizer;

    public getStringProperty(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1) {
        this.RemoteActionCompatParcelizer = setsoundifpresentandsupportedlambda1;
    }

    public final getCardType write(List list, parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor) {
        if (list.isEmpty()) {
            return null;
        }
        r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme = (r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) list.get(0);
        Class<?> cls = r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.getClass();
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = this.RemoteActionCompatParcelizer;
        if (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ.class == cls) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj).MediaDescriptionCompat()) {
                    break;
                }
                arrayList.add(obj);
            }
            return new r8lambda9USXHPeqpvLiHO7lRRPwtU075E(setsoundifpresentandsupportedlambda1, parselonglambda0, setheadertextcolor, arrayList);
        }
        if (r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug.class == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.getClass()) {
            return new getAspectRatio(setsoundifpresentandsupportedlambda1, parselonglambda0, list);
        }
        if (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4.class == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.getClass()) {
            return new getDescription(setsoundifpresentandsupportedlambda1, parselonglambda0, list);
        }
        if (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0.class == r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.getClass()) {
            return new getAltImageText(setsoundifpresentandsupportedlambda1, list);
        }
        parselonglambda0.RemoteActionCompatParcelizer("Timeline type %s has no payload builder", r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.IconCompatParcelizer());
        return null;
    }
}
