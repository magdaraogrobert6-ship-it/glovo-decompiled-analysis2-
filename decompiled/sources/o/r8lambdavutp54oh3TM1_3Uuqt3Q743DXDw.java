package o;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdavutp54oh3TM1_3Uuqt3Q743DXDw implements r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk {
    private static int serializer = 0;
    private static int write = 1;
    public final r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo IconCompatParcelizer;
    public final r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo RemoteActionCompatParcelizer;
    public final r8lambdauOuXWzkcWK0_FYFfgKa7xmdauU read;

    public r8lambdavutp54oh3TM1_3Uuqt3Q743DXDw(r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo r8lambdawql74ec8s3rycnklfp6v_cme2yo, r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo r8lambdawql74ec8s3rycnklfp6v_cme2yo2, r8lambdauOuXWzkcWK0_FYFfgKa7xmdauU r8lambdauouxwzkcwk0_fyffgka7xmdauu) {
        r8lambdawql74ec8s3rycnklfp6v_cme2yo.getClass();
        r8lambdawql74ec8s3rycnklfp6v_cme2yo2.getClass();
        r8lambdauouxwzkcwk0_fyffgka7xmdauu.getClass();
        this.IconCompatParcelizer = r8lambdawql74ec8s3rycnklfp6v_cme2yo;
        this.RemoteActionCompatParcelizer = r8lambdawql74ec8s3rycnklfp6v_cme2yo2;
        this.read = r8lambdauouxwzkcwk0_fyffgka7xmdauu;
    }

    @Override // o.r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk
    public final r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw IconCompatParcelizer(Uri uri) {
        int i = 2 % 2;
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        uri.getClass();
        Iterator it = androidx.sqlite.SQLite.read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read).iterator();
        int i4 = write + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = write + 27;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                boolean z = ((r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk) it.next()).IconCompatParcelizer(uri) instanceof r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer = ((r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk) it.next()).IconCompatParcelizer(uri);
            if (r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer instanceof r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) {
                return r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer;
            }
        }
        return r8lambdaaaxtvaNwmBe7UPVWXtk2Gth7cyE.serializer;
    }
}
